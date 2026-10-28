package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sp extends vm {
    public final float[] a;
    public final String b;
    public final so c;
    private Integer d;

    public sp(float[] fArr, String str, so soVar) {
        super((byte[]) null);
        azs.l(str);
        if (fArr != null && fArr.length == 0) {
            throw new IllegalArgumentException("Embedding values cannot be empty.");
        }
        if (soVar != null && soVar.c.length == 0) {
            throw new IllegalArgumentException("Embedding values cannot be empty.");
        }
        boolean z = fArr != null;
        azs.f(z || soVar != null, "EmbeddingVector must have at least float values or quantized data.");
        this.a = z ? fArr : new float[]{0.0f};
        this.b = str;
        this.c = soVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof sp)) {
            sp spVar = (sp) obj;
            if (Arrays.equals(this.a, spVar.a) && this.b.equals(spVar.b) && Objects.equals(this.c, spVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = this.d;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c));
            this.d = numValueOf;
        }
        return numValueOf.intValue();
    }
}
