package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class us {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final long s;
    private final int t;

    public us(ur urVar) {
        this.a = urVar.a;
        this.b = urVar.b;
        this.c = urVar.c;
        this.d = urVar.d;
        this.e = urVar.e;
        this.f = urVar.f;
        this.g = urVar.g;
        this.h = urVar.h;
        this.i = urVar.i;
        this.j = urVar.j;
        this.k = urVar.k;
        this.l = urVar.l;
        this.m = urVar.m;
        this.n = urVar.n;
        this.o = urVar.o;
        this.p = urVar.p;
        this.q = urVar.q;
        this.r = urVar.r;
        this.s = urVar.s;
        this.t = urVar.t;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "SearchStats {\n  nativeQueryLength=%d,\n  nativeNumTerms=%d,\n  nativeNumNamespacesFiltered=%d,\n  nativeNumSchemaTypesFiltered=%d,\n  nativeRankingStrategy=%d,\n  nativeNumDocumentsScored=%d,\n  nativeParseQueryLatencyMillis=%d,\n  nativeScoringLatencyMillis=%d,\n  nativeIsNumericQuery=%b,\n  nativeNumFetchedHitsLiteIndex=%d,\n  nativeNumFetchedHitsMainIndex=%d,\n  nativeNumFetchedHitsIntegerIndex=%d,\n  nativeQueryProcessorLexerExtractTokenLatencyMillis=%d,\n  nativeQueryProcessorParserConsumeQueryLatencyMillis=%d,\n  nativeQueryProcessorQueryVisitorLatencyMillis=%d\n  nativeNumUnquantizedEmbeddingsScored=%d\n  nativeNumQuantizedEmbeddingsScored=%d\n  nativeNumEmbeddingShardsRead=%d\n  nativeNumEmbeddingBytesRead=%d\n  nativeNumAnnEmbeddingsScored=%d\n}", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), Long.valueOf(this.s), Integer.valueOf(this.t));
    }
}
