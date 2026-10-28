package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tid {
    public static final tic a;
    public static final tic b;
    private final String c;
    private final Class d;

    static {
        final int i = 1;
        a = new tic() { // from class: tib
            @Override // defpackage.tic
            public final tid a(String str, tns tnsVar) {
                if (i != 0) {
                    str.getClass();
                    tnsVar.getClass();
                    return new tid(str, null);
                }
                str.getClass();
                tnsVar.getClass();
                return new tid(str, tnsVar.ab());
            }
        };
        final int i2 = 0;
        b = new tic() { // from class: tib
            @Override // defpackage.tic
            public final tid a(String str, tns tnsVar) {
                if (i2 != 0) {
                    str.getClass();
                    tnsVar.getClass();
                    return new tid(str, null);
                }
                str.getClass();
                tnsVar.getClass();
                return new tid(str, tnsVar.ab());
            }
        };
    }

    public tid(String str, Class cls) {
        this.c = str;
        this.d = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tid) {
            tid tidVar = (tid) obj;
            if (awrc.c(this.c, tidVar.c) && awrc.c(this.d, tidVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Class cls = this.d;
        return iHashCode + (cls == null ? 0 : cls.hashCode());
    }

    public final String toString() {
        return "CoalescingKey(cacheKey=" + this.c + ", responseClass=" + this.d + ')';
    }
}
