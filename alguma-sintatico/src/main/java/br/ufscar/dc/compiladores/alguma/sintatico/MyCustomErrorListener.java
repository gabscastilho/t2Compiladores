package br.ufscar.dc.compiladores.alguma.sintatico;


import org.antlr.v4.runtime.ANTLRErrorListener; // cuidado para importar a versão 4
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import java.io.PrintWriter;
import java.util.BitSet;

public class MyCustomErrorListener implements ANTLRErrorListener {
    PrintWriter pw;
    public MyCustomErrorListener(PrintWriter pw) {
        this.pw = pw;    
    }
    
    boolean i = true;

    @Override
    public void	reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Aqui vamos colocar o tratamento de erro customizado

        Token t = (Token) offendingSymbol;
        
        if(i == true){
            if(t.getText() == "<EOF>"){
                pw.println("Linha "+line+": erro sintatico proximo a EOF");
            }else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) == "CADEIA_NAO_FECHADA"){
                pw.println("Linha "+line+": cadeia literal nao fechada");
            }else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) == "ERRO"){
                pw.println("Linha "+line+": "+t.getText()+" - simbolo nao identificado");
                i = false;
            }else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) == "COMENTARIO_NAO_FECHADO"){
                pw.println("Linha "+line+": comentario nao fechado");
                i = false;
            }else{
                pw.println("Linha "+line+": erro sintatico proximo a "+t.getText());
                i = false;
            }
        }
    }
}