package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryh implements aheh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ryh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, zza] */
    @Override // defpackage.aheh
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                if (!(th instanceof CancellationException)) {
                    Object obj = this.a;
                    String strValueOf = String.valueOf(th.getMessage());
                    ryj ryjVar = (ryj) obj;
                    smr smrVar = ryjVar.d;
                    rmp.j(smrVar, "Get Ad Break Request RPC for Shorts Ads failed. Details: ".concat(strValueOf));
                    ryjVar.f.u(smrVar, ryjVar.e, new sas("Get Ad Break Request RPC for Shorts Ads failed.", 104), 16);
                }
                break;
            case 1:
                zvp.a(zvn.a, zvm.a, "The callback of registerSource throws exception: " + th.getClass().getSimpleName() + ' ' + th.getMessage());
                ((spv) ((ahgb) this.a).e).h(3);
                break;
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                if (!(th instanceof toe)) {
                    this.a.jj(new toe(th));
                } else {
                    this.a.jj((toe) th);
                }
                break;
            case 6:
                th.getClass();
                if (!(th instanceof CancellationException)) {
                    twu.d(ybc.c, 6, "GetActiveDevicesService request failed", th);
                }
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) acmk.a.b()).j(th)).k("com/google/android/libraries/youtube/reel/internal/endpoint/AbstractReelWatchCommand$2", "onFailure", (char) 534, "AbstractReelWatchCommand.java")).t("Failed to check MDX recovery status");
                break;
            case 8:
                axlj.o(th);
                break;
            case 9:
                axlj.o(th);
                break;
            case 10:
                ((aeiv) ((aeiy) this.a).d).b();
                break;
            case 11:
                ((aeiv) ((aeiy) this.a).d).b();
                break;
            default:
                zvp.b(zvn.b, zvm.B, "Error running distributive profiling for " + ((aerl) this.a).d.t, th);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, xir] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        int i = 1;
        switch (this.$cid) {
            case 0:
                wgk wgkVar = (wgk) obj;
                Optional optionalF = wgkVar.f();
                Object obj2 = this.a;
                ryi ryiVar = (ryi) obj2;
                sac sacVar = ryiVar.c;
                saa saaVar = new saa(sacVar, i);
                if (true == optionalF.isPresent()) {
                    ((ruk) ((sac) saaVar.a).b.io()).a((ajwo) optionalF.get(), null);
                }
                agke agkeVarA = wgkVar.a();
                sgp sgpVarL = sgp.a().l();
                sacVar.b(sacVar.a(agkeVarA, sgpVarL), sgpVarL);
                ryiVar.a.ab(((ryj) obj2).e, 0);
                break;
            case 1:
                ((spv) ((ahgb) this.a).e).h(2);
                break;
            case 2:
                if (Objects.equals((Boolean) obj, Boolean.TRUE)) {
                    Object obj3 = this.a;
                    tre treVar = (tre) obj3;
                    trd trdVar = treVar.d;
                    if (trdVar.a(260) == 0) {
                        trdVar.o(260, 2);
                        tqj tqjVar = treVar.c;
                        int i2 = tqr.a;
                        if (!tqjVar.k(1073830309)) {
                            if (tqjVar.k(1073830237)) {
                                ahng.x(((ahgb) treVar.f.io()).C(), new ryh(obj3, 3), (Executor) treVar.a.io());
                            } else if (trdVar.a(260) == 2) {
                                treVar.e();
                            }
                        }
                    }
                }
                break;
            case 3:
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    tre treVar2 = (tre) this.a;
                    if (treVar2.d.a(260) == 2) {
                        treVar2.e();
                    }
                }
                break;
            case 4:
                ((tyw) this.a).b = ((Integer) obj).intValue();
                break;
            case 5:
                this.a.a((acjy) obj);
                break;
            case 6:
                alpn alpnVar = (alpn) obj;
                alpnVar.getClass();
                ((ybc) this.a).d.kk(alpnVar);
                break;
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    ((acmk) this.a).e.g();
                }
                break;
            case 8:
                ?? r6 = this.a;
                if (r6 != 0) {
                    r6.n("gw_ac");
                }
                break;
            case 9:
                ?? r7 = this.a;
                if (r7 != 0) {
                    r7.n("gw_ac");
                }
                break;
            case 10:
                aeiv aeivVar = (aeiv) ((aeiy) this.a).d;
                aeivVar.d(31);
                aeivVar.c("ds_clc");
                break;
            case 11:
                aeiv aeivVar2 = (aeiv) ((aeiy) this.a).d;
                aeivVar2.d(34);
                aeivVar2.c("ds_ec");
                break;
            default:
                aqid aqidVar = (aqid) obj;
                xeu xeuVar = (xeu) ((aerl) this.a).c.io();
                aihf aihfVarCreateBuilder = aqig.a.createBuilder();
                aihf aihfVarCreateBuilder2 = aqih.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aqih aqihVar = (aqih) aihfVarCreateBuilder2.instance;
                aqidVar.getClass();
                aqihVar.j = aqidVar;
                aqihVar.b |= 65536;
                aihfVarCreateBuilder.copyOnWrite();
                aqig aqigVar = (aqig) aihfVarCreateBuilder.instance;
                aqih aqihVar2 = (aqih) aihfVarCreateBuilder2.build();
                aqihVar2.getClass();
                aqigVar.c = aqihVar2;
                aqigVar.b |= 1;
                if (!xeuVar.b) {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    aqig aqigVar2 = (aqig) aihfVarCreateBuilder.build();
                    aqigVar2.getClass();
                    alouVar.d = aqigVar2;
                    alouVar.c = 3;
                    xeuVar.b((alou) alosVar.build());
                } else {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.SYSTEM_HEALTH_CAPTURED);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                }
                break;
        }
    }
}
