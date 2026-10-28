package defpackage;

import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class icy implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ icy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r6v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v34, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v41, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v42, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [awmd, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                aayw aaywVar = (aayw) obj;
                wjf wjfVar = aaywVar.c;
                if (aaywVar.b.b(abnw.d) && wjfVar != null) {
                    jan janVar = (jan) this.a;
                    ?? r7 = janVar.f;
                    if (r7 != 0 && !gzj.ah((abvk) r7.io())) {
                        z = true;
                    }
                    icz iczVarB = janVar.b();
                    icz iczVar = icz.c;
                    if ((!iczVarB.equals(iczVar)) != z) {
                        if (z) {
                            iczVar = icz.a;
                        }
                        janVar.g(iczVar);
                    }
                    break;
                }
                break;
            case 1:
                jan janVar2 = (jan) this.a;
                if ((janVar2.b().equals(icz.b) && janVar2.c() == abjz.c) || janVar2.b().equals(icz.a)) {
                    janVar2.e();
                    break;
                }
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue) {
                    aerj aerjVar = (aerj) obj2;
                    ((idk) aerjVar.d.io()).m();
                    idy idyVar = (idy) aerjVar.f.io();
                    if (!idyVar.g) {
                        agrx agrxVar = agso.a;
                    } else {
                        agrx agrxVar2 = agso.a;
                        avmn avmnVar = idyVar.e;
                        if (avmnVar != null && !avmnVar.f()) {
                            awka.f((AtomicReference) idyVar.e);
                        }
                        avmn avmnVar2 = idyVar.f;
                        if (avmnVar2 != null && !avmnVar2.f()) {
                            awka.f((AtomicReference) idyVar.f);
                        }
                        idyVar.g = false;
                    }
                } else {
                    aerj aerjVar2 = (aerj) obj2;
                    ((idk) aerjVar2.d.io()).l();
                    idy idyVar2 = (idy) aerjVar2.f.io();
                    agrx agrxVar3 = agso.a;
                    if (!idyVar2.g) {
                        avlh avlhVarX = idyVar2.b.P().x(new hxe(10));
                        aunn aunnVar = idyVar2.d;
                        idyVar2.e = avlhVarX.L((avmb) aunnVar.io()).ak(new ibr(idyVar2, 16));
                        idyVar2.f = ((avlh) idyVar2.a.io()).L((avmb) aunnVar.io()).ak(new ibr(idyVar2, 17));
                        idyVar2.g = true;
                    }
                }
                break;
            case 3:
                agrx agrxVar4 = agso.a;
                ied iedVar = (ied) this.a;
                iedVar.m.set(false);
                if (iedVar.g()) {
                    ListenableFuture listenableFuture = iedVar.n;
                    if (listenableFuture != null && !listenableFuture.isCancelled()) {
                        iedVar.n.cancel(false);
                    }
                    ListenableFuture listenableFuture2 = iedVar.o;
                    if (listenableFuture2 != null && !listenableFuture2.isCancelled()) {
                        iedVar.o.cancel(false);
                        break;
                    }
                }
                break;
            case 4:
                iee ieeVar = (iee) this.a;
                long epochMilli = ieeVar.c.f().toEpochMilli();
                ieeVar.d.set(epochMilli);
                if (!((aazn) obj).c()) {
                    ((agrc) ((agrc) iee.a.c().i(agso.a, "QueueResumptionEligible")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueResumptionEligibilityMonitor", "init", 85, "QueueResumptionEligibilityMonitor.java")).v("Playback stopped at %d", epochMilli);
                } else {
                    ((agrc) ((agrc) iee.a.c().i(agso.a, "QueueResumptionEligible")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueResumptionEligibilityMonitor", "init", 82, "QueueResumptionEligibilityMonitor.java")).v("Playback started at %d", epochMilli);
                }
                break;
            case 5:
                this.a.invoke(obj);
                break;
            case 6:
                this.a.invoke(obj);
                break;
            case 7:
                this.a.invoke(obj);
                break;
            case 8:
                this.a.invoke(obj);
                break;
            case 9:
                this.a.invoke(obj);
                break;
            case 10:
                this.a.invoke(obj);
                break;
            case 11:
                this.a.invoke(obj);
                break;
            case 12:
                this.a.invoke(obj);
                break;
            case 13:
                this.a.invoke(obj);
                break;
            case 14:
                this.a.invoke(obj);
                break;
            case 15:
                ((igr) this.a).b();
                break;
            case 16:
                if (((aazn) obj).c()) {
                    igr igrVar = (igr) ((hws) this.a).a;
                    igrVar.h = false;
                    igrVar.b();
                }
                break;
            case 17:
                if (((aboe) obj).j == 15) {
                    igr igrVar2 = (igr) ((hws) this.a).a;
                    Iterator it = igrVar2.e.iterator();
                    while (it.hasNext()) {
                        ((igq) it.next()).q();
                    }
                    igrVar2.d.aq(false, 36);
                }
                break;
            case 18:
                igw igwVar = (igw) ((hws) this.a).a;
                aunn aunnVar2 = igwVar.p;
                if (((WatchWhileLayout) aunnVar2.io()).ab() && !((ilx) igwVar.t.io()).c) {
                    ((WatchWhileLayout) aunnVar2.io()).P(igwVar.v.l(19, 45649951L, false));
                    ((WatchWhileLayout) aunnVar2.io()).L(false);
                    break;
                }
                break;
            case 19:
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    ((jnj) this.a).c.a((ajwo) it2.next());
                }
                break;
            default:
                ((ihr) this.a).a();
                break;
        }
    }
}
