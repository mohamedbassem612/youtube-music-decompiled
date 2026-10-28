package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnp {
    public static final abnp a = a().a();
    public final xir b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final zkj g;
    public final Optional h;
    public final Optional i;
    public final int j;
    public final Optional k;
    public final abxz l;
    public final boolean m;
    public final jrj n;

    public abnp(xir xirVar, boolean z, int i, int i2, boolean z2, zkj zkjVar, Optional optional, Optional optional2, int i3, Optional optional3, abxz abxzVar, boolean z3, jrj jrjVar) {
        this.b = xirVar;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.g = zkjVar;
        this.h = optional;
        this.i = optional2;
        this.j = i3;
        this.k = optional3;
        this.l = abxzVar;
        this.m = z3;
        this.n = jrjVar;
    }

    public static abno a() {
        abno abnoVar = new abno(null);
        abnoVar.i(false);
        abnoVar.c(false);
        abnoVar.l(-1);
        abnoVar.k(-1);
        abnoVar.h(false);
        abnoVar.b(jrj.AUDIO_ROUTE_UNSPECIFIED);
        abnoVar.m();
        abnoVar.f(-1);
        abnoVar.g(abxz.a);
        return abnoVar;
    }

    public static abno b(abnp abnpVar) {
        abno abnoVar = new abno(null);
        abnoVar.a = abnpVar.b;
        abnoVar.i(abnpVar.c);
        abnoVar.l(abnpVar.d);
        abnoVar.k(abnpVar.e);
        abnoVar.h(abnpVar.f);
        abnoVar.b(abnpVar.n);
        abnoVar.m();
        abnoVar.f(abnpVar.j);
        abnoVar.g(abnpVar.l);
        abnoVar.c(abnpVar.m);
        zkj zkjVar = abnpVar.g;
        if (zkjVar != null) {
            abnoVar.b = zkjVar;
        }
        Optional optional = abnpVar.h;
        if (optional.isPresent()) {
            abnoVar.d((arfb) optional.get());
        }
        Optional optional2 = abnpVar.i;
        if (optional2.isPresent()) {
            abnoVar.e(((Integer) optional2.get()).intValue());
        }
        Optional optional3 = abnpVar.k;
        if (optional3.isPresent()) {
            abnoVar.j((zgp) optional3.get());
        }
        return abnoVar;
    }

    public final boolean equals(Object obj) {
        zkj zkjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof abnp) {
            abnp abnpVar = (abnp) obj;
            xir xirVar = this.b;
            if (xirVar != null ? xirVar.equals(abnpVar.b) : abnpVar.b == null) {
                if (this.c == abnpVar.c && this.d == abnpVar.d && this.e == abnpVar.e && this.f == abnpVar.f && ((zkjVar = this.g) != null ? zkjVar.equals(abnpVar.g) : abnpVar.g == null) && this.h.equals(abnpVar.h) && this.i.equals(abnpVar.i) && this.j == abnpVar.j && this.k.equals(abnpVar.k) && this.l.equals(abnpVar.l) && this.m == abnpVar.m && this.n.equals(abnpVar.n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xir xirVar = this.b;
        int iHashCode = xirVar == null ? 0 : xirVar.hashCode();
        int i = true != this.c ? 1237 : 1231;
        int i2 = iHashCode ^ 1000003;
        int i3 = ((((((((((i2 * 1000003) ^ i) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        zkj zkjVar = this.g;
        return ((((((((((((((i3 ^ (zkjVar != null ? zkjVar.hashCode() : 0)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ this.n.hashCode();
    }

    public final String toString() {
        jrj jrjVar = this.n;
        abxz abxzVar = this.l;
        Optional optional = this.k;
        Optional optional2 = this.i;
        Optional optional3 = this.h;
        zkj zkjVar = this.g;
        return "PlaybackStartParameters{latencyActionLogger=" + String.valueOf(this.b) + ", shouldUseQueuedVideoForNavigation=" + this.c + ", watchNextResponseProcessingDelay=" + this.d + ", watchNextResponseParsingDelay=" + this.e + ", shouldPauseOnLastFrame=" + this.f + ", mediaSessionDisabled=false, expectedViewport=" + String.valueOf(zkjVar) + ", initialPlaybackVideoQuality=" + String.valueOf(optional3) + ", initialPlaybackVideoQualityFixedResolution=" + String.valueOf(optional2) + ", loopState=" + this.j + ", transitionEffect=" + String.valueOf(optional) + ", playbackStartSettingsParameters=" + String.valueOf(abxzVar) + ", autoAdvance=" + this.m + ", audioRoute=" + String.valueOf(jrjVar) + '}';
    }

    public abnp() {
        throw null;
    }
}
