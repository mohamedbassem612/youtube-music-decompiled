package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vzb extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    boolean d;
    int e;
    final /* synthetic */ aiqi f;
    final /* synthetic */ aesp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzb(aesp aespVar, aiqi aiqiVar, awoq awoqVar) {
        super(2, awoqVar);
        this.g = aespVar;
        this.f = aiqiVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new vzb(this.g, this.f, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((vzb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:7:0x0014, B:25:0x008a, B:27:0x0093, B:29:0x00b9, B:32:0x00e1), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:7:0x0014, B:25:0x008a, B:27:0x0093, B:29:0x00b9, B:32:0x00e1), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #2 {all -> 0x00ec, blocks: (B:7:0x0014, B:25:0x008a, B:27:0x0093, B:29:0x00b9, B:32:0x00e1), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [axff] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [axff] */
    /* JADX WARN: Type inference failed for: r3v13, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [axff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        ?? r6;
        Throwable th;
        ?? r13;
        Object obj4;
        Object obj5;
        ?? r3;
        ?? r4;
        boolean zBooleanValue;
        Object objA;
        boolean z;
        ?? r14;
        boolean zBooleanValue2;
        awox awoxVar = awox.a;
        int i = this.e;
        try {
            if (i == 0) {
                atqp.j(obj);
                aesp aespVar = this.g;
                obj2 = this.f;
                ?? r7 = aespVar.b;
                this.a = r7;
                this.b = aespVar;
                this.c = obj2;
                this.e = 1;
                if (r7.a(this) == awoxVar) {
                    return awoxVar;
                }
                obj3 = aespVar;
                r6 = r7;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        z = this.d;
                        obj5 = this.b;
                        r14 = this.a;
                        try {
                            atqp.j(obj);
                            r14 = r14;
                            zBooleanValue2 = ((Boolean) obj).booleanValue();
                            if (z) {
                                Object obj6 = ((aesp) obj5).i;
                                awro.t(((aesp) obj5).e, null, 0, new gme((aesp) obj5, (aiqx) ((vza) obj6).b, ((vza) obj6).a, (awoq) null, 15), 3);
                            }
                            if (zBooleanValue2) {
                                Object obj7 = ((aesp) obj5).g;
                                awro.t(((aesp) obj5).e, null, 0, new gme((aesp) obj5, (aiqj) ((vza) obj7).b, ((vza) obj7).a, (awoq) null, 16), 3);
                            }
                            if (z || zBooleanValue2) {
                                ((aesp) obj5).g();
                            }
                            r14.c();
                            return awmy.a;
                        } catch (Throwable th2) {
                            th = th2;
                            r13 = r14;
                            r13.c();
                            throw th;
                        }
                    }
                    Object obj8 = this.c;
                    Object obj9 = this.b;
                    Object obj10 = this.a;
                    try {
                        atqp.j(obj);
                        obj4 = obj8;
                        obj5 = obj9;
                        r3 = obj10;
                        try {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            Object obj11 = ((aesp) obj5).g;
                            this.a = r3;
                            this.b = obj5;
                            this.c = null;
                            this.d = zBooleanValue;
                            this.e = 3;
                            objA = ((vza) obj11).a((aiqi) obj4, this);
                            if (objA != awoxVar) {
                                return awoxVar;
                            }
                            z = zBooleanValue;
                            obj = objA;
                            r14 = r3;
                            zBooleanValue2 = ((Boolean) obj).booleanValue();
                            if (z) {
                                Object obj12 = ((aesp) obj5).i;
                                awro.t(((aesp) obj5).e, null, 0, new gme((aesp) obj5, (aiqx) ((vza) obj12).b, ((vza) obj12).a, (awoq) null, 15), 3);
                            }
                            if (zBooleanValue2) {
                                Object obj13 = ((aesp) obj5).g;
                                awro.t(((aesp) obj5).e, null, 0, new gme((aesp) obj5, (aiqj) ((vza) obj13).b, ((vza) obj13).a, (awoq) null, 16), 3);
                            }
                            if (z) {
                                ((aesp) obj5).g();
                            } else {
                                ((aesp) obj5).g();
                            }
                            r14.c();
                            return awmy.a;
                        } catch (Throwable th3) {
                            th = th3;
                            r4 = r3;
                            r13 = r4;
                            r13.c();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r4 = obj10;
                        r13 = r4;
                        r13.c();
                        throw th;
                    }
                }
                obj2 = this.c;
                obj3 = this.b;
                Object obj14 = this.a;
                atqp.j(obj);
                r6 = obj14;
            }
            Object obj15 = ((aesp) obj3).i;
            this.a = r6;
            this.b = obj3;
            this.c = obj2;
            this.e = 2;
            obj = ((vza) obj15).a((aiqi) obj2, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            obj4 = obj2;
            obj5 = obj3;
            r3 = r6;
            zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj16 = ((aesp) obj5).g;
            this.a = r3;
            this.b = obj5;
            this.c = null;
            this.d = zBooleanValue;
            this.e = 3;
            objA = ((vza) obj16).a((aiqi) obj4, this);
            if (objA != awoxVar) {
                return awoxVar;
            }
            z = zBooleanValue;
            obj = objA;
            r14 = r3;
            zBooleanValue2 = ((Boolean) obj).booleanValue();
            if (z) {
                Object obj17 = ((aesp) obj5).i;
                awro.t(((aesp) obj5).e, null, 0, new gme((aesp) obj5, (aiqx) ((vza) obj17).b, ((vza) obj17).a, (awoq) null, 15), 3);
            }
            if (zBooleanValue2) {
                Object obj18 = ((aesp) obj5).g;
                awro.t(((aesp) obj5).e, null, 0, new gme((aesp) obj5, (aiqj) ((vza) obj18).b, ((vza) obj18).a, (awoq) null, 16), 3);
            }
            if (z) {
                ((aesp) obj5).g();
            } else {
                ((aesp) obj5).g();
            }
            r14.c();
            return awmy.a;
        } catch (Throwable th5) {
            th = th5;
            r13 = r6;
            r13.c();
            throw th;
        }
    }
}
