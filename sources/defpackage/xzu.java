package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xzu {
    public final int a;
    public final String b;

    public xzu(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xzu) {
            xzu xzuVar = (xzu) obj;
            if (this.a == xzuVar.a && awrc.c(this.b, xzuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SessionRecoveryStatus(recoveryState=" + this.a + ", screenName=" + this.b + ')';
    }

    public xzu() {
        this(0, "");
    }
}
