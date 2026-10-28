package j$.nio.file.attribute;

import j$.util.DesugarCollections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class s implements FileAttribute {
    public final /* synthetic */ java.nio.file.attribute.FileAttribute a;

    public s(java.nio.file.attribute.FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public final Object value() {
        return DesugarCollections.unmodifiableSet(j$.nio.file.a.m((Set) this.a.value()));
    }
}
