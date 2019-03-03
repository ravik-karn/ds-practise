package com.ravi.ds.trie;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {
    @Test
    public void shouldInsertTrie() {
        Trie trie = new Trie();
        trie.insert("abc");
        trie.insert("abcd");
        trie.insert("lmn");

        assertEquals("{{a={{b={{c={{d={{}true}}true}}false}}false}, l={{m={{n={{}true}}false}}false}}false}", trie.toString());
    }

    @Test
    public void shouldDeleteElementInTrie() {
        Trie trie = new Trie();
        trie.insert("abc");
        trie.insert("abcd");
        trie.insert("lmn");

        trie.delete("abc");
        assertEquals("{{a={{b={{c={{d={{}true}}false}}false}}false}, l={{m={{n={{}true}}false}}false}}false}", trie.toString());
    }

    @Test
    public void shouldSearchExactMatchInTrie() {
        Trie trie = new Trie();
        trie.insert("abc");
        trie.insert("abcd");
        trie.insert("lmn");

        assertTrue(trie.searchExact("abc"));
        assertFalse(trie.searchExact("abl"));
        assertFalse(trie.searchExact("ab"));
    }

    @Test
    public void shouldSearchPrefixInTrie() {
        Trie trie = new Trie();
        trie.insert("abc");
        trie.insert("abcd");
        trie.insert("lmn");

        assertTrue(trie.searchPrefix("abc"));
        assertTrue(trie.searchPrefix("ab"));
        assertFalse(trie.searchPrefix("al"));
    }

    @Test
    public void shouldReturnLongestMatchingPrefixInTrie() {
        Trie trie = new Trie();
        trie.insert("are");
        trie.insert("area");
        trie.insert("base");
        trie.insert("cat");
        trie.insert("cater");
        trie.insert("children");
        trie.insert("basement");

        assertEquals("cater", trie.longestMatchingPrefix("caterer"));
        assertEquals("base", trie.longestMatchingPrefix("basemexy"));
        assertEquals("", trie.longestMatchingPrefix("child"));
    }
}
