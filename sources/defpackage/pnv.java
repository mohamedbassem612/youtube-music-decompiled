package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pnv {
    private static volatile pnw a;

    static {
        agsn.h("GnpSdk");
        a = null;
    }

    public static pnw a(Context context) {
        pnw pnwVarA;
        if (a == null) {
            Object applicationContext = context.getApplicationContext();
            if (applicationContext instanceof gdl) {
                pnwVarA = (pnw) ((gdl) applicationContext).a();
            } else {
                try {
                    try {
                        pnwVarA = (pnw) aguu.av(context, pnw.class);
                    } catch (IllegalStateException unused) {
                        pnwVarA = ((pnx) aguu.av(context, pnx.class)).a();
                    }
                } catch (IllegalStateException unused2) {
                    throw new IllegalStateException("Unable to get GnpComponent from host app: ".concat(String.valueOf(context.getPackageName())));
                }
            }
            a = pnwVarA;
        }
        pxh pxhVarN = a.N();
        if (pxhVarN != null) {
            pxhVarN.a(context);
        }
        return a;
    }
}
