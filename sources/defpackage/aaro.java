package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaro {
    public final String a;
    public int b;
    public long c;
    public long d;
    public final aamb e;
    public aamb f;
    public final String g;
    public final int h;
    public int i;
    public aqpc j;
    public aqpe k;
    public final zwa l;
    public final boolean m;

    public aaro(String str, String str2, int i, aamb aambVar, int i2) {
        this.j = aqpc.TRANSFER_STATE_UNKNOWN;
        int i3 = typ.a;
        ahno.G(!ahno.aa(str2), "transferId may not be empty");
        this.a = str2;
        this.e = aambVar;
        this.j = aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = new aamv();
        this.g = str;
        this.h = i;
        this.i = i2;
        this.l = zvz.a;
        this.m = false;
    }

    public final aamw a() {
        return new aamw(this.a, this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.m, this.l);
    }

    public final boolean b() {
        return this.j == aqpc.TRANSFER_STATE_PAUSED_BY_USER;
    }

    public final boolean c() {
        return this.j == aqpc.TRANSFER_STATE_TRANSFERRING;
    }

    public final boolean d() {
        return c() || this.j == aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }

    public aaro(zwa zwaVar, String str, aamb aambVar, int i, aqpc aqpcVar, aqpe aqpeVar) {
        this.j = aqpc.TRANSFER_STATE_UNKNOWN;
        this.a = str;
        this.e = aambVar;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = aambVar;
        this.g = zwaVar.i();
        this.h = 0;
        this.i = i;
        this.l = zwaVar;
        this.m = true;
        this.j = aqpcVar;
        this.k = aqpeVar;
    }
}
