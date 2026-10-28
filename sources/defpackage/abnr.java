package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum abnr {
    DEFAULT(0),
    MINIMIZED(1),
    FULLSCREEN(2),
    BACKGROUND(3),
    INLINE_IN_FEED(5),
    VIRTUAL_REALITY(6),
    PICTURE_IN_PICTURE(7),
    REMOTE(-1);

    public final int i;

    abnr(int i) {
        this.i = i;
    }

    public final String a() {
        return String.valueOf(this.i);
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6;
    }
}
