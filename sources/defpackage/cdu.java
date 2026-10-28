package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdu {
    public static final cdu a = new cdu(new ci((byte[]) null, (char[]) null));
    public final agkz b;
    public final Double c = null;
    public final Double d = null;
    public final boolean e = true;
    public final boolean f = true;
    public final boolean i = true;
    public final boolean g = true;
    public final boolean h = true;

    private cdu(ci ciVar) {
        this.b = (agkz) ciVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdu) {
            cdu cduVar = (cdu) obj;
            if (this.b.equals(cduVar.b)) {
                boolean z = cduVar.f;
                boolean z2 = cduVar.i;
                Double d = cduVar.c;
                if (Objects.equals(null, null)) {
                    Double d2 = cduVar.d;
                    if (Objects.equals(null, null)) {
                        boolean z3 = cduVar.e;
                        boolean z4 = cduVar.g;
                        boolean z5 = cduVar.h;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.b, null, null, bool, bool, bool, bool, bool);
    }
}
