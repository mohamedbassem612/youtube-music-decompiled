package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axbt extends awpk implements awqk {
    int a;
    final /* synthetic */ awzc[] b;
    final /* synthetic */ int c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ awye e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbt(awzc[] awzcVarArr, int i, AtomicInteger atomicInteger, awye awyeVar, awoq awoqVar) {
        super(2, awoqVar);
        this.b = awzcVarArr;
        this.c = i;
        this.d = atomicInteger;
        this.e = awyeVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new axbt(this.b, this.c, this.d, this.e, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((axbt) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        try {
            if (this.a != 0) {
                atqp.j(obj);
            } else {
                atqp.j(obj);
                awzc[] awzcVarArr = this.b;
                int i = this.c;
                awzc awzcVar = awzcVarArr[i];
                axbs axbsVar = new axbs(this.e, i);
                this.a = 1;
                if (awzcVar.collect(axbsVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
            if (this.d.decrementAndGet() == 0) {
                this.e.u(null);
            }
            return awmy.a;
        } catch (Throwable th) {
            if (this.d.decrementAndGet() == 0) {
                this.e.u(null);
            }
            throw th;
        }
    }
}
