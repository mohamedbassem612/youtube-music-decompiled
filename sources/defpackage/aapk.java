package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aapk implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aapk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x02af  */
    /* JADX WARN: Type inference failed for: r9v11, types: [axsp, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        xir xirVar;
        amjs amjsVarA;
        xir xirVarA;
        switch (this.$cid) {
            case 0:
                ((acii) this.a).h((aazn) obj);
                break;
            case 1:
                ((aapj) this.a).onFormatStreamChangedEvent((yvu) obj);
                break;
            case 2:
                ((acii) this.a).f((aazj) obj);
                break;
            case 3:
                ((acii) this.a).g((aazk) obj);
                break;
            case 4:
                if (((aazj) obj).a == abob.j) {
                    Object obj2 = this.a;
                    aavn aavnVar = (aavn) obj2;
                    if (!aavnVar.i || aavnVar.j) {
                        aunn aunnVar = aavnVar.f;
                        if (!((aavo) aunnVar.io()).p() && !aavnVar.h) {
                            if (((aavo) aunnVar.io()).q(abtu.c) != 2) {
                                aavnVar.k.h.kk(new aayu(true));
                            } else {
                                xir xirVar2 = (xir) aavnVar.b.io();
                                abtt abttVar = abtt.AUTOPLAY;
                                abno abnoVarA = abnp.a();
                                abnoVarA.a = xirVar2;
                                aavnVar.a.execute(afwl.i(new aadw(obj2, new abtu(abttVar, null, abnoVarA.a(), null), 19)));
                            }
                            break;
                        }
                    }
                }
                break;
            case 5:
                ((aavn) this.a).j = ((aayv) obj).c == 2;
                break;
            case 6:
                ((aavn) this.a).i = false;
                break;
            case 7:
                acip acipVar = ((aazq) obj).b;
                ((aavn) this.a).i |= acipVar.a() == 3;
                break;
            case 8:
                ((aavn) this.a).i = true;
                break;
            case 9:
                ((aavn) this.a).h = ((aaxo) obj).a == abnr.REMOTE;
                break;
            case 10:
                aaye aayeVar = (aaye) obj;
                aawf aawfVar = (aawf) this.a;
                if (aawfVar.a() != null) {
                    aawfVar.d(aayeVar);
                    aawfVar.d(aayb.a(aayeVar));
                }
                break;
            case 11:
                aazq aazqVar = (aazq) obj;
                aawf aawfVar2 = (aawf) this.a;
                xir xirVarA2 = aawfVar2.a();
                if (xirVarA2 != null && !aawfVar2.g) {
                    aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                    acip acipVar2 = aazqVar.b;
                    String strAu = acipVar2.au();
                    aihfVarCreateBuilder.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                    strAu.getClass();
                    amiuVar.b |= 262144;
                    amiuVar.p = strAu;
                    wjf wjfVarF = acipVar2.f();
                    if (wjfVarF != null) {
                        String strG = wjfVarF.G();
                        aihfVarCreateBuilder.copyOnWrite();
                        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
                        strG.getClass();
                        amiuVar2.b |= Integer.MIN_VALUE;
                        amiuVar2.y = strG;
                    }
                    xirVarA2.h((amiu) aihfVarCreateBuilder.build());
                    aawfVar2.g = true;
                }
                acip acipVar3 = aazqVar.b;
                aayq aayqVar = aawfVar2.d;
                if (aayqVar != null && TextUtils.equals(acipVar3.au(), aayqVar.a) && (xirVar = (xir) acipVar3.d().a()) != null) {
                    abmt abmtVar = aawfVar2.b;
                    int i = tqr.a;
                    if (!abmtVar.b.k(1073829102)) {
                        xirVar.l(aayqVar.b);
                    } else if (xirVar.q() != 42) {
                        abnl abnlVarN = acipVar3.n();
                        ajwo ajwoVar = abnlVarN != null ? abnlVarN.b : null;
                        if (ajwoVar != null) {
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                            ajwoVar.c(aihlVarCheckIsLite);
                            if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                xirVar.l(aayqVar.b);
                            }
                        } else {
                            xirVar.l(aayqVar.b);
                        }
                    }
                }
                aawfVar2.d = null;
                break;
            case 12:
                ((aawf) this.a).d = (aayq) obj;
                break;
            case 13:
                yvu yvuVar = (yvu) obj;
                wgs wgsVar = yvuVar.c;
                if (wgsVar == null) {
                    wgsVar = yvuVar.f;
                }
                xir xirVarA3 = ((aawf) this.a).a();
                if (wgsVar != null && xirVarA3 != null) {
                    aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
                    aihf aihfVarCreateBuilder3 = amiw.a.createBuilder();
                    int iE = wgsVar.e();
                    aihfVarCreateBuilder3.copyOnWrite();
                    amiw amiwVar = (amiw) aihfVarCreateBuilder3.instance;
                    amiwVar.b |= 1;
                    amiwVar.c = iE;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiu amiuVar3 = (amiu) aihfVarCreateBuilder2.instance;
                    amiw amiwVar2 = (amiw) aihfVarCreateBuilder3.build();
                    amiwVar2.getClass();
                    amiuVar3.N = amiwVar2;
                    amiuVar3.d |= 8;
                    xirVarA3.h((amiu) aihfVarCreateBuilder2.build());
                    break;
                }
                break;
            case 14:
                ((aawf) this.a).e();
                break;
            case 15:
                aazj aazjVar = (aazj) obj;
                String str = aazjVar.g;
                wjf wjfVar = aazjVar.b;
                abob abobVar = aazjVar.a;
                xir xirVarA4 = ((aawf) this.a).a();
                if (abobVar == abob.c && xirVarA4 != null && str != null && wjfVar != null) {
                    xirVarA4.n("gv");
                    aihf aihfVarCreateBuilder4 = amiu.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    amiu amiuVar4 = (amiu) aihfVarCreateBuilder4.instance;
                    amiuVar4.b |= 32768;
                    amiuVar4.n = str;
                    if (!wjfVar.G().isEmpty()) {
                        String strG2 = wjfVar.G();
                        aihfVarCreateBuilder4.copyOnWrite();
                        amiu amiuVar5 = (amiu) aihfVarCreateBuilder4.instance;
                        strG2.getClass();
                        amiuVar5.b |= 536870912;
                        amiuVar5.w = strG2;
                    }
                    xirVarA4.h((amiu) aihfVarCreateBuilder4.build());
                    break;
                }
                break;
            case 16:
                aawf aawfVar3 = (aawf) this.a;
                aawfVar3.c();
                aawfVar3.a.h();
                acip acipVar4 = ((aazq) obj).b;
                if (acipVar4 == null) {
                    aawfVar3.c = new abve(1);
                } else {
                    aawfVar3.c = acipVar4.d();
                    vxz vxzVar = aawfVar3.b.e;
                    if (vxzVar.l(264, 45681202L, false)) {
                        if ((!vxzVar.l(292, 45714677L, false) || ((xirVarA = aawfVar3.a()) != null && xirVarA.q() == 4)) && (amjsVarA = amjs.a(aawfVar3.h.c().a.i)) != null) {
                            aihf aihfVarCreateBuilder5 = amiw.a.createBuilder();
                            aihfVarCreateBuilder5.copyOnWrite();
                            amiw amiwVar3 = (amiw) aihfVarCreateBuilder5.instance;
                            amiwVar3.f = amjsVarA.i;
                            amiwVar3.b |= 16;
                            amiw amiwVar4 = (amiw) aihfVarCreateBuilder5.build();
                            aihf aihfVarCreateBuilder6 = amiu.a.createBuilder();
                            aihfVarCreateBuilder6.copyOnWrite();
                            amiu amiuVar6 = (amiu) aihfVarCreateBuilder6.instance;
                            amiwVar4.getClass();
                            amiuVar6.N = amiwVar4;
                            amiuVar6.d |= 8;
                            amiu amiuVar7 = (amiu) aihfVarCreateBuilder6.build();
                            xir xirVarA5 = aawfVar3.a();
                            if (xirVarA5 != null) {
                                xirVarA5.h(amiuVar7);
                            }
                        }
                    }
                }
                break;
            case 17:
                aaxt aaxtVar = (aaxt) obj;
                aawf aawfVar4 = (aawf) this.a;
                if (aawfVar4.a() != null) {
                    aawfVar4.d(aaxtVar);
                }
                break;
            case 18:
                aawf aawfVar5 = (aawf) this.a;
                aawh aawhVar = aawfVar5.a;
                aaxz aaxzVar = (aaxz) obj;
                xir xirVarA6 = aawfVar5.a();
                int iG = (int) aawhVar.g();
                if (xirVarA6 != null && !aawfVar5.e) {
                    aawfVar5.d(aaxzVar);
                    aawfVar5.e = true;
                    if (iG > 0) {
                        aihf aihfVarCreateBuilder7 = amiu.a.createBuilder();
                        aihf aihfVarCreateBuilder8 = amiw.a.createBuilder();
                        aihfVarCreateBuilder8.copyOnWrite();
                        amiw amiwVar5 = (amiw) aihfVarCreateBuilder8.instance;
                        amiwVar5.b |= 64;
                        amiwVar5.g = iG;
                        aihfVarCreateBuilder7.copyOnWrite();
                        amiu amiuVar8 = (amiu) aihfVarCreateBuilder7.instance;
                        amiw amiwVar6 = (amiw) aihfVarCreateBuilder8.build();
                        amiwVar6.getClass();
                        amiuVar8.N = amiwVar6;
                        amiuVar8.d |= 8;
                        xirVarA6.h((amiu) aihfVarCreateBuilder7.build());
                    }
                    break;
                }
                break;
            case 19:
                aaxv aaxvVar = (aaxv) obj;
                aawf aawfVar6 = (aawf) this.a;
                if (aawfVar6.a() != null && !aawfVar6.f) {
                    aawfVar6.f = true;
                    aawfVar6.d(aaxvVar);
                    break;
                }
                break;
            default:
                tas tasVar = (tas) obj;
                aawf aawfVar7 = (aawf) this.a;
                xir xirVarA7 = aawfVar7.a();
                if (xirVarA7 != null) {
                    if ((tasVar instanceof aaxu) || (tasVar instanceof aaya)) {
                        xirVarA7.n(tasVar.d);
                        aawfVar7.e();
                    }
                }
                break;
        }
    }
}
