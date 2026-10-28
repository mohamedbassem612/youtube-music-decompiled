package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class vwl implements vwj {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ vwn b;

    public vwl(ListenableFuture listenableFuture, vwn vwnVar) {
        this.a = listenableFuture;
        this.b = vwnVar;
    }

    @Override // defpackage.vwj
    public final vwn a() {
        return this.b;
    }

    @Override // defpackage.vwj
    public final ListenableFuture b() {
        return this.a;
    }
}
