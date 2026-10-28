package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x0 extends UserPrincipalLookupService {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ j$.desugar.sun.nio.fs.g a;

    public /* synthetic */ x0(j$.desugar.sun.nio.fs.g gVar) {
        this.a = gVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        j$.desugar.sun.nio.fs.g gVar = this.a;
        if (obj instanceof x0) {
            obj = ((x0) obj).a;
        }
        return gVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ GroupPrincipal lookupPrincipalByGroupName(String str) {
        return h0.a(this.a.y(str));
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ UserPrincipal lookupPrincipalByName(String str) {
        return u0.a(this.a.z(str));
    }
}
