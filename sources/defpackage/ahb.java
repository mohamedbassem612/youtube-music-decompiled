package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahb implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public ahb(int i) {
        int iC = ahe.c(i << 2) / 4;
        this.b = new int[iC];
        this.c = new Object[iC];
    }

    public final int a(Object obj) {
        if (this.a) {
            ahc.c(this);
        }
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    public final int b(int i) {
        if (this.a) {
            ahc.c(this);
        }
        if (i >= this.d || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public final int c() {
        if (this.a) {
            ahc.c(this);
        }
        return this.d;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        ahb ahbVar = (ahb) objClone;
        ahbVar.b = (int[]) this.b.clone();
        ahbVar.c = (Object[]) this.c.clone();
        return ahbVar;
    }

    public final Object d(int i) {
        if (this.a) {
            ahc.c(this);
        }
        if (i >= this.d || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.c[i];
    }

    public final void e() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void f(int i, Object obj) {
        int iA = ahe.a(this.b, this.d, i);
        if (iA >= 0) {
            this.c[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == ahc.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            ahc.c(this);
            i2 = ~ahe.a(this.b, this.d, i);
        }
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int iC = ahe.c((i4 + 1) << 2) / 4;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iC);
            iArrCopyOf.getClass();
            this.b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iC);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i5 = this.d - i2;
        if (i5 != 0) {
            int[] iArr2 = this.b;
            int i6 = i2 + 1;
            iArr2.getClass();
            iArr2.getClass();
            System.arraycopy(iArr2, i2, iArr2, i6, i5);
            Object[] objArr2 = this.c;
            int i7 = this.d;
            objArr2.getClass();
            objArr2.getClass();
            System.arraycopy(objArr2, i2, objArr2, i6, i7 - i2);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object objD = d(i2);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ahb() {
        throw null;
    }
}
