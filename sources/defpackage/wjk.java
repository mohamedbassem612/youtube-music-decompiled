package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wjk implements zya {
    private final /* synthetic */ int $cid;
    private final Object b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
    public wjk(amun[] amunVarArr, int i) {
        this.$cid = i;
        this.b = new HashSet();
        if (amunVarArr != null) {
            for (amun amunVar : amunVarArr) {
                ?? r1 = this.b;
                amum amumVarA = amum.a(amunVar.c);
                if (amumVarA == null) {
                    amumVarA = amum.UNKNOWN;
                }
                r1.add(amumVarA);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.zya
    public final boolean a(amum amumVar) {
        int i = this.$cid;
        if (i == 0) {
            return this.b.contains(amumVar);
        }
        if (i == 1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                amum amumVarA = amum.a(((amun) it.next()).c);
                if (amumVarA == null) {
                    amumVarA = amum.UNKNOWN;
                }
                if (amumVarA == amumVar) {
                }
            }
            return false;
        }
        ?? r4 = this.b;
        if (i != 2) {
            Iterator it2 = ((jrh) r4).g.iterator();
            while (it2.hasNext()) {
                if (((Integer) it2.next()).intValue() == amumVar.m) {
                }
            }
            return false;
        }
        if (!r4.contains(amumVar)) {
            return false;
        }
        return true;
    }

    public wjk(List list, int i) {
        this.$cid = i;
        list.getClass();
        this.b = list;
    }

    public wjk(wjm wjmVar, int i) {
        this.$cid = i;
        wjmVar.getClass();
        this.b = wjmVar.d;
    }

    public wjk(jrh jrhVar, int i) {
        this.$cid = i;
        this.b = jrhVar;
    }
}
