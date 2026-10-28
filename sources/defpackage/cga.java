package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cga extends Exception {
    public final bse a;

    public cga(String str, bse bseVar) {
        super(str);
        this.a = bseVar;
    }

    public cga(Throwable th, bse bseVar) {
        super(th);
        this.a = bseVar;
    }
}
