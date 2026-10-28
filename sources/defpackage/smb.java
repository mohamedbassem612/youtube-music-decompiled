package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smb {
    public final int a;
    public final aivk b;
    public final agev c;
    public final int d;

    public smb(int i, int i2, aivk aivkVar, agev agevVar) {
        if (i == 0) {
            throw new NullPointerException("Null pingDispatchStatus");
        }
        this.d = i;
        this.a = i2;
        if (aivkVar == null) {
            throw new NullPointerException("Null ping");
        }
        this.b = aivkVar;
        this.c = agevVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smb) {
            smb smbVar = (smb) obj;
            if (this.d == smbVar.d && this.a == smbVar.a && this.b.equals(smbVar.b) && this.c.equals(smbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.d;
        aivk aivkVar = this.b;
        return "PingDispatchLoggingData{pingDispatchStatus=" + Integer.toString(i - 1) + ", pingIndex=" + this.a + ", ping=" + aivkVar.toString() + ", fulfilledPing=" + this.c.toString() + '}';
    }

    public smb() {
        throw null;
    }
}
