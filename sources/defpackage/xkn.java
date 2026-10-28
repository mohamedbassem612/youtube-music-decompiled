package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xkn {
    public final mbc a;
    public final zwb b;
    public final awmd c;
    public final Context d;
    public final xkp e;
    public final awmd f;
    public final boolean g;
    public final agrf h;
    public final Executor i;
    public final ci j;
    private final xeu k;
    private final awmd l;
    private final awmd m;
    private final alol n;
    private final kii o;
    private final awmi p;

    public xkn(xeu xeuVar, mbc mbcVar, awmd awmdVar, awmd awmdVar2, zwb zwbVar, ci ciVar, alol alolVar, awmd awmdVar3, abxu abxuVar, kii kiiVar, Context context, tym tymVar, xkp xkpVar, awmd awmdVar4, boolean z) {
        xeuVar.getClass();
        mbcVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        zwbVar.getClass();
        ciVar.getClass();
        awmdVar3.getClass();
        abxuVar.getClass();
        context.getClass();
        tymVar.getClass();
        xkpVar.getClass();
        awmdVar4.getClass();
        this.k = xeuVar;
        this.a = mbcVar;
        this.l = awmdVar;
        this.m = awmdVar2;
        this.b = zwbVar;
        this.j = ciVar;
        this.n = alolVar;
        this.c = awmdVar3;
        this.o = kiiVar;
        this.d = context;
        this.e = xkpVar;
        this.f = awmdVar4;
        this.g = z;
        this.h = agrf.h("com/google/android/libraries/youtube/logging/reliability/DefaultLoggingReliabilityProber");
        this.i = new ahfg((Executor) abxuVar.r(5));
        this.p = new awmp(new pbm(this, 13));
    }

    private final String c() {
        return (String) this.p.a();
    }

    private final void d(int i, long j, boolean z, long j2, String str, zwa zwaVar, String str2, String str3) {
        Uri uri = Uri.parse("https://www.youtube.com/api/stats/reliability_probe");
        uri.getClass();
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("scenario", String.valueOf(i - 2)).appendQueryParameter("clientTimestampMs", String.valueOf(j));
        String lowerCase = this.n.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("c", lowerCase).appendQueryParameter("cver", c()).appendQueryParameter("delayed", true != z ? "0" : "1").appendQueryParameter("seq", String.valueOf(j2)).appendQueryParameter("sid", str);
        if (str3.length() > 0) {
            builderAppendQueryParameter2.appendQueryParameter("fexp", str3);
        }
        Uri uriBuild = builderAppendQueryParameter2.build();
        Object objIo = this.l.io();
        objIo.getClass();
        zxi zxiVar = new zxi(1, true != z ? "direct_reliability_probe" : "delayed_reliability_probe");
        zxiVar.b(uriBuild);
        zxiVar.d = z;
        zxiVar.g = zwaVar;
        zxiVar.h = str2;
        zxiVar.a(tok.HTTP_PING_VIDEO_STATS_2_CLIENT);
        ((zxj) objIo).b((zrx) this.m.io(), zxiVar, new xkj(0));
    }

    public final void a(int i) {
        this.i.execute(afwl.i(new rir(this, i, 7)));
    }

    public final void b(int i, long j, long j2, String str, zwa zwaVar, String str2, List list) {
        int[] iArrAz;
        List list2;
        xkn xknVar = this;
        long j3 = j2;
        String str3 = str;
        if (list != null) {
            iArrAz = atqq.az(list);
            list2 = list;
        } else {
            iArrAz = new int[0];
            list2 = awno.a;
        }
        int[] iArr = iArrAz;
        String strAD = atqq.aD(list2, ",", null, null, null, 62);
        List listAq = atqq.aq(xkm.e);
        Collections.shuffle(listAq);
        Iterator it = listAq.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((xkm) it.next()).ordinal();
            if (iOrdinal == 0) {
                try {
                    aihf aihfVarCreateBuilder = atpy.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aihfVarCreateBuilder.copyOnWrite();
                    atpy atpyVar = (atpy) aihfVarCreateBuilder.instance;
                    atpyVar.c = i - 2;
                    atpyVar.b |= 2;
                    aihfVarCreateBuilder.copyOnWrite();
                    atpy atpyVar2 = (atpy) aihfVarCreateBuilder.instance;
                    atpyVar2.b |= 4;
                    atpyVar2.d = j;
                    String strC = xknVar.c();
                    strC.getClass();
                    aihfVarCreateBuilder.copyOnWrite();
                    atpy atpyVar3 = (atpy) aihfVarCreateBuilder.instance;
                    atpyVar3.b |= 8;
                    atpyVar3.e = strC;
                    alol alolVar = xknVar.n;
                    aihfVarCreateBuilder.copyOnWrite();
                    atpy atpyVar4 = (atpy) aihfVarCreateBuilder.instance;
                    atpyVar4.f = alolVar.aO;
                    atpyVar4.b |= 16;
                    aihfVarCreateBuilder.copyOnWrite();
                    atpy atpyVar5 = (atpy) aihfVarCreateBuilder.instance;
                    atpyVar5.b |= 32;
                    atpyVar5.g = j3;
                    aihfVarCreateBuilder.copyOnWrite();
                    atpy atpyVar6 = (atpy) aihfVarCreateBuilder.instance;
                    atpyVar6.b |= 64;
                    atpyVar6.h = str3;
                    aihn aihnVarBuild = aihfVarCreateBuilder.build();
                    aihnVarBuild.getClass();
                    kih kihVarJ = xknVar.o.j((atpy) aihnVarBuild, mea.a(xknVar.d, new mdp(1993263995)));
                    kihVarJ.j(iArr);
                    kihVarJ.e();
                } catch (Exception e) {
                    ((agrc) ((agrc) xknVar.h.b()).j(e).k("com/google/android/libraries/youtube/logging/reliability/DefaultLoggingReliabilityProber", "logToClearcut", 312, "DefaultLoggingReliabilityProber.kt")).t("Failed to send Clearcut reliability probe");
                }
            } else if (iOrdinal == 1) {
                xknVar = this;
                j3 = j2;
                str3 = str;
                xknVar.d(i, j, true, j3, str3, zwaVar, str2, strAD);
            } else if (iOrdinal == 2) {
                xknVar.d(i, j, false, j3, str3, zwaVar, str2, strAD);
                xknVar = this;
                j3 = j2;
                str3 = str;
            } else {
                if (iOrdinal != 3) {
                    throw new awmj();
                }
                aihf aihfVarCreateBuilder2 = amul.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amul amulVar = (amul) aihfVarCreateBuilder2.instance;
                amulVar.c = i - 2;
                amulVar.b |= 2;
                aihfVarCreateBuilder2.copyOnWrite();
                amul amulVar2 = (amul) aihfVarCreateBuilder2.instance;
                amulVar2.b |= 4;
                amulVar2.d = j3;
                aihfVarCreateBuilder2.copyOnWrite();
                amul amulVar3 = (amul) aihfVarCreateBuilder2.instance;
                amulVar3.b |= 8;
                amulVar3.e = str3;
                aihfVarCreateBuilder2.getClass();
                xeu xeuVar = xknVar.k;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder2, alot.LOGGING_RELIABILITY_PROBE);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    amul amulVar4 = (amul) aihfVarCreateBuilder2.build();
                    amulVar4.getClass();
                    alouVar.d = amulVar4;
                    alouVar.c = 540;
                    aihn aihnVarBuild2 = alosVar.build();
                    aihnVarBuild2.getClass();
                    xeuVar.b((alou) aihnVarBuild2);
                }
            }
        }
    }
}
