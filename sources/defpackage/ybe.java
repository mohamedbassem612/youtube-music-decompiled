package defpackage;

import android.os.Looper;
import org.chromium.base.Callback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ybe extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybe(awoq awoqVar, afqo afqoVar, axat axatVar, avgj avgjVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = afqoVar;
        this.d = axatVar;
        this.b = avgjVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [adrj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [axat, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        ybe ybeVar;
        int i = this.$cid;
        if (i == 0) {
            ybeVar = new ybe((ybi) this.b, (zwa) this.c, (awtr) this.d, awoqVar, 0);
            ybeVar.e = obj;
        } else if (i == 1) {
            Object obj2 = this.c;
            boc bocVar = (boc) obj2;
            ybeVar = new ybe(bocVar, (bob) this.b, (awqk) this.d, awoqVar, 1);
            ybeVar.e = obj;
        } else {
            if (i != 2) {
                ybe ybeVar2 = new ybe(awoqVar, (afqo) this.c, (axat) this.d, (avgj) this.b, 3);
                ybeVar2.e = obj;
                return ybeVar2;
            }
            ybeVar = new ybe((awqg) this.d, (adrf) this.b, (adrj) this.c, awoqVar, 2);
            ybeVar.e = obj;
        }
        return ybeVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((ybe) create((awzd) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((ybe) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 2) {
            return ((ybe) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((ybe) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [axat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r7v7, types: [adrj, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awuz awuzVarR;
        Object obj2;
        int i = this.$cid;
        int i2 = 8;
        if (i == 0) {
            awox awoxVar = awox.a;
            int i3 = this.a;
            atqp.j(obj);
            if (i3 == 0) {
                awzd awzdVar = (awzd) this.e;
                Object obj3 = this.d;
                Object obj4 = this.b;
                ybd ybdVarA = ybh.a((awtr) obj3);
                agrf agrfVar = ybi.b;
                ybk ybkVar = (ybk) taq.i(((ybi) obj4).d, ybi.a[0]);
                ?? r7 = this.c;
                String str = ybdVarA.a;
                String str2 = ybdVarA.b;
                r7.getClass();
                aihf aihfVarCreateBuilder = alpm.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                if (str != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    alpm alpmVar = (alpm) aihfVarCreateBuilder.instance;
                    alpmVar.b |= 4;
                    alpmVar.e = str;
                }
                if (str2 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    alpm alpmVar2 = (alpm) aihfVarCreateBuilder.instance;
                    alpmVar2.b |= 2;
                    alpmVar2.d = str2;
                }
                aunn aunnVar = ybkVar.e;
                awsj[] awsjVarArr = ybk.a;
                amyf amyfVar = ((xmw) taq.i(aunnVar, awsjVarArr[3])).l;
                if (amyfVar != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    alpm alpmVar3 = (alpm) aihfVarCreateBuilder.instance;
                    alpmVar3.f = amyfVar;
                    alpmVar3.b |= 8;
                }
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                aihf builder = ((alpm) aihnVarBuild).toBuilder();
                builder.getClass();
                ybj ybjVar = new ybj((abxv) taq.i(ybkVar.c, awsjVarArr[1]), r7, builder);
                ybjVar.m();
                ypp yppVarE = ((wlp) taq.i(ybkVar.b, awsjVarArr[0])).e();
                yppVarE.h = ybjVar;
                yppVarE.l(alpn.a);
                yppVarE.g = new wut(16);
                yppVarE.f = new wvb(i2);
                awzc awzcVarI = Callback.Helper.i(nsi.h((tgg) taq.i(ybkVar.d, awsjVarArr[2]), new wlq(yppVarE.k(), true)).K(new ugm(new uhd(20), 19)));
                this.a = 1;
                if (awqx.x(awzdVar, awzcVarI, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i == 1) {
            awut awutVar = (awut) this.e;
            awox awoxVar2 = awox.a;
            int i4 = this.a;
            atqp.j(obj);
            if (i4 == 0) {
                awuq awuqVar = awvi.a;
                awwo awwoVarJ = axds.a.j();
                bot botVar = new bot((boc) this.c, (bob) this.b, awutVar, this.d, null);
                this.e = null;
                this.a = 1;
                if (awro.p(awwoVarJ, botVar, this) == awoxVar2) {
                    return awoxVar2;
                }
            }
            return awmy.a;
        }
        if (i != 2) {
            Object obj5 = awox.a;
            int i5 = this.a;
            atqp.j(obj);
            if (i5 == 0) {
                Object obj6 = this.c;
                ?? r2 = this.d;
                Object obj7 = this.b;
                boc lifecycle = ((afqo) obj6).a.getLifecycle();
                bob bobVar = bob.d;
                adpb adpbVar = new adpb((axat) r2, (avgj) obj7, (awoq) null, 8);
                this.a = 1;
                if (bobVar == bob.b) {
                    throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
                }
                if (lifecycle.a() == bob.a) {
                    throw new IllegalArgumentException("repeatOnLifecycle cannot start after its input Lifecycle has already been destroyed.");
                }
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    throw new IllegalArgumentException("repeatOnLifecycle must be called from the main thread.");
                }
                Object objJ = awrc.J(new afqi(bobVar, lifecycle, adpbVar, null), this);
                if (objJ != obj5) {
                    objJ = awmy.a;
                }
                if (objJ == obj5) {
                    return obj5;
                }
            }
            return awmy.a;
        }
        awox awoxVar3 = awox.a;
        int i6 = this.a;
        if (i6 != 0) {
            obj2 = this.e;
            if (i6 != 1) {
                atqp.j(obj);
            } else {
                awuzVarR = (awuz) obj2;
                atqp.j(obj);
            }
            return new awml(obj2, obj);
        }
        atqp.j(obj);
        awut awutVar2 = (awut) this.e;
        awuz awuzVarR2 = awro.r(awutVar2, awov.a, 1, new adqv((awqg) this.d, (awoq) null, 3, (byte[]) null));
        awuzVarR = awro.r(awutVar2, awov.a, 1, new adpb((adrf) this.b, (adrj) this.c, (awoq) null, 3));
        this.e = awuzVarR;
        this.a = 1;
        obj = awuzVarR2.c(this);
        if (obj == awoxVar3) {
            return awoxVar3;
        }
        this.e = obj;
        this.a = 2;
        Object objC = awuzVarR.c(this);
        if (objC == awoxVar3) {
            return awoxVar3;
        }
        obj2 = obj;
        obj = objC;
        return new awml(obj2, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybe(awqg awqgVar, adrf adrfVar, adrj adrjVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = awqgVar;
        this.b = adrfVar;
        this.c = adrjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybe(boc bocVar, bob bobVar, awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = bocVar;
        this.b = bobVar;
        this.d = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybe(ybi ybiVar, zwa zwaVar, awtr awtrVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ybiVar;
        this.c = zwaVar;
        this.d = awtrVar;
    }
}
