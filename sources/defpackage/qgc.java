package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qgc implements qen {
    public final String a;
    private final int b;

    public qgc(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }

    @Override // defpackage.qen
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return this.b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgc) {
            qgc qgcVar = (qgc) obj;
            int i = this.b;
            int i2 = qgcVar.b;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 && this.a.equals(qgcVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.bj(this.b);
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + qeo.a(this.b) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    public qgc() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
