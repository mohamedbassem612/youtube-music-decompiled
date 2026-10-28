package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccr {
    public boolean a;
    public cdk b;
    public int c;
    public boolean d;
    public int e;

    public ccr(cdk cdkVar) {
        this.b = cdkVar;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }
}
