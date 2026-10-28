package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahfm extends ahet {
    final /* synthetic */ ahfo a;
    private final ahcx b;

    public ahfm(ahfo ahfoVar, ahcx ahcxVar) {
        this.a = ahfoVar;
        ahcxVar.getClass();
        this.b = ahcxVar;
    }

    @Override // defpackage.ahet
    public final /* bridge */ /* synthetic */ Object a() {
        ListenableFuture listenableFutureA = this.b.a();
        listenableFutureA.getClass();
        return listenableFutureA;
    }

    @Override // defpackage.ahet
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.ahet
    public final void d(Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.ahet
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.setFuture((ListenableFuture) obj);
    }

    @Override // defpackage.ahet
    public final boolean g() {
        return this.a.isDone();
    }
}
