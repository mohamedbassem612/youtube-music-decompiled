package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xkb implements tbu {
    final /* synthetic */ xkd a;
    private final String b;

    public xkb(xkd xkdVar, String str) {
        this.a = xkdVar;
        int i = typ.a;
        this.b = str;
    }

    @Override // defpackage.tbu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tas tasVar = (tas) obj;
        tasVar.b(this.b);
        xkd xkdVar = this.a;
        Iterator it = xkdVar.a.iterator();
        while (it.hasNext()) {
            xjm xjmVar = (xjm) it.next();
            if (xjmVar.c(tasVar)) {
                it.remove();
                if (!xjmVar.g()) {
                    xkdVar.b.add(xjmVar);
                }
            }
        }
    }

    @Override // defpackage.tbu
    public final boolean b() {
        return true;
    }
}
