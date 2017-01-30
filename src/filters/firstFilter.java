package filters;

import filters.ChatFilter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class firstFilter implements ChatFilter {
    List<String> censoredList;

    public firstFilter() {
        censoredList = new LinkedList<String>();
        censoredList.add("test");
        censoredList.add("first");
        censoredList.add("filter");
    }

    @Override
    public String filter(String message) {
        for (String word: censoredList) {
            message = message.replaceAll(word, "**FILTERED**");
        }

        return message;
    }
}
