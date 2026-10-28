package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnk extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnk(bfp bfpVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = bfpVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        Object obj2 = this.d;
        if (i != 0) {
            dnk dnkVar = new dnk((bfp) obj2, awoqVar, 1);
            dnkVar.c = obj;
            return dnkVar;
        }
        dnk dnkVar2 = new dnk((dnl) obj2, awoqVar, 0);
        dnkVar2.c = obj;
        return dnkVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((dnk) create((awzd) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((dnk) create((dnv) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.locks.ReentrantLock] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r9;
        dnv dnvVar;
        Object objE;
        dmi[] dmiVarArr;
        dmj dmjVar;
        ?? r1;
        dmi dmiVar;
        Object obj2;
        Object objM;
        Object obj3;
        Object obj4;
        awzj awzjVar;
        boolean z = false;
        boolean z2 = true;
        if (this.$cid != 0) {
            awzd awzdVar = (awzd) this.c;
            awox awoxVar = awox.a;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    atqp.j(obj);
                    obj2 = obj;
                } else if (i == 2) {
                    atqp.j(obj);
                    objM = obj;
                    obj3 = (bgk) objM;
                    if (obj3 instanceof bdw) {
                        obj4 = ((bdw) obj3).a;
                        this.c = awzdVar;
                        this.a = obj3;
                        this.b = 3;
                        if (awzdVar.emit(obj4, this) == awoxVar) {
                            return awoxVar;
                        }
                        bfp bfpVar = (bfp) this.d;
                        awzjVar = new awzj(new ecs(new awzl(new awzl(new awzj(new bej(bfpVar, (awoq) null, 0), (awzc) bfpVar.g.a, 0), new bek(null), 3), new bgu((bgk) obj3, (awoq) null, 1), 2), 1), new bel(bfpVar, null), 1);
                        this.c = null;
                        this.a = null;
                        this.b = 4;
                        if (awqx.x(awzdVar, awzjVar, this) == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        if (!(obj3 instanceof bgn)) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        if (!(obj3 instanceof bge)) {
                            throw ((bge) obj3).a;
                        }
                        if (!(obj3 instanceof bgb)) {
                            if (obj3 instanceof bgc) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new awmj();
                        }
                    }
                } else if (i != 3) {
                    atqp.j(obj);
                } else {
                    obj3 = this.a;
                    atqp.j(obj);
                    bfp bfpVar2 = (bfp) this.d;
                    awzjVar = new awzj(new ecs(new awzl(new awzl(new awzj(new bej(bfpVar2, (awoq) null, 0), (awzc) bfpVar2.g.a, 0), new bek(null), 3), new bgu((bgk) obj3, (awoq) null, 1), 2), 1), new bel(bfpVar2, null), 1);
                    this.c = null;
                    this.a = null;
                    this.b = 4;
                    if (awqx.x(awzdVar, awzjVar, this) == awoxVar) {
                        return awoxVar;
                    }
                }
                return awmy.a;
            }
            atqp.j(obj);
            awro.A(((axcw) ((bfp) this.d).c).a);
            this.c = awzdVar;
            this.b = 1;
            obj2 = null;
            Object obj5 = this.d;
            this.c = awzdVar;
            this.b = 2;
            objM = ((bfp) obj5).m((dqy) obj2, this);
            if (objM == awoxVar) {
                return awoxVar;
            }
            obj3 = (bgk) objM;
            if (obj3 instanceof bdw) {
                obj4 = ((bdw) obj3).a;
                this.c = awzdVar;
                this.a = obj3;
                this.b = 3;
                if (awzdVar.emit(obj4, this) == awoxVar) {
                    return awoxVar;
                }
                bfp bfpVar3 = (bfp) this.d;
                awzjVar = new awzj(new ecs(new awzl(new awzl(new awzj(new bej(bfpVar3, (awoq) null, 0), (awzc) bfpVar3.g.a, 0), new bek(null), 3), new bgu((bgk) obj3, (awoq) null, 1), 2), 1), new bel(bfpVar3, null), 1);
                this.c = null;
                this.a = null;
                this.b = 4;
                if (awqx.x(awzdVar, awzjVar, this) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (!(obj3 instanceof bgn)) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                if (!(obj3 instanceof bge)) {
                    throw ((bge) obj3).a;
                }
                if (!(obj3 instanceof bgb)) {
                    if (obj3 instanceof bgc) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    throw new awmj();
                }
            }
            return awmy.a;
        }
        awox awoxVar2 = awox.a;
        ?? r2 = this.b;
        try {
            if (r2 == 0) {
                atqp.j(obj);
                dnvVar = (dnv) this.c;
                this.c = dnvVar;
                this.b = 1;
                objE = dnvVar.e();
                if (objE == awoxVar2) {
                    return awoxVar2;
                }
            } else {
                if (r2 != 1) {
                    Object obj6 = this.a;
                    dmjVar = (dmj) this.c;
                    try {
                        atqp.j(obj);
                        r1 = obj6;
                        dmjVar.f = z;
                        ((ReentrantLock) r1).unlock();
                        return awmy.a;
                    } catch (Throwable th) {
                        th = th;
                        dmjVar.f = z;
                        throw th;
                    }
                }
                dnvVar = (dnv) this.c;
                atqp.j(obj);
                objE = obj;
            }
            if (((Boolean) objE).booleanValue()) {
                return awmy.a;
            }
            Object obj7 = this.d;
            dmj dmjVar2 = ((dnl) obj7).e;
            r9 = dmjVar2.e;
            r9.lock();
            try {
                dmjVar2.f = true;
                ReentrantLock reentrantLock = dmjVar2.a;
                reentrantLock.lock();
                try {
                    if (dmjVar2.d) {
                        dmjVar2.d = false;
                        long[] jArr = dmjVar2.b;
                        int length = jArr.length;
                        dmiVarArr = new dmi[length];
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 < length) {
                            if (jArr[i2] <= 0) {
                                z2 = z;
                            }
                            boolean[] zArr = dmjVar2.c;
                            if (z2 != zArr[i2]) {
                                zArr[i2] = z2;
                                dmiVar = z2 ? dmi.b : dmi.c;
                                z3 = true;
                            } else {
                                dmiVar = dmi.a;
                            }
                            dmiVarArr[i2] = dmiVar;
                            i2++;
                            z = false;
                            z2 = true;
                        }
                        if (!z3) {
                            dmiVarArr = null;
                        }
                    } else {
                        dmiVarArr = null;
                    }
                    reentrantLock.unlock();
                    if (dmiVarArr != null) {
                        try {
                            dmz dmzVar = dmz.b;
                            dnj dnjVar = new dnj(dmiVarArr, (dnl) obj7, dnvVar, null);
                            this.c = dmjVar2;
                            this.a = r9;
                            this.b = 2;
                            if (dnvVar.d(dmzVar, dnjVar, this) == awoxVar2) {
                                return awoxVar2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            dmjVar = dmjVar2;
                            z = false;
                            dmjVar.f = z;
                            throw th;
                        }
                    }
                    z = false;
                    dmjVar = dmjVar2;
                    r1 = r9;
                    dmjVar.f = z;
                    ((ReentrantLock) r1).unlock();
                    return awmy.a;
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                ((ReentrantLock) r9).unlock();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            r9 = r2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnk(dnl dnlVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = dnlVar;
    }
}
