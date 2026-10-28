package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zgo {
    public static final agkz a = agkz.q("docid", "referrer");

    public static Uri a(tyt tytVar) {
        agqr it = a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (tytVar.b(str) != null) {
                tytVar.e(str, "(scrubbed)");
            }
        }
        return tytVar.a();
    }

    public static String b(tyt tytVar) {
        String strB = tytVar.b("fexp");
        String strReplace = strB != null ? strB.replace("%2C", ",") : "";
        tytVar.h("fexp");
        return strReplace;
    }
}
