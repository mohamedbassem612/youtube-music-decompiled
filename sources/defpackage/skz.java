package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class skz extends snn {
    public final arcg b;
    public final wjf c;
    public final int d;
    public boolean e;
    private final boolean r;
    private final int s;
    private boolean t;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/model/LocalVideoAd");
    public static final Parcelable.Creator CREATOR = new pyc(12);

    /* JADX WARN: Illegal instructions before constructor call */
    public skz(String str, byte[] bArr, String str2, String str3, boolean z, String str4, long j, arcg arcgVar, wjf wjfVar, int i, boolean z2, int i2) {
        aivn aivnVar;
        wiu wiuVarF = wjfVar.f();
        if ((arcgVar.b & 8) == 0 || (aivnVar = arcgVar.h) == null) {
            aivnVar = aivn.a;
        }
        super(str, bArr, str2, str3, z, wiuVarF, str4, j, new sno(aivnVar));
        arcgVar.getClass();
        this.b = arcgVar;
        this.c = wjfVar;
        this.d = i;
        this.r = z2;
        this.s = i2;
    }

    public static long n(wjf wjfVar, arcg arcgVar, long j, boolean z) {
        long millis;
        if (!z) {
            wja wjaVarG = wjfVar.g();
            if (wjaVarG != null) {
                long j2 = wjaVarG.i;
                if (j2 != Long.MAX_VALUE) {
                    return j + j2;
                }
            }
            return Long.MAX_VALUE;
        }
        aivj aivjVar = arcgVar.j;
        if (aivjVar == null) {
            aivjVar = aivj.a;
        }
        aivi aiviVar = aivjVar.b;
        if (aiviVar == null) {
            aiviVar = aivi.a;
        }
        if ((aiviVar.b & 1) != 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aivj aivjVar2 = arcgVar.j;
            if (aivjVar2 == null) {
                aivjVar2 = aivj.a;
            }
            aivi aiviVar2 = aivjVar2.b;
            if (aiviVar2 == null) {
                aiviVar2 = aivi.a;
            }
            aodo aodoVar = aiviVar2.c;
            if (aodoVar == null) {
                aodoVar = aodo.a;
            }
            millis = timeUnit.toMillis((long) aodoVar.b);
        } else {
            millis = g;
        }
        return j + millis;
    }

    @Override // defpackage.smc
    public final boolean A() {
        if (this.r) {
            return (this.b.b & 4) != 0;
        }
        return super.A();
    }

    @Override // defpackage.slb
    public final boolean B() {
        return this.b.w;
    }

    public final boolean C() {
        arcg arcgVar = this.b;
        if (arcgVar.c == 20) {
            return ((Boolean) arcgVar.d).booleanValue();
        }
        return false;
    }

    public final boolean D() {
        arcg arcgVar = this.b;
        if (arcgVar.c == 28) {
            return ((Boolean) arcgVar.d).booleanValue();
        }
        return false;
    }

    public final void E() {
        this.t = true;
    }

    @Override // defpackage.smc
    public final int a() {
        int i = this.b.s;
        return i > 0 ? Math.max(1, (int) Math.round(((double) i) / 1000.0d)) : this.c.a();
    }

    @Override // defpackage.smc
    public final Uri b() {
        Optional optionalG = g();
        if (true == optionalG.isPresent()) {
            optionalG = Optional.ofNullable(((wja) optionalG.get()).r);
        }
        if (optionalG.isEmpty()) {
            return null;
        }
        if (!((List) optionalG.get()).isEmpty()) {
            return ((wgs) ((List) optionalG.get()).get(0)).e;
        }
        zvp.a(zvn.a, zvm.a, "Received non-null videoStreamingData object with empty list of format streams");
        return null;
    }

    @Override // defpackage.smc
    public final wjf c() {
        return this.c;
    }

    @Override // defpackage.smc
    @Deprecated
    public final aiwa d() {
        return this.c.q();
    }

    @Override // defpackage.slb
    public final Optional e() {
        arce arceVar = this.b.l;
        if (arceVar == null) {
            arceVar = arce.a;
        }
        int i = arceVar.b;
        if (i == 106875026) {
            return Optional.of(i == 106875026 ? (ambn) arceVar.c : ambn.a);
        }
        return Optional.empty();
    }

    @Override // defpackage.smc
    public final boolean equals(Object obj) {
        if (!(obj instanceof skz)) {
            return false;
        }
        skz skzVar = (skz) obj;
        return super.equals(skzVar) && Objects.equals(this.b, skzVar.b) && Objects.equals(this.c, skzVar.c) && this.d == skzVar.d;
    }

    @Override // defpackage.slb
    public final Optional f() {
        return Optional.of(this.c.h());
    }

    @Override // defpackage.slb
    public final Optional g() {
        return Optional.ofNullable(this.c.g());
    }

    @Override // defpackage.smc
    public final String i() {
        return this.m ? "" : this.c.z();
    }

    @Override // defpackage.smc
    public final int iI() {
        return this.d;
    }

    @Override // defpackage.smc
    public final int iJ() {
        if (this.s == 0) {
            return this.t ? 1 + this.d : this.b.q;
        }
        return 1;
    }

    @Override // defpackage.smc
    public final aiua iL() {
        arcg arcgVar = this.b;
        if ((arcgVar.b & 32768) == 0) {
            return null;
        }
        aiua aiuaVar = arcgVar.o;
        return aiuaVar == null ? aiua.a : aiuaVar;
    }

    @Override // defpackage.smc
    public final String j() {
        return "videoAd";
    }

    @Override // defpackage.smc
    public final String k() {
        return this.c.G();
    }

    @Override // defpackage.smc
    public final boolean l() {
        return this.e || this.c.q() != null;
    }

    @Override // defpackage.smc
    public final int m() {
        return this.b.g;
    }

    @Override // defpackage.slb
    public final Uri o() {
        ajwo ajwoVar = this.b.i;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(araw.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        arav aravVar = (arav) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (aravVar.c.isEmpty()) {
            return null;
        }
        return Uri.parse(aravVar.c);
    }

    @Override // defpackage.smc
    public final aivo p() {
        aivo aivoVar = this.b.n;
        return aivoVar == null ? aivo.a : aivoVar;
    }

    @Override // defpackage.slb
    public final ajwo q() {
        arcg arcgVar = this.b;
        if ((arcgVar.b & 64) == 0) {
            return null;
        }
        ajwo ajwoVar = arcgVar.i;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.slb
    public final Optional r() {
        return I(new rxg(16), aold.a);
    }

    public final Optional s() {
        return I(new rxg(17), aivx.a);
    }

    @Override // defpackage.slb
    public final Optional t() {
        return I(new rxg(18), ajnp.a);
    }

    @Override // defpackage.slb
    public final Optional u() {
        return I(new rxg(19), ajmc.a);
    }

    @Override // defpackage.smc
    public final String v() {
        return this.b.m;
    }

    @Override // defpackage.slb
    public final String w() {
        arcg arcgVar = this.b;
        if ((arcgVar.b & 1073741824) != 0) {
            return arcgVar.v;
        }
        return null;
    }

    @Override // defpackage.smc, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        tym.u(this.b, parcel);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.r ? 1 : 0);
    }

    @Override // defpackage.smc
    public final List x() {
        return this.b.k;
    }

    public final boolean y() {
        return this.b.p;
    }

    public final boolean z() {
        arcg arcgVar = this.b;
        if (arcgVar.c == 23) {
            return ((Boolean) arcgVar.d).booleanValue();
        }
        return false;
    }

    public skz(wjf wjfVar, String str, String str2, String str3, long j, arcg arcgVar, wjf wjfVar2, int i, boolean z, int i2) {
        this(wjfVar.G(), wjfVar.ab(), str, str2, wjfVar.R(), str3, n(wjfVar2, arcgVar, j, wjfVar.R()), arcgVar, wjfVar2, i, z, i2);
    }
}
