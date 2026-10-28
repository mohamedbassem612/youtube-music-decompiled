package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsa extends awjz implements avlk {
    private static final long serialVersionUID = -8158322871608889516L;
    final axsp a;
    final axso[] b;
    final AtomicInteger c = new AtomicInteger();
    int d;
    long e;

    public avsa(axso[] axsoVarArr, axsp axspVar) {
        this.a = axspVar;
        this.b = axsoVarArr;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        h(axsqVar);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.e++;
        this.a.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        AtomicInteger atomicInteger = this.c;
        if (atomicInteger.getAndIncrement() == 0) {
            axso[] axsoVarArr = this.b;
            int length = axsoVarArr.length;
            int i = this.d;
            while (i != 2) {
                axso axsoVar = axsoVarArr[i];
                if (axsoVar == null) {
                    this.a.b(new NullPointerException("A Publisher entry is null"));
                    return;
                }
                long j = this.e;
                if (j != 0) {
                    this.e = 0L;
                    g(j);
                }
                axsoVar.aq(this);
                i++;
                this.d = i;
                if (atomicInteger.decrementAndGet() == 0) {
                    return;
                }
            }
            this.a.kn();
        }
    }
}
