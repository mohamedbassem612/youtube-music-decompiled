package defpackage;

import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pvl extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvl(pfu pfuVar, pgc pgcVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pfuVar;
        this.d = pgcVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, pxk] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            return new pvl((pvo) this.c, (pxk) this.d, awoqVar, 0);
        }
        if (i == 1) {
            return new pvl((pfu) this.c, (pgc) this.d, awoqVar, 1);
        }
        Object obj2 = this.d;
        if (i != 2) {
            return new pvl((qbs) obj2, (pxk) this.c, awoqVar, 3);
        }
        return new pvl((qbs) obj2, (plx) this.c, awoqVar, 2);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((pvl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((pvl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 2) {
            return ((pvl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pvl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [paw] */
    /* JADX WARN: Type inference failed for: r1v5, types: [qbs] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, pxk] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object pkvVar;
        Object obj3;
        Object pkvVar2;
        ?? r0;
        Object obj4;
        int i = this.$cid;
        if (i == 0) {
            awox awoxVar = awox.a;
            if (this.b != 0) {
                obj2 = this.a;
                try {
                    atqp.j(obj);
                } catch (Exception e) {
                    e = e;
                    awro.A(getContext());
                    pkvVar = new pkv(e, (pkx) obj2);
                    return pkvVar;
                }
            } else {
                atqp.j(obj);
                Object obj5 = this.c;
                ?? r2 = this.d;
                pkx pkxVar = pkx.W;
                try {
                    pvh pvhVar = (pvh) ((pvo) obj5).a.io();
                    int iAw = qnl.aw(r2);
                    String strA = r2.a();
                    this.a = pkxVar;
                    this.b = 1;
                    obj = pvhVar.g(iAw, strA, this);
                    if (obj == awoxVar) {
                        return awoxVar;
                    }
                    obj2 = pkxVar;
                } catch (Exception e2) {
                    e = e2;
                    obj2 = pkxVar;
                    awro.A(getContext());
                    pkvVar = new pkv(e, (pkx) obj2);
                    return pkvVar;
                }
            }
            return new pla(obj);
        }
        if (i != 1) {
            if (i != 2) {
                awox awoxVar2 = awox.a;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        atqp.j(obj);
                    } else {
                        obj4 = this.a;
                        atqp.j(obj);
                    }
                    return awmy.a;
                }
                atqp.j(obj);
                Object obj6 = this.d;
                ?? r4 = this.c;
                this.a = obj6;
                this.b = 1;
                Object objE = ((qbs) obj6).e(r4, this);
                if (objE == awoxVar2) {
                    return awoxVar2;
                }
                obj4 = obj6;
                obj = objE;
                this.a = null;
                this.b = 2;
                qbs qbsVar = (qbs) obj4;
                Object objA = nxf.a(qbsVar.f, qbsVar.e, new pvl(qbsVar, (plx) obj, (awoq) null, 2), this);
                if (objA != awoxVar2) {
                    objA = awmy.a;
                }
                if (objA == awoxVar2) {
                    return awoxVar2;
                }
                return awmy.a;
            }
            awox awoxVar3 = awox.a;
            if (this.b == 0) {
                atqp.j(obj);
                qbs qbsVar2 = (qbs) this.d;
                plx plxVar = (plx) this.c;
                agke agkeVarP = qbsVar2.g.p(plxVar);
                agkeVarP.getClass();
                if (!agkeVarP.isEmpty()) {
                    pct pctVar = qbsVar2.c;
                    pbe pbeVarA = pbf.a();
                    pbeVarA.f = 4;
                    pbeVarA.e(1);
                    pbeVarA.a = "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED";
                    pbeVarA.b = plxVar;
                    pbeVarA.f(agkeVarP);
                    aihf aihfVarCreateBuilder = aiff.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiff aiffVar = (aiff) aihfVarCreateBuilder.instance;
                    aiffVar.f = 2;
                    aiffVar.b |= 8;
                    aihfVarCreateBuilder.copyOnWrite();
                    aiff aiffVar2 = (aiff) aihfVarCreateBuilder.instance;
                    aiffVar2.e = 2;
                    aiffVar2.b |= 4;
                    pbeVarA.d((aiff) aihfVarCreateBuilder.build());
                    xyg xygVar = new xyg();
                    xygVar.d(ahza.DISMISSED_BY_API);
                    pbeVarA.e = xygVar.c();
                    pbf pbfVarA = pbeVarA.a();
                    this.a = agkeVarP;
                    this.b = 1;
                    if (pctVar.a(pbfVarA, this) == awoxVar3) {
                        return awoxVar3;
                    }
                    r0 = agkeVarP;
                }
                return awmy.a;
            }
            Object obj7 = this.a;
            atqp.j(obj);
            r0 = obj7;
            qbs qbsVar3 = (qbs) this.d;
            ?? B = qbsVar3.d.b(ahzv.DISMISSED_BY_API);
            B.f((plx) this.c);
            r0.getClass();
            B.c(r0);
            B.a();
            qbsVar3.g(pqf.C);
            return awmy.a;
        }
        awox awoxVar4 = awox.a;
        if (this.b != 0) {
            obj3 = this.a;
            try {
                atqp.j(obj);
            } catch (Exception e3) {
                e = e3;
                awro.A(getContext());
                pkvVar2 = new pkv(e, (pkx) obj3);
            }
        } else {
            atqp.j(obj);
            Object obj8 = this.c;
            Object obj9 = this.d;
            pkx pkxVar2 = pkx.e;
            try {
                ChimePerAccountRoomDatabase chimePerAccountRoomDatabase = ((pfu) obj8).b;
                pfr pfrVar = new pfr((pfu) obj8, (pgc) obj9, null);
                this.a = pkxVar2;
                this.b = 1;
                obj = dms.b(chimePerAccountRoomDatabase, pfrVar, this);
                if (obj == awoxVar4) {
                    return awoxVar4;
                }
                obj3 = pkxVar2;
            } catch (Exception e4) {
                e = e4;
                obj3 = pkxVar2;
                awro.A(getContext());
                pkvVar2 = new pkv(e, (pkx) obj3);
            }
        }
        pkvVar2 = new pla(obj);
        int iD = a.D(pkvVar2);
        if (iD == 0) {
            pkvVar = ((pla) pkvVar2).a;
        } else {
            if (iD != 1) {
                throw new awmj();
            }
            ((agsj) ((agsj) pfu.a.c()).j(((pku) pkvVar2).b())).t("Failed to insert thread state");
            pkvVar = pfm.d;
        }
        return pkvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvl(pvo pvoVar, pxk pxkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pvoVar;
        this.d = pxkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvl(qbs qbsVar, plx plxVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = qbsVar;
        this.c = plxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvl(qbs qbsVar, pxk pxkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = qbsVar;
        this.c = pxkVar;
    }
}
