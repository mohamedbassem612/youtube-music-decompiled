package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avrs implements Runnable {
    final /* synthetic */ avrt a;
    private final Collection b;

    public avrs(avrt avrtVar, Collection collection) {
        this.a = avrtVar;
        this.b = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        avrt avrtVar = this.a;
        synchronized (avrtVar) {
            avrtVar.e.remove(this.b);
        }
        avrt avrtVar2 = this.a;
        avrtVar2.n(this.b, avrtVar2.d);
    }
}
