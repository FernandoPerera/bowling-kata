import java.util.ArrayList;
import java.util.List;

public final class Player {

    private final List<Integer> pinsKnockedDownByRolls = new ArrayList<>();

    public void roll(int pinsKnockedDown) {
        pinsKnockedDownByRolls.add(pinsKnockedDown);
    }

    public int score() {
        boolean turnIsOver = pinsKnockedDownByRolls.size() % 2 == 0;

        return turnIsOver
                ? pinsKnockedDownByRolls.stream().reduce(0, Integer::sum)
                : pinsKnockedDownByRolls.subList(0, pinsKnockedDownByRolls.size() - 1).stream().reduce(0, Integer::sum);
    }
}
