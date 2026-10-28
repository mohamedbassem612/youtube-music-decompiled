package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wvo extends wvn {
    private final awmd a;
    private final Executor b;
    private boolean c;

    public wvo(ci ciVar, awmd awmdVar, awmd awmdVar2, Executor executor) {
        super(ciVar, awmdVar2);
        this.a = awmdVar;
        this.b = executor;
    }

    @Override // defpackage.wvn
    protected final synchronized void c(zwa zwaVar) {
        if (this.c) {
            return;
        }
        aend aendVar = (aend) this.a.io();
        wqj wqjVarB = aendVar.b();
        wqjVarB.o(vzh.b);
        try {
            try {
                b((alzm) aendVar.c(wqjVarB, this.b).get(4L, TimeUnit.SECONDS), zwaVar);
            } catch (ExecutionException unused) {
                d(22);
            }
        } catch (InterruptedException unused2) {
            d(21);
        } catch (TimeoutException unused3) {
            d(4);
        }
        this.c = true;
    }
}
