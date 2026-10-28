package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j0 implements WatchEvent {
    public final /* synthetic */ k0 a;

    public /* synthetic */ j0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ Object context() {
        return a.g(((i0) this.a).a());
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ int count() {
        return ((i0) this.a).b();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        k0 k0Var = this.a;
        if (obj instanceof j0) {
            obj = ((j0) obj).a;
        }
        return k0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ WatchEvent.Kind kind() {
        return a.f(((i0) this.a).c());
    }
}
