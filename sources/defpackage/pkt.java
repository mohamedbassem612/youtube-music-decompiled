package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pkt {
    public Object a;
    private long b;
    private byte c;

    public final plb a() {
        if (this.c != 1) {
            throw new IllegalStateException("Missing required properties: startTime");
        }
        return new plb((Long) this.a, this.b);
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }

    public final hsa c() {
        Object obj;
        if (this.c == 1 && (obj = this.a) != null) {
            return new hsa((agkj) obj, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" results");
        }
        if (this.c == 0) {
            sb.append(" nextPlaylistAutoSyncIntervalSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(long j) {
        this.b = j;
        this.c = (byte) 1;
    }

    public final void e(agkj agkjVar) {
        if (agkjVar == null) {
            throw new NullPointerException("Null results");
        }
        this.a = agkjVar;
    }
}
