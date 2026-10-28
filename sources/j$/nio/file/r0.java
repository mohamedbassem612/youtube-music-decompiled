package j$.nio.file;

import java.nio.file.Watchable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r0 implements t0 {
    public final /* synthetic */ Watchable a;

    public /* synthetic */ r0(Watchable watchable) {
        this.a = watchable;
    }

    @Override // j$.nio.file.t0
    public final /* synthetic */ n0 c(q0 q0Var, e0[] e0VarArr, h0[] h0VarArr) {
        return l0.b(this.a.register(p0.a(q0Var), z.l(e0VarArr), z.m(h0VarArr)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.a;
        if (obj instanceof r0) {
            obj = ((r0) obj).a;
        }
        return watchable.equals(obj);
    }

    @Override // j$.nio.file.t0
    public final /* synthetic */ n0 f(q0 q0Var, e0[] e0VarArr) {
        return l0.b(this.a.register(p0.a(q0Var), z.l(e0VarArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
