package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uk extends vl {
    private final List A;
    private final long B;
    private final boolean C;
    private final int D;
    private final int E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
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
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final luv x;
    private final List y;
    private final List z;

    public uk(uj ujVar) {
        super(ujVar);
        this.a = ujVar.a;
        this.b = ujVar.b;
        this.g = ujVar.c;
        this.h = ujVar.d;
        this.j = ujVar.e;
        this.c = ujVar.f;
        this.d = ujVar.g;
        this.k = ujVar.h;
        this.l = ujVar.i;
        this.m = ujVar.j;
        this.n = ujVar.k;
        this.e = ujVar.l;
        this.f = ujVar.m;
        this.o = ujVar.n;
        this.p = ujVar.o;
        this.q = ujVar.p;
        this.r = ujVar.q;
        this.s = ujVar.r;
        this.t = ujVar.s;
        this.u = ujVar.t;
        this.E = ujVar.E;
        this.v = ujVar.u;
        this.w = ujVar.v;
        this.x = ujVar.w;
        this.y = ujVar.x;
        this.z = ujVar.y;
        this.A = ujVar.z;
        this.B = ujVar.A;
        this.C = ujVar.B;
        this.D = ujVar.C;
    }

    @Override // defpackage.vl
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InitializeStats {\n");
        sb.append(String.format("  statusCode=%d,\n", Integer.valueOf(this.a)));
        sb.append(String.format("  totalLatencyMillis=%d,\n", Integer.valueOf(this.b)));
        sb.append(String.format("  hasDeSync=%b,\n", Boolean.FALSE));
        sb.append(String.format("  prepareSchemaAndNamespacesLatencyMillis=%d,\n", Integer.valueOf(this.g)));
        sb.append(String.format("  prepareVisibilityStoreLatencyMillis=%d,\n", Integer.valueOf(this.h)));
        sb.append(String.format("  nativeLatencyMillis=%d,\n", Integer.valueOf(this.j)));
        sb.append(String.format("  nativeDocumentStoreRecoveryCause=%d,\n", Integer.valueOf(this.c)));
        sb.append(String.format("  nativeIndexRestorationCause=%d,\n", Integer.valueOf(this.d)));
        sb.append(String.format("  nativeSchemaStoreRecoveryCause=%d,\n", Integer.valueOf(this.k)));
        sb.append(String.format("  nativeDocumentStoreRecoveryLatencyMillis=%d,\n", Integer.valueOf(this.l)));
        sb.append(String.format("  nativeIndexRestorationLatencyMillis=%d,\n", Integer.valueOf(this.m)));
        sb.append(String.format("  nativeSchemaStoreRecoveryLatencyMillis=%d,\n", Integer.valueOf(this.n)));
        sb.append(String.format("  nativeDocumentStoreDataStatus=%d,\n", Integer.valueOf(this.e)));
        sb.append(String.format("  nativeNumDocuments=%d,\n", Integer.valueOf(this.f)));
        sb.append(String.format("  nativeNumSchemaTypes=%d,\n", Integer.valueOf(this.o)));
        sb.append(String.format("  nativeNumPreviousInitFailures=%d,\n", Integer.valueOf(this.p)));
        sb.append(String.format("  nativeIntegerIndexRestorationCause=%d,\n", Integer.valueOf(this.q)));
        sb.append(String.format("  nativeQualifiedIdJoinIndexRestorationCause=%d,\n", Integer.valueOf(this.r)));
        sb.append(String.format("  nativeEmbeddingIndexRestorationCause=%d,\n", Integer.valueOf(this.s)));
        sb.append(String.format("  nativeInitializeIcuDataStatusCode=%d,\n", Integer.valueOf(this.t)));
        sb.append(String.format("  nativeNumFailedReindexedDocuments=%d,\n", Integer.valueOf(this.u)));
        int i = this.E;
        switch (i) {
            case 1:
                str = "NONE";
                break;
            case 2:
                str = "OPTIONS_VALIDATION";
                break;
            case 3:
                str = "BASE_DIRECTORY_CREATION";
                break;
            case 4:
                str = "INIT_MARKER_FILE";
                break;
            case 5:
                str = "READ_VERSION_FILE";
                break;
            case 6:
                str = "MIGRATE_SCHEMA";
                break;
            case 7:
                str = "DISCARD_DERIVED_FILES";
                break;
            case 8:
                str = "WRITE_VERSION_FILE";
                break;
            case 9:
                str = "SCHEMA_STORE_DIRECTORY_CREATION";
                break;
            case 10:
                str = "SCHEMA_STORE_INSTANTIATION";
                break;
            case 11:
                str = "LANGUAGE_SEGMENTER_CREATION";
                break;
            case 12:
                str = "NORMALIZER_CREATION";
                break;
            case 13:
                str = "DISCARD_COMPONENTS";
                break;
            case 14:
                str = "BLOB_STORE_INSTANTIATION";
                break;
            case 15:
                str = "DOCUMENT_STORE_DIRECTORY_CREATION";
                break;
            case 16:
                str = "DOCUMENT_STORE_INSTANTIATION";
                break;
            case 17:
                str = "TERM_INDEX_DIRECTORY";
                break;
            case 18:
                str = "TERM_INDEX_INSTANTIATION";
                break;
            case 19:
                str = "INTEGER_INDEX_DIRECTORY";
                break;
            case 20:
                str = "INTEGER_INDEX_INSTANTIATION";
                break;
            case 21:
                str = "QUALIFIED_ID_JOIN_INDEX_DIRECTORY";
                break;
            case 22:
                str = "QUALIFIED_ID_JOIN_INDEX_INSTANTIATION";
                break;
            case 23:
                str = "EMBEDDING_INDEX_DIRECTORY";
                break;
            case 24:
                str = "EMBEDDING_INDEX_INSTANTIATION";
                break;
            case 25:
                str = "RESTORE_INDEX";
                break;
            default:
                str = "null";
                break;
        }
        if (i == 0) {
            throw null;
        }
        sb.append(String.format("  nativeFailureStage=%s,\n", str));
        sb.append(String.format("  nativeIcuSegmenterCreationStatusCode=%d,\n", Integer.valueOf(this.v)));
        sb.append(String.format("  nativeIcuNormalizerCreationStatusCode=%d,\n", Integer.valueOf(this.w)));
        sb.append(String.format("  nativeLastPersistType=%s,\n", this.x.name()));
        sb.append(String.format("  nativeSchemaProtoByteSize=%d,\n", Long.valueOf(this.B)));
        sb.append(String.format("  hasReset=%b,\n", Boolean.valueOf(this.C)));
        sb.append(String.format("  resetStatusCode=%d,\n", Integer.valueOf(this.D)));
        sb.append("  nativeAfterLastPersistFullCallTypes=[\n");
        int i2 = 0;
        while (true) {
            List list = this.y;
            if (i2 < list.size()) {
                sb.append(String.format("    %s,\n", ((lue) list.get(i2)).name()));
                i2++;
            } else {
                sb.append("  ],\n  nativeAfterLastPersistRecoveryProofCallTypes=[\n");
                int i3 = 0;
                while (true) {
                    List list2 = this.z;
                    if (i3 < list2.size()) {
                        sb.append(String.format("    %s,\n", ((lue) list2.get(i3)).name()));
                        i3++;
                    } else {
                        sb.append("  ],\n  nativeAfterLastPersistLiteCallTypes=[\n");
                        int i4 = 0;
                        while (true) {
                            List list3 = this.A;
                            if (i4 >= list3.size()) {
                                sb.append("  ],\n");
                                sb.append(super.toString());
                                sb.append('}');
                                return sb.toString();
                            }
                            sb.append(String.format("    %s,\n", ((lue) list3.get(i4)).name()));
                            i4++;
                        }
                    }
                }
            }
        }
    }
}
