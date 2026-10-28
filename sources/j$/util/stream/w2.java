package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w2 implements g3 {
    public Object a;

    public w2(g3 g3Var) {
        g3Var.getClass();
        this.a = g3Var;
    }

    @Override // j$.util.stream.g3
    public /* synthetic */ void accept(int i) {
        i2.d();
        throw null;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.g3
    public void end() {
        ((g3) this.a).end();
    }

    public Object get() {
        return this.a;
    }

    @Override // j$.util.stream.g3
    public void p(long j) {
        ((g3) this.a).p(j);
    }

    @Override // j$.util.stream.g3
    public boolean s() {
        return ((g3) this.a).s();
    }

    @Override // j$.util.stream.g3
    public /* synthetic */ void accept(long j) {
        i2.i();
        throw null;
    }
}
