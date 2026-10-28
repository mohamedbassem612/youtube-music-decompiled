package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inl {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/search/LocalSearchUtils");
    private final iup b;
    private final hlp c;
    private final vxz d;
    private final abfv e;
    private final isi f;

    public inl(iup iupVar, hlp hlpVar, abfv abfvVar, isi isiVar, vxz vxzVar) {
        this.b = iupVar;
        this.c = hlpVar;
        this.e = abfvVar;
        this.f = isiVar;
        this.d = vxzVar;
    }

    public final boolean a() {
        return this.f.R() && this.e.r();
    }

    public final boolean b(Context context) {
        if (!this.c.m()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                long longVersionCode = context.getPackageManager().getPackageInfo("com.google.android.mediaprovider", 1073741824).getLongVersionCode();
                String strN = this.d.n(0, 45354212L);
                if (strN == null || TextUtils.isEmpty(strN) || longVersionCode < Long.parseLong(strN)) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/apps/youtube/music/search/LocalSearchUtils", "checkMinMediaProviderModuleVersion", 'Z', "LocalSearchUtils.java")).w("Could not find package name %s", "com.google.android.mediaprovider");
                return false;
            }
        }
        return avg.c(context, jkx.a()) == 0 && this.b.N();
    }
}
