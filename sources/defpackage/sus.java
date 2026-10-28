package defpackage;

import android.app.AlertDialog;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sus implements vxc {
    public final cf a;
    public final aduv b;
    public final xgn c;
    public final ttm d;
    public final vxe e;
    public final sud f = new sud();
    public final lqa g;
    public final abfv h;
    public final vwt i;
    private final wvi k;
    private final xeu l;
    private final Executor m;

    public sus(cf cfVar, wvi wviVar, aduv aduvVar, xgn xgnVar, ttm ttmVar, vxe vxeVar, lqa lqaVar, vwt vwtVar, xeu xeuVar, Executor executor, abfv abfvVar) {
        this.a = cfVar;
        this.k = wviVar;
        this.b = aduvVar;
        this.c = xgnVar;
        this.d = ttmVar;
        this.e = vxeVar;
        this.i = vwtVar;
        this.g = lqaVar;
        this.l = xeuVar;
        this.m = executor;
        this.h = abfvVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        final zh zhVar;
        final zh zhVar2;
        List list;
        wvi wviVar = this.k;
        wve wveVar = new wve(wviVar.b, wviVar.d.e());
        wveVar.n(ajwoVar.c);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arny.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        arny arnyVar = (arny) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aigj aigjVar = arnyVar.f;
        if (aigjVar.E()) {
            zhVar = null;
        } else {
            zhVar = new zh((byte[]) null);
            zhVar.b = aigjVar;
        }
        if (aigjVar.E()) {
            zhVar2 = null;
        } else {
            zhVar2 = new zh((byte[]) null);
            zhVar2.b = aigjVar;
            zhVar2.a = 4;
        }
        arnyVar.getClass();
        wveVar.a = wve.j(arnyVar.c);
        wveVar.b = wve.j(arnyVar.d);
        arqc arqcVar = arnyVar.e;
        if (arqcVar == null) {
            arqcVar = arqc.a;
        }
        if (arqcVar.b.isEmpty()) {
            try {
                list = (List) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", List.class);
            } catch (ClassCastException unused) {
                list = null;
            }
            wveVar.e(list);
        } else {
            arqc arqcVar2 = arnyVar.e;
            if (arqcVar2 == null) {
                arqcVar2 = arqc.a;
            }
            wveVar.e(arqcVar2.b);
        }
        arqc arqcVar3 = arnyVar.e;
        if (arqcVar3 == null) {
            arqcVar3 = arqc.a;
        }
        if (!arqcVar3.c.isEmpty()) {
            arqc arqcVar4 = arnyVar.e;
            if (arqcVar4 == null) {
                arqcVar4 = arqc.a;
            }
            aiie aiieVar = arqcVar4.c;
            if (aiieVar != null && !aiieVar.isEmpty()) {
                wveVar.c = aiieVar;
            }
        }
        aihl aihlVar = appx.b;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            appw appwVar = (appw) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
            if (!appwVar.c.isEmpty()) {
                wveVar.p(appwVar.c);
            }
        }
        sud sudVar = this.f;
        sudVar.iR(false);
        cf cfVar = this.a;
        sudVar.gT(cfVar.getSupportFragmentManager(), sud.k);
        wvi wviVar2 = this.k;
        Executor executor = this.m;
        ListenableFuture listenableFutureB = wviVar2.f.b(wveVar, executor, null);
        if (wviVar2.i.l(3, 45370961L, false)) {
            yno.ef(wviVar2.h, listenableFutureB, executor, 163);
        }
        taf.k(cfVar, listenableFutureB, new hcq(this, zhVar2, 16), new twi() { // from class: sur
            @Override // defpackage.twi
            public final void a(Object obj) {
                int iA;
                alay alayVar;
                alay alayVar2;
                sus susVar = this.a;
                amav amavVar = (amav) obj;
                susVar.f.i();
                if (amavVar == null) {
                    amavVar = amav.a;
                }
                lqa lqaVar = susVar.g;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lqaVar.a);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((sva) arrayList.get(i)).b();
                }
                susVar.i.U();
                if (amavVar.e.size() != 0) {
                    susVar.e.e(amavVar.e, null);
                }
                zh zhVar3 = zhVar;
                if ((amavVar.b & 2) == 0) {
                    susVar.e(zhVar3);
                    return;
                }
                amat amatVar = amavVar.d;
                if (amatVar == null) {
                    amatVar = amat.a;
                }
                if (amatVar.b != 96619486) {
                    amat amatVar2 = amavVar.d;
                    if ((amatVar2 == null ? amat.a : amatVar2).b == 64099105) {
                        if (amatVar2 == null) {
                            amatVar2 = amat.a;
                        }
                        acwl.i(susVar.a, amatVar2.b == 64099105 ? (akdd) amatVar2.c : akdd.a, susVar.e, susVar.c, null, true, true, null, null, null, null, susVar.h, false);
                        susVar.e(zhVar3);
                        return;
                    }
                    if ((amatVar2 == null ? amat.a : amatVar2).b == 65500215) {
                        ttm ttmVar = susVar.d;
                        if (amatVar2 == null) {
                            amatVar2 = amat.a;
                        }
                        arqe arqeVar = amatVar2.b == 65500215 ? (arqe) amatVar2.c : arqe.a;
                        zh zhVar4 = zhVar2;
                        ttmVar.d(nsg.d(arqeVar).toString());
                        susVar.d(zhVar4);
                        return;
                    }
                    return;
                }
                amat amatVar3 = amavVar.d;
                if (amatVar3 == null) {
                    amatVar3 = amat.a;
                }
                anfk anfkVar = amatVar3.b == 96619486 ? (anfk) amatVar3.c : anfk.a;
                if ((anfkVar.b & 2) != 0) {
                    aduv aduvVar = susVar.b;
                    alja aljaVar = anfkVar.d;
                    if (aljaVar == null) {
                        aljaVar = alja.a;
                    }
                    aliz alizVarA = aliz.a(aljaVar.c);
                    if (alizVarA == null) {
                        alizVarA = aliz.UNKNOWN;
                    }
                    iA = aduvVar.a(alizVarA);
                } else {
                    iA = 0;
                }
                ajng ajngVar = anfkVar.f;
                if (ajngVar == null) {
                    ajngVar = ajng.a;
                }
                ajnf ajnfVar = ajngVar.c;
                if (ajnfVar == null) {
                    ajnfVar = ajnf.a;
                }
                acws acwsVarG = susVar.h.g(susVar.a);
                if ((anfkVar.b & 1) != 0) {
                    alayVar = anfkVar.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                AlertDialog.Builder message = acwsVarG.setTitle(ackj.k(null, alayVar, null, false)).setIcon(iA).setMessage(ackj.f(System.getProperty("line.separator"), ackj.h(anfkVar.e)));
                if ((ajnfVar.b & 64) != 0) {
                    alayVar2 = ajnfVar.m;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                AlertDialog alertDialogCreate = message.setPositiveButton(ackj.k(null, alayVar2, null, false), new ijf((Object) susVar, (aihn) ajnfVar, 3)).create();
                xgn xgnVar = susVar.c;
                xgnVar.w(new xgj(anfkVar.g, (amud) null), null);
                xgnVar.w(new xgj(ajnfVar.y, (amud) null), null);
                alertDialogCreate.show();
                susVar.e(zhVar3);
            }
        });
    }

    public final void d(zh zhVar) {
        if (zhVar != null) {
            xeu xeuVar = this.l;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(zhVar.g(), alot.YPC_CANCEL_FLOW_FAILED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            aroc arocVarF = zhVar.f();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            arocVarF.getClass();
            alouVar.d = arocVarF;
            alouVar.c = 201;
            xeuVar.b((alou) alosVar.build());
        }
    }

    public final void e(zh zhVar) {
        if (zhVar != null) {
            xeu xeuVar = this.l;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(zhVar.g(), alot.YPC_CANCEL_FLOW_SUCCEEDED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            aroc arocVarF = zhVar.f();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            arocVarF.getClass();
            alouVar.d = arocVarF;
            alouVar.c = 200;
            xeuVar.b((alou) alosVar.build());
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
