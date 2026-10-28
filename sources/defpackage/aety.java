package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aety {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/watch/updatedmetadata/UpdatedMetadataController");
    public final vxe b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final mbc e;
    public final awmd f;
    public agev g = agdf.a;
    public final jmu h;

    public aety(vxe vxeVar, Executor executor, ScheduledExecutorService scheduledExecutorService, mbc mbcVar, vxz vxzVar, awmd awmdVar, jmu jmuVar) {
        this.b = vxeVar;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = mbcVar;
        this.f = awmdVar;
        vxzVar.d(0, 45429090L);
        Duration.ofSeconds(vxzVar.d(1, 45429091L)).toMillis();
        this.h = jmuVar;
        jmuVar.c = new aemk(this, 10, null);
    }

    public final void a() {
        if (this.g.g()) {
            ((aett) this.g.c()).a();
            this.g = agdf.a;
            jmu jmuVar = this.h;
            Object obj = jmuVar.d;
            if (obj != null) {
                awka.f((AtomicReference) obj);
                jmuVar.d = null;
            }
        }
    }
}
