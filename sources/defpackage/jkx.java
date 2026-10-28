package defpackage;

import android.app.Activity;
import android.os.Build;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkx {
    public static final agkj a;
    private final Activity b;
    private final Map c;

    static {
        aomq aomqVar = aomq.WRITE_EXTERNAL_STORAGE;
        aomq aomqVar2 = aomq.READ_MEDIA_AUDIO;
        a = agkj.l("android.permission.WRITE_EXTERNAL_STORAGE", aomqVar, "android.permission.READ_EXTERNAL_STORAGE", aomqVar2, "android.permission.READ_MEDIA_AUDIO", aomqVar2);
    }

    public jkx(Activity activity) {
        activity.getClass();
        this.b = activity;
        this.c = new HashMap();
    }

    public static String a() {
        return Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE";
    }

    public static String b() {
        return Build.VERSION.SDK_INT >= 29 ? a() : "android.permission.WRITE_EXTERNAL_STORAGE";
    }

    public final synchronized void c(int i, String[] strArr, int[] iArr) {
        jkv jkvVar;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            jkw jkwVar = new jkw(strArr[i2], i);
            Map map = this.c;
            if (map.containsKey(jkwVar) && (jkvVar = (jkv) map.remove(jkwVar)) != null) {
                if (iArr[i2] == 0) {
                    jkvVar.b(strArr[i2], i);
                } else {
                    jkvVar.a(strArr[i2], i);
                }
            }
        }
    }

    public final synchronized boolean d(String str, int i, Optional optional) {
        Activity activity = this.b;
        if (avg.c(activity, str) == 0) {
            return false;
        }
        this.c.put(new jkw(str, i), (jkv) optional.orElse(null));
        atb.a(activity, new String[]{str}, i);
        return true;
    }

    public final synchronized void e(Optional optional) {
        if (Build.VERSION.SDK_INT >= 29) {
            f(optional);
        } else {
            d(b(), 102, optional);
        }
    }

    public final synchronized void f(Optional optional) {
        d(a(), 103, optional);
    }
}
