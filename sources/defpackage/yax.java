package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yax {
    public final xvz a;
    public final xvg b;

    public yax(xvz xvzVar, xvg xvgVar) {
        this.a = xvzVar;
        this.b = xvgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yax) {
            yax yaxVar = (yax) obj;
            if (this.a.equals(yaxVar.a) && this.b.equals(yaxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        xvg xvgVar = this.b;
        return "LocalStorageCloudScreenInfo{screenId=" + String.valueOf(this.a) + ", loungeDeviceId=" + String.valueOf(xvgVar) + '}';
    }

    public yax() {
        throw null;
    }
}
