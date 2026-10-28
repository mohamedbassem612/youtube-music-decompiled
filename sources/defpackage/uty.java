package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uty implements utu {
    private final /* synthetic */ int $cid;
    private final long a;

    public uty(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [awqg, java.lang.Object] */
    @Override // defpackage.utu
    public final utv a(auhs auhsVar) {
        int i = 6;
        int i2 = 4;
        if (this.$cid != 0) {
            auhsVar.getClass();
            long j = this.a;
            utv[] utvVarArr = new utv[4];
            utvVarArr[0] = new uty(j, 0).a(auhsVar);
            agrf agrfVar = usj.a;
            Optional optionalFindFirst = Collection.EL.stream(yno.gv(auhsVar).c).filter(new uqr(j, i)).map(new ush(i2)).flatMap(new uot(auhsVar, i2)).findFirst();
            sla slaVar = new sla(new rla(auhsVar, 12), 18);
            if (true == optionalFindFirst.isPresent()) {
                optionalFindFirst = Optional.ofNullable(slaVar.a.invoke(optionalFindFirst.get()));
            }
            optionalFindFirst.getClass();
            utvVarArr[1] = awrc.f(optionalFindFirst);
            utvVarArr[2] = new uud(0);
            utvVarArr[3] = new uud(1);
            return new utt(atqq.ai(atqq.J(utvVarArr)));
        }
        auhsVar.getClass();
        Long lValueOf = Long.valueOf(this.a);
        Set setP = atqq.p(lValueOf);
        awnm awnmVar = new awnm(atqq.H(lValueOf));
        while (!awnmVar.isEmpty()) {
            Map mapGn = yno.gn(auhsVar, ((Number) awnmVar.removeFirst()).longValue());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapGn.entrySet()) {
                if (((augc) entry.getValue()).d) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((Number) it.next()).longValue());
                if (setP.add(lValueOf2)) {
                    awnmVar.addLast(lValueOf2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setP.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            arrayList.addAll(atqq.aL(new uux[]{new uuy(jLongValue), new uvd(jLongValue), new uve(jLongValue), new uvb(jLongValue), new uuz(jLongValue), new uvc(jLongValue), new uva(jLongValue)}));
            arrayList.add(new uvj(jLongValue));
        }
        return new utt(arrayList);
    }

    @Override // defpackage.utu
    public final /* synthetic */ utv b(auhs auhsVar) {
        return this.$cid != 0 ? a(auhsVar) : a(auhsVar);
    }
}
