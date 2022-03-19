package com.bluecard;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextReplacementConfig;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

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
            output = output.replace(s, "*".repeat(s.length()));
        }
        return output;
    }
}
