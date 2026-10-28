package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ytu implements ywj {
    ywn a = ywn.b;
    final /* synthetic */ ytv b;
    private final yxh d;
    private final zei e;
    private zjd f;
    private final spa g;

    public ytu(ytv ytvVar, spa spaVar, yxh yxhVar, zei zeiVar, zjd zjdVar) {
        this.b = ytvVar;
        this.g = spaVar;
        this.d = yxhVar;
        this.e = zeiVar;
        this.f = zjdVar;
    }

    private final void B(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        zhr.b(zhq.MLPLAYER, "MedialibPlayerEvents[%s].%s", Integer.valueOf(System.identityHashCode(this) % 100), str);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0233 A[Catch: all -> 0x02cf, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x024f A[Catch: all -> 0x02cf, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x025e A[Catch: all -> 0x02cf, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x026d  */
    /* JADX WARN: Code duplicated, block: B:78:0x026f A[Catch: all -> 0x02cf, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0277 A[Catch: all -> 0x02cf, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0294 A[Catch: all -> 0x02cf, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0299  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a7 A[Catch: all -> 0x02cf, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02b5 A[Catch: all -> 0x02cf, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c1 A[Catch: all -> 0x02cf, LOOP:0: B:95:0x02bb->B:97:0x02c1, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x02cf, blocks: (B:3:0x0031, B:5:0x0039, B:6:0x0042, B:8:0x0050, B:10:0x005f, B:12:0x006a, B:13:0x0081, B:14:0x0090, B:16:0x00a4, B:21:0x00cd, B:23:0x00d6, B:25:0x00e5, B:26:0x0105, B:28:0x013e, B:30:0x0144, B:32:0x015f, B:34:0x016c, B:36:0x0170, B:46:0x01a8, B:48:0x01be, B:50:0x01c7, B:52:0x01cd, B:54:0x01d3, B:56:0x01e3, B:58:0x01f3, B:59:0x01f6, B:61:0x0203, B:62:0x020c, B:63:0x0210, B:65:0x0216, B:67:0x021c, B:68:0x021f, B:70:0x0233, B:71:0x0249, B:73:0x024f, B:75:0x025e, B:79:0x0273, B:81:0x0277, B:84:0x0285, B:78:0x026f, B:85:0x028c, B:88:0x0294, B:90:0x029a, B:92:0x02a7, B:94:0x02b5, B:95:0x02bb, B:97:0x02c1, B:38:0x0176, B:40:0x017f, B:42:0x0185, B:44:0x019e, B:20:0x00c0, B:17:0x00ac), top: B:104:0x0031 }] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ywj
    public final void A(long j, long j2, ywk ywkVar, boolean z, long j3, zgs zgsVar) {
        spa spaVar;
        acjd acjdVarY;
        String strB;
        Object obj;
        afip afipVar;
        Iterator it;
        abvy abvyVar;
        String strAu;
        boolean z2;
        acip acipVar;
        acip acipVarC;
        acjl acjlVar;
        String strH;
        B("onTransition(%d -> %d, transitionTimeMs.%d, transitionMode.%s)", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), zgsVar);
        spa spaVar2 = this.g;
        spaVar2.f();
        ytv ytvVar = this.b;
        ytvVar.j = ywkVar.a;
        try {
            if (ytvVar.e.dA()) {
                ywn ywnVar = ywkVar.a;
                ywnVar.y(ywnVar.d());
            }
            yxh yxhVar = this.d;
            abmt abmtVar = ((acfs) yxhVar).g;
            if (abmtVar.bG() && (strH = ((acfs) yxhVar).a.w().h()) != null) {
                if (abmt.co(((acfs) yxhVar).m)) {
                    ((acfs) yxhVar).j.b(strH, ((acfs) yxhVar).b(), ((acfs) yxhVar).E(), null);
                } else {
                    ((acfs) yxhVar).n.t(strH, ((acfs) yxhVar).E());
                }
            }
            tqj tqjVar = abmtVar.b;
            oqe oqeVar = new oqe(abmtVar, 16);
            int i = tqr.a;
            long epochMilli = tqjVar.k(1073814200) ? tqjVar.k(1073814201) : ((vxz) oqeVar.io()).m(86, 45460237L) ? j3 : ((acfs) yxhVar).f.f().toEpochMilli();
            if (((acfs) yxhVar).N() && aawr.n(((acfs) yxhVar).p.j())) {
                acip acipVar2 = ((acfs) yxhVar).a;
                acipVar2.p().l();
                ((acfs) yxhVar).n.n(acipVar2.au());
                ((acfs) yxhVar).L(abob.d);
            }
            avgj avgjVar = ((acfs) yxhVar).p;
            acip acipVar3 = ((acfs) yxhVar).a;
            long j4 = epochMilli;
            avgjVar.p(acipVar3, 4, acipVar3.w().g, j, j, -1L);
            vyo vyoVar = ((acfs) yxhVar).h;
            if (abmt.ai(vyoVar, aawr.o(avgjVar.j()), aawr.n(avgjVar.j())) && zgsVar.a()) {
                spaVar = spaVar2;
                acjd acjdVarY2 = acipVar3.x().y(acipVar3.au(), acipVar3.w().f);
                if ((!afxw.e(vyoVar).X || (abmtVar.e.m(ModuleDescriptor.MODULE_VERSION, 45633940L) && (acjdVarY2 instanceof aciw) && ((aciw) acjdVarY2).j == 1)) && ((acfs) yxhVar).N() && acipVar3.a() == 0) {
                    acipVar3.p().l();
                    ((acfs) yxhVar).n.n(acipVar3.au());
                    if (abmtVar.ad()) {
                        acipVar3.s().c();
                    }
                }
                acjdVarY = acipVar3.x().y(acipVar3.au(), acipVar3.w().f);
                if (acjdVarY != null) {
                    acipVar3.aV().kk(new aayq(acjdVarY.b(), j4, acipVar3.a()));
                }
                if (abmtVar.aU()) {
                    abvyVar = ((acfs) yxhVar).l;
                    strAu = acipVar3.au();
                    strAu.getClass();
                    z2 = zgsVar instanceof zgq;
                    if (z2) {
                        abvyVar.b.add(strAu);
                        acipVar = (acip) abvyVar.a.get(strAu);
                        if (acipVar == null) {
                            acipVarC = null;
                        } else {
                            acipVarC = abvyVar.c(acipVar);
                        }
                        if (acipVarC instanceof acjl) {
                            acjlVar = (acjl) acipVarC;
                            if (awrc.c(strAu, acjlVar.au()) && z2) {
                                acjlVar.a.kk(awmy.a);
                            }
                        }
                    }
                }
                if (abmtVar.al()) {
                    if (acjdVarY != null) {
                        strB = acjdVarY.b();
                    } else {
                        strB = null;
                    }
                    obj = avgjVar.a;
                    if (((acfg) obj).k.al()) {
                        afipVar = ((acfg) obj).B;
                        if (((abmt) afipVar.a).al()) {
                            it = afipVar.d.iterator();
                            while (it.hasNext()) {
                                ((acii) it.next()).J(strB);
                            }
                        }
                    }
                }
                spaVar.e();
            }
            spaVar = spaVar2;
            if (abmt.ai(vyoVar, aawr.o(avgjVar.j()), aawr.n(avgjVar.j())) && ((acfs) yxhVar).N() && acipVar3.a() == 1) {
                wjf wjfVarF = acipVar3.f();
                if (wjfVarF != null && Math.abs(j - wjfVarF.d()) <= 1000) {
                    aawr.l(acipVar3, 7);
                    avgjVar.r(acipVar3, 2);
                    if (!((acfs) yxhVar).M()) {
                        avgjVar.l(false);
                    }
                    avgjVar.r(acipVar3, 3);
                    if (((acfs) yxhVar).M()) {
                        avgjVar.k();
                    } else {
                        ((acfs) yxhVar).n.r(acipVar3);
                    }
                } else if (abmtVar.az() || abmtVar.ay()) {
                    avgjVar.k();
                }
            }
            acjdVarY = acipVar3.x().y(acipVar3.au(), acipVar3.w().f);
            if (acjdVarY != null) {
                acipVar3.aV().kk(new aayq(acjdVarY.b(), j4, acipVar3.a()));
            }
            if (abmtVar.aU()) {
                abvyVar = ((acfs) yxhVar).l;
                strAu = acipVar3.au();
                strAu.getClass();
                z2 = zgsVar instanceof zgq;
                if (z2) {
                    abvyVar.b.add(strAu);
                    acipVar = (acip) abvyVar.a.get(strAu);
                    if (acipVar == null) {
                        acipVarC = null;
                    } else {
                        acipVarC = abvyVar.c(acipVar);
                    }
                    if (acipVarC instanceof acjl) {
                        acjlVar = (acjl) acipVarC;
                        if (awrc.c(strAu, acjlVar.au())) {
                            acjlVar.a.kk(awmy.a);
                        }
                    }
                }
            }
            if (abmtVar.al()) {
                if (acjdVarY != null) {
                    strB = acjdVarY.b();
                } else {
                    strB = null;
                }
                obj = avgjVar.a;
                if (((acfg) obj).k.al()) {
                    afipVar = ((acfg) obj).B;
                    if (((abmt) afipVar.a).al()) {
                        it = afipVar.d.iterator();
                        while (it.hasNext()) {
                            ((acii) it.next()).J(strB);
                        }
                    }
                }
            }
            spaVar.e();
        } catch (Throwable th) {
            this.g.e();
            throw th;
        }
    }

    @Override // defpackage.ywj
    public final /* synthetic */ yxj a() {
        return yxj.a;
    }

    @Override // defpackage.ywj
    public final zjd b() {
        return this.f;
    }

    @Override // defpackage.ywj
    public final void c(int i) {
        this.e.a(i);
    }

    @Override // defpackage.ywj
    public final void d(int i) {
        int i2;
        zei zeiVar = this.e;
        if (!zeiVar.b.bl() || i == (i2 = zeiVar.d)) {
            return;
        }
        if (i2 != -1) {
            zeiVar.a(i2);
        }
        Intent intent = zeiVar.c;
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        zeiVar.a.sendBroadcast(intent);
        zeiVar.d = i;
    }

    @Override // defpackage.yxg
    public final void e() {
        B("onBuffering()", new Object[0]);
        this.g.f();
        try {
            yxh yxhVar = this.d;
            if (((acfs) yxhVar).N()) {
                ((acfs) yxhVar).F(5);
            }
        } finally {
            this.g.e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    @Override // defpackage.yxg
    public final void f(wgs wgsVar, long j, long j2, ywx[] ywxVarArr) {
        yww ywwVarC;
        zhq zhqVar = zhq.ABR;
        System.identityHashCode(this);
        wgsVar.e();
        yxh yxhVar = this.d;
        int length = ywxVarArr.length;
        acfs acfsVar = (acfs) yxhVar;
        wjf wjfVarB = acfsVar.b();
        boolean z = (wjfVarB == null || wjfVarB.f() == null || !wjfVarB.f().aa()) ? false : true;
        boolean z2 = aawr.o(acfsVar.a) && acfsVar.g.g.m(404, 45788156L);
        int i = 0;
        while (i < length) {
            ywx ywxVar = ywxVarArr[i];
            if (ywxVar.a.equals("http://youtube.com/streaming/metadata/segment/102015") && wgsVar.I()) {
                avgj avgjVar = acfsVar.p;
                if ((aawr.n(avgjVar.j()) || aawr.o(avgjVar.j())) && !z && (ywwVarC = yww.c(j2, ywxVar)) != null) {
                    acfsVar.i.post(new abwl(yxhVar, ywwVarC, 13));
                }
                if (z2) {
                    String str = (String) ywxVar.b.get("Current-Absolute-Loudness-Lkfs");
                    Float fValueOf = null;
                    if (str != null) {
                        try {
                            fValueOf = Float.valueOf(Float.parseFloat(str));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (fValueOf != null && wjfVarB != null && wjfVarB.f() != null) {
                        acfsVar.i.post(new aapc(yxhVar, wjfVarB, fValueOf, 11, (char[]) null));
                    }
                }
            }
            i++;
            yxhVar = yxhVar;
            wjfVarB = wjfVarB;
        }
        yxh yxhVar2 = yxhVar;
        wjf wjfVar = wjfVarB;
        if (wjfVar == null || wjfVar.f() == null || !wjfVar.f().ag()) {
            return;
        }
        aawz aawzVar = new aawz(ywxVarArr, wgsVar, j, j2);
        boolean z3 = acfsVar.g.e.m(333, 45766656L) && wjfVar.T();
        boolean zAa = wjfVar.f().aa();
        if (!z3 && !zAa) {
            acip acipVar = acfsVar.a;
            acipVar.l().a(aawzVar, acipVar.x(), acipVar.f(), acipVar.w().j, acipVar.w().f, new abzk(yxhVar2, 4));
        }
        acfsVar.a.ax().kk(aawzVar);
    }

    @Override // defpackage.yxg
    public final void g() {
        B("onEnded()", new Object[0]);
        this.g.f();
        try {
            this.d.g();
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void h(zhz zhzVar) {
        i(zhzVar, yxj.a);
    }

    @Override // defpackage.yxg
    public final void i(zhz zhzVar, yxj yxjVar) {
        zhq zhqVar = zhq.ABR;
        String.format("MedialibPlayerEvents[%s].onError(code=%s detail=%s role=%s)", Integer.valueOf(System.identityHashCode(this) % 100), zhzVar.f(), ahno.Z(zhzVar.e), yxjVar);
        this.g.f();
        if (zhzVar.f && (yxjVar == yxj.a || !this.b.e.bD())) {
            ytv ytvVar = this.b;
            ytvVar.i = false;
            ytvVar.e.E.b();
        }
        try {
            boolean zBD = this.b.e.bD();
            yxh yxhVar = this.d;
            if (zBD) {
                yxhVar.i(zhzVar, yxjVar);
            } else {
                yxhVar.h(zhzVar);
            }
        } finally {
            this.g.e();
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.yxg
    public final void j(yvu yvuVar) {
        B("onFormatStreamChange(%s)", yvuVar);
        this.g.f();
        try {
            yxh yxhVar = this.d;
            acip acipVar = ((acfs) yxhVar).a;
            acipVar.p().g(yvuVar);
            Iterator it = ((acfs) yxhVar).n.d.iterator();
            while (it.hasNext()) {
                ((acii) it.next()).k(yvuVar, acipVar.au());
            }
            acipVar.ay().kk(yvuVar);
            zgj zgjVar = ((acfs) yxhVar).j.p;
            if (zgjVar != null && abmt.co(((acfs) yxhVar).m)) {
                zgjVar.s(yvuVar);
            }
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void k(long j, long j2) {
        B("onMediaTimeRangeChange(beginTimeMs=%d endTimeMs=%d)", Long.valueOf(j), Long.valueOf(j2));
        this.g.f();
        try {
            acip acipVar = ((acfs) this.d).a;
            aawr.j(acipVar, j2);
            acipVar.w().h = j;
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void l(String str) {
        B("onOfflineDrmSessionExpirationUpdate(videoId=%s", str);
        this.g.f();
        try {
            ((acfs) this.d).a.aE().kk(new aawq(str));
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void m() {
        B("onPaused()", new Object[0]);
        this.g.f();
        try {
            yxh yxhVar = this.d;
            long epochMilli = ((acfs) yxhVar).f.f().toEpochMilli();
            if (((acfs) yxhVar).N()) {
                aaxv aaxvVar = new aaxv();
                aaxvVar.a = epochMilli;
                acip acipVar = ((acfs) yxhVar).a;
                acipVar.aI().kk(aaxvVar);
                abyv abyvVarP = acipVar.p();
                abzc abzcVar = abyvVarP.b;
                if (abzcVar != null && abyvVarP.f) {
                    abzcVar.n();
                }
                abzh abzhVar = abyvVarP.c;
                if (abzhVar != null && abzhVar.g) {
                    abzhVar.C = 3;
                    abzhVar.b(false, abzhVar.d.b());
                    abzhVar.g = false;
                }
                acipVar.t().m();
                ((acfs) yxhVar).F(3);
            }
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void n() {
        B("onPausedBuffering()", new Object[0]);
        this.g.f();
        try {
            yxh yxhVar = this.d;
            if (((acfs) yxhVar).N()) {
                ((acfs) yxhVar).F(6);
            }
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void o(long j, appa appaVar) {
        B("onPausedSeeking(positionMillis=%d)", Long.valueOf(j));
        this.g.f();
        try {
            yxh yxhVar = this.d;
            if (((acfs) yxhVar).N()) {
                acip acipVar = ((acfs) yxhVar).a;
                acipVar.aM().kk(new aaxj(((acfs) yxhVar).a(), j, appaVar));
                acipVar.p().m(j, appaVar);
                long jD = acipVar.t().d(j, false);
                if (!((acfs) yxhVar).g.ad()) {
                    ((acfs) yxhVar).c.a(jD);
                }
                ((acfs) yxhVar).F(10);
            }
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void p(float f) {
        B("onPlaybackRateChange(playbackRate=%f)", Float.valueOf(f));
        this.g.f();
        try {
            yxh yxhVar = this.d;
            if (((acfs) yxhVar).g.aA()) {
                abyd abydVarM = ((acfs) yxhVar).o.m(((acfs) yxhVar).E());
                ((acfs) yxhVar).k.kk(new abxe(((acfs) yxhVar).a, new agqj(new abxg(f, abydVarM != null ? (abxj) abydVarM.a(abxj.class) : abxj.a))));
            } else {
                wjf wjfVarF = ((acfs) yxhVar).p.j().f();
                ((acfs) yxhVar).n.o(new aaxh(aawr.i(((acfs) yxhVar).e, wjfVarF).a(), wjfVarF, f), ((acfs) yxhVar).a);
            }
        } finally {
            this.g.e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    @Override // defpackage.yxg
    public final void q() {
        aaxt aaxtVar;
        boolean z;
        int i;
        B("onPlaying()", new Object[0]);
        this.g.f();
        try {
            if (!this.b.e.dA()) {
                ywn ywnVar = this.a;
                ywnVar.y(ywnVar.d());
            }
            yxh yxhVar = this.d;
            long epochMilli = ((acfs) yxhVar).f.f().toEpochMilli();
            wjf wjfVarB = ((acfs) yxhVar).b();
            abnc abncVar = ((acfs) yxhVar).d;
            if (aawr.q(abncVar, wjfVarB)) {
                ((acfs) yxhVar).e.I(16);
            } else {
                abmt abmtVar = ((acfs) yxhVar).g;
                if (abmtVar.T() || abmtVar.J() || abmtVar.bK()) {
                    ((acfs) yxhVar).a();
                    aaxt aaxtVar2 = new aaxt(null, null, null);
                    aaxtVar2.a = epochMilli;
                    ((acfs) yxhVar).n.m(aaxtVar2, ((acfs) yxhVar).a);
                    aaxtVar = aaxtVar2;
                } else {
                    aaxtVar = null;
                }
                if (abmtVar.B()) {
                    ((acfs) yxhVar).a.u().d(true);
                }
                long j = ((acfs) yxhVar).c().d;
                acip acipVar = ((acfs) yxhVar).a;
                wjf wjfVarF = acipVar.f();
                if (wjfVarF != null && wjfVarF.Q()) {
                    acjd acjdVarC = acipVar.x().c(acipVar.au());
                    if (acjdVarC instanceof aciw) {
                        ((aciw) acjdVarC).i(j);
                    }
                }
                if (!aawr.o(acipVar) && j > 0) {
                    aawr.j(acipVar, j);
                }
                aawr.k(acipVar, ((acfs) yxhVar).c().b);
                avgj avgjVar = ((acfs) yxhVar).p;
                avgjVar.q(3);
                if (((acfs) yxhVar).N() || ((acfs) yxhVar).A().a(abob.g) || (abmtVar.ad() && ((acfs) yxhVar).A().a(abob.a))) {
                    Object obj = avgjVar.a;
                    acfs acfsVar = ((acfg) obj).r;
                    wja wjaVarG = wjfVarB != null ? wjfVarB.g() : null;
                    if (wjfVarB == null || !wjfVarB.f().aR()) {
                        z = false;
                    } else {
                        akwm akwmVar = wjfVarB.f().d.f;
                        if (akwmVar == null) {
                            akwmVar = akwm.b;
                        }
                        if (akwmVar.aL) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    abncVar.r(acfg.aK(wjaVarG) || z);
                    avgjVar.o((acfs) yxhVar);
                    vyo vyoVar = ((acfs) yxhVar).h;
                    if (abmt.ai(vyoVar, aawr.o(avgjVar.j()), aawr.n(avgjVar.j())) && wjfVarB != null && acipVar.a() != 1) {
                        acipVar.p().i(acipVar.au(), wjfVarB, acipVar.a());
                    }
                    if (acfsVar != yxhVar) {
                        if (acipVar.a() == 1) {
                            ((acfg) obj).w(acipVar.au());
                            ((acfs) yxhVar).L(abob.e);
                            acfg.aY(abnv.e, acipVar);
                            acip acipVarJ = avgjVar.j();
                            if (wjfVarB != null) {
                                acipVar.p().h(acipVarJ.au(), wjfVarB, acipVar.au(), acipVar.a());
                            }
                        } else {
                            ((acfg) obj).q = null;
                            ((acfs) yxhVar).L(abob.h);
                            if (abmt.ai(vyoVar, aawr.o(avgjVar.j()), aawr.n(avgjVar.j()))) {
                                acipVar.t().d(acipVar.w().f, false);
                            } else if (wjfVarB != null) {
                                acipVar.p().i(acipVar.au(), wjfVarB, acipVar.a());
                            }
                        }
                    }
                    if (aawr.o(acipVar)) {
                        long j2 = ((acfs) yxhVar).c().b;
                        if (j2 == -1) {
                            j2 = abmtVar.j();
                        }
                        aawr.k(acipVar, j2);
                    }
                    if (wjfVarB != null) {
                        i = 3;
                        acipVar.p().k(aawr.g(acipVar), acipVar.au(), wjfVarB, acipVar.a());
                    } else {
                        i = 3;
                    }
                    if (abmt.aQ(vyoVar)) {
                        acipVar.t().s();
                    }
                    if (!abmtVar.ad()) {
                        if (abmt.bJ(vyoVar)) {
                            ((acfs) yxhVar).c.i = false;
                        }
                        ((acfs) yxhVar).c.b();
                    }
                    abob abobVarA = ((acfs) yxhVar).A();
                    abob abobVar = abob.f;
                    if (abobVarA.a(abob.e, abobVar)) {
                        if (!((acfs) yxhVar).A().d()) {
                            ((acfs) yxhVar).L(abobVar);
                            acfg.aY(abnv.f, acipVar);
                        }
                        ((acfs) yxhVar).a();
                        aaxtVar = new aaxt(null, null, null);
                    }
                    abob abobVarA2 = ((acfs) yxhVar).A();
                    abob[] abobVarArr = new abob[i];
                    abobVarArr[0] = abob.h;
                    abobVarArr[1] = abob.g;
                    abob abobVar2 = abob.i;
                    abobVarArr[2] = abobVar2;
                    if (abobVarA2.a(abobVarArr)) {
                        if (!abmtVar.V() && !((acfs) yxhVar).A().d()) {
                            ((acfs) yxhVar).L(abobVar2);
                        }
                        ((acfs) yxhVar).a();
                        aaxtVar = new aaxt(null, null, null);
                    }
                    if (aaxtVar != null) {
                        aaxtVar.a = epochMilli;
                        if (!abmtVar.T() && !abmtVar.J() && !abmtVar.bK()) {
                            ((acfs) yxhVar).n.m(aaxtVar, acipVar);
                        }
                    }
                    ((acfs) yxhVar).F(2);
                }
            }
            this.f = zjd.a;
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void r() {
        B("onPreparing()", new Object[0]);
        this.g.f();
        try {
            yxh yxhVar = this.d;
            avgj avgjVar = ((acfs) yxhVar).p;
            avgjVar.q(2);
            if (((acfs) yxhVar).g.aj()) {
                avgjVar.o((acfs) yxhVar);
            }
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void s(long j) {
        B("onProgressing(playbackStartSystemTimeMs=%d)", Long.valueOf(j));
        this.g.f();
        try {
            yxh yxhVar = this.d;
            mbc mbcVar = ((acfs) yxhVar).f;
            long epochMilli = mbcVar.f().toEpochMilli();
            long jB = mbcVar.b();
            abmt abmtVar = ((acfs) yxhVar).g;
            if (abmtVar.V() && ((((acfs) yxhVar).N() || ((acfs) yxhVar).A().a(abob.g) || (abmtVar.ad() && ((acfs) yxhVar).A().a(abob.a))) && ((acfs) yxhVar).A().a(abob.h, abob.g, abob.a))) {
                ((acfs) yxhVar).L(abob.i);
            }
            if (((acfs) yxhVar).A().d()) {
                aaxz aaxzVar = new aaxz(((acfs) yxhVar).a(), ((acfs) yxhVar).A().a(abob.f));
                if (j >= 0) {
                    if (!abmtVar.V()) {
                        epochMilli = mbcVar.f().toEpochMilli();
                    }
                    long j2 = j - epochMilli;
                    if (!abmtVar.V()) {
                        jB = mbcVar.b();
                    }
                    aaxzVar.e(Math.max(0L, j2 + jB));
                    aaxzVar.a = j;
                } else {
                    if (!abmtVar.V()) {
                        epochMilli = mbcVar.f().toEpochMilli();
                    }
                    aaxzVar.a = epochMilli;
                }
                ((acfs) yxhVar).a.aO().kk(aaxzVar);
            }
            this.f = zjd.a;
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void t(aphs aphsVar) {
        this.g.f();
        try {
            ((acfs) this.d).a.aS().kk(new aayo(aphsVar));
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void u() {
        this.g.f();
        try {
            yxh yxhVar = this.d;
            if (((acfs) yxhVar).N()) {
                ((acfs) yxhVar).F(11);
            }
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void v(long j, appa appaVar) {
        B("onSeeking(positionMillis=%d)", Long.valueOf(j));
        this.g.f();
        try {
            yxh yxhVar = this.d;
            if (((acfs) yxhVar).N()) {
                ((acfs) yxhVar).G(j, appaVar);
                ((acfs) yxhVar).F(9);
            }
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void w(long j, appa appaVar) {
        B("onSeeked(positionMillis=%d)", Long.valueOf(j));
        this.g.f();
        try {
            yxh yxhVar = this.d;
            if (((acfs) yxhVar).N()) {
                ((acfs) yxhVar).G(j, appaVar);
            }
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void x(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) {
        this.g.f();
        try {
            ((acfs) this.d).a.aZ().kk(new aayz(stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList));
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void y() {
        B("onStopped()", new Object[0]);
        this.g.f();
        try {
            this.d.y();
        } finally {
            this.g.e();
        }
    }

    @Override // defpackage.yxg
    public final void z(arfb arfbVar) {
        B("onVideoQualitySettingChange(%d)", Integer.valueOf(arfbVar.e));
        this.g.f();
        try {
            yxh yxhVar = this.d;
            ((acfs) yxhVar).n.l(new aaxd(arfbVar, false), ((acfs) yxhVar).a);
        } finally {
            this.g.e();
        }
    }
}
