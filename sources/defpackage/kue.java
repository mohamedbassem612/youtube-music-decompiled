package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kue {
    private static final Duration b = Duration.ofMinutes(30);
    public final AtomicReference a;
    private final krw c;

    public kue(Context context) {
        ksl kslVar = new ksl(context, new krx("droidguard"));
        this.a = new AtomicReference(Instant.MIN);
        this.c = kslVar;
    }

    final synchronized void a(int i, lpa lpaVar, long j, long j2, long j3) {
        int i2;
        int i3;
        int i4;
        final Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        if (((Instant) this.a.get()).plus(b).isAfter(instantOfEpochMilli)) {
            return;
        }
        if (lpaVar.j()) {
            i4 = 0;
            i3 = 0;
        } else {
            if (((lpf) lpaVar).c) {
                i2 = 100;
            } else {
                Exception excE = lpaVar.e();
                if (excE instanceof kmu) {
                    Status status = ((kmu) excE).a;
                    int i5 = status.f;
                    klo kloVar = status.i;
                    i3 = kloVar != null ? kloVar.c : -1;
                    i4 = i5;
                } else {
                    i2 = 101;
                }
            }
            i4 = i2;
            i3 = -1;
        }
        this.c.a(new krv(0, agke.q(new krj(i, i4, i3, j, j2, null, null, 0, (int) j3)))).p(new lov() { // from class: kud
            @Override // defpackage.lov
            public final void d(Exception exc) {
                klo kloVar2;
                if ((exc instanceof kmu) && (kloVar2 = ((kmu) exc).a.i) != null && kloVar2.c == 24) {
                    this.a.a.set(instantOfEpochMilli);
                }
            }
        });
    }
}
