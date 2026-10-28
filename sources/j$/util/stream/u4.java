package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class u4 extends b4 {
    @Override // j$.util.stream.b4
    public final void d() {
        x3 x3Var = new x3();
        this.h = x3Var;
        this.e = this.b.t(new j$.desugar.sun.nio.fs.h((byte) 16, x3Var));
        this.f = new j$.desugar.sun.nio.fs.h((byte) 17, this);
    }

    @Override // j$.util.stream.b4
    public final b4 e(Spliterator spliterator) {
        return new u4(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        c();
        j$.nio.file.q qVar = new j$.nio.file.q(consumer, (byte) 3);
        this.b.s(this.d, qVar);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean zA = a();
        if (zA) {
            x3 x3Var = (x3) this.h;
            long j = this.g;
            if (x3Var.b != 0) {
                if (j >= x3Var.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                for (int i = 0; i <= x3Var.b; i++) {
                    long j2 = x3Var.c[i];
                    Object[] objArr = x3Var.e[i];
                    if (j < ((long) objArr.length) + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            if (j >= x3Var.a) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            obj = x3Var.d[(int) j];
            consumer.r(obj);
        }
        return zA;
    }
}
