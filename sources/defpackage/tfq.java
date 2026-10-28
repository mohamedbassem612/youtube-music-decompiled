package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.cardboard.sdk.R;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tfq {
    public final tfi a;
    public Future b = aher.a;
    public final tof c;
    private final awmd d;
    private ConnectivityManager.NetworkCallback e;

    public tfq(tof tofVar, ConnectivityManager connectivityManager, awmd awmdVar, tfi tfiVar, ScheduledExecutorService scheduledExecutorService, avmb avmbVar) {
        this.c = tofVar;
        this.d = awmdVar;
        this.a = tfiVar;
        ((avlh) ((tfm) awmdVar.io()).b).P().L(avmbVar).ak(new rtn(this, 12));
        if (Build.VERSION.SDK_INT >= 29) {
            tfp tfpVar = new tfp(this, scheduledExecutorService, tofVar);
            this.e = tfpVar;
            try {
                connectivityManager.registerDefaultNetworkCallback(tfpVar);
            } catch (SecurityException unused) {
            }
        }
    }

    public static long b(double d) {
        return (long) (d * 1000.0d);
    }

    public static long c(double d) {
        return (long) (d * 1000000.0d);
    }

    public final int a() {
        NetworkInfo networkInfoA = this.c.a();
        if (networkInfoA == null || !h()) {
            return 2;
        }
        int type = networkInfoA.getType();
        if (type == 0) {
            int subtype = networkInfoA.getSubtype();
            if (subtype != 20) {
                switch (subtype) {
                    case 1:
                    case 2:
                        return 4;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                        return 5;
                    case 13:
                        if (this.a.b()) {
                            return 12;
                        }
                        break;
                }
            } else if (a.aL()) {
                return this.a.c() ? 11 : 9;
            }
            return 7;
        }
        if (type == 1) {
            return !g() ? 3 : 10;
        }
        if (type != 6) {
            return 1;
        }
        return 6;
    }

    public final NetworkInfo d() {
        return this.c.a();
    }

    public final List e() {
        tof tofVar = this.c;
        if (tofVar.d()) {
            return tof.e();
        }
        if (tofVar.i) {
            tofVar.h = tof.e();
            tofVar.i = false;
        }
        return tofVar.h;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [awmd, java.lang.Object] */
    public final void f() {
        tfm tfmVar = (tfm) this.d.io();
        boolean zH = h();
        boolean zI = i();
        boolean zK = k();
        boolean zG = g();
        int restrictBackgroundStatus = this.c.a.getRestrictBackgroundStatus();
        int iA = a();
        int iL = l();
        Object obj = tfmVar.d;
        if (obj == null || zH != ((tfn) obj).a) {
            tfmVar.d = new tfn(zH);
            ((tbt) tfmVar.a.io()).e(tfmVar.d);
        }
        ((awkv) tfmVar.c).kk(new tfl(zH, zI, zK, zG, restrictBackgroundStatus == 3, iA, iL));
    }

    public final boolean g() {
        boolean zIsActiveNetworkMetered;
        if (!h()) {
            return false;
        }
        tof tofVar = this.c;
        if (tofVar.d()) {
            zIsActiveNetworkMetered = tofVar.a.isActiveNetworkMetered();
        } else {
            if (tofVar.e) {
                tofVar.d = tofVar.a.isActiveNetworkMetered();
                tofVar.e = false;
            }
            zIsActiveNetworkMetered = tofVar.d;
        }
        return zIsActiveNetworkMetered;
    }

    public final boolean h() {
        NetworkInfo networkInfoA = this.c.a();
        return networkInfoA != null && networkInfoA.isConnectedOrConnecting();
    }

    public final boolean i() {
        NetworkInfo networkInfoA = this.c.a();
        return networkInfoA != null && networkInfoA.isConnected();
    }

    public final boolean j(int i) {
        NetworkInfo networkInfoA = this.c.a();
        return networkInfoA != null && networkInfoA.getType() == i;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public final boolean k() {
        boolean zHasCapability;
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        tof tofVar = this.c;
        if (tofVar.k) {
            if (Build.VERSION.SDK_INT < 30 || (activeNetwork = (connectivityManager = tofVar.a).getActiveNetwork()) == null) {
                zHasCapability = false;
            } else {
                try {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                } catch (SecurityException unused) {
                    networkCapabilities = null;
                }
                if (networkCapabilities == null) {
                    zHasCapability = false;
                } else {
                    zHasCapability = networkCapabilities.hasCapability(25);
                }
            }
            tofVar.j = zHasCapability;
            tofVar.k = false;
        }
        return tofVar.j;
    }

    public final int l() {
        return m(this.c.a());
    }

    public final int m(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 123;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1) {
                return 117;
            }
            if (type == 9) {
                return 119;
            }
            if (type != 6) {
                return type != 7 ? 122 : 118;
            }
            return 120;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            if (this.a.c()) {
                return R.styleable.AppCompatTheme_windowNoTitle;
            }
            return 121;
        }
        switch (subtype) {
            case 1:
                return 103;
            case 2:
                return 102;
            case 3:
                return 112;
            case 4:
                return 105;
            case 5:
                return 106;
            case 6:
                return 107;
            case 7:
                return 104;
            case 8:
                return 108;
            case 9:
                return 110;
            case 10:
                return 109;
            case 11:
                return 111;
            case 12:
                return 113;
            case 13:
                return this.a.b() ? 127 : 116;
            case 14:
                return 114;
            case 15:
                return 115;
            default:
                return 121;
        }
    }
}
