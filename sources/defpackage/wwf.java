package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwf implements wwc {
    public final vxe a;
    public final wwa b = new wwe(this, 0);
    public final ajwo c;
    public ScheduledFuture d;
    public ajwo e;
    private final ScheduledExecutorService f;
    private final Runnable g;
    private final wwb h;

    public wwf(vxe vxeVar, ScheduledExecutorService scheduledExecutorService, wwb wwbVar) {
        this.a = vxeVar;
        this.f = scheduledExecutorService;
        this.h = wwbVar;
        this.g = new wtg(this, wwbVar, 4);
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = akrx.a;
        aihh aihhVar2 = (aihh) CommandOuterClass$Command.a.createBuilder();
        aihhVar2.e(assk.b, assk.a);
        aihhVar.e(aihlVar, (CommandOuterClass$Command) aihhVar2.build());
        this.c = (ajwo) aihhVar.build();
    }

    @Override // defpackage.wwc
    public final void a(ajwo ajwoVar) {
        if (yno.dQ(ajwoVar)) {
            this.e = ajwoVar;
            b();
        }
    }

    public final void b() {
        ajwo ajwoVar = this.e;
        if (ajwoVar == null) {
            c(0L);
            return;
        }
        wwb wwbVar = this.h;
        wwbVar.a(this.b);
        int i = wwbVar.b;
        if (i == 0 || wwbVar.c || wwbVar.d || i != 1) {
            return;
        }
        this.a.a(ajwoVar);
        c(1500L);
    }

    public final void c(long j) {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.d = this.f.schedule(this.g, j, TimeUnit.MILLISECONDS);
    }
}
