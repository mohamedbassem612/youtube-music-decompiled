package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class beg extends awpk implements awqg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    int h;
    final /* synthetic */ bfp i;
    final /* synthetic */ awqk j;
    final /* synthetic */ bgg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beg(bfp bfpVar, awqk awqkVar, bgg bggVar, awoq awoqVar) {
        super(1, awoqVar);
        this.i = bfpVar;
        this.j = awqkVar;
        this.k = bggVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new beg(this.i, this.j, this.k, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((beg) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:31:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:17:0x009c->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [axff] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v7, types: [axff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v9, types: [axff] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r10;
        Object obj2;
        awrm awrmVar;
        Object obj3;
        bef befVar;
        Object obj4;
        ?? r1;
        Object obj5;
        ?? it;
        awqk awqkVar;
        ?? r2;
        Object obj6;
        int iHashCode;
        int i;
        awox awoxVar = awox.a;
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 == 1) {
                awrmVar = (awrm) this.d;
                Object obj7 = this.c;
                Object obj8 = this.b;
                Object obj9 = this.a;
                atqp.j(obj);
                r10 = obj9;
                obj2 = obj8;
                obj3 = obj7;
            } else if (i2 == 2) {
                Object obj10 = this.f;
                befVar = (bef) this.d;
                obj3 = this.c;
                obj2 = this.b;
                Object obj11 = this.a;
                atqp.j(obj);
                it = obj10;
                r10 = obj11;
                while (it.hasNext()) {
                    awqkVar = (awqk) it.next();
                    this.a = r10;
                    this.b = obj2;
                    this.c = obj3;
                    this.d = befVar;
                    this.e = null;
                    this.f = it;
                    this.h = 2;
                    if (awqkVar.invoke(befVar, this) == awoxVar) {
                        return awoxVar;
                    }
                }
                obj4 = obj2;
                r1 = r10;
                this.k.b = null;
                this.a = null;
                this.b = obj4;
                this.c = obj3;
                this.d = null;
                this.e = r1;
                this.f = null;
                this.h = 3;
                if (r1.a(this) != awoxVar) {
                    return awoxVar;
                }
                obj5 = obj3;
                r2 = r1;
                ((awri) obj4).a = true;
                r2.c();
                obj6 = ((awrm) obj5).a;
                if (obj6 != null) {
                }
                ayq ayqVarN = this.i.n();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = obj6;
                this.g = iHashCode;
                this.h = 4;
                obj = ayqVarN.h();
                if (obj == awoxVar) {
                    return awoxVar;
                }
                i = iHashCode;
            } else if (i2 != 3) {
                i = this.g;
                obj6 = this.e;
                atqp.j(obj);
            } else {
                axff axffVar = (axff) this.e;
                obj5 = this.c;
                obj4 = this.b;
                atqp.j(obj);
                r2 = axffVar;
                try {
                    ((awri) obj4).a = true;
                    r2.c();
                    obj6 = ((awrm) obj5).a;
                    iHashCode = obj6 != null ? obj6.hashCode() : 0;
                    ayq ayqVarN2 = this.i.n();
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = obj6;
                    this.g = iHashCode;
                    this.h = 4;
                    obj = ayqVarN2.h();
                    if (obj == awoxVar) {
                        return awoxVar;
                    }
                    i = iHashCode;
                } catch (Throwable th) {
                    r2.c();
                    throw th;
                }
            }
            return new bdw(obj6, i, ((Number) obj).intValue());
        }
        atqp.j(obj);
        axfi axfiVar = new axfi(false);
        awri awriVar = new awri();
        awrm awrmVar2 = new awrm();
        bfp bfpVar = this.i;
        awqk awqkVar2 = this.j;
        this.a = axfiVar;
        this.b = awriVar;
        this.c = awrmVar2;
        this.d = awrmVar2;
        this.h = 1;
        Object objH = bfpVar.h(true, awqkVar2, this);
        if (objH == awoxVar) {
            return awoxVar;
        }
        r10 = axfiVar;
        obj2 = awriVar;
        awrmVar = awrmVar2;
        obj = objH;
        obj3 = awrmVar;
        awrmVar.a = ((bdw) obj).a;
        befVar = new bef(r10, (awri) obj2, (awrm) obj3, this.i);
        List list = this.k.b;
        if (list != null) {
            it = list.iterator();
            r10 = r10;
            while (it.hasNext()) {
                awqkVar = (awqk) it.next();
                this.a = r10;
                this.b = obj2;
                this.c = obj3;
                this.d = befVar;
                this.e = null;
                this.f = it;
                this.h = 2;
                if (awqkVar.invoke(befVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
        }
        obj4 = obj2;
        r1 = r10;
        this.k.b = null;
        this.a = null;
        this.b = obj4;
        this.c = obj3;
        this.d = null;
        this.e = r1;
        this.f = null;
        this.h = 3;
        if (r1.a(this) != awoxVar) {
            return awoxVar;
        }
        obj5 = obj3;
        r2 = r1;
        ((awri) obj4).a = true;
        r2.c();
        obj6 = ((awrm) obj5).a;
        if (obj6 != null) {
        }
        ayq ayqVarN3 = this.i.n();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = obj6;
        this.g = iHashCode;
        this.h = 4;
        obj = ayqVarN3.h();
        if (obj == awoxVar) {
            return awoxVar;
        }
        i = iHashCode;
        return new bdw(obj6, i, ((Number) obj).intValue());
    }
}
