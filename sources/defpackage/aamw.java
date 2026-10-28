package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aamw {
    public final String a;
    public final aqpc b;
    public final int c;
    public final long d;
    public final long e;
    public final aamb f;
    public final aamb g;
    public final String h;
    public final boolean i;
    public final zwa j;

    public aamw(String str, aqpc aqpcVar, int i, long j, long j2, aamb aambVar, aamb aambVar2, String str2, boolean z, zwa zwaVar) {
        typ.f(str);
        this.a = str;
        aqpcVar.getClass();
        this.b = aqpcVar;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = aambVar;
        aambVar2.getClass();
        this.g = aambVar2;
        this.h = str2;
        this.i = z;
        this.j = zwaVar;
    }

    public final int a() {
        long j = this.e;
        return (int) (j != 0 ? (this.d * 100) / j : 0L);
    }

    public final boolean b() {
        return this.b == aqpc.TRANSFER_STATE_TRANSFERRING;
    }

    public final boolean c() {
        return b() || this.b == aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }

    public final boolean d() {
        aqpc aqpcVar = this.b;
        return aqpcVar == aqpc.TRANSFER_STATE_COMPLETE || aqpcVar == aqpc.TRANSFER_STATE_FAILED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aamw) {
            return this.a.equals(((aamw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "{transferId=" + this.a + '}';
    }
}
