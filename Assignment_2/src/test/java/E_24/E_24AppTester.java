/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_24;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class E_24AppTester {
    private static final AnagramWorker anagram = new AnagramWorker();
    @Test
    public void Anagram_returns_true_with_capitals(){
        assertTrue(anagram.IsAnagram("Tone","Note"));
    }

    @Test
    void Non_Anagram_returns_false() {
        assertFalse(anagram.IsAnagram("not","Anagrams"));
    }

    @Test
    void Words_Not_Same_Len_returns_false() {
        assertFalse(anagram.IsAnagram("longword","small"));
    }

    @Test
    void same_len_words_not_anagrams_returns_false() {
        assertFalse((anagram.IsAnagram("four","dogs")));
    }

    @Test
    void returns_true_with_lowercase_anagram() {
        assertTrue(anagram.IsAnagram("dogs","gods"));
    }
}
