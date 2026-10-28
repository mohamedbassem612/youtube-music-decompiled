package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agrk extends agta {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(agrx agrxVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i << 1].equals(agrxVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.agta
    public final int b() {
        return this.b;
    }

    @Override // defpackage.agta
    public final agrx c(int i) {
        if (i < this.b) {
            return (agrx) this.a[i << 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.agta
    public final Object d(agrx agrxVar) {
        int iA = a(agrxVar);
        if (iA != -1) {
            return agrxVar.c(this.a[(iA << 1) + 1]);
        }
        return null;
    }

    @Override // defpackage.agta
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[(i << 1) + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(agrx agrxVar, Object obj) {
        int iA;
        if (!agrxVar.b && (iA = a(agrxVar)) != -1) {
            obj.getClass();
            this.a[(iA << 1) + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if ((i << 1) > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length << 1);
            this.a = objArrCopyOf;
        }
        int i2 = this.b;
        int i3 = i2 << 1;
        agrxVar.getClass();
        objArrCopyOf[i3] = agrxVar;
        obj.getClass();
        objArrCopyOf[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
