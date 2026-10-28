package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xka implements tbu {
    protected final Set a = new HashSet();
    protected final Set b = new HashSet();
    final /* synthetic */ xkd c;
    private final xjn d;
    private final Class e;

    public xka(xkd xkdVar, xjn xjnVar, Class cls) {
        this.c = xkdVar;
        this.d = xjnVar;
        this.e = cls;
    }

    @Override // defpackage.tbu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        xjm xjmVar;
        xjn xjnVar = this.d;
        Set set = this.a;
        xkd xkdVar = this.c;
        xjm xjmVarA = xjnVar.a(xkdVar);
        xjmVarA.a((tas) obj, set, this.b);
        Class cls = this.e;
        if (cls != null) {
            Iterator it = xkdVar.a.iterator();
            do {
                if (!it.hasNext()) {
                    xjmVar = null;
                    break;
                }
                xjmVar = (xjm) it.next();
            } while (!xjmVar.getClass().equals(cls));
            if (xjmVar != null) {
                xjmVarA.a.b(xjmVar);
            }
        }
        xkdVar.a.add(xjmVarA);
    }

    @Override // defpackage.tbu
    public final boolean b() {
        return true;
    }

    public final void c(Class cls) {
        this.b.add(cls);
    }

    public final void d(Class cls) {
        this.a.add(cls);
    }
}
