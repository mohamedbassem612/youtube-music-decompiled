package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends f0 {
    public final /* synthetic */ g0 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, Predicate predicate) {
        super(g0Var);
        this.c = g0Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        g0 g0Var = this.c;
        if (zTest == g0Var.a) {
            this.a = true;
            this.b = g0Var.b;
        }
    }
}
