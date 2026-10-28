package defpackage;

import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ojv {
    public static final ojv a;
    public static final ojv b;
    public static final ojv c;
    private final boolean d;
    private final agkz e;

    static {
        pgw pgwVarA = a();
        pgwVarA.d(EnumSet.noneOf(oju.class));
        pgwVarA.c(false);
        a = pgwVarA.b();
        pgw pgwVarA2 = a();
        pgwVarA2.d(EnumSet.of(oju.a));
        pgwVarA2.c(true);
        b = pgwVarA2.b();
        pgw pgwVarA3 = a();
        pgwVarA3.d(EnumSet.of(oju.a));
        pgwVarA3.c(false);
        c = pgwVarA3.b();
    }

    public ojv(boolean z, agkz agkzVar) {
        this.d = z;
        this.e = agkzVar;
    }

    public static pgw a() {
        pgw pgwVar = new pgw();
        pgwVar.c(false);
        return pgwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ojv) {
            ojv ojvVar = (ojv) obj;
            if (this.d == ojvVar.d && this.e.equals(ojvVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "DownloadConstraints{requireUnmeteredNetwork=" + this.d + ", requiredNetworkTypes=" + String.valueOf(this.e) + '}';
    }

    public ojv() {
        throw null;
    }
}
