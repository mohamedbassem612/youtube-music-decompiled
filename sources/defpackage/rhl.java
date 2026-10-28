package defpackage;

import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import j$.time.Duration;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rhl implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rhl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.mediapipe.framework.TextureFrame, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, rhu] */
    @Override // java.lang.Runnable
    public final void run() {
        apzh apzhVar;
        ajwo ajwoVar = null;
        switch (this.$cid) {
            case 0:
                this.a.release();
                return;
            case 1:
                this.a.c();
                return;
            case 2:
                Object obj = this.a;
                synchronized (obj) {
                    ((ria) obj).c = null;
                    break;
                }
                ria riaVar = (ria) obj;
                rgf rgfVar = riaVar.b;
                if (rgfVar != null) {
                    rgfVar.c();
                    riaVar.b = null;
                    return;
                }
                return;
            case 3:
                rie rieVar = (rie) this.a;
                rgf rgfVar2 = rieVar.h;
                if (rgfVar2 != null) {
                    rgfVar2.c();
                    rieVar.h = null;
                }
                rgh rghVar = rieVar.i;
                if (rghVar != null) {
                    rghVar.e();
                    rieVar.i = null;
                    return;
                }
                return;
            case 4:
                rif rifVar = (rif) this.a;
                rgf rgfVar3 = rifVar.n;
                if (rgfVar3 != null) {
                    rgfVar3.c();
                    rifVar.n = null;
                    return;
                }
                return;
            case 5:
                break;
            case 6:
                ((zhk) this.a).h();
                return;
            case 7:
                ((brs) this.a).A(true);
                return;
            case 8:
                ((riv) this.a).j.o = true;
                return;
            case 9:
                riv rivVar = (riv) this.a;
                rivVar.m.B();
                ExoPlayer exoPlayer = rivVar.f;
                if (exoPlayer != null) {
                    exoPlayer.F();
                    exoPlayer.L();
                }
                Surface surface = rivVar.s;
                if (surface != null) {
                    surface.release();
                    rivVar.s = null;
                }
                rfz rfzVar = rivVar.r;
                if (rfzVar != null) {
                    try {
                        rfzVar.close();
                        break;
                    } catch (InterruptedException e) {
                        rbc rbcVar = new rbc(riv.z, rbd.d);
                        rbcVar.a = e;
                        rbcVar.c();
                        rbcVar.a("Error closing the texture converter.", new Object[0]);
                    }
                    rivVar.r = null;
                    return;
                }
                return;
            case 10:
                Set set = ((riv) this.a).o.a;
                if (set.isEmpty()) {
                    return;
                }
                rbc rbcVar2 = new rbc(rbv.c, rbd.d);
                rbcVar2.c();
                rbcVar2.d("[LEAK!?] Releasing %d unreleased codec adapters", Integer.valueOf(set.size()));
                rbcVar2.a("[LEAK!?] Releasing unreleased codec adapters", new Object[0]);
                agqr it = agkz.n(set).iterator();
                while (it.hasNext()) {
                    ((rbt) it.next()).i();
                }
                return;
            case 11:
                riv rivVar2 = (riv) this.a;
                Surface surface2 = rivVar2.s;
                ExoPlayer exoPlayer2 = rivVar2.f;
                exoPlayer2.D(surface2);
                exoPlayer2.z();
                rivVar2.w = true;
                return;
            case 12:
                ((zhk) this.a).f();
                return;
            case 13:
                Object obj2 = this.a;
                rix rixVar = (rix) obj2;
                Runnable runnable = (Runnable) rixVar.c.get();
                if (runnable != null) {
                    try {
                        runnable.run();
                        break;
                    } catch (RuntimeException e2) {
                        rbc rbcVar3 = new rbc(rix.d, rbd.e);
                        rbcVar3.a = e2;
                        rbcVar3.c();
                        rbcVar3.a("Failed to execute the repeated runnable on gl thread %s.", rixVar.b.getName());
                    }
                    Handler handler = rixVar.b.m;
                    handler.getClass();
                    handler.postDelayed(new rhl(obj2, 13), rix.a.toMillis());
                    return;
                }
                return;
            case 14:
                ((riy) this.a).a();
                return;
            case 15:
                Object obj3 = this.a;
                synchronized (((riy) obj3).a) {
                    if (!((riy) obj3).d || ((riy) obj3).b.isEmpty()) {
                        ((riy) obj3).c.set(false);
                        return;
                    }
                    long jNanoTime = System.nanoTime();
                    ((riy) obj3).a();
                    Duration durationOfNanos = Duration.ofNanos(System.nanoTime() - jNanoTime);
                    Handler handler2 = ((rfo) obj3).m;
                    handler2.getClass();
                    handler2.postDelayed(new rhl(obj3, 15), Math.max(0L, ((riy) obj3).e.c.minus(durationOfNanos).toMillis()));
                    return;
                }
            case 16:
                rkg rkgVar = (rkg) this.a;
                ajwo ajwoVar2 = rkgVar.g;
                if (ajwoVar2 != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
                    ajwoVar2.c(aihlVarCheckIsLite);
                    Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
                    apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                } else {
                    apzhVar = null;
                }
                zwi zwiVar = rkgVar.b;
                zvv zvvVar = rkgVar.f;
                if (apzhVar != null && (apzhVar.b & 2) != 0 && (ajwoVar = apzhVar.c) == null) {
                    ajwoVar = ajwo.a;
                }
                zwiVar.b(zvvVar, ajwoVar);
                rkgVar.a.dismiss();
                return;
            case 17:
                ((rnf) ((rmx) this.a).a).h();
                return;
            case 18:
                HashSet hashSet = new HashSet();
                hashSet.add(0);
                ((rnp) this.a).f(new roq(ahng.S(hashSet), (byte[]) null));
                return;
            case 19:
                rnp rnpVar = (rnp) this.a;
                rnpVar.e(rnpVar.d);
                return;
            default:
                rnp rnpVar2 = (rnp) this.a;
                rnpVar2.g(rnpVar2.e);
                return;
        }
        while (!Thread.currentThread().isInterrupted()) {
            Object obj4 = this.a;
            rif rifVar2 = (rif) obj4;
            rfs rfsVarP = rifVar2.p();
            if (rfsVarP == null) {
                return;
            }
            synchronized (rifVar2.k) {
                rft rftVar = ((rif) obj4).p;
                if (rftVar == null) {
                    if (!rfsVarP.B()) {
                        rfsVarP.release();
                    }
                    return;
                } else {
                    rftVar.a(rfsVarP);
                    if (!rifVar2.l && !rfsVarP.B()) {
                        return;
                    }
                }
            }
        }
    }

    public rhl(rmx rmxVar, int i) {
        this.$cid = i;
        this.a = rmxVar;
    }
}
