package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class riq implements ccz {
    public boolean a = false;
    public long b = 0;
    public long c = -9223372036854775807L;
    private final cdp d;
    private final boolean e;

    public riq(cdp cdpVar, qys qysVar) {
        this.d = cdpVar;
        this.e = qysVar.c;
    }

    @Override // defpackage.ccz
    public final long a() {
        long j;
        if (this.a) {
            this.a = false;
            j = this.b + 1;
            this.b = j;
            if (this.e) {
                j = ((cav) this.d).f + 1;
            }
        } else if (this.e) {
            j = ((cav) this.d).f;
            if (j == Long.MIN_VALUE) {
                j = 922337203685477580L;
            }
        } else {
            j = this.b;
        }
        this.c = j;
        return j;
    }

    @Override // defpackage.ccz
    public final btb b() {
        return btb.a;
    }

    @Override // defpackage.ccz
    public final void gb(btb btbVar) {
        if (!btb.a.equals(btbVar)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.ccz
    public final /* synthetic */ boolean gc() {
        return false;
    }
}
