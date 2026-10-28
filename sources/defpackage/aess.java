package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aess {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public aess(Context context, mbc mbcVar, ScheduledExecutorService scheduledExecutorService, tqv tqvVar, trl trlVar) {
        this.c = context;
        this.d = mbcVar;
        this.a = mbcVar.f().toEpochMilli();
        this.b = scheduledExecutorService;
        this.f = tqvVar;
        this.e = trlVar;
    }

    public aess(Duration duration, Duration duration2, Duration duration3, long j, acxk acxkVar, Random random) {
        this.e = duration;
        this.d = duration2;
        this.f = duration3;
        this.a = j;
        this.c = acxkVar;
        this.b = random;
    }
}
