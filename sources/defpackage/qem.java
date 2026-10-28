package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qem {
    public final boolean a;
    private final agke b;

    public qem(boolean z, agke agkeVar) {
        this.a = z;
        if (agkeVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = agkeVar;
    }

    public final agke a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qem) {
            qem qemVar = (qem) obj;
            if (this.a == qemVar.a && aguu.v(this.b, qemVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + '}';
    }

    public qem() {
        throw null;
    }
}
