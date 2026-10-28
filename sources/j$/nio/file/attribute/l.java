package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements DosFileAttributeView {
    public final /* synthetic */ m a;

    public final /* synthetic */ boolean equals(Object obj) {
        m mVar = this.a;
        if (obj instanceof l) {
            obj = ((l) obj).a;
        }
        return mVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((k) this.a).name();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ DosFileAttributes readAttributes() throws IOException {
        p pVarC = ((k) this.a).c();
        if (pVarC == null) {
            return null;
        }
        return pVarC instanceof n ? ((n) pVarC).a : new o(pVarC);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setArchive(boolean z) throws IOException {
        ((k) this.a).d(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setHidden(boolean z) throws IOException {
        ((k) this.a).e(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setReadOnly(boolean z) throws IOException {
        ((k) this.a).f(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setSystem(boolean z) throws IOException {
        ((k) this.a).g(z);
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        ((k) this.a).a(u.b(fileTime), u.b(fileTime2), u.b(fileTime3));
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return i.a(((k) this.a).readAttributes());
    }
}
