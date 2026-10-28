package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abes {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/iv/InvideoProgrammingOverlayPresenter");
    private sxw A;
    private Vibrator B;
    private boolean C;
    private final tth D;
    private final yas E;
    public final vxe b;
    public final Handler c;
    public final xku d;
    public final abmt e;
    public boolean f;
    public abnr g;
    public sxw h;
    public ajdz i;
    public boolean[] j;
    public boolean[] k;
    public int l;
    public ajdw m;
    public List n = agpi.a;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public final aber s;
    public final abep t;
    public final abel u;
    public final ruf v;
    public final yas w;
    private final Context x;
    private final adhv y;
    private final xgn z;

    public abes(Context context, abel abelVar, adhv adhvVar, vxe vxeVar, tth tthVar, zxj zxjVar, zzj zzjVar, xgn xgnVar, ruf rufVar, abmt abmtVar) {
        context.getClass();
        this.x = context;
        abelVar.getClass();
        this.u = abelVar;
        adhvVar.getClass();
        this.y = adhvVar;
        vxeVar.getClass();
        this.b = vxeVar;
        tthVar.getClass();
        this.D = tthVar;
        this.c = new Handler(context.getMainLooper());
        this.d = new xku(zxjVar, zzjVar);
        this.z = xgnVar;
        this.l = -1;
        abelVar.l = new abep(this);
        rufVar.getClass();
        this.v = rufVar;
        this.E = new yas(this, 14);
        this.w = new yas(this, 15);
        abmtVar.getClass();
        this.e = abmtVar;
        this.s = new aber(this);
        this.t = new abep(this);
    }

    public static ajdz b(wjf wjfVar) {
        int i;
        if (wjfVar == null) {
            return null;
        }
        for (ajdv ajdvVar : wjfVar.u().p) {
            if (ajdvVar != null && (i = ajdvVar.b) == 49483894) {
                return i == 49483894 ? (ajdz) ajdvVar.c : ajdz.a;
            }
        }
        return null;
    }

    public final sxw a(aqmg aqmgVar, abeo abeoVar) {
        Uri uriD = aqmgVar == null ? null : tyu.d(aqmgVar.c);
        if (uriD == null) {
            return null;
        }
        sxw sxwVar = new sxw(abeoVar);
        this.y.k(uriD, new syc(this.c, sxwVar));
        return sxwVar;
    }

    public final void c(boolean z) {
        if (this.o) {
            this.c.removeCallbacks(this.E);
            this.o = false;
            abel abelVar = this.u;
            View view = abelVar.e;
            if (view.getVisibility() == 0) {
                if (z) {
                    view.startAnimation(abelVar.j);
                } else {
                    view.setVisibility(8);
                }
            }
            View view2 = abelVar.d;
            if (view2.getVisibility() == 0) {
                if (z) {
                    view2.startAnimation(abelVar.k);
                } else {
                    view2.setVisibility(8);
                }
            }
            e();
        }
    }

    public final void d(ajdz ajdzVar, String str) {
        if (this.f) {
            f();
        }
        this.f = true;
        this.i = ajdzVar;
        if (ajdzVar != null) {
            abel abelVar = this.u;
            abelVar.b = this.q;
            abelVar.f();
            if (ajdzVar.d.size() != 0) {
                aiie aiieVar = ajdzVar.d;
                this.n = aiieVar;
                int size = aiieVar.size();
                this.j = new boolean[size];
                this.k = new boolean[size];
            }
        }
        ajdz ajdzVar2 = this.i;
        if (ajdzVar2 != null && (ajdzVar2.b & 2) != 0) {
            ajdx ajdxVar = ajdzVar2.c;
            if (ajdxVar == null) {
                ajdxVar = ajdx.a;
            }
            aqmh aqmhVar = ajdxVar.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            aqmg aqmgVarL = aawb.L(aqmhVar, 40);
            if (aqmgVarL != null) {
                this.A = a(aqmgVarL, new aben(this, aqmgVarL));
            }
        }
        xku xkuVar = this.d;
        if (str != null) {
            xkuVar.a.put("CPN", str);
        } else {
            xkuVar.a.remove("CPN");
        }
    }

    public final void e() {
        tth tthVar = this.D;
        tthVar.j = this.o;
        tthVar.h();
    }

    public final void f() {
        this.f = false;
        sxw sxwVar = this.A;
        if (sxwVar != null) {
            sxwVar.c();
            this.A = null;
        }
        sxw sxwVar2 = this.h;
        if (sxwVar2 != null) {
            sxwVar2.c();
            this.h = null;
        }
        this.u.c();
        this.C = false;
        this.o = false;
        this.p = false;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = null;
        this.i = null;
        this.r = -1;
    }

    public final void g(boolean z, boolean z2, int i) {
        if (this.o && this.p == z) {
            return;
        }
        this.o = true;
        this.p = z;
        e();
        this.u.e(z, z2);
        Context context = this.x;
        if (twb.c(context)) {
            Vibrator vibrator = this.B;
            if (vibrator == null) {
                vibrator = (Vibrator) context.getSystemService("vibrator");
                this.B = vibrator;
            }
            if (vibrator != null && vibrator.hasVibrator()) {
                vibrator.vibrate(context.getResources().getInteger(R.integer.invideo_accessibility_vibration_duration_ms));
            }
        }
        boolean[] zArr = this.k;
        if (!z || zArr == null || zArr[this.l] || i <= 0) {
            return;
        }
        Handler handler = this.c;
        yas yasVar = this.E;
        handler.removeCallbacks(yasVar);
        handler.postDelayed(yasVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    public final void h() {
        boolean z;
        ajdz ajdzVar = this.i;
        if (ajdzVar == null || (ajdzVar.b & 2) == 0) {
            return;
        }
        if (this.g != abnr.FULLSCREEN) {
            z = false;
        } else {
            ajdx ajdxVar = ajdzVar.c;
            if (ajdxVar == null) {
                ajdxVar = ajdx.a;
            }
            long j = ajdxVar.b;
            long j2 = this.r;
            if (j > j2) {
                z = false;
            } else {
                ajdx ajdxVar2 = ajdzVar.c;
                if (ajdxVar2 == null) {
                    ajdxVar2 = ajdx.a;
                }
                if (j2 < ajdxVar2.c) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (z != this.C) {
            this.C = z;
            abel abelVar = this.u;
            if (!z) {
                abelVar.c.setVisibility(8);
                return;
            }
            abelVar.c.setVisibility(0);
            abelVar.g();
            ajdx ajdxVar3 = ajdzVar.c;
            if (ajdxVar3 == null) {
                ajdxVar3 = ajdx.a;
            }
            this.z.w(new xgj(ajdxVar3.e.G()), null);
        }
    }

    public final boolean i() {
        int i;
        boolean[] zArr = this.j;
        return zArr != null && (i = this.l) >= 0 && i < zArr.length && zArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    public final boolean j() {
        aosq aosqVar;
        ajdw ajdwVar = this.m;
        if (ajdwVar == null) {
            return false;
        }
        aosr aosrVar = ajdwVar.j;
        if (aosrVar == null) {
            aosrVar = aosr.b;
        }
        if (aosrVar.c.size() != 0) {
            abnr abnrVar = this.g;
            if (abnrVar == null) {
                return false;
            }
            int iOrdinal = abnrVar.ordinal();
            if (iOrdinal == 0) {
                aosqVar = aosq.STANDARD;
            } else if (iOrdinal == 1) {
                aosqVar = aosq.MINI;
            } else if (iOrdinal == 2) {
                aosqVar = aosq.FULLSCREEN;
            } else if (iOrdinal == 3) {
                aosqVar = aosq.BACKGROUND;
            } else if (iOrdinal != 4) {
                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/player/features/iv/InvideoProgrammingOverlayPresenter", "getVisibilityState", 342, "InvideoProgrammingOverlayPresenter.java")).t("Unhandled player visibility state.");
                aosqVar = null;
            } else {
                aosqVar = aosq.STANDARD;
            }
            if (aosqVar == null) {
                return false;
            }
            aosr aosrVar2 = ajdwVar.j;
            if (aosrVar2 == null) {
                aosrVar2 = aosr.b;
            }
            Iterator<E> it = new aihx(aosrVar2.c, aosr.a).iterator();
            while (it.hasNext()) {
                if (aosqVar == ((aosq) it.next())) {
                }
            }
            return false;
        }
        return true;
    }
}
