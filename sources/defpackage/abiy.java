package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abiy {
    public final Object a;
    public final int b;

    public abiy(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException("Null item");
        }
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abiy) {
            abiy abiyVar = (abiy) obj;
            if (this.a.equals(abiyVar.a) && this.b == abiyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "VideoItemAndSequencerIndex{item=" + this.a.toString() + ", sequencerIndex=" + this.b + '}';
    }

    public abiy() {
        throw null;
    }
}
