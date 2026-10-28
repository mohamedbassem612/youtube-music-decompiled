package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xsa {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/RouteUtil");
    public final Executor b;
    public final abxv d;
    public final dov e;
    private final awmd g;
    private final String f = "2DB7CC49";
    final Handler c = new Handler(Looper.getMainLooper());

    public xsa(awmd awmdVar, abxv abxvVar, dov dovVar, Executor executor) {
        this.g = awmdVar;
        this.d = abxvVar;
        this.e = dovVar;
        this.b = executor;
    }

    public static boolean b(String str, String str2) {
        if (str.lastIndexOf(":") == str.length() - 1 || str2.lastIndexOf(":") == str2.length() - 1) {
            return false;
        }
        return str.substring(str.lastIndexOf(":") + 1).replace("-", "").equals(str2.substring(str2.lastIndexOf(":") + 1).replace("-", ""));
    }

    public static boolean e(dii diiVar) {
        Bundle bundle = diiVar.s;
        return bundle != null && h(diiVar) && xvr.u(bundle) == 4;
    }

    public static boolean g(dii diiVar) {
        Bundle bundle = diiVar.s;
        return bundle != null && h(diiVar) && xvr.u(bundle) == 3;
    }

    public static boolean h(dii diiVar) {
        Iterator it = diiVar.l.iterator();
        while (it.hasNext()) {
            Iterator<String> itCategoriesIterator = ((IntentFilter) it.next()).categoriesIterator();
            if (itCategoriesIterator != null) {
                while (itCategoriesIterator.hasNext()) {
                    if (itCategoriesIterator.next().contains("MDX_MEDIA_ROUTE_CONTROL_CATEGORY_")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean i(dii diiVar) {
        Bundle bundle = diiVar.s;
        return bundle != null && h(diiVar) && xvr.u(bundle) == 6;
    }

    public static final Optional k(List list, boolean z, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dii diiVar = (dii) it.next();
            if (!z || !e(diiVar)) {
                if (b(str, diiVar.d)) {
                    return Optional.of(diiVar);
                }
            }
        }
        return Optional.empty();
    }

    public final Optional a(String str, Context context) {
        Optional optionalM = m(str);
        return true == optionalM.isPresent() ? Optional.ofNullable(((dii) optionalM.get()).e) : optionalM;
    }

    final boolean c(dii diiVar) {
        Iterator it = diiVar.l.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory("android.media.intent.category.LIVE_AUDIO")) {
                if (!diiVar.equals(dij.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(dii diiVar) {
        String str = this.f;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = diiVar.l.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(kro.x(str))) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(dii diiVar) {
        return diiVar.k() || c(diiVar);
    }

    public final boolean j() {
        return f(dij.j());
    }

    public final List l(boolean z, boolean z2) {
        abxv abxvVar = this.d;
        if (abxvVar == null) {
            return new ArrayList();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return abxvVar.m(z, z2);
        }
        List listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        this.c.post(new xrz(listSynchronizedList, countDownLatch, abxvVar, z, z2));
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "MDX.RouteUtil")).j(e)).k("com/google/android/libraries/youtube/mdx/mediaroute/RouteUtil", "getThreadSafeAvailableMediaRoutes", (char) 483, "RouteUtil.java")).t("Timed out getting available media routes.");
        }
        return listSynchronizedList;
    }

    public final Optional m(String str) {
        return Collection.EL.stream(l(false, false)).filter(new xdo(str, 3)).findFirst();
    }
}
