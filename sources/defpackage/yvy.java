package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yvy {
    public final Float a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final String j;
    public final Float k;
    public final int l;

    public yvy(int i, Float f, Float f2, Float f3, Float f4, Float f5, float f6, float f7, float f8, boolean z, String str, Float f9) {
        if (i == 0) {
            throw null;
        }
        this.l = i;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = z;
        this.j = str;
        this.k = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yvy) {
            yvy yvyVar = (yvy) obj;
            if (this.l == yvyVar.l && awrc.c(this.a, yvyVar.a) && awrc.c(this.b, yvyVar.b) && awrc.c(this.c, yvyVar.c) && awrc.c(this.d, yvyVar.d) && awrc.c(this.e, yvyVar.e) && Float.compare(this.f, yvyVar.f) == 0 && Float.compare(this.g, yvyVar.g) == 0 && Float.compare(this.h, yvyVar.h) == 0 && this.i == yvyVar.i && awrc.c(this.j, yvyVar.j) && awrc.c(this.k, yvyVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        int i = this.l;
        Float f2 = this.b;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        int i2 = (i * 31) + iHashCode;
        Float f3 = this.c;
        int iHashCode3 = ((((i2 * 31) + iHashCode2) * 31) + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.d;
        int iHashCode4 = (iHashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.e;
        int iHashCode5 = (((((((((iHashCode4 + (f5 == null ? 0 : f5.hashCode())) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + a.aj(this.i)) * 31;
        String str = this.j;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Float f6 = this.k;
        return iHashCode6 + (f6 != null ? f6.hashCode() : 0);
    }

    public final String toString() {
        return "VolumeStats(normalizationMode=" + ((Object) zik.aG(this.l)) + ", targetLoudness=" + this.a + ", formatLoudness=" + this.b + ", loudnessForNormalization=" + this.c + ", relativeNormalizationGain=" + this.d + ", absoluteNormalizationGain=" + this.e + ", normalizationMultiplier=" + this.f + ", finalVolume=" + this.g + ", inputVolume=" + this.h + ", rootVideoPlayerResponseAvailable=" + this.i + ", rootVideoCpn=" + this.j + ", statefulNormalizationTarget=" + this.k + ')';
    }
}
