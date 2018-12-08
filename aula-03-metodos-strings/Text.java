class Text {

    static char charUp(char c) {
        if (c >= 97 && c <= 122) {
            return (char) (c - 32);
        }
        return c;
    }

    static char charDown(char c) {
        if (c >= 65 && c <= 90) {
            return (char) (c + 32);
        }
        return c;
    }

    static String stringUp(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r = r + charUp(s.charAt(i));
        }
        return r;
    }

    static String stringDown(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r = r + charDown(s.charAt(i));
        }
        return r;
    }

    static boolean palindrome(String p) {
        return p.equals(reverse(p));
    }

    static String reverse(String s) {
        String r = "";
        for (int i = s.length()-1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    static int charCount(char c, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    static int vowelCount(String s) {
        int c = 0;
        s = stringDown(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                c++;
            } else if(s.charAt(i) == 'e') {
                c++;
            } else if(s.charAt(i) == 'i') {
                c++;
            } else if(s.charAt(i) == 'o') {
                c++;
            } else if(s.charAt(i) == 'u') {
                c++;
            }
        }
        return c;
    }

    static int consuantCount(String s) {
        int c = 0;
        s = stringDown(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                c++;
            } else if(s.charAt(i) != 'e') {
                c++;
            } else if(s.charAt(i) != 'i') {
                c++;
            } else if(s.charAt(i) != 'o') {
                c++;
            } else if(s.charAt(i) != 'u') {
                c++;
            }
        }
        return c;
    }

}
