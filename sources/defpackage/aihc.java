package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aihc extends aifu implements RandomAccess, aihu, aiiy {
    public static final float[] a;
    public static final aihc b;
    public float[] c;
    public int d;

    static {
        float[] fArr = new float[0];
        a = fArr;
        b = new aihc(fArr, 0, false);
    }

    aihc() {
        this(a, 0, true);
    }

    private final String i(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        kh();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        int i3 = i + 1;
        float[] fArr = this.c;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, fArr2, 0, i);
            System.arraycopy(this.c, i, fArr2, i3, this.d - i);
            this.c = fArr2;
        }
        this.c[i] = fFloatValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aifu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        kh();
        collection.getClass();
        if (!(collection instanceof aihc)) {
            return super.addAll(collection);
        }
        aihc aihcVar = (aihc) collection;
        int i = aihcVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i + i2;
        float[] fArrCopyOf = this.c;
        int length = fArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                fArrCopyOf = new float[i3];
                this.c = fArrCopyOf;
            } else {
                fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i3, Math.max(((length * 3) / 2) + 1, 10)));
                this.c = fArrCopyOf;
            }
        }
        System.arraycopy(aihcVar.c, 0, fArrCopyOf, this.d, aihcVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aihu
    public final float d(int i) {
        j(i);
        return this.c[i];
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aihc)) {
            return super.equals(obj);
        }
        aihc aihcVar = (aihc) obj;
        if (this.d == aihcVar.d) {
            float[] fArr = aihcVar.c;
            for (int i = 0; i < this.d; i++) {
                if (Float.floatToIntBits(this.c[i]) == Float.floatToIntBits(fArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.aihu
    public final float f(int i, float f) {
        kh();
        j(i);
        float[] fArr = this.c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // defpackage.aiie
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aihu e(int i) {
        if (i >= this.d) {
            return new aihc(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(d(i));
    }

    @Override // defpackage.aihu
    public final void h(float f) {
        kh();
        int i = this.d;
        float[] fArr = this.c;
        int length = fArr.length;
        if (i == length) {
            fArr = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.c, 0, fArr, 0, this.d);
            this.c = fArr;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        fArr[i2] = f;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.d; i++) {
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
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        kh();
        j(i);
        float[] fArr = this.c;
        float f = fArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        kh();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.c;
        System.arraycopy(fArr, i2, fArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Float.valueOf(f(i, ((Float) obj).floatValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public aihc(float[] fArr, int i, boolean z) {
        super(z);
        this.c = fArr;
        this.d = i;
    }

    @Override // defpackage.aifu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
