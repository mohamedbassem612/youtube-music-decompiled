package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anz {
    public final anq a;
    public final ann b;
    public final aoa c;
    public final akp d;
    public final akp e;

    public anz(anq anqVar) {
        this.a = anqVar;
        new akp().b = -1;
        ann annVar = new ann(anqVar);
        this.b = annVar;
        this.c = annVar;
        aoc aocVar = annVar.f;
        this.d = aocVar;
        this.e = aocVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        akp akpVar = this.e;
        akp akpVar2 = this.d;
        if (akpVar == akpVar2) {
            sb.append(']');
        } else {
            while (akpVar != null && akpVar != akpVar2) {
                sb.append("<tail>,");
                akpVar = null;
            }
        }
        return sb.toString();
    }
}
