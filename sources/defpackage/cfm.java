package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfm extends Exception {
    public final int a;
    public final boolean b;

    public cfm(int i, boolean z) {
        super(a.bR(i, "AudioOutput write failed: "));
        this.b = z;
        this.a = i;
    }
}
