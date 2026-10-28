package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kub implements ktf {
    private final Context a;
    private final int b;
    private final kul c;

    public kub(Context context, kul kulVar, int i) {
        this.a = context;
        this.c = kulVar;
        this.b = i;
    }

    @Override // defpackage.ktf
    public final String a(Map map) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ksy ksyVar = kyq.a;
        kul kulVar = this.c;
        ExecutorService executorServiceAn = ksy.an(1);
        lpa lpaVarA = kulVar.a(map);
        lpaVarA.l(executorServiceAn, new kbr(countDownLatch, 6));
        try {
            return !countDownLatch.await((long) this.b, TimeUnit.MILLISECONDS) ? kyr.e(this.a, new TimeoutException("Snapshot timed out")) : kyr.d(this.a, lpaVarA);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return kyr.e(this.a, e);
        }
    }

    @Override // defpackage.ktf
    public final void b(Map map) {
        kul kulVar = this.c;
        if ((kulVar instanceof kul) && aurd.a.io().a()) {
            kulVar.b.O(2, 2, new kuk(kulVar, map, 0));
        }
    }

    @Override // defpackage.ktf
    public final boolean c() {
        kul kulVar = this.c;
        if (kulVar instanceof kul) {
            return kulVar.d();
        }
        return false;
    }

    @Override // defpackage.ktf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
