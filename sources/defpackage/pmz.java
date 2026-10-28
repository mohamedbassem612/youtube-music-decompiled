package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pmz implements pmk {
    public static final agsn a = agsn.h("GnpSdk");
    public final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final Context i;
    private final awmd j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private final awou n;

    public pmz(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, Context context, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awou awouVar) {
        awmdVar.getClass();
        awmdVar4.getClass();
        awmdVar5.getClass();
        awmdVar6.getClass();
        context.getClass();
        awmdVar7.getClass();
        awmdVar8.getClass();
        awmdVar9.getClass();
        awmdVar10.getClass();
        awmdVar11.getClass();
        awouVar.getClass();
        this.c = awmdVar;
        this.d = awmdVar2;
        this.e = awmdVar3;
        this.f = awmdVar4;
        this.g = awmdVar5;
        this.h = awmdVar6;
        this.i = context;
        this.j = awmdVar7;
        this.k = awmdVar8;
        this.l = awmdVar9;
        this.b = awmdVar10;
        this.m = awmdVar11;
        this.n = awouVar;
    }

    private final void k(pqf pqfVar) {
        ((pwf) this.j.io()).m(this.i.getPackageName(), ((pls) this.k.io()).a, Build.VERSION.SDK_INT, pqfVar.name());
    }

    private final void l() {
        agev agevVar = (agev) ((aupo) this.l).b;
        if (agevVar.g()) {
            ((pmj) agevVar.c()).a();
        }
    }

    private final byte[] m(byte[] bArr, boolean z, pmi pmiVar) {
        pky pkyVarA = ((pod) this.h.io()).a(bArr);
        if (pkyVarA instanceof pla) {
            return (byte[]) ((pla) pkyVarA).a;
        }
        ((agsj) ((agsj) a.c()).j(pkyVarA.f())).t("Payload decompression failed.");
        ahyy ahyyVar = z ? ahyy.FAILED_TO_DECOMPRESS_FALLBACK_TO_PLACEHOLDER : ahyy.FAILED_TO_DECOMPRESS;
        pny pnyVar = (pny) this.d.io();
        pnz pnzVarB = ((pob) this.e.io()).b(ahyyVar);
        ahyr ahyrVarB = pmiVar.b();
        ahyrVarB.getClass();
        ((poc) pnzVarB).l = ahyrVarB;
        pnyVar.a(pnzVarB);
        k(pqf.m);
        return null;
    }

    private static final pmo n(pmi pmiVar, boolean z) {
        byte[] bArrDecode;
        aicw aicwVarA;
        agsn agsnVar = pmn.a;
        String str = pmiVar.a;
        pmo pmoVar = null;
        if (str == null) {
            aicwVarA = null;
        } else {
            try {
                bArrDecode = Base64.decode(str, 1);
            } catch (IllegalArgumentException e) {
                ((agsj) ((agsj) pmn.a.b()).j(e)).t("Failed to decode payload string into bytes.");
                bArrDecode = null;
            }
            aicwVarA = pmn.a(bArrDecode);
        }
        if (aicwVarA != null) {
            pmoVar = new pmo(aicwVarA, z ? pnb.c : pnb.a);
        }
        return pmoVar;
    }

    @Override // defpackage.pma
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.pmk
    public final Object b(pmi pmiVar, plb plbVar, long j, awoq awoqVar) throws Throwable {
        Object objA;
        long jB = ((mbc) this.f.io()).b();
        pny pnyVar = (pny) this.d.io();
        pnz pnzVarC = ((pob) this.e.io()).c(ahzv.DELIVERED_FCM_PUSH);
        ahyr ahyrVarB = pmiVar.b();
        ahyrVarB.getClass();
        poc pocVar = (poc) pnzVarC;
        pocVar.l = ahyrVarB;
        pocVar.n = j;
        pnyVar.a(pnzVarC);
        k(pqf.a);
        int i = pmiVar.f;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0 || i2 == 1) {
                Object objG = g(pmiVar, plbVar, j, jB, awoqVar);
                if (objG == awox.a) {
                    return objG;
                }
            } else if (i2 == 2) {
                awmd awmdVar = this.b;
                if (((agev) awmdVar.io()).g() && (objA = ((ozk) ((agev) awmdVar.io()).c()).a(awoqVar)) == awox.a) {
                    return objA;
                }
            }
        }
        return awmy.a;
    }

    @Override // defpackage.pma
    public final Object c(Intent intent, plb plbVar, long j, awoq awoqVar) throws Throwable {
        Object objB = b(pmi.a(intent), plbVar, j, awoqVar);
        return objB != awox.a ? awmy.a : objB;
    }

    @Override // defpackage.pma
    public final void d(Intent intent, plb plbVar, long j) throws Throwable {
        awmd awmdVar = this.f;
        pmi pmiVarA = pmi.a(intent);
        long jB = ((mbc) awmdVar.io()).b();
        pny pnyVar = (pny) this.d.io();
        pnz pnzVarC = ((pob) this.e.io()).c(ahzv.DELIVERED_FCM_PUSH);
        ahyr ahyrVarB = pmiVarA.b();
        ahyrVarB.getClass();
        poc pocVar = (poc) pnzVarC;
        pocVar.l = ahyrVarB;
        pocVar.n = j;
        pnyVar.a(pnzVarC);
        k(pqf.a);
        int i = pmiVarA.f;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0 || i2 == 1) {
                awqx.l(this.n, new pmw(this, pmiVarA, plbVar, j, jB, null));
            } else if (i2 == 2 && ((agev) this.b.io()).g()) {
                awqx.l(this.n, new dnz(this, (awoq) null, 7));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(aigj aigjVar, boolean z, pmi pmiVar, awoq awoqVar) throws Throwable {
        pmq pmqVar;
        byte[] bArrM;
        if (awoqVar instanceof pmq) {
            pmqVar = (pmq) awoqVar;
            int i = pmqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmqVar.d = i - Integer.MIN_VALUE;
            } else {
                pmqVar = new pmq(this, awoqVar);
            }
        } else {
            pmqVar = new pmq(this, awoqVar);
        }
        Object objJ = pmqVar.b;
        Object obj = awox.a;
        int i2 = pmqVar.d;
        if (i2 == 0) {
            atqp.j(objJ);
            aigjVar.G();
            pmqVar.e = pmiVar;
            pmqVar.a = z;
            pmqVar.d = 1;
            objJ = j(z, pmiVar, pmqVar);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = pmqVar.a;
            pmiVar = pmqVar.e;
            atqp.j(objJ);
        }
        byte[] bArr = (byte[]) objJ;
        if (bArr == null || (bArrM = m(bArr, z, pmiVar)) == null) {
            return null;
        }
        agsn agsnVar = pmn.a;
        return pmn.a(bArrM);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(pmi pmiVar, awoq awoqVar) throws Throwable {
        pmr pmrVar;
        aick aickVar;
        int i;
        aick aickVar2;
        pmi pmiVar2;
        int i2;
        String str;
        pnb pnbVar;
        int i3;
        int I;
        int i4;
        pmo pmoVar;
        aicw aicwVar;
        aigj aigjVar;
        byte[] bArrM;
        aicw aicwVarA;
        if (awoqVar instanceof pmr) {
            pmrVar = (pmr) awoqVar;
            int i5 = pmrVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pmrVar.d = i5 - Integer.MIN_VALUE;
            } else {
                pmrVar = new pmr(this, awoqVar);
            }
        } else {
            pmrVar = new pmr(this, awoqVar);
        }
        Object obj = pmrVar.b;
        Object obj2 = awox.a;
        int i6 = pmrVar.d;
        if (i6 == 0) {
            atqp.j(obj);
            byte[] bArr = pmiVar.b;
            if (bArr != null) {
                agsn agsnVar = pmn.a;
                try {
                    aickVar = (aick) aihn.parseFrom(aick.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik e) {
                    ((agsj) ((agsj) pmn.a.b()).j(e)).t("Failed to parse AndroidFcmPayload proto.");
                    aickVar = null;
                }
            } else {
                aickVar = null;
            }
            if (aickVar == null) {
                return n(pmiVar, false);
            }
            boolean zE = aickVar.d.E();
            i = !zE ? 1 : 0;
            if (!zE) {
                boolean z = (aext.I(aickVar.b) == 3 && ((str = pmiVar.a) == null || str.length() == 0)) ? false : true;
                aigj aigjVar2 = aickVar.d;
                aigjVar2.getClass();
                pmrVar.f = pmiVar;
                pmrVar.e = aickVar;
                pmrVar.a = 1;
                pmrVar.d = 1;
                Object objE = e(aigjVar2, z, pmiVar, pmrVar);
                if (objE == obj2) {
                    return obj2;
                }
                aickVar2 = aickVar;
                obj = objE;
                pmiVar2 = pmiVar;
                i2 = i;
            }
            if (i != 0) {
                pnbVar = pnb.c;
            } else {
                pnbVar = pnb.a;
            }
            i3 = aickVar.b;
            I = aext.I(i3);
            if (I != 0) {
                throw null;
            }
            i4 = I - 1;
            if (i4 != 0) {
                if (i3 == 1) {
                    aicwVar = (aicw) aickVar.c;
                } else {
                    aicwVar = aicw.a;
                }
                aicwVar.getClass();
                pmoVar = new pmo(aicwVar, pnbVar);
            } else {
                if (i4 != 1) {
                    if (i3 == 3) {
                        aigjVar = (aigj) aickVar.c;
                    } else {
                        aigjVar = aigj.d;
                    }
                    aigjVar.getClass();
                    bArrM = m(aigjVar.G(), false, pmiVar);
                    if (bArrM != null) {
                        agsn agsnVar2 = pmn.a;
                        aicwVarA = pmn.a(bArrM);
                        if (aicwVarA != null) {
                            return new pmo(aicwVarA, pnbVar);
                        }
                    }
                    return null;
                }
                if (i4 == 2) {
                    throw new awmj();
                }
                pmoVar = n(pmiVar, 1 == i);
            }
            return pmoVar;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = pmrVar.a;
        aickVar2 = pmrVar.e;
        pmiVar2 = pmrVar.f;
        atqp.j(obj);
        aicw aicwVar2 = (aicw) obj;
        if (aicwVar2 != null) {
            return new pmo(aicwVar2, pnb.b);
        }
        i = i2;
        pmiVar = pmiVar2;
        aickVar = aickVar2;
        if (i != 0) {
            pnbVar = pnb.c;
        } else {
            pnbVar = pnb.a;
        }
        i3 = aickVar.b;
        I = aext.I(i3);
        if (I != 0) {
            throw null;
        }
        i4 = I - 1;
        if (i4 != 0) {
            if (i3 == 1) {
                aicwVar = (aicw) aickVar.c;
            } else {
                aicwVar = aicw.a;
            }
            aicwVar.getClass();
            pmoVar = new pmo(aicwVar, pnbVar);
        } else {
            if (i4 != 1) {
                if (i3 == 3) {
                    aigjVar = (aigj) aickVar.c;
                } else {
                    aigjVar = aigj.d;
                }
                aigjVar.getClass();
                bArrM = m(aigjVar.G(), false, pmiVar);
                if (bArrM != null) {
                    agsn agsnVar3 = pmn.a;
                    aicwVarA = pmn.a(bArrM);
                    if (aicwVarA != null) {
                        return new pmo(aicwVarA, pnbVar);
                    }
                }
                return null;
            }
            if (i4 == 2) {
                throw new awmj();
            }
            pmoVar = n(pmiVar, 1 == i);
        }
        return pmoVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x033e  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    /* JADX WARN: Code duplicated, block: B:35:0x011f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0134  */
    /* JADX WARN: Code duplicated, block: B:39:0x013e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    /* JADX WARN: Code duplicated, block: B:43:0x0149  */
    /* JADX WARN: Code duplicated, block: B:45:0x014d  */
    /* JADX WARN: Code duplicated, block: B:49:0x015b  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x023a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0253  */
    /* JADX WARN: Code duplicated, block: B:73:0x0282  */
    /* JADX WARN: Code duplicated, block: B:75:0x0285  */
    /* JADX WARN: Code duplicated, block: B:77:0x028d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0291  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x029a  */
    /* JADX WARN: Code duplicated, block: B:84:0x029d  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0302  */
    /* JADX WARN: Code duplicated, block: B:96:0x0316  */
    /* JADX WARN: Code duplicated, block: B:98:0x0326  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0158, code lost:
    
        if (r5.length() > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        if (r5.length() > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
    
        r0 = ((defpackage.pob) r22.e.io()).b(defpackage.ahyy.RECIPIENT_NOT_FOUND);
        r3 = r1.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0176, code lost:
    
        if (r3 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0178, code lost:
    
        r3 = defpackage.aiec.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        r3.getClass();
        r0.c(r3);
        r3 = r4.b();
        r3.getClass();
        r4 = (defpackage.poc) r0;
        r4.l = r3;
        r3 = defpackage.auvg.c();
        r5 = r22.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0192, code lost:
    
        if (r3 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0194, code lost:
    
        r3 = (defpackage.pny) r5.io();
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019c, code lost:
    
        if (r1 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019e, code lost:
    
        r1 = defpackage.aieq.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a0, code lost:
    
        r1 = r1.d;
        r1.getClass();
        r4.o = r1;
        r3.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ab, code lost:
    
        r3 = (defpackage.pny) r5.io();
        r1 = r1.c;
        r1.getClass();
        r4.i = r1;
        r3.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bb, code lost:
    
        k(defpackage.pqf.i);
        l();
        ((defpackage.agsj) defpackage.pmz.a.c()).t("Recipient was not found on the device for this user targeted notification.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d2, code lost:
    
        return defpackage.awmy.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.pmi r23, defpackage.plb r24, long r25, long r27, defpackage.awoq r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmz.g(pmi, plb, long, long, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(aicw aicwVar, plx plxVar, pmi pmiVar, plb plbVar, awoq awoqVar) throws Throwable {
        pmx pmxVar;
        if (awoqVar instanceof pmx) {
            pmxVar = (pmx) awoqVar;
            int i = pmxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmxVar.c = i - Integer.MIN_VALUE;
            } else {
                pmxVar = new pmx(this, awoqVar);
            }
        } else {
            pmxVar = new pmx(this, awoqVar);
        }
        pmx pmxVar2 = pmxVar;
        Object obj = pmxVar2.a;
        awox awoxVar = awox.a;
        int i2 = pmxVar2.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                aifa aifaVar = aicwVar.f;
                if (aifaVar == null) {
                    aifaVar = aifa.a;
                }
                aiel aielVarA = aiel.a(aifaVar.e);
                if (aielVarA == null) {
                    aielVarA = aiel.UNKNOWN;
                }
                if (aielVarA == aiel.UNKNOWN || aielVarA == aiel.SYSTEM_TRAY) {
                    awmd awmdVar = this.b;
                    if (!((agev) awmdVar.io()).g()) {
                        ((agsj) a.b()).w("Received %s surface instruction, but the system tray push handler is missing.", aielVarA.name());
                        return awmy.a;
                    }
                    ozk ozkVar = (ozk) ((agev) awmdVar.io()).c();
                    aifa aifaVar2 = aicwVar.f;
                    if (aifaVar2 == null) {
                        aifaVar2 = aifa.a;
                    }
                    aifaVar2.getClass();
                    ahyr ahyrVarB = pmiVar.b();
                    ahyrVarB.getClass();
                    pmxVar2.c = 1;
                    if (ozkVar.c(plxVar, aifaVar2, ahyrVarB, plbVar, pmxVar2) == awoxVar) {
                        return awoxVar;
                    }
                } else if (aielVarA == aiel.IN_APP) {
                    agev agevVar = (agev) ((aupo) this.m).b;
                    if (!agevVar.g()) {
                        ((agsj) a.b()).t("Received an IN_APP surface instruction, but the in-app push handler is missing.");
                        return awmy.a;
                    }
                    if (plxVar == null) {
                        ((agsj) a.c()).t("IN_APP sync instructions account must not be null.");
                        return awmy.a;
                    }
                    ofc ofcVar = (ofc) agevVar.c();
                    aifa aifaVar3 = aicwVar.f;
                    if (aifaVar3 == null) {
                        aifaVar3 = aifa.a;
                    }
                    aifaVar3.getClass();
                    pmiVar.b().getClass();
                    pmxVar2.c = 2;
                    if (ofcVar.a() == awoxVar) {
                        return awoxVar;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
        } catch (Exception e) {
            ((agsj) ((agsj) a.c()).j(e)).t("Could not handle in-app sync instruction.");
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(pmi pmiVar, awoq awoqVar) throws Throwable {
        pmy pmyVar;
        if (awoqVar instanceof pmy) {
            pmyVar = (pmy) awoqVar;
            int i = pmyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmyVar.c = i - Integer.MIN_VALUE;
            } else {
                pmyVar = new pmy(this, awoqVar);
            }
        } else {
            pmyVar = new pmy(this, awoqVar);
        }
        Object obj = pmyVar.a;
        awox awoxVar = awox.a;
        int i2 = pmyVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                if (pmiVar.d != null) {
                    agev agevVar = (agev) ((aupo) this.g).b;
                    if (agevVar.g()) {
                        pon ponVar = (pon) agevVar.c();
                        pmyVar.c = 1;
                        if (ponVar.b() == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        ((agsj) a.b()).t("Can't save key to invalidate because GnpEncryptionManager is missing.");
                    }
                }
                return awmy.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        } catch (Exception e) {
            ((agsj) ((agsj) a.c()).j(e)).t("Failed to save the key to invalidate in shared preferences.");
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v15, types: [agfr, java.lang.Object] */
    public final Object j(boolean z, pmi pmiVar, awoq awoqVar) throws Throwable {
        pmp pmpVar;
        ahyy ahyyVar;
        if (awoqVar instanceof pmp) {
            pmpVar = (pmp) awoqVar;
            int i = pmpVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmpVar.d = i - Integer.MIN_VALUE;
            } else {
                pmpVar = new pmp(this, awoqVar);
            }
        } else {
            pmpVar = new pmp(this, awoqVar);
        }
        Object objA = pmpVar.b;
        awox awoxVar = awox.a;
        int i2 = pmpVar.d;
        if (i2 == 0) {
            atqp.j(objA);
            agev agevVar = (agev) ((aupo) this.g).b;
            if (agevVar.g()) {
                pon ponVar = (pon) agevVar.c();
                pmpVar.e = pmiVar;
                pmpVar.a = z;
                pmpVar.d = 1;
                objA = ponVar.a();
                if (objA == awoxVar) {
                    return awoxVar;
                }
            } else {
                ((agsj) a.b()).t("Encrypted payload couldn't be decrypted since GnpEncryptionManager is not found.");
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = pmpVar.a;
        pmiVar = pmpVar.e;
        atqp.j(objA);
        pky pkyVar = (pky) objA;
        if (pkyVar instanceof pku) {
            ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed to retrieve the decrypted data.");
        }
        byte[] bArr = (byte[]) pkyVar.d();
        ((qtf) ((pwf) this.j.io()).j.io()).b(1L, this.i.getPackageName(), ((pls) this.k.io()).a, Boolean.valueOf(bArr == null), Boolean.valueOf(z), Boolean.FALSE);
        if (bArr != null) {
            return bArr;
        }
        if (z) {
            ahyyVar = ahyy.FAILED_TO_DECRYPT_PAYLOAD_FALLBACK_TO_PLACEHOLDER;
        } else {
            k(pqf.l);
            ahyyVar = ahyy.FAILED_TO_DECRYPT_PAYLOAD_NO_PLACEHOLDER;
        }
        pny pnyVar = (pny) this.d.io();
        pnz pnzVarB = ((pob) this.e.io()).b(ahyyVar);
        ahyr ahyrVarB = pmiVar.b();
        ahyrVarB.getClass();
        ((poc) pnzVarB).l = ahyrVarB;
        pnyVar.a(pnzVarB);
        return null;
    }
}
