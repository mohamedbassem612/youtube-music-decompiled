package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cge extends Exception {
    public final int a;
    public final boolean b;
    public final bse c;

    public cge(int i, bse bseVar, boolean z) {
        super(a.bR(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = bseVar;
    }
}
