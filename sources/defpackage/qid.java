package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qid implements qen {
    public final agev a;
    public final agev b;
    private final int c;

    public qid(agev agevVar, agev agevVar2) {
        this.c = 1;
        this.a = agevVar;
        this.b = agevVar2;
    }

    @Override // defpackage.qen
    public final /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qid) {
            qid qidVar = (qid) obj;
            int i = this.c;
            int i2 = qidVar.c;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 && this.a.equals(qidVar.a) && this.b.equals(qidVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.bj(this.c);
        return 395873938;
    }

    public final String toString() {
        agev agevVar = this.b;
        return "StartupConfigurations{enablement=" + qeo.a(this.c) + ", metricExtensionProvider=" + String.valueOf(this.a) + ", customTimestampProvider=" + String.valueOf(agevVar) + '}';
    }

    public qid() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
