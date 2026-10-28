package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qiq implements qen {
    public final float a;
    private final int b;
    private final agev c;
    private final int d;

    public qiq(int i, int i2, float f, agev agevVar) {
        this.d = i;
        this.b = i2;
        this.a = f;
        this.c = agevVar;
    }

    public static final qip d() {
        qip qipVar = new qip();
        qipVar.a = 10;
        qipVar.b = 1.0f;
        qipVar.d = (byte) 3;
        qipVar.c = agdf.a;
        qipVar.e = 1;
        return qipVar;
    }

    @Override // defpackage.qen
    public final int a() {
        return this.b;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qiq) {
            qiq qiqVar = (qiq) obj;
            int i = this.d;
            int i2 = qiqVar.d;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.b == qiqVar.b) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(qiqVar.a) && this.c.equals(qiqVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.bj(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + qeo.a(this.d) + ", rateLimitPerSecond=" + this.b + ", samplingProbability=" + this.a + ", perEventConfigurationFlags=" + String.valueOf(this.c) + '}';
    }

    public qiq() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
