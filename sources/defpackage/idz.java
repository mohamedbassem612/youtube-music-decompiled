package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class idz implements aheh {
    public ieb a;
    final /* synthetic */ ied b;

    public idz(ied iedVar, ieb iebVar) {
        this.b = iedVar;
        this.a = iebVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        zvp.a(zvn.b, zvm.n, "QueueRestorationController onFailure: \n".concat(String.valueOf(th.getMessage())));
        ((agrc) ((agrc) ((agrc) ied.a.c().i(agso.a, "QueueRestorationCtlr")).j(th)).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController$LocalQueueRestorationFutureCallback", "onFailure", (char) 714, "QueueRestorationController.java")).t("QueueRestorationController onFailure ()");
        ied iedVar = this.b;
        ((abvk) iedVar.b.io()).am();
        boolean z = th instanceof CancellationException;
        ((icq) iedVar.h.io()).j(null, z);
        iedVar.e(null, z);
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ied iedVar = this.b;
        ieg iegVar = (ieg) obj;
        ((icq) iedVar.h.io()).j(iegVar, false);
        iedVar.f(iegVar, this.a, false);
    }
}
