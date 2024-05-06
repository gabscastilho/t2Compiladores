grammar Alguma;

TIPO_VAR :'literal' | 'inteiro' | 'real' | 'logico';

// Tipos primitivos
NUMINT:	('-')?('0'..'9')+;

NUMREAL:('-')?('0'..'9')+ ('.' ('0'..'9')+)?;

CADEIA 	: '"' ( ~('\n') )*? '"';

// Variáveis e identificadores
VARIAVEL:('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

var_personalizada: VARIAVEL;

var_registro:VARIAVEL '.' VARIAVEL;

ponteiro: '^';

endereco: '&';



// Declaracoes e atribuicoes
comandoAtribuicao: ponteiro? (VARIAVEL | var_registro) '<-' (endereco (VARIAVEL | var_registro) | expressaoRelacional | expressaoAritmetica | chamada_funcao);
declaracao_tipo: 'tipo' VARIAVEL ':' declaracao_registro;
declaracao_registro: 'registro' (VARIAVEL (',' VARIAVEL)* ':' TIPO_VAR)* 'fim_registro';

// Declaracao constantes

// Operadores aritméticos
OP_ARIT1:'+' | '-';

OP_ARIT2:'*' | '/';

OP_ARIT3:'%';

// Operadores relacionais
OP_REL: '>' | '>=' | '<' | '<=' | '<>'; // Also '=', but antlr is stupid so had to remove it otherwise it conflicted with constant declaration

op_bool	:'e' | 'ou';
	
fragment
ESC_SEQ
	:	'\\\'';

ERRO_COMENTARIO: '{' ~('\n'|'\r')* '\r'? '}}' ('\n' | ' ')
	;

COMENTARIO:'{' ~('\n'|'\r')* '\r'? '}' ('\n' | ' ') {skip();};

WS  :   ( ' '
        | '\t'
        | '\r'	
        | '\n'
        ) {skip();}
    ;

CADEIA_NAO_FECHADA: '"' ( ~('\n') )*? ;

COMENTARIO_NAO_FECHADO:  '{' ~('\n'|'\r' | '}')* ('\n');
	

ABRE_PAR: '(' ;

FECHA_PAR: ')' ;

ABRE_COL: '[' ;

FECHA_COL: ']' ;

ERRO: '~' | '$' | '@' | '|' | '!';
	
programa:
	declaracao_constante* declaracao_tipo* declaracao* procedimento* declaracao_funcao*
	'algoritmo'
	declaracao_constante* declaracao*
	listaComandos?
	'fim_algoritmo' EOF;
	
declaracao
	:	'declare' VARIAVEL (',' VARIAVEL)* ':' ponteiro? (TIPO_VAR | declaracao_registro | var_personalizada)
	;
	
expressaoAritmetica
	:	fatorAritmetico (OP_ARIT1 | OP_ARIT2 | OP_ARIT3) expressaoAritmetica
	|	fatorAritmetico
	;

	
fatorAritmetico
	:	NUMINT
	|	NUMREAL
	|	chamada_funcao
	|	ponteiro? (VARIAVEL | var_registro)
	|	'(' expressaoAritmetica ')'
	| 	CADEIA
	;
	
expressaoRelacional
	:	termoRelacional op_bool expressaoRelacional
	|	('nao') expressaoRelacional
	|	termoRelacional
	;
	
termoRelacional
	:	expressaoAritmetica (OP_REL | '=') expressaoAritmetica
	| 	expressaoAritmetica ((OP_REL | '=') expressaoAritmetica)?
	|	'('expressaoRelacional')'
	;
	

listaComandos
	:	comando listaComandos
	|	comando
	;
	
comando
	:	comandoAtribuicao
	|	comandoEntrada
	|	comandoSaida
	|	comandoCondicao
	|	subAlgoritmo
	|	comandoCaso
	|	comandoPara
	|	comandoEnquanto
	| 	comandoFaca
	|	retorno_funcao
	;	


// Input e output
entrada: (VARIAVEL | var_registro) | (VARIAVEL | var_registro)',' entrada ;
	
comandoEntrada:'leia' ABRE_PAR entrada FECHA_PAR;

saida: (VARIAVEL | var_registro) | (VARIAVEL | var_registro)',' saida | CADEIA | CADEIA ',' saida | expressaoRelacional;

comandoSaida:'escreva' ABRE_PAR saida FECHA_PAR;

// Branches
comandoCondicao
	:	'se' expressaoRelacional 'entao' comandoCondicao? comando* 'fim_se'
	|	'se' expressaoRelacional 'entao' comandoCondicao? comando* 'senao' comandoCondicao? comando* 'fim_se'
	;

intervalo:	NUMINT '..' NUMINT;
comandoCaso: 'caso' (VARIAVEL | var_registro) 'seja' ((NUMINT | intervalo) ':' comando)* ('senao' comando)? 'fim_caso';

// Loops
comandoEnquanto:'enquanto' expressaoRelacional 'faca' comandoEnquanto? comando* 'fim_enquanto';

comandoFaca:'faca' comando* 'ate' expressaoRelacional;

comandoPara: 'para' (VARIAVEL | var_registro) '<-' NUMINT 'ate' (NUMINT | (VARIAVEL | var_registro)) 'faca' comandoPara? comando* 'fim_para' ;
	
subAlgoritmo: 'INICIO' listaComandos 'FIM';

// Funções
parametros_chamada_funcao: (VARIAVEL | var_registro | NUMINT | NUMREAL | expressaoAritmetica)?(',' (VARIAVEL | var_registro | NUMINT | NUMREAL | expressaoAritmetica))*;
chamada_funcao: VARIAVEL '(' parametros_chamada_funcao ')';

parametros_declaracao_funcao: (VARIAVEL  ':' ponteiro?(TIPO_VAR | declaracao_registro | var_personalizada));

retorno_funcao: 'retorne' (expressaoAritmetica | expressaoRelacional);

declaracao_funcao: 'funcao' VARIAVEL ABRE_PAR parametros_declaracao_funcao?(','parametros_declaracao_funcao)* FECHA_PAR
					':' (TIPO_VAR | var_personalizada)
					(comando)* 
					'fim_funcao';

// Procedimento
procedimento: 'procedimento' VARIAVEL ABRE_PAR ('var' VARIAVEL ':' var_personalizada)* FECHA_PAR declaracao? listaComandos? 'fim_procedimento';


declaracao_constante: 'constante' VARIAVEL ':' TIPO_VAR '=' (CADEIA | NUMINT | NUMREAL);