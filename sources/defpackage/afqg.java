package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class afqg extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqg(awoq awoqVar, axff axffVar, awqk awqkVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = axffVar;
        this.c = awqkVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [axff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [axff, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            afqg afqgVar = new afqg(awoqVar, (axff) this.b, (awqk) this.c, 0);
            afqgVar.d = obj;
            return afqgVar;
        }
        ?? r3 = this.b;
        if (i == 1) {
            afqg afqgVar2 = new afqg(awoqVar, r3, this.c, 1, null);
            afqgVar2.d = obj;
            return afqgVar2;
        }
        afqg afqgVar3 = new afqg((axbo) r3, (awzd) this.c, awoqVar, 2);
        afqgVar3.d = obj;
        return afqgVar3;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((afqg) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((afqg) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((afqg) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [axff] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [axff] */
    /* JADX WARN: Type inference failed for: r8v3, types: [axff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [axff, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r6;
        ?? r7;
        ?? r8;
        ?? r9;
        int i = this.$cid;
        if (i == 0) {
            awox awoxVar = awox.a;
            int i2 = this.a;
            try {
                if (i2 != 0) {
                    axff axffVar = (axff) this.d;
                    if (i2 != 1) {
                        atqp.j(obj);
                        r7 = axffVar;
                    } else {
                        atqp.j(obj);
                        r6 = axffVar;
                    }
                    r7.c();
                    return awmy.a;
                }
                atqp.j(obj);
                ?? r10 = this.b;
                this.d = r10;
                this.a = 1;
                if (r10.a(this) == awoxVar) {
                    return awoxVar;
                }
                r6 = r10;
                dmr dmrVar = new dmr((awqk) this.c, (awoq) null, 3, (char[]) null);
                this.d = r6;
                this.a = 2;
                r7 = r6;
                if (awrc.J(dmrVar, this) == awoxVar) {
                    return awoxVar;
                }
                r7.c();
                return awmy.a;
            } catch (Throwable th) {
                r7.c();
                throw th;
            }
        }
        if (i != 1) {
            awox awoxVar2 = awox.a;
            int i3 = this.a;
            atqp.j(obj);
            if (i3 == 0) {
                awut awutVar = (awut) this.d;
                awrm awrmVar = new awrm();
                axbo axboVar = (axbo) this.b;
                axbn axbnVar = new axbn(awrmVar, awutVar, axboVar, this.c);
                this.a = 1;
                if (axboVar.d.collect(axbnVar, this) == awoxVar2) {
                    return awoxVar2;
                }
            }
            return awmy.a;
        }
        awox awoxVar3 = awox.a;
        int i4 = this.a;
        try {
            if (i4 != 0) {
                axff axffVar2 = (axff) this.d;
                if (i4 != 1) {
                    atqp.j(obj);
                    r9 = axffVar2;
                } else {
                    atqp.j(obj);
                    r8 = axffVar2;
                }
                r9.c();
                return awmy.a;
            }
            atqp.j(obj);
            ?? r11 = this.b;
            this.d = r11;
            this.a = 1;
            if (r11.a(this) == awoxVar3) {
                return awoxVar3;
            }
            r8 = r11;
            dmr dmrVar2 = new dmr((awqk) this.c, (awoq) null, 3, (char[]) null);
            this.d = r8;
            this.a = 2;
            r9 = r8;
            if (awrc.J(dmrVar2, this) == awoxVar3) {
                return awoxVar3;
            }
            r9.c();
            return awmy.a;
        } catch (Throwable th2) {
            r9.c();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqg(awoq awoqVar, axff axffVar, awqk awqkVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = axffVar;
        this.c = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqg(axbo axboVar, awzd awzdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = axboVar;
        this.c = awzdVar;
    }
}
