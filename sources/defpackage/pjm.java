package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pjm extends awpk implements awqg {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjm(pjv pjvVar, Context context, String str, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = pjvVar;
        this.c = context;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        pjm pjmVar;
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            pjv pjvVar = (pjv) obj;
            pjmVar = new pjm(pjvVar, (Context) this.c, (pjw) this.d, awoqVar, 0);
        } else {
            if (i != 1) {
                Object obj2 = this.c;
                return new pjm((pvz) obj2, (String) this.b, (List) this.d, awoqVar, 2);
            }
            Object obj3 = this.b;
            pjv pjvVar2 = (pjv) obj3;
            pjmVar = new pjm(pjvVar2, (Context) this.c, (String) this.d, awoqVar, 1);
        }
        return pjmVar;
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((pjm) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((pjm) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        return ((pjm) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        pky pkyVar;
        int i = this.$cid;
        if (i == 0) {
            awox awoxVar = awox.a;
            int i2 = this.a;
            atqp.j(obj);
            if (i2 == 0) {
                Object obj2 = this.b;
                Object obj3 = this.c;
                Object obj4 = this.d;
                this.a = 1;
                pjw pjwVar = (pjw) obj4;
                if (((pjv) obj2).l((Context) obj3, pjwVar.b, pjwVar.c, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i == 1) {
            awox awoxVar2 = awox.a;
            int i3 = this.a;
            atqp.j(obj);
            if (i3 == 0) {
                Object obj5 = this.b;
                Object obj6 = this.c;
                Object obj7 = this.d;
                this.a = 1;
                if (((pjv) obj5).l((Context) obj6, 0, (String) obj7, this) == awoxVar2) {
                    return awoxVar2;
                }
            }
            return awmy.a;
        }
        awox awoxVar3 = awox.a;
        int i4 = this.a;
        atqp.j(obj);
        if (i4 == 0) {
            pvz pvzVar = (pvz) this.c;
            if (pvzVar.d.get() == null) {
                this.a = 1;
                obj = pvzVar.f(3, this);
                if (obj == awoxVar3) {
                    return awoxVar3;
                }
                pkyVar = (pky) obj;
                if (pkyVar instanceof pku) {
                    return new pkv("Failed to get experiments from storage.", pkx.e);
                }
            }
        } else {
            pkyVar = (pky) obj;
            if (pkyVar instanceof pku) {
                return new pkv("Failed to get experiments from storage.", pkx.e);
            }
        }
        Map map = (Map) ((pvz) this.c).d.get();
        if (map == null) {
            map = awnp.a;
        }
        return new pla(pvz.d(map, (String) this.b, this.d));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjm(pjv pjvVar, Context context, pjw pjwVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = pjvVar;
        this.c = context;
        this.d = pjwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjm(pvz pvzVar, String str, List list, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.c = pvzVar;
        this.b = str;
        this.d = list;
    }
}
