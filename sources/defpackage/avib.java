package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avib extends avar {
    final /* synthetic */ avie a;
    private final avie b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public avib(avie avieVar, avie avieVar2) {
        this.a = avieVar;
        this.b = avieVar2;
    }

    @Override // defpackage.avar
    public final avan a() {
        if (this.c.compareAndSet(false, true)) {
            this.a.i.c().execute(new avgv(this.b, 8, null));
        }
        return avan.d("pick_first: requesting connection");
    }
}
