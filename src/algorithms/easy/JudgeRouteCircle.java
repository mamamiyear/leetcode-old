package algorithms.easy;

/**
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle,
 * which means it moves back to the original place.
 *
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be
 * true or false representing whether the robot makes a circle.
 *
 * Example 1:
 * Input: "UD"
 * Output: true
 * Example 2:
 * Input: "LL"
 * Output: false
 */
public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        char t;
        String go = moves.toUpperCase();
        char[] steps = go.toCharArray();
        for (int i = 0; i < steps.length; i++) {
            t = steps[i];
            switch (t) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                default:
                    System.out.println("Step is illegal. operation is " + steps[i] + " and the step is " + i + ".");
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        String moves = "UUDDLLRR";
        System.out.println(new JudgeRouteCircle().judgeCircle(moves));
    }
}
