package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abuy implements abvc {
    public final abvk a;
    public final mbc b;
    public final zvl c;
    public final AtomicInteger d = new AtomicInteger();
    public final isi e;
    public final wjr f;
    private final abmt g;
    private final Executor h;
    private final ahex i;
    private final Executor j;
    private final abuz k;

    public abuy(abvk abvkVar, abuz abuzVar, abmt abmtVar, mbc mbcVar, wjr wjrVar, zvl zvlVar, isi isiVar, Executor executor, ahex ahexVar) {
        this.a = abvkVar;
        this.k = abuzVar;
        this.g = abmtVar;
        this.b = mbcVar;
        this.f = wjrVar;
        this.c = zvlVar;
        this.e = isiVar;
        this.h = executor;
        this.i = ahexVar;
        this.j = new ahfg(ahexVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abto, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final void a(abnl abnlVar, abnp abnpVar, Optional optional) {
        abuz abuzVar = this.k;
        if (abuzVar.b()) {
            abuzVar.a();
            this.a.s.e();
        }
        abuzVar.a();
        abuzVar.a = (abtn) ((abtp) abuzVar.b.io()).a(abnlVar);
        ?? r0 = abuzVar.a;
        if (r0 == 0) {
            zvp.a(zvn.b, zvm.k, "Initializing a PlaybackSequencer in loaderNavigator, but it does not exist");
            return;
        }
        r0.a();
        ((abtn) r0).f(abmg.a);
        boolean zIsPresent = optional.isPresent();
        abvk abvkVar = this.a;
        if (zIsPresent) {
            abvkVar.v(abnlVar, abnpVar, (abng) optional.get());
        } else {
            abvkVar.s.c(abnlVar, abnpVar);
        }
    }

    @Override // defpackage.abvc
    public final void f() {
        Object obj = this.k.a;
        if (obj != null) {
            ((abtn) obj).e();
        }
        this.a.s.b();
    }

    @Override // defpackage.abvc, defpackage.acia
    public final void g(abnl abnlVar) {
        h(abnlVar, abnp.a);
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01f1  */
    /* JADX WARN: Type inference failed for: r13v16, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [acey, java.lang.Object] */
    @Override // defpackage.abvc
    public final void h(abnl abnlVar, abnp abnpVar) {
        boolean z;
        byte[] bArrG;
        abnp abnpVar2;
        xir xirVar;
        ajwo ajwoVar;
        ajwo ajwoVarH;
        AtomicInteger atomicInteger = this.d;
        int iIncrementAndGet = atomicInteger.get();
        abmt abmtVar = this.g;
        if (abmtVar.aP()) {
            iIncrementAndGet = atomicInteger.incrementAndGet();
        }
        int i = iIncrementAndGet;
        if (!abmtVar.aP() || (ajwoVar = abnlVar.b) == null) {
            z = false;
            bArrG = null;
        } else {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                aril arilVar = arijVar.n;
                if (arilVar == null) {
                    arilVar = aril.a;
                }
                aoov aoovVar = arilVar.d;
                if (aoovVar == null) {
                    aoovVar = aoov.a;
                }
                z = true;
                if ((aoovVar.b & 1) != 0) {
                    aril arilVar2 = arijVar.n;
                    if (arilVar2 == null) {
                        arilVar2 = aril.a;
                    }
                    aoov aoovVar2 = arilVar2.d;
                    if (aoovVar2 == null) {
                        aoovVar2 = aoov.a;
                    }
                    bArrG = aoovVar2.c.G();
                    ajwo ajwoVar2 = abnlVar.b;
                    if (ajwoVar2 != null) {
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
                        ajwoVar2.c(aihlVarCheckIsLite3);
                        if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
                            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
                            ajwoVar2.c(aihlVarCheckIsLite4);
                            Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
                            arij arijVar2 = (arij) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                            if ((arijVar2.b & 16384) != 0) {
                                aril arilVar3 = arijVar2.n;
                                if (((arilVar3 == null ? aril.a : arilVar3).b & 2) != 0) {
                                    if (arilVar3 == null) {
                                        arilVar3 = aril.a;
                                    }
                                    aoov aoovVar3 = arilVar3.d;
                                    if (aoovVar3 == null) {
                                        aoovVar3 = aoov.a;
                                    }
                                    if ((aoovVar3.b & 1) != 0) {
                                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(arik.a);
                                        ajwoVar2.c(aihlVarCheckIsLite5);
                                        if (ajwoVar2.j.n(aihlVarCheckIsLite5.d)) {
                                            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(arik.a);
                                            ajwoVar2.c(aihlVarCheckIsLite6);
                                            Object objK3 = ajwoVar2.j.k(aihlVarCheckIsLite6.d);
                                            arij arijVar3 = (arij) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                                            aril arilVar4 = arijVar3.n;
                                            if (arilVar4 == null) {
                                                arilVar4 = aril.a;
                                            }
                                            aoov aoovVar4 = arilVar4.d;
                                            if (aoovVar4 == null) {
                                                aoovVar4 = aoov.a;
                                            }
                                            if ((aoovVar4.b & 1) != 0) {
                                                aihh aihhVar = (aihh) ajwoVar2.toBuilder();
                                                aihl aihlVar = arik.a;
                                                aihf builder = arijVar3.toBuilder();
                                                aril arilVar5 = arijVar3.n;
                                                if (arilVar5 == null) {
                                                    arilVar5 = aril.a;
                                                }
                                                aihf builder2 = arilVar5.toBuilder();
                                                aril arilVar6 = arijVar3.n;
                                                if (arilVar6 == null) {
                                                    arilVar6 = aril.a;
                                                }
                                                aoov aoovVar5 = arilVar6.d;
                                                if (aoovVar5 == null) {
                                                    aoovVar5 = aoov.a;
                                                }
                                                aihf builder3 = aoovVar5.toBuilder();
                                                builder3.copyOnWrite();
                                                aoov aoovVar6 = (aoov) builder3.instance;
                                                aoovVar6.b &= -2;
                                                aoovVar6.c = aoov.a.c;
                                                builder2.copyOnWrite();
                                                aril arilVar7 = (aril) builder2.instance;
                                                aoov aoovVar7 = (aoov) builder3.build();
                                                aoovVar7.getClass();
                                                arilVar7.d = aoovVar7;
                                                arilVar7.b |= 2;
                                                builder.copyOnWrite();
                                                arij arijVar4 = (arij) builder.instance;
                                                aril arilVar8 = (aril) builder2.build();
                                                arilVar8.getClass();
                                                arijVar4.n = arilVar8;
                                                arijVar4.b |= 16384;
                                                aihhVar.e(aihlVar, (arij) builder.build());
                                                ajwoVar2 = (ajwo) aihhVar.build();
                                            }
                                        }
                                        abnlVar.b = ajwoVar2;
                                        jrk jrkVar = abnlVar.a;
                                        if (jrkVar != null && ajwoVar2 != null && (ajwoVarH = abnl.h(jrkVar)) != null) {
                                            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(arik.a);
                                            ajwoVarH.c(aihlVarCheckIsLite7);
                                            if (ajwoVarH.j.n(aihlVarCheckIsLite7.d)) {
                                                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(arik.a);
                                                ajwoVarH.c(aihlVarCheckIsLite8);
                                                Object objK4 = ajwoVarH.j.k(aihlVarCheckIsLite8.d);
                                                aril arilVar9 = ((arij) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4))).n;
                                                if (arilVar9 == null) {
                                                    arilVar9 = aril.a;
                                                }
                                                aoov aoovVar8 = arilVar9.d;
                                                if (aoovVar8 == null) {
                                                    aoovVar8 = aoov.a;
                                                }
                                                if ((aoovVar8.b & 1) != 0) {
                                                    aihf builder4 = abnlVar.a.toBuilder();
                                                    aigj byteString = ajwoVar2.toByteString();
                                                    builder4.copyOnWrite();
                                                    jrk jrkVar2 = (jrk) builder4.instance;
                                                    jrkVar2.b |= 8388608;
                                                    jrkVar2.y = byteString;
                                                    abnlVar.a = (jrk) builder4.build();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z = false;
                    bArrG = null;
                }
            } else {
                z = false;
                bArrG = null;
            }
        }
        abuz abuzVar = this.k;
        abvk abvkVar = this.a;
        abvkVar.getClass();
        aaoz aaozVar = new aaoz(abvkVar, 13);
        if (abuzVar.a != null) {
            if (abnlVar.M() && ((Boolean) aaozVar.apply(abnlVar)).booleanValue() && abuzVar.a != null) {
                ((abtp) abuzVar.b.io()).b();
                ?? r13 = abvkVar.o.d;
                abpj abpjVar = abvkVar.m;
                String strP = r13 != 0 ? r13.p() : null;
                abvq abvqVar = new abvq(abvkVar.p);
                taq.d();
                if (abpjVar.e.f.l(3, 45360673L, false)) {
                    abpjVar.n = null;
                }
                abnl abnlVarB = abpjVar.b(abnlVar);
                abpjVar.k = abnlVarB;
                abpjVar.l = abnpVar;
                abpjVar.m(abnw.a);
                abvr abvrVar = abpjVar.q;
                if (abvrVar != null) {
                    abvrVar.c(abpjVar.k, null, strP);
                }
                abpjVar.r.a.kk(new abmf(abnlVar.u()));
                abnp abnpVar3 = abpjVar.l;
                if (abnpVar3 == null) {
                    abnpVar3 = abnp.a;
                }
                abpjVar.k(abnlVarB, 1, strP, abvqVar, abnpVar3);
                return;
            }
            if (abuzVar.a != null) {
                abtt abttVar = abtt.JUMP;
                abtu abtuVar = new abtu(abttVar, abnlVar, abnpVar, null);
                if (abtuVar.e.equals(abttVar) && (abnpVar2 = abtuVar.g) != null && (xirVar = abnpVar2.b) != null) {
                    aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
                    amjr amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiw amiwVar = (amiw) aihfVarCreateBuilder2.instance;
                    amiwVar.e = amjrVar.o;
                    amiwVar.b |= 8;
                    aihfVarCreateBuilder.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                    amiw amiwVar2 = (amiw) aihfVarCreateBuilder2.build();
                    amiwVar2.getClass();
                    amiuVar.N = amiwVar2;
                    amiuVar.d |= 8;
                    xirVar.h((amiu) aihfVarCreateBuilder.build());
                }
                acrx acrxVarN = abuzVar.n(abtuVar);
                if (acrxVarN != null) {
                    abvkVar.s.d((abnl) acrxVarN.b, (abnp) acrxVarN.c, acrxVarN.a);
                    return;
                }
            }
        }
        if (!z || bArrG == null) {
            a(abnlVar, abnpVar, Optional.empty());
        } else {
            ahno.at(ahno.ap(new vtq(this, bArrG, abnlVar, 14), this.j), new abux(this, i, abnlVar, abnpVar, 0), this.h);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [acey, java.lang.Object] */
    @Override // defpackage.abvc, defpackage.aavo, defpackage.acdl
    public final void i(abtu abtuVar) {
        if (this.g.aP()) {
            this.d.incrementAndGet();
        }
        acrx acrxVarN = this.k.n(abtuVar);
        if (acrxVarN != null) {
            abnl abnlVar = (abnl) acrxVarN.b;
            if (abnlVar.a.m) {
                abvk abvkVar = this.a;
                ?? r2 = abvkVar.o.d;
                if (r2 != 0 && r2.ar(abob.j) && TextUtils.equals(abnlVar.w(), r2.q())) {
                    abvkVar.C();
                    return;
                }
            }
            abvk abvkVar2 = this.a;
            Object obj = acrxVarN.c;
            boolean z = acrxVarN.a;
            abvkVar2.s.d(abnlVar, (abnp) obj, z);
        }
    }

    @Override // defpackage.abvc
    public final void l(abns abnsVar, abnp abnpVar) {
        abnl abnlVar;
        Object obj = this.k.a;
        ahsk ahskVarA = abnt.a();
        ahskVarA.f(abnsVar);
        abnt abntVarC = ahskVarA.c();
        if (obj != null) {
            abvk abvkVar = this.a;
            abtu abtuVar = abtu.c;
            abtn abtnVar = (abtn) obj;
            if (abtnVar.c(abtuVar)) {
                abtnVar.b = acui.b(abtuVar);
                abnlVar = abtnVar.b;
            } else {
                abnlVar = null;
            }
            abnl abnlVar2 = abnlVar;
            if (abvkVar.U()) {
                abvkVar.l(abntVarC, abnlVar2, abnpVar, null, null);
            } else {
                ahng.m(new IllegalStateException("prefetchAndQueueVideo restricted until PlaybackService is active"));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [abto, java.lang.Object] */
    @Override // defpackage.abvc, defpackage.acdl
    public final boolean n(abtu abtuVar) {
        ?? r0 = this.k.a;
        return r0 != 0 && r0.c(abtuVar);
    }

    @Override // defpackage.aavo
    public final boolean p() {
        return this.a.ad();
    }

    @Override // defpackage.abvc, defpackage.aavo
    public final int q(abtu abtuVar) {
        if (this.k.a == null) {
            return 1;
        }
        return acui.a(abtuVar);
    }

    @Override // defpackage.acdl
    public final void r() {
        if (this.g.aP()) {
            this.d.incrementAndGet();
        }
        Object obj = this.k.a;
        if (obj != null) {
            ((abtn) obj).f(abmg.f);
            this.a.as();
        }
    }

    @Override // defpackage.abvc
    public final /* synthetic */ void s() {
    }
}
