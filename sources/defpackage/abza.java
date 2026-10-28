package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abza implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(9);
    public final int A;
    public final long B;
    public final String C;
    public final float D;
    public final int E;
    public final int[] F;
    public final int G;
    public final String H;
    public final boolean I;
    public final boolean J;
    public final Optional K;
    public final int L;
    public final float M;
    public final int N;
    public final String O;
    public final String P;
    public final wjm a;
    public final wjm b;
    public final wjm c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final int z;

    public abza(Parcel parcel) {
        ClassLoader classLoader = abza.class.getClassLoader();
        this.a = (wjm) parcel.readParcelable(classLoader);
        this.b = (wjm) parcel.readParcelable(classLoader);
        this.c = (wjm) parcel.readParcelable(classLoader);
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.h = typ.c(parcel.readString());
        this.i = typ.c(parcel.readString());
        this.j = typ.c(parcel.readString());
        this.l = parcel.readInt();
        this.m = parcel.readLong();
        this.n = parcel.readLong();
        this.o = parcel.readInt() == 1;
        this.p = parcel.readInt() == 1;
        this.q = parcel.readInt() == 1;
        this.r = parcel.readInt() == 1;
        this.s = parcel.readInt() == 1;
        this.u = parcel.readInt() == 1;
        this.t = parcel.readInt() == 1;
        this.v = parcel.readInt() == 1;
        this.w = parcel.readInt() == 1;
        this.x = parcel.readInt() == 1;
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.C = typ.c(parcel.readString());
        this.k = typ.c(parcel.readString());
        this.E = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        this.F = iArrCreateIntArray == null ? new int[0] : iArrCreateIntArray;
        this.G = parcel.readInt();
        this.H = typ.c(parcel.readString());
        this.D = parcel.readFloat();
        this.A = parcel.readInt();
        this.B = parcel.readLong();
        this.I = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1;
        this.J = parcel.readInt() == 1;
        this.K = Optional.ofNullable(parcel.readString());
        this.L = parcel.readInt();
        this.M = parcel.readFloat();
        this.N = parcel.readInt();
        this.O = typ.c(parcel.readString());
        this.P = typ.c(parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        wjm wjmVar = this.a;
        Object objC = wjmVar != null ? wjmVar.c() : "NULL";
        wjm wjmVar2 = this.b;
        String strValueOf = String.valueOf(objC);
        Object objC2 = wjmVar2 != null ? wjmVar2.c() : "NULL";
        wjm wjmVar3 = this.c;
        String strValueOf2 = String.valueOf(objC2);
        Object objC3 = wjmVar3 != null ? wjmVar3.c() : "NULL";
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        String str = this.h;
        String str2 = this.i;
        String str3 = this.j;
        int i = this.l;
        long j4 = this.m;
        Object obj = objC3;
        boolean z = this.o;
        boolean z2 = this.q;
        boolean z3 = this.r;
        boolean z4 = this.s;
        boolean z5 = this.u;
        boolean z6 = this.t;
        boolean z7 = this.v;
        int i2 = this.y;
        int i3 = this.z;
        String str4 = this.C;
        float f = this.D;
        float f2 = this.M;
        String str5 = this.H;
        boolean z8 = this.I;
        boolean z9 = this.J;
        boolean z10 = this.d;
        Optional optional = this.K;
        return "VideoStats2Client.VideoStats2ClientState{" + hexString + " basePlaybackUri=" + strValueOf + " baseDelayplayUri=" + strValueOf2 + " baseWatchtimeUri=" + String.valueOf(obj) + " sessionStartTimestamp=" + j + " currentPlaybackPosition=" + j2 + " lengthMillis=" + j3 + " videoId=" + str + " hostCpn=" + str2 + " cpn=" + str3 + " delay=" + i + " watchTimeMillis=" + j4 + " autoplay=" + z + " scriptedPlayback=" + z2 + " delayedPingSent=" + z3 + " delayPingAlreadySentViaWatchTime=" + z4 + " finalPingSent=" + z5 + " initialPingSent=" + z6 + " throttled=" + z7 + " videoItag=" + i2 + " audioItag=" + i3 + " subtitleTrackId=" + str4 + " playbackRate=" + f + " baselinePlaybackRate=" + f2 + " referringAppName=" + str5 + " isDoubleLoggingWatchtime=" + z8 + " isSingleLoggingVss3Watchtime=" + z9 + " isReuse=" + z10 + " multiAudioTrackId=" + ((String) optional.orElse("Non Multi-Audio Playback")) + " seekSource=" + this.L + " loopState=" + this.N + " compositeLiveStatusToken=" + this.O + " compositeLiveIngestionOffsetToken=" + this.P + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.l);
        parcel.writeLong(this.m);
        parcel.writeLong(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.C);
        parcel.writeString(this.k);
        parcel.writeInt(this.E);
        parcel.writeIntArray(this.F);
        parcel.writeInt(this.G);
        parcel.writeString(this.H);
        parcel.writeFloat(this.D);
        parcel.writeInt(this.A);
        parcel.writeLong(this.B);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeString((String) this.K.orElse(null));
        parcel.writeInt(this.L);
        parcel.writeFloat(this.M);
        parcel.writeInt(this.N);
        parcel.writeString(this.O);
        parcel.writeString(this.P);
    }

    public abza(wjm wjmVar, wjm wjmVar2, wjm wjmVar3, boolean z, long j, long j2, long j3, String str, String str2, String str3, String str4, int i, long j4, long j5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i2, int i3, String str5, float f, int i4, int[] iArr, int i5, String str6, int i6, long j6, boolean z12, boolean z13, Optional optional, int i7, float f2, int i8, String str7, String str8) {
        this.a = wjmVar;
        this.b = wjmVar2;
        this.c = wjmVar3;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = typ.c(str);
        this.i = typ.c(str2);
        this.j = typ.c(str3);
        this.k = typ.c(str4);
        this.l = i;
        this.m = j4;
        this.n = j5;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = z6;
        this.u = z7;
        this.t = z8;
        this.v = z9;
        this.w = z10;
        this.x = z11;
        this.y = i2;
        this.z = i3;
        this.C = typ.c(str5);
        this.D = f;
        this.E = i4;
        this.F = iArr == null ? new int[0] : iArr;
        this.G = i5;
        this.H = typ.c(str6);
        this.A = i6;
        this.B = j6;
        this.I = z12;
        this.J = z13;
        this.K = optional;
        this.L = i7;
        this.M = f2;
        this.N = i8;
        this.O = str7;
        this.P = str8;
    }
}
