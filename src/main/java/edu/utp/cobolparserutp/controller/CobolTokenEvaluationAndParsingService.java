package edu.utp.cobolparserutp.controller;

import edu.utp.cobolparserutp.service.CobolCodeParsingResultService;
import edu.utp.cobolparserutp.service.CobolTokenEvaluationService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tokens")
public class CobolTokenEvaluationAndParsingService {
  private final CobolTokenEvaluationService evaluationService;
  private final CobolCodeParsingResultService parsingService;

  @GetMapping("/evaluate")
  public List<String> getTokenEvaluationList(@RequestBody String cobolCode) {
    return evaluationService.evaluateTokenSteam(cobolCode);

  }

  @GetMapping("/parse")
  public List<String> getCodeParsingResult(@RequestBody String cobolCode) {
    return List.of("hola");
  }
}
