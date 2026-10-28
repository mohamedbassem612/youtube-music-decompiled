package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikg {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final awmd d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public ikg(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14) {
        awmdVar.getClass();
        this.e = awmdVar;
        awmdVar2.getClass();
        this.f = awmdVar2;
        this.g = awmdVar3;
        awmdVar4.getClass();
        this.h = awmdVar4;
        awmdVar5.getClass();
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.b = awmdVar6;
        awmdVar7.getClass();
        this.c = awmdVar7;
        awmdVar8.getClass();
        this.i = awmdVar8;
        awmdVar9.getClass();
        this.j = awmdVar9;
        this.d = awmdVar10;
        awmdVar11.getClass();
        this.k = awmdVar11;
        awmdVar12.getClass();
        this.l = awmdVar12;
        this.m = awmdVar13;
        awmdVar14.getClass();
        this.n = awmdVar14;
    }

    public static boolean j(ahbw ahbwVar, anvi anviVar, aamt aamtVar) {
        long j = aamtVar.h;
        boolean z = anviVar.d && ((j > 0L ? 1 : (j == 0L ? 0 : -1)) > 0 && (aajg.c(aamtVar.a.a(), aamtVar.i) > 0.0f ? 1 : (aajg.c(aamtVar.a.a(), aamtVar.i) == 0.0f ? 0 : -1)) == 0);
        Instant instantA = ahbwVar.a();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(Math.max(j, aamtVar.k));
        if (z) {
            return instantOfEpochMilli.plusSeconds(anviVar.e).isBefore(instantA);
        }
        return anviVar.f && instantOfEpochMilli.plusSeconds(anviVar.g).isBefore(instantA);
    }

    public static final void l(aaqn aaqnVar, aamh aamhVar, Collection collection) {
        aaqu aaquVarM = aaqnVar.m();
        if (aaquVarM != null) {
            aaquVarM.b(aamhVar, collection);
        }
    }

    public static final void n(aaew aaewVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((aamo) it.next()).b;
            if (obj != null) {
                o(aaewVar, (aaok) obj);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public static final void o(aaew aaewVar, aaok aaokVar) {
        ?? r0 = aaokVar.b;
        if (TextUtils.isEmpty(r0)) {
            return;
        }
        if (aaewVar.av((String) r0) == null) {
            aaewVar.ab(aaokVar);
        } else {
            aaewVar.ac(aaokVar);
        }
    }

    public static final aazo r(aofu aofuVar, int i) {
        agke agkeVar = (agke) j$.util.Collection.EL.stream(aofuVar.f).map(new hrn(14)).limit(i).collect(aghu.a);
        return new aazo(new aamh(aamh.a(aofuVar), agkeVar.size()), (List) agkeVar);
    }

    public final aaqn a(zwa zwaVar) {
        aaqn aaqnVarB = ((aanb) this.c.io()).b();
        String strS = aaqnVarB.s();
        if (Objects.equals(zwaVar.k(), strS) || Objects.equals(zwaVar.i(), strS)) {
            return aaqnVarB;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture b(String str) {
        return ahno.ar(((hpy) this.j.io()).a(kro.at(str)), new hqt(6), this.m);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture c(aaqn aaqnVar, aamh aamhVar, List list) {
        return (((vxz) this.f).l(20, 45651451L, false) || !hlz.m(aamhVar)) ? d(aaqnVar, Optional.empty(), list) : ahno.as(b(aamhVar.a), new hlk(this, aaqnVar, list, 2), this.m);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture d(aaqn aaqnVar, Optional optional, List list) {
        ListenableFuture listenableFutureN;
        long jOrElse = j$.util.Collection.EL.stream(list).mapToLong(new cpt(7)).max().orElse(0L);
        agjz agjzVar = new agjz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aamo aamoVar = (aamo) it.next();
            aohb aohbVar = (aohb) aamoVar.e;
            long j = aohbVar.h;
            if (optional.isEmpty()) {
                listenableFutureN = ahng.n(Boolean.valueOf(hfn.n(aaqnVar.d(), aamoVar.d())));
            } else {
                ansx ansxVar = (ansx) optional.get();
                if (ansxVar.getAutoSyncType() == aofs.OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_METADATA_ONLY || (j < jOrElse && (aohbVar.b & 32) != 0 && (ansxVar.c.b & 4) != 0 && aohbVar.h < ansxVar.getAutoDownloadBoundaryTimestampSeconds().longValue())) {
                    listenableFutureN = ahng.n(Boolean.FALSE);
                } else {
                    listenableFutureN = ahng.n(Boolean.valueOf(hfn.n(aaqnVar.d(), aamoVar.d())));
                }
            }
            agjzVar.h(ahno.ar(listenableFutureN, new hrk(aamoVar, 5), this.l));
        }
        agke agkeVarG = agjzVar.g();
        return ahno.au(agkeVarG).k(new uf(agkeVarG, new HashSet(), 16, null), this.l);
    }

    public final aofh e(aamo aamoVar, aamh aamhVar, aohx aohxVar, aamn aamnVar, aogf aogfVar, boolean z, byte[] bArr, aofa aofaVar) {
        aihf aihfVarCreateBuilder = anyr.a.createBuilder();
        anzd anzdVar = ((jnm) this.i).n(aamoVar).c;
        aihfVarCreateBuilder.copyOnWrite();
        anyr anyrVar = (anyr) aihfVarCreateBuilder.instance;
        anzdVar.getClass();
        anyrVar.f = anzdVar;
        anyrVar.c |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        anyr anyrVar2 = (anyr) aihfVarCreateBuilder.instance;
        anyrVar2.c |= 32;
        String str = aamhVar.a;
        anyrVar2.i = str;
        aihfVarCreateBuilder.copyOnWrite();
        anyr anyrVar3 = (anyr) aihfVarCreateBuilder.instance;
        anyrVar3.e = aohxVar.l;
        anyrVar3.c |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        anyr anyrVar4 = (anyr) aihfVarCreateBuilder.instance;
        anyrVar4.c |= 64;
        anyrVar4.j = aamnVar.h;
        hfn hfnVar = (hfn) this.e;
        String strL = hfnVar.l(aamoVar);
        aihfVarCreateBuilder.copyOnWrite();
        anyr anyrVar5 = (anyr) aihfVarCreateBuilder.instance;
        strL.getClass();
        anyrVar5.c |= 16;
        anyrVar5.h = strL;
        aihfVarCreateBuilder.copyOnWrite();
        anyr anyrVar6 = (anyr) aihfVarCreateBuilder.instance;
        anyrVar6.l = aogfVar.e;
        anyrVar6.c |= SemanticState.LiveRegion;
        aihfVarCreateBuilder.copyOnWrite();
        anyr anyrVar7 = (anyr) aihfVarCreateBuilder.instance;
        anyrVar7.c |= SemanticState.Hidden;
        anyrVar7.k = z;
        if (bArr != null) {
            aigj aigjVarV = aigj.v(bArr);
            aihfVarCreateBuilder.copyOnWrite();
            anyr anyrVar8 = (anyr) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            anyrVar8.c |= 1;
            anyrVar8.d = aigjVarV;
        }
        if (((hlz) this.n).k(aamhVar) && !hfnVar.k(aamoVar).isEmpty()) {
            aihh aihhVar = (aihh) ankd.a.createBuilder();
            String strAm = kro.am(str);
            aihhVar.copyOnWrite();
            ankd ankdVar = (ankd) aihhVar.instance;
            strAm.getClass();
            ankdVar.b |= 1;
            ankdVar.c = strAm;
            String strK = hfnVar.k(aamoVar);
            aihhVar.copyOnWrite();
            ankd ankdVar2 = (ankd) aihhVar.instance;
            strK.getClass();
            ankdVar2.b |= 4;
            ankdVar2.e = strK;
            ankd ankdVar3 = (ankd) aihhVar.build();
            aihfVarCreateBuilder.copyOnWrite();
            anyr anyrVar9 = (anyr) aihfVarCreateBuilder.instance;
            ankdVar3.getClass();
            anyrVar9.g = ankdVar3;
            anyrVar9.c |= 8;
        }
        aihh aihhVar2 = (aihh) aofg.b.createBuilder();
        aihhVar2.e(anyr.b, (anyr) aihfVarCreateBuilder.build());
        aihhVar2.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar2.instance;
        aofaVar.getClass();
        aofgVar.g = aofaVar;
        aofgVar.c |= 2;
        ((Integer) this.k).intValue();
        int iK = hmy.k(2, 28, aogfVar);
        aihhVar2.copyOnWrite();
        aofg aofgVar2 = (aofg) aihhVar2.instance;
        aofgVar2.c |= 1;
        aofgVar2.d = iK;
        aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder2.instance;
        aofhVar.c = 1;
        aofhVar.b |= 1;
        String strAH = kro.aH(aamoVar.d());
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
        strAH.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = strAH;
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
        aofg aofgVar3 = (aofg) aihhVar2.build();
        aofgVar3.getClass();
        aofhVar3.e = aofgVar3;
        aofhVar3.b |= 4;
        return (aofh) aihfVarCreateBuilder2.build();
    }

    public final List f(final aamh aamhVar, List list, final aohx aohxVar, final Set set, final aamn aamnVar, final aogf aogfVar, final byte[] bArr, final aofa aofaVar) {
        return (List) j$.util.Collection.EL.stream(list).map(new Function() { // from class: hss
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aamo aamoVar = (aamo) obj;
                boolean zContains = set.contains(aamoVar.d());
                return this.h.e(aamoVar, aamhVar, aohxVar, aamnVar, aogfVar, zContains, bArr, aofaVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new hcd(17)));
    }

    public final void g(String str, int i) {
        agrx agrxVar = agso.a;
        ((tbt) this.g).e(new aahk(str, i));
    }

    public final void h(String str) {
        agrx agrxVar = agso.a;
        ((tbt) this.g).e(new aahm(str));
    }

    public final void i(String str) {
        agrx agrxVar = agso.a;
        ((tbt) this.g).e(new aahn(str));
    }

    public final aodp k() {
        return ((hlp) this.a.io()).c();
    }

    public final aofh m(String str, String str2, String str3, aogf aogfVar, int i) {
        aihf aihfVarCreateBuilder = aofh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
        aofhVar.c = 2;
        aofhVar.b |= 1;
        String strAH = kro.aH(str);
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
        strAH.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = strAH;
        aihf aihfVarCreateBuilder2 = anyr.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anyr anyrVar = (anyr) aihfVarCreateBuilder2.instance;
        anyrVar.c |= 32;
        anyrVar.i = str2;
        if (str3 != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            anyr anyrVar2 = (anyr) aihfVarCreateBuilder2.instance;
            anyrVar2.c |= 16;
            anyrVar2.h = str3;
        }
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        ((Integer) this.k).intValue();
        int iK = hmy.k(3, 28, aogfVar);
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofgVar.c |= 1;
        aofgVar.d = iK;
        aihf aihfVarCreateBuilder3 = aofa.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aofa aofaVar = (aofa) aihfVarCreateBuilder3.instance;
        aofaVar.c = i - 1;
        aofaVar.b |= 1;
        aofa aofaVar2 = (aofa) aihfVarCreateBuilder3.build();
        aihhVar.copyOnWrite();
        aofg aofgVar2 = (aofg) aihhVar.instance;
        aofaVar2.getClass();
        aofgVar2.g = aofaVar2;
        aofgVar2.c |= 2;
        aihhVar.e(anyr.b, (anyr) aihfVarCreateBuilder2.build());
        aofg aofgVar3 = (aofg) aihhVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
        aofgVar3.getClass();
        aofhVar3.e = aofgVar3;
        aofhVar3.b |= 4;
        return (aofh) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ahbw, java.lang.Object] */
    public final aazo p(zwa zwaVar, String str, int i, anvi anviVar) throws ExecutionException {
        aaqn aaqnVarA = a(zwaVar);
        if (aaqnVarA == null) {
            throw new ExecutionException(new Throwable("OfflineStore was empty null"));
        }
        aamj aamjVarA = aaqnVarA.i().a(str);
        Set setN = aamjVarA == null ? agpr.a : agkz.n(aamjVarA.b);
        Collection<aamt> collectionH = aaqnVarA.l().h();
        ArrayList arrayList = new ArrayList();
        for (aamt aamtVar : collectionH) {
            if (!hfn.m(aamtVar.n) && !j(this.h, anviVar, aamtVar)) {
                if (!setN.contains(aamtVar.b())) {
                    if (aamtVar.e) {
                        aofe aofeVarH = hfn.h(aamtVar.a);
                        if (aofeVarH == null ? false : aofeVarH.m.equals(str)) {
                        }
                    }
                }
                arrayList.add(aamtVar.b());
            }
        }
        return ((abfv) this.d.io()).B(str, i, new hpm(str, (List) arrayList, aamjVarA, 4));
    }

    public final aazo q(String str, int i) {
        return ((abfv) this.d.io()).A(str, i);
    }

    public ikg(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, aunn aunnVar, jnm jnmVar, hfn hfnVar, hlz hlzVar, Executor executor, Executor executor2, tbt tbtVar, Integer num, vxz vxzVar, ahbw ahbwVar) {
        this.c = awmdVar;
        this.a = awmdVar2;
        this.d = awmdVar3;
        this.b = awmdVar4;
        this.i = jnmVar;
        this.e = hfnVar;
        this.n = hlzVar;
        this.l = executor;
        this.m = executor2;
        this.g = tbtVar;
        this.k = num;
        this.j = aunnVar;
        this.f = vxzVar;
        this.h = ahbwVar;
    }
}
