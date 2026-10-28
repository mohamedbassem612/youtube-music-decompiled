package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uqg {
    public final usd a;
    public final zf b;

    public uqg(zf zfVar, usd usdVar) {
        this.b = zfVar;
        this.a = usdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqg) {
            uqg uqgVar = (uqg) obj;
            if (this.b.equals(uqgVar.b) && this.a.equals(uqgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        usd usdVar = this.a;
        return "CachedInstance{instance=" + this.b.toString() + ", managerForInstance=" + usdVar.toString() + '}';
    }

    public uqg() {
        throw null;
    }
}
