package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjr extends fvr {
    public final long a;
    public final fja b;
    public final fhd c;

    public fjr(long j, fja fjaVar, fhd fhdVar) {
        super(fjaVar.c.af() == 2 ? 1 : 2);
        this.c = fhdVar;
        this.b = fjaVar;
        this.a = j;
        e(new dov(fjz.a, (byte[]) null));
        d(new dov(fjz.b, (byte[]) null));
    }

    static fhd a(fvi fviVar) {
        return ((fjr) fviVar.d.b).c;
    }

    public static boolean b(fvr fvrVar) {
        return fvrVar.d == 2;
    }

    @Override // defpackage.fvr
    public final void c() {
        this.b.c.c();
    }
}
