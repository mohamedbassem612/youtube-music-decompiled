package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvq {
    public final Duration a;
    private final Duration b;
    private final boolean c;
    private final int d;

    public uvq(Duration duration, Duration duration2, boolean z, int i) {
        duration.getClass();
        duration2.getClass();
        this.a = duration;
        this.b = duration2;
        this.c = z;
        this.d = i;
    }

    public static /* synthetic */ uvq a(uvq uvqVar, Duration duration, Duration duration2, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            duration = uvqVar.a;
        }
        if ((i2 & 2) != 0) {
            duration2 = uvqVar.b;
        }
        if ((i2 & 4) != 0) {
            z = uvqVar.c;
        }
        if ((i2 & 8) != 0) {
            i = uvqVar.d;
        }
        duration.getClass();
        duration2.getClass();
        if (i != 0) {
            return new uvq(duration, duration2, z, i);
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uvq) {
            uvq uvqVar = (uvq) obj;
            if (awrc.c(this.a, uvqVar.a) && awrc.c(this.b, uvqVar.b) && this.c == uvqVar.c && this.d == uvqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.aj(this.c)) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PlaybackControllerState(progress=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        sb.append(this.c);
        sb.append(", playbackState=");
        int i = this.d;
        if (i == 1) {
            str = "IDLE";
        } else if (i != 2) {
            str = i != 3 ? "ENDED" : "READY";
        } else {
            str = "BUFFERING";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public uvq() {
        this(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ uvq(byte[] bArr) {
        Duration duration = Duration.ZERO;
        duration.getClass();
        Duration duration2 = Duration.ZERO;
        duration2.getClass();
        this(duration, duration2, false, 1);
    }
}
