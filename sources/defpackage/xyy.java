package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyy {
    private final xvz a;
    private final xvg b;
    private final String c;
    private final String d;
    private final xvr e;

    public xyy(xvz xvzVar, xvg xvgVar, String str, String str2, xvr xvrVar) {
        str.getClass();
        str2.getClass();
        xvrVar.getClass();
        this.a = xvzVar;
        this.b = xvgVar;
        this.c = str;
        this.d = str2;
        this.e = xvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xyy) {
            xyy xyyVar = (xyy) obj;
            if (awrc.c(this.a, xyyVar.a) && awrc.c(this.b, xyyVar.b) && awrc.c(this.c, xyyVar.c) && awrc.c(this.d, xyyVar.d) && awrc.c(this.e, xyyVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MdxRequestAssistedSignInEvent(screenId=" + this.a + ", loungeDeviceId=" + this.b + ", authCode=" + this.c + ", signInSessionId=" + this.d + ", mdxScreen=" + this.e + ')';
    }
}
