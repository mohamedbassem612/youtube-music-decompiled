package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acks {
    private final Context a;
    private final acko[] b;
    private final Map c;

    static {
        Typeface.create(Typeface.SANS_SERIF, 0);
    }

    public acks(Context context, aunn aunnVar, mbc mbcVar, Set set) {
        context.getClass();
        aunnVar.getClass();
        mbcVar.getClass();
        set.getClass();
        this.a = context;
        this.b = new acko[64];
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            activityManager.isLowRamDevice();
        }
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            acko ackoVar = (acko) it.next();
            int iA = ackoVar.a();
            acko[] ackoVarArr = this.b;
            if (ackoVarArr[iA] != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ackoVarArr[iA] = ackoVar;
            if (ackoVar.b().length() > 0) {
                String strB = ackoVar.b();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = strB.toLowerCase(locale);
                lowerCase.getClass();
                if (((acko) map.put(lowerCase, ackoVar)) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        }
        this.c = map;
    }

    private final acko c(int i) {
        acko ackoVar = this.b[i];
        if (ackoVar != null) {
            return ackoVar;
        }
        String strA = ackn.a(i);
        if (strA == null || strA.length() == 0 || strA.length() == 0) {
            return null;
        }
        Map map = this.c;
        acko ackoVar2 = (acko) map.get(strA);
        if (ackoVar2 != null) {
            return ackoVar2;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = strA.toLowerCase(locale);
        lowerCase.getClass();
        return (acko) map.get(lowerCase);
    }

    public final Typeface a(Context context, int i, int i2, int i3) {
        Typeface typefaceC;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        acko ackoVarC = c(i);
        return (ackoVarC == null || (typefaceC = ackoVarC.c(context, i2, i3)) == null) ? ackp.a(context, ackn.a(i), i3) : typefaceC;
    }

    public final void b(Context context, int i) {
        context.getClass();
        if (c(i) != null) {
            context.getApplicationContext();
        }
    }
}
