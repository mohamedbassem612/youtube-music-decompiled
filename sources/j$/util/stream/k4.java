package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k4 implements f3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ k4(LongConsumer longConsumer, byte b) {
        this.a = b;
        this.b = longConsumer;
    }

    @Override // j$.util.stream.f3
    public final /* synthetic */ void B(Long l) {
        switch (this.a) {
            case 0:
                i2.g(this, l);
                break;
            default:
                i2.g(this, l);
                break;
        }
    }

    @Override // j$.util.stream.f3, j$.util.stream.g3
    public final void accept(long j) {
        byte b = this.a;
        LongConsumer longConsumer = this.b;
        switch (b) {
            case 0:
                longConsumer.accept(j);
                break;
            default:
                ((u3) longConsumer).accept(j);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.g3
    public final void end() {
        byte b = this.a;
    }

    @Override // j$.util.stream.g3
    public final void p(long j) {
        byte b = this.a;
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        byte b = this.a;
        return false;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                i2.d();
                throw null;
            default:
                i2.d();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        switch (this.a) {
            case 0:
                B((Long) obj);
                break;
            default:
                B((Long) obj);
                break;
        }
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void c() {
    }

    private final void d() {
    }
}
