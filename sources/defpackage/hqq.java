package defpackage;

import android.webkit.WebStorage;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebStorageBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hqq implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hqq(Object obj, Object obj2, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface] */
    /* JADX WARN: Type inference failed for: r11v20, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.Object, org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$cid;
        int i2 = 10;
        int i3 = 1;
        if (i == 0) {
            Object obj = this.b;
            aaex aaexVarE = ((aanb) ((jan) obj).h).b().e();
            aaexVarE.getClass();
            return (List) Collection.EL.stream(this.c).map(new nyw(obj, (Map) Collection.EL.stream(aaexVarE.ao()).collect(Collectors.toMap(new hpp(i2), new hpp(11), new hnh(3), new hcd(12))), this.a, i3)).collect(Collectors.toCollection(new hcd(13)));
        }
        Object obj2 = this.b;
        int i4 = 5;
        int i5 = 6;
        if (i == 1) {
            jan janVar = (jan) obj2;
            aaex aaexVarE2 = ((aanb) janVar.h).b().e();
            aaexVarE2.getClass();
            aamo aamoVarAj = aaexVarE2.aj((String) this.c);
            if (!this.a) {
                Optional optionalOfNullable = Optional.ofNullable(aamoVarAj);
                Object obj3 = janVar.e;
                obj3.getClass();
                hlx hlxVar = new hlx(obj3, i5);
                if (true != optionalOfNullable.isPresent()) {
                    return optionalOfNullable;
                }
                return Optional.ofNullable(((jnm) hlxVar.a).n((aamo) optionalOfNullable.get()));
            }
            Optional optionalOfNullable2 = Optional.ofNullable(aamoVarAj);
            Object obj4 = janVar.e;
            obj4.getClass();
            hlx hlxVar2 = new hlx(obj4, i4);
            if (true != optionalOfNullable2.isPresent()) {
                return optionalOfNullable2;
            }
            Object obj5 = optionalOfNullable2.get();
            jnm jnmVar = (jnm) hlxVar2.a;
            anym anymVarL = jnmVar.l((aamo) obj5);
            jnmVar.a.e(jnmVar.d.e());
            return Optional.ofNullable(anymVarL.am());
        }
        axlj axljVar = (axlj) obj2;
        elq elqVar = (elq) ((Optional) axljVar.b.io()).get();
        Object obj6 = this.c;
        try {
            if (!dvy.e.d()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            if (elqVar.a.deleteProfile((String) obj6)) {
                return null;
            }
            twu.d("ProfileStoreManager", 6, "Failed to delete profile", null);
            return null;
        } catch (IllegalStateException unused) {
            if (!this.a) {
                return null;
            }
            if (!dvy.a("DELETE_BROWSING_DATA")) {
                twu.d("ProfileStoreManager", 5, "DELETE_BROWSING_DATA is not supported, cannot delete data.", null);
                return null;
            }
            elq elqVar2 = (elq) ((Optional) axljVar.b.io()).get();
            try {
                if (!dvy.e.d()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                InvocationHandler profile = elqVar2.a.getProfile((String) obj6);
                dvo dvoVarD = profile != null ? dvo.d(profile) : null;
                if (dvoVarD == null) {
                    return null;
                }
                try {
                    WebStorage webStorageB = dvoVarD.b();
                    aehz aehzVar = new aehz(obj2, 10);
                    cte cteVar = new cte(4);
                    if (!dvy.g.d()) {
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    }
                    new dvt((WebStorageBoundaryInterface) axsn.a(WebStorageBoundaryInterface.class, dvz.a.a.convertWebStorage(webStorageB))).deleteBrowsingData(cteVar, aehzVar);
                    return null;
                } catch (RuntimeException unused2) {
                    twu.d("ProfileStoreManager", 6, "Failed to delete browsing data for profile.", null);
                    return null;
                }
            } catch (RuntimeException unused3) {
                twu.d("ProfileStoreManager", 6, "Failed to get profile for deletion.", null);
            }
        } catch (RuntimeException unused4) {
            twu.d("ProfileStoreManager", 6, "Failed to delete profile.", null);
            return null;
        }
    }
}
