package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwe {
    public final fve a;
    public fve b;
    public fve c;
    public boolean d;
    public boolean e;
    public int f;

    public fwe(fve fveVar, fve fveVar2, fve fveVar3) {
        this.b = fveVar;
        this.c = fveVar2;
        this.a = fveVar3;
    }

    public final void a(boolean z) {
        int i = this.f;
        this.f = z ? i | 32 : i & (-33);
    }

    public final boolean b() {
        return (this.f & 32) != 0;
    }

    public final boolean c() {
        return (this.f & 30) == 30;
    }
}
