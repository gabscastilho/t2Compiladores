package br.ufscar.dc.compiladores.alguma.sintatico;

import java.io.PrintWriter;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;



public class Principal {
    public static void main(String args[]) throws IOException {
        // pega o primeiro parametro como o path do arquivo de entrada e o segundo de saída
        try(PrintWriter pw = new PrintWriter(args[1])) {
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lexer = new AlgumaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgumaParser parser = new AlgumaParser(tokens);
            
            // classe de customização de erros
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.removeErrorListeners(); // evita o erro ser exibido 2x
            parser.addErrorListener(mcel);

            parser.programa();

            pw.println("Fim da compilacao");
        }        
    }
    
}