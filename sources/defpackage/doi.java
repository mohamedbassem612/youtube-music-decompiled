package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doi extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ dmq f;
    final /* synthetic */ awqg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doi(boolean z, boolean z2, dmq dmqVar, awoq awoqVar, awqg awqgVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = z;
        this.e = z2;
        this.f = dmqVar;
        this.g = awqgVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            doi doiVar = new doi(this.d, this.e, this.f, awoqVar, this.g, 1, null);
            doiVar.c = obj;
            return doiVar;
        }
        doi doiVar2 = new doi(this.d, this.e, this.f, awoqVar, this.g, 0);
        doiVar2.c = obj;
        return doiVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((doi) create((dnv) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((doi) create((dnv) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0143  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        dnv dnvVar;
        Object obj2;
        Object obj3;
        dnv dnvVar2;
        Object objE;
        Object obj4;
        dnv dnvVar3;
        Object obj5;
        dmg dmgVarB;
        dnv dnvVar4;
        Object objE2;
        Object obj6;
        if (this.$cid != 0) {
            awox awoxVar = awox.a;
            int i = this.b;
            if (i == 0) {
                atqp.j(obj);
                dnvVar3 = (dnv) this.c;
                if (!this.d) {
                    dnvVar3.getClass();
                    return this.g.invoke(dnvVar3.a);
                }
                boolean z = this.e;
                dmz dmzVar = z ? dmz.a : dmz.b;
                if (z) {
                    obj5 = dmzVar;
                } else {
                    this.c = dnvVar3;
                    this.a = dmzVar;
                    this.b = 1;
                    obj = dnvVar3.e();
                    if (obj == awoxVar) {
                        return awoxVar;
                    }
                    obj5 = dmzVar;
                    if (!((Boolean) obj).booleanValue()) {
                        dmgVarB = this.f.b();
                        this.c = dnvVar3;
                        this.a = obj5;
                        this.b = 2;
                        if (dmgVarB.a(this) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                doa doaVar = new doa((awoq) null, this.g, 2);
                this.c = dnvVar3;
                this.a = null;
                this.b = 3;
                obj = dnvVar3.d((dmz) obj5, doaVar, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                dnvVar4 = dnvVar3;
                if (!this.e) {
                    this.c = obj;
                    this.b = 4;
                    objE2 = dnvVar4.e();
                    if (objE2 != awoxVar) {
                        return awoxVar;
                    }
                    obj6 = obj;
                    obj = objE2;
                }
            } else if (i == 1) {
                obj5 = this.a;
                dnvVar3 = (dnv) this.c;
                atqp.j(obj);
                if (!((Boolean) obj).booleanValue()) {
                    dmgVarB = this.f.b();
                    this.c = dnvVar3;
                    this.a = obj5;
                    this.b = 2;
                    if (dmgVarB.a(this) == awoxVar) {
                        return awoxVar;
                    }
                }
                doa doaVar2 = new doa((awoq) null, this.g, 2);
                this.c = dnvVar3;
                this.a = null;
                this.b = 3;
                obj = dnvVar3.d((dmz) obj5, doaVar2, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                dnvVar4 = dnvVar3;
                if (!this.e) {
                    this.c = obj;
                    this.b = 4;
                    objE2 = dnvVar4.e();
                    if (objE2 != awoxVar) {
                        return awoxVar;
                    }
                    obj6 = obj;
                    obj = objE2;
                }
            } else if (i != 2) {
                Object obj7 = this.c;
                if (i != 3) {
                    atqp.j(obj);
                    obj6 = obj7;
                } else {
                    dnvVar4 = (dnv) obj7;
                    atqp.j(obj);
                    if (!this.e) {
                        this.c = obj;
                        this.b = 4;
                        objE2 = dnvVar4.e();
                        if (objE2 != awoxVar) {
                            return awoxVar;
                        }
                        obj6 = obj;
                        obj = objE2;
                    }
                }
            } else {
                obj5 = this.a;
                dnvVar3 = (dnv) this.c;
                atqp.j(obj);
                doa doaVar3 = new doa((awoq) null, this.g, 2);
                this.c = dnvVar3;
                this.a = null;
                this.b = 3;
                obj = dnvVar3.d((dmz) obj5, doaVar3, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                dnvVar4 = dnvVar3;
                if (!this.e) {
                    this.c = obj;
                    this.b = 4;
                    objE2 = dnvVar4.e();
                    if (objE2 != awoxVar) {
                        return awoxVar;
                    }
                    obj6 = obj;
                    obj = objE2;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                return obj6;
            }
            this.f.b().b();
            return obj6;
        }
        awox awoxVar2 = awox.a;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                obj2 = this.a;
                dnvVar = (dnv) this.c;
                atqp.j(obj);
            } else if (i2 != 2) {
                Object obj8 = this.c;
                if (i2 != 3) {
                    atqp.j(obj);
                    obj4 = obj8;
                } else {
                    dnvVar2 = (dnv) obj8;
                    atqp.j(obj);
                    if (!this.e) {
                        this.c = obj;
                        this.b = 4;
                        objE = dnvVar2.e();
                        if (objE != awoxVar2) {
                            return awoxVar2;
                        }
                        obj4 = obj;
                        obj = objE;
                    }
                }
            } else {
                obj3 = this.a;
                dnv dnvVar5 = (dnv) this.c;
                atqp.j(obj);
                dnvVar = dnvVar5;
                pbs pbsVar = new pbs((awoq) null, this.g, 1);
                this.c = dnvVar;
                this.a = null;
                this.b = 3;
                obj = dnvVar.d((dmz) obj3, pbsVar, this);
                if (obj == awoxVar2) {
                    return awoxVar2;
                }
                dnvVar2 = dnvVar;
                if (!this.e) {
                    this.c = obj;
                    this.b = 4;
                    objE = dnvVar2.e();
                    if (objE != awoxVar2) {
                        return awoxVar2;
                    }
                    obj4 = obj;
                    obj = objE;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                return obj4;
            }
            this.f.b().b();
            return obj4;
        }
        atqp.j(obj);
        dnvVar = (dnv) this.c;
        if (!this.d) {
            dnvVar.getClass();
            return this.g.invoke(dnvVar.a);
        }
        boolean z2 = this.e;
        obj2 = z2 ? dmz.a : dmz.b;
        if (!z2) {
            this.c = dnvVar;
            this.a = obj2;
            this.b = 1;
            obj = dnvVar.e();
            if (obj == awoxVar2) {
                return awoxVar2;
            }
        }
        obj3 = obj2;
        pbs pbsVar2 = new pbs((awoq) null, this.g, 1);
        this.c = dnvVar;
        this.a = null;
        this.b = 3;
        obj = dnvVar.d((dmz) obj3, pbsVar2, this);
        if (obj == awoxVar2) {
            return awoxVar2;
        }
        dnvVar2 = dnvVar;
        if (!this.e) {
            this.c = obj;
            this.b = 4;
            objE = dnvVar2.e();
            if (objE != awoxVar2) {
                return awoxVar2;
            }
            obj4 = obj;
            obj = objE;
            if (((Boolean) obj).booleanValue()) {
                return obj4;
            }
            this.f.b().b();
            return obj4;
        }
        if (!((Boolean) obj).booleanValue()) {
            dmg dmgVarB2 = this.f.b();
            this.c = dnvVar;
            this.a = obj2;
            this.b = 2;
            if (dmgVarB2.a(this) == awoxVar2) {
                return awoxVar2;
            }
        }
        obj3 = obj2;
        pbs pbsVar3 = new pbs((awoq) null, this.g, 1);
        this.c = dnvVar;
        this.a = null;
        this.b = 3;
        obj = dnvVar.d((dmz) obj3, pbsVar3, this);
        if (obj == awoxVar2) {
            return awoxVar2;
        }
        dnvVar2 = dnvVar;
        if (!this.e) {
            this.c = obj;
            this.b = 4;
            objE = dnvVar2.e();
            if (objE != awoxVar2) {
                return awoxVar2;
            }
            obj4 = obj;
            obj = objE;
            if (((Boolean) obj).booleanValue()) {
                return obj4;
            }
            this.f.b().b();
            return obj4;
        }
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doi(boolean z, boolean z2, dmq dmqVar, awoq awoqVar, awqg awqgVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = z;
        this.e = z2;
        this.f = dmqVar;
        this.g = awqgVar;
    }
}
