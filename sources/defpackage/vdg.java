package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdg implements Parcelable {
    public final String A;
    public final Duration B;
    public final Duration C;
    public final boolean D;
    public final float E;
    public final wgs F;
    public final wiu G;
    public final ajai H;
    public final boolean I;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final ajwo h;
    public final ajwo i;
    public final aqmh j;
    public final String k;
    public final Uri l;
    public final apvm m;
    public final apvy n;
    public final long o;
    public final long p;
    public final boolean q;
    public final Optional r;
    public final Optional s;
    public final Optional t;
    public final long u;
    public final String v;
    public final ajwo w;
    public final auhu x;
    public final agke y;
    public final agke z;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/music/ShortsCreationSelectedTrack");
    public static final Parcelable.Creator CREATOR = new vdd();

    public vdg(boolean z, boolean z2, String str, String str2, long j, String str3, ajwo ajwoVar, ajwo ajwoVar2, aqmh aqmhVar, String str4, Uri uri, apvm apvmVar, apvy apvyVar, long j2, long j3, boolean z3, Optional optional, Optional optional2, Optional optional3, long j4, String str5, ajwo ajwoVar3, auhu auhuVar, agke agkeVar, agke agkeVar2, String str6, Duration duration, Duration duration2, boolean z4, float f, wgs wgsVar, wiu wiuVar, ajai ajaiVar, boolean z5) {
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = str3;
        this.h = ajwoVar;
        this.i = ajwoVar2;
        this.j = aqmhVar;
        this.k = str4;
        this.l = uri;
        this.m = apvmVar;
        this.n = apvyVar;
        this.o = j2;
        this.p = j3;
        this.q = z3;
        this.r = optional;
        this.s = optional2;
        this.t = optional3;
        this.u = j4;
        this.v = str5;
        this.w = ajwoVar3;
        this.x = auhuVar;
        this.y = agkeVar;
        this.z = agkeVar2;
        this.A = str6;
        this.B = duration;
        this.C = duration2;
        this.D = z4;
        this.E = f;
        this.F = wgsVar;
        this.G = wiuVar;
        this.H = ajaiVar;
        this.I = z5;
    }

    public static vdf a() {
        vdf vdfVar = new vdf();
        vdfVar.p(0L);
        vdfVar.k = Optional.empty();
        vdfVar.s(15000L);
        vdfVar.l(15000L);
        vdfVar.r(false);
        vdfVar.g(false);
        vdfVar.j(false);
        vdfVar.h(0L);
        agke agkeVar = agpi.a;
        vdfVar.q = agke.n(agkeVar);
        vdfVar.k(true);
        vdfVar.r = agke.n(agkeVar);
        vdfVar.s = "";
        vdfVar.n(Duration.ZERO);
        vdfVar.m(Duration.ZERO);
        vdfVar.i(false);
        vdfVar.q(-1.0f);
        return vdfVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        ajwo ajwoVar;
        ajwo ajwoVar2;
        aqmh aqmhVar;
        String str4;
        Uri uri;
        apvm apvmVar;
        apvy apvyVar;
        String str5;
        ajwo ajwoVar3;
        auhu auhuVar;
        wgs wgsVar;
        wiu wiuVar;
        ajai ajaiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vdg) {
            vdg vdgVar = (vdg) obj;
            if (this.b == vdgVar.b && this.c == vdgVar.c && ((str = this.d) != null ? str.equals(vdgVar.d) : vdgVar.d == null) && ((str2 = this.e) != null ? str2.equals(vdgVar.e) : vdgVar.e == null) && this.f == vdgVar.f && ((str3 = this.g) != null ? str3.equals(vdgVar.g) : vdgVar.g == null) && ((ajwoVar = this.h) != null ? ajwoVar.equals(vdgVar.h) : vdgVar.h == null) && ((ajwoVar2 = this.i) != null ? ajwoVar2.equals(vdgVar.i) : vdgVar.i == null) && ((aqmhVar = this.j) != null ? aqmhVar.equals(vdgVar.j) : vdgVar.j == null) && ((str4 = this.k) != null ? str4.equals(vdgVar.k) : vdgVar.k == null) && ((uri = this.l) != null ? uri.equals(vdgVar.l) : vdgVar.l == null) && ((apvmVar = this.m) != null ? apvmVar.equals(vdgVar.m) : vdgVar.m == null) && ((apvyVar = this.n) != null ? apvyVar.equals(vdgVar.n) : vdgVar.n == null) && this.o == vdgVar.o && this.p == vdgVar.p && this.q == vdgVar.q && this.r.equals(vdgVar.r) && this.s.equals(vdgVar.s) && this.t.equals(vdgVar.t) && this.u == vdgVar.u && ((str5 = this.v) != null ? str5.equals(vdgVar.v) : vdgVar.v == null) && ((ajwoVar3 = this.w) != null ? ajwoVar3.equals(vdgVar.w) : vdgVar.w == null) && ((auhuVar = this.x) != null ? auhuVar.equals(vdgVar.x) : vdgVar.x == null) && aguu.v(this.y, vdgVar.y) && aguu.v(this.z, vdgVar.z) && this.A.equals(vdgVar.A) && this.B.equals(vdgVar.B) && this.C.equals(vdgVar.C) && this.D == vdgVar.D) {
                if (Float.floatToIntBits(this.E) == Float.floatToIntBits(vdgVar.E) && ((wgsVar = this.F) != null ? wgsVar.equals(vdgVar.F) : vdgVar.F == null) && ((wiuVar = this.G) != null ? wiuVar.equals(vdgVar.G) : vdgVar.G == null) && ((ajaiVar = this.H) != null ? ajaiVar.equals(vdgVar.H) : vdgVar.H == null) && this.I == vdgVar.I) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode());
        String str2 = this.e;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        long j = this.f;
        int i = ((((iHashCode * 1000003) ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        String str3 = this.g;
        int iHashCode3 = (i ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        ajwo ajwoVar = this.h;
        int iHashCode4 = (iHashCode3 ^ (ajwoVar == null ? 0 : ajwoVar.hashCode())) * 1000003;
        ajwo ajwoVar2 = this.i;
        int iHashCode5 = (iHashCode4 ^ (ajwoVar2 == null ? 0 : ajwoVar2.hashCode())) * 1000003;
        aqmh aqmhVar = this.j;
        int iHashCode6 = iHashCode5 ^ (aqmhVar == null ? 0 : aqmhVar.hashCode());
        String str4 = this.k;
        int iHashCode7 = ((iHashCode6 * (-721379959)) ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Uri uri = this.l;
        int iHashCode8 = (iHashCode7 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        apvm apvmVar = this.m;
        int iHashCode9 = (iHashCode8 ^ (apvmVar == null ? 0 : apvmVar.hashCode())) * 1000003;
        apvy apvyVar = this.n;
        int iHashCode10 = apvyVar == null ? 0 : apvyVar.hashCode();
        long j2 = this.o;
        int i2 = (((iHashCode9 ^ iHashCode10) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        long j3 = this.p;
        int iHashCode11 = (((((((((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003;
        long j4 = this.u;
        int i3 = (iHashCode11 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        String str5 = this.v;
        int iHashCode12 = (i3 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        ajwo ajwoVar3 = this.w;
        int iHashCode13 = (iHashCode12 ^ (ajwoVar3 == null ? 0 : ajwoVar3.hashCode())) * 1000003;
        auhu auhuVar = this.x;
        int iHashCode14 = (((((((((((((((iHashCode13 ^ (auhuVar == null ? 0 : auhuVar.hashCode())) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B.hashCode()) * 1000003) ^ this.C.hashCode()) * 1000003) ^ (true != this.D ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.E)) * 1000003;
        wgs wgsVar = this.F;
        int iHashCode15 = (iHashCode14 ^ (wgsVar == null ? 0 : wgsVar.hashCode())) * 1000003;
        wiu wiuVar = this.G;
        int iHashCode16 = (iHashCode15 ^ (wiuVar == null ? 0 : wiuVar.hashCode())) * 1000003;
        ajai ajaiVar = this.H;
        return ((iHashCode16 ^ (ajaiVar != null ? ajaiVar.hashCode() : 0)) * 1000003) ^ (true == this.I ? 1231 : 1237);
    }

    public final String toString() {
        ajai ajaiVar = this.H;
        wiu wiuVar = this.G;
        wgs wgsVar = this.F;
        Duration duration = this.C;
        Duration duration2 = this.B;
        agke agkeVar = this.z;
        agke agkeVar2 = this.y;
        auhu auhuVar = this.x;
        ajwo ajwoVar = this.w;
        Optional optional = this.t;
        Optional optional2 = this.s;
        Optional optional3 = this.r;
        apvy apvyVar = this.n;
        apvm apvmVar = this.m;
        Uri uri = this.l;
        aqmh aqmhVar = this.j;
        ajwo ajwoVar2 = this.i;
        String strValueOf = String.valueOf(this.h);
        String strValueOf2 = String.valueOf(ajwoVar2);
        String strValueOf3 = String.valueOf(aqmhVar);
        String strValueOf4 = String.valueOf(uri);
        String strValueOf5 = String.valueOf(apvmVar);
        String strValueOf6 = String.valueOf(apvyVar);
        String strValueOf7 = String.valueOf(optional3);
        String strValueOf8 = String.valueOf(optional2);
        String strValueOf9 = String.valueOf(optional);
        String strValueOf10 = String.valueOf(ajwoVar);
        String strValueOf11 = String.valueOf(auhuVar);
        String strValueOf12 = String.valueOf(agkeVar2);
        String strValueOf13 = String.valueOf(agkeVar);
        String strValueOf14 = String.valueOf(duration2);
        String strValueOf15 = String.valueOf(duration);
        String strValueOf16 = String.valueOf(wgsVar);
        String strValueOf17 = String.valueOf(wiuVar);
        String strValueOf18 = String.valueOf(ajaiVar);
        StringBuilder sb = new StringBuilder("ShortsCreationSelectedTrack{wasReadFromParcel=");
        sb.append(this.b);
        sb.append(", hasHandledNavigationCommand=");
        sb.append(this.c);
        sb.append(", videoId=");
        sb.append(this.d);
        sb.append(", cpn=");
        sb.append(this.e);
        sb.append(", startTimeMs=");
        sb.append(this.f);
        sb.append(", playerParams=");
        sb.append(this.g);
        sb.append(", shortsSourceVideoCommand=");
        sb.append(strValueOf);
        sb.append(", navigationCommand=");
        sb.append(strValueOf2);
        sb.append(", thumbnail=");
        sb.append(strValueOf3);
        sb.append(", dsps=null, title=");
        sb.append(this.k);
        sb.append(", uri=");
        sb.append(strValueOf4);
        sb.append(", sourceClipData=");
        sb.append(strValueOf5);
        sb.append(", mediaAttribution=");
        sb.append(strValueOf6);
        sb.append(", selectedAudioDurationMs=");
        sb.append(this.o);
        sb.append(", maxAudioDurationMs=");
        sb.append(this.p);
        boolean z = this.I;
        float f = this.E;
        boolean z2 = this.D;
        String str = this.A;
        String str2 = this.v;
        long j = this.u;
        boolean z3 = this.q;
        sb.append(", isPendingResponse=");
        sb.append(z3);
        sb.append(", audioDurationMs=");
        sb.append(strValueOf7);
        sb.append(", waveformUrl=");
        sb.append(strValueOf8);
        sb.append(", waveformBytes=");
        sb.append(strValueOf9);
        sb.append(", initialSelectedDurationMs=");
        sb.append(j);
        sb.append(", subTitle=");
        sb.append(str2);
        sb.append(", getShortsSourceVideoCommand=");
        sb.append(strValueOf10);
        sb.append(", dynamicCreationMusicAsset=");
        sb.append(strValueOf11);
        sb.append(", remixSources=");
        sb.append(strValueOf12);
        sb.append(", creationFeatureConfigList=");
        sb.append(strValueOf13);
        sb.append(", associatedVideoSegmentAbsoluteOriginalFilePath=");
        sb.append(str);
        sb.append(", relativeStartTime=");
        sb.append(strValueOf14);
        sb.append(", relativeDuration=");
        sb.append(strValueOf15);
        sb.append(", isLinkedToVideoInternal=");
        sb.append(z2);
        sb.append(", volume=");
        sb.append(f);
        sb.append(", formatStreamModel=");
        sb.append(strValueOf16);
        sb.append(", playerConfigModel=");
        sb.append(strValueOf17);
        sb.append(", aiProvenance=");
        sb.append(strValueOf18);
        sb.append(", isTrackBuildTryCatchEnabled=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        aqmh aqmhVar = this.j;
        parcel.writeInt(aqmhVar != null ? 1 : 0);
        if (aqmhVar != null) {
            parcel.writeByteArray(aqmhVar.toByteArray());
        }
        parcel.writeString(this.k);
        parcel.writeParcelable(this.l, 0);
        Optional optional = this.r;
        parcel.writeLong(optional.isPresent() ? ((Long) optional.get()).longValue() : -1L);
        Optional optional2 = this.s;
        parcel.writeInt(optional2.isPresent() ? 1 : 0);
        if (optional2.isPresent()) {
            parcel.writeString((String) optional2.get());
        }
        Object[] objArr = optional2.isEmpty() && this.t.isPresent();
        parcel.writeInt(objArr != false ? ((byte[]) this.t.get()).length : -1);
        if (objArr != false) {
            parcel.writeByteArray((byte[]) this.t.get());
        }
        ajwo ajwoVar = this.h;
        parcel.writeInt(ajwoVar != null ? 1 : 0);
        if (ajwoVar != null) {
            parcel.writeByteArray(ajwoVar.toByteArray());
        }
        ajwo ajwoVar2 = this.i;
        parcel.writeInt(ajwoVar2 != null ? 1 : 0);
        if (ajwoVar2 != null) {
            parcel.writeByteArray(ajwoVar2.toByteArray());
        }
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.u);
        apvm apvmVar = this.m;
        parcel.writeInt(apvmVar != null ? 1 : 0);
        if (apvmVar != null) {
            parcel.writeByteArray(apvmVar.toByteArray());
        }
        apvy apvyVar = this.n;
        parcel.writeInt(apvyVar != null ? 1 : 0);
        if (apvyVar != null) {
            parcel.writeByteArray(apvyVar.toByteArray());
        }
        parcel.writeString(this.v);
        auhu auhuVar = this.x;
        parcel.writeInt(auhuVar != null ? 1 : 0);
        if (auhuVar != null) {
            parcel.writeByteArray(auhuVar.toByteArray());
        }
        parcel.writeString(this.A);
        parcel.writeLong(this.B.toMillis());
        parcel.writeLong(this.C.toMillis());
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeFloat(this.E);
        wgs wgsVar = this.F;
        parcel.writeInt(wgsVar != null ? 1 : 0);
        if (wgsVar != null) {
            parcel.writeParcelable(wgsVar, 0);
        }
        wiu wiuVar = this.G;
        parcel.writeInt(wiuVar != null ? 1 : 0);
        if (wiuVar != null) {
            parcel.writeParcelable(wiuVar, 0);
        }
        ajai ajaiVar = this.H;
        parcel.writeInt(ajaiVar == null ? 0 : 1);
        if (ajaiVar != null) {
            parcel.writeByteArray(ajaiVar.toByteArray());
        }
    }

    public vdg() {
        throw null;
    }
}
