package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbs extends mbv {
    final /* synthetic */ ahey a;
    final /* synthetic */ awmd b;

    public mbs(ahey aheyVar, awmd awmdVar) {
        this.a = aheyVar;
        this.b = awmdVar;
    }

    @Override // defpackage.ahec, defpackage.agjb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.ahec, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new mbt(runnable, this.b));
    }

    @Override // defpackage.mbv, defpackage.aheg
    public final /* synthetic */ ahex f() {
        return this.a;
    }

    @Override // defpackage.aheg, defpackage.ahec
    public final /* synthetic */ ExecutorService g() {
        return this.a;
    }

    @Override // defpackage.mbv
    public final ahey h() {
        return this.a;
    }

    @Override // defpackage.ahec, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ahec, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.agjb
    public final String toString() {
        return "ExceptionHandling[" + super.toString() + ']';
    }
}
