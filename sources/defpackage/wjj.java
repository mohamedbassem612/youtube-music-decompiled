package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wjj {
    public final boolean a;
    private final aosh b;

    public wjj(aosh aoshVar, boolean z) {
        aoshVar.getClass();
        this.b = aoshVar;
        this.a = z;
    }

    public final long a() {
        return this.b.c;
    }

    public final long b() {
        aosg aosgVar = this.b.d;
        if (aosgVar == null) {
            aosgVar = aosg.a;
        }
        return aosgVar.d;
    }

    public final long c() {
        aosg aosgVar = this.b.d;
        if (aosgVar == null) {
            aosgVar = aosg.a;
        }
        return aosgVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wjj) {
            wjj wjjVar = (wjj) obj;
            if (awrc.c(this.b, wjjVar.b) && this.a == wjjVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + a.aj(this.a);
    }

    public final String toString() {
        return "TimeBasedScheduleInfoModel(timeBasedScheduleInfo=" + this.b + ", removeOnFinish=" + this.a + ')';
    }
}
