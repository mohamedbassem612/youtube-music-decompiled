package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahcb implements Runnable {
    final ahch a;
    final ListenableFuture b;

    public ahcb(ahch ahchVar, ListenableFuture listenableFuture) {
        this.a = ahchVar;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.valueField == this) {
            ListenableFuture listenableFuture = this.b;
            if (ahco.j.f(this.a, this, ahch.h(listenableFuture))) {
                ahch.j(this.a, false);
            }
        }
    }
}
