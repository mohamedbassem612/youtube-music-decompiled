package j$.nio.file;

import j$.util.function.Consumer$CC;
import j$.util.stream.g3;
import j$.util.stream.i2;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q implements Consumer, g3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ q(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(a.g(obj));
                break;
            case 1:
                this.b.accept(a.g(obj));
                break;
            case 2:
                this.b.accept(new j$.util.o((Map.Entry) obj));
                break;
            default:
                this.b.accept(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
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
