package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ifn {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/player/sequence/QueueSequencerDataProvider");
    public iqn a;
    public final vxz b;
    private final aunn d;
    private final jkp e;
    private final icj f;
    private final abuv g;
    private final txp h;
    private final heg i;
    private final hwz j;
    private final jnm k;

    public ifn(aunn aunnVar, jkp jkpVar, heg hegVar, jnm jnmVar, icj icjVar, hwz hwzVar, abuv abuvVar, vxz vxzVar, txp txpVar) {
        aunnVar.getClass();
        jkpVar.getClass();
        hegVar.getClass();
        jnmVar.getClass();
        icjVar.getClass();
        hwzVar.getClass();
        abuvVar.getClass();
        vxzVar.getClass();
        txpVar.getClass();
        this.d = aunnVar;
        this.e = jkpVar;
        this.i = hegVar;
        this.k = jnmVar;
        this.f = icjVar;
        this.j = hwzVar;
        this.g = abuvVar;
        this.b = vxzVar;
        this.h = txpVar;
    }

    public static final List f(int i, abun abunVar, List list) {
        abunVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                atqq.M();
            }
            abun abunVar2 = (abun) obj;
            if (i2 == i) {
                abunVar2 = abunVar;
            }
            arrayList.add(abunVar2);
            i2 = i3;
        }
        return arrayList;
    }

    private final igd g(abnl abnlVar, long j, Duration duration) {
        abno abnoVarA = abnp.a();
        if (duration != null) {
            abnoVarA.j(new zgp(duration));
        }
        abut abutVarH = abuu.h();
        abutVarH.b(abnlVar);
        abutVarH.c(abnoVarA.a());
        abutVarH.e(k());
        return new igd(abutVarH.a(), j, ((abjp) this.d.io()).f(), 8);
    }

    private final abun h(abun abunVar, abtu abtuVar, hyz hyzVar, Duration duration) {
        if (!(abunVar instanceof abvz)) {
            return abunVar;
        }
        abnp abnpVarA = abtuVar.g;
        if (abnpVarA == null) {
            abnpVarA = abnp.a;
        }
        if (duration != null) {
            abno abnoVarB = abnp.b(abnpVarA);
            abnoVarB.j(new zgp(duration));
            abnpVarA = abnoVarB.a();
        }
        abnl abnlVarA = ((abvz) abunVar).a();
        if (abnlVarA == null) {
            return abunVar;
        }
        abnk abnkVarF = abnlVarA.f();
        Map mapA = abtuVar.a();
        Object obj = mapA != null ? mapA.get("avSwitchPlaybackStartTime") : null;
        if (obj != null) {
            abnkVarF.k = ((Long) obj).longValue();
        }
        abnl abnlVar = abtuVar.f;
        if (abnlVar != null) {
            abnkVarF.f(abnlVar.P());
        }
        abut abutVarH = abuu.h();
        abutVarH.e(k());
        abutVarH.b(abnkVarF.a());
        abutVarH.c(abnpVarA);
        return new igd(abutVarH.a(), hyzVar.m(), ((abjp) this.d.io()).f(), 8);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    private final Object i(awoq awoqVar) {
        long millis;
        Duration durationC = ahng.C(100L);
        ifk ifkVar = new ifk(this, (awoq) null, 0);
        if (durationC.compareTo(Duration.ZERO) <= 0) {
            millis = 0;
        } else if (durationC.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            millis = 1;
        } else if (durationC.getSeconds() >= 9223372036854775L) {
            millis = Long.MAX_VALUE;
            if (durationC.getSeconds() == 9223372036854775L && durationC.getNano() < 807000000) {
                millis = durationC.toMillis();
            }
        } else {
            millis = durationC.toMillis();
        }
        return avkz.r(millis, ifkVar, awoqVar);
    }

    private final List j(hyz hyzVar, Duration duration) {
        if (hyzVar == null && (hyzVar = (hyz) ((abjp) this.d.io()).j()) == null) {
            return awno.a;
        }
        abnl abnlVarN = hyzVar.n();
        if (abnlVarN != null) {
            if (true == l(abnlVarN)) {
                abnlVarN = null;
            }
            if (abnlVarN != null) {
                igd igdVarG = g(abnlVarN, hyzVar.m(), duration);
                String strA = this.h.a();
                strA.getClass();
                return atqq.aL(new igd[]{igdVarG, igd.h(igdVarG, null, 0L, null, strA, 7)});
            }
        }
        abuv abuvVar = this.g;
        return atqq.aL(new abuv[]{abuvVar, abuvVar});
    }

    private final boolean k() {
        return this.k.C() || !this.b.l(63, 45721841L, false);
    }

    private static final boolean l(abnl abnlVar) {
        boolean zJ = abuu.j(abnlVar);
        boolean z = !zJ;
        if (!zJ) {
            ((agrc) c.b().k("com/google/android/apps/youtube/music/player/sequence/QueueSequencerDataProvider", "shouldUseNoopSequenceItem$<anonymous>", 351, "QueueSequencerDataProvider.kt")).t("Error, try to populate the playback sequence with an invalid video item.");
        }
        return z;
    }

    public final int a(boolean z) {
        if (this.b.l(13, 45627362L, false) || !z) {
            return ((abjp) this.d.io()).a();
        }
        return 0;
    }

    public final abuk b() {
        abui abuiVarT = abuk.t();
        abuiVarT.b(this.i.a == ibv.LOOP_ALL);
        return abuiVarT.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [hyz] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r1v0, types: [awox] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ifn] */
    public final Object c(boolean z, hyz hyzVar, awoq awoqVar) {
        ifl iflVar;
        ?? r10;
        abun igdVar;
        if (awoqVar instanceof ifl) {
            iflVar = (ifl) awoqVar;
            int i = iflVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                iflVar.e = i - Integer.MIN_VALUE;
            } else {
                iflVar = new ifl(this, awoqVar);
            }
        } else {
            iflVar = new ifl(this, awoqVar);
        }
        Object objI = iflVar.c;
        ?? arrayList = awox.a;
        int i2 = iflVar.e;
        if (i2 == 0) {
            atqp.j(objI);
            iflVar.b = hyzVar;
            iflVar.a = z;
            iflVar.e = 1;
            objI = i(iflVar);
            if (objI != arrayList) {
            }
            r10 = hyzVar;
            return arrayList;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = iflVar.a;
        Object obj = iflVar.b;
        atqp.j(objI);
        r10 = obj;
        r10 = hyzVar;
        Duration duration = (Duration) objI;
        abjk abjkVarF = ((abjp) this.d.io()).f();
        vxz vxzVar = this.b;
        abjk abjkVar = abjk.a;
        if (!vxzVar.l(13, 45627362L, false) && z) {
            return j(r10, duration);
        }
        if (abjkVarF != abjkVar) {
            List<hyz> listAi = atqq.ai(e());
            arrayList = new ArrayList(atqq.N(listAi, 10));
            for (hyz hyzVar2 : listAi) {
                abnl abnlVarN = hyzVar2.n();
                if (abnlVarN == null || l(abnlVarN)) {
                    igdVar = this.g;
                } else {
                    abut abutVarH = abuu.h();
                    abutVarH.b(abnlVarN);
                    abutVarH.e(k());
                    igdVar = new igd(abutVarH.a(), hyzVar2.m(), abjk.b, 8);
                }
                arrayList.add(igdVar);
            }
        } else {
            List<hyz> listAi2 = atqq.ai(e());
            arrayList = new ArrayList(atqq.N(listAi2, 10));
            for (hyz hyzVar3 : listAi2) {
                abnl abnlVarN2 = hyzVar3.n();
                arrayList.add((abnlVarN2 == null || l(abnlVarN2)) ? this.g : g(abnlVarN2, hyzVar3.m(), duration));
            }
        }
        r10 = hyzVar;
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [ifn] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [hyz] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final Object d(int i, abtu abtuVar, boolean z, awoq awoqVar) throws Throwable {
        ifm ifmVar;
        abtu abtuVar2;
        boolean z2;
        ?? r9;
        Duration duration;
        abtu abtuVar3;
        ?? r5;
        abtt abttVar;
        int i2 = i;
        if (awoqVar instanceof ifm) {
            ifmVar = (ifm) awoqVar;
            int i3 = ifmVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ifmVar.f = i3 - Integer.MIN_VALUE;
            } else {
                ifmVar = new ifm(this, awoqVar);
            }
        } else {
            ifmVar = new ifm(this, awoqVar);
        }
        Object obj = ifmVar.d;
        awox awoxVar = awox.a;
        int i4 = ifmVar.f;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z3 = ifmVar.c;
                int i5 = ifmVar.a;
                Object obj2 = ifmVar.b;
                abtu abtuVar4 = ifmVar.g;
                atqp.j(obj);
                z2 = z3;
                i2 = i5;
                abtuVar2 = abtuVar4;
                r9 = obj2;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = ifmVar.a;
                duration = ifmVar.h;
                Object obj3 = ifmVar.b;
                abtuVar3 = ifmVar.g;
                atqp.j(obj);
                r5 = obj3;
            }
            List list = (List) obj;
            return f(i2, h((abun) list.get(i2), abtuVar3, r5, duration), list);
        }
        atqp.j(obj);
        hyz hyzVar = (hyz) e().get(i2);
        abtuVar2 = abtuVar;
        ifmVar.g = abtuVar2;
        ifmVar.b = hyzVar;
        ifmVar.a = i2;
        z2 = z;
        ifmVar.c = z2;
        ifmVar.f = 1;
        Object objI = i(ifmVar);
        if (objI == awoxVar) {
            return awoxVar;
        }
        r9 = hyzVar;
        obj = objI;
        Duration duration2 = (Duration) obj;
        if (((abjp) this.d.io()).f() == abjk.a) {
            Map mapA = abtuVar2.a();
            Object obj4 = mapA != null ? mapA.get("avSwitchTargetMode") : null;
            ibh ibhVar = obj4 instanceof ibh ? (ibh) obj4 : null;
            if (ibhVar != null && ((abttVar = abtuVar2.e) == abtt.JUMP || abttVar == abtt.INSERT)) {
                abnl abnlVarN = r9.n();
                boolean zC = igs.c(gzj.P(abnlVarN != null ? abnlVarN.b : null));
                if ((r9 instanceof hzg) || zC) {
                    this.j.j(ibhVar);
                    icj icjVar = this.f;
                    Collection.EL.stream(abjg.c(icjVar, 0)).forEach(new hsk(ibhVar, 13));
                    Collection.EL.stream(abjg.c(icjVar, 1)).forEach(new hsk(ibhVar, 14));
                }
            }
        }
        if (z2) {
            List listJ = j(r9, duration2);
            return f(0, h((abun) listJ.get(0), abtuVar2, r9, duration2), listJ);
        }
        ifmVar.g = abtuVar2;
        ifmVar.b = r9;
        ifmVar.h = duration2;
        ifmVar.a = i2;
        ifmVar.f = 2;
        Object objC = c(false, null, ifmVar);
        if (objC == awoxVar) {
            return awoxVar;
        }
        duration = duration2;
        obj = objC;
        abtuVar3 = abtuVar2;
        r5 = r9;
        List list2 = (List) obj;
        return f(i2, h((abun) list2.get(i2), abtuVar3, r5, duration), list2);
    }

    public final List e() {
        if (this.i.a == ibv.LOOP_ALL || !this.e.getBoolean(gzj.AUTOPLAY_ENABLED, true)) {
            List listO = ((abjp) this.d.io()).o(0);
            listO.getClass();
            return listO;
        }
        List listN = ((abjp) this.d.io()).n();
        listN.getClass();
        return listN;
    }
}
