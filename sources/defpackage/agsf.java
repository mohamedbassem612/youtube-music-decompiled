package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agsf extends agsc {
    public static final agrr a = new agsd();
    public static final ThreadLocal b = new agse();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.agsc
    public final void a() {
        this.e.decrementAndGet();
    }
}
