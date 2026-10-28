package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qgv implements qen {
    public final boolean a;
    private final int b;
    private final int c;

    public qgv(int i, int i2, boolean z) {
        this.c = i;
        this.b = i2;
        this.a = z;
    }

    public static final qgu d() {
        qgu qguVar = new qgu();
        qguVar.a = 10;
        qguVar.b = (byte) (qguVar.b | 1);
        qguVar.c = 1;
        qguVar.b(false);
        return qguVar;
    }

    @Override // defpackage.qen
    public final int a() {
        return this.b;
    }

    @Override // defpackage.qen
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qgv) {
            qgv qgvVar = (qgv) obj;
            int i = this.c;
            int i2 = qgvVar.c;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.b == qgvVar.b && this.a == qgvVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bj(i);
        return ((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + qeo.a(this.c) + ", rateLimitPerSecond=" + this.b + ", perfettoMustBeExplicitlyTriggered=" + this.a + '}';
    }

    public qgv() {
        throw null;
    }

    @Override // defpackage.qen
    public final /* synthetic */ void c() {
    }
}
