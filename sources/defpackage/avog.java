package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avog implements Callable, avnn {
    public final Object a;

    public avog(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        return this.a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
