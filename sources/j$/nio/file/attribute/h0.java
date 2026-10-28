package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h0 implements GroupPrincipal {
    public final /* synthetic */ i0 a;

    public /* synthetic */ h0(i0 i0Var) {
        this.a = i0Var;
    }

    public static /* synthetic */ GroupPrincipal a(i0 i0Var) {
        if (i0Var == null) {
            return null;
        }
        return i0Var instanceof g0 ? ((g0) i0Var).a : new h0(i0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        i0 i0Var = this.a;
        if (obj instanceof h0) {
            obj = ((h0) obj).a;
        }
        return i0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return ((g0) this.a).getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return ((g0) this.a).implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return ((g0) this.a).toString();
    }
}
