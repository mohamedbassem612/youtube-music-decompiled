package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ess implements Callable {
    final /* synthetic */ esw a;

    public ess(esw eswVar) {
        this.a = eswVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        esw eswVar = this.a;
        synchronized (eswVar) {
            if (eswVar.f == null) {
                return null;
            }
            eswVar.g();
            if (eswVar.h()) {
                eswVar.e();
                eswVar.h = 0;
            }
            return null;
        }
    }
}
