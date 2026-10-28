package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zte {
    public static final /* synthetic */ int a = 0;

    static {
        String str = ztf.K;
    }

    public static boolean a(ztf ztfVar) {
        return (ztfVar.b() & 1024) != 0;
    }

    @Deprecated
    public static void b() {
        throw new agfz("NotImplemented");
    }

    public static zup c(ztf ztfVar) {
        zvb zvbVarC = ztfVar.c();
        return zvbVarC == null ? zvb.d(0, ztfVar.p()) : zvbVarC.c(0);
    }

    @Deprecated
    public static void d() {
        throw new agfz("NotImplemented");
    }

    @Deprecated
    public static void e(ztf ztfVar, akku akkuVar, aihf aihfVar, boolean z) {
        if (z) {
            ztfVar.v(aihfVar);
        } else if (akkuVar != akku.DELAYED_EVENT_TIER_UNSPECIFIED) {
            ztfVar.t(akkuVar, aihfVar);
        } else {
            ztfVar.s(aihfVar);
        }
    }
}
