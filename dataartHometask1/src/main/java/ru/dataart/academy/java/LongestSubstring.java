package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        String encountedLetters = "";
        int maxSubstrLength = 0, substrLength = 0, length = checkString.length();
        int i = 0;
        while (i < length) {
            for (int j = i; j < length; j++) {
                if (encountedLetters.contains(checkString.substring(j, j + 1))) {
                    if (substrLength > maxSubstrLength)
                        maxSubstrLength = substrLength;
                    substrLength = 0;
                    encountedLetters = "";
                } else {
                    encountedLetters += checkString.substring(j, j + 1);
                    substrLength++;
                }
            }
            i++;
        }
        return maxSubstrLength;
    }
}
