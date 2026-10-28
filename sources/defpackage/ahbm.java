package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahbm extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final float[] a;
    public final int b;
    public final int c;

    public ahbm(float[] fArr, int i, int i2) {
        this.a = fArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Float) && afxw.J(this.a, ((Float) obj).floatValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahbm)) {
            return super.equals(obj);
        }
        ahbm ahbmVar = (ahbm) obj;
        int size = size();
        if (ahbmVar.size() == size) {
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] == ahbmVar.a[ahbmVar.b + i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        ahno.W(i, size());
        return Float.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = this.b; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.a[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.a;
            float fFloatValue = ((Float) obj).floatValue();
            int i = this.b;
            int iJ = afxw.J(fArr, fFloatValue, i, this.c);
            if (iJ >= 0) {
                return iJ - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float[] fArr = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.b;
        int i2 = this.c - 1;
        while (i2 >= i) {
            if (fArr[i2] == fFloatValue) {
                if (i2 >= 0) {
                    return i2 - i;
                }
                return -1;
            }
            i2--;
        }
        i2 = -1;
        if (i2 >= 0) {
            return i2 - i;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        ahno.W(i, size());
        float[] fArr = this.a;
        int i2 = this.b + i;
        float f2 = fArr[i2];
        f.getClass();
        fArr[i2] = f.floatValue();
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ahno.N(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        float[] fArr = this.a;
        int i3 = this.b;
        return new ahbm(fArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        float[] fArr = this.a;
        int i = this.b;
        sb.append(fArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(fArr[i]);
        }
    }
}
