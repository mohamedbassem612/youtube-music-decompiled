package j$.nio.file;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f extends FileStore {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ z a;

    public final /* synthetic */ boolean equals(Object obj) {
        z zVar = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return zVar.equals(obj);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ Object getAttribute(String str) {
        return this.a.a(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getBlockSize() {
        return this.a.b();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ FileStoreAttributeView getFileStoreAttributeView(Class cls) {
        j$.nio.file.attribute.d0 d0VarC = this.a.c(cls);
        if (d0VarC == null) {
            return null;
        }
        return d0VarC instanceof j$.nio.file.attribute.b0 ? ((j$.nio.file.attribute.b0) d0VarC).a : new j$.nio.file.attribute.c0(d0VarC);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getTotalSpace() {
        return this.a.d();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUnallocatedSpace() {
        return this.a.e();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUsableSpace() {
        return this.a.f();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.g();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String name() {
        return this.a.n();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(Class cls) {
        return this.a.o(a.h(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String type() {
        return this.a.q();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(String str) {
        return this.a.p(str);
    }
}
