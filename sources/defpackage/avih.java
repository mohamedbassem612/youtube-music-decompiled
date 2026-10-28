package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avih extends avar {
    final /* synthetic */ avii a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public avih(avii aviiVar) {
        this.a = aviiVar;
    }

    @Override // defpackage.avar
    public final avan a() {
        if (this.b.compareAndSet(false, true)) {
            avii aviiVar = this.a;
            aviiVar.g.c().execute(new avgv(aviiVar, 9, null));
        }
        return avan.d("pick_first: requesting connection");
    }
}
