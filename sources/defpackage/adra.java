package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adra extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    boolean d;
    int e;
    final /* synthetic */ adrf f;
    final /* synthetic */ awut g;
    final /* synthetic */ awqg h;
    final /* synthetic */ adrj i;
    final /* synthetic */ boc j;
    final /* synthetic */ adql k;
    final /* synthetic */ xir l;
    private /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adra(adrf adrfVar, awut awutVar, awqg awqgVar, adrj adrjVar, boc bocVar, adql adqlVar, xir xirVar, awoq awoqVar) {
        super(2, awoqVar);
        this.f = adrfVar;
        this.g = awutVar;
        this.h = awqgVar;
        this.i = adrjVar;
        this.j = bocVar;
        this.k = adqlVar;
        this.l = xirVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        adra adraVar = new adra(this.f, this.g, this.h, this.i, this.j, this.k, this.l, awoqVar);
        adraVar.m = obj;
        return adraVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adra) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[Catch: Exception -> 0x021e, CancellationException -> 0x0282, all -> 0x0284, TRY_LEAVE, TryCatch #3 {all -> 0x0284, blocks: (B:7:0x0028, B:74:0x021f, B:87:0x0283, B:45:0x0142, B:47:0x0146, B:60:0x0190, B:23:0x006e, B:28:0x00a3, B:30:0x00b0, B:42:0x010c, B:26:0x0086), top: B:101:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x010c A[Catch: Exception -> 0x021e, CancellationException -> 0x0282, all -> 0x0284, TRY_ENTER, TryCatch #3 {all -> 0x0284, blocks: (B:7:0x0028, B:74:0x021f, B:87:0x0283, B:45:0x0142, B:47:0x0146, B:60:0x0190, B:23:0x006e, B:28:0x00a3, B:30:0x00b0, B:42:0x010c, B:26:0x0086), top: B:101:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x013e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146 A[Catch: Exception -> 0x021e, CancellationException -> 0x0282, all -> 0x0284, TRY_LEAVE, TryCatch #3 {all -> 0x0284, blocks: (B:7:0x0028, B:74:0x021f, B:87:0x0283, B:45:0x0142, B:47:0x0146, B:60:0x0190, B:23:0x006e, B:28:0x00a3, B:30:0x00b0, B:42:0x010c, B:26:0x0086), top: B:101:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x0190 A[Catch: Exception -> 0x021e, CancellationException -> 0x0282, all -> 0x0284, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0284, blocks: (B:7:0x0028, B:74:0x021f, B:87:0x0283, B:45:0x0142, B:47:0x0146, B:60:0x0190, B:23:0x006e, B:28:0x00a3, B:30:0x00b0, B:42:0x010c, B:26:0x0086), top: B:101:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01de  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:72:0x021d A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r24v2 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awut awutVar;
        Object awrmVar;
        Object awriVar;
        Object objJ;
        Map map;
        byte[] bArr;
        boolean zK;
        Object objP;
        boolean z;
        ?? r24;
        awmy awmyVar;
        awwd awwdVar;
        boolean z2;
        awou awouVarPlus;
        adqz adqzVar;
        Object obj2;
        adqc adqcVar;
        awou awouVar;
        adqy adqyVar;
        awwd awwdVar2;
        boolean z3;
        awou awouVarPlus2;
        adqz adqzVar2;
        awwd awwdVar3;
        boolean z4;
        awou awouVarPlus3;
        adqz adqzVar3;
        awox awoxVar = awox.a;
        try {
            try {
                switch (this.e) {
                    case 0:
                        atqp.j(obj);
                        awutVar = (awut) this.m;
                        awrmVar = new awrm();
                        awriVar = new awri();
                        ybe ybeVar = new ybe(this.h, this.f, this.i, (awoq) null, 2);
                        this.m = awutVar;
                        this.a = awrmVar;
                        this.b = awriVar;
                        this.e = 1;
                        objJ = awrc.J(ybeVar, this);
                        if (objJ == awoxVar) {
                            return awoxVar;
                        }
                        awml awmlVar = (awml) objJ;
                        map = (Map) awmlVar.a;
                        bArr = (byte[]) awmlVar.b;
                        if (bArr == null) {
                            ((agrc) adrf.a.b().k("com/google/android/libraries/youtube/rendering/rive/RiveSession", "mount$<anonymous>", 285, "RiveSession.kt")).t("Failed to download secure Rive asset.");
                            awmyVar = awmy.a;
                            if (!((awri) awriVar).a) {
                                awwdVar = (awwd) awutVar.b().get(awwd.d);
                                if (awwdVar == null && awwdVar.r()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                adrf adrfVar = this.f;
                                awouVarPlus = adrfVar.b.plus(awwq.a);
                                adqzVar = new adqz(adrfVar, this.g, (awrm) awrmVar, this.l, z2, null);
                                this.m = awmyVar;
                                this.a = null;
                                this.b = null;
                                this.e = 2;
                                if (awro.p(awouVarPlus, adqzVar, this) == awoxVar) {
                                    return awoxVar;
                                }
                            }
                        } else {
                            adrf adrfVar2 = this.f;
                            adqh adqhVar = adrfVar2.h;
                            zK = adqhVar.k();
                            acfz.ad(map, adqhVar, adrfVar2.i, adrfVar2.j);
                            awut awutVar2 = this.g;
                            this.m = awutVar;
                            this.a = awrmVar;
                            this.b = awriVar;
                            this.c = map;
                            this.d = zK;
                            this.e = 3;
                            objP = awro.p(adrfVar2.c, new adqx(adrfVar2, bArr, awutVar2, (awoq) null, 0), this);
                            if (objP != awoxVar) {
                                return awoxVar;
                            }
                            z = zK;
                            r24 = map;
                            adqcVar = (adqc) objP;
                            if (adqcVar == null) {
                                ((awrm) awrmVar).a = adqcVar;
                                adrf adrfVar3 = this.f;
                                awouVar = adrfVar3.b;
                                adqyVar = new adqy(adqcVar, adrfVar3, this.g, this.h, r24, z, (awrm) awrmVar, this.j, this.k, this.i, this.l, (awri) awriVar, null);
                                this.m = awutVar;
                                this.a = awrmVar;
                                this.b = awriVar;
                                this.c = null;
                                this.e = 5;
                                if (awro.p(awouVar, adqyVar, this) == awoxVar) {
                                    return awoxVar;
                                }
                                if (!((awri) awriVar).a) {
                                    awwdVar3 = (awwd) awutVar.b().get(awwd.d);
                                    if (awwdVar3 == null && awwdVar3.r()) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    adrf adrfVar4 = this.f;
                                    awouVarPlus3 = adrfVar4.b.plus(awwq.a);
                                    adqzVar3 = new adqz(adrfVar4, this.g, (awrm) awrmVar, this.l, z4, null);
                                    this.m = null;
                                    this.a = null;
                                    this.b = null;
                                    this.e = 6;
                                    if (awro.p(awouVarPlus3, adqzVar3, this) == awoxVar) {
                                        return awoxVar;
                                    }
                                }
                                return awmy.a;
                            }
                            awmyVar = awmy.a;
                            if (!((awri) awriVar).a) {
                                awwdVar2 = (awwd) awutVar.b().get(awwd.d);
                                if (awwdVar2 == null && awwdVar2.r()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                adrf adrfVar5 = this.f;
                                awouVarPlus2 = adrfVar5.b.plus(awwq.a);
                                adqzVar2 = new adqz(adrfVar5, this.g, (awrm) awrmVar, this.l, z3, null);
                                this.m = awmyVar;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.e = 4;
                                if (awro.p(awouVarPlus2, adqzVar2, this) == awoxVar) {
                                    return awoxVar;
                                }
                            }
                        }
                        return awmyVar;
                    case 1:
                        awriVar = this.b;
                        awrmVar = this.a;
                        awutVar = (awut) this.m;
                        atqp.j(obj);
                        objJ = obj;
                        awml awmlVar2 = (awml) objJ;
                        map = (Map) awmlVar2.a;
                        bArr = (byte[]) awmlVar2.b;
                        if (bArr == null) {
                            ((agrc) adrf.a.b().k("com/google/android/libraries/youtube/rendering/rive/RiveSession", "mount$<anonymous>", 285, "RiveSession.kt")).t("Failed to download secure Rive asset.");
                            awmyVar = awmy.a;
                            if (!((awri) awriVar).a) {
                                awwdVar = (awwd) awutVar.b().get(awwd.d);
                                if (awwdVar == null) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                adrf adrfVar6 = this.f;
                                awouVarPlus = adrfVar6.b.plus(awwq.a);
                                adqzVar = new adqz(adrfVar6, this.g, (awrm) awrmVar, this.l, z2, null);
                                this.m = awmyVar;
                                this.a = null;
                                this.b = null;
                                this.e = 2;
                                if (awro.p(awouVarPlus, adqzVar, this) == awoxVar) {
                                    return awoxVar;
                                }
                            }
                        } else {
                            adrf adrfVar7 = this.f;
                            adqh adqhVar2 = adrfVar7.h;
                            zK = adqhVar2.k();
                            acfz.ad(map, adqhVar2, adrfVar7.i, adrfVar7.j);
                            awut awutVar3 = this.g;
                            this.m = awutVar;
                            this.a = awrmVar;
                            this.b = awriVar;
                            this.c = map;
                            this.d = zK;
                            this.e = 3;
                            objP = awro.p(adrfVar7.c, new adqx(adrfVar7, bArr, awutVar3, (awoq) null, 0), this);
                            if (objP != awoxVar) {
                                return awoxVar;
                            }
                            z = zK;
                            r24 = map;
                            adqcVar = (adqc) objP;
                            if (adqcVar == null) {
                                ((awrm) awrmVar).a = adqcVar;
                                adrf adrfVar8 = this.f;
                                awouVar = adrfVar8.b;
                                adqyVar = new adqy(adqcVar, adrfVar8, this.g, this.h, r24, z, (awrm) awrmVar, this.j, this.k, this.i, this.l, (awri) awriVar, null);
                                this.m = awutVar;
                                this.a = awrmVar;
                                this.b = awriVar;
                                this.c = null;
                                this.e = 5;
                                if (awro.p(awouVar, adqyVar, this) == awoxVar) {
                                    return awoxVar;
                                }
                                if (!((awri) awriVar).a) {
                                    awwdVar3 = (awwd) awutVar.b().get(awwd.d);
                                    if (awwdVar3 == null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    adrf adrfVar9 = this.f;
                                    awouVarPlus3 = adrfVar9.b.plus(awwq.a);
                                    adqzVar3 = new adqz(adrfVar9, this.g, (awrm) awrmVar, this.l, z4, null);
                                    this.m = null;
                                    this.a = null;
                                    this.b = null;
                                    this.e = 6;
                                    if (awro.p(awouVarPlus3, adqzVar3, this) == awoxVar) {
                                        return awoxVar;
                                    }
                                }
                                return awmy.a;
                            }
                            awmyVar = awmy.a;
                            if (!((awri) awriVar).a) {
                                awwdVar2 = (awwd) awutVar.b().get(awwd.d);
                                if (awwdVar2 == null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                adrf adrfVar10 = this.f;
                                awouVarPlus2 = adrfVar10.b.plus(awwq.a);
                                adqzVar2 = new adqz(adrfVar10, this.g, (awrm) awrmVar, this.l, z3, null);
                                this.m = awmyVar;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.e = 4;
                                if (awro.p(awouVarPlus2, adqzVar2, this) == awoxVar) {
                                    return awoxVar;
                                }
                            }
                        }
                        return awmyVar;
                    case 2:
                        obj2 = this.m;
                        awmy awmyVar2 = (awmy) obj2;
                        atqp.j(obj);
                        return awmyVar2;
                    case 3:
                        boolean z5 = this.d;
                        Object obj3 = this.c;
                        Object obj4 = this.b;
                        Object obj5 = this.a;
                        awut awutVar4 = (awut) this.m;
                        try {
                            atqp.j(obj);
                            z = z5;
                            r24 = obj3;
                            awriVar = obj4;
                            awrmVar = obj5;
                            awutVar = awutVar4;
                            objP = obj;
                            adqcVar = (adqc) objP;
                            if (adqcVar == null) {
                                awmyVar = awmy.a;
                                if (!((awri) awriVar).a) {
                                    awwdVar2 = (awwd) awutVar.b().get(awwd.d);
                                    if (awwdVar2 == null) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    adrf adrfVar11 = this.f;
                                    awouVarPlus2 = adrfVar11.b.plus(awwq.a);
                                    adqzVar2 = new adqz(adrfVar11, this.g, (awrm) awrmVar, this.l, z3, null);
                                    this.m = awmyVar;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.e = 4;
                                    if (awro.p(awouVarPlus2, adqzVar2, this) == awoxVar) {
                                        return awoxVar;
                                    }
                                }
                                return awmyVar;
                            }
                            ((awrm) awrmVar).a = adqcVar;
                            adrf adrfVar12 = this.f;
                            awouVar = adrfVar12.b;
                            adqyVar = new adqy(adqcVar, adrfVar12, this.g, this.h, r24, z, (awrm) awrmVar, this.j, this.k, this.i, this.l, (awri) awriVar, null);
                            this.m = awutVar;
                            this.a = awrmVar;
                            this.b = awriVar;
                            this.c = null;
                            this.e = 5;
                            if (awro.p(awouVar, adqyVar, this) == awoxVar) {
                                return awoxVar;
                            }
                            if (!((awri) awriVar).a) {
                                awwdVar3 = (awwd) awutVar.b().get(awwd.d);
                                if (awwdVar3 == null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                adrf adrfVar13 = this.f;
                                awouVarPlus3 = adrfVar13.b.plus(awwq.a);
                                adqzVar3 = new adqz(adrfVar13, this.g, (awrm) awrmVar, this.l, z4, null);
                                this.m = null;
                                this.a = null;
                                this.b = null;
                                this.e = 6;
                                if (awro.p(awouVarPlus3, adqzVar3, this) == awoxVar) {
                                    return awoxVar;
                                }
                            }
                            return awmy.a;
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            ((agrc) ((agrc) adrf.a.b()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveSession", "mount$<anonymous>", 347, "RiveSession.kt")).t("Error during JNI mount");
                            if (!((awri) obj4).a) {
                                awwd awwdVar4 = (awwd) awutVar4.b().get(awwd.d);
                                boolean z6 = awwdVar4 != null && awwdVar4.r();
                                adrf adrfVar14 = this.f;
                                awou awouVarPlus4 = adrfVar14.b.plus(awwq.a);
                                adqz adqzVar4 = new adqz(adrfVar14, this.g, (awrm) obj5, this.l, z6, null);
                                this.m = null;
                                this.a = null;
                                this.b = null;
                                this.c = null;
                                this.e = 7;
                                if (awro.p(awouVarPlus4, adqzVar4, this) == awoxVar) {
                                    return awoxVar;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (((awri) obj4).a) {
                                throw th;
                            }
                            awwd awwdVar5 = (awwd) awutVar4.b().get(awwd.d);
                            boolean z7 = awwdVar5 != null && awwdVar5.r();
                            adrf adrfVar15 = this.f;
                            awou awouVarPlus5 = adrfVar15.b.plus(awwq.a);
                            adqz adqzVar5 = new adqz(adrfVar15, this.g, (awrm) obj5, this.l, z7, null);
                            this.m = th;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.e = 8;
                            if (awro.p(awouVarPlus5, adqzVar5, this) == awoxVar) {
                                return awoxVar;
                            }
                            throw th;
                        }
                    case 4:
                        obj2 = this.m;
                        awmy awmyVar3 = (awmy) obj2;
                        atqp.j(obj);
                        return awmyVar3;
                    case 5:
                        awriVar = this.b;
                        awrmVar = this.a;
                        awutVar = (awut) this.m;
                        atqp.j(obj);
                        if (!((awri) awriVar).a) {
                            awwdVar3 = (awwd) awutVar.b().get(awwd.d);
                            if (awwdVar3 == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            adrf adrfVar16 = this.f;
                            awouVarPlus3 = adrfVar16.b.plus(awwq.a);
                            adqzVar3 = new adqz(adrfVar16, this.g, (awrm) awrmVar, this.l, z4, null);
                            this.m = null;
                            this.a = null;
                            this.b = null;
                            this.e = 6;
                            if (awro.p(awouVarPlus3, adqzVar3, this) == awoxVar) {
                                return awoxVar;
                            }
                        }
                        return awmy.a;
                    case 6:
                    case 7:
                        atqp.j(obj);
                        return awmy.a;
                    default:
                        Throwable th2 = (Throwable) this.m;
                        atqp.j(obj);
                        throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            e = e4;
        }
    }
}
