package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpv extends avlb {
    final avle a;
    final TimeUnit b;
    final avmb c;

    public avpv(avle avleVar, TimeUnit timeUnit, avmb avmbVar) {
        this.a = avleVar;
        this.b = timeUnit;
        this.c = avmbVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        this.a.kp(new avpu(avlcVar, this.b, this.c));
    }
}
