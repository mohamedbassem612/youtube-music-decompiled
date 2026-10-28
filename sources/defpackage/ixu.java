package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ixu extends iyb {
    private final adts a;
    private final long b;
    private final boolean c;

    private ixu(adts adtsVar, long j, boolean z) {
        this.a = adtsVar;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.iyb
    public final long a() {
        return this.b;
    }

    @Override // defpackage.iyb
    public final adts b() {
        return this.a;
    }

    @Override // defpackage.iyb
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iyb) {
            iyb iybVar = (iyb) obj;
            if (this.a.equals(iybVar.b()) && this.b == iybVar.a() && this.c == iybVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.c ? 1237 : 1231;
        long j = this.b;
        return (((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i;
    }

    public final String toString() {
        return "MusicLoadingEvent{loadingEvent=" + this.a.toString() + ", spinnerDelayMs=" + this.b + ", shouldCenterSpinner=" + this.c + '}';
    }

    public /* synthetic */ ixu(adts adtsVar, long j, boolean z, ixt ixtVar) {
        this(adtsVar, j, z);
    }
}
