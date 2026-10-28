package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y implements a0 {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ void b(v0 v0Var) throws IOException {
        this.a.setOwner(u0.a(v0Var));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ v0 getOwner() {
        return t0.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
