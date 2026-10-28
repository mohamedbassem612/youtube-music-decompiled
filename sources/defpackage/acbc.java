package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acbc implements acaq {
    private final zyh a;
    private final zyh b;

    public acbc(Executor executor, tft tftVar, tzs tzsVar, mbc mbcVar, syp sypVar, vxz vxzVar, abmt abmtVar) {
        zsm zsmVar = new zsm(tzsVar, vxzVar, abmtVar.bz(), abmtVar);
        zyb zybVar = new zyb(tftVar, zsmVar, zsmVar);
        executor.getClass();
        zxt zxtVar = new zxt(executor, zybVar);
        TimeUnit timeUnit = TimeUnit.HOURS;
        this.a = zym.b(sypVar, zxtVar, mbcVar, 7200000L);
        zyb zybVar2 = new zyb(tftVar, zsmVar, new zsj());
        executor.getClass();
        this.b = new zxt(executor, zybVar2);
    }

    @Override // defpackage.acaq
    public final void a(acap acapVar, sxu sxuVar) {
        typ.f(acapVar.a.d);
        this.a.a(acapVar, sxuVar);
    }

    @Override // defpackage.acaq
    public final void b(acap acapVar, sxu sxuVar) {
        typ.f(acapVar.a.d);
        this.b.a(acapVar, sxuVar);
    }
}
