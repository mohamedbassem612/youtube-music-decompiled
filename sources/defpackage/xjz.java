package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xjz implements tbu {
    final /* synthetic */ xkd a;
    private final xju b;

    public xjz(xkd xkdVar, xju xjuVar) {
        this.a = xkdVar;
        this.b = xjuVar;
    }

    @Override // defpackage.tbu
    public final void a(Object obj) {
        Map mapA = this.b.a(obj);
        if (mapA == null || mapA.isEmpty()) {
            return;
        }
        xkd xkdVar = this.a;
        List<xjm> list = xkdVar.a;
        if (!list.isEmpty()) {
            for (xjm xjmVar : list) {
                for (Map.Entry entry : mapA.entrySet()) {
                    xjmVar.f((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        List<xjm> list2 = xkdVar.b;
        if (list2.isEmpty()) {
            return;
        }
        for (xjm xjmVar2 : list2) {
            for (Map.Entry entry2 : mapA.entrySet()) {
                xjmVar2.f((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
    }

    @Override // defpackage.tbu
    public final boolean b() {
        return true;
    }
}
