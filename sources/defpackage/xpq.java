package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xpq implements tdh {
    public final cf a;
    private final awmd b;
    private final awut c;
    private final awou d;
    private final xeu e;
    private final vxz f;

    public xpq(cf cfVar, awmd awmdVar, awut awutVar, awou awouVar, xeu xeuVar, vxz vxzVar) {
        cfVar.getClass();
        awmdVar.getClass();
        awutVar.getClass();
        awouVar.getClass();
        xeuVar.getClass();
        vxzVar.getClass();
        this.a = cfVar;
        this.b = awmdVar;
        this.c = awutVar;
        this.d = awouVar;
        this.e = xeuVar;
        this.f = vxzVar;
    }

    private final void e(amyt amytVar) {
        xeu xeuVar = this.e;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(new xzo(amytVar, 1), alot.MDX_LOCAL_NETWORK_PERMISSION_RESPONSE_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        aihf aihfVarCreateBuilder = amxd.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        amytVar.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        amxd amxdVar = (amxd) aihfVarCreateBuilder.instance;
        amxdVar.c = amytVar.e;
        amxdVar.b |= 2;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.getClass();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        alouVar.d = (amxd) aihnVarBuild;
        alouVar.c = 537;
        xeuVar.b(afxw.at(alosVar));
    }

    @Override // defpackage.tdh
    public final void a() {
        awro.t(this.c, this.d, 0, new adqv(this, (awoq) null, 1), 2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(awoq awoqVar) throws Throwable {
        xpp xppVar;
        int i;
        amyt amytVar;
        int iOrdinal;
        amyt amytVar2;
        xpl xplVar;
        amyt amytVar3;
        xpl xplVar2;
        amyt amytVar4;
        xpl xplVar3;
        amyt amytVar5;
        amyt amytVar6;
        xpl xplVar4;
        amyt amytVar7;
        xpl xplVar5;
        if (awoqVar instanceof xpp) {
            xppVar = (xpp) awoqVar;
            int i2 = xppVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xppVar.d = i2 - Integer.MIN_VALUE;
            } else {
                xppVar = new xpp(this, awoqVar);
            }
        } else {
            xppVar = new xpp(this, awoqVar);
        }
        Object objC = xppVar.b;
        awox awoxVar = awox.a;
        switch (xppVar.d) {
            case 0:
                atqp.j(objC);
                i = (!this.f.l(201, 45738960L, false) || Build.VERSION.SDK_INT < 37 || avg.c(this.a, "android.permission.ACCESS_LOCAL_NETWORK") == 0) ? 1 : 0;
                xpl xplVar6 = (xpl) this.b.io();
                xppVar.a = i;
                xppVar.d = 1;
                objC = xplVar6.c(xppVar);
                if (objC == awoxVar) {
                    return awoxVar;
                }
                amytVar = (amyt) objC;
                iOrdinal = amytVar.ordinal();
                if (iOrdinal != 0) {
                    if (i != 0) {
                        amytVar2 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_AUTHORIZED;
                    } else {
                        amytVar2 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_DENIED;
                    }
                    xplVar = (xpl) this.b.io();
                    xppVar.e = amytVar2;
                    xppVar.d = 4;
                    if (xplVar.e(amytVar2, xppVar) != awoxVar) {
                        return awoxVar;
                    }
                    amytVar3 = amytVar2;
                    e(amytVar3);
                } else if (iOrdinal != 1) {
                    if (i != 0) {
                        amytVar7 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_AUTHORIZED;
                        e(amytVar7);
                        if (amytVar != amytVar7) {
                            xplVar5 = (xpl) this.b.io();
                            xppVar.d = 5;
                            if (xplVar5.e(amytVar7, xppVar) == awoxVar) {
                                return awoxVar;
                            }
                        }
                    } else {
                        amytVar6 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_DENIED;
                        e(amytVar6);
                        if (amytVar != amytVar6) {
                            xplVar4 = (xpl) this.b.io();
                            xppVar.d = 6;
                            if (xplVar4.e(amytVar6, xppVar) == awoxVar) {
                                return awoxVar;
                            }
                        }
                    }
                } else if (i != 0) {
                    e(amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_NOT_ASKED);
                    xplVar3 = (xpl) this.b.io();
                    amytVar5 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_AUTHORIZED;
                    xppVar.d = 2;
                    if (xplVar3.e(amytVar5, xppVar) == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    atb.a(this.a, new String[]{"android.permission.ACCESS_LOCAL_NETWORK"}, 65280);
                    xplVar2 = (xpl) this.b.io();
                    amytVar4 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_UNSPECIFIED;
                    xppVar.d = 3;
                    if (xplVar2.e(amytVar4, xppVar) == awoxVar) {
                        return awoxVar;
                    }
                }
                return awmy.a;
            case 1:
                i = xppVar.a;
                atqp.j(objC);
                amytVar = (amyt) objC;
                iOrdinal = amytVar.ordinal();
                if (iOrdinal != 0) {
                    if (i != 0) {
                        amytVar2 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_AUTHORIZED;
                    } else {
                        amytVar2 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_DENIED;
                    }
                    xplVar = (xpl) this.b.io();
                    xppVar.e = amytVar2;
                    xppVar.d = 4;
                    if (xplVar.e(amytVar2, xppVar) != awoxVar) {
                        return awoxVar;
                    }
                    amytVar3 = amytVar2;
                    e(amytVar3);
                } else if (iOrdinal != 1) {
                    if (i != 0) {
                        amytVar7 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_AUTHORIZED;
                        e(amytVar7);
                        if (amytVar != amytVar7) {
                            xplVar5 = (xpl) this.b.io();
                            xppVar.d = 5;
                            if (xplVar5.e(amytVar7, xppVar) == awoxVar) {
                                return awoxVar;
                            }
                        }
                    } else {
                        amytVar6 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_DENIED;
                        e(amytVar6);
                        if (amytVar != amytVar6) {
                            xplVar4 = (xpl) this.b.io();
                            xppVar.d = 6;
                            if (xplVar4.e(amytVar6, xppVar) == awoxVar) {
                                return awoxVar;
                            }
                        }
                    }
                } else if (i != 0) {
                    e(amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_NOT_ASKED);
                    xplVar3 = (xpl) this.b.io();
                    amytVar5 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_AUTHORIZED;
                    xppVar.d = 2;
                    if (xplVar3.e(amytVar5, xppVar) == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    atb.a(this.a, new String[]{"android.permission.ACCESS_LOCAL_NETWORK"}, 65280);
                    xplVar2 = (xpl) this.b.io();
                    amytVar4 = amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_UNSPECIFIED;
                    xppVar.d = 3;
                    if (xplVar2.e(amytVar4, xppVar) == awoxVar) {
                        return awoxVar;
                    }
                }
                return awmy.a;
            case 2:
            case 3:
            case 5:
            case 6:
                atqp.j(objC);
                return awmy.a;
            case 4:
                amytVar3 = xppVar.e;
                atqp.j(objC);
                e(amytVar3);
                return awmy.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void d() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        cf cfVar = this.a;
        intent.setData(Uri.fromParts("package", cfVar.getPackageName(), null));
        intent.addFlags(268435456);
        afwl.m(cfVar, intent);
    }

    @Override // defpackage.tdh
    public final void gY() {
    }
}
