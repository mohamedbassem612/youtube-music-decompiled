package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkm {
    public final Object[] a = new Object[5];
    public short b = 0;

    private static String g(int i) {
        if (i == 0) {
            return "CONTENT";
        }
        if (i == 1) {
            return "BACKGROUND";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "HOST";
        }
        if (i != 4) {
            return null;
        }
        return "BORDER";
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException("index=" + i + ", size=" + ((int) this.b));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i) {
            if (this.a[i3] != null) {
                i2++;
            }
            i3++;
        }
        return i3 - 1;
    }

    public final Object b(int i) {
        return this.a[i];
    }

    public final Object c(int i) {
        return b(a(i));
    }

    public final Object d() {
        Object[] objArr = this.a;
        if (objArr[3] != null) {
            return b(3);
        }
        if (objArr[0] != null) {
            return b(0);
        }
        if (objArr[1] != null) {
            return b(1);
        }
        return objArr[2] != null ? b(2) : b(4);
    }

    public final void e(int i, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("value should not be null");
        }
        Object[] objArr = this.a;
        if (objArr[i] != null) {
            throw new RuntimeException("Already contains unit for type ".concat(String.valueOf(g(i))));
        }
        if (objArr[3] == null) {
            if (i == 3) {
                if (this.b <= 0) {
                    i = 3;
                }
            }
            objArr[i] = obj;
            this.b = (short) (this.b + 1);
            return;
        }
        throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fkm fkmVar = (fkm) obj;
            if (this.b == fkmVar.b) {
                for (int i = 0; i < 5; i++) {
                    if (this.a[i] == fkmVar.a[i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        Object[] objArr = this.a;
        if (obj == null) {
            if (objArr[i] != null) {
                objArr[i] = null;
                this.b = (short) (this.b - 1);
                return;
            }
            return;
        }
        Object obj2 = objArr[i];
        if (obj2 != null) {
            objArr[i] = obj;
        } else if (obj2 == null) {
            e(i, obj);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < this.b; i++) {
            int iA = a(i);
            Object objC = c(i);
            sb.append("\n\t");
            sb.append(g(iA));
            sb.append(": ");
            sb.append(objC.toString());
        }
        return sb.toString();
    }
}
