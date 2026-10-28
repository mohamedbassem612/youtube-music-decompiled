package defpackage;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aag {
    public static Object a(String str, aey aeyVar) {
        try {
            return aeyVar.a();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new xw(a.bT(str, "Remote ", " call failed"), e2);
        }
    }

    public static void b(IOnDoneCallback iOnDoneCallback, String str, aex aexVar) {
        afi.b(new bf(iOnDoneCallback, str, aexVar, 4, (short[]) null));
    }

    public static void c(boc bocVar, String str, aex aexVar) {
        afi.b(new bf(bocVar, aexVar, str, 3, (char[]) null));
    }

    public static void d(boc bocVar, IOnDoneCallback iOnDoneCallback, String str, aex aexVar) {
        afi.b(new aew((Object) bocVar, (Object) iOnDoneCallback, str, (Object) aexVar, 0));
    }

    public static void e(String str, aey aeyVar) {
        try {
            a(str, aeyVar);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Throwable th) {
        e(String.valueOf(str).concat(" onFailure"), new aev(iOnDoneCallback, th, str, 0));
    }

    public static void g(IOnDoneCallback iOnDoneCallback, String str, Object obj) {
        e(str.concat(" onSuccess"), new aev(iOnDoneCallback, obj, str, 1));
    }

    public static final atn h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aamo aamoVar = (aamo) arrayList.get(i);
                boolean z = aamoVar.a;
                arrayList3.add(aamoVar);
            }
        }
        if (!arrayList2.isEmpty()) {
        }
        return new atn(iconCompat, charSequence, pendingIntent, bundle, arrayList3.isEmpty() ? null : (aamo[]) arrayList3.toArray(new aamo[arrayList3.size()]));
    }

    public static int i(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }
}
