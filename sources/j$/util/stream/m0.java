package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m0 implements DoubleConsumer {
    public final /* synthetic */ byte a;

    public /* synthetic */ m0(byte b) {
        this.a = b;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        byte b = this.a;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    private final void accept$j$$util$stream$Node$OfDouble$0(double d) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$0(double d) {
    }
}
