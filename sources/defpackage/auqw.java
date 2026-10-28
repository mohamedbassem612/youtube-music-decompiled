package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auqw {
    public static final omm a;
    private static volatile String b;
    private static final qmj c;

    static {
        qmk qmkVar = new qmk(new ampw(4));
        qmkVar.b(agkz.r("DROIDGUARD", "DROIDGUARD_ONDEVICE", "STREAMZ_DROIDGUARD"));
        qmj qmjVarA = qmkVar.a();
        c = qmjVarA;
        a = new omm("com.google.android.gms.droidguardclient", qmjVarA);
        b = null;
    }

    private auqw() {
    }

    public static String a(Context context) {
        String str = b;
        if (str == null) {
            synchronized (auqw.class) {
                str = b;
                if (str == null) {
                    String strE = qke.e(context, "com.google.android.gms.droidguardclient");
                    b = strE;
                    str = strE;
                }
            }
        }
        return str;
    }
}
