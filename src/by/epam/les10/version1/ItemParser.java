package by.epam.les10.version1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser {

	private List<String> items = new ArrayList<>();

	public List<String> parse(String text) {
		Pattern p = Pattern.compile("(<[!?]{1}[^!?>]*[!?]{1}>)*(<[/]{0,1}([^<>]*)>([^<>]*))");
		Matcher m = p.matcher(text);

		while (m.find()) {
			items.add(m.group(3));
			String temp = m.group(4);
			if (!temp.equals("")) {
				items.add(temp);
			}
		}
		return items;
	}
}
