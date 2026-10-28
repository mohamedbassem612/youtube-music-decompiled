package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m0 implements WatchKey {
    public final /* synthetic */ n0 a;

    public /* synthetic */ m0(n0 n0Var) {
        this.a = n0Var;
    }

    public static /* synthetic */ WatchKey a(n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        return n0Var instanceof l0 ? ((l0) n0Var).a : new m0(n0Var);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        ((l0) this.a).a();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        n0 n0Var = this.a;
        if (obj instanceof m0) {
            obj = ((m0) obj).a;
        }
        return n0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return ((l0) this.a).c();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return a.n(((l0) this.a).d());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return ((l0) this.a).e();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        t0 t0VarF = ((l0) this.a).f();
        if (t0VarF == null) {
            return null;
        }
        if (t0VarF instanceof r0) {
            return ((r0) t0VarF).a;
        }
        return t0VarF instanceof Path ? p.h((Path) t0VarF) : new s0(t0VarF);
    }
}
