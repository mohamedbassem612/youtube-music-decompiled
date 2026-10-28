package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aawh implements zhp {
    private final AtomicLong a = new AtomicLong();
    private final AtomicLong b = new AtomicLong();
    private final AtomicInteger c = new AtomicInteger();

    @Override // defpackage.zhp
    public final void a(zih zihVar) {
        if (zihVar.a == 1) {
            this.b.addAndGet(zihVar.c);
            this.c.addAndGet(zihVar.b);
        }
    }

    @Override // defpackage.zhp
    public final void f(long j) {
        this.a.addAndGet(j);
    }

    public final long g() {
        return this.a.get();
    }

    public final void h() {
        this.a.set(0L);
        this.b.set(0L);
        this.c.set(0);
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void e(zih zihVar) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void d(long j, long j2) {
    }
}
