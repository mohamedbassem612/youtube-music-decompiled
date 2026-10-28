package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xzt {
    public static final xzt a = new xzt(false, false, 1);
    public final boolean b;
    public final boolean c;
    public final int d;
    private final String e;

    public xzt(boolean z, boolean z2, int i) {
        this.b = z;
        this.e = null;
        this.c = z2;
        this.d = i;
    }

    public static /* synthetic */ xzt a(xzt xztVar, int i) {
        return new xzt(xztVar.b, xztVar.c, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xzt) {
            xzt xztVar = (xzt) obj;
            if (this.b == xztVar.b) {
                String str = xztVar.e;
                if (awrc.c(null, null) && this.c == xztVar.c && this.d == xztVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((a.aj(this.b) * 961) + a.aj(this.c)) * 31) + this.d;
    }

    public final String toString() {
        return "RemoteControlRequestOptions(isConnectedDevice=" + this.b + ", remoteControlInteractionId=null, isMismatchedIdentity=" + this.c + ", actionType=" + ((Object) Integer.toString(this.d - 1)) + ')';
    }

    public xzt() {
        this(false, false, 1);
    }
}
