package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ilu {
    public final View a;
    public final hwj b;

    public ilu(View view, hwj hwjVar) {
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.a = view;
        this.b = hwjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilu) {
            ilu iluVar = (ilu) obj;
            if (this.a.equals(iluVar.a) && this.b.equals(iluVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        hwj hwjVar = this.b;
        return "PageErrorViewModel{view=" + this.a.toString() + ", controller=" + hwjVar.toString() + '}';
    }

    public ilu() {
        throw null;
    }
}
