package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qgh implements qen {
    private final int a;

    public qgh(byte[] bArr) {
        this.a = 2;
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
        if (obj instanceof qgh) {
            int i = this.a;
            int i2 = ((qgh) obj).a;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.bj(i);
        return i ^ (-721379959);
    }

    public final String toString() {
        return "CuiConfigurations{metricExtensionProvider=null, enablement=" + qeo.a(this.a) + '}';
    }

    public qgh() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
