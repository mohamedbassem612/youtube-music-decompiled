package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahfo extends aheb implements RunnableFuture {
    private volatile ahet a;

    public ahfo(ahcx ahcxVar) {
        this.a = new ahfm(this, ahcxVar);
    }

    @Override // defpackage.ahch
    protected final void gH() {
        ahet ahetVar;
        if (m() && (ahetVar = this.a) != null) {
            ahetVar.h();
        }
        this.a = null;
    }

    @Override // defpackage.ahch
    protected final String jK() {
        ahet ahetVar = this.a;
        return ahetVar != null ? a.cn((byte) 93, ahetVar, "task=[") : super.jK();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        ahet ahetVar = this.a;
        if (ahetVar != null) {
            ahetVar.run();
        }
        this.a = null;
    }

    public ahfo(Callable callable) {
        this.a = new ahfn(this, callable);
    }
}
