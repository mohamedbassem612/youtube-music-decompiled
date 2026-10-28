package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahfn extends ahet {
    final /* synthetic */ ahfo a;
    private final Callable b;

    public ahfn(ahfo ahfoVar, Callable callable) {
        this.a = ahfoVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.ahet
    public final Object a() {
        return this.b.call();
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
    public final void e(Object obj) {
        this.a.set(obj);
    }

    @Override // defpackage.ahet
    public final boolean g() {
        return this.a.isDone();
    }
}
