package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnm {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public jnm() {
        this.d = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.a = new LinkedHashMap();
        this.b = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    private final anui O(aamh aamhVar, List list) {
        Object string;
        String str = aamhVar.a;
        anui anuiVarF = anuk.f(kro.ay(str));
        hlz hlzVar = (hlz) this.b;
        if (hlzVar.k(aamhVar)) {
            aofc aofcVarC = hlz.c(aamhVar);
            if (aofcVarC != null) {
                string = aofcVarC.g;
            } else {
                string = "";
            }
        } else if (str.startsWith("RD")) {
            string = hlzVar.d.getString(R.string.curated_playlist_channel_title);
        } else {
            aaok aaokVar = aamhVar.l;
            if (aaokVar != null) {
                string = aaokVar.d;
            } else {
                string = "";
            }
        }
        if (string != null) {
            aihh aihhVar = anuiVarF.a;
            aihhVar.copyOnWrite();
            anuu anuuVar = (anuu) aihhVar.instance;
            anuu anuuVar2 = anuu.a;
            anuuVar.b |= 32768;
            anuuVar.t = (String) string;
        }
        aofc aofcVarC2 = hlz.c(aamhVar);
        anuiVarF.ap(Long.valueOf((aofcVarC2 == null || (aofcVarC2.b & SemanticState.LiveRegion) == 0) ? aamhVar.d : aofcVarC2.j));
        if (aofcVarC2 != null && aofcVarC2.l) {
            aaok aaokVar2 = aamhVar.l;
            String str2 = (String) (aaokVar2 != null ? aaokVar2.b : "");
            if (!str2.isEmpty()) {
                aihf aihfVarCreateBuilder = anuy.a.createBuilder();
                String strG = wfs.g(447, str2);
                aihfVarCreateBuilder.copyOnWrite();
                anuy anuyVar = (anuy) aihfVarCreateBuilder.instance;
                strG.getClass();
                anuyVar.b |= 1;
                anuyVar.c = strG;
                aofd aofdVar = aofcVarC2.m;
                if (aofdVar == null) {
                    aofdVar = aofd.a;
                }
                if (aofdVar.b) {
                    aihfVarCreateBuilder.copyOnWrite();
                    anuy anuyVar2 = (anuy) aihfVarCreateBuilder.instance;
                    anuyVar2.b |= 2;
                    anuyVar2.d = true;
                }
                aihh aihhVar2 = anuiVarF.a;
                aihhVar2.copyOnWrite();
                anuu anuuVar3 = (anuu) aihhVar2.instance;
                anuy anuyVar3 = (anuy) aihfVarCreateBuilder.build();
                anuu anuuVar4 = anuu.a;
                anuyVar3.getClass();
                anuuVar3.m = anuyVar3;
                anuuVar3.b |= SemanticState.Hidden;
            }
        }
        aofu aofuVar = aamhVar.h;
        if (aofuVar != null && (aofuVar.b & SemanticState.Multiline) != 0) {
            alay alayVar = aofuVar.n;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            aihh aihhVar3 = anuiVarF.a;
            aihhVar3.copyOnWrite();
            anuu anuuVar5 = (anuu) aihhVar3.instance;
            anuu anuuVar6 = anuu.a;
            alayVar.getClass();
            anuuVar5.g = alayVar;
            anuuVar5.b |= 16;
        }
        anuiVarF.ao(aamhVar.b);
        anuiVarF.am(str);
        anuiVarF.an(aamhVar.k.l());
        aotk aotkVar = aamhVar.f ? aotk.PLAYLIST_ENTITY_VISIBILITY_PRIVATE : aotk.PLAYLIST_ENTITY_VISIBILITY_PUBLIC;
        aihh aihhVar4 = anuiVarF.a;
        aihhVar4.copyOnWrite();
        anuu anuuVar7 = (anuu) aihhVar4.instance;
        anuu anuuVar8 = anuu.a;
        anuuVar7.i = aotkVar.e;
        anuuVar7.b |= 64;
        aihhVar4.copyOnWrite();
        anuu anuuVar9 = (anuu) aihhVar4.instance;
        aiie aiieVar = anuuVar9.l;
        if (!aiieVar.c()) {
            anuuVar9.l = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, anuuVar9.l);
        String strAz = kro.az(str);
        aihhVar4.copyOnWrite();
        anuu anuuVar10 = (anuu) aihhVar4.instance;
        strAz.getClass();
        anuuVar10.b |= SemanticState.Obscured;
        anuuVar10.q = strAz;
        return anuiVarF;
    }

    private static final anua P(aamh aamhVar, List list, long j, aogf aogfVar) {
        String strAz = kro.az(aamhVar.a);
        strAz.getClass();
        ahno.P(!strAz.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anud.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anud anudVar = (anud) aihfVarCreateBuilder.instance;
        anudVar.b |= 1;
        anudVar.c = strAz;
        anua anuaVar = new anua(aihfVarCreateBuilder);
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
            aihf aihfVar = anuaVar.a;
            aihfVar.copyOnWrite();
            anud anudVar2 = (anud) aihfVar.instance;
            anxf anxfVar3 = (anxf) aihfVarCreateBuilder2.build();
            anxfVar3.getClass();
            anudVar2.f = anxfVar3;
            anudVar2.b |= 8;
        }
        Long lValueOf = Long.valueOf(j);
        aihf aihfVar2 = anuaVar.a;
        lValueOf.getClass();
        aihfVar2.copyOnWrite();
        anud anudVar3 = (anud) aihfVar2.instance;
        anudVar3.b |= 4;
        anudVar3.e = j;
        aihfVar2.copyOnWrite();
        anud anudVar4 = (anud) aihfVar2.instance;
        aiie aiieVar = anudVar4.d;
        if (!aiieVar.c()) {
            anudVar4.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, anudVar4.d);
        long time = aamhVar.g.getTime();
        Long.valueOf(time).getClass();
        aihfVar2.copyOnWrite();
        anud anudVar5 = (anud) aihfVar2.instance;
        anudVar5.b |= 32;
        anudVar5.h = time;
        return anuaVar;
    }

    public static boolean j(hyz hyzVar) {
        abnl abnlVarN;
        ajwo ajwoVar;
        if (hyzVar == null || (abnlVarN = hyzVar.n()) == null || (ajwoVar = abnlVarN.b) == null) {
            return true;
        }
        return (gzj.af(ajwoVar) == 2 || anzw.MUSIC_VIDEO_TYPE_PRIVATELY_OWNED_TRACK.equals(gzj.P(ajwoVar))) ? false : true;
    }

    public final void A(zwa zwaVar, boolean z) {
        gzh gzhVar;
        String strK = zwaVar.k();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        if (concurrentHashMap.containsKey(strK) && ((Boolean) concurrentHashMap.get(zwaVar.k())).booleanValue() == z) {
            return;
        }
        boolean z2 = false;
        if (concurrentHashMap.containsKey(zwaVar.k()) && ((Boolean) concurrentHashMap.get(zwaVar.k())).booleanValue() != z) {
            z2 = true;
        }
        concurrentHashMap.put(zwaVar.k(), Boolean.valueOf(z));
        for (WeakReference weakReference : (CopyOnWriteArrayList) this.b) {
            if (weakReference != null && (gzhVar = (gzh) weakReference.get()) != null) {
                if (z2) {
                    gzhVar.v(zwaVar);
                }
                gzhVar.w(zwaVar, this);
            }
        }
    }

    public final void B(zwa zwaVar, anki ankiVar) {
        A(zwaVar, ankiVar.g);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final boolean C() {
        Boolean bool = (Boolean) ((ConcurrentHashMap) this.c).get(this.d.e().k());
        return bool == null ? ((axfd) this.a).at() : bool.booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zwb] */
    public final boolean D() {
        zwa zwaVarE = this.d.e();
        if (zwaVarE instanceof rlt) {
            return ((rlt) zwaVarE).h;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    public final guu E(vwx vwxVar) {
        Context context = (Context) this.a.io();
        context.getClass();
        zxj zxjVar = (zxj) this.d.io();
        zxjVar.getClass();
        jin jinVar = (jin) this.c.io();
        jinVar.getClass();
        Executor executor = (Executor) this.b.io();
        executor.getClass();
        return new guu(context, zxjVar, jinVar, executor, vwxVar);
    }

    public final fvf F() {
        fvi fviVarJ = ((fvg) this.a).b.j();
        if (fviVarJ != null) {
            return (fvf) fviVarJ.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void G(long j, boolean z) {
        fkb fkbVar;
        fjc fjcVar;
        int iB;
        if (!this.c.add(Long.valueOf(j))) {
            throw new IllegalStateException("Cannot acquire the same reference more than once.");
        }
        if (!z || (fjcVar = (fkbVar = ((fvg) this.a).b).o) == null || (iB = fjcVar.b(j)) < 0 || fkbVar.i(iB) != null) {
            return;
        }
        fvq fvqVarG = fkbVar.o.g(iB);
        fkbVar.q(iB, fvqVarG, fja.b(fvqVarG), fkbVar.o);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void H() {
        ?? r2 = this.c;
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            ((Long) it.next()).longValue();
        }
        r2.clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean I(long j) {
        return this.c.contains(Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void J(long j) {
        if (!this.c.remove(Long.valueOf(j))) {
            throw new IllegalStateException("Trying to release a reference that wasn't acquired.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Object K(flq flqVar) {
        return this.b.get(flqVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Collection L() {
        return this.b.values();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Set M() {
        return this.b.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final void N(flq flqVar) {
        if (this.b.remove(flqVar) != null) {
            int i = flqVar.a;
            if (i == 1) {
                this.d.remove(flqVar.b);
                return;
            }
            if (i != 2) {
                this.a.remove(flqVar.b);
                return;
            }
            String str = flqVar.c;
            ?? r2 = this.c;
            Map map = (Map) r2.get(str);
            map.remove(flqVar.b);
            if (map.isEmpty()) {
                r2.remove(str);
            }
        }
    }

    public final void a(boolean z) {
        Window window = ((cf) this.a).getWindow();
        if (window != null) {
            if (z) {
                window.addFlags(SemanticState.Focused);
            } else {
                window.clearFlags(SemanticState.Focused);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final iyn b(anwt anwtVar, adxd adxdVar, wnf wnfVar, xgn xgnVar) {
        anwtVar.getClass();
        Context context = (Context) this.b.io();
        context.getClass();
        wnfVar.getClass();
        tbt tbtVar = (tbt) this.d.io();
        tbtVar.getClass();
        ttm ttmVar = (ttm) this.c.io();
        ttmVar.getClass();
        vxe vxeVar = (vxe) this.a.io();
        vxeVar.getClass();
        return new iyn(anwtVar, adxdVar, context, wnfVar, tbtVar, ttmVar, vxeVar, xgnVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    public final iqv c(bog bogVar) {
        Context context = (Context) this.d.io();
        context.getClass();
        Executor executor = (Executor) this.c.io();
        executor.getClass();
        zwb zwbVar = (zwb) this.b.io();
        zwbVar.getClass();
        syn synVar = (syn) this.a.io();
        synVar.getClass();
        return new iqv(context, bogVar, executor, zwbVar, synVar);
    }

    public final ListenableFuture d(Executor executor) {
        if (((vxz) this.a).l(37, 45672931L, false)) {
            return ahno.ap(new huo(this, 3), executor);
        }
        wuq wuqVarA = ((wup) this.c).a(null);
        wuqVarA.H = amac.WATCH_NEXT_TYPE_GET_QUEUE;
        wuqVarA.m();
        wuqVarA.M = ((jij) this.d).j();
        return ((wuo) this.b).j(wuqVarA, executor);
    }

    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, zwh] */
    /* JADX WARN: Type inference failed for: r3v38, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [aunn, java.lang.Object] */
    public final ListenableFuture e(ajwo ajwoVar, Executor executor) {
        aigw aigwVar = ish.c;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        ajwoVar.c(aihlVarCheckIsLite);
        boolean z = true;
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            Object obj = this.b;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aigwVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            ahno.F(ajwoVar.j.n(aihlVarCheckIsLite2.d));
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aigwVar);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            apze apzeVar = ((apzd) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK))).d;
            if (apzeVar == null) {
                apzeVar = apze.a;
            }
            aihf aihfVarCreateBuilder = apzf.a.createBuilder();
            if ((apzeVar.b & 2) != 0) {
                String str = apzeVar.d;
                aihfVarCreateBuilder.copyOnWrite();
                apzf apzfVar = (apzf) aihfVarCreateBuilder.instance;
                str.getClass();
                apzfVar.c |= 2;
                apzfVar.e = str;
            }
            if ((apzeVar.b & 1) != 0) {
                String str2 = apzeVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                apzf apzfVar2 = (apzf) aihfVarCreateBuilder.instance;
                str2.getClass();
                apzfVar2.c |= 1;
                apzfVar2.d = str2;
            }
            return ahno.ar(((jij) ((yhl) obj).d).i((apzf) aihfVarCreateBuilder.build()), new iat(obj, 17), executor);
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite4);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite4.d));
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite5);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
        apcb apcbVar = (apcb) (objK2 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK2));
        ahno.F(1 == (apcbVar.c & 1));
        apcd apcdVar = apcbVar.d;
        if (apcdVar == null) {
            apcdVar = apcd.a;
        }
        int i = 4;
        int i2 = 13;
        int i3 = 15;
        if ((apcdVar.b & 4) != 0 && apcdVar.e) {
            Object obj2 = this.d;
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apcb.b);
            ajwoVar.c(aihlVarCheckIsLite6);
            ahno.F(ajwoVar.j.n(aihlVarCheckIsLite6.d));
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(apcb.b);
            ajwoVar.c(aihlVarCheckIsLite7);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite7.d);
            apcb apcbVar2 = (apcb) (objK3 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK3));
            ahno.F(1 == (apcbVar2.c & 1));
            apcd apcdVar2 = apcbVar2.d;
            if (apcdVar2 == null) {
                apcdVar2 = apcd.a;
            }
            ahno.F((apcdVar2.b & 4) != 0 && apcdVar2.e);
            int i4 = 6;
            if (!apcdVar2.c.isEmpty()) {
                return ahno.ar(ahno.as(((iev) obj2).b.a(kro.aH(apcdVar2.c)), new gqb(obj2, executor, 10), executor), new iam(i4), executor);
            }
            String str3 = apcdVar2.d;
            ListenableFuture listenableFutureAs = (Objects.equals(str3, "PPSV") || Objects.equals(str3, "PPSE") || Objects.equals(str3, "PPSDST")) ? ahno.as(((iev) obj2).b.a(kro.aq()), new hlk(obj2, str3, executor, i4), executor) : ahno.ar(((iev) obj2).d.i(str3, false), new iam(9), executor);
            ListenableFuture listenableFutureAs2 = ahno.as(listenableFutureAs, new hqj(obj2, i3), executor);
            return ahno.ar(afxd.f(((ahud) ahno.aF(listenableFutureAs, listenableFutureAs2).a).l(new gmf(obj2, listenableFutureAs, listenableFutureAs2, i), executor)).g(new iat(obj2, i2), executor), new iam(8), executor);
        }
        Object obj3 = this.a;
        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite8);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite8.d));
        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite9);
        Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite9.d);
        apcb apcbVar3 = (apcb) (objK4 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK4));
        ahno.F(1 == (apcbVar3.c & 1));
        apcd apcdVar3 = apcbVar3.d;
        if (apcdVar3 == null) {
            apcdVar3 = apcd.a;
        }
        apcc apccVarA = apcc.a(apcbVar3.f);
        if (apccVarA == null) {
            apccVarA = apcc.MODE_UNSPECIFIED;
        }
        apcc apccVar = apccVarA;
        Optional optionalOf = (apcbVar3.c & 2) != 0 ? Optional.of(apcbVar3.e) : Optional.empty();
        if ((apcdVar3.b & 4) != 0 && apcdVar3.e) {
            z = false;
        }
        ahno.F(z);
        byte[] bArrG = ajwoVar.c.G();
        iew iewVar = (iew) obj3;
        wjr wjrVar = iewVar.j;
        aaqf aaqfVarD = ((wtc) aguu.aw((Context) wjrVar.a, wtc.class, ((syn) wjrVar.b).m(iewVar.d.e()))).D();
        String str4 = apcdVar3.d;
        String str5 = apcdVar3.c;
        agke agkeVarQ = ahno.aa(str5) ? agpi.a : agke.q(str5);
        Optional optionalJ = ((jij) iewVar.e.io()).j();
        abxv abxvVar = aaqfVarD.b;
        zwa zwaVarHw = aaqfVarD.e.hw();
        Optional optional = (Optional) aaqfVarD.d;
        optional.isPresent();
        xpl xplVar = (xpl) optional.get();
        wtb wtbVar = new wtb(abxvVar, zwaVarHw, str4, agkeVarQ, apccVar, optionalJ, optionalOf, ((vxz) xplVar.b.io()).l(78, 45418012L, false) ? Optional.of(((xmw) xplVar.a.io()).l) : Optional.empty());
        wtbVar.o(bArrG);
        ListenableFuture listenableFutureF = ((wnl) aaqfVarD.c).f(wtbVar, executor);
        ahno.at(listenableFutureF, new hfb(obj3, 13), MoreExecutors.directExecutor());
        return ahno.ar(listenableFutureF, new iat(obj3, 15), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(ajwo ajwoVar, xyf xyfVar) {
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apcb apcbVar = (apcb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        boolean z = true;
        ahno.F(1 == (apcbVar.c & 1));
        apcd apcdVar = apcbVar.d;
        if (apcdVar == null) {
            apcdVar = apcd.a;
        }
        if ((apcdVar.b & 4) != 0 && apcdVar.e) {
            z = false;
        }
        Object obj = this.a;
        ahno.F(z);
        byte[] bArrG = ajwoVar.c.G();
        iew iewVar = (iew) obj;
        wuq wuqVarA = iewVar.c.a(apcdVar.c);
        wuqVarA.G(apcdVar.d);
        wuqVarA.o(bArrG);
        wuqVarA.M = ((jij) iewVar.e.io()).j();
        ListenableFuture listenableFutureJ = iewVar.b.j(wuqVarA, executorDirectExecutor);
        ahno.at(listenableFutureJ, new hfb(obj, 14), MoreExecutors.directExecutor());
        ahno.at(ahno.ar(listenableFutureJ, new iat(obj, 16), MoreExecutors.directExecutor()), new hfb(xyfVar, 12), this.c);
    }

    public final void g(String str, xyf xyfVar) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihf aihfVarCreateBuilder = apcb.a.createBuilder();
        aihf aihfVarCreateBuilder2 = apcd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apcd apcdVar = (apcd) aihfVarCreateBuilder2.instance;
        str.getClass();
        apcdVar.b |= 1;
        apcdVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        apcb apcbVar = (apcb) aihfVarCreateBuilder.instance;
        apcd apcdVar2 = (apcd) aihfVarCreateBuilder2.build();
        apcdVar2.getClass();
        apcbVar.d = apcdVar2;
        apcbVar.c |= 1;
        aihhVar.e(apcb.b, (apcb) aihfVarCreateBuilder.build());
        f((ajwo) aihhVar.build(), xyfVar);
    }

    public final int h(List list, List list2, int i, boolean z) {
        ListIterator listIterator = list.listIterator();
        boolean zRemoveIf = false;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            if (j((hyz) listIterator.next())) {
                listIterator.remove();
                zRemoveIf = true;
                if (iNextIndex <= i && i > 0) {
                    i--;
                }
            }
        }
        if (list2 != null) {
            zRemoveIf |= j$.util.Collection.EL.removeIf(list2, new hud(8));
        }
        if (zRemoveIf && z) {
            ((hzl) this.c).a();
        }
        if (list.isEmpty()) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final boolean i() {
        return ((Boolean) this.b.io()).booleanValue();
    }

    public final annt k(List list, Collection collection, Map map, Map map2, Map map3) {
        int i = wfs.a;
        String strF = wfs.f(257, aigj.x("downloads_library"));
        strF.getClass();
        int i2 = 1;
        ahno.P(!strF.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = annw.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        annw annwVar = (annw) aihfVarCreateBuilder.instance;
        annwVar.b |= 1;
        annwVar.c = strF;
        annt anntVar = new annt(aihfVarCreateBuilder);
        List list2 = (List) j$.util.Collection.EL.stream(list).filter(new hkn(this, 3)).map(new hds(12)).collect(Collectors.toCollection(new idl(i2)));
        aihf aihfVar = anntVar.a;
        aihfVar.copyOnWrite();
        annw annwVar2 = (annw) aihfVar.instance;
        aiie aiieVar = annwVar2.d;
        if (!aiieVar.c()) {
            annwVar2.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list2, annwVar2.d);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        j$.util.Collection.EL.stream(list).filter(new hkn(this, 4)).forEach(new jap(linkedHashSet, i2));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aamh aamhVar = (aamh) it.next();
            if (hlz.m(aamhVar)) {
                for (String str : (List) j$.util.Map.EL.getOrDefault(map, aamhVar.a, agpi.a)) {
                    aamg aamgVar = (aamg) map2.get(str);
                    if (aamgVar == null || hfn.m(aamgVar)) {
                        String strAH = kro.aH(str);
                        aihfVar.copyOnWrite();
                        annw annwVar3 = (annw) aihfVar.instance;
                        strAH.getClass();
                        aiie aiieVar2 = annwVar3.k;
                        if (!aiieVar2.c()) {
                            annwVar3.k = aihn.mutableCopy(aiieVar2);
                        }
                        annwVar3.k.add(strAH);
                    } else if (aamgVar == aamg.COMPLETE || aamgVar == aamg.ACTIVE) {
                        linkedHashSet.add(kro.aH(str));
                    }
                }
            }
        }
        for (String str2 : linkedHashSet) {
            aihfVar.copyOnWrite();
            annw annwVar4 = (annw) aihfVar.instance;
            str2.getClass();
            aiie aiieVar3 = annwVar4.f;
            if (!aiieVar3.c()) {
                annwVar4.f = aihn.mutableCopy(aiieVar3);
            }
            annwVar4.f.add(str2);
        }
        List list3 = (List) j$.util.Collection.EL.stream(list).filter(new hkn(this, 5)).map(new hds(13)).collect(Collectors.toCollection(new idl(i2)));
        aihfVar.copyOnWrite();
        annw annwVar5 = (annw) aihfVar.instance;
        aiie aiieVar4 = annwVar5.e;
        if (!aiieVar4.c()) {
            annwVar5.e = aihn.mutableCopy(aiieVar4);
        }
        aifs.addAll(list3, annwVar5.e);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            aamh aamhVar2 = (aamh) it2.next();
            String str3 = aamhVar2.a;
            aogf aogfVar = (aogf) j$.util.Map.EL.getOrDefault(map3, str3, aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN);
            if (((hlz) this.c).k(aamhVar2)) {
                if (aogfVar.equals(aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE)) {
                    String strAm = kro.am(str3);
                    aihfVar.copyOnWrite();
                    annw annwVar6 = (annw) aihfVar.instance;
                    strAm.getClass();
                    aiie aiieVar5 = annwVar6.h;
                    if (!aiieVar5.c()) {
                        annwVar6.h = aihn.mutableCopy(aiieVar5);
                    }
                    annwVar6.h.add(strAm);
                } else {
                    String strAm2 = kro.am(str3);
                    aihfVar.copyOnWrite();
                    annw annwVar7 = (annw) aihfVar.instance;
                    strAm2.getClass();
                    aiie aiieVar6 = annwVar7.g;
                    if (!aiieVar6.c()) {
                        annwVar7.g = aihn.mutableCopy(aiieVar6);
                    }
                    annwVar7.g.add(strAm2);
                }
            } else if (aogfVar.equals(aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE)) {
                String strAy = kro.ay(str3);
                aihfVar.copyOnWrite();
                annw annwVar8 = (annw) aihfVar.instance;
                strAy.getClass();
                aiie aiieVar7 = annwVar8.j;
                if (!aiieVar7.c()) {
                    annwVar8.j = aihn.mutableCopy(aiieVar7);
                }
                annwVar8.j.add(strAy);
            } else {
                String strAy2 = kro.ay(str3);
                aihfVar.copyOnWrite();
                annw annwVar9 = (annw) aihfVar.instance;
                strAy2.getClass();
                aiie aiieVar8 = annwVar9.i;
                if (!aiieVar8.c()) {
                    annwVar9.i = aihn.mutableCopy(aiieVar8);
                }
                annwVar9.i.add(strAy2);
            }
        }
        return anntVar;
    }

    public final anym l(aamo aamoVar) {
        String strAI = kro.aI(aamoVar.d());
        strAI.getClass();
        ahno.P(!strAI.isEmpty(), "key cannot be empty");
        aihh aihhVar = (aihh) anyp.a.createBuilder();
        aihhVar.copyOnWrite();
        anyp anypVar = (anyp) aihhVar.instance;
        anypVar.b |= 1;
        anypVar.c = strAI;
        anym anymVar = new anym(aihhVar);
        String strAx = kro.ax(aamoVar.d());
        aihh aihhVar2 = anymVar.a;
        aihhVar2.copyOnWrite();
        anyp anypVar2 = (anyp) aihhVar2.instance;
        strAx.getClass();
        anypVar2.b |= 4;
        anypVar2.d = strAx;
        String strAK = kro.aK(aamoVar.d());
        aihhVar2.copyOnWrite();
        anyp anypVar3 = (anyp) aihhVar2.instance;
        strAK.getClass();
        anypVar3.b |= 64;
        anypVar3.k = strAK;
        aihf aihfVarCreateBuilder = anyq.a.createBuilder();
        hfn hfnVar = (hfn) this.b;
        String strL = hfnVar.l(aamoVar);
        aihfVarCreateBuilder.copyOnWrite();
        anyq anyqVar = (anyq) aihfVarCreateBuilder.instance;
        strL.getClass();
        anyqVar.b |= 1;
        anyqVar.c = strL;
        aihfVarCreateBuilder.copyOnWrite();
        anyq anyqVar2 = (anyq) aihfVarCreateBuilder.instance;
        anyqVar2.b |= 2;
        anyqVar2.d = "PPOM";
        anyq anyqVar3 = (anyq) aihfVarCreateBuilder.build();
        aihhVar2.copyOnWrite();
        anyp anypVar4 = (anyp) aihhVar2.instance;
        anyqVar3.getClass();
        aiie aiieVar = anypVar4.f;
        if (!aiieVar.c()) {
            anypVar4.f = aihn.mutableCopy(aiieVar);
        }
        anypVar4.f.add(anyqVar3);
        if (aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE.equals(hfnVar.i(aamoVar))) {
            anxf anxfVar = anxf.a;
            aihhVar2.copyOnWrite();
            anyp anypVar5 = (anyp) aihhVar2.instance;
            anxfVar.getClass();
            anypVar5.i = anxfVar;
            anypVar5.b |= 32;
        }
        return anymVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, wbz] */
    public final anyo m(aamt aamtVar) {
        anym anymVarL = l(aamtVar.a);
        long j = aamtVar.k;
        Long lValueOf = Long.valueOf(j);
        aihh aihhVar = anymVarL.a;
        lValueOf.getClass();
        aihhVar.copyOnWrite();
        anyp anypVar = (anyp) aihhVar.instance;
        anyp anypVar2 = anyp.a;
        anypVar.b |= 8;
        anypVar.e = j;
        long j2 = aamtVar.h;
        Long.valueOf(j2).getClass();
        aihhVar.copyOnWrite();
        anyp anypVar3 = (anyp) aihhVar.instance;
        anypVar3.b |= 16;
        anypVar3.g = j2;
        this.a.e(this.d.e());
        return anymVarL.am();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b0  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, wbz] */
    public final anyx n(aamo aamoVar) {
        String str;
        hfn hfnVar;
        aofe aofeVarH;
        int iAV;
        String strAH = kro.aH(aamoVar.d());
        strAH.getClass();
        ahno.P(!strAH.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anzd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anzd anzdVar = (anzd) aihfVarCreateBuilder.instance;
        anzdVar.b |= 1;
        anzdVar.c = strAH;
        anyv anyvVar = new anyv(aihfVarCreateBuilder);
        aqmh aqmhVarC = aamoVar.c();
        if (aqmhVarC != null) {
            aihf aihfVar = anyvVar.a;
            aihfVar.copyOnWrite();
            anzd anzdVar2 = (anzd) aihfVar.instance;
            anzdVar2.g = aqmhVarC;
            anzdVar2.b |= 16;
        }
        aofe aofeVarH2 = hfn.h(aamoVar);
        if (aofeVarH2 != null) {
            if ((aofeVarH2.b & SemanticState.Modal) != 0) {
                anok anokVar = aofeVarH2.l;
                if (anokVar == null) {
                    anokVar = anok.a;
                }
                aihf aihfVar2 = anyvVar.a;
                aihfVar2.copyOnWrite();
                anzd anzdVar3 = (anzd) aihfVar2.instance;
                anokVar.getClass();
                anzdVar3.B = anokVar;
                anzdVar3.b |= 16777216;
            }
            if ((aofeVarH2.b & SemanticState.Obscured) != 0) {
                String str2 = aofeVarH2.m;
                aihf aihfVar3 = anyvVar.a;
                aihfVar3.copyOnWrite();
                anzd anzdVar4 = (anzd) aihfVar3.instance;
                str2.getClass();
                anzdVar4.b |= 67108864;
                anzdVar4.D = str2;
            }
        }
        aohb aohbVar = (aohb) aamoVar.e;
        if ((aohbVar.b & SemanticState.Obscured) != 0) {
            alay alayVar = aohbVar.k;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            aihf aihfVar4 = anyvVar.a;
            aihfVar4.copyOnWrite();
            anzd anzdVar5 = (anzd) aihfVar4.instance;
            alayVar.getClass();
            anzdVar5.f = alayVar;
            anzdVar5.b |= 8;
        }
        Object obj = this.b;
        aofe aofeVarH3 = hfn.h(aamoVar);
        String str3 = "";
        if (aofeVarH3 == null) {
            ((aerv) ((hfn) obj).a).g();
            str = "";
        } else {
            str = aofeVarH3.c;
        }
        aihf aihfVar5 = anyvVar.a;
        aihfVar5.copyOnWrite();
        anzd anzdVar6 = (anzd) aihfVar5.instance;
        str.getClass();
        anzdVar6.b |= 4;
        anzdVar6.e = str;
        aofe aofeVarH4 = hfn.h(aamoVar);
        if (aofeVarH4 != null) {
            if (!aofeVarH4.d.isEmpty()) {
                str3 = aofeVarH4.d;
            }
            aihfVar5.copyOnWrite();
            anzd anzdVar7 = (anzd) aihfVar5.instance;
            str3.getClass();
            anzdVar7.b |= 32;
            anzdVar7.i = str3;
            String strD = aamoVar.d();
            aihfVar5.copyOnWrite();
            anzd anzdVar8 = (anzd) aihfVar5.instance;
            strD.getClass();
            anzdVar8.b |= 64;
            anzdVar8.j = strD;
            hfnVar = (hfn) obj;
            anzw anzwVarG = hfnVar.g(aamoVar);
            aihfVar5.copyOnWrite();
            anzd anzdVar9 = (anzd) aihfVar5.instance;
            anzdVar9.l = anzwVarG.k;
            anzdVar9.b |= SemanticState.Hidden;
            long jA = aamoVar.a() * 1000;
            Long.valueOf(jA).getClass();
            aihfVar5.copyOnWrite();
            anzd anzdVar10 = (anzd) aihfVar5.instance;
            anzdVar10.b |= 131072;
            anzdVar10.u = jA;
            String strK = hfnVar.k(aamoVar);
            aihfVar5.copyOnWrite();
            anzd anzdVar11 = (anzd) aihfVar5.instance;
            strK.getClass();
            anzdVar11.b |= 16384;
            anzdVar11.r = strK;
            String str4 = aohbVar.m;
            aihfVar5.copyOnWrite();
            anzd anzdVar12 = (anzd) aihfVar5.instance;
            str4.getClass();
            anzdVar12.b |= 268435456;
            anzdVar12.F = str4;
            String str5 = aohbVar.o;
            aihfVar5.copyOnWrite();
            anzd anzdVar13 = (anzd) aihfVar5.instance;
            str5.getClass();
            anzdVar13.b |= 536870912;
            anzdVar13.G = str5;
            aihf aihfVarCreateBuilder2 = anzb.a.createBuilder();
            aofeVarH = hfn.h(aamoVar);
            if (aofeVarH == null) {
                iAV = a.aV(aofeVarH.g);
                if (iAV == 0) {
                }
                aihfVarCreateBuilder2.copyOnWrite();
                anzb anzbVar = (anzb) aihfVarCreateBuilder2.instance;
                anzbVar.c = iAV - 1;
                anzbVar.b |= 1;
                aihfVar5.copyOnWrite();
                anzd anzdVar14 = (anzd) aihfVar5.instance;
                anzb anzbVar2 = (anzb) aihfVarCreateBuilder2.build();
                anzbVar2.getClass();
                anzdVar14.v = anzbVar2;
                anzdVar14.b |= 262144;
                String strAI = kro.aI(aamoVar.d());
                aihfVar5.copyOnWrite();
                anzd anzdVar15 = (anzd) aihfVar5.instance;
                strAI.getClass();
                anzdVar15.b |= 2097152;
                anzdVar15.y = strAI;
                String strAL = kro.aL(aamoVar.d());
                aihfVar5.copyOnWrite();
                anzd anzdVar16 = (anzd) aihfVar5.instance;
                strAL.getClass();
                anzdVar16.b |= 4194304;
                anzdVar16.z = strAL;
                boolean zC = igs.c(hfnVar.g(aamoVar));
                Boolean.valueOf(zC).getClass();
                aihfVar5.copyOnWrite();
                anzd anzdVar17 = (anzd) aihfVar5.instance;
                anzdVar17.b |= 8388608;
                anzdVar17.A = zC;
                long time = ((Date) aamoVar.d).getTime();
                Long.valueOf(time).getClass();
                aihfVar5.copyOnWrite();
                anzd anzdVar18 = (anzd) aihfVar5.instance;
                anzdVar18.b |= 33554432;
                anzdVar18.C = time;
                this.a.e(this.d.e());
                return anyvVar.am();
            }
            ((aerv) hfnVar.a).g();
            iAV = 1;
            aihfVarCreateBuilder2.copyOnWrite();
            anzb anzbVar3 = (anzb) aihfVarCreateBuilder2.instance;
            anzbVar3.c = iAV - 1;
            anzbVar3.b |= 1;
            aihfVar5.copyOnWrite();
            anzd anzdVar19 = (anzd) aihfVar5.instance;
            anzb anzbVar4 = (anzb) aihfVarCreateBuilder2.build();
            anzbVar4.getClass();
            anzdVar19.v = anzbVar4;
            anzdVar19.b |= 262144;
            String strAI2 = kro.aI(aamoVar.d());
            aihfVar5.copyOnWrite();
            anzd anzdVar110 = (anzd) aihfVar5.instance;
            strAI2.getClass();
            anzdVar110.b |= 2097152;
            anzdVar110.y = strAI2;
            String strAL2 = kro.aL(aamoVar.d());
            aihfVar5.copyOnWrite();
            anzd anzdVar111 = (anzd) aihfVar5.instance;
            strAL2.getClass();
            anzdVar111.b |= 4194304;
            anzdVar111.z = strAL2;
            boolean zC2 = igs.c(hfnVar.g(aamoVar));
            Boolean.valueOf(zC2).getClass();
            aihfVar5.copyOnWrite();
            anzd anzdVar112 = (anzd) aihfVar5.instance;
            anzdVar112.b |= 8388608;
            anzdVar112.A = zC2;
            long time2 = ((Date) aamoVar.d).getTime();
            Long.valueOf(time2).getClass();
            aihfVar5.copyOnWrite();
            anzd anzdVar113 = (anzd) aihfVar5.instance;
            anzdVar113.b |= 33554432;
            anzdVar113.C = time2;
            this.a.e(this.d.e());
            return anyvVar.am();
        }
        ((aerv) ((hfn) obj).a).g();
        aofe aofeVarH5 = hfn.h(aamoVar);
        if (aofeVarH5 != null) {
            str3 = aofeVarH5.e;
        }
        aihfVar5.copyOnWrite();
        anzd anzdVar20 = (anzd) aihfVar5.instance;
        str3.getClass();
        anzdVar20.b |= 32;
        anzdVar20.i = str3;
        String strD2 = aamoVar.d();
        aihfVar5.copyOnWrite();
        anzd anzdVar21 = (anzd) aihfVar5.instance;
        strD2.getClass();
        anzdVar21.b |= 64;
        anzdVar21.j = strD2;
        hfnVar = (hfn) obj;
        anzw anzwVarG2 = hfnVar.g(aamoVar);
        aihfVar5.copyOnWrite();
        anzd anzdVar22 = (anzd) aihfVar5.instance;
        anzdVar22.l = anzwVarG2.k;
        anzdVar22.b |= SemanticState.Hidden;
        long jA2 = aamoVar.a() * 1000;
        Long.valueOf(jA2).getClass();
        aihfVar5.copyOnWrite();
        anzd anzdVar114 = (anzd) aihfVar5.instance;
        anzdVar114.b |= 131072;
        anzdVar114.u = jA2;
        String strK2 = hfnVar.k(aamoVar);
        aihfVar5.copyOnWrite();
        anzd anzdVar115 = (anzd) aihfVar5.instance;
        strK2.getClass();
        anzdVar115.b |= 16384;
        anzdVar115.r = strK2;
        String str6 = aohbVar.m;
        aihfVar5.copyOnWrite();
        anzd anzdVar116 = (anzd) aihfVar5.instance;
        str6.getClass();
        anzdVar116.b |= 268435456;
        anzdVar116.F = str6;
        String str7 = aohbVar.o;
        aihfVar5.copyOnWrite();
        anzd anzdVar117 = (anzd) aihfVar5.instance;
        str7.getClass();
        anzdVar117.b |= 536870912;
        anzdVar117.G = str7;
        aihf aihfVarCreateBuilder3 = anzb.a.createBuilder();
        aofeVarH = hfn.h(aamoVar);
        if (aofeVarH == null) {
            iAV = a.aV(aofeVarH.g);
            if (iAV == 0) {
            }
            aihfVarCreateBuilder3.copyOnWrite();
            anzb anzbVar5 = (anzb) aihfVarCreateBuilder3.instance;
            anzbVar5.c = iAV - 1;
            anzbVar5.b |= 1;
            aihfVar5.copyOnWrite();
            anzd anzdVar118 = (anzd) aihfVar5.instance;
            anzb anzbVar6 = (anzb) aihfVarCreateBuilder3.build();
            anzbVar6.getClass();
            anzdVar118.v = anzbVar6;
            anzdVar118.b |= 262144;
            String strAI3 = kro.aI(aamoVar.d());
            aihfVar5.copyOnWrite();
            anzd anzdVar119 = (anzd) aihfVar5.instance;
            strAI3.getClass();
            anzdVar119.b |= 2097152;
            anzdVar119.y = strAI3;
            String strAL3 = kro.aL(aamoVar.d());
            aihfVar5.copyOnWrite();
            anzd anzdVar1110 = (anzd) aihfVar5.instance;
            strAL3.getClass();
            anzdVar1110.b |= 4194304;
            anzdVar1110.z = strAL3;
            boolean zC3 = igs.c(hfnVar.g(aamoVar));
            Boolean.valueOf(zC3).getClass();
            aihfVar5.copyOnWrite();
            anzd anzdVar1111 = (anzd) aihfVar5.instance;
            anzdVar1111.b |= 8388608;
            anzdVar1111.A = zC3;
            long time3 = ((Date) aamoVar.d).getTime();
            Long.valueOf(time3).getClass();
            aihfVar5.copyOnWrite();
            anzd anzdVar1112 = (anzd) aihfVar5.instance;
            anzdVar1112.b |= 33554432;
            anzdVar1112.C = time3;
            this.a.e(this.d.e());
            return anyvVar.am();
        }
        ((aerv) hfnVar.a).g();
        iAV = 1;
        aihfVarCreateBuilder3.copyOnWrite();
        anzb anzbVar7 = (anzb) aihfVarCreateBuilder3.instance;
        anzbVar7.c = iAV - 1;
        anzbVar7.b |= 1;
        aihfVar5.copyOnWrite();
        anzd anzdVar1113 = (anzd) aihfVar5.instance;
        anzb anzbVar8 = (anzb) aihfVarCreateBuilder3.build();
        anzbVar8.getClass();
        anzdVar1113.v = anzbVar8;
        anzdVar1113.b |= 262144;
        String strAI4 = kro.aI(aamoVar.d());
        aihfVar5.copyOnWrite();
        anzd anzdVar1114 = (anzd) aihfVar5.instance;
        strAI4.getClass();
        anzdVar1114.b |= 2097152;
        anzdVar1114.y = strAI4;
        String strAL4 = kro.aL(aamoVar.d());
        aihfVar5.copyOnWrite();
        anzd anzdVar1115 = (anzd) aihfVar5.instance;
        strAL4.getClass();
        anzdVar1115.b |= 4194304;
        anzdVar1115.z = strAL4;
        boolean zC4 = igs.c(hfnVar.g(aamoVar));
        Boolean.valueOf(zC4).getClass();
        aihfVar5.copyOnWrite();
        anzd anzdVar1116 = (anzd) aihfVar5.instance;
        anzdVar1116.b |= 8388608;
        anzdVar1116.A = zC4;
        long time4 = ((Date) aamoVar.d).getTime();
        Long.valueOf(time4).getClass();
        aihfVar5.copyOnWrite();
        anzd anzdVar1117 = (anzd) aihfVar5.instance;
        anzdVar1117.b |= 33554432;
        anzdVar1117.C = time4;
        this.a.e(this.d.e());
        return anyvVar.am();
    }

    public final anyx o(aamt aamtVar) {
        return n(aamtVar.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, wbz] */
    public final aohk p(aams aamsVar) {
        aohh aohhVar;
        aohi aohiVarE = aohk.e(kro.av(aamsVar.b));
        aogq aogqVar = aamsVar.c;
        if ((aogqVar.b & SemanticState.LiveRegion) != 0) {
            aoeu aoeuVar = aogqVar.l;
            if (aoeuVar == null) {
                aoeuVar = aoeu.a;
            }
            aohiVarE.ap(aoeuVar);
        }
        int i = aogqVar.c;
        if (i == 15) {
            aohiVarE.ar(i == 15 ? (aoet) aogqVar.d : aoet.a);
        }
        aohiVarE.aq(aogqVar.toByteString());
        aogp aogpVarA = aogp.a(aogqVar.h);
        if (aogpVarA == null) {
            aogpVarA = aogp.UNKNOWN;
        }
        int iOrdinal = aogpVarA.ordinal();
        if (iOrdinal != 1) {
            aohhVar = iOrdinal != 3 ? aohh.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN : aohh.OFFLINE_VIDEO_POLICY_ACTION_DISABLE;
        } else {
            aohhVar = aohh.OFFLINE_VIDEO_POLICY_ACTION_OK;
        }
        aohiVarE.am(aohhVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aohiVarE.an(Long.valueOf(aamsVar.a() / 1000));
        long j = aamsVar.e;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        aohiVarE.ao(Long.valueOf(j / 1000));
        this.a.e(this.d.e());
        return aohiVarE.as();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zwb] */
    public final aohq q(aamt aamtVar) {
        aoho aohoVarE = aohq.e(kro.aw(aamtVar.b()));
        aohoVarE.am(aagu.b(aamtVar));
        this.a.e(this.d.e());
        return aohoVarE.ao();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, wbz] */
    public final aoop r(aamt aamtVar) {
        String strB = aamtVar.b();
        aoon aoonVarF = aoop.f(kro.ax(strB));
        wjf wjfVar = aamtVar.r;
        if (wjfVar != null) {
            alvt alvtVar = ((wji) wjfVar).a;
            if (alvtVar != null) {
                aoonVarF.aq(alvtVar.toByteString());
            }
            ((aahg) this.c).l(aoonVarF, wjfVar);
        }
        aoonVarF.ar(Long.valueOf(aamtVar.f));
        aoonVarF.ao(kro.aJ(strB));
        aoonVarF.ap(kro.aK(strB));
        aoonVarF.an(kro.av(strB));
        return aoonVarF.I(this.a.e(this.d.e()));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, wbz] */
    public final aqph s(aamt aamtVar) {
        String strB = aamtVar.b();
        aqpf aqpfVarF = aqph.f(kro.aJ(strB));
        aagz aagzVarA = aagu.a(aamtVar);
        aqpfVarF.as(aagzVarA.a);
        Optional optional = aagzVarA.b;
        hge hgeVar = new hge(aqpfVarF, 11);
        if (true == optional.isPresent()) {
            ((aqpf) hgeVar.a).aq((aqpe) optional.get());
        }
        aqpfVarF.an(aagzVarA.c);
        aqpfVarF.ao(kro.aw(strB));
        return aqpfVarF.I(this.a.e(this.d.e()));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zwb] */
    public final anuc t(aamj aamjVar) {
        anua anuaVarP = P(aamjVar.a, (List) j$.util.Collection.EL.stream(aamjVar.b).map(new hpp(8)).collect(aghu.a), aamjVar.f, aamjVar.h);
        aihf aihfVar = anuaVarP.a;
        Long l = 0L;
        l.getClass();
        aihfVar.copyOnWrite();
        anud anudVar = (anud) aihfVar.instance;
        anud anudVar2 = anud.a;
        anudVar.b |= 64;
        anudVar.i = 0L;
        this.a.e(this.d.e());
        return anuaVarP.am();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, wbz] */
    public final anuc u(aamh aamhVar, List list, long j, aogf aogfVar) {
        anua anuaVarP = P(aamhVar, (List) j$.util.Collection.EL.stream(list).map(new hpp(8)).collect(aghu.a), j, aogfVar);
        this.a.e(this.d.e());
        return anuaVarP.am();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, wbz] */
    public final anuk v(aamj aamjVar) {
        Object objValueOf;
        int i;
        List list = aamjVar.b;
        List list2 = (List) j$.util.Collection.EL.stream(list).map(new hpp(9)).collect(aghu.a);
        aamh aamhVar = aamjVar.a;
        anui anuiVarO = O(aamhVar, list2);
        Optional optionalEmpty = Optional.empty();
        if (hlz.m(aamhVar)) {
            aaew aaewVarD = ((aanb) this.c.io()).b().d();
            optionalEmpty = Optional.of(Long.valueOf(aaewVarD == null ? 0L : j$.util.Collection.EL.stream(list).filter(new gnh(aaewVarD, 14)).count()));
        }
        yyj yyjVar = new yyj(hlz.c(aamhVar), aamjVar, 1);
        if (true != optionalEmpty.isPresent()) {
            Object obj = yyjVar.a;
            Object obj2 = yyjVar.b;
            if (obj != null) {
                aofc aofcVar = (aofc) obj;
                if ((aofcVar.b & SemanticState.LiveRegion) != 0) {
                    i = aofcVar.j;
                } else {
                    i = ((aamj) obj2).a.d;
                }
            } else {
                i = ((aamj) obj2).a.d;
            }
            objValueOf = Long.valueOf(i);
        } else {
            objValueOf = optionalEmpty.get();
        }
        anuiVarO.ap((Long) objValueOf);
        this.a.e(this.d.e());
        return anuiVarO.aq();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, wbz] */
    public final anuk w(aamh aamhVar, List list) {
        anui anuiVarO = O(aamhVar, (List) j$.util.Collection.EL.stream(list).map(new hpp(9)).collect(aghu.a));
        this.a.e(this.d.e());
        return anuiVarO.aq();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [ahbw, java.lang.Object] */
    public final woo x(ajwo ajwoVar) {
        woo wooVarL;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("command must be a BrowseEndpoint");
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajmf ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (ajmfVar.c.equals("FEmusic_home")) {
            long jD = ((vxz) this.d).d(1, 45358178L);
            if (jD > 0) {
                aihf aihfVarCreateBuilder = ascs.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ascs ascsVar = (ascs) aihfVarCreateBuilder.instance;
                ascsVar.b |= 1;
                ascsVar.c = true;
                aijp aijpVarAv = ahng.av(this.b.a().plusMillis(jD));
                aihfVarCreateBuilder.copyOnWrite();
                ascs ascsVar2 = (ascs) aihfVarCreateBuilder.instance;
                aijpVarAv.getClass();
                ascsVar2.d = aijpVarAv;
                ascsVar2.b |= 2;
                ascs ascsVar3 = (ascs) aihfVarCreateBuilder.build();
                wom womVar = (wom) this.a;
                String str = womVar.d;
                abxv abxvVar = womVar.b;
                zwa zwaVarE = womVar.c.e();
                boolean zK = womVar.k();
                boolean zJ = womVar.j();
                boolean z = womVar.e;
                tqj tqjVar = womVar.i;
                int i = tqr.a;
                wooVarL = new woo(abxvVar, zwaVarE, false, zK, zJ, z, ascsVar3, !tqjVar.k(1073815177));
                womVar.m(wooVarL);
            } else {
                wooVarL = ((wom) this.a).l();
            }
        } else {
            wooVarL = ((wom) this.a).l();
        }
        String str2 = ajmfVar.c;
        if (hdu.c.contains(str2)) {
            str2 = "FEmusic_offline";
        } else if (hdu.e.contains(str2)) {
            str2 = "FEmusic_library_sideloaded_tracks";
        }
        wooVarL.J(str2);
        if (str2.equals("SPunlimited") || str2.equals("FEmusic_home")) {
            String str3 = (String) this.c.io();
            if (!TextUtils.isEmpty(str3)) {
                wooVarL.r = str3;
            }
        }
        wooVarL.n(ajwoVar.c);
        wooVarL.L(ajmfVar.d);
        if ((ajmfVar.b & 64) != 0) {
            aihf aihfVarCreateBuilder2 = ajmm.a.createBuilder();
            ajmi ajmiVar = ajmfVar.h;
            if (ajmiVar == null) {
                ajmiVar = ajmi.a;
            }
            aiie aiieVar = ajmiVar.d;
            aihfVarCreateBuilder2.copyOnWrite();
            ajmm ajmmVar = (ajmm) aihfVarCreateBuilder2.instance;
            aiie aiieVar2 = ajmmVar.d;
            if (!aiieVar2.c()) {
                ajmmVar.d = aihn.mutableCopy(aiieVar2);
            }
            aifs.addAll(aiieVar, ajmmVar.d);
            ajmi ajmiVar2 = ajmfVar.h;
            if (ajmiVar2 == null) {
                ajmiVar2 = ajmi.a;
            }
            aiie aiieVar3 = ajmiVar2.e;
            aihfVarCreateBuilder2.copyOnWrite();
            ajmm ajmmVar2 = (ajmm) aihfVarCreateBuilder2.instance;
            aiie aiieVar4 = ajmmVar2.e;
            if (!aiieVar4.c()) {
                ajmmVar2.e = aihn.mutableCopy(aiieVar4);
            }
            aifs.addAll(aiieVar3, ajmmVar2.e);
            ajmi ajmiVar3 = ajmfVar.h;
            if ((ajmiVar3 == null ? ajmi.a : ajmiVar3).b == 393677516) {
                if (ajmiVar3 == null) {
                    ajmiVar3 = ajmi.a;
                }
                aqjp aqjpVar = ajmiVar3.b == 393677516 ? (aqjp) ajmiVar3.c : aqjp.a;
                aihfVarCreateBuilder2.copyOnWrite();
                ajmm ajmmVar3 = (ajmm) aihfVarCreateBuilder2.instance;
                aqjpVar.getClass();
                ajmmVar3.c = aqjpVar;
                ajmmVar3.b = 393677516;
            }
            wooVarL.d = (ajmm) aihfVarCreateBuilder2.build();
        }
        return wooVarL;
    }

    public final void y(gzh gzhVar) {
        if (gzhVar != null) {
            ((CopyOnWriteArrayList) this.b).add(new WeakReference(gzhVar));
        }
    }

    public final void z(gzh gzhVar) {
        gzh gzhVar2;
        if (gzhVar != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference != null && ((gzhVar2 = (gzh) weakReference.get()) == null || gzhVar.equals(gzhVar2))) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
        }
    }

    public jnm(awmd awmdVar, hzl hzlVar, awmd awmdVar2, vxz vxzVar) {
        this.b = awmdVar;
        this.c = hzlVar;
        this.d = awmdVar2;
        this.a = vxzVar;
    }

    public jnm(awmd awmdVar, vns vnsVar, wom womVar, wrp wrpVar) {
        this.c = awmdVar;
        this.d = vnsVar;
        this.a = womVar;
        this.b = wrpVar;
    }

    public jnm(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.d = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public jnm(ttm ttmVar, xgm xgmVar, swh swhVar, taq taqVar) {
        this.a = ttmVar;
        this.d = xgmVar;
        this.b = swhVar;
        this.c = taqVar;
    }

    public jnm(wbz wbzVar, hlz hlzVar, hfn hfnVar, zwb zwbVar) {
        this.d = wbzVar;
        this.c = hlzVar;
        this.a = hfnVar;
        this.b = zwbVar;
    }

    public jnm(wbz wbzVar, Object obj, zwb zwbVar, Object obj2) {
        this.a = wbzVar;
        this.b = obj;
        this.d = zwbVar;
        this.c = obj2;
    }

    public jnm(wuo wuoVar, wup wupVar, jij jijVar, vxz vxzVar) {
        this.b = wuoVar;
        this.c = wupVar;
        this.d = jijVar;
        this.a = vxzVar;
    }

    public jnm(Application application, aunn aunnVar, aunn aunnVar2, tqj tqjVar) {
        this.a = application;
        this.c = aunnVar;
        this.b = aunnVar2;
        this.d = tqjVar;
    }

    public jnm(Context context, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        context.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
        this.c = context;
        this.b = awmdVar;
        this.a = awmdVar2;
        this.d = awmdVar3;
    }

    public jnm(aunn aunnVar, aunn aunnVar2, awut awutVar, Executor executor) {
        aunnVar.getClass();
        aunnVar2.getClass();
        awutVar.getClass();
        executor.getClass();
        this.a = aunnVar;
        this.d = aunnVar2;
        this.c = awutVar;
        this.b = executor;
    }

    public jnm(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
    }

    public jnm(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr) {
        awmdVar.getClass();
        this.d = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
        this.a = awmdVar4;
    }

    public jnm(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
    }

    public jnm(fvv fvvVar, fvg fvgVar, Object obj) {
        this.c = new HashSet();
        this.d = fvvVar;
        this.a = fvgVar;
        this.b = obj;
    }

    public jnm(zwb zwbVar, axfd axfdVar) {
        this.d = zwbVar;
        this.a = axfdVar;
        this.b = new CopyOnWriteArrayList();
        this.c = new ConcurrentHashMap();
    }

    public jnm(cf cfVar, khn khnVar, avmb avmbVar) {
        cfVar.getClass();
        khnVar.getClass();
        avmbVar.getClass();
        this.a = cfVar;
        this.b = khnVar;
        this.c = avmbVar;
        this.d = new avmm();
    }
}
