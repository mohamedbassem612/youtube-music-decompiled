package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class inh {
    public final int a;
    public final boolean b;

    public inh(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof inh) {
            inh inhVar = (inh) obj;
            if (this.a == inhVar.a && this.b == inhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "PlaylistPanelContext{playbackPosition=" + this.a + ", shouldShuffleLocally=" + this.b + '}';
    }

    public inh() {
        throw null;
    }
}
