package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avrn extends avlh {
    final avnb b;
    final avni c;
    final AtomicInteger d = new AtomicInteger();

    public avrn(avnb avnbVar, avni avniVar) {
        this.b = avnbVar;
        this.c = avniVar;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        avnb avnbVar = this.b;
        avnbVar.aq(axspVar);
        if (this.d.incrementAndGet() == 1) {
            avnbVar.e(this.c);
        }
    }
}
