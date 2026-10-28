package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axel extends awtt implements axsq {
    public final awzc b;
    public final axsp c;
    private volatile boolean cancellationRequested;
    public final awtq f;
    public final awtr g;

    public axel(awzc awzcVar, axsp axspVar, awou awouVar) {
        super(awouVar, false, true);
        this.b = awzcVar;
        this.c = axspVar;
        awts awtsVar = awts.a;
        this.f = new awtq(0L, awtsVar);
        this.g = new awtr(new axej(((awtt) this).a, this), awtsVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(awoq awoqVar) {
        axek axekVar;
        if (awoqVar instanceof axek) {
            axekVar = (axek) awoqVar;
            int i = axekVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                axekVar.c = i - Integer.MIN_VALUE;
            } else {
                axekVar = new axek(this, awoqVar);
            }
        } else {
            axekVar = new axek(this, awoqVar);
        }
        Object obj = axekVar.a;
        awox awoxVar = awox.a;
        int i2 = axekVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                axekVar.c = 1;
                Object objCollect = this.b.collect(new ikw(this, 7), axekVar);
                if (objCollect != awoxVar) {
                    objCollect = awmy.a;
                }
                if (objCollect == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            try {
                this.c.kn();
            } catch (Throwable th) {
                awrc.Q(((awtt) this).a, th);
            }
        } catch (Throwable th2) {
            boolean z = axcn.a;
            Throwable thC = (axcn.a || !awuv.b) ? th2 : axdx.c(th2);
            if (!this.cancellationRequested || q() || thC != m()) {
                try {
                    this.c.b(th2);
                } catch (Throwable th3) {
                    avkz.d(th2, th3);
                    awrc.Q(((awtt) this).a, th2);
                }
            }
        }
        return awmy.a;
    }

    @Override // defpackage.axsq
    public final /* synthetic */ void kj() {
        this.cancellationRequested = true;
        p(null);
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        long j2;
        long j3;
        awoq awoqVar;
        if (j > 0) {
            awtq awtqVar = this.f;
            do {
                j2 = awtqVar.b;
                j3 = j2 + j;
                if (j3 <= 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!awtqVar.c(j2, j3));
            if (j2 <= 0) {
                do {
                    awoqVar = (awoq) this.g.a(null);
                } while (awoqVar == null);
                awoqVar.resumeWith(awmy.a);
            }
        }
    }
}
