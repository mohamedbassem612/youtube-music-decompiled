package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awix extends avmb {
    private static final awja c = new awja("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    final ThreadFactory b = c;

    @Override // defpackage.avmb
    public final avma a() {
        return new awiy(this.b);
    }
}
