package org.davidrferreira.scripts.model;

public interface Analysis {

  void start() throws Exception;

  AnalysisArtefact[] requires();

  AnalysisArtefact provides();
}
