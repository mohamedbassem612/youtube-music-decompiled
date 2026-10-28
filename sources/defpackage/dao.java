package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dao implements dau {
    public final long a;
    public final long b;
    public final dax c;
    public long d;
    private final dat e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public dao(dax daxVar, long j, long j2, long j3, long j4, boolean z) {
        ahno.F(j >= 0 && j2 > j);
        this.c = daxVar;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.d = j4;
            this.f = 4;
        } else {
            this.f = 0;
        }
        this.e = new dat();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00cf -> B:48:0x00e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.dau
    public final long a(defpackage.cvj r29) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dao.a(cvj):long");
    }

    @Override // defpackage.dau
    public final /* bridge */ /* synthetic */ cvz b() {
        if (this.d != 0) {
            return new dan(this);
        }
        return null;
    }

    @Override // defpackage.dau
    public final void c(long j) {
        this.h = bwp.t(j, 0L, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }
}
