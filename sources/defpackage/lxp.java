package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lxp extends lwo implements RandomAccess, lxz, lyv {
    public static final lxp a;
    private static final float[] d;
    public float[] b;
    public int c;

    static {
        float[] fArr = new float[0];
        d = fArr;
        a = new lxp(fArr, 0, false);
    }

    lxp() {
        this(d, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        hZ();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        float[] fArr = this.b;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, fArr2, 0, i);
            System.arraycopy(this.b, i, fArr2, i3, this.c - i);
            this.b = fArr2;
        }
        this.b[i] = fFloatValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.lwo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        hZ();
        lyf.a(collection);
        if (!(collection instanceof lxp)) {
            return super.addAll(collection);
        }
        lxp lxpVar = (lxp) collection;
        int i = lxpVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArrCopyOf = this.b;
        if (i3 > fArrCopyOf.length) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i3);
            this.b = fArrCopyOf;
        }
        System.arraycopy(lxpVar.b, 0, fArrCopyOf, this.c, lxpVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.lxz
    public final float d(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxp)) {
            return super.equals(obj);
        }
        lxp lxpVar = (lxp) obj;
        if (this.c == lxpVar.c) {
            float[] fArr = lxpVar.b;
            for (int i = 0; i < this.c; i++) {
                if (Float.floatToIntBits(this.b[i]) == Float.floatToIntBits(fArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lye
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final lxz e(int i) {
        if (i >= this.c) {
            return new lxp(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.lxz
    public final void g(float f) {
        hZ();
        int i = this.c;
        float[] fArr = this.b;
        int length = fArr.length;
        if (i == length) {
            fArr = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, fArr, 0, this.c);
            this.b = fArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        fArr[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(d(i));
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        hZ();
        i(i);
        float[] fArr = this.b;
        float f = fArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        hZ();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.b;
        System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        hZ();
        i(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private lxp(float[] fArr, int i, boolean z) {
        super(z);
        this.b = fArr;
        this.c = i;
    }

    @Override // defpackage.lwo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
