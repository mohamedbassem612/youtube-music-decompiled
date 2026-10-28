package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acuk implements aheh {
    final /* synthetic */ zyz a;

    public acuk(zyz zyzVar) {
        this.a = zyzVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        boolean z = th instanceof CancellationException;
        zyz zyzVar = this.a;
        if (z) {
            zyzVar.cancel(false);
        } else {
            zyzVar.setException(new toe(th));
        }
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.a((wjf) obj);
    }
}
