package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class oag implements aheh {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ lqa b;
    final /* synthetic */ kjc c;

    public oag(kjc kjcVar, ListenableFuture listenableFuture, lqa lqaVar) {
        this.c = kjcVar;
        this.a = listenableFuture;
        this.b = lqaVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            ((lqa) this.b.a).r();
            return;
        }
        boolean z = th instanceof Exception;
        kjc kjcVar = this.c;
        if (z) {
            kjcVar.u((Exception) th);
        } else {
            kjcVar.u(new ExecutionException(th));
        }
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        this.c.v(obj);
    }
}
