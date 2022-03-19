package com.bluecard;

import java.util.ArrayList;
import java.util.List;

public class BadWordFilter {
    static List<String> BadWords = new ArrayList<>();
    static {
        BadWords.add("씨발");
        BadWords.add("씨1발");
        BadWords.add("ㅅㅂ");
        BadWords.add("시발");
        BadWords.add("시1발");
        BadWords.add("시x발");
        BadWords.add("ㅅ1ㅂ");
        BadWords.add("존나");
        BadWords.add("ㅈㄴ");
        BadWords.add("씨x발");
        BadWords.add("ㅅxㅂ");
        BadWords.add("존x나");
        BadWords.add("존1나");
        BadWords.add("ㅈxㄴ");
        BadWords.add("ㅈ1ㄴ");
        BadWords.add("fuck");
        BadWords.add("shit");
        BadWords.add("ass");
        BadWords.add("sex");
        BadWords.add("섹스");
        BadWords.add("ㅅㅅ");
        BadWords.add("6974");
    }
    public static String FilterBadWords(String value) {
        String output = value;
        for (String s : BadWords) {
            String nungot = "*";
            for (int i = 1; i >= s.length(); i++) {
                nungot += "*";
            }
            output = output.replace(s, nungot);
        }
        return output;
    }
}
