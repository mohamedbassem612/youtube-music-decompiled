package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aebx {
    public static final /* synthetic */ int f = 0;
    public final tpq e;
    private static final agrf g = agrf.h("com/google/android/libraries/youtube/rendering/ui/permissions/PermissionManager");
    static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    static final SparseArray b = new aebw(null, null);
    static final SparseArray c = new aebw(null);
    static final SparseArray d = new aebw();

    public aebx(tpq tpqVar) {
        this.e = tpqVar;
    }

    public static boolean b(Context context) {
        for (String str : d(context, 3)) {
            if (avg.c(context, str) == 0) {
                return true;
            }
        }
        return false;
    }

    static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static String[] d(Context context, int i) {
        if (c() && b.indexOfKey(i) >= 0) {
            return e(context.getApplicationInfo().targetSdkVersion, Build.VERSION.SDK_INT, i);
        }
        if (c.indexOfKey(i) >= 0) {
            return e(context.getApplicationInfo().targetSdkVersion, Build.VERSION.SDK_INT, i);
        }
        SparseArray sparseArray = d;
        if (sparseArray.indexOfKey(i) >= 0) {
            return (String[]) sparseArray.get(i);
        }
        throw new IllegalArgumentException("Invalid permissionId: key not found in PERMISSIONS_MAP");
    }

    static String[] e(int i, int i2, int i3) {
        if (c()) {
            return (String[]) b.get(i3);
        }
        return (i < 33 || i2 < 33) ? a : (String[]) c.get(i3);
    }
}
