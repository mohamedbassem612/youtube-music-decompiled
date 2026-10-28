package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rmk implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rmk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return Optional.empty();
            case 1:
                return Optional.of((affd) obj);
            case 2:
                int i = rou.e;
                return null;
            case 3:
                return Optional.of((affd) obj);
            case 4:
                ((agrc) ((agrc) ((agrc) rpa.a.b()).j((IllegalStateException) obj)).k("com/google/android/libraries/youtube/account/offline/OfflineAccountSwitcherStoreImpl", "getOrCreateAccountId", 428, "OfflineAccountSwitcherStoreImpl.java")).t("Could not resolve accountId while saving offline account items");
                return Optional.empty();
            case 5:
                ((agrc) ((agrc) ((agrc) rpa.a.c()).j((IOException) obj)).k("com/google/android/libraries/youtube/account/offline/OfflineAccountSwitcherStoreImpl", "getUserIdIfOfflineStorageExists", 496, "OfflineAccountSwitcherStoreImpl.java")).t("Error checking offline storage existence");
                return Optional.empty();
            case 6:
                return (Set) Collection.EL.stream((List) obj).filter(new rej(12)).map(new ris(14)).collect(aghu.b);
            case 7:
                return null;
            case 8:
                ajvu ajvuVar = (ajvu) obj;
                anim animVar = ajvuVar.n;
                if (animVar == null) {
                    animVar = anim.a;
                }
                boolean z = false;
                if (animVar.m) {
                    anim animVar2 = ajvuVar.n;
                    if (animVar2 == null) {
                        animVar2 = anim.a;
                    }
                    if (animVar2.p) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                anim animVar3 = ((ajvu) obj).n;
                if (animVar3 == null) {
                    animVar3 = anim.a;
                }
                return Boolean.valueOf(animVar3.m);
            case 10:
                return ((sqe) obj).c;
            case 11:
                return (sko) ((smr) obj).d(sjk.class);
            case 12:
                return (sko) ((smr) obj).d(sjk.class);
            case 13:
                return (sko) ((smr) obj).d(sjk.class);
            case 14:
                return (sko) ((smr) obj).d(sjk.class);
            case 15:
                return (sko) ((smr) obj).d(sjk.class);
            case 16:
                return ((acip) obj).ap();
            case 17:
                int i2 = sdi.a;
                rmp.j(null, "Ad scheduling failed with exception: ".concat(String.valueOf(String.valueOf((Exception) obj))));
                return null;
            case 18:
                wgi wgiVar = (wgi) obj;
                if (wgiVar == null) {
                    return null;
                }
                akck akckVar = wgiVar.a.k;
                return akckVar == null ? akck.a : akckVar;
            case 19:
                wgi wgiVar2 = (wgi) obj;
                if (wgiVar2 == null) {
                    return null;
                }
                amae amaeVar = wgiVar2.a;
                apji apjiVar = amaeVar.t;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajlk.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    return null;
                }
                apji apjiVar2 = amaeVar.t;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajlk.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (ajlj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            default:
                wgi wgiVar3 = (wgi) obj;
                if (wgiVar3 != null) {
                    return wgiVar3.a.s;
                }
                return null;
        }
    }
}
