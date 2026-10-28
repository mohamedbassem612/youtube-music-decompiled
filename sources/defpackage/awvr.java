package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awvr implements Runnable, Comparable, awvk, axee {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public awvr(long j) {
        this.b = j;
    }

    @Override // defpackage.axee
    public final int b() {
        return this.a;
    }

    @Override // defpackage.axee
    public final axed c() {
        Object obj = this._heap;
        if (obj instanceof axed) {
            return (axed) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((awvr) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.axee
    public final void d(axed axedVar) {
        if (this._heap == awvu.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = axedVar;
    }

    @Override // defpackage.axee
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.awvk
    public final void kv() {
        synchronized (this) {
            Object obj = this._heap;
            if (obj != awvu.a) {
                awvs awvsVar = obj instanceof awvs ? (awvs) obj : null;
                if (awvsVar != null) {
                    synchronized (awvsVar) {
                        if (c() != null) {
                            int iB = b();
                            boolean z = awuv.a;
                            awvsVar.d(iB);
                        }
                    }
                }
                this._heap = awvu.a;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + ']';
    }
}
