package defpackage;

import j$.time.Duration;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvp implements uvo {
    private final /* synthetic */ int $cid;

    public uvp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.uvo
    public final String a(auhs auhsVar) {
        if (this.$cid == 0) {
            auhsVar.getClass();
            for (augy augyVar : auhsVar.d) {
                aigu aiguVar = augyVar.i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                aiguVar.getClass();
                if (aext.v(aiguVar).isNegative()) {
                    return "GRAPHICAL_SEGMENT_NEGATIVE_START";
                }
                aigu aiguVar2 = augyVar.j;
                if (aiguVar2 == null) {
                    aiguVar2 = aigu.a;
                }
                aiguVar2.getClass();
                if (!a.y(aext.v(aiguVar2))) {
                    return "GRAPHICAL_SEGMENT_NON_POSITIVE_DURATION";
                }
            }
            for (aufa aufaVar : auhsVar.e) {
                aigu aiguVar3 = aufaVar.f;
                if (aiguVar3 == null) {
                    aiguVar3 = aigu.a;
                }
                aiguVar3.getClass();
                if (aext.v(aiguVar3).isNegative()) {
                    return "AUDIO_SEGMENT_NEGATIVE_START";
                }
                aigu aiguVar4 = aufaVar.g;
                if (aiguVar4 == null) {
                    aiguVar4 = aigu.a;
                }
                aiguVar4.getClass();
                if (!a.y(aext.v(aiguVar4))) {
                    return "AUDIO_SEGMENT_NON_POSITIVE_DURATION";
                }
            }
            return null;
        }
        auhsVar.getClass();
        aiie aiieVar = auhsVar.f;
        aiieVar.getClass();
        aihl aihlVar = aufx.b;
        aihlVar.getClass();
        aufx aufxVar = (aufx) yno.gh(aiieVar, aihlVar);
        if (aufxVar == null || aufxVar.c.isEmpty()) {
            return null;
        }
        agke agkeVarF = usj.f(auhsVar);
        agkeVarF.getClass();
        if (agkeVarF.size() != aufxVar.c.size()) {
            return "PRIMARY_SEGMENT_NON_EXISTENT";
        }
        if (agkeVarF.isEmpty()) {
            return null;
        }
        List listAm = atqq.am(agkeVarF, new rit(4));
        aigu aiguVar5 = ((augy) atqq.X(listAm)).i;
        if (aiguVar5 == null) {
            aiguVar5 = aigu.a;
        }
        aiguVar5.getClass();
        if (!aext.v(aiguVar5).isZero()) {
            return "PRIMARY_SEGMENT_NON_ZERO_START";
        }
        int size = listAm.size() - 1;
        int i = 0;
        while (i < size) {
            Object obj = listAm.get(i);
            obj.getClass();
            i++;
            augy augyVar2 = (augy) obj;
            Object obj2 = listAm.get(i);
            obj2.getClass();
            augy augyVar3 = (augy) obj2;
            aigu aiguVar6 = augyVar2.i;
            if (aiguVar6 == null) {
                aiguVar6 = aigu.a;
            }
            Duration durationAw = ahng.aw(aiguVar6);
            aigu aiguVar7 = augyVar2.j;
            if (aiguVar7 == null) {
                aiguVar7 = aigu.a;
            }
            Duration durationPlus = durationAw.plus(ahng.aw(aiguVar7));
            aigu aiguVar8 = augyVar3.i;
            if (aiguVar8 == null) {
                aiguVar8 = aigu.a;
            }
            aiguVar8.getClass();
            if (!awrc.c(durationPlus, aext.v(aiguVar8))) {
                return "PRIMARY_SEGMENT_NON_CONTIGUOUS";
            }
        }
        return null;
    }
}
