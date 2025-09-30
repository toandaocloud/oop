public class StringUtils {

    public String blowup(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c) && i + 1 < str.length()) {
                int num = Character.getNumericValue(c);
                char next = str.charAt(i + 1);
                for (int j = 0; j < num; j++) {
                    sb.append(next);
                }
            } else if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public int maxRun(String str) {
        if (str.isEmpty()) return 0;
        int max = 1;
        int current = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                current++;
                if (current > max) max = current;
            } else {
                current = 1;
            }
        }
        return max;
    }

    public boolean stringIntersect(String a, String b, int len) {
        if (len > a.length() || len > b.length()) return false;
        java.util.HashSet<String> set = new java.util.HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            set.add(a.substring(i, i + len));
        }
        for (int i = 0; i <= b.length() - len; i++) {
            if (set.contains(b.substring(i, i + len))) {
                return true;
            }
        }
        return false;
    }
}
