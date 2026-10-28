package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xrx {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/MediaRoutes");
    public final Executor b;
    public final ahex c;
    public final dov d;
    private final String e = "2DB7CC49";

    public xrx(Executor executor, ahex ahexVar, dov dovVar) {
        this.b = executor;
        this.c = ahexVar;
        this.d = dovVar;
    }

    public static String a(dii diiVar) {
        String strT;
        CastDevice castDeviceC = CastDevice.c(diiVar.s);
        if (castDeviceC != null && b(castDeviceC) != null) {
            return b(castDeviceC);
        }
        if (h(diiVar)) {
            String strT2 = xvr.t(diiVar.s);
            if (!TextUtils.isEmpty(strT2)) {
                return c(strT2);
            }
        } else if (j(diiVar) && (strT = xvr.t(diiVar.s)) != null) {
            return strT;
        }
        return diiVar.d;
    }

    public static String b(CastDevice castDevice) {
        return castDevice.a.replace("-", "");
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String str2 = (String) aguu.R(agfm.b(':').f(str));
            return !TextUtils.isEmpty(str2) ? str2.replace("-", "") : str;
        } catch (IndexOutOfBoundsException unused) {
            agrx agrxVar = agso.a;
            return str;
        }
    }

    public static boolean d(dii diiVar, dii diiVar2) {
        String strA = a(diiVar);
        return strA != null && TextUtils.equals(strA, a(diiVar2));
    }

    public static boolean e(CastDevice castDevice) {
        return (castDevice == null || castDevice.e(1) || !castDevice.e(4)) ? false : true;
    }

    public static boolean f(dii diiVar) {
        return diiVar.j() || diiVar.o == 3 || (TextUtils.equals(diiVar.b.b().g.a(), "android") && o(diiVar, "android.media.intent.category.LIVE_AUDIO") && !o(diiVar, "android.media.intent.category.LIVE_VIDEO"));
    }

    public static boolean g(dii diiVar) {
        Bundle bundle = diiVar.s;
        return bundle != null && i(diiVar) && xvr.u(bundle) == 4;
    }

    public static boolean h(dii diiVar) {
        Bundle bundle = diiVar.s;
        return bundle != null && i(diiVar) && xvr.u(bundle) == 3;
    }

    static boolean i(dii diiVar) {
        Iterator it = diiVar.l.iterator();
        while (it.hasNext()) {
            Iterator<String> itCategoriesIterator = ((IntentFilter) it.next()).categoriesIterator();
            while (itCategoriesIterator.hasNext()) {
                if (itCategoriesIterator.next().contains("MDX_MEDIA_ROUTE_CONTROL_CATEGORY_")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(dii diiVar) {
        Bundle bundle = diiVar.s;
        return bundle != null && i(diiVar) && xvr.u(bundle) == 6;
    }

    public static CastDevice k(dii diiVar) {
        Bundle bundle;
        if (diiVar == null || (bundle = diiVar.s) == null) {
            return null;
        }
        return CastDevice.c(bundle);
    }

    public static boolean m(dii diiVar) {
        return e(k(diiVar));
    }

    public static boolean n(dii diiVar) {
        return k(diiVar) != null;
    }

    private static boolean o(dii diiVar, String str) {
        Iterator it = diiVar.l.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final int l(dii diiVar) {
        String str = this.e;
        if (!TextUtils.isEmpty(str)) {
            Iterator it = diiVar.l.iterator();
            while (it.hasNext()) {
                if (((IntentFilter) it.next()).hasCategory(kro.x(str))) {
                    return 4;
                }
            }
        }
        if (g(diiVar)) {
            return 2;
        }
        if (h(diiVar)) {
            return 3;
        }
        return f(diiVar) ? 5 : 1;
    }
}
