package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum apdw implements aihr {
    REEL_LOOP_BEHAVIOR_UNKNOWN(0),
    REEL_LOOP_BEHAVIOR_SINGLE_PLAY(1),
    REEL_LOOP_BEHAVIOR_REPEAT(2),
    REEL_LOOP_BEHAVIOR_END_SCREEN(3),
    REEL_LOOP_BEHAVIOR_AUTO_ADVANCE(4),
    REEL_LOOP_BEHAVIOR_AUTO_ADVANCE_POST_TWO_LOOPS(5),
    REEL_LOOP_BEHAVIOR_AUTO_ADVANCE_POST_THREE_LOOPS(6),
    REEL_LOOP_BEHAVIOR_AUTO_ADVANCE_POST_FOUR_LOOPS(7),
    REEL_LOOP_BEHAVIOR_AUTO_ADVANCE_POST_FIVE_LOOPS(8);

    public final int j;

    apdw(int i) {
        this.j = i;
    }

    public static apdw a(int i) {
        switch (i) {
            case 0:
                return REEL_LOOP_BEHAVIOR_UNKNOWN;
            case 1:
                return REEL_LOOP_BEHAVIOR_SINGLE_PLAY;
            case 2:
                return REEL_LOOP_BEHAVIOR_REPEAT;
            case 3:
                return REEL_LOOP_BEHAVIOR_END_SCREEN;
            case 4:
                return REEL_LOOP_BEHAVIOR_AUTO_ADVANCE;
            case 5:
                return REEL_LOOP_BEHAVIOR_AUTO_ADVANCE_POST_TWO_LOOPS;
            case 6:
                return REEL_LOOP_BEHAVIOR_AUTO_ADVANCE_POST_THREE_LOOPS;
            case 7:
                return REEL_LOOP_BEHAVIOR_AUTO_ADVANCE_POST_FOUR_LOOPS;
            case 8:
                return REEL_LOOP_BEHAVIOR_AUTO_ADVANCE_POST_FIVE_LOOPS;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
