package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k0 implements PosixFileAttributeView {
    public final /* synthetic */ l0 a;

    public final /* synthetic */ boolean equals(Object obj) {
        l0 l0Var = this.a;
        if (obj instanceof k0) {
            obj = ((k0) obj).a;
        }
        return l0Var.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return u0.a(((j0) this.a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView, java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ String name() {
        return ((j0) this.a).name();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ PosixFileAttributes readAttributes() throws IOException {
        o0 o0VarC = ((j0) this.a).c();
        if (o0VarC == null) {
            return null;
        }
        return o0VarC instanceof m0 ? ((m0) o0VarC).a : new n0(o0VarC);
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setGroup(GroupPrincipal groupPrincipal) throws IOException {
        ((j0) this.a).d(g0.a(groupPrincipal));
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) throws IOException {
        ((j0) this.a).b(t0.a(userPrincipal));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setPermissions(Set set) throws IOException {
        ((j0) this.a).e(j$.nio.file.a.m(set));
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        ((j0) this.a).a(u.b(fileTime), u.b(fileTime2), u.b(fileTime3));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return i.a(((j0) this.a).readAttributes());
    }
}
