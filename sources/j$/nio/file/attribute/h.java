package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements j {
    public final /* synthetic */ BasicFileAttributes a;

    public /* synthetic */ h(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ j a(BasicFileAttributes basicFileAttributes) {
        j hVar;
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof i) {
            return ((i) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            DosFileAttributes dosFileAttributes = (DosFileAttributes) basicFileAttributes;
            if (dosFileAttributes instanceof o) {
                return ((o) dosFileAttributes).a;
            }
            hVar = new n(dosFileAttributes);
        } else if (basicFileAttributes instanceof PosixFileAttributes) {
            PosixFileAttributes posixFileAttributes = (PosixFileAttributes) basicFileAttributes;
            if (posixFileAttributes instanceof n0) {
                return ((n0) posixFileAttributes).a;
            }
            hVar = new m0(posixFileAttributes);
        } else {
            hVar = new h(basicFileAttributes);
        }
        return hVar;
    }

    @Override // j$.nio.file.attribute.j
    public final /* synthetic */ f0 creationTime() {
        return u.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof h) {
            obj = ((h) obj).a;
        }
        return basicFileAttributes.equals(obj);
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
