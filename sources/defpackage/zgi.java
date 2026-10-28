package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum zgi {
    BUFFERING("B", 3),
    ERROR("ER", 9),
    ENDED("EN", 8),
    NOT_STARTED("N", 2),
    PAUSED("PA", 5),
    PLAYING("PL", 4),
    SEEKING("S", 7),
    NOT_VALID("X", 1),
    PAUSED_BUFFERING("PB", 6),
    SUSPENDED("SU", 10);

    public final String k;
    public final int l;

    zgi(String str, int i) {
        this.k = str;
        this.l = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.k;
    }
}
