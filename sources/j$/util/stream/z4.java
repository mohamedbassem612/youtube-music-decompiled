package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class z4 extends w4 implements Stream.Builder {
    public Object b;
    public x3 c;

    public z4(Object obj) {
        this.b = obj;
        this.a = -2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            if (this.c == null) {
                x3 x3Var = new x3();
                this.c = x3Var;
                x3Var.accept(this.b);
                this.a++;
            }
            this.c.accept(obj);
        }
    }

    @Override // j$.util.stream.Stream.Builder
    public final Stream.Builder add(Object obj) {
        accept(obj);
        return this;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [j$.util.Spliterator] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // j$.util.stream.Stream.Builder
    public final Stream build() {
        ?? Spliterator;
        int i = this.a;
        if (i < 0) {
            throw new IllegalStateException();
        }
        this.a = (-i) - 1;
        if (i >= 2) {
            this = this;
            Spliterator = this.c.spliterator();
        }
        this = this;
        return StreamSupport.stream(Spliterator, false);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.a != -2) {
            return false;
        }
        consumer.accept(this.b);
        this.a = -1;
        return true;
    }
}
