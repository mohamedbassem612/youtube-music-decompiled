package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tcd {
    protected long e = -1;

    public void c() {
        throw null;
    }

    public final long d() {
        long j = this.e;
        if (j != -1) {
            return j;
        }
        throw new agfz("TimestampedEvent not yet posted");
    }

    protected void e(long j) {
        if (this.e != -1) {
            throw new agfz("This instance is already timestamped");
        }
        if (j < 0) {
            throw new IllegalStateException();
        }
        this.e = j;
    }

    public final boolean f() {
        return this.e != -1;
    }
}
