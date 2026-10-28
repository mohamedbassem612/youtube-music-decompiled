package defpackage;

import j$.util.PrimitiveIterator$OfInt;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zvd implements PrimitiveIterator$OfInt {
    public int a = -1;
    private final zuo b;
    private final int c;
    private int d;

    public zvd(zuo zuoVar, int i) {
        this.b = zuoVar;
        this.c = i;
        a();
    }

    private final void a() {
        zuo zuoVar;
        int i;
        do {
            int i2 = this.a + 1;
            this.a = i2;
            zuoVar = this.b;
            zuoVar.Y();
            if (i2 >= zuoVar.ad) {
                this.d = 0;
                return;
            }
            int i3 = this.c;
            int i4 = this.a;
            zuoVar.ad(i3);
            zuoVar.ac(i4);
            i = i3 + zuoVar.ac + (i4 * zuoVar.ae);
            this.d = i;
            zuoVar.ab(i);
        } while (((int) zuoVar.b(i, zuoVar.j)) == 0);
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
        a();
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
