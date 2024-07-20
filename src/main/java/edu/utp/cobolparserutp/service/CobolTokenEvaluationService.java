package edu.utp.cobolparserutp.service;


import edu.utp.cobolparserutp.Yylex;
import edu.utp.cobolparserutp.utils.Token;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CobolTokenEvaluationService {
  public List<String> evaluateTokenSteam(String input) {
    List<String> result = new ArrayList<>();
    StringReader stringReader = new StringReader(input);
    Yylex lexer = new Yylex(stringReader);
    lexer.getTokenList()
        .forEach(token -> {
          try {
            result.add("Line %d: Token: %s".formatted(lexer.yylex(), token));
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        });

    return result;
  }
}
