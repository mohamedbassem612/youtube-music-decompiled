package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tei extends awpk implements awqk {
    final /* synthetic */ List a;
    final /* synthetic */ AtomicInteger b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tei(List list, AtomicInteger atomicInteger, awoq awoqVar) {
        super(2, awoqVar);
        this.a = list;
        this.b = atomicInteger;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        tei teiVar = new tei(this.a, this.b, awoqVar);
        teiVar.c = obj;
        return teiVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tei) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        awut awutVar = (awut) this.c;
        for (Object obj2 : this.a) {
            obj2.getClass();
            acqh acqhVar = (acqh) obj2;
            awrc.M(awutVar);
            try {
                acqhVar.V();
                this.b.incrementAndGet();
            } catch (Exception unused) {
                awrc.M(awutVar);
            }
        }
        return awmy.a;
    }
}
