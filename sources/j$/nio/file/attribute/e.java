package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements g {
    public final /* synthetic */ BasicFileAttributeView a;

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(f0 f0Var, f0 f0Var2, f0 f0Var3) throws IOException {
        this.a.setTimes(u.c(f0Var), u.c(f0Var2), u.c(f0Var3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof e) {
            obj = ((e) obj).a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ j readAttributes() {
        return h.a(this.a.readAttributes());
    }
}
