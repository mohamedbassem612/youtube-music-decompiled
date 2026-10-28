package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xva {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final xvz d;
    public final xvg e;
    public final String f;
    public final Map g;
    public final String h;
    private final boolean i;
    private final Uri j;

    public xva(int i, boolean z, boolean z2, boolean z3, Uri uri, xvz xvzVar, xvg xvgVar, String str, Map map, String str2) {
        this.a = i;
        this.i = z;
        this.b = z2;
        this.c = z3;
        this.j = uri;
        this.d = xvzVar;
        this.e = xvgVar;
        this.f = str;
        this.g = map;
        this.h = str2;
    }

    public static xuz a() {
        xuz xuzVar = new xuz();
        xuzVar.f(true);
        xuzVar.d(false);
        xuzVar.c(false);
        return xuzVar;
    }

    public static xva b(int i) {
        xuz xuzVarA = a();
        xuzVarA.e(i);
        xuzVarA.b(new HashMap());
        return xuzVarA.a();
    }

    public final boolean equals(Object obj) {
        Uri uri;
        xvz xvzVar;
        xvg xvgVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xva) {
            xva xvaVar = (xva) obj;
            if (this.a == xvaVar.a && this.i == xvaVar.i && this.b == xvaVar.b && this.c == xvaVar.c && ((uri = this.j) != null ? uri.equals(xvaVar.j) : xvaVar.j == null) && ((xvzVar = this.d) != null ? xvzVar.equals(xvaVar.d) : xvaVar.d == null) && ((xvgVar = this.e) != null ? xvgVar.equals(xvaVar.e) : xvaVar.e == null) && ((str = this.f) != null ? str.equals(xvaVar.f) : xvaVar.f == null) && this.g.equals(xvaVar.g)) {
                String str2 = this.h;
                if (str2 == null) {
                    if (xvaVar.h == null) {
                        return true;
                    }
                } else if (str2.equals(xvaVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.j;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        int i = this.a;
        int i2 = (((((((((i ^ 1000003) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ iHashCode) * 1000003;
        xvz xvzVar = this.d;
        int iHashCode2 = (i2 ^ (xvzVar == null ? 0 : xvzVar.hashCode())) * 1000003;
        xvg xvgVar = this.e;
        int iHashCode3 = (iHashCode2 ^ (xvgVar == null ? 0 : xvgVar.hashCode())) * 1000003;
        String str = this.f;
        int iHashCode4 = (((iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003;
        String str2 = this.h;
        return iHashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Map map = this.g;
        xvg xvgVar = this.e;
        xvz xvzVar = this.d;
        return "AppStatus{status=" + this.a + ", stopAllowed=" + this.i + ", inAppDial=" + this.b + ", castSupported=" + this.c + ", installUrl=" + String.valueOf(this.j) + ", screenId=" + String.valueOf(xvzVar) + ", loungeDeviceId=" + String.valueOf(xvgVar) + ", runningPathSegment=" + this.f + ", additionalData=" + String.valueOf(map) + ", theme=" + this.h + '}';
    }

    public xva() {
        throw null;
    }
}
