package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class quk {
    public static final aueb a;
    public final String b;
    public final Throwable c;
    public final qud d;
    public final aueb e;
    public final int f;

    static {
        aihf aihfVarCreateBuilder = aueb.a.createBuilder();
        audd auddVar = audd.MEDIA_ENGINE_ERROR_TYPE_UNKNOWN;
        aihfVarCreateBuilder.copyOnWrite();
        aueb auebVar = (aueb) aihfVarCreateBuilder.instance;
        auebVar.c = auddVar.ap;
        auebVar.b |= 1;
        a = (aueb) aihfVarCreateBuilder.build();
    }

    public quk(String str, Throwable th, qud qudVar, int i, aueb auebVar) {
        this.b = str;
        this.c = th;
        this.d = qudVar;
        this.f = i;
        this.e = auebVar;
    }

    public static tge a() {
        tge tgeVar = new tge((byte[]) null);
        tgeVar.a = 1;
        tgeVar.f(a);
        return tgeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof quk) {
            quk qukVar = (quk) obj;
            String str = this.b;
            if (str != null ? str.equals(qukVar.b) : qukVar.b == null) {
                Throwable th = this.c;
                if (th != null ? th.equals(qukVar.c) : qukVar.c == null) {
                    if (this.d.equals(qukVar.d)) {
                        int i = this.f;
                        int i2 = qukVar.f;
                        if (i == 0) {
                            throw null;
                        }
                        if (i == i2 && this.e.equals(qukVar.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        Throwable th = this.c;
        int iHashCode2 = (((((iHashCode ^ 1000003) * 1000003) ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = this.f;
        a.bj(i);
        return ((iHashCode2 ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.f;
        qud qudVar = this.d;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(qudVar);
        if (i != 1) {
            str = i != 2 ? "null" : "PLAYER";
        } else {
            str = "UNSET";
        }
        return "MediaEngineError{message=" + this.b + ", cause=" + strValueOf + ", context=" + strValueOf2 + ", serviceSource=" + str + ", mdeErrorEventProto=" + String.valueOf(this.e) + '}';
    }

    public quk() {
        throw null;
    }
}
