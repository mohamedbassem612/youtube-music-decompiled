package defpackage;

import android.accounts.Account;
import android.service.notification.StatusBarNotification;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class pke implements Comparator {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public pke(Comparator comparator, admy admyVar, int i) {
        this.$cid = i;
        this.b = comparator;
        this.a = admyVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, java.util.Comparator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            StatusBarNotification statusBarNotification = ((pkc) obj).b;
            pot potVar = (pot) this.b;
            nvk.e(potVar);
            pki pkiVar = (pki) this.a;
            Long lValueOf = Long.valueOf(pkiVar.f(statusBarNotification));
            StatusBarNotification statusBarNotification2 = ((pkc) obj2).b;
            nvk.e(potVar);
            return atqq.f(lValueOf, Long.valueOf(pkiVar.f(statusBarNotification2)));
        }
        if (i == 1) {
            pot potVar2 = ((pkc) obj).d;
            pot potVar3 = (pot) this.b;
            int iD = nvk.d(potVar3);
            pki pkiVar2 = (pki) this.a;
            return atqq.f(pkiVar2.e(iD, potVar3, potVar2), pkiVar2.e(nvk.d(potVar3), potVar3, ((pkc) obj2).d));
        }
        if (i != 2) {
            admy admyVar = (admy) this.a;
            return this.b.compare(admyVar.m(obj), admyVar.m(obj2));
        }
        ?? r4 = this.b;
        try {
            return ((Integer) new hlm((rlw) this.a, (Account) obj, (Account) obj2, (Comparator) r4, 11).call()).intValue();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new agfy(e2);
        }
    }

    public pke(pki pkiVar, pot potVar, int i) {
        this.$cid = i;
        this.a = pkiVar;
        this.b = potVar;
    }

    public /* synthetic */ pke(rlw rlwVar, Comparator comparator, int i) {
        this.$cid = i;
        this.a = rlwVar;
        this.b = comparator;
    }
}
