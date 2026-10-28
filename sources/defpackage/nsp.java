package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nsp {
    public static long a(oip oipVar) {
        if (oipVar.l == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(oipVar.l);
    }

    public static Uri b(Uri uri, oin oinVar) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (oinVar.p.isEmpty()) {
            String str = oinVar.d;
            builderBuildUpon.appendPath(str.substring(str.lastIndexOf("/") + 1));
        } else {
            for (String str2 : oinVar.p.split("/", -1)) {
                if (!str2.isEmpty()) {
                    builderBuildUpon.appendPath(str2);
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static Uri c(Context context, agev agevVar, oip oipVar) {
        String str = !oipVar.w.isEmpty() ? oipVar.w : oipVar.d;
        int iAS = a.aS(oipVar.j);
        if (iAS == 0) {
            iAS = 1;
        }
        return qnl.ba(context, agevVar).buildUpon().appendPath("links").build().buildUpon().appendPath(qnl.bd(iAS)).build().buildUpon().appendPath(str).build();
    }

    public static oip d(oip oipVar, long j) {
        oio oioVar = oipVar.c;
        if (oioVar == null) {
            oioVar = oio.a;
        }
        aihf builder = oioVar.toBuilder();
        builder.copyOnWrite();
        oio oioVar2 = (oio) builder.instance;
        oioVar2.b |= 1;
        oioVar2.c = j;
        oio oioVar3 = (oio) builder.build();
        aihf builder2 = oipVar.toBuilder();
        builder2.copyOnWrite();
        oip oipVar2 = (oip) builder2.instance;
        oioVar3.getClass();
        oipVar2.c = oioVar3;
        oipVar2.b |= 1;
        return (oip) builder2.build();
    }

    public static String e(oin oinVar) {
        return f(oinVar) ? oinVar.i : oinVar.g;
    }

    public static boolean f(oin oinVar) {
        if ((oinVar.b & 32) != 0) {
            atyn atynVar = oinVar.h;
            if (atynVar == null) {
                atynVar = atyn.a;
            }
            Iterator it = atynVar.b.iterator();
            while (it.hasNext()) {
                if (((atym) it.next()).b == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public static boolean g(String str, agkz agkzVar) {
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(58);
        ahno.R((iIndexOf ^ (-1)) >>> 31, "Invalid url: %s", str);
        String strSubstring = str.substring(0, iIndexOf);
        agqr it = agkzVar.iterator();
        while (it.hasNext()) {
            if (ahno.ag(strSubstring, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(oin oinVar) {
        return g(oinVar.d, new agqj("inlinefile"));
    }

    public static boolean i(oip oipVar) {
        int iAU;
        if (!oipVar.n) {
            return false;
        }
        Iterator it = oipVar.o.iterator();
        do {
            if (!it.hasNext()) {
                return true;
            }
            iAU = a.aU(((oin) it.next()).m);
        } while ((iAU != 0 ? iAU : 1) != 2);
        return false;
    }

    public static boolean j(oin oinVar) {
        return g(oinVar.d, agkz.q("file", "asset"));
    }

    public static boolean k(long j, omj omjVar) {
        return j <= omjVar.f();
    }

    public static void l(Context context, agev agevVar, oip oipVar, ayq ayqVar) {
        Uri uriC = c(context, agevVar, oipVar);
        if (ayqVar.ac(uriC)) {
            qqt qqtVar = new qqt();
            qqtVar.a = true;
        }
    }
}
