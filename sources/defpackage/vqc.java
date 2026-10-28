package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vqc {
    public final String a;
    public final int b;
    public final Optional c;

    public vqc(String str, int i, Optional optional) {
        this.a = str;
        this.b = i;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqc) {
            vqc vqcVar = (vqc) obj;
            if (this.a.equals(vqcVar.a) && this.b == vqcVar.b && this.c.equals(vqcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ScrollToItemData{panelId=" + this.a + ", itemIndex=" + this.b + ", syncId=" + String.valueOf(this.c) + '}';
    }

    public vqc() {
        throw null;
    }
}
