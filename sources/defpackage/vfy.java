package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfy {
    private final boolean a;
    private final boolean b;

    public vfy(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vfy) {
            vfy vfyVar = (vfy) obj;
            if (this.a == vfyVar.a && this.b == vfyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.aj(this.a) * 31) + a.aj(this.b);
    }

    public final String toString() {
        return "UndoRedoModel(canUndo=" + this.a + ", canRedo=" + this.b + ')';
    }
}
