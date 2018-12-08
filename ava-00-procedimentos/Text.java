class Text {

    static String rotate(String s) {
        String r = "";
        for (int i = s.length()-1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    static String chop(String s) {
        String r = "";
        for (int i = 0; i < s.length() - 1; i++) {
            r += s.charAt(i);
        }
        return r;
    }

}
