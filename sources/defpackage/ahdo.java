package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahdo extends ahdq {
    final /* synthetic */ ahdr a;
    private final ahcx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdo(ahdr ahdrVar, ahcx ahcxVar, Executor executor) {
        super(ahdrVar, executor);
        this.a = ahdrVar;
        this.c = ahcxVar;
    }

    @Override // defpackage.ahet
    public final /* bridge */ /* synthetic */ Object a() {
        ListenableFuture listenableFutureA = this.c.a();
        listenableFutureA.getClass();
        return listenableFutureA;
    }

    @Override // defpackage.ahet
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.ahdq
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.setFuture((ListenableFuture) obj);
    }
}
