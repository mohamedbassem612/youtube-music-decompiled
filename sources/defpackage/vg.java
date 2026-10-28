package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vg extends vm {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final vf e;
    public final vb f;
    public final vd g;
    public final ve h;
    public final String i;
    public final vc j;
    public final boolean k;
    private Integer l;

    public vg(String str, int i, int i2, String str2, vf vfVar, vb vbVar, vd vdVar, ve veVar, String str3, vc vcVar, boolean z) {
        super((byte[]) null);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = vfVar;
        this.f = vbVar;
        this.g = vdVar;
        this.h = veVar;
        this.i = str3;
        this.j = vcVar;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vg) {
            vg vgVar = (vg) obj;
            if (Objects.equals(this.a, vgVar.a) && Objects.equals(this.i, vgVar.i) && Objects.equals(Integer.valueOf(this.b), Integer.valueOf(vgVar.b)) && Objects.equals(Integer.valueOf(this.c), Integer.valueOf(vgVar.c)) && Objects.equals(this.d, vgVar.d) && Objects.equals(this.e, vgVar.e) && Objects.equals(this.f, vgVar.f) && Objects.equals(this.g, vgVar.g) && Objects.equals(this.h, vgVar.h) && Objects.equals(this.j, vgVar.j) && this.k == vgVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = this.l;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Objects.hash(this.a, this.i, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.j, Boolean.valueOf(this.k)));
            this.l = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final String toString() {
        return "{name: " + this.a + ", description: " + this.i + ", dataType: " + this.b + ", cardinality: " + this.c + ", schemaType: " + this.d + ", stringIndexingConfigParcel: " + this.e + ", documentIndexingConfigParcel: " + this.f + ", integerIndexingConfigParcel: " + this.g + ", joinableConfigParcel: " + this.h + ", embeddingIndexingConfigParcel: " + this.j + ", isScoringEnabled: " + this.k + '}';
    }
}
