package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xku {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/logging/url/UrlLogger");
    private final zxj c;
    private final zzj d;
    private final String e;
    public final Map a = new HashMap();
    private final xkt f = new xkt(this);

    public xku(zxj zxjVar, zzj zzjVar) {
        zxjVar.getClass();
        this.c = zxjVar;
        zzjVar.getClass();
        this.d = zzjVar;
        this.e = "iv";
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amuo amuoVar = (amuo) it.next();
            if (amuoVar != null && (amuoVar.b & 1) != 0) {
                try {
                    Uri uriA = this.d.a(Uri.parse(amuoVar.c), this.f);
                    if (uriA != null) {
                        zxj zxjVar = this.c;
                        zxi zxiVar = new zxi(1, this.e);
                        zxiVar.b(uriA);
                        zxiVar.k = new wjk((amun[]) amuoVar.d.toArray(new amun[0]), 2);
                        zxiVar.a(tok.HTTP_PING_URL_LOGGER);
                        zxjVar.b(null, zxiVar, zzl.b);
                    }
                } catch (tzn unused) {
                    ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/logging/url/UrlLogger", "pingUrl", 79, "UrlLogger.java")).t("Error substituting macros in URI.");
                }
            }
        }
    }
}
