package j$.util.stream;

import j$.util.OptionalDouble;
import j$.util.OptionalLong;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    OptionalDouble average();

    OptionalLong max();

    OptionalLong min();

    long sum();
}
