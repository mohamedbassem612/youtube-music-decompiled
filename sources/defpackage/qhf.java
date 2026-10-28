package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qhf implements qen {
    private final long a;
    private final agkz b;
    private final int c;

    public qhf(int i, long j, agkz agkzVar) {
        this.c = 2;
        this.a = j;
        this.b = agkzVar;
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
        if (obj instanceof qhf) {
            qhf qhfVar = (qhf) obj;
            int i = this.c;
            int i2 = qhfVar.c;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == qhfVar.a && this.b.equals(qhfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bj(i);
        int i2 = ((agpr) this.b).c;
        long j = this.a;
        return ((((i ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i2;
    }

    public final String toString() {
        return "DebugMemoryConfigurations{enablement=" + qeo.a(this.c) + ", debugMemoryServiceThrottleMs=" + this.a + ", debugMemoryEventsToSample=" + String.valueOf(this.b) + '}';
    }

    public qhf() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
