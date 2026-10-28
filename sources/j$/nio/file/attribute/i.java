package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements BasicFileAttributes {
    public final /* synthetic */ j a;

    public /* synthetic */ i(j jVar) {
        this.a = jVar;
    }

    public static /* synthetic */ BasicFileAttributes a(j jVar) {
        BasicFileAttributes iVar;
        if (jVar == null) {
            return null;
        }
        if (jVar instanceof h) {
            return ((h) jVar).a;
        }
        if (jVar instanceof p) {
            p pVar = (p) jVar;
            if (pVar instanceof n) {
                return ((n) pVar).a;
            }
            iVar = new o(pVar);
        } else if (jVar instanceof o0) {
            o0 o0Var = (o0) jVar;
            if (o0Var instanceof m0) {
                return ((m0) o0Var).a;
            }
            iVar = new n0(o0Var);
        } else {
            iVar = new i(jVar);
        }
        return iVar;
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return u.c(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        j jVar = this.a;
        if (obj instanceof i) {
            obj = ((i) obj).a;
        }
        return jVar.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return u.c(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return u.c(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
