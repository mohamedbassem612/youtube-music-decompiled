package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i0 implements k0 {
    public final /* synthetic */ WatchEvent a;

    public /* synthetic */ i0(WatchEvent watchEvent) {
        this.a = watchEvent;
    }

    public final /* synthetic */ Object a() {
        return a.g(this.a.context());
    }

    public final /* synthetic */ int b() {
        return this.a.count();
    }

    public final /* synthetic */ e0 c() {
        return a.b(this.a.kind());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent watchEvent = this.a;
        if (obj instanceof i0) {
            obj = ((i0) obj).a;
        }
        return watchEvent.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
