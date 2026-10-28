package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lps {

    @Deprecated
    public static final khn a;
    private static final kro b;
    private static final kro c;

    static {
        kro kroVar = new kro();
        c = kroVar;
        lpq lpqVar = new lpq();
        b = lpqVar;
        a = new khn("UsageReporting.API", lpqVar, kroVar);
    }

    public static lpo a(Context context) {
        return new lpo(context, new lpr());
    }
}
