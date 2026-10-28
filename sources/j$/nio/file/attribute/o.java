package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements DosFileAttributes {
    public final /* synthetic */ p a;

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return u.c(((n) this.a).creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        p pVar = this.a;
        if (obj instanceof o) {
            obj = ((o) obj).a;
        }
        return pVar.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return ((n) this.a).fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isArchive() {
        return ((n) this.a).a();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return ((n) this.a).isDirectory();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isHidden() {
        return ((n) this.a).b();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return ((n) this.a).isOther();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isReadOnly() {
        return ((n) this.a).c();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return ((n) this.a).isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return ((n) this.a).isSymbolicLink();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isSystem() {
        return ((n) this.a).d();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return u.c(((n) this.a).lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return u.c(((n) this.a).lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return ((n) this.a).size();
    }
}
