package org.davidrferreira.parsing;

import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public abstract class AbstractVisitor extends VoidVisitorAdapter<Object> {

  private final String programName;
  private final String compilationUnitPath;

  public AbstractVisitor(String programName, String compilationUnitPath) {
    super();
    this.programName = programName;
    this.compilationUnitPath = compilationUnitPath;
  }

  public String getProgramName() {
    return programName;
  }

  public String getCompilationUnitPath() {
    return compilationUnitPath;
  }
}
