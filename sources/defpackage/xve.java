package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xve {
    static final /* synthetic */ awsj[] a = {new awrf(xve.class, "loungeToken", "getLoungeToken()Lcom/google/android/libraries/youtube/mdx/model/LoungeToken;")};
    public static final /* synthetic */ int i = 0;
    public final xvv b;
    public final String c;
    public final xvz d;
    public final xvg e;
    public final List f;
    public final xwc g;
    public final xwc h;
    private final xvd j;

    public /* synthetic */ xve(xvv xvvVar, String str, xvz xvzVar, xvg xvgVar, List list, xwc xwcVar, xwc xwcVar2, xvh xvhVar, int i2) {
        list = (i2 & 16) != 0 ? awno.a : list;
        xwcVar = (i2 & 32) != 0 ? null : xwcVar;
        xwcVar2 = (i2 & 64) != 0 ? null : xwcVar2;
        xvhVar = (i2 & SemanticState.Focused) != 0 ? null : xvhVar;
        xvvVar.getClass();
        str.getClass();
        xvzVar.getClass();
        xvgVar.getClass();
        list.getClass();
        xvd xvdVar = new xvd(xvhVar);
        this.b = xvvVar;
        this.g = xwcVar2;
        this.c = str;
        this.d = xvzVar;
        this.e = xvgVar;
        this.f = list;
        this.h = xwcVar;
        this.j = xvdVar;
    }

    public final xvh a() {
        a[0].getClass();
        return this.j.a;
    }

    public final boolean b() {
        return a() != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xve) {
            xve xveVar = (xve) obj;
            if (awrc.c(this.b, xveVar.b) && awrc.c(this.g, xveVar.g) && awrc.c(this.c, xveVar.c) && awrc.c(this.d, xveVar.d) && awrc.c(this.e, xveVar.e) && awrc.c(this.f, xveVar.f) && awrc.c(this.h, xveVar.h) && awrc.c(this.j, xveVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        xwc xwcVar = this.g;
        int iHashCode = (((((((((this.b.b * 31) + (xwcVar == null ? 0 : xwcVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        xwc xwcVar2 = this.h;
        return ((iHashCode * 31) + (xwcVar2 != null ? xwcVar2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "CloudScreenInfo(pairingInfo=" + this.b + ", pairingCode=" + this.g + ", name=" + this.c + ", screenId=" + this.d + ", loungeDeviceId=" + this.e + ", mdxDiscoveryIds=" + this.f + ", clientName=" + this.h + ", loungeTokenWrapper=" + this.j + ')';
    }
}
