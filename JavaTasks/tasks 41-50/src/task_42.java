public class task_42 {
    public static boolean canMove(String a, String bStr, String cStr) {
        char[] b = bStr.toCharArray();
        char[] c = cStr.toCharArray();
        if ((b.length == 2 && c.length == 2) && ((b[0] >= 'A' && b[0] <= 'H') || (b[0] >= 'a' && b[0] <= 'h')) &&
                ((c[0] >= 'A' && c[0] <= 'H') || (c[0] >= 'a' && c[0] <= 'h')) && (b[1] >= '1' && b[1] <= '8')
                && (c[1] >= '1' && c[1] <= '8')) {
            if (a.trim().equalsIgnoreCase("Pawn")) {
                if (b[0] == c[0]) {
                    if (b[1] == '1') {
                        return false;
                    }
                    if (b[1] == '2' && c[1] == '4') {
                        return true;
                    }
                    int begin = (int) b[1];
                    int end = (int) c[1];
                    return begin + 1 == end;
                }
                else {
                    return false;
                }
            }
            else if (a.trim().equalsIgnoreCase("Knight")) {
                return ((Math.abs((b[1] - c[1])) == 2 && Math.abs(b[0] - c[0]) == 1) ||
                        (Math.abs((b[0] - c[0])) == 2 && Math.abs(b[1] - c[1]) == 1));
            }
            else if (a.trim().equalsIgnoreCase("Bishop")) {
                return (Math.abs(b[0] - c[0]) == Math.abs(b[1] - c[1]));
            }
            else if (a.trim().equalsIgnoreCase("Rook")) {
                return b[0] == c[0] || b[1] == c[1];
            }
            else if (a.trim().equalsIgnoreCase("Queen")) {
                return (b[0] == c[0] || b[1] == c[1]) || (Math.abs(b[0] - c[0]) == Math.abs(b[1] - c[1]));
            }
            else if (a.trim().equalsIgnoreCase("King")) {
                return ((b[0] == c[0]) && (b[1] + 1 == c[1]) || (b[1] == c[1]) && (b[0] + 1 == c[0]) ||
                        (b[0] == c[0]) && (b[1] - 1 == c[1]) || (b[1] == c[1]) && (b[0] - 1 == c[0]));
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(canMove("Rook", "A8", "H8"));
        System.out.println(canMove("Bishop", "A7", "G1") );
        System.out.println(canMove("Queen", "C4", "D6") );
    }
}
