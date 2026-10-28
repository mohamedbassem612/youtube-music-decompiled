package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djo {
    private final qr a;
    private final bog b;

    public djo(qr qrVar, bog bogVar) {
        this.a = qrVar;
        this.b = bogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof djo) {
            djo djoVar = (djo) obj;
            if (awrc.c(this.a, djoVar.a) && awrc.c(this.b, djoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bog bogVar = this.b;
        return iHashCode + (bogVar == null ? 0 : bogVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }

    public djo() {
        throw null;
    }
}
