package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aush implements ausg {
    private static final qmc a;
    private static final qmc b;

    static {
        omm ommVar = aurg.c;
        a = ommVar.w("measurement.service.store_null_safelist", true);
        b = ommVar.w("measurement.service.store_safelist", true);
    }

    @Override // defpackage.ausg
    public final boolean a() {
        return ((Boolean) a.io()).booleanValue();
    }

    @Override // defpackage.ausg
    public final boolean b() {
        return ((Boolean) b.io()).booleanValue();
    }
}
