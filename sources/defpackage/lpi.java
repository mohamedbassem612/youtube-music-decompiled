package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpi implements low, lov, los {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.los
    public final void c() {
        this.a.countDown();
    }

    @Override // defpackage.lov
    public final void d(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.low
    public final void e(Object obj) {
        this.a.countDown();
    }
}
