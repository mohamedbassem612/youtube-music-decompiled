package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xdt {
    public final String a;
    public final Optional b;

    public xdt(String str, Optional optional) {
        this.a = str;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdt) {
            xdt xdtVar = (xdt) obj;
            if (this.a.equals(xdtVar.a) && this.b.equals(xdtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ClearcutIdentityInfo{obfuscatedGaiaId=" + this.a + ", madisonObfuscatedGaiaId=" + String.valueOf(this.b) + '}';
    }

    public xdt() {
        throw null;
    }
}
