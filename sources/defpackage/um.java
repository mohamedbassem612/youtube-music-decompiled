package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class um extends vl {
    public final int a;
    public final int b;
    private final String c;
    private final String d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;

    public um(ul ulVar) {
        super(ulVar);
        this.c = ulVar.a;
        this.d = ulVar.b;
        this.a = ulVar.c;
        this.b = ulVar.d;
        this.e = ulVar.e;
        this.f = ulVar.f;
        this.g = ulVar.g;
        this.h = ulVar.h;
        this.j = ulVar.i;
        this.k = ulVar.j;
        this.l = ulVar.k;
        this.m = ulVar.l;
        this.n = ulVar.m;
        this.o = ulVar.n;
        this.p = ulVar.o;
        this.q = ulVar.p;
        this.r = ulVar.q;
        this.s = ulVar.r;
    }

    @Override // defpackage.vl
    public final String toString() {
        return String.format("PutDocumentStats {\n  packageName=%s,\n  database=%s,\n  statusCode=%d,\n  totalLatencyMillis=%d,\n  generateDocumentProtoLatencyMillis=%d,\n  rewriteDocumentTypesLatencyMillis=%d,\n  nativeLatencyMillis=%d,\n  nativeDocumentStoreLatencyMillis=%d,\n  nativeIndexLatencyMillis=%d,\n  nativeIndexMergeLatencyMillis=%d,\n  nativeDocumentSizeBytes=%d,\n  nativeNumTokensIndexed=%d,\n  nativeTermIndexLatencyMillis=%d,\n  nativeIntegerIndexLatencyMillis=%d,\n  nativeQualifiedIdJoinIndexLatencyMillis=%d,\n  nativeLiteIndexSortLatencyMillis=%d,\n  metadataTermIndexLatencyMillis=%d,\n  embeddingIndexLatencyMillis=%d,\n" + super.toString() + '}', this.c, this.d, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s));
    }
}
