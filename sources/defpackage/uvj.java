package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvj implements utv {
    private final long a;

    public uvj(long j) {
        this.a = j;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        auhsVar.getClass();
        aiie aiieVar = auhsVar.e;
        aiieVar.getClass();
        if (!aiieVar.isEmpty()) {
            Iterator<E> it = aiieVar.iterator();
            while (it.hasNext()) {
                long j = ((aufa) it.next()).e;
                long j2 = this.a;
                if (j == j2) {
                    auhq auhqVar = (auhq) auhsVar.toBuilder();
                    auhqVar.getClass();
                    atqn.A(auhqVar);
                    auhqVar.copyOnWrite();
                    ((auhs) auhqVar.instance).e = auhs.emptyProtobufList();
                    atqn.A(auhqVar);
                    aiie aiieVar2 = auhsVar.e;
                    aiieVar2.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : aiieVar2) {
                        if (((aufa) obj).e != j2) {
                            arrayList.add(obj);
                        }
                    }
                    auhqVar.a(atqq.ap(arrayList));
                    return atqn.z(auhqVar);
                }
            }
        }
        aiie aiieVar3 = auhsVar.d;
        aiieVar3.getClass();
        if (aiieVar3.isEmpty()) {
            return auhsVar;
        }
        Iterator<E> it2 = aiieVar3.iterator();
        while (it2.hasNext()) {
            long j3 = ((augy) it2.next()).e;
            long j4 = this.a;
            if (j3 == j4) {
                auhq auhqVar2 = (auhq) auhsVar.toBuilder();
                auhqVar2.getClass();
                atqn.B(auhqVar2);
                auhqVar2.copyOnWrite();
                ((auhs) auhqVar2.instance).d = auhs.emptyProtobufList();
                atqn.B(auhqVar2);
                aiie aiieVar4 = auhsVar.d;
                aiieVar4.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : aiieVar4) {
                    if (((augy) obj2).e != j4) {
                        arrayList2.add(obj2);
                    }
                }
                auhqVar2.b(atqq.ap(arrayList2));
                return atqn.z(auhqVar2);
            }
        }
        return auhsVar;
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
