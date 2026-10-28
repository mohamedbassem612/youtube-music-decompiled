package j$.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c0 implements FileStoreAttributeView {
    public final /* synthetic */ d0 a;

    public final /* synthetic */ boolean equals(Object obj) {
        d0 d0Var = this.a;
        if (obj instanceof c0) {
            obj = ((c0) obj).a;
        }
        return d0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((b0) this.a).name();
    }
}
