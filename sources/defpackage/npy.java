package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npy {
    private static final Map a = new HashMap();

    npy() {
    }

    public static int a(Context context, String str, String str2) {
        int iIntValue;
        Map map = a;
        synchronized (map) {
            String str3 = str + str2;
            Integer num = (Integer) map.get(str3);
            if (num == null) {
                iIntValue = context.getResources().getIdentifier(str2, str, context.getPackageName());
                map.put(str3, Integer.valueOf(iIntValue));
            } else {
                iIntValue = num.intValue();
            }
        }
        return iIntValue;
    }

    public static int b(Context context, nci nciVar) {
        ncl nclVarE = e(nciVar);
        if (nclVarE != null) {
            return c(context, nclVarE);
        }
        return 0;
    }

    public static int c(Context context, ncl nclVar) {
        if (nclVar.m()) {
            ncf ncfVarI = nclVar.i();
            if (ncfVarI.i()) {
                return a(context, "drawable", ncfVarI.h());
            }
        }
        return 0;
    }

    public static int d(Context context, asnm asnmVar) {
        int iBt;
        for (int i = 0; i < asnmVar.c.size(); i++) {
            asno asnoVar = (asno) asnmVar.c.get(i);
            int i2 = asnoVar.c;
            if (i2 == 3) {
                asnk asnkVar = i2 == 3 ? (asnk) asnoVar.d : asnk.a;
                if ((asnkVar.b & 2) != 0) {
                    String str = asnkVar.c;
                    int iBt2 = a.bt(asnmVar.f);
                    return a(context, ((iBt2 == 0 || iBt2 != 5) && ((iBt = a.bt(asnmVar.f)) == 0 || iBt != 4)) ? "drawable" : "raw", str);
                }
            }
        }
        return 0;
    }

    public static ncl e(nci nciVar) {
        int iG = nciVar.g();
        for (int i = 0; i < iG; i++) {
            ncl nclVarI = nciVar.i(i);
            if (nclVarI.m() && nclVarI.i().i()) {
                return nclVarI;
            }
        }
        return null;
    }

    public static boolean f(Context context, nci nciVar) {
        try {
            Drawable drawable = context.getResources().getDrawable(b(context, nciVar), null);
            return (drawable == null || (drawable instanceof BitmapDrawable) || (drawable instanceof NinePatchDrawable)) ? false : true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
