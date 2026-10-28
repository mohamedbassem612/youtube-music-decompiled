package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhx implements qen {
    public final int a;
    public final qic b;
    public final agev c;
    private final agke d;
    private final int e;

    public qhx(int i, int i2, qic qicVar, agev agevVar, agke agkeVar) {
        this.e = i;
        this.a = i2;
        this.b = qicVar;
        this.c = agevVar;
        this.d = agkeVar;
    }

    public static final xlf d() {
        xlf xlfVar = new xlf((byte[]) null);
        xlfVar.b = (byte) (xlfVar.b | 2);
        xlfVar.e(50);
        xlfVar.d = agdf.a;
        xlfVar.a = 1;
        return xlfVar;
    }

    @Override // defpackage.qen
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return this.e == 3;
    }

    public final boolean equals(Object obj) {
        qic qicVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qhx) {
            qhx qhxVar = (qhx) obj;
            int i = this.e;
            int i2 = qhxVar.e;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == qhxVar.a && ((qicVar = this.b) != null ? qicVar.equals(qhxVar.b) : qhxVar.b == null) && this.c.equals(qhxVar.c) && aguu.v(this.d, qhxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        a.bj(i);
        qic qicVar = this.b;
        return ((((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ (qicVar == null ? 0 : qicVar.hashCode())) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.d;
        agev agevVar = this.c;
        return "NetworkConfigurations{enablement=" + qeo.a(this.e) + ", batchSize=" + this.a + ", urlSanitizer=" + String.valueOf(this.b) + ", enableUrlAutoSanitization=false, metricExtensionProvider=" + String.valueOf(agevVar) + ", customDomainAllowlist=" + String.valueOf(agkeVar) + '}';
    }

    public qhx() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
