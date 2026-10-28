package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aboz extends abpc {
    public volatile abok a;
    public final AtomicBoolean b;
    public volatile boolean c;

    public aboz(abpd abpdVar, abri abriVar, String str, xir xirVar) {
        super(abpdVar, abriVar, str, xirVar);
        this.b = new AtomicBoolean(false);
        this.c = false;
    }

    @Override // defpackage.abpc, defpackage.ahch, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.c = true;
        boolean zCancel = super.cancel(z);
        abok abokVar = this.a;
        if (abokVar != null && this.b.compareAndSet(false, true)) {
            abokVar.a();
        }
        return zCancel;
    }
}
