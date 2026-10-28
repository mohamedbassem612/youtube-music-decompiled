package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahpl extends aqh implements ScheduledFuture {
    private final ScheduledFuture d;

    public ahpl(ahpk ahpkVar) {
        this.d = ahpkVar.a(new avgj(this));
    }

    @Override // defpackage.aqh
    protected final void c() {
        Object obj = this.value;
        boolean z = false;
        if ((obj instanceof apz) && ((apz) obj).c) {
            z = true;
        }
        this.d.cancel(z);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.d.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.d.getDelay(timeUnit);
    }
}
