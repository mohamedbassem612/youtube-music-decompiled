package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skj {
    public final Uri a;
    public final zya b;
    public final boolean c;
    public final long d;
    public final agke e;
    public final smr f;
    public final sko g;
    public final aixr h;
    public final int i;

    public skj(Uri uri, zya zyaVar, boolean z, long j, agke agkeVar, int i, smr smrVar, sko skoVar, aixr aixrVar) {
        this.a = uri;
        this.b = zyaVar;
        this.c = z;
        this.d = j;
        if (agkeVar == null) {
            throw new NullPointerException("Null substitutedMacros");
        }
        this.e = agkeVar;
        this.i = i;
        this.f = smrVar;
        this.g = skoVar;
        this.h = aixrVar;
    }

    public final boolean equals(Object obj) {
        smr smrVar;
        sko skoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof skj) {
            skj skjVar = (skj) obj;
            if (this.a.equals(skjVar.a) && this.b.equals(skjVar.b) && this.c == skjVar.c && this.d == skjVar.d && aguu.v(this.e, skjVar.e) && this.i == skjVar.i && ((smrVar = this.f) != null ? smrVar.equals(skjVar.f) : skjVar.f == null) && ((skoVar = this.g) != null ? skoVar.equals(skjVar.g) : skjVar.g == null) && this.h.equals(skjVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        boolean z = this.c;
        int iHashCode2 = this.e.hashCode();
        int i = true != z ? 1237 : 1231;
        long j = this.d;
        int i2 = (((((iHashCode * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ iHashCode2;
        smr smrVar = this.f;
        int iHashCode3 = ((((i2 * 1000003) ^ this.i) * 1000003) ^ (smrVar == null ? 0 : smrVar.hashCode())) * 1000003;
        sko skoVar = this.g;
        return ((iHashCode3 ^ (skoVar != null ? skoVar.hashCode() : 0)) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        int i = this.i;
        smr smrVar = this.f;
        return "FulfilledPing{getUri=" + this.a.toString() + ", getHeaderRestrictor=" + this.b.toString() + ", getDelayedSendAllowed=" + this.c + ", getExpirationTimeMillis=" + this.d + ", substitutedMacros=" + this.e.toString() + ", getAttributionSrcMode=" + Integer.toString(i - 1) + ", getSlot=" + String.valueOf(smrVar) + ", getLayout=" + String.valueOf(this.g) + ", getTriggerType=" + this.h.toString() + '}';
    }

    public skj() {
        throw null;
    }
}
