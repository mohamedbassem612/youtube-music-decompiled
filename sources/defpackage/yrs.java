package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yrs implements yqh {
    final /* synthetic */ wlo a;

    public yrs(wlo wloVar) {
        this.a = wloVar;
    }

    @Override // defpackage.yqh
    public final void a() {
        this.a.T();
    }

    @Override // defpackage.yqh
    public final void b() {
        this.a.U();
    }

    @Override // defpackage.yqh
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.yqh
    public final ListenableFuture d(Executor executor, tnm tnmVar) {
        return this.a.j(executor, tnmVar, false);
    }
}
