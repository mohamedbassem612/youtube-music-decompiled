package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwx {
    public static final dwx a = new dwx(1);
    public static final dwx b = new dwx(2);
    private final int c;

    private dwx(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dwx) && this.c == ((dwx) obj).c;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return this.c != 1 ? "AUDIO_ON" : "VISUALS_ON";
    }
}
