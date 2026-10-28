package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i4 implements e3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ i4(IntConsumer intConsumer, byte b) {
        this.a = b;
        this.b = intConsumer;
    }

    @Override // j$.util.stream.e3, j$.util.stream.g3
    public final void accept(int i) {
        byte b = this.a;
        IntConsumer intConsumer = this.b;
        switch (b) {
            case 0:
                intConsumer.accept(i);
                break;
            default:
                ((s3) intConsumer).accept(i);
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

    @Override // j$.util.stream.e3
    public final /* synthetic */ void r(Integer num) {
        switch (this.a) {
            case 0:
                i2.e(this, num);
                break;
            default:
                i2.e(this, num);
                break;
        }
    }

    @Override // j$.util.stream.g3
    public final boolean s() {
        byte b = this.a;
        return false;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.g3
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                i2.i();
                throw null;
            default:
                i2.i();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        switch (this.a) {
            case 0:
                r((Integer) obj);
                break;
            default:
                r((Integer) obj);
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
