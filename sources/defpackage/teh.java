package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class teh extends awpk implements awqk {
    final /* synthetic */ teq a;
    final /* synthetic */ tew b;
    final /* synthetic */ long c;
    final /* synthetic */ Throwable d;
    final /* synthetic */ awri e;
    final /* synthetic */ AtomicInteger f;
    final /* synthetic */ AtomicInteger g;
    final /* synthetic */ AtomicInteger h;
    final /* synthetic */ String i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teh(teq teqVar, tew tewVar, long j, Throwable th, int i, awri awriVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.a = teqVar;
        this.b = tewVar;
        this.c = j;
        this.d = th;
        this.j = i;
        this.e = awriVar;
        this.f = atomicInteger;
        this.g = atomicInteger2;
        this.h = atomicInteger3;
        this.i = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new teh(this.a, this.b, this.c, this.d, this.j, this.e, this.f, this.g, this.h, this.i, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((teh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        teq teqVar = this.a;
        tew tewVar = this.b;
        teqVar.d(tewVar);
        if (teqVar.f()) {
            long jB = teqVar.d.b() - this.c;
            teqVar.k(this.j, new tev(this.d != null ? 5 : 3, tewVar, this.e.a, false, 0, false, jB, this.f.get() + this.g.get() + this.h.get(), 24), this.i);
        }
        return awmy.a;
    }
}
