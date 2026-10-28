package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffx implements axr {
    private final ffw a;
    private final ffz b;
    private final axr c;

    public ffx(axr axrVar, ffw ffwVar, ffz ffzVar) {
        this.c = axrVar;
        this.a = ffwVar;
        this.b = ffzVar;
    }

    @Override // defpackage.axr
    public final Object a() {
        Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
        }
        if (objA instanceof ffy) {
            ((ffy) objA).g().a = false;
        }
        return objA;
    }

    @Override // defpackage.axr
    public final boolean b(Object obj) {
        if (obj instanceof ffy) {
            ((ffy) obj).g().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
