package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w implements FileAttributeView {
    public final /* synthetic */ x a;

    public final /* synthetic */ boolean equals(Object obj) {
        x xVar = this.a;
        if (obj instanceof w) {
            obj = ((w) obj).a;
        }
        return xVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
