package Practice_7;

import java.util.ArrayDeque;
import java.util.Deque;

public class Drunkard {
    Deque<Integer> firstPlayer = new ArrayDeque();
    Deque<Integer> secondPlayer = new ArrayDeque();

    public Drunkard(String firstPlayer, String secondPlayer) {
        for(int i = 0; i < 5; ++i) {
            this.firstPlayer.add(Integer.parseInt(firstPlayer.substring(i, i + 1)));
            this.secondPlayer.add(Integer.parseInt(secondPlayer.substring(i, i + 1)));
        }

    }

    public String play() {
        int c = 0;

        String res;
        for(res = ""; !this.firstPlayer.isEmpty() && !this.secondPlayer.isEmpty() && c < 106; ++c) {
            if ((Integer)this.firstPlayer.peek() <= (Integer)this.secondPlayer.peek() && ((Integer)this.firstPlayer.peek() != 0 || (Integer)this.secondPlayer.peek() != 9) || (Integer)this.firstPlayer.peek() == 9 && (Integer)this.secondPlayer.peek() == 0) {
                this.secondPlayer.add((Integer)this.secondPlayer.remove());
                this.secondPlayer.add((Integer)this.firstPlayer.remove());
            } else {
                this.firstPlayer.add((Integer)this.firstPlayer.remove());
                this.firstPlayer.add((Integer)this.secondPlayer.remove());
            }
        }

        if (c >= 106) {
            res = res + "botva";
        } else {
            if (this.firstPlayer.isEmpty()) {
                res = res + "second ";
            } else {
                res = res + "first ";
            }

            res = res + c;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println((new Drunkard("13579", "24680")).play());
        System.out.println((new Drunkard("67890", "12345")).play());
        System.out.println((new Drunkard("13029", "42685")).play());
    }
}