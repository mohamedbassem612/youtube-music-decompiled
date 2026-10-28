package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afpk extends afpu {
    private final cc a;

    public afpk(cc ccVar, boolean z) {
        super(ccVar, z);
        this.a = ccVar;
    }

    @Override // defpackage.afpu
    protected final Object a() {
        afuu afuuVarE = afwt.e(143, this.a.getClass(), "TTFACM#Component");
        try {
            Object objA = super.a();
            afuuVarE.close();
            return objA;
        } catch (Throwable th) {
            try {
                afuuVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afpu
    protected final void b(cc ccVar) {
        super.b(ccVar);
        Class<?> cls = ccVar.getClass();
        cf activity = ccVar.getActivity();
        cls.getSimpleName();
        activity.getClass();
        ahno.U(ccVar.getActivity() instanceof afov, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", ccVar.getClass().getSimpleName(), ccVar.getActivity().getClass().getSimpleName());
    }
}
