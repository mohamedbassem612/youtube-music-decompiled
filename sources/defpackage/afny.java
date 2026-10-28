package defpackage;

import android.app.Activity;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afny {
    private static final agrf e = agrf.h("com/google/apps/tiktok/inject/account/ScreenAccountComponentManagers");
    public final aunr a;
    public final Object b = new Object();
    public final Map c = new HashMap();
    public final afpa d;
    private final boolean f;

    public afny(afpa afpaVar, aunr aunrVar, hhb hhbVar) {
        this.d = afpaVar;
        this.a = aunrVar;
        agev agevVar = (agev) hhbVar.a;
        boolean z = false;
        if (agevVar.g() && (agevVar.c() instanceof afmy)) {
            z = true;
        }
        this.f = z;
    }

    public final afnv a(affd affdVar) {
        cc ccVarB;
        afpa afpaVarE;
        Object qdvVar;
        boolean z = this.f;
        Set setB = b();
        if (!z && !setB.isEmpty() && (setB.size() != 1 || !setB.contains(affdVar))) {
            IllegalStateException illegalStateException = new IllegalStateException(a.bX(affdVar, setB, "There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: ", "\n\tNew AccountId: "));
            agrc agrcVar = (agrc) ((agrc) ((agrc) e.b()).j(illegalStateException)).k("com/google/apps/tiktok/inject/account/ScreenAccountComponentManagers", "createManager", 99, "ScreenAccountComponentManagers.java");
            qdq qdqVar = new qdq(setB.size());
            if (setB.size() == 1) {
                qdvVar = new qdr(((affd) aguu.C(setB.iterator())).a != -1);
            } else {
                qdvVar = new qdv("N/A");
            }
            agrcVar.E("There is already an account id in use! TikTok does not support multiple accounts yet. # of current account ids: %s, current account valid: %s, new account valid: %s", qdqVar, qdvVar, new qdr(affdVar.a != -1));
            throw illegalStateException;
        }
        aunr aunrVar = this.a;
        int iD = aunrVar.d() - 1;
        Activity activityA = null;
        if (iD == 0) {
            ccVarB = null;
            activityA = aunrVar.a();
            afpaVarE = null;
        } else if (iD != 1) {
            ccVarB = aunrVar.b();
            afpaVarE = null;
        } else {
            afpaVarE = aunrVar.e();
            ccVarB = null;
        }
        return new afnv(affdVar, new afol(activityA, afpaVarE, ccVarB), this.d);
    }

    public final Set b() {
        Set setUnmodifiableSet;
        synchronized (this.b) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.c.keySet());
        }
        return setUnmodifiableSet;
    }
}
