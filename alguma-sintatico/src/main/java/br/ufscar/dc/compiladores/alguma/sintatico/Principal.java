package br.ufscar.dc.compiladores.alguma.sintatico;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;



public class Principal {
    public static void main(String args[]) throws IOException {
        try(PrintWriter pw = new PrintWriter(args[1])) {
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lexer = new AlgumaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgumaParser parser = new AlgumaParser(tokens);
        
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.removeErrorListeners();
            parser.addErrorListener(mcel);

            parser.programa();

            pw.println("Fim da compilacao");
        }        
    }
    
}