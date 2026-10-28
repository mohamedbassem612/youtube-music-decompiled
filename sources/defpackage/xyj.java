package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyj {
    public final xwc a;

    public /* synthetic */ xyj(xwc xwcVar, int i) {
        xwcVar = i != 0 ? new xwc("") : xwcVar;
        xwcVar.getClass();
        this.a = xwcVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xyj) && awrc.c(this.a, ((xyj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DialSessionInfo(deviceId=" + this.a + ')';
    }

    public xyj() {
        this(null, 1);
    }
}
