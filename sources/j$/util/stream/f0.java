package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f0 implements g3 {
    public boolean a;
    public boolean b;

    public f0(g0 g0Var) {
        this.b = !g0Var.b;
    }

    @Override // j$.util.stream.g3
    public /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return this.a;
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
    }

    @Override // j$.util.stream.g3
    public final void end() {
    }
}
