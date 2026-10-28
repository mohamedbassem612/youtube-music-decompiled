package defpackage;

import j$.util.PrimitiveIterator$OfInt;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ztx implements PrimitiveIterator$OfInt {
    private final zuo a;
    private final int b;
    private int c = -1;
    private int d = a(0);

    public ztx(zuo zuoVar, int i) {
        this.a = zuoVar;
        this.b = i;
    }

    private final int a(int i) {
        while (i == 0) {
            int i2 = this.c + 1;
            this.c = i2;
            zuo zuoVar = this.a;
            zuoVar.Y();
            if (i2 >= zuoVar.ad) {
                return 0;
            }
            int i3 = this.c;
            zuoVar.Y();
            zuoVar.ac(i3);
            i = (int) zuoVar.b(zuoVar.aa + (i3 << 3), zuoVar.j);
            int i4 = this.b;
            while (true) {
                if (i == 0) {
                    i = 0;
                    break;
                }
                int i5 = zuoVar.o;
                long j = zuoVar.f;
                if (((1 << (((1 << (i5 >>> 16)) - 1) & ((Memory.peekByte((((long) i) + j) + ((long) ((i5 >> 3) & 8191))) & 255) >>> (i5 & 7)))) & i4) != 0) {
                    break;
                }
                int i6 = zuoVar.n;
                int i7 = (i << 3) + ((char) i6);
                i = (int) ((((Memory.peekByte(j + ((long) (i7 >> 3))) & 255) >>> (i7 & 7)) & 1) == 0 ? 0L : zuoVar.c(i7 + 1, (i6 >>> 16) - 1));
            }
        }
        return i;
    }

    @Override // j$.util.PrimitiveIterator$OfInt
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != 0;
    }

    @Override // j$.util.PrimitiveIterator$OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return PrimitiveIterator$OfInt.CC.$default$next((PrimitiveIterator$OfInt) this);
    }

    @Override // j$.util.PrimitiveIterator$OfInt
    public final int nextInt() {
        int i = this.d;
        zuo zuoVar = this.a;
        int i2 = zuoVar.n;
        int i3 = (i << 3) + ((char) i2);
        int i4 = 1;
        long jC = (((Memory.peekByte(zuoVar.f + ((long) (i3 >> 3))) & 255) >>> (i3 & 7)) & 1) == 0 ? 0L : zuoVar.c(i3 + 1, (i2 >>> 16) - 1);
        int i5 = this.b;
        int iC = (int) jC;
        while (iC != 0) {
            int i6 = zuoVar.o;
            long j = zuoVar.f;
            int i7 = i4;
            if (((i7 << (((i7 << (i6 >>> 16)) - 1) & ((Memory.peekByte((((long) iC) + j) + ((long) ((i6 >> 3) & 8191))) & 255) >>> (i6 & 7)))) & i5) != 0) {
                this.d = a(iC);
                return i;
            }
            int i8 = zuoVar.n;
            int i9 = (iC << 3) + ((char) i8);
            iC = (int) ((((Memory.peekByte(j + ((long) (i9 >> 3))) & 255) >>> (i9 & 7)) & i7) == 0 ? 0L : zuoVar.c(i9 + 1, (i8 >>> 16) - 1));
            i4 = i7;
        }
        iC = 0;
        this.d = a(iC);
        return i;
    }

    @Override // j$.util.PrimitiveIterator$OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        PrimitiveIterator$OfInt.CC.$default$forEachRemaining((PrimitiveIterator$OfInt) this, consumer);
    }

    @Override // j$.util.PrimitiveIterator$OfInt
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        PrimitiveIterator$OfInt.CC.$default$forEachRemaining((PrimitiveIterator$OfInt) this, intConsumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
