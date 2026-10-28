package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ypi {
    final int a;
    final long b;
    long d;
    long f;
    long g;
    long h;
    String l;
    final StringBuilder c = new StringBuilder();
    long e = -1;
    yus i = yus.a;
    long j = -1;
    long k = -1;

    public ypi(int i, long j) {
        this.a = i;
        this.b = j;
        this.f = j;
    }

    public final String toString() {
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        yus yusVar = this.i;
        long j5 = yusVar.b;
        int i = yusVar.c;
        StringBuilder sb = this.c;
        return "RequestInfo requestNumber=" + this.a + " startTimeMs=" + this.b + " lengthBytes=" + j + " lastRecordedTime=" + j2 + " lastRecordedDataKbytes=" + j3 + " accumulatedBytes=" + j4 + " startBandwidthEstimateWithSource=(" + j5 + ", " + i + ") durationMs=" + this.j + " connectTimeMs=" + this.k + " errorCode=" + this.l + " encodedReadData=" + sb.toString() + " mediaDurationMs=" + this.d;
    }
}
