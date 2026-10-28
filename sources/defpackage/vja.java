package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vja {
    public final vbu a;
    public final Optional b;

    public vja(vbu vbuVar, Optional optional) {
        this.a = vbuVar;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vja) {
            vja vjaVar = (vja) obj;
            if (this.a.equals(vjaVar.a) && this.b.equals(vjaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "StickerModelParams{stickerAsset=" + String.valueOf(this.a) + ", videoDimensionScaling=" + String.valueOf(optional) + '}';
    }

    public vja() {
        throw null;
    }
}
