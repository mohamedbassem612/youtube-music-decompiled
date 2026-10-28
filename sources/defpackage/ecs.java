package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecs implements awzc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ecs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r7v8, types: [awzc, java.lang.Object] */
    @Override // defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) throws Throwable {
        ecq ecqVar;
        bem bemVar;
        if (this.$cid != 0) {
            if (awoqVar instanceof bem) {
                bemVar = (bem) awoqVar;
                int i = bemVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bemVar.b = i - Integer.MIN_VALUE;
                } else {
                    bemVar = new bem(this, awoqVar);
                }
            } else {
                bemVar = new bem(this, awoqVar);
            }
            Object obj = bemVar.a;
            awox awoxVar = awox.a;
            int i2 = bemVar.b;
            if (i2 == 0) {
                atqp.j(obj);
                ?? r7 = this.a;
                air airVar = new air(awzdVar, 2);
                bemVar.c = null;
                bemVar.d = null;
                bemVar.e = null;
                bemVar.b = 1;
                if (r7.collect(airVar, bemVar) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = bemVar.e;
                Object obj3 = bemVar.d;
                Object obj4 = bemVar.c;
                atqp.j(obj);
            }
            return awmy.a;
        }
        if (awoqVar instanceof ecq) {
            ecqVar = (ecq) awoqVar;
            int i3 = ecqVar.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ecqVar.b = i3 - Integer.MIN_VALUE;
            } else {
                ecqVar = new ecq(this, awoqVar);
            }
        } else {
            ecqVar = new ecq(this, awoqVar);
        }
        Object obj5 = ecqVar.a;
        awox awoxVar2 = awox.a;
        int i4 = ecqVar.b;
        if (i4 == 0) {
            atqp.j(obj5);
            Object obj6 = this.a;
            afgx afgxVar = new afgx(obj6, 1);
            ecr ecrVar = new ecr(null);
            ecqVar.d = null;
            ecqVar.e = null;
            ecqVar.f = null;
            ecqVar.b = 1;
            if (awqx.n(awzdVar, (awzc[]) obj6, afgxVar, ecrVar, ecqVar) == awoxVar2) {
                return awoxVar2;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj7 = ecqVar.f;
            Object obj8 = ecqVar.e;
            Object obj9 = ecqVar.d;
            atqp.j(obj5);
        }
        return awmy.a;
    }
}
