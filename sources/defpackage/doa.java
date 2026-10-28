package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doa extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doa(awoq awoqVar, awqg awqgVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = awqgVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            doa doaVar = new doa((awqk) this.a, awoqVar, 0);
            doaVar.b = obj;
            return doaVar;
        }
        if (i == 1) {
            doa doaVar2 = new doa((Set) this.a, awoqVar, 1);
            doaVar2.b = obj;
            return doaVar2;
        }
        if (i != 2) {
            doa doaVar3 = new doa((awqg) this.a, awoqVar, 3);
            doaVar3.b = obj;
            return doaVar3;
        }
        doa doaVar4 = new doa(awoqVar, (awqg) this.a, 2);
        doaVar4.b = obj;
        return doaVar4;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((doa) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((doa) create((bhj) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 2) {
            return ((doa) create((bhj) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((doa) create((dnq) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.$cid;
        boolean z = false;
        if (i == 0) {
            atqp.j(obj);
            awos awosVar = ((awut) this.b).b().get(awor.j);
            awosVar.getClass();
            awor aworVar = (awor) awosVar;
            awuk awukVar = new awuk();
            awro.s(awvx.a, aworVar, 4, new axbh(awukVar, (awqk) this.a, (awoq) null, 1));
            while (!awukVar.kI()) {
                try {
                    return awqx.l(aworVar, new dnz(awukVar, (awoq) null, 0));
                } catch (InterruptedException unused) {
                }
            }
            return awukVar.kF();
        }
        if (i != 1) {
            if (i != 2) {
                atqp.j(obj);
                this.a.invoke((bhj) this.b);
                return awmy.a;
            }
            atqp.j(obj);
            dnq dnqVar = (dnq) this.b;
            dnqVar.getClass();
            return this.a.invoke(dnqVar.b());
        }
        bhj bhjVar = (bhj) this.b;
        atqp.j(obj);
        Set setKeySet = bhjVar.c().keySet();
        ArrayList arrayList = new ArrayList(atqq.N(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((bhi) it.next()).a);
        }
        ?? r6 = this.a;
        if (r6 == bhf.a) {
            z = true;
            break;
        }
        if (!r6.isEmpty()) {
            Iterator it2 = r6.iterator();
            while (it2.hasNext()) {
                if (!arrayList.contains((String) it2.next())) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doa(awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = awqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doa(awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doa(Set set, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = set;
    }
}
