package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abzg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(10);
    public final long A;
    public final arjb B;
    public final long C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final String I;
    public final String J;
    public final int K;
    public final aihf L;
    public final aihf M;
    private final long N;
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final float l;
    public final String m;
    public final Optional n;
    public final appa o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public final wjn y;
    public final boolean z;

    public abzg(Parcel parcel) {
        this.y = (wjn) parcel.readParcelable(abzg.class.getClassLoader());
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = typ.c(parcel.readString());
        this.d = typ.c(parcel.readString());
        this.e = typ.c(parcel.readString());
        this.f = typ.c(parcel.readString());
        this.g = parcel.readLong();
        this.h = parcel.readInt() == 1;
        this.k = parcel.readFloat();
        this.l = parcel.readFloat();
        this.i = parcel.readInt();
        this.j = parcel.readLong();
        this.m = typ.c(parcel.readString());
        this.n = Optional.ofNullable(parcel.readString());
        this.o = appa.a(parcel.readInt());
        this.p = parcel.readInt();
        this.q = parcel.readInt() == 1;
        this.r = parcel.readInt() == 1;
        this.s = parcel.readInt() == 1;
        this.t = parcel.readInt() == 1;
        this.x = parcel.readInt() == 1;
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.N = parcel.readLong();
        this.z = parcel.readInt() == 1;
        this.A = parcel.readLong();
        this.L = ((arja) tym.t(parcel, arja.a)).toBuilder();
        arjb arjbVar = arjb.a;
        this.M = ((arjb) tym.t(parcel, arjbVar)).toBuilder();
        this.B = (arjb) tym.t(parcel, arjbVar);
        this.C = parcel.readLong();
        this.D = parcel.readInt() == 1;
        this.E = parcel.readInt() == 1;
        this.K = a.bi(parcel.readInt());
        this.F = parcel.readInt() == 1;
        this.G = parcel.readInt() == 1;
        this.H = parcel.readInt() == 1;
        this.I = typ.c(parcel.readString());
        this.J = typ.c(parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        int i = this.K;
        appa appaVar = this.o;
        String strValueOf = String.valueOf(this.n);
        String strName = appaVar.name();
        switch (i) {
            case 1:
                str = "PLAYER_PLAYBACK_STATE_UNKNOWN";
                break;
            case 2:
                str = "PLAYER_PLAYBACK_STATE_PLAYING";
                break;
            case 3:
                str = "PLAYER_PLAYBACK_STATE_PAUSED";
                break;
            case 4:
                str = "PLAYER_PLAYBACK_STATE_BUFFERING";
                break;
            case 5:
                str = "PLAYER_PLAYBACK_STATE_PAUSED_BUFFERING";
                break;
            case 6:
                str = "PLAYER_PLAYBACK_STATE_SEEKING";
                break;
            case 7:
                str = "PLAYER_PLAYBACK_STATE_ENDED";
                break;
            case 8:
                str = "PLAYER_PLAYBACK_STATE_ERROR";
                break;
            case 9:
                str = "PLAYER_PLAYBACK_STATE_SUSPENDED";
                break;
            case 10:
                str = "PLAYER_PLAYBACK_STATE_UNSTARTED";
                break;
            default:
                str = "null";
                break;
        }
        if (i == 0) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("VideoStats3Client.VideoStats3ClientState{ currentPlaybackPosition=");
        sb.append(this.a);
        sb.append(" videoLengthMillis=");
        sb.append(this.b);
        sb.append(" videoId=");
        sb.append(this.c);
        sb.append(" cpn=");
        sb.append(this.d);
        sb.append(" hostCpn=");
        sb.append(this.e);
        sb.append(" referringApp=");
        sb.append(this.f);
        sb.append(" watchTimeMillis=");
        sb.append(this.g);
        sb.append(" playbackRate=");
        sb.append(this.k);
        sb.append(" baselinePlaybackRate=");
        sb.append(this.l);
        sb.append(" captionTrack=");
        sb.append(this.m);
        sb.append(" audioTrack=");
        sb.append(strValueOf);
        sb.append(" seekSource=");
        sb.append(strName);
        sb.append(" delaySeconds=");
        sb.append(this.p);
        sb.append(" delayedPingSent=");
        sb.append(this.q);
        sb.append(" delayPingAlreadySentViaWatchTime=");
        sb.append(this.r);
        sb.append(" autoplay=");
        sb.append(this.s);
        sb.append(" isLive=");
        sb.append(this.x);
        sb.append(" videoItag=");
        sb.append(this.u);
        sb.append(" audioItag=");
        sb.append(this.v);
        sb.append(" loopState=");
        sb.append(this.w);
        sb.append(" finalPingSent=");
        sb.append(this.z);
        String str2 = this.J;
        String str3 = this.I;
        boolean z = this.H;
        boolean z2 = this.G;
        boolean z3 = this.F;
        boolean z4 = this.E;
        boolean z5 = this.D;
        long j = this.C;
        long j2 = this.A;
        sb.append(" sessionStartTimeStamp=");
        sb.append(j2);
        sb.append(" activeSegmentStartWalltimeMillis=");
        sb.append(j);
        sb.append(" isReuse=");
        sb.append(z5);
        sb.append(" isReleased=");
        sb.append(z4);
        sb.append(" playbackState=");
        sb.append(str);
        sb.append(" shouldSendNonPlayingPingsOnImmediateTier=");
        sb.append(z3);
        sb.append(" enableSubsecondWatchtimeReportingShorts=");
        sb.append(z2);
        sb.append(" updatePositionPlaybackStopped=");
        sb.append(z);
        sb.append(" compositeLiveStatusToken=");
        sb.append(str3);
        sb.append(" compositeLiveIngestionOffsetToken=");
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.y, 0);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeFloat(this.k);
        parcel.writeFloat(this.l);
        parcel.writeInt(this.i);
        parcel.writeLong(this.j);
        parcel.writeString(this.m);
        parcel.writeString((String) this.n.orElse(null));
        parcel.writeInt(this.o.bm);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeLong(this.N);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeLong(this.A);
        tym.u(this.L.build(), parcel);
        tym.u(this.M.build(), parcel);
        tym.u(this.B, parcel);
        parcel.writeLong(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        int i2 = this.K;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
    }

    public abzg(long j, long j2, String str, String str2, String str3, String str4, long j3, boolean z, float f, float f2, int i, long j4, String str5, Optional optional, appa appaVar, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, int i4, long j5, int i5, wjn wjnVar, boolean z7, long j6, aihf aihfVar, aihf aihfVar2, arjb arjbVar, long j7, boolean z8, boolean z9, int i6, boolean z10, boolean z11, boolean z12, String str6, String str7) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = typ.c(str3);
        this.f = typ.c(str4);
        this.g = j3;
        this.h = z;
        this.k = f;
        this.l = f2;
        this.i = i;
        this.j = j4;
        this.m = str5;
        this.n = optional;
        this.o = appaVar;
        this.p = i2;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.x = z6;
        this.u = i3;
        this.v = i4;
        this.N = j5;
        this.w = i5;
        this.y = wjnVar;
        this.z = z7;
        this.A = j6;
        this.L = aihfVar;
        this.M = aihfVar2;
        this.B = arjbVar;
        this.C = j7;
        this.D = z8;
        this.E = z9;
        this.K = i6;
        this.F = z10;
        this.G = z11;
        this.H = z12;
        this.I = typ.c(str6);
        this.J = typ.c(str7);
    }
}
