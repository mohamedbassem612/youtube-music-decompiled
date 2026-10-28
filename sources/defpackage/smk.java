package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smk extends snn {
    public final boolean b;
    public final int c;
    public final String d;
    public final wgm e;
    public final wjf r;
    public final ajwo s;
    private final String t;
    private final Uri u;
    private final ambn v;
    private final amud w;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/model/RemoteVideoAd");
    public static final Parcelable.Creator CREATOR = new pyc(13);

    public smk(boolean z, int i, long j, String str, String str2, String str3, String str4, byte[] bArr, wgm wgmVar, Uri uri, wjf wjfVar, ajwo ajwoVar, ambn ambnVar, amud amudVar) {
        super(str3, bArr, "", "", false, wiu.c, str, j, sno.a);
        this.b = z;
        this.c = i;
        this.d = str2;
        this.t = str4;
        this.e = wgmVar;
        this.u = uri;
        this.r = wjfVar;
        this.s = ajwoVar;
        this.v = ambnVar;
        this.w = amudVar;
    }

    @Override // defpackage.smc
    public final boolean A() {
        return this.b;
    }

    @Override // defpackage.slb
    public final amud G() {
        amud amudVar = this.w;
        return amudVar == null ? amud.b : amudVar;
    }

    @Override // defpackage.smc
    public final wgm J() {
        return this.e;
    }

    @Override // defpackage.smc
    public final int a() {
        return this.c;
    }

    @Override // defpackage.smc
    public final wjf c() {
        return this.r;
    }

    @Override // defpackage.slb
    public final Optional e() {
        return Optional.ofNullable(this.v);
    }

    @Override // defpackage.smc
    public final String j() {
        return "remoteVideoAd";
    }

    @Override // defpackage.smc
    public final String k() {
        return this.d;
    }

    public final smj n() {
        smj smjVar = new smj();
        smjVar.a = this.b;
        smjVar.b = this.c;
        smjVar.c = this.p;
        smjVar.d = this.o;
        smjVar.e = this.d;
        smjVar.f = this.i;
        smjVar.g = this.t;
        smjVar.h = this.j;
        smjVar.i = this.e;
        smjVar.j = this.u;
        smjVar.k = this.r;
        smjVar.l = this.s;
        smjVar.m = (ambn) e().orElse(null);
        smjVar.n = G();
        return smjVar;
    }

    @Override // defpackage.slb
    public final Uri o() {
        return this.u;
    }

    @Override // defpackage.smc
    public final String v() {
        return this.t;
    }

    @Override // defpackage.smc, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.t);
        parcel.writeString(this.e.toString());
        parcel.writeParcelable(this.u, 0);
        parcel.writeParcelable(this.r, 0);
        ajwo ajwoVar = this.s;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        tym.u(ajwoVar, parcel);
        Optional optionalE = e();
        if (optionalE.isPresent()) {
            tym.u((MessageLite) optionalE.get(), parcel);
        }
        amud amudVarG = G();
        if (amudVarG != null) {
            tym.u(amudVarG, parcel);
        }
    }
}
