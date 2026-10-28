package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qfm implements qen {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public qfm(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }

    @Override // defpackage.qen
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qfm) {
            qfm qfmVar = (qfm) obj;
            int i = this.f;
            int i2 = qfmVar.f;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 && this.a == qfmVar.a && this.b == qfmVar.b && this.c == qfmVar.c && this.d == qfmVar.d) {
                if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(qfmVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        a.bj(this.f);
        double d = this.e;
        return ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d)));
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=" + qeo.a(this.f) + ", maxBufferSizeBytes=" + this.a + ", sampleDurationMs=" + this.b + ", sampleDurationSkewMs=" + this.c + ", sampleFrequencyMicro=" + this.d + ", samplesPerEpoch=" + this.e + '}';
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }

    public qfm() {
        throw null;
    }
}
