package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avqx extends avlb {
    final avle a;
    final long b;
    final TimeUnit c;
    final avmb d;
    final avle e;

    public avqx(avle avleVar, long j, TimeUnit timeUnit, avmb avmbVar, avle avleVar2) {
        this.a = avleVar;
        this.b = j;
        this.c = timeUnit;
        this.d = avmbVar;
        this.e = avleVar2;
    }

    @Override // defpackage.avlb
    public final void H(avlc avlcVar) {
        avmm avmmVar = new avmm();
        avlcVar.d(avmmVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        avmmVar.c(this.d.c(new avqv(this, atomicBoolean, avmmVar, avlcVar), this.b, this.c));
        this.a.kp(new avqw(avmmVar, atomicBoolean, avlcVar));
    }
}
