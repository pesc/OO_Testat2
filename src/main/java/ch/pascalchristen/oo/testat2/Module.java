package ch.pascalchristen.oo.testat2;

import java.util.HashSet;

public class Module {
	private final String moduleName;
	private final HashSet<String> dependencySet = new HashSet<>();

	public Module(String moduleName) {
		this.moduleName = moduleName;
	}

	public void removeDependency(String dependencyName) {
		dependencySet.remove(dependencyName);
	}

	public void addDependency(String dependencyName) {
		dependencySet.add(dependencyName);
	}

	public boolean isEmpty() {
		return dependencySet.isEmpty();
	}

	public String getModuleName() {
		return moduleName;
	}
}