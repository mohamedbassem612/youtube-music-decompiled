package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d0 implements WatchEvent.Kind {
    public final /* synthetic */ e0 a;

    public final /* synthetic */ boolean equals(Object obj) {
        e0 e0Var = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return e0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
