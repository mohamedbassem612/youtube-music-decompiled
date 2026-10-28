package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaCommonConfig;
import com.google.protos.youtube.api.innertube.SabrPrefetchConfigOuterClass$SabrPrefetchConfig;
import j$.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hef {
    public final Object a;
    public final Object b;

    public hef(tbt tbtVar, vxz vxzVar, avlh avlhVar) {
        this.b = new awlk();
        this.a = tbtVar;
        long jC = vxzVar.c(0, 45656475L, 0L);
        jC = jC <= 0 ? 1L : jC;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        avmb avmbVar = awlg.b;
        avnn avnnVar = atqp.g;
        timeUnit.getClass();
        avmbVar.getClass();
        avqz avqzVar = new avqz(jC, timeUnit, avmbVar);
        avnn avnnVar2 = atqp.p;
        avqzVar.E(new isg(this, 0));
        if (vxzVar.l(17, 45680971L, false)) {
            avlhVar.x(new hxe(18)).au().D(new iwb(this, 1), new ido(11));
        } else {
            tbtVar.a(this, hak.class, new gla(this, 2));
            tbtVar.a(this, haj.class, new gla(this, 3));
        }
    }

    public static ajwo o(String str, String str2, int i, boolean z) {
        aihf aihfVarCreateBuilder = apzf.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            aihfVarCreateBuilder.copyOnWrite();
            apzf apzfVar = (apzf) aihfVarCreateBuilder.instance;
            str.getClass();
            apzfVar.c |= 1;
            apzfVar.d = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            apzf apzfVar2 = (apzf) aihfVarCreateBuilder.instance;
            str2.getClass();
            apzfVar2.c |= 2;
            apzfVar2.e = str2;
        }
        aihf aihfVarCreateBuilder2 = apzg.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apzg apzgVar = (apzg) aihfVarCreateBuilder2.instance;
        apzgVar.b |= 1;
        apzgVar.c = z;
        aihfVarCreateBuilder.copyOnWrite();
        apzf apzfVar3 = (apzf) aihfVarCreateBuilder.instance;
        apzg apzgVar2 = (apzg) aihfVarCreateBuilder2.build();
        apzgVar2.getClass();
        apzfVar3.g = apzgVar2;
        apzfVar3.c |= 8;
        aihfVarCreateBuilder.copyOnWrite();
        apzf apzfVar4 = (apzf) aihfVarCreateBuilder.instance;
        apzfVar4.c |= 4;
        apzfVar4.f = i;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(apzf.b, (apzf) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public static String p(anuk anukVar) {
        String strAr;
        anvd anvdVarAm;
        if ((anukVar.c.b & 131072) != 0) {
            return anukVar.getAndroidMediaStoreContentUri();
        }
        String strI = anukVar.i();
        if (TextUtils.isEmpty(strI) || (strAr = kro.ar(strI)) == null) {
            anvdVarAm = anvd.e(anve.a).am();
        } else {
            String string = ixt.q(strAr).toString();
            strI.getClass();
            ahno.P(!strI.isEmpty(), "key cannot be empty");
            aihf aihfVarCreateBuilder = anve.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            anve anveVar = (anve) aihfVarCreateBuilder.instance;
            anveVar.b |= 1;
            anveVar.c = strI;
            anvb anvbVar = new anvb(aihfVarCreateBuilder);
            aihf aihfVar = anvbVar.a;
            aihfVar.copyOnWrite();
            anve anveVar2 = (anve) aihfVar.instance;
            string.getClass();
            anveVar2.b |= 2;
            anveVar2.d = string;
            anvdVarAm = anvbVar.am();
        }
        return anvdVarAm.getAndroidMediaStoreContentUri();
    }

    public static boolean q(ajmf ajmfVar) {
        if (ajmfVar == null || ajmfVar.c.isEmpty()) {
            return false;
        }
        return r(Uri.parse(ajmfVar.c));
    }

    public static boolean r(Uri uri) {
        int iMatch = ish.q.match(uri);
        return iMatch == 1 || iMatch == 2 || iMatch == 3 || iMatch == 4 || iMatch == 6;
    }

    public static final SabrPrefetchConfigOuterClass$SabrPrefetchConfig v(wjf wjfVar) {
        alvt alvtVarU;
        if (wjfVar != null && (alvtVarU = wjfVar.u()) != null) {
            aoqd aoqdVar = alvtVarU.e;
            if (aoqdVar == null) {
                aoqdVar = aoqd.a;
            }
            if (aoqdVar != null) {
                MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance = aoqdVar.e;
                if (defaultInstance == null) {
                    defaultInstance = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
                }
                if (defaultInstance != null) {
                    SabrPrefetchConfigOuterClass$SabrPrefetchConfig defaultInstance2 = defaultInstance.n;
                    if (defaultInstance2 == null) {
                        defaultInstance2 = SabrPrefetchConfigOuterClass$SabrPrefetchConfig.getDefaultInstance();
                    }
                    if (defaultInstance2 != null) {
                        return defaultInstance2;
                    }
                }
            }
        }
        SabrPrefetchConfigOuterClass$SabrPrefetchConfig defaultInstance3 = SabrPrefetchConfigOuterClass$SabrPrefetchConfig.getDefaultInstance();
        defaultInstance3.getClass();
        return defaultInstance3;
    }

    private static final anjo x(aamh aamhVar, List list, long j, aogf aogfVar) {
        String strAn = kro.an(aamhVar.a);
        strAn.getClass();
        ahno.P(!strAn.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anjr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anjr anjrVar = (anjr) aihfVarCreateBuilder.instance;
        anjrVar.b |= 1;
        anjrVar.c = strAn;
        anjo anjoVar = new anjo(aihfVarCreateBuilder);
        if (aogfVar == aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE) {
            aofc aofcVarC = hlz.c(aamhVar);
            aihf aihfVarCreateBuilder2 = anxf.a.createBuilder();
            String str = aofcVarC != null ? aofcVarC.i : null;
            if (str != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                anxf anxfVar = (anxf) aihfVarCreateBuilder2.instance;
                anxfVar.b |= 1;
                anxfVar.c = str;
            }
            String str2 = aofcVarC != null ? aofcVarC.k : null;
            if (str2 != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                anxf anxfVar2 = (anxf) aihfVarCreateBuilder2.instance;
                anxfVar2.b |= 2;
                anxfVar2.d = str2;
            }
            aihf aihfVar = anjoVar.a;
            aihfVar.copyOnWrite();
            anjr anjrVar2 = (anjr) aihfVar.instance;
            anxf anxfVar3 = (anxf) aihfVarCreateBuilder2.build();
            anxfVar3.getClass();
            anjrVar2.f = anxfVar3;
            anjrVar2.b |= 4;
        }
        Long lValueOf = Long.valueOf(j);
        aihf aihfVar2 = anjoVar.a;
        lValueOf.getClass();
        aihfVar2.copyOnWrite();
        anjr anjrVar3 = (anjr) aihfVar2.instance;
        anjrVar3.b |= 2;
        anjrVar3.e = j;
        aihfVar2.copyOnWrite();
        anjr anjrVar4 = (anjr) aihfVar2.instance;
        aiie aiieVar = anjrVar4.d;
        if (!aiieVar.c()) {
            anjrVar4.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, anjrVar4.d);
        long time = aamhVar.g.getTime();
        Long.valueOf(time).getClass();
        aihfVar2.copyOnWrite();
        anjr anjrVar5 = (anjr) aihfVar2.instance;
        anjrVar5.b |= 16;
        anjrVar5.h = time;
        return anjoVar;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    private static final anjv y(aamh aamhVar, List list) {
        aqmh aqmhVarF;
        String str = aamhVar.a;
        String strAm = kro.am(str);
        strAm.getClass();
        ahno.P(!strAm.isEmpty(), "key cannot be empty");
        aihh aihhVar = (aihh) ankd.a.createBuilder();
        aihhVar.copyOnWrite();
        ankd ankdVar = (ankd) aihhVar.instance;
        ankdVar.b |= 1;
        ankdVar.c = strAm;
        anjv anjvVar = new anjv(aihhVar);
        aofc aofcVarC = hlz.c(aamhVar);
        if (aofcVarC != null) {
            aihh aihhVar2 = anjvVar.a;
            String str2 = aofcVarC.g;
            aihhVar2.copyOnWrite();
            ankd ankdVar2 = (ankd) aihhVar2.instance;
            str2.getClass();
            ankdVar2.b |= 32;
            ankdVar2.i = str2;
            if ((aofcVarC.b & 8) != 0) {
                akke akkeVar = aofcVarC.f;
                if (akkeVar == null) {
                    akkeVar = akke.a;
                }
                aihhVar2.copyOnWrite();
                ankd ankdVar3 = (ankd) aihhVar2.instance;
                akkeVar.getClass();
                ankdVar3.q = akkeVar;
                ankdVar3.b |= SemanticState.Modal;
            }
            aihf aihfVarCreateBuilder = ankb.a.createBuilder();
            int iAV = a.aV(aofcVarC.e);
            if (iAV == 0) {
                iAV = 1;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ankb ankbVar = (ankb) aihfVarCreateBuilder.instance;
            ankbVar.c = iAV - 1;
            ankbVar.b |= 1;
            ankb ankbVar2 = (ankb) aihfVarCreateBuilder.build();
            aihhVar2.copyOnWrite();
            ankd ankdVar4 = (ankd) aihhVar2.instance;
            ankbVar2.getClass();
            ankdVar4.r = ankbVar2;
            ankdVar4.b |= SemanticState.Obscured;
            ankf ankfVarA = ankf.a(aofcVarC.h);
            if (ankfVarA == null) {
                ankfVarA = ankf.MUSIC_RELEASE_TYPE_UNKNOWN;
            }
            aihhVar2.copyOnWrite();
            ankd ankdVar5 = (ankd) aihhVar2.instance;
            ankdVar5.s = ankfVarA.g;
            ankdVar5.b |= SemanticState.Multiline;
        }
        long j = (aofcVarC == null || (aofcVarC.b & SemanticState.LiveRegion) == 0) ? aamhVar.d : aofcVarC.j;
        aihh aihhVar3 = anjvVar.a;
        Long.valueOf(j).getClass();
        aihhVar3.copyOnWrite();
        ankd ankdVar6 = (ankd) aihhVar3.instance;
        ankdVar6.b |= SemanticState.LiveRegion;
        ankdVar6.n = j;
        aofu aofuVar = aamhVar.h;
        if (aofuVar != null && (aofuVar.b & SemanticState.Multiline) != 0) {
            alay alayVar = aofuVar.n;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            aihhVar3.copyOnWrite();
            ankd ankdVar7 = (ankd) aihhVar3.instance;
            alayVar.getClass();
            ankdVar7.f = alayVar;
            ankdVar7.b |= 8;
        }
        String str3 = aamhVar.b;
        aihhVar3.copyOnWrite();
        ankd ankdVar8 = (ankd) aihhVar3.instance;
        str3.getClass();
        ankdVar8.b |= 4;
        ankdVar8.e = str3;
        aihhVar3.copyOnWrite();
        ankd ankdVar9 = (ankd) aihhVar3.instance;
        ankdVar9.b |= SemanticState.Hidden;
        ankdVar9.m = str;
        abuz abuzVar = aamhVar.k;
        ?? r3 = abuzVar.b;
        if ((!r3.isEmpty() && Collection.EL.stream(r3).allMatch(new hod(9))) || aofcVarC == null || (aofcVarC.b & 2) == 0) {
            aqmhVarF = abuzVar.l();
        } else {
            aqmh aqmhVar = aofcVarC.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            aqmhVarF = aajg.f(aqmhVar, agke.q(480));
        }
        aihhVar3.copyOnWrite();
        ankd ankdVar10 = (ankd) aihhVar3.instance;
        aqmhVarF.getClass();
        ankdVar10.g = aqmhVarF;
        ankdVar10.b |= 16;
        aihhVar3.copyOnWrite();
        ankd ankdVar11 = (ankd) aihhVar3.instance;
        aiie aiieVar = ankdVar11.o;
        if (!aiieVar.c()) {
            ankdVar11.o = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, ankdVar11.o);
        String strAn = kro.an(str);
        aihhVar3.copyOnWrite();
        ankd ankdVar12 = (ankd) aihhVar3.instance;
        strAn.getClass();
        ankdVar12.b |= 1048576;
        ankdVar12.z = strAn;
        return anjvVar;
    }

    public final byte[] a() {
        return ((anwt) this.a).r.G();
    }

    public final zne b(zot zotVar, Bundle bundle) {
        if (zotVar == null) {
            return zmz.a;
        }
        if (!zotVar.equals(zny.a)) {
            if (zotVar.equals(znm.a)) {
                return zma.a;
            }
            int i = zne.c;
            return awrc.c(zotVar, zol.a) ? zmz.a : zik.aA(zotVar.b);
        }
        if (bundle != null) {
            if (bundle.containsKey("android.media.browse.ASSISTANT_DRIVING_MODE") && bundle.getBoolean("android.media.browse.ASSISTANT_DRIVING_MODE")) {
                return zmd.a;
            }
            if (bundle.containsKey("android.media.browse.ASSISTANT_AT_A_GLANCE") && bundle.getBoolean("android.media.browse.ASSISTANT_AT_A_GLANCE")) {
                return zlv.a;
            }
            if (bundle.containsKey("android.media.browse.ASSISTANT_DRIVING_MODE_ONE_DIMENSION") && bundle.getBoolean("android.media.browse.ASSISTANT_DRIVING_MODE_ONE_DIMENSION")) {
                return zlt.a;
            }
        }
        UiModeManager uiModeManager = (UiModeManager) ((Context) this.b).getSystemService("uimode");
        return (uiModeManager == null || uiModeManager.getCurrentModeType() != 3) ? zmm.a : zmd.a;
    }

    public final void c(int i) {
        d(i, hgg.a((Context) this.b, i));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final void d(int i, String str) {
        fg fgVar = (fg) this.a.io();
        fi fiVar = new fi();
        fiVar.c(i, str);
        fiVar.e(7, 0L, 1.0f);
        fg fgVar2 = (fg) fgVar.a;
        if (fgVar2.o() != null) {
            fiVar.a = fgVar2.o().e;
        }
        fgVar.k(fiVar.a());
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zwb] */
    public final anjq e(aamj aamjVar) {
        anjo anjoVarX = x(aamjVar.a, (List) Collection.EL.stream(aamjVar.b).map(new hpp(7)).collect(aghu.a), aamjVar.f, aamjVar.h);
        aihf aihfVar = anjoVarX.a;
        Long l = 0L;
        l.getClass();
        aihfVar.copyOnWrite();
        anjr anjrVar = (anjr) aihfVar.instance;
        anjr anjrVar2 = anjr.a;
        anjrVar.b |= 32;
        anjrVar.i = 0L;
        this.b.e(this.a.e());
        return anjoVarX.am();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, wbz] */
    public final anjq f(aamh aamhVar, List list, long j, aogf aogfVar) {
        anjo anjoVarX = x(aamhVar, (List) Collection.EL.stream(list).map(new hpp(7)).collect(aghu.a), j, aogfVar);
        this.b.e(this.a.e());
        return anjoVarX.am();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zwb] */
    public final anjx g(aamj aamjVar) {
        anjv anjvVarY = y(aamjVar.a, (List) Collection.EL.stream(aamjVar.b).map(new hpp(6)).collect(aghu.a));
        this.b.e(this.a.e());
        return anjvVarY.am();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, wbz] */
    public final anjx h(aamh aamhVar, List list) {
        anjv anjvVarY = y(aamhVar, (List) Collection.EL.stream(list).map(new hpp(6)).collect(aghu.a));
        this.b.e(this.a.e());
        return anjvVarY.am();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture i() {
        return ahno.ar(ahng.n(new byte[0]), new gmv(this, 10), this.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public final weh j(weh wehVar, weh wehVar2) {
        anuk anukVar;
        String strH;
        if (!((vxz) this.b).l(47, 45765070L, false) || !(wehVar instanceof anuk) || !(wehVar2 instanceof anuk) || ((strH = (anukVar = (anuk) wehVar2).h()) != null && strH.length() != 0)) {
            return wehVar2;
        }
        String title = anukVar.getTitle();
        if (title == null || title.length() == 0) {
            return wehVar;
        }
        anui anuiVarD = ((anuk) wehVar).d();
        anuiVarD.ao(anukVar.getTitle());
        ((wbz) this.a.io()).c();
        return anuiVarD.aq();
    }

    public final avmc k(zwa zwaVar) {
        zwaVar.getClass();
        return avmc.n(new uf(this, zwaVar, 8, null));
    }

    public final void l(boolean z) {
        ((AtomicBoolean) this.b).set(z);
    }

    public final boolean m() {
        return ((AtomicBoolean) this.b).get();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    public final boolean n(int i) {
        acfw acfwVarH;
        wjf wjfVarC;
        if (i == 4) {
            return ((tfq) this.b).h();
        }
        if (i != 8) {
            return false;
        }
        abvk abvkVar = (abvk) this.a.io();
        return abvkVar == null || (acfwVarH = abvkVar.h()) == null || (wjfVarC = acfwVarH.c()) == null || wjfVarC.ae() == 1 || !(wjfVarC.ae() == 3 || wjfVarC.ae() == 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmi, java.lang.Object] */
    public final avlb s() {
        Object objA = this.b.a();
        objA.getClass();
        return (avlb) objA;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zwb] */
    public final String t() {
        ?? r1 = this.b;
        return r1.u() ? r1.e().k() : "signedout";
    }

    public final void u(aimc aimcVar) {
        ((qrx) this.a).a(new idw(this, aimcVar, 6), MoreExecutors.directExecutor());
    }

    public final aebc w() {
        return ((gkt) this.a).e;
    }

    public hef(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public hef(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public hef() {
        this.b = new AtomicBoolean(false);
        this.a = new awkx().aI();
    }

    public hef(awmd awmdVar, awmd awmdVar2) {
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public hef(jnm jnmVar, vxz vxzVar) {
        jnmVar.getClass();
        vxzVar.getClass();
        this.a = jnmVar;
        this.b = vxzVar;
    }

    public hef(gkt gktVar) {
        gktVar.getClass();
        this.a = gktVar;
        this.b = new awmp(new aho(10));
    }

    public hef(Object obj, awmd awmdVar) {
        this.b = obj;
        this.a = awmdVar;
    }

    public hef(Context context, syn synVar) {
        context.getClass();
        synVar.getClass();
        this.a = context;
        this.b = synVar;
    }

    public hef(awmd awmdVar, vxz vxzVar) {
        awmdVar.getClass();
        vxzVar.getClass();
        this.a = awmdVar;
        this.b = vxzVar;
    }

    public hef(anwt anwtVar) {
        anwtVar.getClass();
        this.a = anwtVar;
        apji apjiVar = anwtVar.m;
        this.b = (ajnf) kro.H(apjiVar == null ? apji.a : apjiVar, ajnp.a).orElse(null);
    }
}
