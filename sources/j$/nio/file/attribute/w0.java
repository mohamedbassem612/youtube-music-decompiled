package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w0 extends j$.desugar.sun.nio.fs.g {
    public final /* synthetic */ UserPrincipalLookupService a;

    public w0(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof w0) {
            obj = ((w0) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.desugar.sun.nio.fs.g
    public final /* synthetic */ i0 y(String str) {
        return g0.a(this.a.lookupPrincipalByGroupName(str));
    }

    @Override // j$.desugar.sun.nio.fs.g
    public final /* synthetic */ v0 z(String str) {
        return t0.a(this.a.lookupPrincipalByName(str));
    }
}
