package j$.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s0 implements Watchable {
    public final /* synthetic */ t0 a;

    public /* synthetic */ s0(t0 t0Var) {
        this.a = t0Var;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        t0 t0Var = this.a;
        if (obj instanceof s0) {
            obj = ((s0) obj).a;
        }
        return t0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return m0.a(this.a.c(o0.a(watchService), z.i(kindArr), z.j(modifierArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return m0.a(this.a.f(o0.a(watchService), z.i(kindArr)));
    }
}
