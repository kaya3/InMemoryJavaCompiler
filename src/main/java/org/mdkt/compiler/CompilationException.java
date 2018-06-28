package org.mdkt.compiler;

import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.util.Collections;
import java.util.List;

public class CompilationException extends RuntimeException {
	private final List<Diagnostic<? extends JavaFileObject>> diagnostics;
	
	public CompilationException(String msg) {
		this(msg, null);
	}
	
	public CompilationException(String msg, List<Diagnostic<? extends JavaFileObject>> diagnostics) {
		super(msg);
		this.diagnostics = diagnostics;
	}
	
	public List<Diagnostic<? extends JavaFileObject>> getDiagnostics() {
		return Collections.unmodifiableList(diagnostics);
	}
}
