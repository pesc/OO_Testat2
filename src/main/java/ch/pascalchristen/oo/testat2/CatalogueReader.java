package ch.pascalchristen.oo.testat2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatalogueReader implements AutoCloseable {
	private final BufferedReader reader;
	
	public CatalogueReader(String filePath) throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(filePath));
	}
	
	public String[] readNexteLine() throws IOException {
		String line = reader.readLine();
		if (line != null) {
			return line.split(" ");
		} else {
			return null;
		}
	}

	@Override
	public void close() throws IOException {
		reader.close();
	}
}
