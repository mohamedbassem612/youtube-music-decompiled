package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qib extends qia implements qdy, qfh {
    public final Context a;
    public final aunn b;
    public final aunn d;
    public final awmd e;
    public final oml h;
    private final qfg i;
    private final ahey j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public qib(axfd axfdVar, Context context, qeb qebVar, ahey aheyVar, aunn aunnVar, aunn aunnVar2, awmd awmdVar, Executor executor, oml omlVar) {
        this.h = omlVar;
        this.i = axfdVar.V(executor, aunnVar, awmdVar);
        this.a = context;
        this.j = aheyVar;
        this.b = aunnVar;
        this.d = aunnVar2;
        this.e = awmdVar;
        qebVar.a(this);
    }

    @Override // defpackage.qia
    public final void a(qhy qhyVar) {
        String str;
        int i;
        if (qhyVar.b <= 0 && qhyVar.c <= 0 && qhyVar.d <= 0 && qhyVar.e <= 0 && (i = qhyVar.v) != 3 && i != 4) {
            ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).t("skip logging NetworkEvent due to empty bandwidth/latency data");
            ListenableFuture listenableFuture = aher.a;
            return;
        }
        qfg qfgVar = this.i;
        String strGroup = qhyVar.f;
        String str2 = qhyVar.k;
        Pattern pattern = qhz.a;
        if (ahno.aa(strGroup)) {
            strGroup = "";
        } else {
            Matcher matcher = qhz.a.matcher(strGroup);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = qhz.c.matcher(strGroup);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                } else {
                    Matcher matcher3 = qhz.b.matcher(strGroup);
                    if (matcher3.find() && str2 != null && !str2.startsWith("application/")) {
                        strGroup = matcher3.group(1);
                    }
                }
            }
        }
        int i2 = qhyVar.s;
        if (i2 != 0) {
            switch (i2) {
                case 1:
                    str = "NONE";
                    break;
                case 2:
                    str = "MOBILE";
                    break;
                case 3:
                    str = "WIFI";
                    break;
                case 4:
                    str = "MOBILE_MMS";
                    break;
                case 5:
                    str = "MOBILE_SUPL";
                    break;
                case 6:
                    str = "MOBILE_DUN";
                    break;
                case 7:
                    str = "MOBILE_HIPRI";
                    break;
                case 8:
                    str = "WIMAX";
                    break;
                case 9:
                    str = "BLUETOOTH";
                    break;
                case 10:
                    str = "DUMMY";
                    break;
                case 11:
                    str = "ETHERNET";
                    break;
                case 12:
                    str = "MOBILE_FOTA";
                    break;
                case 13:
                    str = "MOBILE_IMS";
                    break;
                case 14:
                    str = "MOBILE_CBS";
                    break;
                case 15:
                    str = "WIFI_P2P";
                    break;
                case 16:
                    str = "MOBILE_IA";
                    break;
                case 17:
                    str = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str = "PROXY";
                    break;
                default:
                    str = "VPN";
                    break;
            }
        } else {
            str = null;
        }
        ager agerVar = new ager(":");
        qjj qjjVarC = qfgVar.c(new ageo(agerVar, agerVar).g(strGroup, qhyVar.k, str, qhyVar.i));
        if (qjjVarC.f()) {
            ListenableFuture listenableFuture2 = aher.a;
        } else {
            this.g.incrementAndGet();
            ahng.s(new gmf(this, qhyVar, qjjVarC, 8, (byte[]) null), this.j);
        }
    }

    public final ListenableFuture b(axhz axhzVar) {
        try {
            agev agevVar = ((qhx) this.b.io()).c;
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 192, "NetworkMetricServiceImpl.java")).t("Exception while getting network metric extension!");
        }
        qfg qfgVar = this.i;
        qfc qfcVarA = qfd.a();
        qfcVarA.g(axhzVar);
        qfcVarA.b = null;
        return qfgVar.a(qfcVarA.a());
    }

    public final ListenableFuture c() {
        ListenableFuture listenableFutureS;
        if (this.g.get() > 0) {
            return ahng.p(new iud(this, 7), 1L, TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                listenableFutureS = aher.a;
            } else {
                ArrayList arrayList = this.f;
                this.f = new ArrayList(0);
                listenableFutureS = ahng.s(new gwj(this, arrayList, 12), this.j);
            }
        }
        return listenableFutureS;
    }

    @Override // defpackage.qdy
    public final void g(qci qciVar) {
        c();
    }

    @Override // defpackage.qfh
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.qdy
    public final /* synthetic */ void j(qci qciVar) {
    }
}
