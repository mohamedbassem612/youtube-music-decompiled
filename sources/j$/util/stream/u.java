package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class u implements a5, b5 {
    public final boolean a;
    public final Consumer b;

    public u(Consumer consumer, boolean z) {
        this.a = z;
        this.b = consumer;
    }

    @Override // j$.util.stream.a5
    public final Object a(a aVar, Spliterator spliterator) {
        aVar.a(spliterator, aVar.t(this));
        return null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        this.b.r(obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.a5
    public final Object b(a aVar, Spliterator spliterator) {
        if (this.a) {
            new v(aVar, spliterator, this).invoke();
            return null;
        }
        new w(aVar, spliterator, aVar.t(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.a5
    public final int c() {
        if (this.a) {
            return 0;
        }
        return z3.r;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return null;
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
