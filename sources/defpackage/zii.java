package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zii {
    public final boolean a;
    public final cdv b;
    public final cdv c;

    public zii(boolean z, cdv cdvVar, cdv cdvVar2) {
        this.a = z;
        this.b = cdvVar;
        this.c = cdvVar2;
    }

    public static long a(long j) {
        return ahbt.a(Duration.ofMillis(j));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zii) {
            zii ziiVar = (zii) obj;
            if (this.a == ziiVar.a && this.b.equals(ziiVar.b) && this.c.equals(ziiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        cdv cdvVar = this.c;
        return "SeekConfig{shouldUpdateSeekParamsForDtts=" + this.a + ", dttsForwardsParams=" + String.valueOf(this.b) + ", dttsBackwardsParams=" + String.valueOf(cdvVar) + '}';
    }

    public zii() {
        throw null;
    }
}
