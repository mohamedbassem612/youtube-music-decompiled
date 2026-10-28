package defpackage;

import j$.util.DesugarCollections;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uo extends vl {
    private final int A;
    private final int B;
    private final int C;
    private final us D;
    private final long E;
    private final long F;
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final us e;
    final int f;
    final int g;
    final Set h;
    private final String j;
    private final String k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public uo(un unVar) {
        super(unVar);
        this.j = unVar.a;
        this.k = unVar.b;
        this.a = unVar.c;
        this.b = unVar.d;
        this.l = unVar.e;
        this.m = unVar.f;
        this.n = unVar.g;
        this.c = unVar.h;
        this.o = unVar.i;
        this.p = unVar.j;
        this.d = unVar.k;
        this.q = unVar.l;
        this.r = unVar.m;
        this.s = unVar.n;
        this.t = unVar.o;
        this.u = unVar.p;
        this.v = unVar.q;
        this.w = unVar.r;
        this.x = unVar.s;
        this.y = unVar.t;
        this.z = unVar.u;
        this.A = unVar.v;
        this.B = unVar.w;
        this.C = unVar.x;
        this.e = unVar.y;
        this.D = unVar.z;
        this.E = unVar.A;
        this.F = unVar.B;
        this.f = unVar.C;
        this.g = unVar.D;
        this.h = DesugarCollections.unmodifiableSet(unVar.E);
    }

    @Override // defpackage.vl
    public final String toString() {
        return String.format(Locale.ROOT, "QueryStats {\n  packageName=%s,\n  database=%s,\n  statusCode=%d,\n  totalLatencyMillis=%d,\n  rewriteSearchSpecLatencyMillis=%d,\n  rewriteSearchResultLatencyMillis=%d,\n  aclCheckLatencyMillis=%d,\n  visibilityScope=%d,\n  searchSourceLogTag=%s,\n  nativeIsFirstPage=%b,\n  additionalPageCount=%d,\n  nativeRequestedPageSize=%d,\n  nativeNumResultsReturnedCurrentPage=%d,\n  numResultsReturnedAdditionalPages=%d,\n  nativeLatencyMillis=%d,\n  firstNativeCallLatencyMillis=%d,\n  additionalPageRetrievalLatencyMillis=%d,\n  nativeRankingLatencyMillis=%d,\n  nativeDocumentRetrievingLatencyMillis=%d,\n  nativeNumResultsWithSnippets=%d,\n  nativeLockAcquisitionLatencyMillis=%d,\n  javaToNativeJniLatencyMillis=%d,\n  nativeToJavaJniLatencyMillis=%d,\n  nativeJoinLatencyMillis=%d,\n  nativeNumJoinedResultsCurrentPage=%d,\n  joinType=%d,\n  parentSearchStats=%s,\n  childSearchStats=%s,\n  liteIndexHitBufferByteSize=%d,\n  liteIndexHitBufferUnsortedByteSize=%d,\n  pageTokenType=%d,\n  numResultStatesEvicted=%d,\n  resultSchemas=%s,\n" + super.toString() + '}', this.j, this.k, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.l), Integer.valueOf(this.m), 0, Integer.valueOf(this.n), null, Boolean.valueOf(this.c), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.d), Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s), Integer.valueOf(this.t), Integer.valueOf(this.u), Integer.valueOf(this.v), Integer.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.C), String.valueOf(this.e).replace("\n", "\n  "), String.valueOf(this.D).replace("\n", "\n  "), Long.valueOf(this.E), Long.valueOf(this.F), Integer.valueOf(this.f), Integer.valueOf(this.g), this.h);
    }
}
