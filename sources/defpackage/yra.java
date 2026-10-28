package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.NetworkException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yra extends zir {
    public final zhk b;
    private final zjh c;
    private final long d;
    private final mbc e;
    private long f;
    private final zjr g;
    private final avlh h;
    private final avlh i;
    private final ytf j;
    private final zjd k;
    private final avmb l;
    private final avmm m;
    private int n;

    public yra(byw bywVar, ytf ytfVar, zjd zjdVar, mbc mbcVar, zjr zjrVar, avlh avlhVar, avlh avlhVar2, avmb avmbVar) {
        super(bywVar);
        this.m = new avmm();
        this.n = 0;
        zjrVar.getClass();
        this.c = new zjh(new tar(zjrVar, 15));
        this.d = zjrVar.K();
        this.e = mbcVar;
        this.g = zjrVar;
        this.h = avlhVar;
        this.i = avlhVar2;
        this.j = ytfVar;
        this.b = new zhk(null, null);
        this.k = zjdVar;
        this.l = avmbVar;
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final long b(byi byiVar) throws caf {
        this.f = this.e.b();
        long jN = this.g.N();
        avlh avlhVarL = this.i.p().l(jN, TimeUnit.MILLISECONDS);
        avmb avmbVar = this.l;
        this.m.e(avlhVarL.L(avmbVar).x(new yqz(0)).ak(new xul(this, 13)), this.h.p().l(jN, TimeUnit.MILLISECONDS).L(avmbVar).x(new yqz(2)).ak(new xul(this, 14)));
        while (true) {
            try {
                return super.b(byiVar);
            } catch (caf e) {
                if (!(e.getCause() instanceof NetworkException)) {
                    throw e;
                }
                NetworkException networkException = (NetworkException) e.getCause();
                ytf ytfVar = this.j;
                ytfVar.d(e);
                if (networkException.getErrorCode() != 2) {
                    throw e;
                }
                super.f();
                zhk zhkVar = this.b;
                zhkVar.f();
                if (this.n == 0) {
                    tyt tytVar = new tyt(byiVar.a);
                    tytVar.e("retry", "1");
                    byiVar = byiVar.c(tytVar.a());
                }
                int i = this.n + 1;
                this.n = i;
                ytfVar.f("oroid", Integer.toString(i));
                long jA = this.c.a(this.n);
                long j = this.d;
                if (j == 0 || this.e.b() + jA > this.f + j) {
                    throw new caf(byiVar, (byte[]) null);
                }
                try {
                    zhkVar.d(jA);
                    this.k.Q();
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    throw new caf(new IOException(e2), byiVar);
                }
            }
        }
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final void f() {
        this.n = 0;
        this.m.b();
        super.f();
    }
}
