package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import com.google.android.apps.youtube.music.R;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Function;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgp implements Observer, zhp, abgl {
    private static final agrf D = agrf.h("com/google/android/libraries/youtube/player/features/overlay/nerdstats/NerdStatsOverlayPresenter");
    public boolean A;
    public final abgb B;
    public avgj C;
    private final Context E;
    private final twf F;
    private final ttm G;
    private int H;
    private long I;
    private final tfq J;
    private final abuz K;
    private final xgl L;
    public final abgm a;
    public final agev b;
    public final zho c;
    public final zkk d;
    public final Function e;
    public final agfr f;
    public final abvn g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public wgs m;
    public wgs n;
    public wiz o;
    public agev p = agdf.a;
    public amgu[] q;
    public amgu[] r;
    public String s;
    public final avmm t;
    public final abgo u;
    public final abgn v;
    public boolean w;
    public long x;
    public final Map y;
    public final boolean z;

    public abgp(abgm abgmVar, Context context, agev agevVar, zho zhoVar, abuz abuzVar, tfq tfqVar, twf twfVar, zkk zkkVar, Function function, agfr agfrVar, ttm ttmVar, abvn abvnVar, xgl xglVar) {
        abgmVar.getClass();
        this.a = abgmVar;
        abgmVar.j(this);
        context.getClass();
        this.E = context;
        zhoVar.getClass();
        this.c = zhoVar;
        abuzVar.getClass();
        this.K = abuzVar;
        tfqVar.getClass();
        this.J = tfqVar;
        twfVar.getClass();
        this.F = twfVar;
        zkkVar.getClass();
        this.d = zkkVar;
        function.getClass();
        this.e = function;
        this.f = agfrVar;
        this.G = ttmVar;
        this.b = agevVar;
        this.g = abvnVar;
        this.L = xglVar;
        this.u = new abgo(this);
        this.v = new abgn(this);
        this.B = new abgb(this);
        this.t = new avmm();
        boolean zL = abvnVar.g().g.l(430, 45795696L, false);
        this.z = zL;
        this.y = zL ? new ConcurrentHashMap() : new HashMap();
    }

    public static String j(amwn amwnVar) {
        int iOrdinal = amwnVar.ordinal();
        if (iOrdinal == 0) {
            return "Unknown Latency";
        }
        if (iOrdinal == 1) {
            return "Normal Latency";
        }
        if (iOrdinal == 2) {
            return "Low Latency";
        }
        if (iOrdinal == 3) {
            return "Ultra-Low Latency";
        }
        throw new RuntimeException(null, null);
    }

    public static final String o(String str) {
        try {
            if (str.length() != 16) {
                return str;
            }
            String str2 = str + "AAAA";
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= 20) {
                    for (int i3 = 4; i3 > 0; i3--) {
                        sb.insert(i3 << 2, " ");
                    }
                    return sb.substring(0, 24);
                }
                int iIndexOf = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".indexOf(str2.charAt(i));
                if (iIndexOf < 0) {
                    throw new IllegalArgumentException();
                }
                i2 = (i2 << 6) + iIndexOf;
                if (i % 5 == 4) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i4 = 0; i4 < 6; i4++) {
                        sb2.insert(0, "0123456789ABCDEFGHJKMNPQRSTVWXYZ".charAt(i2 & 31));
                        i2 >>= 5;
                    }
                    sb.append((CharSequence) sb2);
                }
                i++;
            }
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) D.b()).j(e)).k("com/google/android/libraries/youtube/player/features/overlay/nerdstats/NerdStatsOverlayPresenter", "encodeSubstitutedCpn", (char) 352, "NerdStatsOverlayPresenter.java")).w("Error encoding substituted cpn: %s ", str);
            return str;
        }
    }

    private static void p(JSONObject jSONObject, amgu[] amguVarArr) throws JSONException {
        if (amguVarArr != null) {
            for (amgu amguVar : amguVarArr) {
                String str = amguVar.e;
                if (str.startsWith("innertube.build.") || str.equals("e") || str.equals("logged_in")) {
                    jSONObject.put(amguVar.e, amguVar.c == 2 ? (String) amguVar.d : "");
                }
            }
        }
    }

    @Override // defpackage.zhp
    public final synchronized void a(zih zihVar) {
        this.H += zihVar.b;
        this.I += zihVar.c;
        this.A = zihVar.d;
    }

    @Override // defpackage.abgl
    public final void g() {
        String string;
        String string2 = null;
        try {
            JSONObject jSONObject = new JSONObject();
            agqr it = this.K.e(this.i).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put("cosver", Build.VERSION.RELEASE + '.' + Build.ID + '.' + Build.VERSION.INCREMENTAL);
            jSONObject.put("videoid", this.h);
            jSONObject.put("cpn", this.i);
            jSONObject.put("fmt", aaja.e(this.m));
            jSONObject.put("afmt", aaja.e(this.n));
            jSONObject.put("bh", this.x);
            jSONObject.put("conn", this.J.a());
            jSONObject.put("volume", this.L.b());
            Object objIo = this.f.io();
            yvd yvdVar = ((yve) objIo).h;
            if (yvdVar != null) {
                jSONObject.put("loudness", String.format(Locale.US, "%.3f", yvdVar.d));
            } else {
                jSONObject.put("loudness", "0.000");
            }
            Locale locale = Locale.US;
            twf twfVar = this.F;
            jSONObject.put("bat", String.format(locale, "%.3f:%d", Float.valueOf(twfVar.a()), Integer.valueOf(twfVar.b() ? 1 : 0)));
            int i = ((yve) objIo).a - this.l;
            int i2 = ((yve) objIo).b - this.k;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('/');
            sb.append(i2);
            jSONObject.put("df", sb.toString());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            jSONObject.put("time", simpleDateFormat.format(new Date()));
            jSONObject.put("glmode", this.o);
            jSONObject.put("drm", ((yve) objIo).c);
            jSONObject.put("mtext", ((yve) objIo).i);
            String str = this.i;
            List<zhz> list = str != null ? (List) this.y.get(str) : null;
            if (list != null) {
                StringBuilder sb2 = new StringBuilder();
                for (zhz zhzVar : list) {
                    sb2.append(zhzVar.f());
                    sb2.append(':');
                    sb2.append(zhzVar.a());
                    sb2.append(':');
                    sb2.append(zhzVar.e);
                    sb2.append(',');
                }
                string = sb2.toString();
            } else {
                string = "No errors";
            }
            jSONObject.put("error", string);
            p(jSONObject, this.q);
            p(jSONObject, this.r);
            string2 = jSONObject.toString();
        } catch (JSONException unused) {
        }
        ClipboardManager clipboardManager = (ClipboardManager) this.E.getSystemService("clipboard");
        int i3 = R.string.nerd_stats_copy_debug_info_error;
        if (string2 != null && clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("YouTube Player Debug Info", string2));
            i3 = R.string.nerd_stats_copy_debug_info_success;
        }
        this.G.c(i3);
    }

    @Override // defpackage.abgl
    public final void h() {
        k();
    }

    public final synchronized float i() {
        float f;
        int i = this.H;
        f = i == 0 ? 0.0f : (this.I << 3) / (i / 1000.0f);
        this.I = 0L;
        this.H = 0;
        return f;
    }

    public final void k() {
        if (this.w) {
            this.w = false;
            this.a.a();
            this.t.b();
            this.c.e(this);
            this.d.deleteObserver(this);
        }
    }

    public final void l() {
        yve yveVar = (yve) this.f.io();
        String strC = typ.c(yveVar.i);
        abgm abgmVar = this.a;
        abgmVar.l(strC);
        abgmVar.e(typ.c(yveVar.c));
        abgmVar.n(yveVar.d);
        abgmVar.m(typ.c(yveVar.e));
        if (yveVar.f.isEmpty()) {
            return;
        }
        abgmVar.p(o(yveVar.f));
        abgmVar.s(yveVar.g);
    }

    public final void m() {
        abgm abgmVar = this.a;
        abgmVar.p(this.j);
        abgmVar.s(this.h);
        abgmVar.r(this.o);
        if (this.g.g().aW()) {
            abgmVar.k(this.p);
        }
    }

    public final void n() {
        yvd yvdVar = ((yve) this.f.io()).h;
        int iB = this.L.b();
        if (yvdVar != null) {
            this.a.u(iB, yvdVar);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        zkk zkkVar = this.d;
        if (observable == zkkVar && this.w) {
            this.a.t((zkj) zkkVar.io());
        }
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void e(zih zihVar) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void f(long j) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void d(long j, long j2) {
    }
}
