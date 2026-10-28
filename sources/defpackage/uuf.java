package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class uuf implements utv {
    public final long b;

    public uuf(long j) {
        this.b = j;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    public abstract aufa d(aufa aufaVar);

    public abstract augy f(augy augyVar);

    /* JADX WARN: Code duplicated, block: B:70:0x0179  */
    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) throws utw {
        Object obj;
        Object next;
        aiie aiieVar;
        augi augiVar;
        awml awmlVar;
        int iAV;
        aufa aufaVar;
        auhsVar.getClass();
        long j = this.b;
        Optional optionalN = usj.n(auhsVar, j);
        optionalN.getClass();
        if (!optionalN.isPresent()) {
            Optional optionalM = usj.m(auhsVar, j);
            optionalM.getClass();
            if (!optionalM.isPresent()) {
                throw new utw(a.bS(j, "Could not find segment with ID: "), this);
            }
            auhs auhsVarH = usj.h(auhsVar, d((aufa) optionalM.get()));
            auhsVarH.getClass();
            return auhsVarH;
        }
        augy augyVarF = f((augy) optionalN.get());
        auhs auhsVarI = usj.i(auhsVar, augyVarF);
        auhsVarI.getClass();
        aiie aiieVar2 = auhsVarI.f;
        aiieVar2.getClass();
        aihl aihlVar = augl.b;
        aihlVar.getClass();
        aiie aiieVar3 = ((augl) yno.gi(aiieVar2, aihlVar)).c;
        aiieVar3.getClass();
        Iterator it = atqq.aw(aiieVar3).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((augk) next).b != augyVarF.e);
        augk augkVar = (augk) next;
        if (augkVar != null) {
            long j2 = augkVar.c;
            aiie aiieVar4 = auhsVarI.e;
            aiieVar4.getClass();
            Iterator<E> it2 = aiieVar4.iterator();
            do {
                if (!it2.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                aufaVar = (aufa) it2.next();
            } while (aufaVar.e != j2);
            aufaVar.getClass();
            aihf builder = aufaVar.toBuilder();
            builder.getClass();
            aigu aiguVar = augyVarF.i;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aiguVar.getClass();
            atqo.l(aiguVar, builder);
            auhsVarI = usj.h(auhsVarI, atqo.h(builder));
            auhsVarI.getClass();
        }
        aiie aiieVar5 = auhsVarI.f;
        aiieVar5.getClass();
        aihl aihlVar2 = augj.b;
        aihlVar2.getClass();
        augj augjVar = (augj) yno.gh(aiieVar5, aihlVar2);
        if (augjVar == null || (aiieVar = augjVar.c) == null) {
            return auhsVarI;
        }
        for (Object obj2 : aiieVar) {
            augi augiVar2 = (augi) obj2;
            if (augiVar2.c == augyVarF.e && (iAV = a.aV(augiVar2.i)) != 0 && iAV == 3) {
                obj = obj2;
                break;
            }
        }
        augi augiVar3 = (augi) obj;
        if (augiVar3 == null) {
            return auhsVarI;
        }
        aiie aiieVar6 = augiVar3.j;
        aiieVar6.getClass();
        if (aiieVar6.isEmpty()) {
            augiVar = augiVar3;
        } else {
            aigu aiguVar2 = augyVarF.i;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            aiguVar2.getClass();
            long millis = aext.v(aiguVar2).toMillis();
            aigu aiguVar3 = augyVarF.j;
            if (aiguVar3 == null) {
                aiguVar3 = aigu.a;
            }
            aiguVar3.getClass();
            long jI = awro.i(aext.v(aiguVar3).toMillis(), 0L);
            long j3 = millis + jI;
            anfg anfgVar = ((augh) atqq.X(aiieVar6)).c;
            if (anfgVar == null) {
                anfgVar = anfg.a;
            }
            aigu aiguVar4 = anfgVar.c;
            if (aiguVar4 == null) {
                aiguVar4 = aigu.a;
            }
            aiguVar4.getClass();
            long millis2 = aext.v(aiguVar4).toMillis();
            augh aughVar = (augh) atqq.ab(aiieVar6);
            long j4 = 0;
            anfg anfgVar2 = aughVar.c;
            if (anfgVar2 == null) {
                anfgVar2 = anfg.a;
            }
            aigu aiguVar5 = anfgVar2.c;
            if (aiguVar5 == null) {
                aiguVar5 = aigu.a;
            }
            aiguVar5.getClass();
            long millis3 = aext.v(aiguVar5).toMillis();
            anfg anfgVar3 = aughVar.c;
            if (anfgVar3 == null) {
                anfgVar3 = anfg.a;
            }
            aigu aiguVar6 = anfgVar3.d;
            if (aiguVar6 == null) {
                aiguVar6 = aigu.a;
            }
            aiguVar6.getClass();
            long millis4 = (millis3 + aext.v(aiguVar6).toMillis()) - millis2;
            if (millis2 == millis && millis4 == jI) {
                augiVar = augiVar3;
            } else {
                ArrayList arrayList = new ArrayList(atqq.N(aiieVar6, 10));
                Iterator it3 = aiieVar6.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    aiie aiieVar7 = aiieVar6;
                    int i2 = i + 1;
                    if (i < 0) {
                        atqq.M();
                    }
                    long j5 = millis;
                    augh aughVar2 = (augh) next2;
                    long j6 = jI;
                    if (millis4 <= j4) {
                        awmlVar = new awml(Long.valueOf(j5 + ((j6 * ((long) i)) / ((long) aiieVar7.size()))), Long.valueOf(i == aiieVar7.size() + (-1) ? j3 : j5 + ((j6 * ((long) i2)) / ((long) aiieVar7.size()))));
                    } else {
                        anfg anfgVar4 = aughVar2.c;
                        if (anfgVar4 == null) {
                            anfgVar4 = anfg.a;
                        }
                        aigu aiguVar7 = anfgVar4.c;
                        if (aiguVar7 == null) {
                            aiguVar7 = aigu.a;
                        }
                        aiguVar7.getClass();
                        long millis5 = aext.v(aiguVar7).toMillis();
                        anfg anfgVar5 = aughVar2.c;
                        if (anfgVar5 == null) {
                            anfgVar5 = anfg.a;
                        }
                        aigu aiguVar8 = anfgVar5.d;
                        if (aiguVar8 == null) {
                            aiguVar8 = aigu.a;
                        }
                        aiguVar8.getClass();
                        long millis6 = millis5 + aext.v(aiguVar8).toMillis();
                        long j7 = millis5 - millis2;
                        int i3 = i;
                        long j8 = awro.j(j7, 0L, millis4);
                        awmlVar = new awml(Long.valueOf(i3 == 0 ? j5 : j5 + ((j8 * j6) / millis4)), Long.valueOf(i3 == aiieVar7.size() + (-1) ? j3 : j5 + ((awro.j(millis6 - millis2, j8, millis4) * j6) / millis4)));
                    }
                    long jLongValue = ((Number) awmlVar.a).longValue();
                    Iterator it4 = it3;
                    long j9 = j3;
                    long jI2 = awro.i(((Number) awmlVar.b).longValue() - jLongValue, j4);
                    aughVar2.getClass();
                    aihf builder2 = aughVar2.toBuilder();
                    builder2.getClass();
                    anfg anfgVar6 = aughVar2.c;
                    if (anfgVar6 == null) {
                        anfgVar6 = anfg.a;
                    }
                    anfgVar6.getClass();
                    aihf builder3 = anfgVar6.toBuilder();
                    builder3.getClass();
                    Duration durationOfMillis = Duration.ofMillis(jLongValue);
                    durationOfMillis.getClass();
                    aigu aiguVarU = aext.u(durationOfMillis);
                    builder3.copyOnWrite();
                    anfg anfgVar7 = (anfg) builder3.instance;
                    anfgVar7.c = aiguVarU;
                    anfgVar7.b |= 1;
                    Duration durationOfMillis2 = Duration.ofMillis(jI2);
                    durationOfMillis2.getClass();
                    aigu aiguVarU2 = aext.u(durationOfMillis2);
                    builder3.copyOnWrite();
                    anfg anfgVar8 = (anfg) builder3.instance;
                    anfgVar8.d = aiguVarU2;
                    anfgVar8.b |= 2;
                    aihn aihnVarBuild = builder3.build();
                    aihnVarBuild.getClass();
                    builder2.copyOnWrite();
                    augh aughVar3 = (augh) builder2.instance;
                    aughVar3.c = (anfg) aihnVarBuild;
                    aughVar3.b |= 2;
                    aihn aihnVarBuild2 = builder2.build();
                    aihnVarBuild2.getClass();
                    arrayList.add((augh) aihnVarBuild2);
                    it3 = it4;
                    j3 = j9;
                    i = i2;
                    aiieVar6 = aiieVar7;
                    millis = j5;
                    jI = j6;
                    j4 = 0;
                }
                jrr jrrVar = (jrr) augiVar3.toBuilder();
                jrrVar.getClass();
                atqo.G(jrrVar);
                jrrVar.copyOnWrite();
                ((augi) jrrVar.instance).j = augi.emptyProtobufList();
                atqo.G(jrrVar);
                jrrVar.g(arrayList);
                aihn aihnVarBuild3 = jrrVar.build();
                aihnVarBuild3.getClass();
                augiVar = (augi) aihnVarBuild3;
            }
        }
        if (awrc.c(augiVar, augiVar3)) {
            return auhsVarI;
        }
        aihlVar2.getClass();
        return yno.gg(auhsVarI, aihlVar2, new pge(augyVarF, augiVar, 12));
    }

    public /* synthetic */ void c(urz urzVar) {
    }
}
