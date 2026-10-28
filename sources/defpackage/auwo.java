package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auwo {
    public static final omm a;
    private static volatile String b;
    private static final qmj c;

    static {
        qmk qmkVar = new qmk(new ampw(6));
        qmkVar.b(new agqj("PLAY_BILLING_LIBRARY"));
        qmj qmjVarA = qmkVar.a();
        c = qmjVarA;
        a = new omm("com.android.billingclient", qmjVarA);
        b = null;
    }

    private auwo() {
    }

    public static String a(Context context) {
        String str = b;
        if (str == null) {
            synchronized (auwo.class) {
                str = b;
                if (str == null) {
                    String strE = qke.e(context, "com.android.billingclient");
                    b = strE;
                    str = strE;
                }
            }
        }
        return str;
    }
}
