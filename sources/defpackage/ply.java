package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ply extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ply(pfa pfaVar, plx plxVar, long j, aidy aidyVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = pfaVar;
        this.e = plxVar;
        this.b = j;
        this.c = aidyVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pma] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        ply plyVar;
        int i = this.$cid;
        if (i == 0) {
            ?? r1 = this.c;
            Object obj2 = this.d;
            Intent intent = (Intent) obj2;
            plyVar = new ply((pma) r1, intent, (plb) this.e, this.b, awoqVar, 0);
        } else {
            if (i != 1) {
                Object obj3 = this.c;
                Object obj4 = this.e;
                return new ply((pnm) obj3, (pmi) obj4, (Context) this.d, this.b, awoqVar, 2);
            }
            Object obj5 = this.d;
            pfa pfaVar = (pfa) obj5;
            plyVar = new ply(pfaVar, (plx) this.e, this.b, (aidy) this.c, awoqVar, 1);
        }
        return plyVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((ply) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((ply) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((ply) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pma] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.$cid;
        if (i == 0) {
            awox awoxVar = awox.a;
            int i2 = this.a;
            atqp.j(obj);
            if (i2 == 0) {
                ?? r2 = this.c;
                Object obj2 = this.d;
                Object obj3 = this.e;
                long j = this.b;
                this.a = 1;
                if (r2.c((Intent) obj2, (plb) obj3, j, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i != 1) {
            awox awoxVar2 = awox.a;
            int i3 = this.a;
            atqp.j(obj);
            if (i3 == 0) {
                Object obj4 = this.c;
                Object obj5 = this.e;
                plb plbVarB = qnl.ab((Context) this.d) ? plb.b(auvg.a.io().a()) : plb.c();
                pmk pmkVar = ((pnm) obj4).a;
                long j2 = this.b;
                this.a = 1;
                if (pmkVar.b((pmi) obj5, plbVarB, j2, this) == awoxVar2) {
                    return awoxVar2;
                }
            }
            return awmy.a;
        }
        awox awoxVar3 = awox.a;
        if (this.a != 0) {
            atqp.j(obj);
        } else {
            atqp.j(obj);
            qpj.b();
            Bundle bundle = new Bundle();
            Object obj6 = this.e;
            long j3 = this.b;
            Object obj7 = this.c;
            plx plxVar = (plx) obj6;
            nvi.b(bundle, plxVar);
            bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", j3);
            bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", ((aidy) obj7).q);
            pfa pfaVar = (pfa) this.d;
            if (qnl.ab(pfaVar.a)) {
                aunn aunnVar = pfaVar.i;
                aunn aunnVar2 = pfaVar.e;
                this.a = 2;
                if (pfaVar.e(plxVar, 2, aunnVar, aunnVar2, bundle, null, this) == awoxVar3) {
                    return awoxVar3;
                }
            } else {
                Object objIo = pfaVar.e.io();
                objIo.getClass();
                this.a = 1;
                if (((qbh) objIo).c(bundle, this) == awoxVar3) {
                    return awoxVar3;
                }
            }
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ply(pma pmaVar, Intent intent, plb plbVar, long j, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pmaVar;
        this.d = intent;
        this.e = plbVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ply(pnm pnmVar, pmi pmiVar, Context context, long j, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pnmVar;
        this.e = pmiVar;
        this.d = context;
        this.b = j;
    }
}
