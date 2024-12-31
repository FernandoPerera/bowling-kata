public final class Player {

    private int score = 0;

    public void roll(int pinsKnockedDown) {
        score += pinsKnockedDown;
    }

    public int score() {
        return this.score;
    }
}
