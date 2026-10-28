package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bip extends bho implements RandomAccess, biw, bjo {
    private static final float[] b;
    public int a;
    private float[] c;

    static {
        float[] fArr = new float[0];
        b = fArr;
        new bip(fArr, 0, false);
    }

    bip() {
        this(b, 0, true);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.a;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        float[] fArr = this.c;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, fArr2, 0, i);
            System.arraycopy(this.c, i, fArr2, i3, this.a - i);
            this.c = fArr2;
        }
        this.c[i] = fFloatValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.bho, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        bix.a(collection);
        if (!(collection instanceof bip)) {
            return super.addAll(collection);
        }
        bip bipVar = (bip) collection;
        int i = bipVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArrCopyOf = this.c;
        if (i3 > fArrCopyOf.length) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i3);
            this.c = fArrCopyOf;
        }
        System.arraycopy(bipVar.c, 0, fArrCopyOf, this.a, bipVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.biw
    public final /* bridge */ /* synthetic */ biw d(int i) {
        if (i >= this.a) {
            return new bip(i == 0 ? b : Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new IllegalArgumentException();
    }

    public final float e(int i) {
        h(i);
        return this.c[i];
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bip)) {
            return super.equals(obj);
        }
        bip bipVar = (bip) obj;
        if (this.a == bipVar.a) {
            float[] fArr = bipVar.c;
            for (int i = 0; i < this.a; i++) {
                if (Float.floatToIntBits(this.c[i]) == Float.floatToIntBits(fArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(float f) {
        a();
        int i = this.a;
        float[] fArr = this.c;
        int length = fArr.length;
        if (i == length) {
            fArr = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, fArr, 0, this.a);
            this.c = fArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        fArr[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(e(i));
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.a; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        h(i);
        float[] fArr = this.c;
        float f = fArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.c;
        System.arraycopy(fArr, i2, fArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        h(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private bip(float[] fArr, int i, boolean z) {
        super(z);
        this.c = fArr;
        this.a = i;
    }

    @Override // defpackage.bho, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}
