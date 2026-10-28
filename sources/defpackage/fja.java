package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fja implements Cloneable {
    public final fkl a;
    public final flz b;
    public final fgy c;
    public final int d;
    public final int e;
    public final int f;

    public fja(fgy fgyVar, fkl fklVar, flz flzVar, int i, int i2, int i3) {
        this.a = fklVar;
        this.b = flzVar;
        this.c = fgyVar;
        this.d = i;
        this.e = i2 == 8 ? 1 : i2;
        this.f = i3;
    }

    public static fja a(fvi fviVar) {
        return ((fjr) fviVar.d.b).b;
    }

    public static fja b(fvq fvqVar) {
        return ((fjr) fvqVar.b).b;
    }

    public final boolean c() {
        if (this.e == 2) {
            return false;
        }
        fkl fklVar = this.a;
        return (fklVar != null && fklVar.R()) || this.c.T();
    }
}
