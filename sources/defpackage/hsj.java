package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hsj implements aant {
    static final aans a = new hsi();
    public final Context b;
    public final Executor c;
    public final Executor d;
    public final tbt e;
    public final aauk f;
    public final aaqg g;
    public final vxz h;
    public final vxz i;
    public final hwz j;
    public final hfn k;
    public final abfv l;
    private final aapw m;
    private final hqg n;
    private final aanb o;
    private final vxz p;
    private final hef q;
    private final abfv r;
    private final abfv s;
    private final abfv t;

    public hsj(Context context, aanb aanbVar, abfv abfvVar, aapw aapwVar, aaqg aaqgVar, abfv abfvVar2, abfv abfvVar3, Executor executor, Executor executor2, tbt tbtVar, aauk aaukVar, abfv abfvVar4, hqg hqgVar, hfn hfnVar, hwz hwzVar, hef hefVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3) {
        this.b = context;
        this.o = aanbVar;
        this.t = abfvVar;
        this.m = aapwVar;
        this.g = aaqgVar;
        this.r = abfvVar2;
        this.l = abfvVar3;
        this.c = executor;
        this.d = true != vxzVar3.m(21, 45659204L) ? executor2 : executor;
        this.e = tbtVar;
        this.f = aaukVar;
        this.s = abfvVar4;
        this.n = hqgVar;
        this.k = hfnVar;
        this.j = hwzVar;
        this.q = hefVar;
        this.p = vxzVar;
        this.h = vxzVar2;
        this.i = vxzVar3;
    }

    public static final aamo h(anzd anzdVar, String str, ankd ankdVar, String str2) {
        aihf aihfVarCreateBuilder = aofe.a.createBuilder();
        String str3 = anzdVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        aofe aofeVar = (aofe) aihfVarCreateBuilder.instance;
        str3.getClass();
        aofeVar.b |= 1;
        aofeVar.c = str3;
        String str4 = anzdVar.i;
        aihfVarCreateBuilder.copyOnWrite();
        aofe aofeVar2 = (aofe) aihfVarCreateBuilder.instance;
        str4.getClass();
        aofeVar2.b |= 4;
        aofeVar2.d = str4;
        String str5 = anzdVar.i;
        aihfVarCreateBuilder.copyOnWrite();
        aofe aofeVar3 = (aofe) aihfVarCreateBuilder.instance;
        str5.getClass();
        aofeVar3.b |= 16;
        aofeVar3.e = str5;
        anzw anzwVarA = anzw.a(anzdVar.l);
        if (anzwVarA == null) {
            anzwVarA = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aofe aofeVar4 = (aofe) aihfVarCreateBuilder.instance;
        aofeVar4.i = anzwVarA.k;
        aofeVar4.b |= SemanticState.Hidden;
        anzb anzbVar = anzdVar.v;
        if (anzbVar == null) {
            anzbVar = anzb.a;
        }
        int iAV = a.aV(anzbVar.c);
        if (iAV == 0) {
            iAV = 1;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aofe aofeVar5 = (aofe) aihfVarCreateBuilder.instance;
        aofeVar5.g = iAV - 1;
        aofeVar5.b |= 64;
        String str6 = ankdVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        aofe aofeVar6 = (aofe) aihfVarCreateBuilder.instance;
        str6.getClass();
        aofeVar6.b |= SemanticState.Focused;
        aofeVar6.h = str6;
        aihfVarCreateBuilder.copyOnWrite();
        aofe aofeVar7 = (aofe) aihfVarCreateBuilder.instance;
        str2.getClass();
        aofeVar7.b |= 32;
        aofeVar7.f = str2;
        if (Objects.equals(str, "PPSDST")) {
            aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
            aihfVarCreateBuilder.copyOnWrite();
            aofe aofeVar8 = (aofe) aihfVarCreateBuilder.instance;
            aofeVar8.k = aogfVar.e;
            aofeVar8.b |= SemanticState.ReadOnly;
        }
        if ((anzdVar.b & 16777216) != 0) {
            anok anokVar = anzdVar.B;
            if (anokVar == null) {
                anokVar = anok.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            aofe aofeVar9 = (aofe) aihfVarCreateBuilder.instance;
            anokVar.getClass();
            aofeVar9.l = anokVar;
            aofeVar9.b |= SemanticState.Modal;
        }
        if ((anzdVar.b & 67108864) != 0) {
            String str7 = anzdVar.D;
            aihfVarCreateBuilder.copyOnWrite();
            aofe aofeVar10 = (aofe) aihfVarCreateBuilder.instance;
            str7.getClass();
            aofeVar10.b |= SemanticState.Obscured;
            aofeVar10.m = str7;
        }
        String strC = nsj.c(Duration.ofMillis(anzdVar.u).toSeconds());
        aihf aihfVarCreateBuilder2 = aohb.a.createBuilder();
        String str8 = anzdVar.j;
        aihfVarCreateBuilder2.copyOnWrite();
        aohb aohbVar = (aohb) aihfVarCreateBuilder2.instance;
        str8.getClass();
        aohbVar.b |= 1;
        aohbVar.c = str8;
        aqmh aqmhVar = anzdVar.g;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        aohb aohbVar2 = (aohb) aihfVarCreateBuilder2.instance;
        aqmhVar.getClass();
        aohbVar2.d = aqmhVar;
        aohbVar2.b |= 2;
        aihfVarCreateBuilder2.copyOnWrite();
        aohb aohbVar3 = (aohb) aihfVarCreateBuilder2.instance;
        aohbVar3.b |= 16;
        aohbVar3.g = strC;
        String str9 = anzdVar.F;
        aihfVarCreateBuilder2.copyOnWrite();
        aohb aohbVar4 = (aohb) aihfVarCreateBuilder2.instance;
        str9.getClass();
        aohbVar4.b |= 16384;
        aohbVar4.m = str9;
        String str10 = anzdVar.G;
        aihfVarCreateBuilder2.copyOnWrite();
        aohb aohbVar5 = (aohb) aihfVarCreateBuilder2.instance;
        str10.getClass();
        aohbVar5.b |= 65536;
        aohbVar5.o = str10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = anzdVar.u / 1000;
        aihfVarCreateBuilder2.copyOnWrite();
        aohb aohbVar6 = (aohb) aihfVarCreateBuilder2.instance;
        aohbVar6.b |= 262144;
        aohbVar6.q = j;
        String string = ixt.u(anzdVar.j).toString();
        aihfVarCreateBuilder2.copyOnWrite();
        aohb aohbVar7 = (aohb) aihfVarCreateBuilder2.instance;
        string.getClass();
        aohbVar7.b |= SemanticState.Modal;
        aohbVar7.j = string;
        long seconds = Duration.ofMillis(anzdVar.C).toSeconds();
        aihfVarCreateBuilder2.copyOnWrite();
        aohb aohbVar8 = (aohb) aihfVarCreateBuilder2.instance;
        aohbVar8.b |= 32;
        aohbVar8.h = seconds;
        aihf aihfVarCreateBuilder3 = aoha.a.createBuilder();
        aofe aofeVar11 = (aofe) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder3.copyOnWrite();
        aoha aohaVar = (aoha) aihfVarCreateBuilder3.instance;
        aofeVar11.getClass();
        aohaVar.c = aofeVar11;
        aohaVar.b |= 1;
        aihfVarCreateBuilder2.bY((aoha) aihfVarCreateBuilder3.build());
        if ((anzdVar.b & 8) != 0) {
            alay alayVar = anzdVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aohb aohbVar9 = (aohb) aihfVarCreateBuilder2.instance;
            alayVar.getClass();
            aohbVar9.k = alayVar;
            aohbVar9.b |= SemanticState.Obscured;
        }
        return aamo.b((aohb) aihfVarCreateBuilder2.build());
    }

    public static final boolean i(aofh aofhVar) {
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anyr.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        return m((anyr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
    }

    private final aaew j(zwa zwaVar) {
        aaqn aaqnVarB = this.o.b();
        if (zwaVar.k().equals(aaqnVarB.s())) {
            return aaqnVarB.d();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture k(zwa zwaVar, agke agkeVar) {
        agke agkeVar2 = agkeVar;
        final aaqn aaqnVarB = this.o.b();
        final aaew aaewVarD = aaqnVarB.d();
        if (!zwaVar.k().equals(aaqnVarB.s())) {
            return ahng.n(a.Q(((agpi) agkeVar2).d, 35));
        }
        if (aaewVarD == null) {
            return ahng.n(a.Q(((agpi) agkeVar2).d, 15));
        }
        final ArrayList arrayList = new ArrayList();
        int i = ((agpi) agkeVar2).d;
        ArrayList arrayList2 = new ArrayList(i);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < i) {
            aofh aofhVar = (aofh) agkeVar2.get(i2);
            String strH = wfs.h(aofhVar.d);
            arrayList.add(strH);
            int i3 = i2;
            long jAe = aaewVarD.ae(strH);
            linkedHashMap2.put(strH, Boolean.valueOf(this.k.i(aaewVarD.aj(strH)) == aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE));
            boolean z = jAe > -1;
            if (z) {
                arrayList2.add(new aapu(strH, jAe));
            }
            linkedHashMap.put(strH, Boolean.valueOf(z));
            aofg aofgVar = aofhVar.e;
            if (aofgVar == null) {
                aofgVar = aofg.b;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anyr.b);
            aofgVar.c(aihlVarCheckIsLite);
            Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
            aogf aogfVarA = aogf.a(((anyr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).l);
            if (aogfVarA == null) {
                aogfVarA = aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
            }
            map.put(strH, aogfVarA);
            i2 = i3 + 1;
            agkeVar2 = agkeVar;
        }
        if (arrayList2.isEmpty()) {
            return ahng.n(a.Q(i, 26));
        }
        if (this.p.m(41, 45377221L)) {
            aapw aapwVar = this.m;
            aapv aapvVarA = aapwVar.a();
            Collection.EL.stream(arrayList2).forEach(new hsk(aapvVarA, 1));
            aapvVarA.a = 4;
            final int i4 = 1;
            return ahno.ar(aapwVar.b(aapvVarA, this.c), new agek(this) { // from class: hsf
                public final /* synthetic */ hsj a;

                {
                    this.a = this;
                }

                @Override // defpackage.agek
                public final Object apply(Object obj) {
                    if (i4 != 0) {
                        String strS = aaqnVarB.s();
                        Map map2 = (Map) Collection.EL.stream(((aluf) obj).c).collect(aghu.a(new hrn(4), new hrn(5)));
                        Map map3 = map;
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        LinkedHashMap linkedHashMap4 = linkedHashMap;
                        ArrayList arrayList3 = arrayList;
                        return this.a.e(strS, aaewVarD, arrayList3, linkedHashMap4, linkedHashMap3, map3, map2);
                    }
                    Map map4 = (Map) obj;
                    aaqn aaqnVar = aaqnVarB;
                    Map map5 = map;
                    LinkedHashMap linkedHashMap5 = linkedHashMap2;
                    LinkedHashMap linkedHashMap6 = linkedHashMap;
                    ArrayList arrayList4 = arrayList;
                    return this.a.e(aaqnVar.s(), aaewVarD, arrayList4, linkedHashMap6, linkedHashMap5, map5, map4);
                }
            }, this.d);
        }
        abfv abfvVar = this.t;
        aaqc aaqcVar = (aaqc) abfvVar.a;
        aaqb aaqbVarB = aaqcVar.b();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            aapu aapuVar = (aapu) it.next();
            String str = aapuVar.a;
            long j = aapuVar.b;
            List list = aaqbVarB.c;
            aihf aihfVarCreateBuilder = altx.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            Iterator it2 = it;
            altx altxVar = (altx) aihfVarCreateBuilder.instance;
            altxVar.b |= 1;
            altxVar.c = str;
            aihfVarCreateBuilder.copyOnWrite();
            altx altxVar2 = (altx) aihfVarCreateBuilder.instance;
            altxVar2.b |= 2;
            altxVar2.d = j;
            list.add((altx) aihfVarCreateBuilder.build());
            it = it2;
        }
        aaqbVarB.m();
        ListenableFuture listenableFutureAr = ahno.ar(((wnh) aaqcVar.d).a(aaqbVarB), new aakt(10), abfvVar.b);
        final int i5 = 0;
        return ahno.ar(listenableFutureAr, new agek(this) { // from class: hsf
            public final /* synthetic */ hsj a;

            {
                this.a = this;
            }

            @Override // defpackage.agek
            public final Object apply(Object obj) {
                if (i5 != 0) {
                    String strS = aaqnVarB.s();
                    Map map2 = (Map) Collection.EL.stream(((aluf) obj).c).collect(aghu.a(new hrn(4), new hrn(5)));
                    Map map3 = map;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                    ArrayList arrayList3 = arrayList;
                    return this.a.e(strS, aaewVarD, arrayList3, linkedHashMap4, linkedHashMap3, map3, map2);
                }
                Map map4 = (Map) obj;
                aaqn aaqnVar = aaqnVarB;
                Map map5 = map;
                LinkedHashMap linkedHashMap5 = linkedHashMap2;
                LinkedHashMap linkedHashMap6 = linkedHashMap;
                ArrayList arrayList4 = arrayList;
                return this.a.e(aaqnVar.s(), aaewVarD, arrayList4, linkedHashMap6, linkedHashMap5, map5, map4);
            }
        }, this.c);
    }

    private final boolean l(zwa zwaVar, aaew aaewVar, aamo aamoVar, aoen aoenVar) {
        if (aamoVar == null || !aaewVar.z(aamoVar, aoenVar)) {
            return false;
        }
        this.o.b().q().kk(new aahy(agke.q(aamoVar.d())));
        this.q.k(zwaVar).c(new hbn(aamoVar, 19)).s().D();
        return true;
    }

    private static final boolean m(anyr anyrVar) {
        return ((anyrVar.c & 32) == 0 || Objects.equals(anyrVar.i, "PPSV") || Objects.equals(anyrVar.i, "PPSE") || Objects.equals(anyrVar.i, "PPSDST")) ? false : true;
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        int i = aofhVar.c;
        int iBc = a.bc(i);
        if (iBc != 0 && iBc == 4) {
            return a;
        }
        int iBc2 = a.bc(i);
        return (iBc2 != 0 && iBc2 == 2 && i(aofhVar)) ? new aakv(aofhVar, 1) : aans.c;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, final aofh aofhVar) {
        ListenableFuture listenableFutureAs;
        aanp aanpVarA;
        aanp aanpVarA2;
        final String strH = wfs.h(aofhVar.d);
        if (strH.isEmpty()) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 27;
            return ahng.n(aanoVar.a());
        }
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVar = anyr.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        anyr anyrVar = (anyr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i == 1) {
            if (i(aofhVar)) {
                return f(zwaVar, strH, aofhVar);
            }
            aofg aofgVar2 = aofhVar.e;
            if (aofgVar2 == null) {
                aofgVar2 = aofg.b;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            aofgVar2.c(aihlVarCheckIsLite2);
            Object objK2 = aofgVar2.j.k(aihlVarCheckIsLite2.d);
            final anyr anyrVar2 = (anyr) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            aaqn aaqnVarB = this.o.b();
            aaew aaewVarJ = j(zwaVar);
            if (aaewVarJ == null) {
                listenableFutureAs = ahng.n(Optional.empty());
            } else {
                this.r.q(true);
                listenableFutureAs = ahno.as(aaqnVarB.l().e(strH), new okm(this, strH, aaqnVarB, aaewVarJ, anyrVar2, 1), this.d);
            }
            return ahno.ar(listenableFutureAs, new agek() { // from class: hse
                @Override // defpackage.agek
                public final Object apply(Object obj) {
                    String strJ;
                    Optional optional = (Optional) obj;
                    if (optional.isEmpty()) {
                        aano aanoVar2 = new aano(aanp.c);
                        aanoVar2.d = 6;
                        return aanoVar2.a();
                    }
                    hsj hsjVar = this.a;
                    if (txz.g(hsjVar.b)) {
                        hsjVar.g.j();
                    }
                    aofh aofhVar2 = aofhVar;
                    String str = strH;
                    agjz agjzVar = new agjz(4);
                    aofh aofhVar3 = aofh.a;
                    aihf aihfVarCreateBuilder = aofhVar3.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar4 = (aofh) aihfVarCreateBuilder.instance;
                    aofhVar4.c = 1;
                    aofhVar4.b |= 1;
                    String strAx = kro.ax(str);
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar5 = (aofh) aihfVarCreateBuilder.instance;
                    strAx.getClass();
                    aofhVar5.b |= 2;
                    aofhVar5.d = strAx;
                    aofg aofgVar3 = aofhVar2.e;
                    if (aofgVar3 == null) {
                        aofgVar3 = aofg.b;
                    }
                    aofa aofaVar = aofgVar3.g;
                    if (aofaVar == null) {
                        aofaVar = aofa.a;
                    }
                    aofg aofgVar4 = aofg.b;
                    aihh aihhVar = (aihh) aofgVar4.createBuilder();
                    vxz vxzVar = hsjVar.h;
                    agke agkeVarR = vxzVar.l(168, 45679261L, false) ? agke.r(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK, aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_INACTIVE_MEDIA_TRANSFER) : agke.q(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                    anyr anyrVar3 = anyrVar2;
                    aihhVar.m(agkeVarR);
                    aihl aihlVar2 = aoom.b;
                    aihf aihfVarCreateBuilder2 = aoom.a.createBuilder();
                    aofb aofbVarB = aamn.a(anyrVar3.j).b();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoom aoomVar = (aoom) aihfVarCreateBuilder2.instance;
                    aoomVar.k = aofbVarB.i;
                    aoomVar.c |= SemanticState.ReadOnly;
                    aigj aigjVar = anyrVar3.d;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoom aoomVar2 = (aoom) aihfVarCreateBuilder2.instance;
                    aigjVar.getClass();
                    aoomVar2.c |= 1;
                    aoomVar2.d = aigjVar;
                    aohx aohxVarE = hsjVar.g.e();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoom aoomVar3 = (aoom) aihfVarCreateBuilder2.instance;
                    aoomVar3.e = aohxVarE.l;
                    aoomVar3.c |= 2;
                    boolean zL = vxzVar.l(141, 45632204L, false);
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoom aoomVar4 = (aoom) aihfVarCreateBuilder2.instance;
                    aoomVar4.c |= 16384;
                    aoomVar4.o = zL;
                    aihhVar.e(aihlVar2, (aoom) aihfVarCreateBuilder2.build());
                    aihhVar.copyOnWrite();
                    aofg aofgVar5 = (aofg) aihhVar.instance;
                    aofaVar.getClass();
                    aofgVar5.g = aofaVar;
                    aofgVar5.c |= 2;
                    aofg aofgVar6 = (aofg) aihhVar.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar6 = (aofh) aihfVarCreateBuilder.instance;
                    aofgVar6.getClass();
                    aofhVar6.e = aofgVar6;
                    aofhVar6.b |= 4;
                    agjzVar.h((aofh) aihfVarCreateBuilder.build());
                    if (hsjVar.f.F()) {
                        agjzVar.j(aaje.c(((aamo) optional.get()).c()));
                    }
                    if (hsjVar.i.l(20, 45651451L, false) && (strJ = hfn.j((aamo) optional.get())) != null && !strJ.isEmpty()) {
                        aihf aihfVarCreateBuilder3 = aofhVar3.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        aofh aofhVar7 = (aofh) aihfVarCreateBuilder3.instance;
                        aofhVar7.c = 4;
                        aofhVar7.b |= 1;
                        String strAy = kro.ay(strJ);
                        aihfVarCreateBuilder3.copyOnWrite();
                        aofh aofhVar8 = (aofh) aihfVarCreateBuilder3.instance;
                        strAy.getClass();
                        aofhVar8.b |= 2;
                        aofhVar8.d = strAy;
                        aihh aihhVar2 = (aihh) aofgVar4.createBuilder();
                        int iK = hmy.k(5, 24, aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE);
                        aihhVar2.copyOnWrite();
                        aofg aofgVar7 = (aofg) aihhVar2.instance;
                        aofgVar7.c |= 1;
                        aofgVar7.d = iK;
                        aihl aihlVar3 = anue.b;
                        aihf aihfVarCreateBuilder4 = anue.a.createBuilder();
                        aihfVarCreateBuilder4.copyOnWrite();
                        anue anueVar = (anue) aihfVarCreateBuilder4.instance;
                        anueVar.d = 6;
                        anueVar.e = str;
                        aihhVar2.e(aihlVar3, (anue) aihfVarCreateBuilder4.build());
                        aihfVarCreateBuilder3.copyOnWrite();
                        aofh aofhVar9 = (aofh) aihfVarCreateBuilder3.instance;
                        aofg aofgVar8 = (aofg) aihhVar2.build();
                        aofgVar8.getClass();
                        aofhVar9.e = aofgVar8;
                        aofhVar9.b |= 4;
                        agjzVar.h((aofh) aihfVarCreateBuilder3.build());
                    }
                    aano aanoVarA = aanp.a();
                    aanoVarA.c = 2;
                    aanoVarA.b(agjzVar.g());
                    return aanoVarA.a();
                }
            }, this.d);
        }
        if (i != 2) {
            if (i == 3) {
                return ahno.ar(k(zwaVar, agke.q(aofhVar)), new hqt(3), this.d);
            }
            if (i != 4) {
                aano aanoVar2 = new aano(aanp.c);
                aanoVar2.d = 23;
                return ahng.n(aanoVar2.a());
            }
            aaqn aaqnVarB2 = this.o.b();
            if ((anyrVar.c & SemanticState.Obscured) == 0) {
                aano aanoVar3 = new aano(aanp.c);
                aanoVar3.d = 27;
                return ahng.n(aanoVar3.a());
            }
            if (!zwaVar.k().equals(aaqnVarB2.s())) {
                aano aanoVar4 = new aano(aanp.c);
                aanoVar4.d = 35;
                return ahng.n(aanoVar4.a());
            }
            aaew aaewVarD = aaqnVarB2.d();
            if (aaewVarD == null) {
                aano aanoVar5 = new aano(aanp.c);
                aanoVar5.d = 15;
                return ahng.n(aanoVar5.a());
            }
            aamo aamoVarAj = aaewVarD.aj(strH);
            if (aamoVarAj == null) {
                aano aanoVar6 = new aano(aanp.c);
                aanoVar6.d = 26;
                return ahng.n(aanoVar6.a());
            }
            aihf builder = ((aihn) aamoVarAj.e).toBuilder();
            long seconds = Duration.ofMillis(anyrVar.n).toSeconds();
            builder.copyOnWrite();
            aohb aohbVar = (aohb) builder.instance;
            aohbVar.b |= 262144;
            aohbVar.q = seconds;
            if (!aaewVarD.G(new aamo((aohb) builder.build(), aamoVarAj.a, (abuz) aamoVarAj.c, (aaok) aamoVarAj.b))) {
                aano aanoVar7 = new aano(aanp.c);
                aanoVar7.d = 27;
                return ahng.n(aanoVar7.a());
            }
            aamt aamtVarF = aaewVarD.f(strH);
            if (aamtVarF != null) {
                hqg hqgVar = this.n;
                hqgVar.j(new hpz(1, strH), aaie.class, new hqa(hqgVar, aamtVarF, 7));
            }
            return ahng.n(aanp.a);
        }
        if (!anyrVar.m && m(anyrVar)) {
            aaew aaewVarJ2 = j(zwaVar);
            aofg aofgVar3 = aofhVar.e;
            if (aofgVar3 == null) {
                aofgVar3 = aofg.b;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            aofgVar3.c(aihlVarCheckIsLite3);
            Object objK3 = aofgVar3.j.k(aihlVarCheckIsLite3.d);
            anyr anyrVar3 = (anyr) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
            if (aaewVarJ2 == null) {
                aano aanoVar8 = new aano(aanp.c);
                aanoVar8.d = 15;
                aanpVarA2 = aanoVar8.a();
            } else {
                aamo aamoVarAj2 = aaewVarJ2.aj(strH);
                aoen aoenVar = aoen.a;
                aihf aihfVarCreateBuilder = aoenVar.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                aoenVar2.b |= 1;
                aoenVar2.c = strH;
                aofa aofaVar = aofgVar3.g;
                if (aofaVar == null) {
                    aofaVar = aofa.a;
                }
                int iBf = a.bf(aofaVar.c);
                if (iBf == 0) {
                    iBf = 1;
                }
                aihfVarCreateBuilder.copyOnWrite();
                aoen aoenVar3 = (aoen) aihfVarCreateBuilder.instance;
                aoenVar3.e = iBf - 1;
                aoenVar3.b |= 4;
                boolean zL = l(zwaVar, aaewVarJ2, aamoVarAj2, (aoen) aihfVarCreateBuilder.build());
                if (!this.i.l(20, 45651451L, false) && !zL && igs.c(this.k.g(aamoVarAj2)) && hwz.a(aaewVarJ2, anyrVar3.i)) {
                    aihf aihfVarCreateBuilder2 = aoenVar.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoen aoenVar4 = (aoen) aihfVarCreateBuilder2.instance;
                    aoenVar4.b |= 1;
                    aoenVar4.c = strH;
                    aofa aofaVar2 = aofgVar3.g;
                    if (aofaVar2 == null) {
                        aofaVar2 = aofa.a;
                    }
                    int iBf2 = a.bf(aofaVar2.c);
                    int i2 = iBf2 == 0 ? 1 : iBf2;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoen aoenVar5 = (aoen) aihfVarCreateBuilder2.instance;
                    aoenVar5.e = i2 - 1;
                    aoenVar5.b |= 4;
                    aaewVarJ2.x(strH, 2, (aoen) aihfVarCreateBuilder2.build());
                    tbt tbtVar = this.e;
                    tbtVar.e(new aaia(strH));
                    tbtVar.e(new aahv());
                }
                aano aanoVarA = aanp.a();
                aanoVarA.c = 2;
                aanoVarA.b(aamoVarAj2 != null ? aaje.d(aamoVarAj2.c()) : agpi.a);
                aanpVarA2 = aanoVarA.a();
            }
            return ahng.n(aanpVarA2);
        }
        aaew aaewVarJ3 = j(zwaVar);
        aofg aofgVar4 = aofhVar.e;
        if (aofgVar4 == null) {
            aofgVar4 = aofg.b;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
        aofgVar4.c(aihlVarCheckIsLite4);
        Object objK4 = aofgVar4.j.k(aihlVarCheckIsLite4.d);
        anyr anyrVar4 = (anyr) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4));
        if (aaewVarJ3 == null) {
            aano aanoVar9 = new aano(aanp.c);
            aanoVar9.d = 15;
            aanpVarA = aanoVar9.a();
        } else {
            aamo aamoVarAj3 = aaewVarJ3.aj(strH);
            if (anyrVar4.m) {
                aihf aihfVarCreateBuilder3 = aoen.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                aoen aoenVar6 = (aoen) aihfVarCreateBuilder3.instance;
                aoenVar6.b |= 1;
                aoenVar6.c = strH;
                aofa aofaVar3 = aofgVar4.g;
                if (aofaVar3 == null) {
                    aofaVar3 = aofa.a;
                }
                int iBf3 = a.bf(aofaVar3.c);
                if (iBf3 == 0) {
                    iBf3 = 1;
                }
                aihfVarCreateBuilder3.copyOnWrite();
                aoen aoenVar7 = (aoen) aihfVarCreateBuilder3.instance;
                aoenVar7.e = iBf3 - 1;
                aoenVar7.b |= 4;
                if (aaewVarJ3.x(strH, 1, (aoen) aihfVarCreateBuilder3.build())) {
                    this.e.e(new aaia(strH));
                } else {
                    aano aanoVar10 = new aano(aanp.b);
                    aanoVar10.d = 39;
                    aanpVarA = aanoVar10.a();
                }
            } else {
                if ((anyrVar4.c & 32) == 0 || !(anyrVar4.i.equals("PPSV") || anyrVar4.i.equals("PPSE") || anyrVar4.i.equals("PPSDST"))) {
                    aihf aihfVarCreateBuilder4 = aoen.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aoen aoenVar8 = (aoen) aihfVarCreateBuilder4.instance;
                    aoenVar8.b |= 1;
                    aoenVar8.c = strH;
                    aofa aofaVar4 = aofgVar4.g;
                    if (aofaVar4 == null) {
                        aofaVar4 = aofa.a;
                    }
                    int iBf4 = a.bf(aofaVar4.c);
                    int i3 = iBf4 == 0 ? 1 : iBf4;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aoen aoenVar9 = (aoen) aihfVarCreateBuilder4.instance;
                    aoenVar9.e = i3 - 1;
                    aoenVar9.b |= 4;
                    aaewVarJ3.o(strH, (aoen) aihfVarCreateBuilder4.build());
                } else {
                    aoen aoenVar10 = aoen.a;
                    aihf aihfVarCreateBuilder5 = aoenVar10.createBuilder();
                    aihfVarCreateBuilder5.copyOnWrite();
                    aoen aoenVar11 = (aoen) aihfVarCreateBuilder5.instance;
                    aoenVar11.b |= 1;
                    aoenVar11.c = strH;
                    aofa aofaVar5 = aofgVar4.g;
                    if (aofaVar5 == null) {
                        aofaVar5 = aofa.a;
                    }
                    int iBf5 = a.bf(aofaVar5.c);
                    if (iBf5 == 0) {
                        iBf5 = 1;
                    }
                    aihfVarCreateBuilder5.copyOnWrite();
                    aoen aoenVar12 = (aoen) aihfVarCreateBuilder5.instance;
                    aoenVar12.e = iBf5 - 1;
                    aoenVar12.b |= 4;
                    boolean zL2 = l(zwaVar, aaewVarJ3, aamoVarAj3, (aoen) aihfVarCreateBuilder5.build());
                    if (!this.i.l(20, 45651451L, false) && !zL2 && igs.c(this.k.g(aamoVarAj3))) {
                        Iterator it = aaewVarJ3.m(strH).iterator();
                        while (it.hasNext()) {
                            if (hwz.a(aaewVarJ3, (String) it.next())) {
                                aihf aihfVarCreateBuilder6 = aoenVar10.createBuilder();
                                aihfVarCreateBuilder6.copyOnWrite();
                                aoen aoenVar13 = (aoen) aihfVarCreateBuilder6.instance;
                                aoenVar13.b |= 1;
                                aoenVar13.c = strH;
                                aofa aofaVar6 = aofgVar4.g;
                                if (aofaVar6 == null) {
                                    aofaVar6 = aofa.a;
                                }
                                int iBf6 = a.bf(aofaVar6.c);
                                int i4 = iBf6 == 0 ? 1 : iBf6;
                                aihfVarCreateBuilder6.copyOnWrite();
                                aoen aoenVar14 = (aoen) aihfVarCreateBuilder6.instance;
                                aoenVar14.e = i4 - 1;
                                aoenVar14.b |= 4;
                                aaewVarJ3.x(strH, 2, (aoen) aihfVarCreateBuilder6.build());
                                this.e.e(new aaia(strH));
                                break;
                            }
                        }
                    }
                }
                tbt tbtVar2 = this.e;
                tbtVar2.e(new aahv());
                tbtVar2.e(new aahu(strH));
            }
            aano aanoVarA2 = aanp.a();
            aanoVarA2.c = 2;
            aanoVarA2.b(aamoVarAj3 != null ? aaje.d(aamoVarAj3.c()) : agpi.a);
            aanpVarA = aanoVarA2.a();
        }
        return ahng.n(aanpVarA);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return ahng.n(agpi.a);
        }
        if (Collection.EL.stream(agkeVar).allMatch(new hod(13))) {
            return k(zwaVar, agkeVar);
        }
        if (!Collection.EL.stream(agkeVar).allMatch(new hod(14))) {
            return ahng.n(a.Q(((agpi) agkeVar).d, 23));
        }
        if (j(zwaVar) == null) {
            return ahng.n(a.Q(((agpi) agkeVar).d, 15));
        }
        return agkeVar.isEmpty() ? ahng.n(a.Q(((agpi) agkeVar).d, 26)) : ahno.ar(ahng.k((Iterable) Collection.EL.stream(agkeVar).map(new hph(this, zwaVar, 3)).collect(aghu.a)), new hqt(4), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e A[PHI: r5
      0x006e: PHI (r5v4 aamo) = (r5v2 aamo), (r5v22 aamo) binds: [B:19:0x0069, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    public final aanp d(String str, aamo aamoVar, anyr anyrVar, aofa aofaVar, aaqn aaqnVar, aaew aaewVar) {
        aamo aamoVar2;
        aamg aamgVar;
        String str2 = anyrVar.i;
        byte[] bArrG = anyrVar.d.G();
        aohx aohxVarA = aohx.a(anyrVar.e);
        if (aohxVarA == null) {
            aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
        }
        aohx aohxVar = aohxVarA;
        aamn aamnVarA = aamn.a(anyrVar.j);
        boolean z = anyrVar.k;
        aaqg aaqgVar = this.g;
        aodp aodpVarD = aaqgVar.d(aohxVar);
        aamt aamtVarF = aaewVar.f(str);
        boolean z2 = aamtVarF != null && this.k.i(aamtVarF.a) == aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
        if (this.i.l(20, 45651451L, false)) {
            aamoVar2 = aamoVar;
            if (z) {
                aamgVar = aamg.ACTIVE;
            } else {
                aamgVar = aamg.STREAM_DOWNLOAD_PENDING;
            }
        } else if (z) {
            aamoVar2 = aamoVar;
            aamgVar = aamg.ACTIVE;
        } else {
            aamoVar2 = aamoVar;
            if (igs.c(this.k.g(aamoVar2))) {
                aamgVar = aamg.METADATA_ONLY;
            } else {
                aamgVar = aamg.STREAM_DOWNLOAD_PENDING;
            }
        }
        if (!aaewVar.O(aamoVar2, aamnVarA, aohxVar, aodpVarD, bArrG, aamgVar, str2)) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 6;
            return aanoVar.a();
        }
        if (z2) {
            aaewVar.o(str, null);
        }
        aamt aamtVarF2 = aaewVar.f(str);
        if (aamtVarF2 != null) {
            hqg hqgVar = this.n;
            hqgVar.j(new hpz(1, str), aaht.class, new hqa(hqgVar, aamtVarF2, 7));
        }
        agjz agjzVar = new agjz(4);
        if (z) {
            aaqx aaqxVarN = aaqnVar.n();
            if (aaqxVarN != null) {
                aaqxVarN.f(aaewVar.l().size());
                aaqxVarN.b().b(str);
            }
            aihf aihfVarCreateBuilder = aofh.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
            aofhVar.c = 1;
            aofhVar.b |= 1;
            String strAx = kro.ax(str);
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
            strAx.getClass();
            aofhVar2.b |= 2;
            aofhVar2.d = strAx;
            aihh aihhVar = (aihh) aofg.b.createBuilder();
            vxz vxzVar = this.h;
            aihhVar.m(vxzVar.l(168, 45679261L, false) ? agke.r(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK, aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_INACTIVE_MEDIA_TRANSFER) : agke.q(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK));
            aihl aihlVar = aoom.b;
            aihf aihfVarCreateBuilder2 = aoom.a.createBuilder();
            aofb aofbVarB = aamn.a(anyrVar.j).b();
            aihfVarCreateBuilder2.copyOnWrite();
            aoom aoomVar = (aoom) aihfVarCreateBuilder2.instance;
            aoomVar.k = aofbVarB.i;
            aoomVar.c |= SemanticState.ReadOnly;
            aihfVarCreateBuilder2.copyOnWrite();
            aoom aoomVar2 = (aoom) aihfVarCreateBuilder2.instance;
            str2.getClass();
            aoomVar2.c |= 32;
            aoomVar2.h = str2;
            aigj aigjVarV = aigj.v(bArrG);
            aihfVarCreateBuilder2.copyOnWrite();
            aoom aoomVar3 = (aoom) aihfVarCreateBuilder2.instance;
            aigjVarV.getClass();
            aoomVar3.c |= 1;
            aoomVar3.d = aigjVarV;
            aohx aohxVarE = aaqgVar.e();
            aihfVarCreateBuilder2.copyOnWrite();
            aoom aoomVar4 = (aoom) aihfVarCreateBuilder2.instance;
            aoomVar4.e = aohxVarE.l;
            aoomVar4.c |= 2;
            aogf aogfVarA = aogf.a(anyrVar.l);
            if (aogfVarA == null) {
                aogfVarA = aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
            }
            int iK = hmy.k(2, 120, aogfVarA);
            aihfVarCreateBuilder2.copyOnWrite();
            aoom aoomVar5 = (aoom) aihfVarCreateBuilder2.instance;
            aoomVar5.c |= 64;
            aoomVar5.i = iK;
            boolean zL = vxzVar.l(141, 45632204L, false);
            aihfVarCreateBuilder2.copyOnWrite();
            aoom aoomVar6 = (aoom) aihfVarCreateBuilder2.instance;
            aoomVar6.c |= 16384;
            aoomVar6.o = zL;
            aihhVar.e(aihlVar, (aoom) aihfVarCreateBuilder2.build());
            aihhVar.copyOnWrite();
            aofg aofgVar = (aofg) aihhVar.instance;
            aofaVar.getClass();
            aofgVar.g = aofaVar;
            aofgVar.c |= 2;
            aofg aofgVar2 = (aofg) aihhVar.build();
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
            aofgVar2.getClass();
            aofhVar3.e = aofgVar2;
            aofhVar3.b |= 4;
            agjzVar.h((aofh) aihfVarCreateBuilder.build());
        }
        if (this.f.E()) {
            agjzVar.j(aaje.c(aamoVar.c()));
        }
        aano aanoVarA = aanp.a();
        aanoVarA.c = 2;
        aanoVarA.b(agjzVar.g());
        return aanoVarA.a();
    }

    public final agke e(String str, aaew aaewVar, List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Map map, Map map2) {
        boolean z;
        int i;
        int i2;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        Map map3 = map2;
        int i3 = 4;
        if (map3 == null) {
            return a.Q(list.size(), 4);
        }
        HashMap map4 = new HashMap(linkedHashMap3);
        agjz agjzVar = new agjz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            aamo aamoVarAj = aaewVar.aj(str2);
            aamo aamoVarB = (aamo) map3.get(str2);
            aano aanoVarA = aanp.a();
            agjz agjzVar2 = new agjz(i3);
            int i4 = i3;
            if (aamoVarB != null) {
                Object obj = map4.get(str2);
                z = true;
                Boolean bool = Boolean.TRUE;
                if (Objects.equals(obj, bool)) {
                    if (Objects.equals(linkedHashMap2.get(str2), bool)) {
                        aofe aofeVarH = hfn.h(aamoVarB);
                        aihf aihfVarCreateBuilder = aofeVarH == null ? aofe.a.createBuilder() : aofeVarH.toBuilder();
                        aihf builder = ((aihn) aamoVarB.e).toBuilder();
                        aihf aihfVarCreateBuilder2 = aoha.a.createBuilder();
                        aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
                        aihfVarCreateBuilder.copyOnWrite();
                        aofe aofeVar = (aofe) aihfVarCreateBuilder.instance;
                        aofeVar.k = aogfVar.e;
                        aofeVar.b |= SemanticState.ReadOnly;
                        aofe aofeVar2 = (aofe) aihfVarCreateBuilder.build();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoha aohaVar = (aoha) aihfVarCreateBuilder2.instance;
                        aofeVar2.getClass();
                        aohaVar.c = aofeVar2;
                        aohaVar.b |= 1;
                        aoha aohaVar2 = (aoha) aihfVarCreateBuilder2.build();
                        builder.copyOnWrite();
                        aohb aohbVar = (aohb) builder.instance;
                        aohaVar2.getClass();
                        aohbVar.a();
                        i2 = 0;
                        aohbVar.p.set(0, aohaVar2);
                        aamoVarB = aamo.b((aohb) builder.build());
                    } else {
                        i2 = 0;
                    }
                    aaewVar.G(aamoVarB);
                    aauk aaukVar = this.f;
                    if (!aaukVar.F()) {
                        this.s.s(str, str2);
                    }
                    aqmh aqmhVarC = aamoVarAj != null ? aamoVarAj.c() : aqmh.a;
                    aqmh aqmhVarC2 = aamoVarB.c();
                    if (aqmhVarC == null) {
                        aqmhVarC = aqmh.a;
                    }
                    if (aqmhVarC2 == null) {
                        aqmhVarC2 = aqmh.a;
                    }
                    agke agkeVarB = aaje.b(aqmhVarC, aqmhVarC2);
                    int i5 = ((agpi) agkeVarB).d;
                    int i6 = i2;
                    while (i6 < i5) {
                        aofh aofhVar = (aofh) agkeVarB.get(i6);
                        aauk aaukVar2 = aaukVar;
                        int iBc = a.bc(aofhVar.c);
                        if ((iBc != 0 && iBc == 3) || aaukVar2.F()) {
                            agjzVar2.h(aofhVar);
                        }
                        i6++;
                        aaukVar = aaukVar2;
                    }
                }
            } else {
                z = true;
            }
            Object obj2 = linkedHashMap3.get(str2);
            Boolean bool2 = Boolean.TRUE;
            if (Objects.equals(obj2, bool2)) {
                if (Objects.equals(map4.get(str2), bool2)) {
                    aogf aogfVar2 = (aogf) map.get(str2);
                    aihf aihfVarCreateBuilder3 = aofh.a.createBuilder();
                    String strAx = kro.ax(str2);
                    aihfVarCreateBuilder3.copyOnWrite();
                    aofh aofhVar2 = (aofh) aihfVarCreateBuilder3.instance;
                    strAx.getClass();
                    aofhVar2.b |= 2;
                    aofhVar2.d = strAx;
                    aihfVarCreateBuilder3.copyOnWrite();
                    aofh aofhVar3 = (aofh) aihfVarCreateBuilder3.instance;
                    aofhVar3.c = 3;
                    aofhVar3.b |= 1;
                    aihh aihhVar = (aihh) aofg.b.createBuilder();
                    aihhVar.copyOnWrite();
                    aofg aofgVar = (aofg) aihhVar.instance;
                    aofgVar.c |= 1;
                    aofgVar.d = 90;
                    aihhVar.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                    aihl aihlVar = aoom.b;
                    aihf aihfVarCreateBuilder4 = aoom.a.createBuilder();
                    aogf aogfVar3 = aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aoom aoomVar = (aoom) aihfVarCreateBuilder4.instance;
                    aoomVar.c |= SemanticState.Multiline;
                    aoomVar.n = aogfVar2 == aogfVar3 ? z : false;
                    boolean z2 = (this.f.t() && aaewVar.c(str2) == null) ? z : false;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aoom aoomVar2 = (aoom) aihfVarCreateBuilder4.instance;
                    aoomVar2.c |= 16384;
                    aoomVar2.o = z2;
                    aihhVar.e(aihlVar, (aoom) aihfVarCreateBuilder4.build());
                    aofg aofgVar2 = (aofg) aihhVar.build();
                    aihfVarCreateBuilder3.copyOnWrite();
                    aofh aofhVar4 = (aofh) aihfVarCreateBuilder3.instance;
                    aofgVar2.getClass();
                    aofhVar4.e = aofgVar2;
                    aofhVar4.b |= 4;
                    agjzVar2.h((aofh) aihfVarCreateBuilder3.build());
                    i = 2;
                } else {
                    i = 2;
                }
                aanoVarA.c = i;
                aanoVarA.b(agjzVar2.g());
                agjzVar.h(aanoVarA.a());
            } else {
                it = it;
                aano aanoVar = new aano(aanp.c);
                aanoVar.d = 26;
                agjzVar.h(aanoVar.a());
            }
            map4.put(str2, Boolean.FALSE);
            linkedHashMap3 = linkedHashMap;
            map3 = map2;
            i3 = i4;
            it = it;
        }
        return agjzVar.g();
    }

    public final ListenableFuture f(zwa zwaVar, String str, aofh aofhVar) {
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anyr.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        anyr anyrVar = (anyr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aaqn aaqnVarB = this.o.b();
        aaew aaewVarJ = j(zwaVar);
        if (aaewVarJ == null) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 15;
            return ahng.n(aanoVar.a());
        }
        if ((anyrVar.c & 4) == 0) {
            return ahno.ar(g(str), new hsh(this, str, anyrVar, aofhVar, aaqnVarB, aaewVarJ, 1), this.d);
        }
        anzd anzdVar = anyrVar.f;
        if (anzdVar == null) {
            anzdVar = anzd.a;
        }
        String str2 = anyrVar.i;
        ankd ankdVar = anyrVar.g;
        if (ankdVar == null) {
            ankdVar = ankd.a;
        }
        aamo aamoVarH = h(anzdVar, str2, ankdVar, anyrVar.h);
        aofg aofgVar2 = aofhVar.e;
        if (aofgVar2 == null) {
            aofgVar2 = aofg.b;
        }
        aofa aofaVar = aofgVar2.g;
        if (aofaVar == null) {
            aofaVar = aofa.a;
        }
        return ahng.n(d(str, aamoVarH, anyrVar, aofaVar, aaqnVarB, aaewVarJ));
    }

    public final ListenableFuture g(String str) {
        if (!this.p.m(41, 45377221L)) {
            try {
                return ahng.n(Optional.of(this.t.w(str)));
            } catch (ExecutionException unused) {
                this.e.e(new aahx(str, 1));
                return ahng.n(Optional.empty());
            }
        }
        aapw aapwVar = this.m;
        aapv aapvVarA = aapwVar.a();
        aihf aihfVarCreateBuilder = alug.a.createBuilder();
        String strAH = kro.aH(str);
        aihfVarCreateBuilder.copyOnWrite();
        alug alugVar = (alug) aihfVarCreateBuilder.instance;
        strAH.getClass();
        alugVar.b |= 1;
        alugVar.c = strAH;
        aapvVarA.e((alug) aihfVarCreateBuilder.build());
        aapvVarA.a = 2;
        return ahno.ar(aapwVar.b(aapvVarA, this.c), new gqa(this, str, 14), this.d);
    }
}
