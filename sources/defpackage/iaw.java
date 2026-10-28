package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iaw {
    private static final Duration g = Duration.ofMillis(2500);
    public final hpd a;
    public final hpk b;
    public final xgn c;
    public aoht d;
    public final hmt e;
    public final abqq f;
    private final Context h;
    private final Executor i;
    private final aaug j;
    private final hps k;
    private final aanb l;
    private final jin m;
    private final isi n;

    public iaw(Context context, Executor executor, abqq abqqVar, hmt hmtVar, aaug aaugVar, aanb aanbVar, hps hpsVar, hpd hpdVar, hpk hpkVar, isi isiVar, jin jinVar, xgn xgnVar) {
        this.h = context;
        this.i = executor;
        this.f = abqqVar;
        this.e = hmtVar;
        this.j = aaugVar;
        this.l = aanbVar;
        this.k = hpsVar;
        this.a = hpdVar;
        this.b = hpkVar;
        this.n = isiVar;
        this.m = jinVar;
        this.c = xgnVar == null ? xgn.l : xgnVar;
    }

    public final /* synthetic */ iau a(Optional optional) {
        iau iauVar;
        if (optional.isEmpty()) {
            return iau.a(false);
        }
        weh wehVar = (weh) optional.get();
        boolean z = wehVar instanceof anjx;
        List listJ = agpi.a;
        if (z) {
            listJ = ((anjx) wehVar).e();
        } else if (wehVar instanceof anuk) {
            listJ = ((anuk) wehVar).j();
        }
        if (listJ.isEmpty()) {
            return iau.a(false);
        }
        try {
            hpd hpdVar = this.a;
            if (((Boolean) hpdVar.i(listJ).get()).booleanValue()) {
                iauVar = iau.a(true);
            } else {
                String strH = wfs.h((String) listJ.get(0));
                iauVar = new iau(false, Optional.of(strH), (hth) hpdVar.g(strH).get());
            }
            return iauVar;
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            return iau.a(false);
        }
    }

    public final ListenableFuture b(String str) {
        return ahcs.e(hpb.k(this.k, str, false), afwl.a(new iat(this, 5)), this.i);
    }

    public final void c(String str) {
        aaew aaewVarD = this.l.b().d();
        if (aaewVarD != null) {
            aaewVarD.I(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ef A[Catch: InterruptedException | ExecutionException | TimeoutException -> 0x00f3, TRY_LEAVE, TryCatch #0 {InterruptedException | ExecutionException | TimeoutException -> 0x00f3, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0024, B:9:0x0039, B:10:0x003e, B:12:0x0046, B:14:0x0060, B:15:0x0065, B:17:0x006d, B:19:0x008d, B:20:0x0091, B:22:0x0099, B:24:0x00b9, B:25:0x00bd, B:27:0x00d3, B:29:0x00db, B:31:0x00e5, B:32:0x00ef), top: B:36:0x0001 }] */
    public final boolean d(String str) {
        try {
            if (str.equals("PPAD")) {
                if (((Boolean) this.b.h().get(g.toMillis(), TimeUnit.MILLISECONDS)).booleanValue()) {
                    this.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(77738)), null);
                    return false;
                }
                h(true);
            } else if (str.equals("PPSV")) {
                if (((Boolean) this.b.i().get(g.toMillis(), TimeUnit.MILLISECONDS)).booleanValue()) {
                    return false;
                }
                h(false);
            } else if (str.equals("PPSE")) {
                if (((Boolean) this.b.g(new iaa(5)).get(g.toMillis(), TimeUnit.MILLISECONDS)).booleanValue()) {
                    return false;
                }
                h(false);
            } else if (!str.equals("PPSDST")) {
                iau iauVar = (iau) b(str).get(g.toMillis(), TimeUnit.MILLISECONDS);
                if (iauVar.a) {
                    return false;
                }
                Optional optional = iauVar.b;
                if (optional.isPresent()) {
                    hpd hpdVar = this.a;
                    hth hthVar = iauVar.c;
                    if (hpdVar.q(hthVar)) {
                        f(hthVar, (String) optional.get());
                    } else {
                        h(false);
                    }
                } else {
                    h(false);
                }
            } else {
                if (((Boolean) this.b.g(new iaa(6)).get(g.toMillis(), TimeUnit.MILLISECONDS)).booleanValue()) {
                    return false;
                }
                h(false);
            }
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return false;
        }
    }

    public final boolean e(String str) {
        try {
            hpd hpdVar = this.a;
            hth hthVar = (hth) hpdVar.g(str).get(g.toMillis(), TimeUnit.MILLISECONDS);
            if (hthVar.b().isEmpty()) {
                g();
            } else if (hpdVar.q(hthVar)) {
                f(hthVar, str);
            } else {
                if (hpdVar.c(hthVar) == aamp.PLAYABLE) {
                    return false;
                }
                h(false);
            }
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    public final void f(hth hthVar, String str) {
        Object obj;
        String str2 = this.d.d;
        aony aonyVarW = hpd.w(hthVar);
        Optional optionalC = hthVar.c();
        if (!aaje.r(aonyVarW) && aaje.t(aonyVarW)) {
            isi isiVar = this.n;
            Optional optionalG = hthVar.g();
            if (true == optionalG.isPresent() && (((alvt) optionalG.get()).b & 4) == 0) {
                optionalG = Optional.empty();
            }
            if (true == optionalG.isPresent()) {
                alvl alvlVar = ((alvt) optionalG.get()).f;
                if (alvlVar == null) {
                    alvlVar = alvl.a;
                }
                optionalG = Optional.ofNullable(alvlVar);
            }
            isiVar.z((alvl) optionalG.orElse(null), new iav(this, str), str);
            return;
        }
        hpd hpdVar = this.a;
        if (hpdVar.v(hthVar.f(), optionalC)) {
            this.e.d(str, true);
            return;
        }
        if (!optionalC.isPresent() || !hpdVar.u(optionalC)) {
            boolean zO = hpdVar.o(hthVar.d());
            hmt hmtVar = this.e;
            if (zO) {
                hmtVar.d(str, false);
                return;
            } else {
                taf.k(hmtVar.b, hmtVar.e.g(str), new gnx(19), new hcq(hmtVar, str, 5));
                return;
            }
        }
        if (hpdVar.p(optionalC)) {
            hmt hmtVar2 = this.e;
            hmtVar2.o.az(R.string.offline_dialog_title_expired, Integer.valueOf(R.string.offline_dialog_message_expired), new hml(hmtVar2, 2), R.string.ok, 295754);
            return;
        }
        aogq aogqVarL = hpd.l((aohk) optionalC.get());
        int i = aogqVarL.c;
        if (i != 7) {
            obj = null;
        } else {
            if ((i == 7 ? (aogo) aogqVarL.d : aogo.a).b == 53345347) {
                aogo aogoVar = aogqVarL.c == 7 ? (aogo) aogqVarL.d : aogo.a;
                obj = aogoVar.b == 53345347 ? (akmh) aogoVar.c : akmh.a;
            } else {
                int i2 = aogqVarL.c;
                if ((i2 == 7 ? (aogo) aogqVarL.d : aogo.a).b == 64099105) {
                    aogo aogoVar2 = i2 == 7 ? (aogo) aogqVarL.d : aogo.a;
                    obj = aogoVar2.b == 64099105 ? (akdd) aogoVar2.c : akdd.a;
                } else {
                    obj = null;
                }
            }
        }
        if (obj != null) {
            this.j.b(obj, this.c, aohh.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN.equals(((aohk) optionalC.get()).getAction()) ? new Pair(this.h.getString(R.string.retry_offline_error), new hqa(this, str, 12)) : null);
        }
    }

    public final void g() {
        aoht aohtVar = this.d;
        String str = aohtVar.d;
        this.e.d(aohtVar.c, true);
    }

    public final void h(boolean z) {
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(this.h.getText(true != z ? R.string.snackbar_no_offline_streams : R.string.snackbar_no_offline_music_to_shuffle));
        this.m.d(jioVarE.b());
    }
}
