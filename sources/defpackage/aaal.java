package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaal {
    public static final agkj a = agkj.l(0, "ACTION1_CLICKED", 1, "ACTION2_CLICKED", 2, "ACTION3_CLICKED");

    public static void a(awmd awmdVar, String str, vyo vyoVar) {
        if (c(vyoVar, awmdVar)) {
            ((qtf) ((aerv) awmdVar.io()).l.io()).b(1L, str);
        }
    }

    public static void b(awmd awmdVar, String str, boolean z, vyo vyoVar) {
        if (c(vyoVar, awmdVar)) {
            ((qtf) ((aerv) awmdVar.io()).p.io()).b(1L, str, Boolean.valueOf(z));
        }
    }

    public static boolean c(vyo vyoVar, awmd awmdVar) {
        if (vyoVar != null && vyoVar.b() != null) {
            aode aodeVar = vyoVar.b().p;
            if (aodeVar == null) {
                aodeVar = aode.a;
            }
            if (aodeVar != null && aodeVar.e && f(awmdVar)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static void d(awmd awmdVar, String str) {
        if (f(awmdVar)) {
            ((aerv) awmdVar.io()).k(str, false, false);
        }
    }

    @Deprecated
    public static void e(awmd awmdVar, String str, vyo vyoVar) {
        if (c(vyoVar, awmdVar)) {
            d(awmdVar, str);
        }
    }

    private static boolean f(awmd awmdVar) {
        return awmdVar != null;
    }
}
