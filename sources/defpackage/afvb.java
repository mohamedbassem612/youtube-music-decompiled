package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afvb {
    public final int a;
    public final int b;
    public final int c;
    public final Object d;

    public afvb(afvc afvcVar, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = afvcVar;
    }

    public final void a(zec zecVar) {
        zecVar.c = (zed) this.d;
        int i = this.a;
        if (i != 0) {
            zecVar.b = i;
        }
        zecVar.a = this.c;
    }

    public afvb(zed zedVar, int i, int i2, int i3) {
        this.d = zedVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
