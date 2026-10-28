package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum vwn {
    UNKNOWN(-1),
    AVAILABLE(0),
    STALE(1),
    EXPIRED(2),
    MISSING(3);

    public final int f;

    vwn(int i) {
        this.f = i;
    }
}
