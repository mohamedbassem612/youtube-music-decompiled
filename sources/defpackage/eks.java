package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eks implements ekn {
    public final boolean a;
    public final int b;

    public eks(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.ekn
    public final eia a(ehm ehmVar, egy egyVar, ele eleVar) {
        if (ehmVar.i) {
            return new eij(this);
        }
        ((end) ene.a).a("Animation contains merge paths but they are disabled.", null);
        return null;
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i == 1) {
            str = "MERGE";
        } else if (i == 2) {
            str = "ADD";
        } else if (i == 3) {
            str = "SUBTRACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        return a.bU((byte) 125, str, "MergePaths{mode=");
    }
}
