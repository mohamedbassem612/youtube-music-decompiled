package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ojp {
    public final boolean a;
    private final boolean b;
    private final boolean c;

    public ojp(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.a = z2;
        this.c = z3;
    }

    public static ahvf a() {
        ahvf ahvfVar = new ahvf();
        ahvfVar.j(true);
        ahvfVar.i(true);
        ahvfVar.h(false);
        return ahvfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ojp) {
            ojp ojpVar = (ojp) obj;
            if (this.b == ojpVar.b && this.a == ojpVar.a && this.c == ojpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.b ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "ConstraintOverrides{requiresDeviceIdle=" + this.b + ", requiresCharging=" + this.a + ", requiresBatteryNotLow=" + this.c + '}';
    }

    public ojp() {
        throw null;
    }
}
