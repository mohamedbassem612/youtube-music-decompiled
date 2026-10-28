package defpackage;

import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qbr extends awpk implements awqk {
    Object a;
    int b;
    int c;
    final /* synthetic */ StatusBarNotification d;
    final /* synthetic */ qbs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbr(StatusBarNotification statusBarNotification, qbs qbsVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = statusBarNotification;
        this.e = qbsVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new qbr(this.d, this.e, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((qbr) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? G;
        int iA;
        plx plxVar;
        qbs qbsVar;
        agke agkeVarQ;
        awox awoxVar = awox.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                atqp.j(obj);
            } else {
                iA = this.b;
                Object obj2 = this.a;
                atqp.j(obj);
                G = obj2;
            }
            return Boolean.TRUE;
        }
        atqp.j(obj);
        StatusBarNotification statusBarNotification = this.d;
        G = pjx.g(statusBarNotification);
        if (G == 0 || G.length() == 0) {
            agsn agsnVar = qbs.a;
            return Boolean.FALSE;
        }
        iA = pjx.a(statusBarNotification);
        if (iA == 0) {
            agsn agsnVar2 = qbs.a;
            return Boolean.FALSE;
        }
        if (iA != -1) {
            qbs qbsVar2 = this.e;
            this.a = G;
            this.b = iA;
            this.c = 1;
            obj = qbsVar2.b.c(this);
            if (obj == awoxVar) {
                G = G;
                return awoxVar;
            }
        } else {
            plxVar = null;
        }
        qbsVar = this.e;
        agkeVarQ = agke.q(G);
        this.a = null;
        this.c = 2;
        if (qbsVar.f(plxVar, agkeVarQ, this) == awoxVar) {
            return awoxVar;
        }
        return Boolean.TRUE;
        G = G;
        pky pkyVar = (pky) obj;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu != 1) {
                throw new awmj();
            }
            ((agsj) ((agsj) qbs.a.c()).j(((pku) pkyVar).b())).t("Failed to fetch accounts from storage, not removing provided notification.");
            return Boolean.FALSE;
        }
        Iterator it = ((List) ((pla) pkyVar).a).iterator();
        do {
            if (!it.hasNext()) {
                plxVar = null;
                break;
            }
            plxVar = (plx) it.next();
        } while (!pjx.i(iA, plxVar));
        if (plxVar == null) {
            ((agsj) qbs.a.c()).u("No matching account found for Chime notification with the account hash %s.", iA);
            return Boolean.FALSE;
        }
        qbsVar = this.e;
        agkeVarQ = agke.q(G);
        this.a = null;
        this.c = 2;
        if (qbsVar.f(plxVar, agkeVarQ, this) == awoxVar) {
            return awoxVar;
        }
        return Boolean.TRUE;
    }
}
