package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class agvt extends agvs implements agwn {
    @Override // defpackage.agvs, defpackage.agwu
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agwn) {
            agwn agwnVar = (agwn) obj;
            agwnVar.h();
            if (e().equals(agwnVar.e()) && new agvr(this).equals(agwnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new agvr(this).hashCode();
    }

    public final String toString() {
        return "isDirected: true, allowsSelfLoops: false, nodes: " + e().toString() + ", edges: " + new agvr(this).toString();
    }
}
