package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qis implements qen {
    private final int a;
    private final int b;
    private final nrj c;

    public qis(int i, int i2, nrj nrjVar) {
        this.b = i;
        this.a = i2;
        this.c = nrjVar;
    }

    public static final vzq d() {
        vzq vzqVar = new vzq(null);
        vzqVar.b = 10;
        byte b = vzqVar.c;
        vzqVar.c = (byte) (b | 3);
        vzqVar.d = new nrj();
        vzqVar.a = 1;
        vzqVar.c = (byte) (b | 7);
        return vzqVar;
    }

    @Override // defpackage.qen
    public final int a() {
        return this.a;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qis) {
            qis qisVar = (qis) obj;
            int i = this.b;
            int i2 = qisVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == qisVar.a && this.c.equals(qisVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bj(i);
        return ((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + qeo.a(this.b) + ", rateLimitPerSecond=" + this.a + ", dynamicSampler=" + String.valueOf(this.c) + ", recordTimerDuration=false, sendEmptyTraces=false}";
    }

    public qis() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
