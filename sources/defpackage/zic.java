package defpackage;

import android.os.Build;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zic {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("[&:,]");

    public static double a(long j, long j2) {
        if (j2 != 0) {
            return j / j2;
        }
        zhr.a(zhq.UTIL, "timescale=0");
        return 0.0d;
    }

    public static long b(long j, long j2) {
        if (j == 0) {
            return 0L;
        }
        if (j2 == 0) {
            zhr.a(zhq.UTIL, "timescale=0");
            return 0L;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (long) ((j * 1000000.0d) / j2);
    }

    public static wgs c(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            if (f(formatIdOuterClass$FormatId, wgsVar)) {
                return wgsVar;
            }
        }
        return null;
    }

    public static String d(String str, boolean z) {
        if (str != null) {
            return z ? b.matcher(str).replaceAll("_") : str.replaceAll("[&:,]", "_");
        }
        return "";
    }

    public static ArrayList e(wgs[] wgsVarArr) {
        ArrayList arrayList = new ArrayList();
        for (wgs wgsVar : wgsVarArr) {
            arrayList.add(wgsVar.o());
        }
        return arrayList;
    }

    public static boolean f(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, wgs wgsVar) {
        return formatIdOuterClass$FormatId.c == wgsVar.e() && formatIdOuterClass$FormatId.d == wgsVar.k() && formatIdOuterClass$FormatId.e.equals(wgsVar.C());
    }

    public static boolean g(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2) {
        return formatIdOuterClass$FormatId.c == formatIdOuterClass$FormatId2.c && formatIdOuterClass$FormatId.d == formatIdOuterClass$FormatId2.d && formatIdOuterClass$FormatId.e.equals(formatIdOuterClass$FormatId2.e);
    }

    public static boolean h(int i, int i2) {
        return (i & i2) > 0;
    }

    public static boolean i() {
        return Build.SUPPORTED_64_BIT_ABIS.length > 0;
    }

    public static int j(boolean z) {
        return z ? 16 : 0;
    }

    public static void k(int i, long j, xeu xeuVar) {
        aihf aihfVarCreateBuilder = aoqr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoqr aoqrVar = (aoqr) aihfVarCreateBuilder.instance;
        aoqrVar.b |= 4;
        aoqrVar.d = j;
        aihfVarCreateBuilder.copyOnWrite();
        aoqr aoqrVar2 = (aoqr) aihfVarCreateBuilder.instance;
        aoqrVar2.c = i - 1;
        aoqrVar2.b |= 1;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.PLAYER_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            aoqr aoqrVar3 = (aoqr) aihfVarCreateBuilder.build();
            aoqrVar3.getClass();
            alouVar.d = aoqrVar3;
            alouVar.c = 410;
            xeuVar.b((alou) alosVar.build());
        }
        zhq zhqVar = zhq.ABR;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        long j2 = j / 1000;
    }
}
