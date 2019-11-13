package ch.pascalchristen.oo.testat2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws IOException  {

		List<Module> modules = new ArrayList<>();
		try (var reader = new CatalogueReader("StudyCatalogue.txt")) {
			String[] names;
			while ((names = reader.readNexteLine()) != null) {
				Module module = new Module(names[0]);
				modules.add(module);
				for (int i = 1; i < names.length; i++) {
					module.addDependency(names[i]);
				}
			}
		}
		Schedule moduleSchedule = new Schedule(modules);
		moduleSchedule.findOrder();

	}
}
