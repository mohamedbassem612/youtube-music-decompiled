package defpackage;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import android.widget.RemoteViews;
import com.google.android.libraries.blocks.runtime.NativeStreamWriter;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.concurrent.ConcurrentMap;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mdu {
    public static volatile mdu a;

    public static boolean a(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static void b(avlh avlhVar, mbb mbbVar) {
        lfa lfaVar = new lfa(avlhVar, mbbVar, 10, (char[]) null);
        NativeStreamWriter nativeStreamWriter = ((RuntimeStreamWriter) mbbVar).a;
        nativeStreamWriter.nativeOnRead(nativeStreamWriter.a, lfaVar);
    }

    public static Set c(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        int length = clsArr.length;
        for (int i = 0; i < 4; i++) {
            for (Field field : clsArr[i].getDeclaredFields()) {
                if (field.isAnnotationPresent(cls) && field.getType().equals(String.class)) {
                    try {
                        hashSet.add((String) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    public static final boolean d(Activity activity, awqg awqgVar) {
        Object objInvoke;
        if (Build.VERSION.SDK_INT < 37) {
            throw new IllegalStateException("isProjectedToCarDisplay requires SDK 37 (C+)");
        }
        boolean z = b.a;
        if (Build.VERSION.SDK_INT < 36 || a.at() < 3700002) {
            if (!b.a) {
                b.a();
            }
            if (b.b) {
                objInvoke = awqgVar.invoke(Integer.valueOf(activity.getDeviceId()));
                if (objInvoke != null && pw$$ExternalSyntheticApiModelOutline0.m919m(objInvoke).getDeviceProfile() == 101) {
                    return true;
                }
            } else {
                try {
                    int displayId = activity.getDisplay().getDisplayId();
                    int i = activity.getResources().getConfiguration().uiMode & 15;
                    if (displayId != 0 && i == 3) {
                        return true;
                    }
                } catch (UnsupportedOperationException e) {
                    throw new IllegalArgumentException("Activity must have a display", e);
                }
            }
        } else {
            objInvoke = awqgVar.invoke(Integer.valueOf(activity.getDeviceId()));
            if (objInvoke != null) {
                return true;
            }
        }
        return false;
    }

    public static final RemoteViews e(Context context, AppWidgetManager appWidgetManager, int i, awqg awqgVar) {
        context.getClass();
        appWidgetManager.getClass();
        Resources resources = context.getResources();
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
        appWidgetOptions.getClass();
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 31 ? appWidgetOptions.getParcelableArrayList("appWidgetSizes") : null;
        if (Build.VERSION.SDK_INT < 31 || parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            resources.getClass();
            return new RemoteViews((RemoteViews) awqgVar.invoke(f(appWidgetOptions, false)), (RemoteViews) awqgVar.invoke(f(appWidgetOptions, true)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(parcelableArrayList, 10)), 16));
        for (Object obj : parcelableArrayList) {
            SizeF sizeF = (SizeF) obj;
            sizeF.getWidth();
            sizeF.getHeight();
            sizeF.getClass();
            linkedHashMap.put(obj, (RemoteViews) awqgVar.invoke(g(sizeF)));
        }
        return new RemoteViews(linkedHashMap);
    }

    public static final mar f(Bundle bundle, boolean z) {
        awml awmlVar = z ? new awml("appWidgetMinWidth", "appWidgetMaxHeight") : new awml("appWidgetMaxWidth", "appWidgetMinHeight");
        return h(bundle.getInt((String) awmlVar.a), bundle.getInt((String) awmlVar.b));
    }

    public static final mar g(SizeF sizeF) {
        return h(avkz.h(sizeF.getWidth()), avkz.h(sizeF.getHeight()));
    }

    public static final mar h(int i, int i2) {
        return new mar(i, i2);
    }

    public static final void i(ListenableFuture listenableFuture, aheh ahehVar) {
        ahng.x(listenableFuture, ahehVar, MoreExecutors.directExecutor());
    }

    public static final map j(Context context) {
        context.getClass();
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(maj.a, -1, new iuk(new hol(context, 15), 8));
        objComputeIfAbsent.getClass();
        return (map) objComputeIfAbsent;
    }

    public static final map k(Context context, int i) {
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(maj.a, Integer.valueOf(i), new iuk(new mai(context, i, 0), 7));
        objComputeIfAbsent.getClass();
        return (map) objComputeIfAbsent;
    }

    public static final ListenableFuture l(qrx qrxVar, agek agekVar) {
        return qrxVar.a(agekVar, MoreExecutors.directExecutor());
    }

    public static final ListenableFuture m(ListenableFuture listenableFuture, agek agekVar) {
        return ahcs.e(listenableFuture, agekVar, MoreExecutors.directExecutor());
    }

    public static void n(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean o(byte b) {
        return b >= 0;
    }

    public static String p(lxa lxaVar) {
        return a.ad(lxaVar.j());
    }

    public static lym q(Object obj, Object obj2) {
        lym lymVarA = (lym) obj;
        lym lymVar = (lym) obj2;
        if (!lymVar.isEmpty()) {
            if (!lymVarA.b) {
                lymVarA = lymVarA.a();
            }
            lymVarA.b();
            if (!lymVar.isEmpty()) {
                lymVarA.putAll(lymVar);
            }
        }
        return lymVarA;
    }

    public static final sdo r(Object obj) {
        throw null;
    }

    public static void s(lxh lxhVar, sdo sdoVar, Object obj, Object obj2) {
        Object obj3 = sdoVar.d;
        lxn.e(lxhVar, 1, obj);
        Object obj4 = sdoVar.b;
        lxn.e(lxhVar, 2, obj2);
    }

    public static int t(sdo sdoVar) {
        Object obj = sdoVar.d;
        int iD = lxn.d(1);
        Object obj2 = sdoVar.b;
        return iD + lxn.d(2);
    }
}
