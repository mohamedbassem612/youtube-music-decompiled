package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgo extends slb {
    public static final Parcelable.Creator CREATOR = new pyc(7);
    public static final String a = "2_2_15";
    private final wjf b;

    public sgo(String str, byte[] bArr, String str2, String str3, boolean z, String str4, long j, wjf wjfVar) {
        super(str, bArr, str2, str3, z, wjfVar.f(), str4, j, new sno(aivn.a));
        wjfVar.getClass();
        this.b = wjfVar;
    }

    @Override // defpackage.smc
    public final int a() {
        return this.b.a();
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
        return this.b;
    }

    @Override // defpackage.smc
    @Deprecated
    public final aiwa d() {
        return this.b.q();
    }

    @Override // defpackage.slb
    public final Optional e() {
        return Optional.empty();
    }

    @Override // defpackage.smc
    public final boolean equals(Object obj) {
        if (!(obj instanceof sgo)) {
            return false;
        }
        sgo sgoVar = (sgo) obj;
        return super.equals(sgoVar) && Objects.equals(this.b, sgoVar.b);
    }

    @Override // defpackage.slb
    public final Optional f() {
        return Optional.of(this.b.h());
    }

    @Override // defpackage.slb
    public final Optional g() {
        return Optional.ofNullable(this.b.g());
    }

    @Override // defpackage.smc
    public final String h() {
        return a;
    }

    @Override // defpackage.smc
    public final String i() {
        return this.b.z();
    }

    @Override // defpackage.smc
    public final String j() {
        return "videoAd";
    }

    @Override // defpackage.smc
    public final String k() {
        return this.b.G();
    }

    @Override // defpackage.smc
    public final boolean l() {
        return this.b.q() != null;
    }

    @Override // defpackage.smc, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
    }
}
