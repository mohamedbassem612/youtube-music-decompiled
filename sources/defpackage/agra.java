package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agra extends agsc {
    public static final agrr a = new agqy();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.agsc
    public final void a() {
        AtomicLong atomicLong = this.b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
