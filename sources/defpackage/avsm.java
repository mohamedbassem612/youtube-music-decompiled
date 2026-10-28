package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsm extends awma {
    final avsn a;
    final long b;
    final Object c;
    boolean d;
    final AtomicBoolean e = new AtomicBoolean();

    public avsm(avsn avsnVar, long j, Object obj) {
        this.a = avsnVar;
        this.b = j;
        this.c = obj;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.d) {
            atqp.n(th);
        } else {
            this.d = true;
            this.a.b(th);
        }
    }

    final void d() {
        if (this.e.compareAndSet(false, true)) {
            avsn avsnVar = this.a;
            long j = this.b;
            Object obj = this.c;
            if (j == avsnVar.e) {
                if (avsnVar.get() != 0) {
                    avsnVar.a.kk(obj);
                    atqp.F(avsnVar, 1L);
                } else {
                    avsnVar.kj();
                    avsnVar.a.b(new avmx("Could not deliver value due to lack of requests"));
                }
            }
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.d) {
            return;
        }
        this.d = true;
        dispose();
        d();
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.d) {
            return;
        }
        this.d = true;
        d();
    }
}
