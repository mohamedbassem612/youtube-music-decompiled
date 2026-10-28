package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffq {
    private Class a;
    private Class b;
    private Class c;

    public ffq(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ffq ffqVar = (ffq) obj;
            if (this.a.equals(ffqVar.a) && this.b.equals(ffqVar.b)) {
                Class cls = this.c;
                Class cls2 = ffqVar.c;
                char[] cArr = ffs.a;
                if (afxw.l(cls, cls2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Class cls = this.c;
        return (iHashCode * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + String.valueOf(this.a) + ", second=" + String.valueOf(this.b) + '}';
    }

    public ffq() {
    }
}
