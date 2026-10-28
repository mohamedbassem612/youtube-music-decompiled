package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xri {
    public final boolean a;
    public final abjx b;
    public final boolean c;

    public xri(boolean z, abjx abjxVar, boolean z2) {
        this.a = z;
        this.b = abjxVar;
        this.c = z2;
    }

    public static xrh a() {
        xrh xrhVar = new xrh();
        xrhVar.c(false);
        xrhVar.d = abjx.a;
        xrhVar.b(false);
        return xrhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xri) {
            xri xriVar = (xri) obj;
            if (this.a == xriVar.a && this.b.equals(xriVar.b) && this.c == xriVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "UnselectedRouteProperties{isUnselectUserInitiated=" + this.a + ", queueTransferType=" + String.valueOf(this.b) + ", isDisconnectedBySelectingDefaultRoute=" + this.c + '}';
    }

    public xri() {
        throw null;
    }
}
