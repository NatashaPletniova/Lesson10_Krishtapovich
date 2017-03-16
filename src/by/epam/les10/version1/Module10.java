package by.epam.les10.version1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Module10 {

	public static void main(String[] args) {

		String path = "src/res/menu.xml";
		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				sb.append(tmp.trim());

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		String content = new String(sb);

		ItemParser ItemParser = new ItemParser();

		List<String> items = ItemParser.parse(content);

		for (String item : items) {
			System.out.println(item);
		}
	}
}
