package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c0 implements e0 {
    public final /* synthetic */ WatchEvent.Kind a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof c0) {
            obj = ((c0) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.e0
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.e0
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
