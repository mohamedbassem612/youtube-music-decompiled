package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vai implements Consumer {
    private final Consumer a;
    private final Supplier b;
    private final Object c = new Object();

    public vai(Consumer consumer, Supplier supplier) {
        this.a = consumer;
        this.b = supplier;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.b.get();
            if (obj2 != null) {
                this.a.accept(obj2);
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
