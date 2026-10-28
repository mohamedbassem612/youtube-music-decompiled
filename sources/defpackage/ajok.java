package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajok implements aihr {
    CAPTIONS_INITIAL_STATE_UNKNOWN(0),
    CAPTIONS_INITIAL_STATE_OFF_RECOMMENDED(1),
    CAPTIONS_INITIAL_STATE_OFF_REQUIRED(2),
    CAPTIONS_INITIAL_STATE_ON_RECOMMENDED(3),
    CAPTIONS_INITIAL_STATE_ON_REQUIRED(4);

    private final int g;

    ajok(int i) {
        this.g = i;
    }

    public static ajok a(int i) {
        if (i == 0) {
            return CAPTIONS_INITIAL_STATE_UNKNOWN;
        }
        if (i == 1) {
            return CAPTIONS_INITIAL_STATE_OFF_RECOMMENDED;
        }
        if (i == 2) {
            return CAPTIONS_INITIAL_STATE_OFF_REQUIRED;
        }
        if (i == 3) {
            return CAPTIONS_INITIAL_STATE_ON_RECOMMENDED;
        }
        if (i != 4) {
            return null;
        }
        return CAPTIONS_INITIAL_STATE_ON_REQUIRED;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
