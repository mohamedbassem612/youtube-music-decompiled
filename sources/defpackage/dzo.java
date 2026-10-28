package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzo extends dzu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzo(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        ees eesVar = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            dzf.b();
            Log.w(ees.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        eesVar.b(millis < 900000 ? 900000L : millis, millis < 900000 ? 900000L : millis);
    }

    @Override // defpackage.dzu
    public final /* bridge */ /* synthetic */ ayq a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        ees eesVar = this.c;
        if (eesVar.r) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new ayq(this.b, eesVar, this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzo(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        timeUnit.getClass();
        timeUnit2.getClass();
        this.c.b(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }
}
