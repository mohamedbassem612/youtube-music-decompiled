package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryo extends ryj implements rsp, rsq {
    aorf a;
    public final saq b;
    ScheduledFuture c;
    private final rsr g;
    private boolean h;
    private final acfw i;
    private final Map j;
    private final ScheduledExecutorService k;
    private final tld l;
    private final xsc m;

    public ryo(smr smrVar, sko skoVar, rsk rskVar, saq saqVar, acfw acfwVar, xsc xscVar, rsr rsrVar, tld tldVar, ScheduledExecutorService scheduledExecutorService) {
        super(smrVar, skoVar, rskVar);
        int i = 0;
        this.h = false;
        Optional.empty();
        this.j = new HashMap();
        this.m = xscVar;
        this.b = saqVar;
        this.g = rsrVar;
        this.l = tldVar;
        this.k = scheduledExecutorService;
        agke agkeVar = skoVar.e;
        int size = agkeVar.size();
        while (i < size) {
            aixr aixrVarA = aixr.a(((aizs) agkeVar.get(i)).e);
            i++;
            if ((aixrVarA == null ? aixr.TRIGGER_TYPE_UNSPECIFIED : aixrVarA) == aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED) {
                this.h = true;
                break;
            }
        }
        this.i = acfwVar;
    }

    @Override // defpackage.ryj
    public final void V(int i) {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
        }
        this.f.d(this.d, this.e, i);
    }

    @Override // defpackage.ryj
    public final void a() {
        sko skoVar = this.e;
        Optional optionalJ = skoVar.p.j();
        if (optionalJ.isPresent()) {
            apji apjiVar = (apji) optionalJ.get();
            aihl aihlVar = aorg.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = (apji) optionalJ.get();
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                this.a = (aorf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                this.g.e(this);
                return;
            }
        }
        this.f.u(this.d, skoVar, new sas("PlayerOrganicTransitionOverlayRenderer is not present in the layout server rendering content.", 3), 16);
    }

    @Override // defpackage.ryj
    public final void b() {
        Duration durationAw;
        int i;
        Duration durationAw2;
        ((abvk) this.l.b).a();
        aorf aorfVar = this.a;
        if (aorfVar != null) {
            aigu aiguVar = aorfVar.c;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            Duration durationAw3 = ahng.aw(aiguVar);
            int i2 = 0;
            for (apji apjiVar : this.a.b) {
                try {
                    boolean z = this.h;
                    aihl aihlVar = aorg.c;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        i = 2;
                    } else {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aorg.d);
                        apjiVar.c(aihlVarCheckIsLite2);
                        if (apjiVar.j.n(aihlVarCheckIsLite2.d)) {
                            i = 3;
                        } else {
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aorg.b);
                            apjiVar.c(aihlVarCheckIsLite3);
                            if (!apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                                throw new IllegalArgumentException("Unsupported transition renderer during validateAndGetAdTransitionType");
                            }
                            i = 4;
                            rmp.n(null, "Unsupported transition renderer during validateAndGetAdTransitionType");
                            i2++;
                        }
                    }
                    int i3 = i - 1;
                    if (i3 == 1) {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                        apjiVar.c(aihlVarCheckIsLite4);
                        Object objK = apjiVar.j.k(aihlVarCheckIsLite4.d);
                        aigu aiguVar2 = ((aore) (objK == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK))).b;
                        if (aiguVar2 == null) {
                            aiguVar2 = aigu.a;
                        }
                        durationAw2 = ahng.aw(aiguVar2);
                    } else if (i3 != 2) {
                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aorg.b);
                        apjiVar.c(aihlVarCheckIsLite5);
                        Object objK2 = apjiVar.j.k(aihlVarCheckIsLite5.d);
                        aigu aiguVar3 = ((aorc) (objK2 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK2))).b;
                        if (aiguVar3 == null) {
                            aiguVar3 = aigu.a;
                        }
                        durationAw2 = ahng.aw(aiguVar3);
                    } else {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aorg.d);
                        apjiVar.c(aihlVarCheckIsLite6);
                        Object objK3 = apjiVar.j.k(aihlVarCheckIsLite6.d);
                        aigu aiguVar4 = ((aord) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).b;
                        if (aiguVar4 == null) {
                            aiguVar4 = aigu.a;
                        }
                        durationAw2 = ahng.aw(aiguVar4);
                    }
                    Duration durationMinus = (z || durationAw3.compareTo(durationAw2) <= 0) ? Duration.ZERO : durationAw3.minus(durationAw2);
                    if (a.y(durationMinus)) {
                        try {
                            String string = Integer.toString(i2);
                            if (this.h) {
                                continue;
                            } else {
                                Optional optional = this.d.k;
                                if (optional.isPresent()) {
                                    aixr aixrVarA = aixr.a(((aizs) optional.get()).e);
                                    if (aixrVarA == null) {
                                        aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
                                    }
                                    if (aixrVarA == aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE) {
                                        Object obj = optional.get();
                                        long j = (((aizs) obj).b == 17 ? (anfh) ((aizs) obj).c : anfh.a).c;
                                        long millis = durationAw3.toMillis();
                                        long millis2 = durationMinus.toMillis() + j;
                                        String strCl = a.cl(string, (byte) 95, this.e.a);
                                        try {
                                            this.m.ac(this, this.i, millis2, millis + j, 1, 1, strCl);
                                            this.j.put(strCl, apjiVar);
                                        } catch (rso e) {
                                            throw new sau("PlayerOrganicTransitionOverlay rendering adapter call to addCueRange failed: ".concat(e.toString()), e, e.a);
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } catch (sau e2) {
                            rmp.n(null, "Failed to add transition cue range: " + e2.getMessage());
                        }
                    } else {
                        durationMinus.isZero();
                    }
                } catch (IllegalArgumentException unused) {
                    rmp.n(null, "Unsupported transition renderer during validateAndGetAdTransitionType");
                }
                i2++;
            }
        }
        this.f.b(this.d, this.e);
        if (this.h) {
            aorf aorfVar2 = this.a;
            if (aorfVar2 != null) {
                aigu aiguVar5 = aorfVar2.c;
                if (aiguVar5 == null) {
                    aiguVar5 = aigu.a;
                }
                durationAw = ahng.aw(aiguVar5);
            } else {
                durationAw = Duration.ZERO;
            }
            this.c = this.k.schedule(new rxn(this, 6), durationAw.toMillis() * 5, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.rsp
    public final void c(String str, boolean z, boolean z2, boolean z3) {
        if (((apji) this.j.remove(str)) != null) {
            this.m.ab(this.i, str);
        }
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        Optional.of(abobVar);
    }

    @Override // defpackage.ryj
    public final void t() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
        }
        Map map = this.j;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            this.m.ab(this.i, (String) it.next());
        }
        map.clear();
        this.g.h(this);
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
