package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvo {
    private final Size a;
    private final Size b;

    public acvo(Size size, Size size2) {
        this.a = size;
        this.b = size2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acvo) {
            acvo acvoVar = (acvo) obj;
            if (this.a.equals(acvoVar.a) && this.b.equals(acvoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Size size = this.b;
        return "PlayerSizeSpec{playerViewSize=" + this.a.toString() + ", videoSize=" + size.toString() + '}';
    }

    public acvo() {
        throw null;
    }
}
