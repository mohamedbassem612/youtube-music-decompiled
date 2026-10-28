package defpackage;

import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.proto.streaming.BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yup extends yuw {
    public final bzg a;
    public volatile wiu b;
    private final yuw c;
    private final yuq d;
    private final tfq e;

    public yup(awmd awmdVar, tfq tfqVar) {
        this.c = (yuw) awmdVar.io();
        this.e = tfqVar;
        this.b = wiu.c;
        this.a = new yur(this);
        this.d = new yuq();
    }

    @Override // defpackage.crd
    public final synchronized long e() {
        return j().b;
    }

    @Override // defpackage.crd
    public final bzg f() {
        return this.a;
    }

    @Override // defpackage.crd
    public final void g(Handler handler, crc crcVar) {
        this.d.a.z(handler, crcVar);
    }

    @Override // defpackage.crd
    public final void h(crc crcVar) {
        this.d.a.B(crcVar);
    }

    @Override // defpackage.yuw
    public final void i(wiu wiuVar) {
        q(ywn.b, false, wiuVar);
    }

    public final synchronized yus j() {
        long j;
        yus yusVar;
        long jB;
        double d;
        tfq tfqVar = this.e;
        NetworkInfo networkInfoD = tfqVar.d();
        int iM = tfqVar.m(networkInfoD);
        long jE = this.c.e();
        long jC = 0;
        if (jE > 0) {
            return new yus(jE, 1);
        }
        aoqd aoqdVar = this.b.d;
        ajbx ajbxVar = aoqdVar.k;
        if (ajbxVar == null) {
            ajbxVar = ajbx.a;
        }
        if (ajbxVar.c.size() != 0) {
            ajbx ajbxVar2 = aoqdVar.k;
            if (ajbxVar2 == null) {
                ajbxVar2 = ajbx.a;
            }
            Iterator it = ajbxVar2.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    j = 0;
                    break;
                }
                ajbw ajbwVar = (ajbw) it.next();
                int iV = atqp.V(ajbwVar.b);
                if (iV == 0) {
                    iV = 1;
                }
                if (iV == iM) {
                    j = ajbwVar.c;
                    break;
                }
            }
        } else {
            j = 0;
            break;
        }
        if (j <= 0) {
            if (networkInfoD != null && networkInfoD.isConnected()) {
                int type = networkInfoD.getType();
                if (type == 0) {
                    switch (networkInfoD.getSubtype()) {
                        case 1:
                            jB = tfq.b(114.0d);
                            break;
                        case 2:
                            jB = tfq.b(135.0d);
                            break;
                        case 3:
                            jB = tfq.b(384.0d);
                            break;
                        case 4:
                            jB = tfq.b(115.0d);
                            break;
                        case 5:
                            jB = tfq.b(700.0d);
                            break;
                        case 6:
                        case 14:
                            jB = tfq.b(900.0d);
                            break;
                        case 7:
                            jB = tfq.b(70.0d);
                            break;
                        case 8:
                            jB = tfq.c(1.8d);
                            break;
                        case 9:
                        case 10:
                            jB = tfq.c(1.0d);
                            break;
                        case 11:
                            jB = tfq.b(13.0d);
                            break;
                        case 12:
                        case 13:
                        case 15:
                            jB = tfq.c(5.0d);
                            break;
                        default:
                            jB = -1;
                            break;
                    }
                    jC = jB;
                } else if (type != 1) {
                    if (type == 6) {
                        d = 3.0d;
                    } else if (type != 9) {
                        jC = -1;
                    } else {
                        d = 480.0d;
                    }
                    jC = tfq.c(d);
                } else {
                    jC = tfq.c(tfqVar.c.b().getLinkSpeed());
                }
            }
            if (jC != -1) {
                yusVar = new yus(jC, 2);
            } else {
                akwm akwmVar = this.b.d.f;
                if (akwmVar == null) {
                    akwmVar = akwm.b;
                }
                int i = akwmVar.h << 3;
                if (i == 0) {
                    i = 729088;
                }
                yusVar = new yus(i, 4);
            }
        } else {
            yusVar = new yus(j, 2);
        }
        return yusVar;
    }

    @Override // defpackage.yuw
    public final synchronized aoxz k() {
        return this.c.k();
    }

    @Override // defpackage.yuw
    public final synchronized void l(long j) {
        this.c.l(j);
    }

    @Override // defpackage.yuw
    public final synchronized void m(int i) {
        try {
            this.c.m(i);
        } catch (RuntimeException e) {
            zvp.a(zvn.a, zvm.f, "onBytesTransferred got an exception: ".concat(e.toString()));
        }
    }

    @Override // defpackage.yuw
    public final synchronized void n() {
        try {
            this.c.n();
            this.d.a(null);
        } catch (RuntimeException e) {
            zvp.a(zvn.a, zvm.f, "onTransferEnd got an exception: ".concat(e.toString()));
        }
    }

    @Override // defpackage.yuw
    public final void o() {
        try {
            this.c.o();
        } catch (RuntimeException e) {
            zvp.a(zvn.a, zvm.f, "onTransferStart got an exception: ".concat(e.toString()));
        }
    }

    @Override // defpackage.yuw
    public final synchronized void p(boolean z) {
        try {
            yuq yuqVar = this.d;
            yuw yuwVar = this.c;
            yuqVar.a(yuwVar);
            yuwVar.p(z);
        } catch (RuntimeException e) {
            zvp.a(zvn.a, zvm.f, "onTransferStart got an exception: ".concat(e.toString()));
        }
    }

    public final void q(ywn ywnVar, boolean z, wiu wiuVar) {
        this.b = wiuVar;
        this.c.i(wiuVar);
        if (z) {
            ywnVar.l("bpt", String.valueOf(k().e));
        }
    }

    @Override // defpackage.yuw
    public final synchronized void r(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) {
        this.c.r(bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);
    }

    @Override // defpackage.yuw
    public final synchronized void s(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) {
        this.c.s(bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);
    }

    @Override // defpackage.yuw
    public final void t() {
        this.c.t();
    }

    public final synchronized boolean u(Uri uri) {
        String str;
        int iValueOf;
        String path = uri.getPath();
        boolean z = path != null && path.startsWith("/videoplayback");
        if (z && uri.getBooleanQueryParameter("sabr", false)) {
            return true;
        }
        if (!this.b.aJ()) {
            return true;
        }
        if (z) {
            Set setC = wir.c();
            String queryParameter = uri.getQueryParameter("itag");
            if (TextUtils.isEmpty(queryParameter)) {
                String path2 = uri.getPath();
                if (path2 == null) {
                    iValueOf = -1;
                } else {
                    List listH = agfm.b('/').h(path2);
                    int i = 0;
                    while (true) {
                        if (i >= listH.size() - 1) {
                            str = null;
                            break;
                        }
                        int i2 = i + 1;
                        if ("itag".equals(listH.get(i))) {
                            str = (String) listH.get(i2);
                            break;
                        }
                        i = i2;
                    }
                    iValueOf = Integer.valueOf(TextUtils.isEmpty(str) ? -1 : zik.cn(str));
                }
            } else {
                iValueOf = Integer.valueOf(zik.cn(queryParameter));
            }
            if (setC.contains(iValueOf)) {
                return true;
            }
        }
        return false;
    }

    public yup() {
        throw null;
    }
}
