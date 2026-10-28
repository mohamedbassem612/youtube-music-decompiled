package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t0 implements v0 {
    public final /* synthetic */ UserPrincipal a;

    public /* synthetic */ t0(UserPrincipal userPrincipal) {
        this.a = userPrincipal;
    }

    public static /* synthetic */ v0 a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof u0) {
            return ((u0) userPrincipal).a;
        }
        return userPrincipal instanceof GroupPrincipal ? g0.a((GroupPrincipal) userPrincipal) : new t0(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.a;
        if (obj instanceof t0) {
            obj = ((t0) obj).a;
        }
        return userPrincipal.equals(obj);
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
