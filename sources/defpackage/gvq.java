package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvq extends gut {
    private final iir a;

    public gvq(iir iirVar) {
        this.a = iirVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aimc aimcVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anzt.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzt.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        anzr anzrVar = (anzr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((anzrVar.b & 1) != 0) {
            iir iirVar = this.a;
            anzs anzsVar = anzrVar.c;
            if (anzsVar == null) {
                anzsVar = anzs.a;
            }
            agrx agrxVar = agso.a;
            iirVar.b.add(0, anzsVar);
            iirVar.c.kk(anzsVar);
            Stream stream = Collection.EL.stream(iirVar.b);
            final iaa iaaVar = new iaa(17);
            final HashSet hashSet = new HashSet();
            iirVar.b = (List) stream.filter(new Predicate() { // from class: iip
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public final /* synthetic */ Predicate mo841negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return hashSet.add(iaaVar.apply(obj));
                }
            }).collect(Collectors.toList());
            if (iirVar.b.size() > 11) {
                List list = iirVar.b;
                list.subList(11, list.size()).clear();
            }
            hef hefVar = iirVar.e;
            List list2 = iirVar.b;
            if (list2.isEmpty()) {
                hefVar.u(aimc.a);
            } else {
                if (list2.isEmpty()) {
                    aimcVar = aimc.a;
                } else {
                    aihf aihfVarCreateBuilder = aimc.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aimc aimcVar2 = (aimc) aihfVarCreateBuilder.instance;
                    aiie aiieVar = aimcVar2.b;
                    if (!aiieVar.c()) {
                        aimcVar2.b = aihn.mutableCopy(aiieVar);
                    }
                    aifs.addAll(list2, aimcVar2.b);
                    aimcVar = (aimc) aihfVarCreateBuilder.build();
                }
                hefVar.u(aimcVar);
            }
            iirVar.c();
        }
    }
}
