package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class vl {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    protected final int i;

    protected vl(vk vkVar) {
        this.i = vkVar.F;
        this.a = vkVar.G;
        this.b = vkVar.H;
        this.c = vkVar.I;
        this.d = vkVar.J;
    }

    public String toString() {
        return String.format("  enabledFeatures=%s,\n  javaLockAcquisitionLatencyMillis=%d,\n  lastBlockingOperation=%d,\n  lastBlockingOperationLatencyMillis=%d,\n  getVmLatencyMillis=%d,\n  unblockedAppSearchLatencyMillis=%d,\n  numIcingCalls=%d\n", "0", Integer.valueOf(this.i), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), 0, Integer.valueOf(this.d));
    }
}
