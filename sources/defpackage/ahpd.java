package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahpd {
    private final Class a;
    private final Class b;

    public ahpd(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahpd ahpdVar = (ahpd) obj;
            if (this.b.equals(ahpdVar.b)) {
                return this.a.equals(ahpdVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        Class cls = this.a;
        Class cls2 = this.b;
        if (cls == ahpc.class) {
            return cls2.getName();
        }
        return "@" + cls.getName() + ' ' + cls2.getName();
    }
}
