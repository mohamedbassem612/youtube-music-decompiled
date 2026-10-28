package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qim implements qen {
    public final agev a;
    private final int b;

    public qim(int i, agev agevVar) {
        this.b = i;
        this.a = agevVar;
    }

    public static final qil d() {
        qil qilVar = new qil();
        qilVar.b = (byte) 1;
        qilVar.a = agdf.a;
        qilVar.c = 1;
        return qilVar;
    }

    @Override // defpackage.qen
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.qen
    public final boolean b() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qim) {
            qim qimVar = (qim) obj;
            int i = this.b;
            int i2 = qimVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a.equals(qimVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bj(i);
        return (((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + qeo.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    public qim() {
        throw null;
    }

    @Override // defpackage.qen
    public final void c() {
    }
}
