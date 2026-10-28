package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sgv {
    public int a;
    public boolean b;
    public float c;
    public int d;
    public int e;

    public final synchronized void a(aivp aivpVar) {
        this.a = aivpVar.b;
        int iBg = a.bg(aivpVar.c);
        if (iBg == 0) {
            iBg = 1;
        }
        this.e = iBg;
        this.b = aivpVar.d;
        this.c = aivpVar.e;
        this.d = aivpVar.f;
    }
}
