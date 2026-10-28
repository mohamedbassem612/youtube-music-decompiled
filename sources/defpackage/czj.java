package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class czj implements bsw {
    public final float a;
    public final czi b;
    public final czi c;

    public czj(float f, czi cziVar, czi cziVar2) {
        this.a = f;
        this.b = cziVar;
        this.c = cziVar2;
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
        if (!(obj instanceof czj)) {
            return false;
        }
        czj czjVar = (czj) obj;
        return Float.compare(this.a, czjVar.a) == 0 && Objects.equals(this.b, czjVar.b) && Objects.equals(this.c, czjVar.c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        czi cziVar = this.b;
        int iHashCode = (iFloatToIntBits + (cziVar != null ? cziVar.hashCode() : 0)) * 31;
        czi cziVar2 = this.c;
        return iHashCode + (cziVar2 != null ? cziVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + String.valueOf(this.b) + ", field 2=" + String.valueOf(this.c);
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
