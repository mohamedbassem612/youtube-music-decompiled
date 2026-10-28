package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aakb {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/features/appsearch/utils/AppSearchResultHelper");

    public static rv a() {
        return new eob(null, null).c();
    }

    public static rv b(rv rvVar, rv rvVar2) {
        eob eobVar = new eob(null, null);
        e(eobVar, rvVar);
        e(eobVar, rvVar2);
        return eobVar.c();
    }

    public static agke c(uc ucVar) {
        List listD = d(ucVar);
        ArrayList arrayList = new ArrayList();
        while (listD != null && !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(((ti) it.next()).a().e());
            }
            listD = d(ucVar);
        }
        ucVar.close();
        return agke.n(arrayList);
    }

    private static List d(uc ucVar) {
        try {
            azs.h(!ucVar.i, "SearchResults has already been closed");
            return (List) ed.l(ucVar.b, new ub(ucVar, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/offline/features/appsearch/utils/AppSearchResultHelper", "getNextPageOfSearchResults", ';', "AppSearchResultHelper.java")).t("Failed to get next page of SearchResults");
            return agpi.a;
        }
    }

    private static void e(eob eobVar, rv rvVar) {
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(rvVar.a).entrySet()) {
            eobVar.f((String) entry.getKey(), (Void) entry.getValue());
        }
        for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(rvVar.b).entrySet()) {
            String str = (String) entry2.getKey();
            ry ryVar = (ry) entry2.getValue();
            eobVar.d(str, ryVar.a, ryVar.c);
        }
    }
}
