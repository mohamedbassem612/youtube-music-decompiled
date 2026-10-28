package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfq implements qen {
    public final float a;
    public final int b;
    public final agev c;
    private final int d;

    public qfq(int i, float f, int i2, agev agevVar) {
        this.d = i;
        this.a = f;
        this.b = i2;
        this.c = agevVar;
    }

    public static final qfp d() {
        qfp qfpVar = new qfp();
        qfpVar.b(100.0f);
        qfpVar.c = 1;
        qfpVar.a = 100;
        qfpVar.b = (byte) (qfpVar.b | 2);
        return qfpVar;
    }

    @Override // defpackage.qen
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.qen
    public final boolean b() {
        int i = this.d;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qfq) {
            qfq qfqVar = (qfq) obj;
            int i = this.d;
            int i2 = qfqVar.d;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(qfqVar.a) && this.b == qfqVar.b && this.c.equals(qfqVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.bj(i);
        return ((((((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ this.b) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + qeo.a(this.d) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=null, crashLoopListener=" + String.valueOf(this.c) + '}';
    }

    public qfq() {
        throw null;
    }

    @Override // defpackage.qen
    public final void c() {
    }
}
