package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u0 implements UserPrincipal {
    public final /* synthetic */ v0 a;

    public /* synthetic */ u0(v0 v0Var) {
        this.a = v0Var;
    }

    public static /* synthetic */ UserPrincipal a(v0 v0Var) {
        if (v0Var == null) {
            return null;
        }
        if (v0Var instanceof t0) {
            return ((t0) v0Var).a;
        }
        return v0Var instanceof i0 ? h0.a((i0) v0Var) : new u0(v0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        v0 v0Var = this.a;
        if (obj instanceof u0) {
            obj = ((u0) obj).a;
        }
        return v0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
