package j$.nio.file;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e extends z {
    public final /* synthetic */ FileStore e;

    public e(FileStore fileStore) {
        this.e = fileStore;
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ Object a(String str) {
        return this.e.getAttribute(str);
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ long b() {
        return this.e.getBlockSize();
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ j$.nio.file.attribute.d0 c(Class cls) {
        FileStoreAttributeView fileStoreAttributeView = this.e.getFileStoreAttributeView(cls);
        if (fileStoreAttributeView == null) {
            return null;
        }
        return fileStoreAttributeView instanceof j$.nio.file.attribute.c0 ? ((j$.nio.file.attribute.c0) fileStoreAttributeView).a : new j$.nio.file.attribute.b0(fileStoreAttributeView);
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ long d() {
        return this.e.getTotalSpace();
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ long e() {
        return this.e.getUnallocatedSpace();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.e;
        if (obj instanceof e) {
            obj = ((e) obj).e;
        }
        return fileStore.equals(obj);
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ long f() {
        return this.e.getUsableSpace();
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ boolean g() {
        return this.e.isReadOnly();
    }

    public final /* synthetic */ int hashCode() {
        return this.e.hashCode();
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ String n() {
        return this.e.name();
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ boolean o(Class cls) {
        return this.e.supportsFileAttributeView(a.h(cls));
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ boolean p(String str) {
        return this.e.supportsFileAttributeView(str);
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ String q() {
        return this.e.type();
    }
}
