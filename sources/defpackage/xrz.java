package defpackage;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xrz implements Runnable {
    final List a;
    final CountDownLatch b;
    final boolean c;
    final boolean d;
    final abxv e;

    public xrz(List list, CountDownLatch countDownLatch, abxv abxvVar, boolean z, boolean z2) {
        this.a = list;
        this.b = countDownLatch;
        this.e = abxvVar;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.addAll(this.e.m(this.c, this.d));
        this.b.countDown();
    }
}
