package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atb extends avg {
    public static void a(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = hashSet.size();
                String[] strArr2 = size > 0 ? new String[length - size] : strArr;
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                }
                if (activity instanceof cf) {
                }
                activity.requestPermissions(strArr, i);
                return;
            }
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
            i2++;
        }
    }

    public static boolean b(Activity activity, String str) {
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        if (Build.VERSION.SDK_INT != 31) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
