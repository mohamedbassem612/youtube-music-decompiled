package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpu {
    public final boolean a;
    public final boolean b;

    public acpu(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acpu) {
            acpu acpuVar = (acpu) obj;
            if (this.a == acpuVar.a && this.b == acpuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.aj(this.a) * 31) + a.aj(this.b);
    }

    public final String toString() {
        return "AutoAdvanceState(isAutoAdvanceEnabled=" + this.a + ", shouldAutoAdvanceToNextVideo=" + this.b + ')';
    }

    public acpu() {
        this(false, true);
    }
}
