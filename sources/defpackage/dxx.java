package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxx {
    static final /* synthetic */ dxx a = new dxx();
    public static final String b = "dxy";

    public final dxy a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return dyc.b;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return dyb.b;
        }
        return Build.VERSION.SDK_INT >= 28 ? dya.b : dxz.b;
    }
}
