package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ebz implements awqg {
    final /* synthetic */ dze a;
    final /* synthetic */ ListenableFuture b;

    public ebz(dze dzeVar, ListenableFuture listenableFuture) {
        this.a = dzeVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof ebo) {
            this.a.i(((ebo) th).a);
        }
        this.b.cancel(false);
        return awmy.a;
    }
}
