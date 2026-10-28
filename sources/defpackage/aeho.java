package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeho {
    public static final agkz a = agkz.u(-6, -2, -7, -8, -15, -1, new Integer[0]);
    private static final String b = "aeho";

    static {
        agkz.q(500, 503);
    }

    private aeho() {
    }

    public static int a(Uri uri) {
        int port = uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = uri.getScheme();
        return (scheme == null || !ahno.ag("https", scheme)) ? -1 : 443;
    }

    public static ajwo b(ajwo ajwoVar, arkf arkfVar, anhh anhhVar) {
        if (arkfVar != arkf.WEB_VIEW_USE_CASE_GAMEPLAY_MINI_APP || (anhhVar.b & 4) == 0) {
            return ajwoVar;
        }
        String str = anhhVar.e;
        aihf aihfVarCreateBuilder = akzk.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder.instance;
        anhhVar.getClass();
        akzkVar.m = anhhVar;
        akzkVar.b |= 67108864;
        akzk akzkVar2 = (akzk) aihfVarCreateBuilder.build();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amtu.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            aihl aihlVar = amtu.b;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aihf builder = ((amtu) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
            builder.copyOnWrite();
            amtu amtuVar = (amtu) builder.instance;
            str.getClass();
            amtuVar.c |= 16;
            amtuVar.h = str;
            builder.copyOnWrite();
            amtu amtuVar2 = (amtu) builder.instance;
            akzkVar2.getClass();
            amtuVar2.g = akzkVar2;
            amtuVar2.c |= 8;
            aihhVar.e(aihlVar, (amtu) builder.build());
            return (ajwo) aihhVar.build();
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aplv.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
            aihl aihlVar2 = aplv.b;
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            aihf builder2 = ((aplv) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).toBuilder();
            aihf aihfVarCreateBuilder2 = ajgs.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ajgs ajgsVar = (ajgs) aihfVarCreateBuilder2.instance;
            str.getClass();
            ajgsVar.b = 11;
            ajgsVar.c = str;
            builder2.ce(aihfVarCreateBuilder2);
            aihhVar2.e(aihlVar2, (aplv) builder2.build());
            return (ajwo) aihhVar2.build();
        }
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajwm.b);
        ajwoVar.c(aihlVarCheckIsLite5);
        if (!ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
            return ajwoVar;
        }
        aihf aihfVarCreateBuilder3 = ajwm.a.createBuilder();
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajwm.b);
        ajwoVar.c(aihlVarCheckIsLite6);
        Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
        for (ajwo ajwoVar2 : ((ajwm) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).c) {
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(amtu.b);
            ajwoVar2.c(aihlVarCheckIsLite7);
            if (ajwoVar2.j.n(aihlVarCheckIsLite7.d)) {
                aihh aihhVar3 = (aihh) ajwoVar2.toBuilder();
                aihl aihlVar3 = amtu.b;
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar3);
                ajwoVar2.c(aihlVarCheckIsLite8);
                Object objK4 = ajwoVar2.j.k(aihlVarCheckIsLite8.d);
                aihf builder3 = ((amtu) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4))).toBuilder();
                builder3.copyOnWrite();
                amtu amtuVar3 = (amtu) builder3.instance;
                str.getClass();
                amtuVar3.c |= 16;
                amtuVar3.h = str;
                builder3.copyOnWrite();
                amtu amtuVar4 = (amtu) builder3.instance;
                akzkVar2.getClass();
                amtuVar4.g = akzkVar2;
                amtuVar4.c |= 8;
                aihhVar3.e(aihlVar3, (amtu) builder3.build());
                aihfVarCreateBuilder3.aP((ajwo) aihhVar3.build());
            } else {
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aplv.b);
                ajwoVar2.c(aihlVarCheckIsLite9);
                if (ajwoVar2.j.n(aihlVarCheckIsLite9.d)) {
                    aihh aihhVar4 = (aihh) ajwoVar2.toBuilder();
                    aihl aihlVar4 = aplv.b;
                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar4);
                    ajwoVar2.c(aihlVarCheckIsLite10);
                    Object objK5 = ajwoVar2.j.k(aihlVarCheckIsLite10.d);
                    aihf builder4 = ((aplv) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5))).toBuilder();
                    aihf aihfVarCreateBuilder4 = ajgs.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    ajgs ajgsVar2 = (ajgs) aihfVarCreateBuilder4.instance;
                    str.getClass();
                    ajgsVar2.b = 11;
                    ajgsVar2.c = str;
                    builder4.ce(aihfVarCreateBuilder4);
                    aihhVar4.e(aihlVar4, (aplv) builder4.build());
                    aihfVarCreateBuilder3.aP((ajwo) aihhVar4.build());
                } else {
                    aihfVarCreateBuilder3.aP(ajwoVar2);
                }
            }
        }
        aihh aihhVar5 = (aihh) ajwoVar.toBuilder();
        aihhVar5.e(ajwm.b, (ajwm) aihfVarCreateBuilder3.build());
        return (ajwo) aihhVar5.build();
    }

    public static void c(wby wbyVar, String str, String str2) {
        if (str.isEmpty() || str2.isEmpty()) {
            return;
        }
        arka arkaVarE = arkc.e(str);
        aihf aihfVar = arkaVarE.a;
        aihfVar.copyOnWrite();
        arkd arkdVar = (arkd) aihfVar.instance;
        arkd arkdVar2 = arkd.a;
        str2.getClass();
        arkdVar.b |= 32;
        arkdVar.h = str2;
        byte[] bArrC = arkaVarE.an().c();
        aihf aihfVarCreateBuilder = akvd.a.createBuilder();
        aikh aikhVar = aikh.a;
        aikg aikgVar = new aikg();
        aikgVar.d(6);
        affc affcVarA = aikgVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
        affcVarA.getClass();
        akvdVar.d = affcVarA;
        akvdVar.b |= 2;
        akvd akvdVar2 = (akvd) aihfVarCreateBuilder.build();
        wer werVarE = wbyVar.e();
        werVarE.k(str, akvdVar2, bArrC);
        werVarE.b();
    }

    public static void d(wby wbyVar, String str, String str2, boolean z, boolean z2, boolean z3) {
        if (str.isEmpty()) {
            return;
        }
        Uri uri = Uri.parse(str2);
        arka arkaVarE = arkc.e(str);
        aihf aihfVar = arkaVarE.a;
        aihfVar.copyOnWrite();
        arkd arkdVar = (arkd) aihfVar.instance;
        arkd arkdVar2 = arkd.a;
        str2.getClass();
        arkdVar.b |= 2;
        arkdVar.d = str2;
        arkaVarE.am(Boolean.valueOf(z2));
        String strZ = ahno.Z(uri.getHost());
        aihfVar.copyOnWrite();
        arkd arkdVar3 = (arkd) aihfVar.instance;
        arkdVar3.b |= 4;
        arkdVar3.e = strZ;
        String strZ2 = ahno.Z(uri.getScheme());
        aihfVar.copyOnWrite();
        arkd arkdVar4 = (arkd) aihfVar.instance;
        arkdVar4.b |= 8;
        arkdVar4.f = strZ2;
        Boolean.valueOf(z).getClass();
        aihfVar.copyOnWrite();
        arkd arkdVar5 = (arkd) aihfVar.instance;
        arkdVar5.b |= 64;
        arkdVar5.i = z;
        Boolean.valueOf(z3).getClass();
        aihfVar.copyOnWrite();
        arkd arkdVar6 = (arkd) aihfVar.instance;
        arkdVar6.b |= 16;
        arkdVar6.g = z3;
        byte[] bArrC = arkaVarE.an().c();
        aihf aihfVarCreateBuilder = akvd.a.createBuilder();
        aikh aikhVar = aikh.a;
        aikg aikgVar = new aikg();
        aikgVar.d(2, 3, 4, 10, 5, 12);
        affc affcVarA = aikgVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
        affcVarA.getClass();
        akvdVar.d = affcVarA;
        akvdVar.b |= 2;
        akvd akvdVar2 = (akvd) aihfVarCreateBuilder.build();
        wer werVarE = wbyVar.e();
        werVarE.k(str, akvdVar2, bArrC);
        werVarE.b();
    }

    public static boolean e(Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        String host = uri.getHost();
        String host2 = uri2.getHost();
        return scheme != null && scheme2 != null && host != null && host2 != null && ahno.ag("https", scheme) && ahno.ag("https", scheme2) && ahno.ag(host, host2) && a(uri) == a(uri2);
    }

    public static boolean f(String str, Set set) {
        return set.contains(Uri.parse(str).getHost());
    }

    public static boolean g(Uri uri, Context context) {
        try {
            afwl.m(context, new Intent("android.intent.action.VIEW", uri).setFlags(268435456));
            return true;
        } catch (ActivityNotFoundException unused) {
            String strValueOf = String.valueOf(String.valueOf(uri));
            zvp.a(zvn.a, zvm.z, "GenericWebView::" + b + " Could not open URL (activity not found): ".concat(strValueOf));
            return false;
        }
    }

    public static void h(xgn xgnVar, arkm arkmVar, int i, WebResourceResponse webResourceResponse) {
        if (xgnVar != null) {
            arkf arkfVarA = arkf.a(arkmVar.v);
            if (arkfVarA == null) {
                arkfVarA = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
            }
            if (arkfVarA == arkf.WEB_VIEW_USE_CASE_MY_AD_CENTER) {
                amud amudVar = arkmVar.A;
                if (amudVar == null) {
                    amudVar = amud.b;
                }
                xgj xgjVar = new xgj(amudVar.d, (amud) null);
                aihf aihfVarCreateBuilder = amcf.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amcf amcfVar = (amcf) aihfVarCreateBuilder.instance;
                amcfVar.c = i - 1;
                amcfVar.b |= 8;
                if (webResourceResponse != null) {
                    aihf aihfVarCreateBuilder2 = amcs.a.createBuilder();
                    int statusCode = webResourceResponse.getStatusCode();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amcs amcsVar = (amcs) aihfVarCreateBuilder2.instance;
                    amcsVar.b |= 1;
                    amcsVar.c = statusCode;
                    aihfVarCreateBuilder.copyOnWrite();
                    amcf amcfVar2 = (amcf) aihfVarCreateBuilder.instance;
                    amcs amcsVar2 = (amcs) aihfVarCreateBuilder2.build();
                    amcsVar2.getClass();
                    amcfVar2.d = amcsVar2;
                    amcfVar2.b |= 16;
                }
                aihf aihfVarCreateBuilder3 = amdd.a.createBuilder();
                aihf aihfVarCreateBuilder4 = amco.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                amco amcoVar = (amco) aihfVarCreateBuilder4.instance;
                amcf amcfVar3 = (amcf) aihfVarCreateBuilder.build();
                amcfVar3.getClass();
                amcoVar.d = amcfVar3;
                amcoVar.c = 11;
                aihfVarCreateBuilder3.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder3.instance;
                amco amcoVar2 = (amco) aihfVarCreateBuilder4.build();
                amcoVar2.getClass();
                amddVar.q = amcoVar2;
                amddVar.c |= SemanticState.ReadOnly;
                xgnVar.A(xgjVar, (amdd) aihfVarCreateBuilder3.build());
            }
        }
    }

    public static void i(xgn xgnVar, arkm arkmVar, int i, WebResourceResponse webResourceResponse, boolean z) {
        if (z) {
            h(xgnVar, arkmVar, i, webResourceResponse);
        }
    }

    public static void j(int i, arkf arkfVar, String str, boolean z, boolean z2, int i2, Optional optional, Consumer consumer) {
        aihf aihfVarCreateBuilder = arjy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        arjy arjyVar = (arjy) aihfVarCreateBuilder.instance;
        arjyVar.b |= 8;
        arjyVar.f = z2;
        aihfVarCreateBuilder.copyOnWrite();
        arjy arjyVar2 = (arjy) aihfVarCreateBuilder.instance;
        arjyVar2.d = arkfVar.z;
        arjyVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        arjy arjyVar3 = (arjy) aihfVarCreateBuilder.instance;
        int i3 = 4;
        arjyVar3.b |= 4;
        arjyVar3.e = z;
        if (!str.isEmpty()) {
            String strZ = ahno.Z(Uri.parse(str).getHost());
            aihfVarCreateBuilder.copyOnWrite();
            arjy arjyVar4 = (arjy) aihfVarCreateBuilder.instance;
            arjyVar4.b |= 1;
            arjyVar4.c = strZ;
        }
        if (i2 > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            arjy arjyVar5 = (arjy) aihfVarCreateBuilder.instance;
            arjyVar5.b |= 16;
            arjyVar5.g = i2;
        }
        adyu adyuVar = new adyu(aihfVarCreateBuilder, i3);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = adyuVar.a;
            long jLongValue = ((Long) obj).longValue();
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            arjy arjyVar6 = (arjy) aihfVar.instance;
            arjyVar6.b |= 32;
            arjyVar6.h = jLongValue;
        }
        aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
        arjy arjyVar7 = (arjy) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
        arjyVar7.getClass();
        akzkVar.k = arjyVar7;
        akzkVar.b |= 2097152;
        xfh xfhVar = new xfh(i - 1, 32);
        xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
        consumer.r(xfhVar);
    }

    public static long k(Context context) {
        PackageInfo packageInfoF = aedi.f(context);
        if (packageInfoF == null) {
            return -1L;
        }
        return aty.d(packageInfoF);
    }

    public static void l(abte abteVar, int i, arkf arkfVar, String str, boolean z, boolean z2, int i2, Optional optional) {
        j(i, arkfVar, str, z, z2, i2, optional, new adsk(abteVar, 5));
    }

    public static void m(abte abteVar, int i, arkf arkfVar, String str, boolean z, boolean z2) {
        l(abteVar, i, arkfVar, str, z, z2, -1, Optional.empty());
    }

    public static void n(abte abteVar, arkf arkfVar, String str, boolean z, boolean z2, int i) {
        l(abteVar, 7, arkfVar, str, z, z2, i, Optional.empty());
    }
}
