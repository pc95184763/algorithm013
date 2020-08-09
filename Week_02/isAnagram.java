class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {   //若两字符串长度不等，则肯定不是字母异位词
        return false;
    }
    int[] counter = new int[26];     // 用该数组来存放两字符串中的各个字母的频率，若最后数组中有不为0的，
    for (int i = 0; i < s.length(); i++) {   // 则说明有某个字符的出现的次数不相等，则返回false，否则true
        counter[s.charAt(i) - 'a']++;
        counter[t.charAt(i) - 'a']--;
    }
    for (int count : counter) {
        if (count != 0) {
            return false;
        }
    }
    return true;
}

}