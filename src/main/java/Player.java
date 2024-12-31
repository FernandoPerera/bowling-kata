import java.util.ArrayList;
import java.util.List;

public final class Player {

    private final List<Integer> pinsKnockedDownByRolls = new ArrayList<>();

    public void roll(int pinsKnockedDown) {
        pinsKnockedDownByRolls.add(pinsKnockedDown);
    }

    public int score() {
        boolean turnIsOver = pinsKnockedDownByRolls.size() % 2 == 0;

        if (turnIsOver) {
            return lastTurnIsSpare()
                    ? pinsKnockedDownByRolls.subList(0, pinsKnockedDownByRolls.size() - 2).stream().reduce(0, Integer::sum)
                    : pinsKnockedDownByRolls.stream().reduce(0, Integer::sum);
        }

        return pinsKnockedDownByRolls.subList(0, pinsKnockedDownByRolls.size() - 1).stream().reduce(0, Integer::sum);
    }

    private boolean lastTurnIsSpare() {
        return pinsKnockedDownByRolls.getLast() + pinsKnockedDownByRolls.get(pinsKnockedDownByRolls.size() - 2) == 10;
    }
}
