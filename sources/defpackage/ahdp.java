package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahdp extends ahdq {
    final /* synthetic */ ahdr a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdp(ahdr ahdrVar, Callable callable, Executor executor) {
        super(ahdrVar, executor);
        this.a = ahdrVar;
        callable.getClass();
        this.c = callable;
    }

    @Override // defpackage.ahet
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.ahet
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.ahdq
    public final void c(Object obj) {
        this.a.set(obj);
    }
}
