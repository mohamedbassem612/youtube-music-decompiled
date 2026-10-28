package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class xyg {
    public byte a;
    private Object b;

    public final xyj a() {
        return new xyj((xwc) this.b, (~this.a) & 1);
    }

    public final void b(xwc xwcVar) {
        if (xwcVar == null) {
            throw new NullPointerException("Null deviceId");
        }
        this.b = xwcVar;
        this.a = (byte) 1;
    }

    public final pbh c() {
        Object obj = this.b;
        if (1 == ((~this.a) & 1)) {
            obj = null;
        }
        return new pbh((ahza) obj, null, null, false);
    }

    public final void d(ahza ahzaVar) {
        this.b = ahzaVar;
        this.a = (byte) 1;
    }

    public final jyk e() {
        Object obj;
        if (this.a == 3 && (obj = this.b) != null) {
            return new jyk((String) obj, null, null, false, false);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" accountType");
        }
        if ((this.a & 1) == 0) {
            sb.append(" includeRestrictedAccounts");
        }
        if ((this.a & 2) == 0) {
            sb.append(" includeTransientAccounts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountType");
        }
        this.b = str;
    }
}
