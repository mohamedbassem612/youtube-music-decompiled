package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqw {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final long i;

    public /* synthetic */ tqw(byte[] bArr) {
        this.a = 1;
        this.c = -1;
        this.d = -1;
        this.b = 1;
        this.e = -1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqw)) {
            return false;
        }
        tqw tqwVar = (tqw) obj;
        int i = tqwVar.a;
        int i2 = tqwVar.c;
        int i3 = tqwVar.d;
        int i4 = tqwVar.b;
        int i5 = tqwVar.e;
        boolean z = tqwVar.f;
        boolean z2 = tqwVar.g;
        boolean z3 = tqwVar.h;
        long j = tqwVar.i;
        return true;
    }

    public final int hashCode() {
        return -77016982;
    }

    public final String toString() {
        return "StartupEdgeCaseData(startupPowerSaverStatus=0, startupPowerLevel=-1, startupDiskSpace=-1, startupThermalStatus=0, startupTooEarlyTime=-1, wasInBackground=false, wasScreenOff=false, isBrowseResponseFromDiskCache=false, androidEdgeCaseLoggingBitset=-1)";
    }

    public tqw() {
        this(null);
    }
}
