package defpackage;

import androidx.media3.decoder.av1.Dav1dLibrary;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusNativeLoader;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ywt implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ywt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, yxg] */
    /* JADX WARN: Type inference failed for: r13v47, types: [ckd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        switch (this.$cid) {
            case 0:
                ((ywu) this.a).d();
                break;
            case 1:
                this.a.u();
                break;
            case 2:
                Object obj = this.a;
                yya yyaVar = (yya) obj;
                zcf zcfVar = yyaVar.c.m;
                if (zcfVar == null || zcfVar.W || zcfVar.d.g) {
                    yyaVar.e = false;
                    yyaVar.g = null;
                } else {
                    if (!zcfVar.X) {
                        long jLongValue = ((Long) yyaVar.a.io()).longValue();
                        long jLongValue2 = ((Long) yyaVar.b.io()).longValue();
                        long j = (jLongValue == -1 || jLongValue2 == -1 || jLongValue < jLongValue2) ? -1L : jLongValue - jLongValue2;
                        if (j != -1 && j >= zcfVar.y.q() && !zcfVar.X) {
                            zcfVar.X = true;
                        }
                    }
                    akwm akwmVar = zcfVar.y.d.f;
                    if (akwmVar == null) {
                        akwmVar = akwm.b;
                    }
                    boolean z = akwmVar.aK && zcfVar.A.A && !zcfVar.Y;
                    if (zcfVar.X && !z) {
                        yyaVar.e = false;
                        yyaVar.g = null;
                        yyaVar.f = yyaVar.d.schedule(new ywt(obj, 3), Math.max(zcfVar.H.S().H, 2000L), TimeUnit.MILLISECONDS);
                    } else {
                        yyaVar.g = yyaVar.d.schedule(new ywt(obj, i), 1000L, TimeUnit.MILLISECONDS);
                    }
                }
                break;
            case 3:
                yya yyaVar2 = (yya) this.a;
                yyaVar2.f = null;
                zcf zcfVar2 = yyaVar2.c.m;
                if (zcfVar2 != null && zcfVar2.X && !zcfVar2.W) {
                    zcm zcmVar = zcfVar2.d;
                    if (!zcmVar.g && zcmVar.c == 2) {
                        zcfVar2.Z.l("sbf", "1");
                        zcfVar2.b.h(new zhz("android.stuck.bufferfull", ((Long) yyaVar2.b.io()).longValue()));
                        break;
                    }
                }
                break;
            case 4:
                try {
                    if (((zhl) this.a).cC()) {
                        Dav1dLibrary.isAvailable();
                    }
                    PlatypusNativeLoader.a();
                } catch (Throwable th) {
                    zhr.c(zhq.EXO, th, "Failed to pre-warm native libraries", new Object[0]);
                    return;
                }
                break;
            case 5:
                ((yyu) this.a).i.h.d.u.g();
                break;
            case 6:
                ((cqz) this.a).r(null);
                break;
            case 7:
                ((cqz) this.a).r(null);
                break;
            case 8:
                ((yzr) this.a).l.b();
                break;
            case 9:
                yzx yzxVar = (yzx) this.a;
                yzxVar.c.b.h(new zhz("player.exception", yzxVar.c.c, "c.clearNextMediaSource"));
                break;
            case 10:
                yzx yzxVar2 = (yzx) this.a;
                yzxVar2.c.b.h(new zhz("player.exception", yzxVar2.c.g, "c.doPostTransitionCleanup"));
                break;
            case 11:
                yzw yzwVar = (yzw) this.a;
                yzwVar.a.h(new zhz("player.exception", yzwVar.b, "c.SetNextMediaSource"));
                break;
            case 12:
                Object obj2 = this.a;
                try {
                    ((zae) obj2).m = true;
                    ((zae) obj2).h();
                } catch (Exception e) {
                    ((zae) obj2).i(e);
                    return;
                }
                break;
            case 13:
                this.a.g();
                break;
            case 14:
                ((zba) this.a).t();
                break;
            case 15:
                zcf zcfVar3 = (zcf) this.a;
                zcfVar3.A.d(zcfVar3.a);
                break;
            case 16:
                ((zdx) this.a).am(false);
                break;
            case 17:
                ((zdx) this.a).V();
                break;
            case 18:
                ((zdx) this.a).am(false);
                break;
            case 19:
                ((zdw) this.a).b.am(false);
                break;
            default:
                ((zdx) this.a).V();
                break;
        }
    }
}
