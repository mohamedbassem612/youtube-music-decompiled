package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class t extends b {
    public final p j;
    public final boolean k;

    public t(t tVar, Spliterator spliterator) {
        super(tVar, spliterator);
        this.k = tVar.k;
        this.j = tVar.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        b5 b5Var = (b5) this.j.d.get();
        aVar.s(this.b, b5Var);
        Object obj = b5Var.get();
        if (this.k) {
            if (obj != null) {
                if (c()) {
                    j$.desugar.sun.nio.fs.g.E(this.h, null, obj);
                    return obj;
                }
                i();
                return obj;
            }
        } else if (obj != null) {
            j$.desugar.sun.nio.fs.g.E(this.h, null, obj);
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new t(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            t tVar = (t) this.d;
            t tVar2 = null;
            while (tVar != tVar2) {
                Object objK = tVar.k();
                if (objK != null && this.j.c.test(objK)) {
                    f(objK);
                    if (!c()) {
                        i();
                        break;
                    } else {
                        j$.desugar.sun.nio.fs.g.E(this.h, null, objK);
                        break;
                    }
                }
                tVar2 = tVar;
                tVar = (t) this.e;
            }
        }
        super.onCompletion(countedCompleter);
    }

    public t(p pVar, boolean z, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.k = z;
        this.j = pVar;
    }
}
