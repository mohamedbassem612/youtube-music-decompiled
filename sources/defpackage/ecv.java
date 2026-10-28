package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ecv implements ecy {
    public final edl a;

    public ecv(edl edlVar) {
        this.a = edlVar;
    }

    @Override // defpackage.ecy
    public final awzc a(dyn dynVar) {
        dynVar.getClass();
        return new awyx(new dnf(this, (awoq) null, 3));
    }

    @Override // defpackage.ecy
    public final boolean c(ees eesVar) {
        return b(eesVar) && e(this.a.b());
    }

    public abstract int d();

    public boolean e(Object obj) {
        throw null;
    }
}
