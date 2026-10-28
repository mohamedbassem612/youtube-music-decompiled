package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xjy implements tbu {
    final /* synthetic */ xkd e;
    public final List a = new ArrayList();
    private final List f = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final List d = new ArrayList();

    public xjy(xkd xkdVar) {
        this.e = xkdVar;
    }

    private static final void c(Object obj, List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((tbu) it.next()).a(obj);
        }
    }

    @Override // defpackage.tbu
    public final void a(Object obj) {
        c(obj, this.b);
        c(obj, this.a);
        c(obj, this.f);
        c(obj, this.c);
        c(obj, this.d);
        this.e.d();
    }

    @Override // defpackage.tbu
    public final boolean b() {
        return true;
    }
}
