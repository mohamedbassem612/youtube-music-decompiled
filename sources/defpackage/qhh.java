package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhh implements qen {
    public final agev a;
    public final boolean b;
    private final int c;
    private final int d;

    public qhh(int i, int i2, agev agevVar, boolean z) {
        this.d = i;
        this.c = i2;
        this.a = agevVar;
        this.b = z;
    }

    public static qhg d() {
        qhg qhgVar = new qhg();
        qhgVar.a = 3;
        qhgVar.b = agdf.a;
        qhgVar.c = true;
        qhgVar.e = 1;
        qhgVar.d = (byte) 63;
        return qhgVar;
    }

    @Override // defpackage.qen
    public final int a() {
        return this.c;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return this.d != 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qhh) {
            qhh qhhVar = (qhh) obj;
            int i = this.d;
            int i2 = qhhVar.d;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.c == qhhVar.c && this.a.equals(qhhVar.a) && this.b == qhhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.bj(i);
        return ((((((((((((((i ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + qeo.a(this.d) + ", rateLimitPerSecond=" + this.c + ", metricExtensionProvider=" + String.valueOf(this.a) + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + this.b + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    public qhh() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
