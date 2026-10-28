package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qeq implements qen {
    private final boolean a;
    private final int b;
    private final qnl c;

    public qeq(int i, boolean z, qnl qnlVar) {
        this.b = i;
        this.a = z;
        this.c = qnlVar;
    }

    public static final son e() {
        son sonVar = new son();
        sonVar.b = new qnl();
        sonVar.a = 1;
        sonVar.f(false);
        return sonVar;
    }

    @Override // defpackage.qen
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qeq) {
            qeq qeqVar = (qeq) obj;
            int i = this.b;
            int i2 = qeqVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == qeqVar.a && this.c.equals(qeqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bj(i);
        return ((((i ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + qeo.a(this.b) + ", chargeCounterEnabled=" + this.a + ", metricExtensionProvider=" + String.valueOf(this.c) + '}';
    }

    public qeq() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
