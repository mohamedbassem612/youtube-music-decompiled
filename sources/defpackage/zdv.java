package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zdv implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ zdv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25, types: [android.view.SurfaceHolder$Callback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v35, types: [android.view.SurfaceHolder$Callback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v39, types: [android.view.SurfaceHolder$Callback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v45, types: [android.view.SurfaceHolder$Callback, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String string;
        int simCarrierId;
        Executor executor;
        String str = null;
        switch (this.$cid) {
            case 0:
                ((zdw) this.a).b.am(false);
                return;
            case 1:
                ((zdx) this.a).ai();
                return;
            case 2:
                ((zdw) this.a).b.am(true);
                return;
            case 3:
                ((tyw) this.a).c();
                return;
            case 4:
                ((zgj) this.a).K();
                return;
            case 5:
                ((zgj) this.a).H();
                return;
            case 6:
                ((tyw) this.a).b();
                return;
            case 7:
                Object obj = this.a;
                try {
                    hno hnoVar = ((zgj) obj).J;
                    Object obj2 = hnoVar.g;
                    Object obj3 = ((wjr) obj2).a;
                    if (tya.a((Context) obj3, "android.permission.READ_PHONE_STATE") && tya.a((Context) obj3, "android.permission.FOREGROUND_SERVICE")) {
                        Object obj4 = ((wjr) obj2).b;
                        if (((TelephonyManager) obj4).getSimState() == 5) {
                            String simOperator = ((TelephonyManager) obj4).getSimOperator();
                            if (wjr.r(simOperator)) {
                                String strSubstring = simOperator.substring(0, 3);
                                String strSubstring2 = simOperator.substring(3);
                                String simOperatorName = ((TelephonyManager) obj4).getSimOperatorName();
                                StringBuilder sb = new StringBuilder();
                                sb.append(strSubstring);
                                sb.append(':');
                                sb.append(strSubstring2);
                                sb.append(':');
                                sb.append(wjr.q(simOperatorName.getBytes()));
                                if (Build.VERSION.SDK_INT >= 28 && (simCarrierId = ((TelephonyManager) obj4).getSimCarrierId()) != -1) {
                                    sb.append(':');
                                    sb.append(simCarrierId);
                                    CharSequence simCarrierIdName = ((TelephonyManager) obj4).getSimCarrierIdName();
                                    if (simCarrierIdName != null) {
                                        sb.append(':');
                                        sb.append(wjr.q(simCarrierIdName.toString().getBytes()));
                                    }
                                }
                                string = sb.toString();
                            } else {
                                string = null;
                            }
                        } else {
                            string = null;
                        }
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        ((zgj) obj).e.a("soi", string);
                    }
                    if (tya.a((Context) obj3, "android.permission.READ_PHONE_STATE") && tya.a((Context) obj3, "android.permission.FOREGROUND_SERVICE")) {
                        Object obj5 = ((wjr) obj2).b;
                        String networkOperator = ((TelephonyManager) obj5).getNetworkOperator();
                        if (wjr.r(networkOperator)) {
                            str = networkOperator.substring(0, 3) + ':' + networkOperator.substring(3) + ':' + wjr.q(((TelephonyManager) obj5).getNetworkOperatorName().getBytes());
                        }
                    }
                    if (str != null) {
                        ((zgj) obj).e.a("noi", str);
                    }
                    zfu zfuVar = ((zgj) obj).g;
                    zga zgaVar = ((zgj) obj).e;
                    String strB = zfuVar.b();
                    if (strB != null) {
                        zgaVar.a("bat", strB);
                    }
                    zgaVar.a("conn", ((zgj) obj).c() + ':' + ((tfq) hnoVar.p).a());
                    return;
                } finally {
                    ((zgj) obj).f.countDown();
                }
            case 8:
                ((zgj) this.a).e();
                return;
            case 9:
                Object obj6 = this.a;
                zjj zjjVar = (zjj) obj6;
                for (String str2 : zjjVar.f.keySet()) {
                    Executor executor2 = zjjVar.c;
                    if (zjjVar.e.el() && (executor = zjjVar.d) != null) {
                        executor2 = executor;
                    }
                    executor2.execute(afwl.i(new zgc(obj6, (Object) str2, 2)));
                }
                return;
            case 10:
                ?? r14 = this.a;
                zkn zknVar = (zkn) r14;
                zjr zjrVar = zknVar.f;
                if (zjrVar.eG()) {
                    if (zknVar.m != null) {
                        if (zjrVar.bh()) {
                            zll zllVar = zknVar.c;
                            if (zllVar instanceof yzo) {
                                ((yzo) zllVar).g();
                            }
                        }
                        zknVar.F();
                        zknVar.o = false;
                        return;
                    }
                    return;
                }
                View view = zknVar.k;
                if (view != null) {
                    if (zjrVar.bh()) {
                        zll zllVar2 = zknVar.c;
                        if (zllVar2 instanceof yzo) {
                            ((yzo) zllVar2).g();
                        }
                    }
                    if (zjrVar.cD()) {
                        zknVar.removeView(view);
                    }
                    SurfaceHolder surfaceHolder = zknVar.l;
                    if (surfaceHolder != 0) {
                        surfaceHolder.removeCallback(r14);
                        zknVar.G(surfaceHolder);
                        Surface surface = surfaceHolder.getSurface();
                        if (surface != null && !zknVar.I()) {
                            surface.release();
                        }
                    }
                    if (!zjrVar.cD()) {
                        zknVar.removeView(view);
                    }
                    zknVar.k = null;
                    zknVar.l = null;
                    zknVar.o = false;
                    return;
                }
                return;
            case 11:
                zkn zknVar2 = (zkn) this.a;
                if (zknVar2.f.bh()) {
                    zll zllVar3 = zknVar2.c;
                    if (zllVar3 instanceof yzo) {
                        ((yzo) zllVar3).g();
                    }
                }
                zknVar2.F();
                SurfaceHolder surfaceHolder2 = zknVar2.j;
                if (surfaceHolder2 != null) {
                    zknVar2.G(surfaceHolder2);
                    Surface surface2 = surfaceHolder2.getSurface();
                    if (surface2 == null || zknVar2.I()) {
                        return;
                    }
                    surface2.release();
                    return;
                }
                return;
            case 12:
                ?? r15 = this.a;
                zkp zkpVar = (zkp) r15;
                zkpVar.e.getHolder().removeCallback(r15);
                zkpVar.surfaceDestroyed(zkpVar.e.getHolder());
                zkpVar.removeView(zkpVar.e);
                zkpVar.C();
                return;
            case 13:
                ?? r16 = this.a;
                zks zksVar = (zks) r16;
                zksVar.e.getHolder().removeCallback(r16);
                zksVar.surfaceDestroyed(zksVar.e.getHolder());
                zksVar.removeView(zksVar.e);
                zksVar.C();
                return;
            case 14:
                ((Surface) this.a).release();
                return;
            case 15:
                ?? r17 = this.a;
                zku zkuVar = (zku) r17;
                zkuVar.e.getHolder().removeCallback(r17);
                zkuVar.surfaceDestroyed(zkuVar.e.getHolder());
                zkuVar.removeView(zkuVar.e);
                zkuVar.C();
                return;
            case 16:
                ((zln) this.a).setKeepScreenOn(true);
                return;
            case 17:
                ((zln) this.a).setKeepScreenOn(false);
                return;
            case 18:
                ((zlr) this.a).c();
                return;
            case 19:
                ((zpr) this.a).b.requestLayout();
                return;
            default:
                ((zth) this.a).a();
                return;
        }
    }
}
