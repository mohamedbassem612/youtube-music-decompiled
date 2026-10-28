package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class m1 extends w0 implements l0 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            j$.time.g.d("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(objArr.length)});
        } else {
            this.b = i + 1;
            objArr[i] = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.l0
    public final t0 build() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return this;
        }
        j$.time.g.d("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(objArr.length)});
        return null;
    }

    @Override // j$.util.stream.g3
    public final void end() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            j$.time.g.d("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(objArr.length)});
        }
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        Object[] objArr = this.a;
        if (j == objArr.length) {
            this.b = 0;
        } else {
            j$.time.g.d("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(objArr.length)});
        }
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        return false;
    }

    @Override // j$.util.stream.w0
    public final String toString() {
        Object[] objArr = this.a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
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
}
