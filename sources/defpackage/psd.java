package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class psd extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ pse g;
    final /* synthetic */ aier h;
    final /* synthetic */ plv i;
    final /* synthetic */ String j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psd(pse pseVar, aier aierVar, plv plvVar, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.g = pseVar;
        this.h = aierVar;
        this.i = plvVar;
        this.j = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        psd psdVar = new psd(this.g, this.h, this.i, this.j, awoqVar);
        psdVar.k = obj;
        return psdVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((psd) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [axff] */
    /* JADX WARN: Type inference failed for: r13v5, types: [axff] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awut awutVar;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        awut awutVar2;
        Throwable th;
        ?? r13;
        ?? r14;
        awox awoxVar = awox.a;
        int i = this.f;
        try {
            if (i == 0) {
                atqp.j(obj);
                awutVar = (awut) this.k;
                pse pseVar = this.g;
                obj2 = this.h;
                plv plvVar = this.i;
                obj3 = this.j;
                this.k = awutVar;
                axff axffVar = pseVar.c;
                this.a = axffVar;
                this.b = pseVar;
                this.c = obj2;
                this.d = plvVar;
                this.e = obj3;
                this.f = 1;
                if (axffVar.a(this) == awoxVar) {
                    return awoxVar;
                }
                obj4 = plvVar;
                obj6 = pseVar;
                obj5 = axffVar;
            } else {
                if (i != 1) {
                    axff axffVar2 = (axff) this.k;
                    try {
                        atqp.j(obj);
                        r14 = axffVar2;
                        r14.c();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = axffVar2;
                        r13.c();
                        throw th;
                    }
                }
                obj3 = this.e;
                obj4 = this.d;
                obj2 = this.c;
                Object obj7 = this.b;
                Object obj8 = this.a;
                awutVar = (awut) this.k;
                atqp.j(obj);
                obj6 = obj7;
                obj5 = obj8;
            }
            this.k = obj5;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = 2;
            agsn agsnVar = pse.a;
            obj = ((pse) obj6).g(awutVar2, (aier) obj2, true, (plv) obj4, (String) obj3, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            r14 = obj5;
            r14.c();
            return obj;
        } catch (Throwable th3) {
            th = th3;
            r13 = obj5;
            r13.c();
            throw th;
        }
        awutVar2 = awutVar;
    }
}
