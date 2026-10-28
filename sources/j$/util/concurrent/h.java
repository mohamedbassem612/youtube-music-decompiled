package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends n implements Spliterator {
    public final /* synthetic */ byte i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j[] jVarArr, int i, int i2, int i3, long j, byte b) {
        super(jVarArr, i, i2, i3);
        this.i = b;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.i) {
            case 0:
                break;
            default:
                break;
        }
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    j jVarA = a();
                    if (jVarA != null) {
                        consumer.accept(jVarA.b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    j jVarA2 = a();
                    if (jVarA2 != null) {
                        consumer.accept(jVarA2.c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        switch (this.i) {
            case 0:
                break;
            default:
                break;
        }
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
            case 0:
                break;
            default:
                break;
        }
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
            case 0:
                break;
            default:
                break;
        }
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                j jVarA = a();
                if (jVarA != null) {
                    consumer.accept(jVarA.b);
                    return true;
                }
                break;
            default:
                consumer.getClass();
                j jVarA2 = a();
                if (jVarA2 != null) {
                    consumer.accept(jVarA2.c);
                    return true;
                }
                break;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        h hVar;
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 > i) {
                    j[] jVarArr = this.a;
                    this.g = i3;
                    long j = this.j >>> 1;
                    this.j = j;
                    hVar = new h(jVarArr, this.h, i3, i2, j, (byte) 0);
                    return hVar;
                }
                return null;
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 > i4) {
                    j[] jVarArr2 = this.a;
                    this.g = i6;
                    long j2 = this.j >>> 1;
                    this.j = j2;
                    hVar = new h(jVarArr2, this.h, i6, i5, j2, (byte) 1);
                    return hVar;
                }
                return null;
        }
    }
}
