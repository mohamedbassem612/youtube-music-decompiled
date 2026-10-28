package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gro {
    public final heh a;
    public final adma b;
    public final RecyclerView c;
    public final grt d;

    public gro(heh hehVar, grt grtVar, adma admaVar, RecyclerView recyclerView) {
        this.a = hehVar;
        this.d = grtVar;
        this.b = admaVar;
        this.c = recyclerView;
    }

    public final boolean equals(Object obj) {
        grt grtVar;
        adma admaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gro) {
            gro groVar = (gro) obj;
            if (this.a.equals(groVar.a) && ((grtVar = this.d) != null ? grtVar.equals(groVar.d) : groVar.d == null) && ((admaVar = this.b) != null ? admaVar.equals(groVar.b) : groVar.b == null)) {
                RecyclerView recyclerView = this.c;
                if (recyclerView == null) {
                    if (groVar.c == null) {
                        return true;
                    }
                } else if (recyclerView.equals(groVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        grt grtVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (grtVar == null ? 0 : grtVar.hashCode())) * 1000003;
        adma admaVar = this.b;
        int iHashCode3 = (iHashCode2 ^ (admaVar == null ? 0 : admaVar.hashCode())) * 1000003;
        RecyclerView recyclerView = this.c;
        return iHashCode3 ^ (recyclerView != null ? recyclerView.hashCode() : 0);
    }

    public final String toString() {
        RecyclerView recyclerView = this.c;
        adma admaVar = this.b;
        grt grtVar = this.d;
        return "AppChromeTreatmentModel{browseModel=" + String.valueOf(this.a) + ", headerViewProvider=" + String.valueOf(grtVar) + ", headerPresenter=" + String.valueOf(admaVar) + ", recyclerView=" + String.valueOf(recyclerView) + '}';
    }

    public gro() {
        throw null;
    }
}
