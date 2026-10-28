package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j0 implements l0 {
    public final /* synthetic */ PosixFileAttributeView a;

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(f0 f0Var, f0 f0Var2, f0 f0Var3) throws IOException {
        this.a.setTimes(u.c(f0Var), u.c(f0Var2), u.c(f0Var3));
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ void b(v0 v0Var) throws IOException {
        this.a.setOwner(u0.a(v0Var));
    }

    public final /* synthetic */ o0 c() throws IOException {
        PosixFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof n0 ? ((n0) attributes).a : new m0(attributes);
    }

    public final /* synthetic */ void d(i0 i0Var) throws IOException {
        this.a.setGroup(h0.a(i0Var));
    }

    public final /* synthetic */ void e(Set set) throws IOException {
        this.a.setPermissions(j$.nio.file.a.m(set));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof j0) {
            obj = ((j0) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ v0 getOwner() {
        return t0.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ j readAttributes() {
        return h.a(this.a.readAttributes());
    }
}
