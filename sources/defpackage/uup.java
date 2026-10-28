package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uup implements utu {
    private final /* synthetic */ int $cid;
    private final Object a;

    public uup(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.utu
    public final utv a(auhs auhsVar) {
        throw null;
    }

    @Override // defpackage.utu
    public final /* synthetic */ utv b(auhs auhsVar) {
        if (this.$cid == 0) {
            auhsVar.getClass();
            ArrayList arrayList = new ArrayList();
            aufa aufaVar = (aufa) this.a;
            arrayList.add(new uvk(aufaVar));
            arrayList.add(new uvg(aufaVar.e));
            return new utt(arrayList);
        }
        auhsVar.getClass();
        agke agkeVarE = usj.e(auhsVar);
        agkeVarE.getClass();
        ArrayList arrayList2 = new ArrayList(atqq.N(agkeVarE, 10));
        Iterator<E> it = agkeVarE.iterator();
        while (it.hasNext()) {
            long j = ((augy) it.next()).e;
            Object obj = this.a;
            boolean z = false;
            if (obj != null && j != ((Long) obj).longValue()) {
                z = true;
            }
            arrayList2.add(new uuc(j, z));
        }
        return new utt(aguu.T(atqq.ap(arrayList2)));
    }
}
