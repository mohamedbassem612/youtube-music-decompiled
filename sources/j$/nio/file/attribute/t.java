package j$.nio.file.attribute;

import j$.util.DesugarCollections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class t implements java.nio.file.attribute.FileAttribute {
    public final /* synthetic */ FileAttribute a;

    public t(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return DesugarCollections.unmodifiableSet(j$.nio.file.a.m((Set) this.a.value()));
    }
}
