package defpackage;

import j$.time.Duration;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iee {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/queue/persistence/QueueResumptionEligibilityMonitor");
    public final aunn b;
    public final mbc c;
    public final long f;
    public final vxz g;
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicLong e = new AtomicLong(0);
    private final avmm h = new avmm();

    public iee(aunn aunnVar, mbc mbcVar, vxz vxzVar) {
        this.b = aunnVar;
        this.c = mbcVar;
        this.g = vxzVar;
        this.f = Duration.ofMinutes(vxzVar.c(1, 45687592L, 0L)).toMillis();
    }

    public final void a() {
        avmm avmmVar = this.h;
        avmmVar.b();
        avmmVar.c(((avlh) ((abvn) this.b.io()).r().o).ak(new icy(this, 4)));
    }
}
