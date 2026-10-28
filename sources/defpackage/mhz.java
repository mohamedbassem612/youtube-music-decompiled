package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mhz {
    public static final enq a = new enq(-1.0f, 1.0f);

    public static mwx a(mww mwwVar) {
        return c(mwwVar) ? mwwVar.k() : mwwVar.l();
    }

    static String b(mww mwwVar) {
        mwx mwxVarA = a(mwwVar);
        if (mwwVar.q()) {
            return null;
        }
        int i = agxm.b;
        return agxl.a.c(mwxVarA.h(), StandardCharsets.UTF_8).toString();
    }

    public static boolean c(mww mwwVar) {
        if (mwwVar == null || !mwwVar.t()) {
            return false;
        }
        return mwwVar.k().j() || mwwVar.k().l() || mwwVar.k().k();
    }
}
