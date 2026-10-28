package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class api {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final long b(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static int c(Context context, String str, int i, int i2, String str2) {
        int iA;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp != null) {
            if (str2 == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                str2 = packagesForUid[0];
            }
            int iMyUid = Process.myUid();
            String packageName = context.getPackageName();
            if (iMyUid == i2 && Objects.equals(packageName, str2) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                iA = aag.i(appOpsManager, strPermissionToOp, Binder.getCallingUid(), str2);
                if (iA == 0) {
                    iA = aag.i(appOpsManager, strPermissionToOp, i2, context.getOpPackageName());
                }
            } else {
                iA = ast.a(context, strPermissionToOp, str2);
            }
            if (iA != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.Intent] */
    public static Intent d(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strF = f(activity, activity.getComponentName());
            if (strF != 0) {
                ComponentName componentName = new ComponentName(activity, (String) strF);
                try {
                    strF = f(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                    return strF;
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("NavUtils", a.bT(strF, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent e(Context context, ComponentName componentName) {
        String strF = f(context, componentName);
        if (strF == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strF);
        return f(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String f(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
    }

    public static final void g(View view, dow dowVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, dowVar);
    }

    public static final dov h(dow dowVar) {
        return new dov(new aack(dowVar, new py(dowVar, 15)), (byte[]) null);
    }

    public static final String i(Collection collection) {
        return !collection.isEmpty() ? awrc.B(atqq.aD(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final String j(Collection collection) {
        return awrc.B(atqq.aD(collection, ",", null, null, null, 62)).concat(awrc.B(" }"));
    }

    public static final String k(Collection collection) {
        return awrc.B(atqq.aD(collection, ",", null, null, null, 62)).concat(awrc.B("},"));
    }

    public static final String l(don donVar) {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(donVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(i(atqq.am(donVar.b.values(), new awv(15))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(i(donVar.c));
        sb.append("\n            |    indices = {");
        Set set = donVar.d;
        sb.append(i(set != null ? atqq.am(set, new awv(16)) : awno.a));
        sb.append("\n            |}\n        ");
        return awrc.H(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    public static final boolean m(String str, String str2) {
        if (awrc.c(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0) {
                    if (cCharAt != '(') {
                        i2++;
                    } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i3 == str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                } else if (cCharAt == '(') {
                    i3 = 0;
                    cCharAt = '(';
                    if (cCharAt != '(') {
                        i2++;
                    } else if (cCharAt != ')') {
                        continue;
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                String strSubstring = str.substring(1, str.length() - 1);
                strSubstring.getClass();
                return awrc.c(awrc.q(strSubstring).toString(), str2);
            }
        }
        return false;
    }

    public static final boolean n(don donVar, Object obj) {
        Set set;
        if (donVar == obj) {
            return true;
        }
        if (obj instanceof don) {
            don donVar2 = (don) obj;
            if (awrc.c(donVar.a, donVar2.a) && awrc.c(donVar.b, donVar2.b) && awrc.c(donVar.c, donVar2.c)) {
                Set set2 = donVar.d;
                if (set2 == null || (set = donVar2.d) == null) {
                    return true;
                }
                return awrc.c(set2, set);
            }
        }
        return false;
    }

    public static final void o(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('?');
            if (i2 < i - 1) {
                sb.append(',');
            }
        }
    }
}
