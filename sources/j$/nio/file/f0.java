package j$.nio.file;

import java.nio.file.WatchEvent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f0 implements h0 {
    public final /* synthetic */ WatchEvent.Modifier a;

    public final /* synthetic */ String a() {
        return this.a.name();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof f0) {
            obj = ((f0) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
