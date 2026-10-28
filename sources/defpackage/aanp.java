package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aanp {
    public static final aanp a;
    public static final aanp b;
    public static final aanp c;
    private static final agke h = agpi.a;
    public final boolean d;
    public final agke e;
    public final int f;
    public final int g;

    static {
        aano aanoVarA = a();
        aanoVarA.c = 2;
        a = aanoVarA.a();
        aano aanoVarA2 = a();
        aanoVarA2.c = 3;
        aanoVarA2.c(true);
        b = aanoVarA2.a();
        aano aanoVarA3 = a();
        aanoVarA3.c = 3;
        c = aanoVarA3.a();
    }

    public aanp(int i, int i2, boolean z, agke agkeVar) {
        this.f = i;
        this.g = i2;
        this.d = z;
        this.e = agkeVar;
    }

    public static aano a() {
        aano aanoVar = new aano();
        aanoVar.c(false);
        aanoVar.b(h);
        aanoVar.d = 1;
        return aanoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aanp) {
            aanp aanpVar = (aanp) obj;
            int i = this.f;
            int i2 = aanpVar.f;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.g;
                int i4 = aanpVar.g;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4 && this.d == aanpVar.d && aguu.v(this.e, aanpVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        a.by(i);
        int i2 = this.g;
        a.by(i2);
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.f;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.g;
        return "EntityControllerResult{orchestrationActionResult=" + string + ", orchestrationFailureReason=" + (i2 != 0 ? Integer.toString(i2 - 1) : "null") + ", retryable=" + this.d + ", additionalActions=" + String.valueOf(this.e) + '}';
    }

    public aanp() {
        throw null;
    }
}
