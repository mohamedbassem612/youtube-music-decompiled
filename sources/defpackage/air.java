package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class air implements awzd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public air(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Type inference failed for: r5v1, types: [aia, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [axo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aia, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [awzd, java.lang.Object] */
    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        ben benVar;
        int i = this.$cid;
        if (i == 0) {
            this.a.f(obj);
            return awmy.a;
        }
        if (i == 1) {
            this.a.f(obj);
            return awmy.a;
        }
        if (i != 2) {
            if (i == 3) {
                this.a.accept(obj);
                return awmy.a;
            }
            Object obj2 = this.a;
            if (i != 4) {
                ((awrm) obj2).a = obj;
                throw new axbd(this);
            }
            ((awrm) obj2).a = obj;
            throw new axbd(this);
        }
        if (awoqVar instanceof ben) {
            benVar = (ben) awoqVar;
            int i2 = benVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                benVar.b = i2 - Integer.MIN_VALUE;
            } else {
                benVar = new ben(this, awoqVar);
            }
        } else {
            benVar = new ben(this, awoqVar);
        }
        Object obj3 = benVar.a;
        awox awoxVar = awox.a;
        int i3 = benVar.b;
        if (i3 == 0) {
            atqp.j(obj3);
            ?? r5 = this.a;
            bgk bgkVar = (bgk) obj;
            if (bgkVar instanceof bge) {
                throw ((bge) bgkVar).a;
            }
            if (!(bgkVar instanceof bdw)) {
                if ((bgkVar instanceof bgb) || (bgkVar instanceof bgn) || (bgkVar instanceof bgc)) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new awmj();
            }
            Object obj4 = ((bdw) bgkVar).a;
            benVar.c = null;
            benVar.d = null;
            benVar.e = null;
            benVar.f = null;
            benVar.b = 1;
            if (r5.emit(obj4, benVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj5 = benVar.f;
            Object obj6 = benVar.e;
            Object obj7 = benVar.d;
            Object obj8 = benVar.c;
            atqp.j(obj3);
        }
        return awmy.a;
    }
}
