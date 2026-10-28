package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ppl extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ ppv f;
    final /* synthetic */ ppf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppl(ppv ppvVar, ppf ppfVar, awoq awoqVar) {
        super(2, awoqVar);
        this.f = ppvVar;
        this.g = ppfVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new ppl(this.f, this.g, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ppl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [axff] */
    /* JADX WARN: Type inference failed for: r1v2, types: [axff] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v5, types: [axff] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v14, types: [axff] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r1;
        ppv ppvVar;
        Object obj2;
        awwq awwqVar;
        ppk ppkVar;
        Object obj3;
        Object obj4;
        ppg ppgVar;
        Object obj5;
        axff axffVar;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        ?? r3;
        ppv ppvVar2;
        ppg ppgVar2;
        awwq awwqVar2;
        ppk ppkVar2;
        ppg ppgVar3;
        awox awoxVar = awox.a;
        ?? r2 = this.e;
        try {
            try {
                try {
                    try {
                        switch (r2) {
                            case 0:
                                atqp.j(obj);
                                ppvVar = this.f;
                                obj2 = this.g;
                                pkx pkxVar = pkx.aC;
                                try {
                                    axff axffVar2 = ppvVar.d;
                                    this.a = pkxVar;
                                    this.b = ppvVar;
                                    this.c = obj2;
                                    this.d = axffVar2;
                                    this.e = 1;
                                    if (axffVar2.a(this) == awoxVar) {
                                        return awoxVar;
                                    }
                                    obj3 = pkxVar;
                                    obj4 = axffVar2;
                                    this.a = obj3;
                                    this.b = ppvVar;
                                    this.c = obj2;
                                    this.d = obj4;
                                    this.e = 2;
                                    int i = ppv.h;
                                    obj = ppvVar.n((ppf) obj2, this);
                                    r2 = obj4;
                                    if (obj == awoxVar) {
                                        return awoxVar;
                                    }
                                    ppgVar = (ppg) obj;
                                    r2.c();
                                    this.a = obj3;
                                    this.b = ppvVar;
                                    this.c = obj2;
                                    this.d = null;
                                    this.e = 3;
                                    int i2 = ppv.h;
                                    if (ppvVar.f(ppgVar, this) == awoxVar) {
                                        return awoxVar;
                                    }
                                    obj5 = obj3;
                                    int i3 = ppv.h;
                                    axffVar = ppvVar.d;
                                    this.a = obj5;
                                    this.b = ppvVar;
                                    this.c = obj2;
                                    this.d = axffVar;
                                    this.e = 4;
                                    if (axffVar.a(this) != awoxVar) {
                                        return awoxVar;
                                    }
                                    obj6 = obj5;
                                    obj7 = axffVar;
                                    this.a = obj6;
                                    this.b = ppvVar;
                                    this.c = obj2;
                                    this.d = obj7;
                                    this.e = 5;
                                    int i4 = ppv.h;
                                    obj = ppvVar.j((ppf) obj2, this);
                                    obj8 = obj6;
                                    if (obj == awoxVar) {
                                        return awoxVar;
                                    }
                                    obj9 = obj2;
                                    r3 = obj7;
                                    r2 = obj8;
                                    ppvVar2 = ppvVar;
                                    try {
                                        ppgVar2 = (ppg) obj;
                                        int i5 = ppv.h;
                                        String str = ((ppf) obj9).b;
                                        Long l = ppgVar2.c;
                                        try {
                                            r3.c();
                                            awwqVar2 = awwq.a;
                                            ppkVar2 = new ppk(ppvVar2, (ppf) obj9, null);
                                            this.a = r2;
                                            this.b = ppgVar2;
                                            this.c = null;
                                            this.d = null;
                                            this.e = 6;
                                            if (awro.p(awwqVar2, ppkVar2, this) != awoxVar) {
                                                return awoxVar;
                                            }
                                            ppgVar3 = ppgVar2;
                                            return new pla(ppgVar3);
                                        } catch (Throwable th) {
                                            th = th;
                                            obj2 = obj9;
                                            ppvVar = ppvVar2;
                                            r1 = r2;
                                            awwqVar = awwq.a;
                                            ppkVar = new ppk(ppvVar, (ppf) obj2, null);
                                            this.a = r1;
                                            this.b = th;
                                            this.c = null;
                                            this.d = null;
                                            this.e = 7;
                                            if (awro.p(awwqVar, ppkVar, this) == awoxVar) {
                                                return awoxVar;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r2 = r3;
                                        r2.c();
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    r1 = pkxVar;
                                    th = th3;
                                    awwqVar = awwq.a;
                                    ppkVar = new ppk(ppvVar, (ppf) obj2, null);
                                    this.a = r1;
                                    this.b = th;
                                    this.c = null;
                                    this.d = null;
                                    this.e = 7;
                                    if (awro.p(awwqVar, ppkVar, this) == awoxVar) {
                                        return awoxVar;
                                    }
                                    throw th;
                                }
                            case 1:
                                Object obj10 = this.d;
                                obj2 = this.c;
                                ppvVar = (ppv) this.b;
                                obj3 = this.a;
                                atqp.j(obj);
                                obj4 = obj10;
                                this.a = obj3;
                                this.b = ppvVar;
                                this.c = obj2;
                                this.d = obj4;
                                this.e = 2;
                                int i6 = ppv.h;
                                obj = ppvVar.n((ppf) obj2, this);
                                r2 = obj4;
                                if (obj == awoxVar) {
                                    return awoxVar;
                                }
                                ppgVar = (ppg) obj;
                                r2.c();
                                this.a = obj3;
                                this.b = ppvVar;
                                this.c = obj2;
                                this.d = null;
                                this.e = 3;
                                int i7 = ppv.h;
                                if (ppvVar.f(ppgVar, this) == awoxVar) {
                                    return awoxVar;
                                }
                                obj5 = obj3;
                                int i8 = ppv.h;
                                axffVar = ppvVar.d;
                                this.a = obj5;
                                this.b = ppvVar;
                                this.c = obj2;
                                this.d = axffVar;
                                this.e = 4;
                                if (axffVar.a(this) != awoxVar) {
                                    return awoxVar;
                                }
                                obj6 = obj5;
                                obj7 = axffVar;
                                this.a = obj6;
                                this.b = ppvVar;
                                this.c = obj2;
                                this.d = obj7;
                                this.e = 5;
                                int i9 = ppv.h;
                                obj = ppvVar.j((ppf) obj2, this);
                                obj8 = obj6;
                                if (obj == awoxVar) {
                                    return awoxVar;
                                }
                                obj9 = obj2;
                                r3 = obj7;
                                r2 = obj8;
                                ppvVar2 = ppvVar;
                                ppgVar2 = (ppg) obj;
                                int i10 = ppv.h;
                                String str2 = ((ppf) obj9).b;
                                Long l2 = ppgVar2.c;
                                r3.c();
                                awwqVar2 = awwq.a;
                                ppkVar2 = new ppk(ppvVar2, (ppf) obj9, null);
                                this.a = r2;
                                this.b = ppgVar2;
                                this.c = null;
                                this.d = null;
                                this.e = 6;
                                if (awro.p(awwqVar2, ppkVar2, this) != awoxVar) {
                                    return awoxVar;
                                }
                                ppgVar3 = ppgVar2;
                                return new pla(ppgVar3);
                            case 2:
                                Object obj11 = this.d;
                                obj2 = this.c;
                                ppvVar = (ppv) this.b;
                                obj3 = this.a;
                                atqp.j(obj);
                                r2 = obj11;
                                ppgVar = (ppg) obj;
                                r2.c();
                                this.a = obj3;
                                this.b = ppvVar;
                                this.c = obj2;
                                this.d = null;
                                this.e = 3;
                                int i11 = ppv.h;
                                if (ppvVar.f(ppgVar, this) == awoxVar) {
                                    return awoxVar;
                                }
                                obj5 = obj3;
                                int i12 = ppv.h;
                                axffVar = ppvVar.d;
                                this.a = obj5;
                                this.b = ppvVar;
                                this.c = obj2;
                                this.d = axffVar;
                                this.e = 4;
                                if (axffVar.a(this) != awoxVar) {
                                    return awoxVar;
                                }
                                obj6 = obj5;
                                obj7 = axffVar;
                                this.a = obj6;
                                this.b = ppvVar;
                                this.c = obj2;
                                this.d = obj7;
                                this.e = 5;
                                int i13 = ppv.h;
                                obj = ppvVar.j((ppf) obj2, this);
                                obj8 = obj6;
                                if (obj == awoxVar) {
                                    return awoxVar;
                                }
                                obj9 = obj2;
                                r3 = obj7;
                                r2 = obj8;
                                ppvVar2 = ppvVar;
                                ppgVar2 = (ppg) obj;
                                int i14 = ppv.h;
                                String str3 = ((ppf) obj9).b;
                                Long l3 = ppgVar2.c;
                                r3.c();
                                awwqVar2 = awwq.a;
                                ppkVar2 = new ppk(ppvVar2, (ppf) obj9, null);
                                this.a = r2;
                                this.b = ppgVar2;
                                this.c = null;
                                this.d = null;
                                this.e = 6;
                                if (awro.p(awwqVar2, ppkVar2, this) != awoxVar) {
                                    return awoxVar;
                                }
                                ppgVar3 = ppgVar2;
                                return new pla(ppgVar3);
                            case 3:
                                obj2 = this.c;
                                ppvVar = (ppv) this.b;
                                obj5 = this.a;
                                try {
                                    atqp.j(obj);
                                    obj5 = obj5;
                                    int i15 = ppv.h;
                                    axffVar = ppvVar.d;
                                    this.a = obj5;
                                    this.b = ppvVar;
                                    this.c = obj2;
                                    this.d = axffVar;
                                    this.e = 4;
                                    if (axffVar.a(this) != awoxVar) {
                                        return awoxVar;
                                    }
                                    obj6 = obj5;
                                    obj7 = axffVar;
                                    this.a = obj6;
                                    this.b = ppvVar;
                                    this.c = obj2;
                                    this.d = obj7;
                                    this.e = 5;
                                    int i16 = ppv.h;
                                    obj = ppvVar.j((ppf) obj2, this);
                                    obj8 = obj6;
                                    if (obj == awoxVar) {
                                        return awoxVar;
                                    }
                                    obj9 = obj2;
                                    r3 = obj7;
                                    r2 = obj8;
                                    ppvVar2 = ppvVar;
                                    ppgVar2 = (ppg) obj;
                                    int i17 = ppv.h;
                                    String str4 = ((ppf) obj9).b;
                                    Long l4 = ppgVar2.c;
                                    r3.c();
                                    awwqVar2 = awwq.a;
                                    ppkVar2 = new ppk(ppvVar2, (ppf) obj9, null);
                                    this.a = r2;
                                    this.b = ppgVar2;
                                    this.c = null;
                                    this.d = null;
                                    this.e = 6;
                                    if (awro.p(awwqVar2, ppkVar2, this) != awoxVar) {
                                        return awoxVar;
                                    }
                                    ppgVar3 = ppgVar2;
                                    return new pla(ppgVar3);
                                } catch (Throwable th4) {
                                    th = th4;
                                    r1 = obj5;
                                    awwqVar = awwq.a;
                                    ppkVar = new ppk(ppvVar, (ppf) obj2, null);
                                    this.a = r1;
                                    this.b = th;
                                    this.c = null;
                                    this.d = null;
                                    this.e = 7;
                                    if (awro.p(awwqVar, ppkVar, this) == awoxVar) {
                                        return awoxVar;
                                    }
                                    throw th;
                                }
                            case 4:
                                obj7 = this.d;
                                obj2 = this.c;
                                ppvVar = (ppv) this.b;
                                Object obj12 = this.a;
                                atqp.j(obj);
                                obj6 = obj12;
                                this.a = obj6;
                                this.b = ppvVar;
                                this.c = obj2;
                                this.d = obj7;
                                this.e = 5;
                                int i18 = ppv.h;
                                obj = ppvVar.j((ppf) obj2, this);
                                obj8 = obj6;
                                if (obj == awoxVar) {
                                    return awoxVar;
                                }
                                obj9 = obj2;
                                r3 = obj7;
                                r2 = obj8;
                                ppvVar2 = ppvVar;
                                ppgVar2 = (ppg) obj;
                                int i19 = ppv.h;
                                String str5 = ((ppf) obj9).b;
                                Long l5 = ppgVar2.c;
                                r3.c();
                                awwqVar2 = awwq.a;
                                ppkVar2 = new ppk(ppvVar2, (ppf) obj9, null);
                                this.a = r2;
                                this.b = ppgVar2;
                                this.c = null;
                                this.d = null;
                                this.e = 6;
                                if (awro.p(awwqVar2, ppkVar2, this) != awoxVar) {
                                    return awoxVar;
                                }
                                ppgVar3 = ppgVar2;
                                return new pla(ppgVar3);
                            case 5:
                                obj7 = this.d;
                                obj2 = this.c;
                                ppvVar = (ppv) this.b;
                                Object obj13 = this.a;
                                atqp.j(obj);
                                obj8 = obj13;
                                obj9 = obj2;
                                r3 = obj7;
                                r2 = obj8;
                                ppvVar2 = ppvVar;
                                ppgVar2 = (ppg) obj;
                                int i110 = ppv.h;
                                String str6 = ((ppf) obj9).b;
                                Long l6 = ppgVar2.c;
                                r3.c();
                                awwqVar2 = awwq.a;
                                ppkVar2 = new ppk(ppvVar2, (ppf) obj9, null);
                                this.a = r2;
                                this.b = ppgVar2;
                                this.c = null;
                                this.d = null;
                                this.e = 6;
                                if (awro.p(awwqVar2, ppkVar2, this) != awoxVar) {
                                    return awoxVar;
                                }
                                ppgVar3 = ppgVar2;
                                return new pla(ppgVar3);
                            case 6:
                                ppgVar3 = (ppg) this.b;
                                Object obj14 = this.a;
                                atqp.j(obj);
                                return new pla(ppgVar3);
                            default:
                                Throwable th5 = (Throwable) this.b;
                                Object obj15 = this.a;
                                atqp.j(obj);
                                throw th5;
                        }
                    } catch (Exception e) {
                        awro.A(getContext());
                        return new pkv(e, (pkx) r2);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r1 = obj3;
                }
            } catch (Throwable th7) {
                r2.c();
                throw th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }
}
