package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tek extends awpk implements awqk {
    final /* synthetic */ teq a;
    final /* synthetic */ List b;
    final /* synthetic */ AtomicInteger c;
    final /* synthetic */ List d;
    final /* synthetic */ AtomicInteger e;
    final /* synthetic */ List f;
    final /* synthetic */ AtomicInteger g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tek(teq teqVar, List list, AtomicInteger atomicInteger, List list2, AtomicInteger atomicInteger2, List list3, AtomicInteger atomicInteger3, awoq awoqVar) {
        super(2, awoqVar);
        this.a = teqVar;
        this.b = list;
        this.c = atomicInteger;
        this.d = list2;
        this.e = atomicInteger2;
        this.f = list3;
        this.g = atomicInteger3;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        tek tekVar = new tek(this.a, this.b, this.c, this.d, this.e, this.f, this.g, awoqVar);
        tekVar.h = obj;
        return tekVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tek) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        awut awutVar = (awut) this.h;
        tei teiVar = new tei(this.b, this.c, null);
        teq teqVar = this.a;
        awro.t(awutVar, teqVar.b, 0, teiVar, 2);
        awro.t(awutVar, teqVar.c, 0, new tej(this.d, this.e, this.f, this.g, null), 2);
        return awmy.a;
    }
}
