package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aapf {
    public final boolean a;
    public final wgs b;
    public final wgs c;
    public final boolean d;
    public final boolean e;

    public aapf(boolean z, wgs wgsVar, wgs wgsVar2, boolean z2, boolean z3) {
        this.a = z;
        this.b = wgsVar;
        this.c = wgsVar2;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aapf) {
            aapf aapfVar = (aapf) obj;
            if (this.a == aapfVar.a && awrc.c(this.b, aapfVar.b) && awrc.c(this.c, aapfVar.c) && this.d == aapfVar.d && this.e == aapfVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        wgs wgsVar = this.b;
        int iHashCode = wgsVar == null ? 0 : wgsVar.hashCode();
        boolean z = this.a;
        wgs wgsVar2 = this.c;
        return (((((((a.aj(z) * 31) + iHashCode) * 31) + (wgsVar2 != null ? wgsVar2.hashCode() : 0)) * 31) + a.aj(this.d)) * 31) + a.aj(this.e);
    }

    public final String toString() {
        return "Result(isFullyAvailable=" + this.a + ", completeVideo=" + this.b + ", completeAudio=" + this.c + ", isVideoStreamOkay=" + this.d + ", isAudioStreamOkay=" + this.e + ')';
    }
}
