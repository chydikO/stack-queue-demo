package org.itstep;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    static class WordComparator implements Comparator<Word> {
        @Override
        public int compare(Word o1, Word o2) {
            return o1.getWord().compareTo(o2.getWord());
        }
    }

    public static void main(String[] args) {
        Map<Word, Integer> map = new TreeMap<>(new WordComparator());
        map.putIfAbsent(new Word("word"), 1);
        map.replace(new Word("word"), 2);
        System.out.println("map = " + map);
    }
}


class Word /* implements Comparable<Word> */ {
    private final String word;

    Word(String word) {
        this.word = word;
    }

    //        @Override
//        public int compareTo(Word o) {
//            return Objects.compare(word, o.word, String::compareTo);
//        }
    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word;
    }
}

