package defpackage;

import j$.util.PrimitiveIterator$OfInt;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zue implements PrimitiveIterator$OfInt {
    public final zuo a;
    public final int b;
    public int c;
    public int d;
    private final zvd e;
    private final int f;

    public zue(zuo zuoVar, int i, int i2) {
        this.a = zuoVar;
        this.f = i2;
        zuoVar.ad(i);
        int iC = (int) zuoVar.c((i << 3) + 39, 8);
        zuoVar.af(i, iC);
        this.b = iC;
        zuoVar.Z();
        zuoVar.X(i);
        this.e = new zvd(zuoVar, i);
        this.d = a(0);
    }

    public final int a(int i) {
        while (i == 0) {
            zvd zvdVar = this.e;
            if (!zvdVar.hasNext()) {
                return 0;
            }
            this.c = zvdVar.a;
            int iNextInt = zvdVar.nextInt();
            int i2 = this.f;
            zuo zuoVar = this.a;
            if (i2 != 2) {
                zuoVar.ab(iNextInt);
                long jB = zuoVar.b(iNextInt, zuoVar.j);
                while (true) {
                    i = (int) jB;
                    if (i == 0) {
                        i = 0;
                        break;
                    }
                    int i3 = zuoVar.o;
                    long j = zuoVar.f;
                    if (((1 << (((1 << (i3 >>> 16)) - 1) & ((Memory.peekByte((((long) i) + j) + ((long) ((i3 >> 3) & 8191))) & 255) >>> (i3 & 7)))) & i2) != 0) {
                        break;
                    }
                    int i4 = zuoVar.n;
                    int i5 = (i << 3) + ((char) i4);
                    jB = (((Memory.peekByte(j + ((long) (i5 >> 3))) & 255) >>> (i5 & 7)) & 1) == 0 ? 0L : zuoVar.c(i5 + 1, (i4 >>> 16) - 1);
                }
            } else {
                i = zuoVar.T(iNextInt);
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
        int i5 = this.f;
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
