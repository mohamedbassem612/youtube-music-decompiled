package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class si {
    public final vg a;

    public si(vg vgVar) {
        azs.l(vgVar);
        this.a = vgVar;
    }

    public final int d() {
        return this.a.c;
    }

    public final int e() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof si) {
            return Objects.equals(this.a, ((si) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.a.i;
    }

    public final String g() {
        return this.a.a;
    }

    final void h(vn vnVar) {
        vnVar.a("{\n");
        vnVar.d();
        vnVar.a("name: \"");
        vnVar.a(g());
        vnVar.a("\",\n");
        vnVar.a("description: \"");
        vnVar.a(f());
        vnVar.a("\",\n");
        if (this instanceof sk) {
            sk skVar = (sk) this;
            int iB = skVar.b();
            if (iB == 0) {
                vnVar.a("indexingType: INDEXING_TYPE_NONE,\n");
            } else if (iB != 1) {
                vnVar.a("indexingType: INDEXING_TYPE_PREFIXES,\n");
            } else {
                vnVar.a("indexingType: INDEXING_TYPE_EXACT_TERMS,\n");
            }
            int i = skVar.i();
            if (i == 0) {
                vnVar.a("tokenizerType: TOKENIZER_TYPE_NONE,\n");
            } else if (i == 1) {
                vnVar.a("tokenizerType: TOKENIZER_TYPE_PLAIN,\n");
            } else if (i == 2) {
                vnVar.a("tokenizerType: TOKENIZER_TYPE_VERBATIM,\n");
            } else if (i != 3) {
                vnVar.a("tokenizerType: TOKENIZER_TYPE_UNKNOWN,\n");
            } else {
                vnVar.a("tokenizerType: TOKENIZER_TYPE_RFC822,\n");
            }
            if (skVar.c() != 0) {
                vnVar.a("joinableValueType: JOINABLE_VALUE_TYPE_QUALIFIED_ID,\n");
            } else {
                vnVar.a("joinableValueType: JOINABLE_VALUE_TYPE_NONE,\n");
            }
            if (skVar.a() != 0) {
                vnVar.a("deletePropagationType: DELETE_PROPAGATION_TYPE_PROPAGATE_FROM,\n");
            } else {
                vnVar.a("deletePropagationType: DELETE_PROPAGATION_TYPE_NONE,\n");
            }
        } else if (this instanceof sd) {
            sd sdVar = (sd) this;
            vnVar.a("shouldIndexNestedProperties: ");
            vnVar.b(Boolean.valueOf(sdVar.c()));
            vnVar.a(",\n");
            vnVar.a("indexableNestedProperties: ");
            vnVar.b(sdVar.b());
            vnVar.a(",\n");
            vnVar.a("schemaType: \"");
            vnVar.a(sdVar.a());
            vnVar.a("\",\n");
        } else if (this instanceof sh) {
            if (((sh) this).a() != 0) {
                vnVar.a("indexingType: INDEXING_TYPE_RANGE,\n");
            } else {
                vnVar.a("indexingType: INDEXING_TYPE_NONE,\n");
            }
        }
        int iD = d();
        if (iD == 1) {
            vnVar.a("cardinality: CARDINALITY_REPEATED,\n");
        } else if (iD == 2) {
            vnVar.a("cardinality: CARDINALITY_OPTIONAL,\n");
        } else if (iD != 3) {
            vnVar.a("cardinality: CARDINALITY_UNKNOWN,\n");
        } else {
            vnVar.a("cardinality: CARDINALITY_REQUIRED,\n");
        }
        switch (e()) {
            case 1:
                vnVar.a("dataType: DATA_TYPE_STRING,\n");
                break;
            case 2:
                vnVar.a("dataType: DATA_TYPE_LONG,\n");
                break;
            case 3:
                vnVar.a("dataType: DATA_TYPE_DOUBLE,\n");
                break;
            case 4:
                vnVar.a("dataType: DATA_TYPE_BOOLEAN,\n");
                break;
            case 5:
                vnVar.a("dataType: DATA_TYPE_BYTES,\n");
                break;
            case 6:
                vnVar.a("dataType: DATA_TYPE_DOCUMENT,\n");
                break;
            case 7:
                vnVar.a("dataType: DATA_TYPE_EMBEDDING,\n");
                break;
            default:
                vnVar.a("dataType: DATA_TYPE_BLOB_HANDLE,\n");
                break;
        }
        vnVar.c();
        vnVar.a("}");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        vn vnVar = new vn();
        h(vnVar);
        return vnVar.toString();
    }
}
