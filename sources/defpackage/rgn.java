package defpackage;

import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgn extends rgp {
    private rfs a;
    private UUID b;

    public rgn(rgo rgoVar) {
        super(rgoVar);
    }

    private final synchronized void c(rfs rfsVar) {
        Runnable runnable;
        k(this.a);
        this.a = rfsVar;
        if (rfsVar != null && (runnable = this.g) != null) {
            runnable.run();
        }
    }

    @Override // defpackage.rgp
    protected final int b() {
        return 1;
    }

    @Override // defpackage.rgp, java.lang.AutoCloseable
    public final void close() {
        super.close();
        c(null);
    }

    @Override // defpackage.rgp
    public final void d() {
        if (this.e == null) {
            c(null);
            return;
        }
        rfs rfsVarH = rfs.h();
        synchronized (this) {
            this.b = rfsVarH.l();
        }
        c(null);
        Iterable$EL.forEach(this.d, new rcp(rfsVarH, 12));
        this.e.c(rfsVarH);
    }

    @Override // defpackage.rgp
    public final synchronized void e(rfs rfsVar) {
        UUID uuid = this.b;
        if (uuid == null) {
            if (rfsVar.B()) {
                throw new IllegalArgumentException("Didn't expect a FlushFrame since flushFrameId is unset.");
            }
            c(rfsVar);
        } else if (rfsVar.A(uuid)) {
            this.b = null;
        } else {
            if (!rfsVar.B()) {
                k(rfsVar);
            }
        }
    }

    @Override // defpackage.rgp
    public final synchronized boolean f(Duration duration) {
        Optional optionalOfNullable = Optional.ofNullable(this.e);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = ((rib) optionalOfNullable.get()).a();
        }
        Duration duration2 = (Duration) optionalOfNullable.orElse(Duration.ofMillis(2147483647L));
        rfs rfsVar = this.a;
        if (rfsVar != null) {
            duration.getClass();
            if (aext.i(rfsVar.j(), duration)) {
                duration.getClass();
                if (aext.l(duration2, duration)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rgp
    public final synchronized ren h(Duration duration) {
        Optional optionalOfNullable = Optional.ofNullable(this.e);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = ((rib) optionalOfNullable.get()).a();
        }
        if (optionalOfNullable.isPresent()) {
            duration.getClass();
            if (aext.i((Duration) optionalOfNullable.get(), duration)) {
                c(null);
            }
        }
        return this.a == null ? ren.a : new ren(this.a);
    }
}
