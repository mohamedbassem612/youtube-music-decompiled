package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uq extends vl {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final String f;
    private final int g;
    private final int h;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;

    public uq(up upVar) {
        super(upVar);
        this.e = upVar.a;
        this.f = upVar.b;
        this.a = upVar.c;
        this.b = upVar.d;
        this.g = upVar.e;
        this.c = upVar.f;
        this.d = upVar.g;
        this.h = upVar.h;
        this.j = upVar.i;
        this.k = upVar.j;
        this.l = upVar.k;
        this.m = upVar.l;
        this.n = upVar.m;
    }

    @Override // defpackage.vl
    public final String toString() {
        return String.format("RemoveStats {\n  packageName=%s,\n  database=%s,\n  statusCode=%d,\n  totalLatencyMillis=%d,\n  nativeLatencyMillis=%d,\n  nativeDeleteType=%d,\n  nativeNumDocumentsDeleted=%d,\n  queryLength=%d,\n  numTerms=%d,\n  numNamespacesFiltered=%d,\n  numSchemaTypesFiltered=%d,\n  parseQueryLatencyMillis=%d,\n  documentRemovalLatencyMillis=%d,\n" + super.toString() + '}', this.e, this.f, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.g), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.h), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n));
    }
}
