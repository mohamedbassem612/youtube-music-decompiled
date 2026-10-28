package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achw implements achv {
    public static final long a;
    public final awmd b;
    public final awmd c;
    private final Executor e;
    private final xeu f;
    private final abmt g;
    private int i;
    private long j;
    private long k;
    private final dxu n;
    public final AtomicReference d = new AtomicReference();
    private abob h = null;
    private aony l = aony.OK;
    private String m = "";

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 25000L;
    }

    public achw(dxu dxuVar, Executor executor, awmd awmdVar, awmd awmdVar2, xeu xeuVar, abmt abmtVar, avlh avlhVar) {
        this.n = dxuVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        executor.getClass();
        this.e = executor;
        this.f = xeuVar;
        this.g = abmtVar;
        avlhVar.ak(new aceb(this, 20));
    }

    public static ajwo a(alvl alvlVar) {
        if (h(alvlVar)) {
            alvg alvgVar = alvlVar.r;
            if (alvgVar == null) {
                alvgVar = alvg.a;
            }
            amsp amspVar = alvgVar.c;
            if (amspVar == null) {
                amspVar = amsp.a;
            }
            if ((amspVar.b & 4) != 0) {
                alvg alvgVar2 = alvlVar.r;
                if (alvgVar2 == null) {
                    alvgVar2 = alvg.a;
                }
                amsp amspVar2 = alvgVar2.c;
                if (amspVar2 == null) {
                    amspVar2 = amsp.a;
                }
                ajwo ajwoVar = amspVar2.d;
                return ajwoVar == null ? ajwo.a : ajwoVar;
            }
        }
        return null;
    }

    private static boolean h(alvl alvlVar) {
        alvg alvgVar = alvlVar.r;
        if (alvgVar == null) {
            alvgVar = alvg.a;
        }
        return (alvgVar.b & 1) != 0;
    }

    private final boolean n() {
        return this.k - this.j < a;
    }

    @Override // defpackage.achv
    public final int b(achu achuVar) {
        alvl alvlVar = achuVar.a;
        if (alvlVar == null) {
            return 0;
        }
        aony aonyVarA = aony.a(alvlVar.c);
        if (aonyVarA == null) {
            aonyVarA = aony.OK;
        }
        this.l = aonyVarA;
        if (h(alvlVar)) {
            alvg alvgVar = alvlVar.r;
            if (alvgVar == null) {
                alvgVar = alvg.a;
            }
            amsp amspVar = alvgVar.c;
            if (amspVar == null) {
                amspVar = amsp.a;
            }
            this.m = amspVar.c;
        }
        aony aonyVarA2 = aony.a(alvlVar.c);
        if (aonyVarA2 == null) {
            aonyVarA2 = aony.OK;
        }
        if (aonyVarA2 != aony.LIVE_STREAM_OFFLINE) {
            return 0;
        }
        if (h(alvlVar)) {
            alvg alvgVar2 = alvlVar.r;
            if (alvgVar2 == null) {
                alvgVar2 = alvg.a;
            }
            amsp amspVar2 = alvgVar2.c;
            if (amspVar2 == null) {
                amspVar2 = amsp.a;
            }
            amso amsoVar = amspVar2.h;
            if (amsoVar == null) {
                amsoVar = amso.a;
            }
            if ((amsoVar.b & 1) != 0) {
                return 0;
            }
        }
        this.n.e(new aboe(3, false, 2, alvlVar.e, null, null, null, null));
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x011e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0135  */
    /* JADX WARN: Code duplicated, block: B:93:0x013b A[ADDED_TO_REGION] */
    @Override // defpackage.achv
    public final int c(achu achuVar) {
        aony aonyVar;
        aony aonyVar2;
        boolean z;
        aony aonyVarA;
        int i;
        boolean z2;
        ahhp ahhpVar;
        alvl alvlVar = achuVar.a;
        if (alvlVar == null) {
            return 0;
        }
        aony aonyVarA2 = aony.a(alvlVar.c);
        if (aonyVarA2 == null) {
            aonyVarA2 = aony.OK;
        }
        if (h(alvlVar)) {
            alvg alvgVar = alvlVar.r;
            if (alvgVar == null) {
                alvgVar = alvg.a;
            }
            amsp amspVar = alvgVar.c;
            if (amspVar == null) {
                amspVar = amsp.a;
            }
            String str = amspVar.c;
            if (!this.m.equals(str)) {
                acip acipVar = (acip) this.d.get();
                if (acipVar != null && (ahhpVar = (ahhp) acipVar.e().a()) != null) {
                    ahhpVar.b("lbidh", str, false);
                }
                boolean z3 = (this.m.isEmpty() || str.isEmpty() || !n()) ? false : true;
                if (this.m.isEmpty()) {
                    this.m = str;
                    if (z3) {
                        this.e.execute(afwl.i(new abwl(this, achuVar, 18)));
                        acfz.y(4, 2, alvlVar, this.f);
                    } else if (a(alvlVar) == null) {
                        aonyVar = this.l;
                        aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                        if (aonyVar == aonyVar2) {
                            z = false;
                        } else {
                            z = false;
                        }
                        aonyVarA = aony.a(alvlVar.c);
                        if (aonyVarA == null) {
                            aonyVarA = aony.OK;
                        }
                        this.l = aonyVarA;
                        if (!z) {
                            if (aaje.u(alvlVar)) {
                                return 0;
                            }
                            return 0;
                        }
                        this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                        acfz.y(2, 2, alvlVar, this.f);
                    } else {
                        aonyVar = this.l;
                        aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                        if (aonyVar == aonyVar2) {
                            z = false;
                        } else {
                            z = false;
                        }
                        aonyVarA = aony.a(alvlVar.c);
                        if (aonyVarA == null) {
                            aonyVarA = aony.OK;
                        }
                        this.l = aonyVarA;
                        if (!z) {
                            if (aaje.u(alvlVar)) {
                                return 0;
                            }
                            return 0;
                        }
                        this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                        acfz.y(2, 2, alvlVar, this.f);
                    }
                } else if (z3) {
                    z3 = true;
                    this.m = str;
                    if (z3) {
                        this.e.execute(afwl.i(new abwl(this, achuVar, 18)));
                        acfz.y(4, 2, alvlVar, this.f);
                    } else if (a(alvlVar) == null) {
                        aonyVar = this.l;
                        aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                        if (aonyVar == aonyVar2) {
                            z = false;
                        } else {
                            z = false;
                        }
                        aonyVarA = aony.a(alvlVar.c);
                        if (aonyVarA == null) {
                            aonyVarA = aony.OK;
                        }
                        this.l = aonyVarA;
                        if (!z) {
                            if (aaje.u(alvlVar)) {
                                return 0;
                            }
                            return 0;
                        }
                        this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                        acfz.y(2, 2, alvlVar, this.f);
                    } else {
                        aonyVar = this.l;
                        aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                        if (aonyVar == aonyVar2) {
                            z = false;
                        } else {
                            z = false;
                        }
                        aonyVarA = aony.a(alvlVar.c);
                        if (aonyVarA == null) {
                            aonyVarA = aony.OK;
                        }
                        this.l = aonyVarA;
                        if (!z) {
                            if (aaje.u(alvlVar)) {
                                return 0;
                            }
                            return 0;
                        }
                        this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                        acfz.y(2, 2, alvlVar, this.f);
                    }
                } else if (a(alvlVar) == null) {
                    aonyVar = this.l;
                    aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                    if (aonyVar == aonyVar2) {
                        z = false;
                    } else {
                        z = false;
                    }
                    aonyVarA = aony.a(alvlVar.c);
                    if (aonyVarA == null) {
                        aonyVarA = aony.OK;
                    }
                    this.l = aonyVarA;
                    if (!z) {
                        if (aaje.u(alvlVar)) {
                            return 0;
                        }
                        return 0;
                    }
                    this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                    acfz.y(2, 2, alvlVar, this.f);
                } else {
                    aonyVar = this.l;
                    aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                    if (aonyVar == aonyVar2) {
                        z = false;
                    } else {
                        z = false;
                    }
                    aonyVarA = aony.a(alvlVar.c);
                    if (aonyVarA == null) {
                        aonyVarA = aony.OK;
                    }
                    this.l = aonyVarA;
                    if (!z) {
                        if (aaje.u(alvlVar)) {
                            return 0;
                        }
                        return 0;
                    }
                    this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                    acfz.y(2, 2, alvlVar, this.f);
                }
            } else if (a(alvlVar) == null) {
                aonyVar = this.l;
                aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                if (aonyVar == aonyVar2) {
                    z = false;
                } else {
                    z = false;
                }
                aonyVarA = aony.a(alvlVar.c);
                if (aonyVarA == null) {
                    aonyVarA = aony.OK;
                }
                this.l = aonyVarA;
                if (!z) {
                    if (aaje.u(alvlVar)) {
                        return 0;
                    }
                    return 0;
                }
                this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                acfz.y(2, 2, alvlVar, this.f);
            } else {
                aonyVar = this.l;
                aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                if (aonyVar == aonyVar2) {
                    z = false;
                } else {
                    z = false;
                }
                aonyVarA = aony.a(alvlVar.c);
                if (aonyVarA == null) {
                    aonyVarA = aony.OK;
                }
                this.l = aonyVarA;
                if (!z) {
                    if (aaje.u(alvlVar)) {
                        return 0;
                    }
                    return 0;
                }
                this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                acfz.y(2, 2, alvlVar, this.f);
            }
        } else if (a(alvlVar) == null && h(alvlVar)) {
            alvg alvgVar2 = alvlVar.r;
            if (alvgVar2 == null) {
                alvgVar2 = alvg.a;
            }
            amsp amspVar2 = alvgVar2.c;
            if (amspVar2 == null) {
                amspVar2 = amsp.a;
            }
            int iAV = a.aV(amspVar2.f);
            if (iAV == 0 || iAV != 4) {
                boolean zN = n();
                if ((alvlVar.b & 524288) == 0) {
                    z2 = false;
                } else {
                    alvg alvgVar3 = alvlVar.r;
                    amsp amspVar3 = (alvgVar3 == null ? alvg.a : alvgVar3).c;
                    if (amspVar3 == null) {
                        amspVar3 = amsp.a;
                    }
                    if (!amspVar3.e) {
                        if (alvgVar3 == null) {
                            alvgVar3 = alvg.a;
                        }
                        amsp amspVar4 = alvgVar3.c;
                        if (amspVar4 == null) {
                            amspVar4 = amsp.a;
                        }
                        int iAV2 = a.aV(amspVar4.f);
                        if (iAV2 == 0 || iAV2 != 3) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                }
                if (zN || z2) {
                    this.e.execute(afwl.i(new aapc(this, achuVar, alvlVar, 13, (char[]) null)));
                    acfz.y(5, true == zN ? 3 : 2, alvlVar, this.f);
                } else {
                    aonyVar = this.l;
                    aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                    if (aonyVar == aonyVar2) {
                        z = false;
                    } else {
                        z = false;
                    }
                    aonyVarA = aony.a(alvlVar.c);
                    if (aonyVarA == null) {
                        aonyVarA = aony.OK;
                    }
                    this.l = aonyVarA;
                    if (!z) {
                        if (aaje.u(alvlVar)) {
                            return 0;
                        }
                        return 0;
                    }
                    this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                    acfz.y(2, 2, alvlVar, this.f);
                }
            } else {
                aonyVar = this.l;
                aonyVar2 = aony.LIVE_STREAM_OFFLINE;
                if (aonyVar == aonyVar2) {
                    z = false;
                } else {
                    z = false;
                }
                aonyVarA = aony.a(alvlVar.c);
                if (aonyVarA == null) {
                    aonyVarA = aony.OK;
                }
                this.l = aonyVarA;
                if (!z) {
                    if (aaje.u(alvlVar)) {
                        return 0;
                    }
                    return 0;
                }
                this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
                acfz.y(2, 2, alvlVar, this.f);
            }
        } else {
            aonyVar = this.l;
            aonyVar2 = aony.LIVE_STREAM_OFFLINE;
            if (aonyVar == aonyVar2 || this.h != abob.c || aonyVarA2 == aonyVar2) {
                z = false;
            } else {
                z = true;
            }
            aonyVarA = aony.a(alvlVar.c);
            if (aonyVarA == null) {
                aonyVarA = aony.OK;
            }
            this.l = aonyVarA;
            if (!z) {
                return (aaje.u(alvlVar) || aonyVarA2 != aonyVar2 || !n() || (i = this.i) == 2 || i == 3) ? 0 : 3;
            }
            this.e.execute(afwl.i(new abwl(this, achuVar, 19)));
            acfz.y(2, 2, alvlVar, this.f);
        }
        return 1;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe d(alvl alvlVar) {
        return null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe e(wno wnoVar) {
        return null;
    }

    @Override // defpackage.achv
    public final /* synthetic */ achs f() {
        return null;
    }

    @Override // defpackage.achv
    public final void i(aazj aazjVar) {
        this.h = aazjVar.a;
    }

    @Override // defpackage.achv
    public final void j(aazk aazkVar) {
        this.j = aazkVar.a;
        this.k = aazkVar.d;
    }

    @Override // defpackage.achv
    public final void k(aazn aaznVar) {
        this.i = aaznVar.a;
    }

    @Override // defpackage.achv
    public final boolean m(achq achqVar, achu achuVar) {
        alvl alvlVar;
        if (this.g.g.l(234, 45708918L, false)) {
            return (achqVar == null || achqVar.e == null) ? false : true;
        }
        if (achuVar != null && (alvlVar = achuVar.a) != null) {
            return h(alvlVar);
        }
        if (achqVar != null) {
            return h(achqVar.c);
        }
        return false;
    }

    @Override // defpackage.achv
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.achv
    public final void l() {
    }
}
