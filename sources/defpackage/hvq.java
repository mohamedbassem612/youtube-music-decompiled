package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hvq {
    public final int a;
    public final int b;

    public hvq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hvq) {
            hvq hvqVar = (hvq) obj;
            if (this.a == hvqVar.a && this.b == hvqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "AudioBitrateQuality{audioQualityMin=" + this.a + ", audioQualityMax=" + this.b + '}';
    }

    public hvq() {
        throw null;
    }
}
