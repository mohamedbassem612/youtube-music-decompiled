package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class y2 extends d {
    public final i2 h;

    public y2(y2 y2Var, Spliterator spliterator) {
        super(y2Var, spliterator);
        this.h = y2Var.h;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        v2 v2VarC = this.h.C();
        aVar.s(this.b, v2VarC);
        return v2VarC;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new y2(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            v2 v2Var = (v2) ((y2) dVar).f;
            v2Var.A((v2) ((y2) this.e).f);
            this.f = v2Var;
        }
        super.onCompletion(countedCompleter);
    }

    public y2(i2 i2Var, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = i2Var;
    }
}
