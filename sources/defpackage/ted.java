package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ted {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ted(long j, int i, int i2, int i3, int i4) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ted) {
            ted tedVar = (ted) obj;
            if (this.a == tedVar.a && this.b == tedVar.b && this.c == tedVar.c && this.d == tedVar.d && this.e == tedVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((a.ak(this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "ProcfsPollingConfig(procfsPollingIntervalMs=" + this.a + ", procfsMemoryThresholdMb=" + this.b + ", availableMemoryThresholdMb=" + this.c + ", minThresholdMb=" + this.d + ", maxThresholdMb=" + this.e + ')';
    }
}
