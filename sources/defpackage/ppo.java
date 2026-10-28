package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ppo extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ ppv f;
    final /* synthetic */ String g;
    final /* synthetic */ String h = "oauth2:https://www.googleapis.com/auth/notifications";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppo(ppv ppvVar, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.f = ppvVar;
        this.g = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new ppo(this.f, this.g, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ppo) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [axff] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [axff] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Throwable th;
        ?? r5;
        Object obj6 = awox.a;
        int i = this.e;
        try {
            if (i == 0) {
                atqp.j(obj);
                ppv ppvVar = this.f;
                String str = this.g;
                obj2 = this.h;
                axff axffVar = ppvVar.d;
                this.a = axffVar;
                this.b = ppvVar;
                this.c = str;
                this.d = obj2;
                this.e = 1;
                if (axffVar.a(this) != obj6) {
                    obj3 = str;
                    obj5 = ppvVar;
                    obj4 = axffVar;
                }
                return obj6;
            }
            if (i != 1) {
                r5 = this.a;
                try {
                    atqp.j(obj);
                    r5 = r5;
                    obj6 = (pky) obj;
                    r5.c();
                    return obj6;
                } catch (Throwable th2) {
                    th = th2;
                    r5.c();
                    throw th;
                }
            }
            obj2 = this.d;
            obj3 = this.c;
            Object obj7 = this.b;
            Object obj8 = this.a;
            atqp.j(obj);
            obj5 = obj7;
            obj4 = obj8;
            this.a = obj4;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 2;
            int i2 = ppv.h;
            obj = ((ppv) obj5).m((String) obj3, (String) obj2, this);
            if (obj != obj6) {
                r5 = obj4;
                obj6 = (pky) obj;
                r5.c();
            }
            return obj6;
        } catch (Throwable th3) {
            th = th3;
            r5 = obj4;
            r5.c();
            throw th;
        }
    }
}
