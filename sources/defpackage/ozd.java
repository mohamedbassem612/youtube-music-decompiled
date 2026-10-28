package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozd {
    public static final ozd a = new ozd(1, null);
    private final Throwable b;
    private final int c;

    public ozd(int i, Throwable th) {
        this.c = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozd) {
            ozd ozdVar = (ozd) obj;
            int i = this.c;
            int i2 = ozdVar.c;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                Throwable th = this.b;
                if (th == null) {
                    if (ozdVar.b == null) {
                        return true;
                    }
                } else if (th.equals(ozdVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bj(i);
        Throwable th = this.b;
        return ((i ^ 1000003) * 1000003) ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 1) {
            str = "SUCCESS";
        } else if (i != 2) {
            str = i != 3 ? "null" : "PERMANENT_FAILURE";
        } else {
            str = "TRANSIENT_FAILURE";
        }
        return "Result{code=" + str + ", error=" + String.valueOf(this.b) + '}';
    }

    public ozd() {
        throw null;
    }
}
