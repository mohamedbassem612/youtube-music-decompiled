package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbs extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    /* synthetic */ Object a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbs(awoq awoqVar, awqg awqgVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqgVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            pbs pbsVar = new pbs((awqg) this.b, awoqVar, 0);
            pbsVar.a = obj;
            return pbsVar;
        }
        if (i == 1) {
            pbs pbsVar2 = new pbs(awoqVar, (awqg) this.b, 1);
            pbsVar2.a = obj;
            return pbsVar2;
        }
        if (i == 2) {
            pbs pbsVar3 = new pbs((awrm) this.b, awoqVar, 2);
            pbsVar3.a = obj;
            return pbsVar3;
        }
        if (i != 3) {
            pbs pbsVar4 = new pbs((Map) this.b, awoqVar, 4);
            pbsVar4.a = obj;
            return pbsVar4;
        }
        pbs pbsVar5 = new pbs((String) this.b, awoqVar, 3);
        pbsVar5.a = obj;
        return pbsVar5;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((pbs) create((pbu) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((pbs) create((dnq) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 2) {
            return ((pbs) create((pym) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 3) {
            return ((pbs) create((uje) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pbs) create((pym) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.$cid;
        if (i == 0) {
            atqp.j(obj);
            return this.b.invoke((pbu) this.a);
        }
        if (i == 1) {
            atqp.j(obj);
            dnq dnqVar = (dnq) this.a;
            dnqVar.getClass();
            return this.b.invoke(dnqVar.b());
        }
        if (i == 2) {
            atqp.j(obj);
            aihf builder = ((pym) this.a).toBuilder();
            builder.getClass();
            qnl.I((String) ((awrm) this.b).a, builder);
            return qnl.H(builder);
        }
        if (i == 3) {
            atqp.j(obj);
            aihf builder2 = ((pym) this.a).toBuilder();
            builder2.getClass();
            qnl.J((String) this.b, builder2);
            return qnl.H(builder2);
        }
        atqp.j(obj);
        aihf builder3 = ((uje) this.a).toBuilder();
        builder3.copyOnWrite();
        uje ujeVar = (uje) builder3.instance;
        aiip aiipVar = ujeVar.c;
        if (!aiipVar.b) {
            ujeVar.c = aiipVar.a();
        }
        ujeVar.c.putAll(this.b);
        aihn aihnVarBuild = builder3.build();
        aihnVarBuild.getClass();
        return aihnVarBuild;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbs(awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbs(awrm awrmVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awrmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbs(String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbs(Map map, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = map;
    }
}
