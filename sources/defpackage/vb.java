package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vb extends vm {
    public final boolean a;
    public final List b;

    public vb(boolean z, List list) {
        super((byte[]) null);
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vb) {
            vb vbVar = (vb) obj;
            if (Objects.equals(Boolean.valueOf(this.a), Boolean.valueOf(vbVar.a)) && Objects.equals(this.b, vbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "{indexNestedProperties: " + this.a + ", indexableNestedPropertiesList: " + this.b + '}';
    }
}
