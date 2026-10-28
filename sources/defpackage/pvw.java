package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pvw extends awpk implements awqg {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvw(dmq dmqVar, awqg awqgVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = dmqVar;
        this.c = awqgVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        int i = this.$cid;
        Object obj = this.b;
        if (i != 0) {
            return new pvw((dmq) obj, (awqg) this.c, awoqVar, 1);
        }
        return new pvw((pvz) obj, (List) this.c, awoqVar, 0);
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.$cid != 0) {
            return ((pvw) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        return ((pvw) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.$cid != 0) {
            awox awoxVar = awox.a;
            try {
                if (this.a != 0) {
                    atqp.j(obj);
                } else {
                    atqp.j(obj);
                    ((dmq) this.b).m();
                    ?? r4 = this.c;
                    this.a = 1;
                    obj = r4.invoke(this);
                    if (obj == awoxVar) {
                        return awoxVar;
                    }
                }
                ((dmq) this.b).p();
                ((dmq) this.b).n();
                return obj;
            } catch (Throwable th) {
                ((dmq) this.b).n();
                throw th;
            }
        }
        awox awoxVar2 = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            pvz pvzVar = (pvz) this.b;
            Map map = (Map) pvzVar.d.get();
            if (map != null) {
                return new pla(pvz.c(map, this.c));
            }
            this.a = 1;
            obj = pvzVar.f(3, this);
            if (obj == awoxVar2) {
                return awoxVar2;
            }
        }
        pky pkyVar = (pky) obj;
        if (pkyVar instanceof pku) {
            int i2 = pvz.f;
            ((pku) pkyVar).b();
            return new pkv("Failed to get experiments from storage.", pkx.e);
        }
        Map map2 = (Map) ((pvz) this.b).d.get();
        if (map2 == null) {
            map2 = awnp.a;
        }
        return new pla(pvz.c(map2, this.c));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvw(pvz pvzVar, List list, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = pvzVar;
        this.c = list;
    }
}
