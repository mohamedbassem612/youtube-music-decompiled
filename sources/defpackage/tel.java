package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tel extends awpk implements awqk {
    int a;
    final /* synthetic */ teq b;
    final /* synthetic */ List c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ List e;
    final /* synthetic */ AtomicInteger f;
    final /* synthetic */ List g;
    final /* synthetic */ AtomicInteger h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tel(teq teqVar, List list, AtomicInteger atomicInteger, List list2, AtomicInteger atomicInteger2, List list3, AtomicInteger atomicInteger3, awoq awoqVar) {
        super(2, awoqVar);
        this.b = teqVar;
        this.c = list;
        this.d = atomicInteger;
        this.e = list2;
        this.f = atomicInteger2;
        this.g = list3;
        this.h = atomicInteger3;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new tel(this.b, this.c, this.d, this.e, this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tel) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            tek tekVar = new tek(this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
            this.a = 1;
            if (awrc.J(tekVar, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
