package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdn {
    public final auey a;
    public final wjf b;
    public final wgs c;

    public vdn(auey aueyVar, wjf wjfVar, wgs wgsVar) {
        wjfVar.getClass();
        this.a = aueyVar;
        this.b = wjfVar;
        this.c = wgsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vdn) {
            vdn vdnVar = (vdn) obj;
            if (awrc.c(this.a, vdnVar.a) && awrc.c(this.b, vdnVar.b) && awrc.c(this.c, vdnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SelectedFormatStream(videoIdAsset=" + this.a + ", playerResponse=" + this.b + ", selectedFormatStream=" + this.c + ')';
    }
}
