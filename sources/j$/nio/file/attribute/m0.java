package j$.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m0 implements o0 {
    public final /* synthetic */ PosixFileAttributes a;

    public /* synthetic */ m0(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    public final /* synthetic */ i0 a() {
        return g0.a(this.a.group());
    }

    public final /* synthetic */ v0 b() {
        return t0.a(this.a.owner());
    }

    public final /* synthetic */ Set c() {
        return j$.nio.file.a.m(this.a.permissions());
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ f0 creationTime() {
        return u.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof m0) {
            obj = ((m0) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ f0 lastAccessTime() {
        return u.b(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ f0 lastModifiedTime() {
        return u.b(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
