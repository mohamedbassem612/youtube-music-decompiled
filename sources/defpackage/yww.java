package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yww extends yvs {
    public final String j;
    private volatile long k;

    /* JADX WARN: Illegal instructions before constructor call */
    public yww(String str, String str2, String str3, long j, long j2, long j3, String str4) {
        int i = 2;
        if (!"event_start".equalsIgnoreCase(str3) && !"event_predict_start".equalsIgnoreCase(str3)) {
            i = "event_stop".equalsIgnoreCase(str3) ? 4 : "event_continue".equalsIgnoreCase(str3) ? 3 : -1;
        }
        super(str, i, j2, j3, str4, "event_predict_start".equalsIgnoreCase(str3), -1L, null, null);
        this.j = str2;
        this.k = j;
    }

    public static yww c(long j, ywx ywxVar) {
        String strD = ywxVar.d("Cuepoint-Identifier");
        String strD2 = ywxVar.d("Cuepoint-Type");
        String strD3 = ywxVar.d("Cuepoint-Event");
        Double dA = ywxVar.a("Cuepoint-Playhead-Time-Sec");
        Double dA2 = ywxVar.a("Cuepoint-Total-Duration-Sec");
        String strD4 = ywxVar.d("Cuepoint-Context");
        if (strD3 == null || dA == null || dA2 == null) {
            return null;
        }
        if (strD == null) {
            strD = "";
        }
        String str = strD2 == null ? "" : strD2;
        double dDoubleValue = dA.doubleValue() * 1000.0d;
        return new yww(strD, str, strD3, j, (long) dDoubleValue, (long) (dA2.doubleValue() * 1000.0d), strD4);
    }

    @Override // defpackage.yvs
    public final long a() {
        if (this.k == -1) {
            return -1L;
        }
        long j = this.c;
        if (j != -1) {
            return this.k - j;
        }
        return -1L;
    }

    public final String toString() {
        return "CuePoint identifier=\"" + this.a + "\", type=\"" + this.j + "\", event=\"" + this.b + "\", breakStartTimeMs=" + a() + ", durationMs=" + this.d + ", cueTimeMs=" + this.k + ", timeOffsetMs=" + this.c + ", context=" + this.e;
    }
}
