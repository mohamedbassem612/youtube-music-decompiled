package defpackage;

import android.net.NetworkInfo;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.MoreExecutors;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xom implements xon, wfv {
    public static final agkj a;
    private static final long d;
    private static final agrf e;
    public final tfq b;
    public final vxz c;
    private final mbc f;
    private final ydu g;
    private final agfr h;
    private final xru i;
    private final boolean j;
    private final Object k = new Object();
    private Map l = new HashMap();
    private long m = -1;
    private final xzf n = new xol(this, 0);
    private final ycp o;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        d = 7200000L;
        e = agrf.h("com/google/android/libraries/youtube/mdx/feedback/DefaultMdxFeedbackFiller");
        a = agkj.m("WIFI", new xdn(5), "MOBILE", new xdn(6), "ETHERNET", new xdn(7), "BLUETOOTH", new xdn(8));
    }

    public xom(ycp ycpVar, mbc mbcVar, ydu yduVar, tfq tfqVar, awmd awmdVar, xru xruVar, xmr xmrVar, vxz vxzVar) {
        this.f = mbcVar;
        this.o = ycpVar;
        this.g = yduVar;
        this.b = tfqVar;
        this.h = aguu.al(new cmw(vxzVar, awmdVar, 7, null));
        this.i = xruVar;
        this.j = xmrVar.a.equals("m");
        this.c = vxzVar;
    }

    private static void e(Map map, xzc xzcVar) {
        String str;
        String str2;
        xve xveVarI = xzcVar.i();
        if (xveVarI != null) {
            map.put("mdx_screen_identifier", xveVarI.d.b);
        }
        String str3 = "unknown";
        if (xzcVar.j() instanceof xvn) {
            xvn xvnVar = (xvn) xzcVar.j();
            map.put("mdx_dial_manufacturer", typ.c(xvnVar.e));
            map.put("mdx_dial_model", typ.c(xvnVar.f));
            map.put("mdx_dial_is_wol", String.valueOf(xvnVar.s()));
            int i = xvnVar.k().a;
            if (i == -1) {
                str2 = "not found";
            } else if (i == 0) {
                str2 = "installable";
            } else if (i == 1) {
                str2 = "running";
            } else if (i != 2) {
                str2 = i != 3 ? "unknown" : "hidden";
            } else {
                str2 = "stopped";
            }
            map.put("mdx_dial_app_status", str2);
            map.put("mdx_dial_is_sleeping", String.valueOf(xvnVar.r()));
        }
        int i2 = xzcVar.n().k - 1;
        if (i2 == 1) {
            str3 = "cast";
        } else if (i2 == 2) {
            str3 = "dial";
        } else if (i2 == 3) {
            str3 = "cloud";
        } else if (i2 == 5) {
            str3 = "remote";
        }
        map.put("mdx_session_type", str3);
        int iB = xzcVar.b();
        if (iB != 0) {
            str = iB != 1 ? "disconnected" : "connected";
        } else {
            str = "connecting";
        }
        map.put("mdx_session_state", str);
        map.put("mdx_session_nonce", xzcVar.n().a);
    }

    public final void a(xzc xzcVar) {
        HashMap map = new HashMap();
        e(map, xzcVar);
        if (map.isEmpty()) {
            return;
        }
        synchronized (this.k) {
            this.l = map;
        }
        this.m = this.f.f().toEpochMilli();
    }

    @Override // defpackage.wfv
    public final void b(Bundle bundle) {
        xoj xojVar;
        yco ycoVar = this.o.e;
        if (ycoVar == null || !(ycoVar.j() instanceof xvj) || (xojVar = (xoj) this.h.io()) == null) {
            return;
        }
        CastDevice castDevice = ((xvj) ycoVar.j()).a;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ahhp ahhpVar = new ahhp(bundle, countDownLatch);
        InetAddress inetAddress = castDevice.c;
        Inet4Address inet4Address = inetAddress instanceof Inet4Address ? (Inet4Address) inetAddress : null;
        if (inet4Address != null) {
            String string = UUID.randomUUID().toString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uuid", string);
                tnf tnfVar = new tnf(String.format(Locale.US, "http://%s:%d/%s", inet4Address.getHostAddress(), 8008, "setup/send_log_report"), jSONObject, new zxk(ahhpVar, 1), new xoi(ahhpVar, 0), true, xojVar.c);
                if (xojVar.d.m(14, 45627566L)) {
                    tnfVar.B(tok.CAST_FEEDBACK_HELPER);
                }
                xojVar.b.b(tnfVar);
            } catch (JSONException e2) {
                ((agrc) ((agrc) ((agrc) xoj.a.b().i(agso.a, "MDX.CastFeedback")).j(e2)).k("com/google/android/libraries/youtube/mdx/feedback/CastFeedbackHelper", "sendLogReportRequest", 'H', "CastFeedbackHelper.java")).t("Failed creating json object");
                ahhpVar.d(null);
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e3) {
            ((agrc) ((agrc) ((agrc) e.b().i(agso.a, "MDX.FeedbackFiller")).j(e3)).k("com/google/android/libraries/youtube/mdx/feedback/DefaultMdxFeedbackFiller", "blockingSendLogReportRequest", (char) 339, "DefaultMdxFeedbackFiller.java")).t("Failed filling casting crash report id");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034 A[Catch: all -> 0x011a, TryCatch #0 {, blocks: (B:5:0x0011, B:7:0x0019, B:9:0x0021, B:12:0x0039, B:14:0x0041, B:15:0x0061, B:11:0x0034), top: B:44:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041 A[Catch: all -> 0x011a, TryCatch #0 {, blocks: (B:5:0x0011, B:7:0x0019, B:9:0x0021, B:12:0x0039, B:14:0x0041, B:15:0x0061, B:11:0x0034), top: B:44:0x0011 }] */
    @Override // defpackage.wfv
    public final void c(Bundle bundle) {
        String str;
        taq.d();
        final HashMap map = new HashMap();
        Object obj = this.k;
        yco ycoVar = this.o.e;
        synchronized (obj) {
            if (ycoVar == null) {
                if (!this.l.isEmpty() && this.m != -1 && this.f.f().toEpochMilli() - this.m >= d) {
                    this.l.clear();
                }
                if (!this.l.isEmpty()) {
                    map.putAll(this.l);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    map.put("mdx_seconds_since_session_cached", String.valueOf((this.f.f().toEpochMilli() - this.m) / 1000));
                }
            } else {
                this.l.clear();
                if (!this.l.isEmpty()) {
                    map.putAll(this.l);
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    map.put("mdx_seconds_since_session_cached", String.valueOf((this.f.f().toEpochMilli() - this.m) / 1000));
                }
            }
            throw th;
        }
        if (ycoVar != null) {
            e(map, ycoVar);
        }
        if (this.j) {
            xsc xscVar = this.i.j;
            if (xscVar == null) {
                map.put("selected_media_route_type", null);
                map.put("selected_media_route_name", null);
            } else {
                int iA = xscVar.a();
                if (iA == 1) {
                    str = "CLOUD";
                } else if (iA != 2) {
                    str = iA != 3 ? "BLUETOOTH" : "CAST";
                } else {
                    str = "DIAL";
                }
                map.put("selected_media_route_type", str);
                map.put("selected_media_route_name", xscVar.a);
            }
        }
        final xvs xvsVar = new xvs();
        xvsVar.i = 1;
        xvsVar.h = (short) (xvsVar.h | 8128);
        xvsVar.e(0);
        xvsVar.g(0);
        xvsVar.f(0);
        xvsVar.a(0);
        xvsVar.c(0);
        xvsVar.b(0);
        xvsVar.h = (short) (xvsVar.h | 8192);
        xvsVar.d(0);
        ydu yduVar = this.g;
        taf.g(ahno.ar(yduVar.b, new tvm(yduVar, xvsVar, 16, null), MoreExecutors.directExecutor()), new tae() { // from class: xok
            @Override // defpackage.tae, defpackage.twi
            public final void a(Object obj2) {
                String str2;
                xvs xvsVar2 = xvsVar;
                if (xvsVar2.h == Short.MAX_VALUE && xvsVar2.i != 0) {
                    int i = new xvt(xvsVar2.a, xvsVar2.b, xvsVar2.c, xvsVar2.d, xvsVar2.e, xvsVar2.f, xvsVar2.g).a;
                    if (i == 1) {
                        str2 = "never";
                    } else if (i == 2) {
                        str2 = "seldom";
                    } else if (i != 3) {
                        str2 = i != 4 ? "unknown" : "frequent";
                    } else {
                        str2 = "sometimes";
                    }
                    Map map2 = map;
                    xom xomVar = this.a;
                    map2.put("mdx_caster_category", str2);
                    String typeName = null;
                    if (xomVar.c.k(45847179L, false)) {
                        tfq tfqVar = xomVar.b;
                        if (tfqVar.i()) {
                            agqr it = xom.a.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    typeName = "UNKNOWN";
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (a$$ExternalSyntheticApiModelOutline0.m9m(entry.getValue()).test(tfqVar)) {
                                    typeName = (String) entry.getKey();
                                    break;
                                }
                            }
                        }
                    } else {
                        NetworkInfo networkInfoD = xomVar.b.d();
                        if (networkInfoD != null) {
                            typeName = networkInfoD.getTypeName();
                        }
                    }
                    if (typeName != null) {
                        map2.put("mdx_network_type", typeName);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if ((xvsVar2.h & 1) == 0) {
                    sb.append(" mdxConnectionCountDay");
                }
                if ((xvsVar2.h & 2) == 0) {
                    sb.append(" mdxConnectionCountWeek");
                }
                if ((xvsVar2.h & 4) == 0) {
                    sb.append(" mdxConnectionCountMonth");
                }
                if ((xvsVar2.h & 8) == 0) {
                    sb.append(" castAvailableSessionCountDay");
                }
                if ((xvsVar2.h & 16) == 0) {
                    sb.append(" castAvailableSessionCountWeek");
                }
                if ((xvsVar2.h & 32) == 0) {
                    sb.append(" castAvailableSessionCountMonth");
                }
                if (xvsVar2.i == 0) {
                    sb.append(" pageType");
                }
                if ((xvsVar2.h & 64) == 0) {
                    sb.append(" currentVideoDuration");
                }
                if ((xvsVar2.h & 128) == 0) {
                    sb.append(" fullScreen");
                }
                if ((xvsVar2.h & 256) == 0) {
                    sb.append(" hd");
                }
                if ((xvsVar2.h & 512) == 0) {
                    sb.append(" sd");
                }
                if ((xvsVar2.h & 1024) == 0) {
                    sb.append(" playlistPlayback");
                }
                if ((xvsVar2.h & 2048) == 0) {
                    sb.append(" videoControlsVisible");
                }
                if ((xvsVar2.h & 4096) == 0) {
                    sb.append(" uncastedVideoCount");
                }
                if ((xvsVar2.h & 8192) == 0) {
                    sb.append(" currentTime");
                }
                if ((xvsVar2.h & 16384) == 0) {
                    sb.append(" casterCategory");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        });
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        this.m = this.f.f().toEpochMilli();
    }

    @Override // defpackage.xon
    public final void d() {
        ycp ycpVar = this.o;
        yco ycoVar = ycpVar.e;
        if (ycoVar != null) {
            a(ycoVar);
        }
        ycpVar.a(this.n);
    }
}
