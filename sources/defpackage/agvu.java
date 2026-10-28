package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class agvu extends agvs implements agwx {
    private static Map g(agwx agwxVar) {
        return new agod(agwxVar.c(), new aeqk(agwxVar, 19));
    }

    @Override // defpackage.agvs, defpackage.agwu
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agwx) {
            agwx agwxVar = (agwx) obj;
            agwxVar.j();
            if (e().equals(agwxVar.e()) && g(this).equals(g(agwxVar))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return g(this).hashCode();
    }

    public final String toString() {
        return "isDirected: true, allowsSelfLoops: false, nodes: " + e().toString() + ", edges: " + g(this).toString();
    }
}
