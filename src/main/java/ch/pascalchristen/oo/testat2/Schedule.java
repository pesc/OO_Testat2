package ch.pascalchristen.oo.testat2;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
	private List<Module> modules = new ArrayList<>();
	private int semester = 1;

	public Schedule(List<Module> modules) {
		this.modules = modules;
	}

	public void findOrder() {
		final List<Module> toRemove = new ArrayList<>();
		while (!modules.isEmpty()) {
			printSemester();
			semester++;
			for (Module module : modules) {
				if (module.isEmpty()) {
					printModuleName(module);

					toRemove.add(module);
				}
			}
			if (toRemove.isEmpty()) {
				throw new LoopException("Modules has a cycle! No topological ordering exists...");
			}

			for (Module module : toRemove) {
				removeFromDependencySet(module.getModuleName());
				modules.remove(module);
			}
			toRemove.clear();
			System.out.println();
		}
	}

	private void printSemester() {
		System.out.print("Semester " + semester + ": ");
	}

	private void printModuleName(Module module) {
		System.out.print(module.getModuleName() + " ");
	}

	private void removeFromDependencySet(String moduleName) {
		for (Module module : modules) {
			module.removeDependency(moduleName);
		}
	}
}
