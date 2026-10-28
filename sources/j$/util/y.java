package j$.util;

import j$.util.stream.g3;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y implements LongConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ y(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(Long.valueOf(j));
                break;
            default:
                ((g3) consumer).accept(j);
                break;
        }
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
}
