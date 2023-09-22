package org.davidrferreira.scripts;

import org.davidrferreira.exceptions.MissingArtefactException;
import org.davidrferreira.scripts.model.Analysis;
import org.davidrferreira.scripts.model.AnalysisArtefact;

public class RunAllAnalysis {

  private static final Analysis[] ANALYSES = new Analysis[]{

  };

  public static void main(String[] args) throws Exception {
    for (Analysis analysis : ANALYSES) {
      checkAnalysisRequirements(analysis);
      runAnalysis(analysis);
    }
  }

  private static void checkAnalysisRequirements(Analysis analysis) {
    for (AnalysisArtefact artefact : analysis.requires()) {
      if (!artefact.exists()) {
        throw new MissingArtefactException(
          "Required artefact - " + artefact.getName() + " is missing for experiment "
            + analysis.provides().getName());
      }
    }
  }

  private static void runAnalysis(Analysis analysis) throws Exception {
    if (analysis.provides().exists()) {
      return;
    }
    analysis.start();
  }

}
