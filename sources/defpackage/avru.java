package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avru extends avrf {
    final long c;
    final long d;
    final TimeUnit e;
    final avmb f;

    public avru(avlh avlhVar, long j, long j2, TimeUnit timeUnit, avmb avmbVar) {
        super(avlhVar);
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
        this.f = avmbVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        long j = this.c;
        long j2 = this.d;
        if (j == j2) {
            this.b.ap(new avrr(new awmb(axspVar), j, this.e, this.f));
            return;
        }
        avma avmaVarA = this.f.a();
        avlh avlhVar = this.b;
        if (j == j2) {
            avlhVar.ap(new avrq(new awmb(axspVar), j, this.e, avmaVarA));
        } else {
            avlhVar.ap(new avrt(new awmb(axspVar), j, j2, this.e, avmaVarA));
        }
    }
}
