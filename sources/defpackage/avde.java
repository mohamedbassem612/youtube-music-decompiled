package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avde implements avgh {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.avgh
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
