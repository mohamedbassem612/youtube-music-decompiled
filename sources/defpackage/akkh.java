package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akkh implements aihr {
    PLAYBACK_CONTEXT_TYPE_UNKNOWN(0),
    PLAYBACK_CONTEXT_TYPE_WATCH(1),
    PLAYBACK_CONTEXT_TYPE_INLINE(2);

    private final int e;

    akkh(int i) {
        this.e = i;
    }

    public static akkh a(int i) {
        if (i == 0) {
            return PLAYBACK_CONTEXT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PLAYBACK_CONTEXT_TYPE_WATCH;
        }
        if (i != 2) {
            return null;
        }
        return PLAYBACK_CONTEXT_TYPE_INLINE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
