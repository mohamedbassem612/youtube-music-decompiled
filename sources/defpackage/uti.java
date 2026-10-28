package defpackage;

import internal.org.jni_zero.CommonApis;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uti implements uth {
    @Override // defpackage.uth
    public final boolean a(usd usdVar, auhs auhsVar) {
        for (augi augiVar : ((augj) yno.gx(auhsVar, augj.b)).c) {
            Optional optionalFindFirst = Collection.EL.stream(auhsVar.d).filter(new uso(augiVar, 4)).findFirst();
            sda sdaVar = new sda(usdVar, augiVar, 8);
            if (true == optionalFindFirst.isPresent()) {
                Object obj = optionalFindFirst.get();
                Object obj2 = sdaVar.a;
                Object obj3 = sdaVar.b;
                usd usdVar2 = (usd) obj2;
                usdVar2.j((augy) obj);
                augi augiVar2 = (augi) obj3;
                long j = augiVar2.c;
                String str = augiVar2.e;
                float f = augiVar2.d;
                int iD = CommonApis.d(augiVar2.f);
                int i = iD == 0 ? 1 : iD;
                int iBc = a.bc(augiVar2.g);
                int i2 = iBc == 0 ? 1 : iBc;
                String str2 = augiVar2.h;
                int iAV = a.aV(augiVar2.i);
                usdVar2.i(new uts(j, str, f, i, i2, str2, iAV == 0 ? 1 : iAV, augiVar2.j));
            }
        }
        Stream streamFilter = Collection.EL.stream(auhsVar.d).filter(new sde(19));
        usdVar.getClass();
        streamFilter.forEach(new usf(usdVar, 2));
        agjz agjzVar = new agjz(4);
        Iterable$EL.forEach(auhsVar.d, new rew(auhsVar, agjzVar, 15));
        usdVar.i(new utt(agjzVar.g()));
        agjz agjzVar2 = new agjz(4);
        auhs auhsVarC = usdVar.c();
        for (augy augyVar : auhsVar.d) {
            if (augyVar.c == 112) {
                Optional optionalFindFirst2 = Collection.EL.stream(auhsVar.n).filter(new uso(augyVar, 3)).findFirst();
                if (!optionalFindFirst2.isEmpty()) {
                    try {
                        agjzVar2.h(new utl(augyVar, usdVar.b).a(auhsVarC));
                        agjzVar2.h(new uuu((akcw) optionalFindFirst2.get(), 0));
                    } catch (utw e) {
                        twu.c(6, "Failed to add skottie segment in OverlaySegmentCompositionLoadStep", e);
                    }
                }
            }
        }
        agke agkeVarG = agjzVar2.g();
        if (!agkeVarG.isEmpty()) {
            usdVar.i(new utt(agkeVarG));
        }
        return true;
    }
}
