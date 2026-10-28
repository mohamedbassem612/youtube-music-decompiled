package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvn extends xvr {
    private static final xva o = xva.b(-2);
    public final Uri a;
    public final Uri b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final int k;
    public final xvl l;
    public final int m;
    public final xwc n;

    public xvn(Uri uri, Uri uri2, xwc xwcVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, int i2, xvl xvlVar) {
        this.a = uri;
        this.b = uri2;
        this.n = xwcVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = j;
        this.k = i;
        this.m = i2;
        this.l = xvlVar;
    }

    public static xvm m() {
        xvm xvmVar = new xvm();
        xvmVar.h = new xvl(o);
        xvmVar.e(-1L);
        xvmVar.d(0);
        xvmVar.i = 1;
        xvmVar.c("");
        return xvmVar;
    }

    @Override // defpackage.xvr
    public final xvz b() {
        return k().d;
    }

    @Override // defpackage.xvr
    public final String c() {
        return this.c;
    }

    @Override // defpackage.xvr
    public final xwc d() {
        return this.n;
    }

    @Override // defpackage.xvr
    public final Bundle e() {
        Bundle bundleE = super.e();
        Uri uri = this.a;
        bundleE.putString("dial.dial_app_uri", uri == null ? "" : uri.toString());
        if (l() != null && !TextUtils.isEmpty(l().b)) {
            bundleE.putString("lounge_device_id", l().b);
        }
        return bundleE;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xvn) {
            xvn xvnVar = (xvn) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(xvnVar.a) : xvnVar.a == null) {
                Uri uri2 = this.b;
                if (uri2 != null ? uri2.equals(xvnVar.b) : xvnVar.b == null) {
                    if (this.n.equals(xvnVar.n) && this.c.equals(xvnVar.c) && this.d.equals(xvnVar.d) && ((str = this.e) != null ? str.equals(xvnVar.e) : xvnVar.e == null) && ((str2 = this.f) != null ? str2.equals(xvnVar.f) : xvnVar.f == null) && ((str3 = this.g) != null ? str3.equals(xvnVar.g) : xvnVar.g == null) && ((str4 = this.h) != null ? str4.equals(xvnVar.h) : xvnVar.h == null) && ((str5 = this.i) != null ? str5.equals(xvnVar.i) : xvnVar.i == null) && this.j == xvnVar.j && this.k == xvnVar.k) {
                        int i = this.m;
                        int i2 = xvnVar.m;
                        if (i == 0) {
                            throw null;
                        }
                        if (i == i2 && (xvnVar.l instanceof xvl)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.xvr
    public final String f() {
        return this.e + ':' + this.f;
    }

    @Override // defpackage.xvr
    public final boolean g(xvr xvrVar) {
        if (xvrVar instanceof xvn) {
            return this.n.equals(xvrVar.d());
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.b;
        int iHashCode2 = ((((((((iHashCode ^ 1000003) * 1000003) ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.g;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.h;
        int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.i;
        int iHashCode7 = (iHashCode6 ^ (str5 != null ? str5.hashCode() : 0)) * 1000003;
        long j = this.j;
        int i = (((iHashCode7 ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.k) * 1000003;
        int i2 = this.m;
        a.by(i2);
        return (i ^ i2) * 1000003;
    }

    @Override // defpackage.xvr
    public final int i() {
        return 3;
    }

    @Override // defpackage.xvr
    public final boolean j() {
        return q() || s() || k().a == 2;
    }

    public final xva k() {
        return this.l.a;
    }

    public final xvg l() {
        return k().e;
    }

    public final xvn n(xva xvaVar) {
        xvm xvmVar = new xvm(this);
        xvmVar.f(xvaVar);
        return xvmVar.a();
    }

    public final Map o() {
        return k().g;
    }

    public final boolean p() {
        String str = this.h;
        return str != null && str.contains("Cobalt");
    }

    public final boolean q() {
        return b() != null && k().a == 1;
    }

    public final boolean r() {
        return s() && this.a == null;
    }

    public final boolean s() {
        return this.i != null;
    }

    public final String toString() {
        int i = this.m;
        return "MdxDialScreen{dialAppUri=" + String.valueOf(this.a) + ", dialBaseUri=" + String.valueOf(this.b) + ", deviceId=" + String.valueOf(this.n) + ", deviceName=" + this.c + ", networkId=" + this.d + ", manufacturer=" + this.e + ", modelName=" + this.f + ", modelNumber=" + this.g + ", deviceVersion=" + this.h + ", wakeOnLanMac=" + this.i + ", wakeOnLanTimeout=" + this.j + ", wakeOnLanStatusOnStarted=" + this.k + ", cacheMethod=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", appStatusWrapper=" + String.valueOf(this.l) + '}';
    }

    @Override // defpackage.xvr
    public final /* synthetic */ List v() {
        agjz agjzVar = new agjz(4);
        String str = this.n.b;
        if (!TextUtils.isEmpty(str)) {
            agjzVar.h(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID, str));
        }
        return agjzVar.g();
    }

    public xvn() {
        throw null;
    }
}
