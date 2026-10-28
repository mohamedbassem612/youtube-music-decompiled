package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bwz implements bsw {
    public final float a;
    public final float b;
    public final float c;

    public bwz(float f, float f2, float f3) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        ahno.G(z, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bwz bwzVar = (bwz) obj;
            if (Float.compare(this.a, bwzVar.a) == 0 && Float.compare(this.b, bwzVar.b) == 0 && Float.compare(this.c, bwzVar.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.a) + 527) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        String str;
        float f = this.c;
        if (f != -3.4028235E38f) {
            str = ", altitude=" + f;
        } else {
            str = "";
        }
        float f2 = this.b;
        return "xyz: latitude=" + this.a + ", longitude=" + f2 + str;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
