package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aacv {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/backgroundtask/OfflineBackgroundTaskUtil");

    public static int a(int i) {
        return i != 0 ? 2 : 0;
    }

    public static aaqn b(aanb aanbVar, String str) {
        if (TextUtils.equals(aanbVar.d(), str)) {
            return aanbVar.b();
        }
        return null;
    }

    static ListenableFuture c(final aany aanyVar, aaqn aaqnVar, final int i, Executor executor, final vxz vxzVar) {
        ListenableFuture listenableFutureF = aaqnVar.l().f();
        agek agekVar = new agek() { // from class: aacu
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                vxz vxzVar2;
                HashSet hashSet = new HashSet();
                Iterator it = ((Collection) obj).iterator();
                while (true) {
                    vxzVar2 = vxzVar;
                    if (!it.hasNext()) {
                        break;
                    }
                    aamt aamtVar = (aamt) it.next();
                    if (aamtVar.u(vxzVar2)) {
                        hashSet.add(aamtVar.b());
                    }
                }
                int i2 = 0;
                try {
                    boolean zL = vxzVar2.l(184, 45717660L, false);
                    final int i3 = i;
                    aany aanyVar2 = aanyVar;
                    if (zL) {
                        aanyVar2.f(new aaoa() { // from class: aacs
                            @Override // defpackage.aaoa
                            public final aanz a(aanq aanqVar) {
                                int iBc;
                                aofh aofhVar = aanqVar.c;
                                aofg aofgVar = aofhVar.e;
                                if (aofgVar == null) {
                                    aofgVar = aofg.b;
                                }
                                aihl aihlVarCheckIsLite = aihn.checkIsLite(aphe.b);
                                aofgVar.c(aihlVarCheckIsLite);
                                if (aofgVar.j.n(aihlVarCheckIsLite.d)) {
                                    return aanz.a;
                                }
                                if (aanqVar.a().g()) {
                                    return aanqVar.g() ? aanz.a : aanz.b;
                                }
                                return (aanqVar.b == i3 && (iBc = a.bc(aofhVar.c)) != 0 && iBc == 4) ? aanz.c : aanz.a;
                            }
                        });
                    }
                    aanyVar2.b((List) j$.util.Collection.EL.stream(hashSet).map(new aact(i3, i2)).collect(Collectors.toCollection(new idl(9))));
                    return Boolean.TRUE;
                } catch (aaob e) {
                    ((agrc) ((agrc) aacv.a.b()).k("com/google/android/libraries/youtube/offline/backgroundtask/OfflineBackgroundTaskUtil", "queueRefreshViaOrchestration", 193, "OfflineBackgroundTaskUtil.java")).w("[Offline] Couldn't refresh: %s", e.getMessage());
                    return Boolean.FALSE;
                }
            }
        };
        int i2 = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureF, agekVar);
        listenableFutureF.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }
}
