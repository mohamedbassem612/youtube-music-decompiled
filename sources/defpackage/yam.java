package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yam implements ycr, ycu, xyr {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession");
    public static final long b;
    static final IntentFilter c;
    public final awli A;
    public xyv D;
    public Set E;
    public final Handler F;
    final HandlerThread G;
    final yai H;
    public int I;
    public amyu J;
    public xyw K;
    public xyv L;
    public xyv M;
    public smk N;
    public sxv O;
    public String P;
    public String Q;
    public float R;
    public String S;
    public boolean T;
    public final boolean U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    private String aA;
    private final xur aB;
    private final yaa aC;
    public long aa;
    public final String ab;
    public int ac;
    public boolean ad;
    public int ae;
    public List af;
    public wgo ag;
    public ahew ah;
    public final awlx ai;
    public String aj;
    public int ak;
    public final ycp al;
    public final xls am;
    public final tfq an;
    public final vxz ao;
    public hhy ap;
    public final wjr aq;
    public final aesq ar;
    private final xwj as;
    private final Optional at;
    private final ydy au;
    private final boolean av;
    private final abea aw;
    private boolean ax;
    private Integer ay;
    private String az;
    public final ListenableFuture d;
    public final Context e;
    public final xla f;
    final Handler g;
    public final tbt h;
    public final txp i;
    public final mbc j;
    public final ttm k;
    public final acda l;
    public final yed n;
    public final boolean o;
    public final xys p;
    public final ahey q;
    public final String r;
    public final yco s;
    public xve t;
    public xwb u;
    public xwb v;
    public final awli w;
    public final awli x;
    public final awli y;
    public final awli z;
    public final List m = new CopyOnWriteArrayList();
    public final awlo B = new awlo();
    public final xzb C = new yaj(this);

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = 900000L;
        IntentFilter intentFilter = new IntentFilter();
        c = intentFilter;
        intentFilter.addAction(xvf.l.toString());
        intentFilter.addAction(xvf.h.toString());
    }

    public yam(Context context, yaa yaaVar, ycp ycpVar, tbt tbtVar, txp txpVar, mbc mbcVar, ttm ttmVar, tfq tfqVar, acda acdaVar, Handler handler, xwj xwjVar, xve xveVar, yco ycoVar, xxj xxjVar, aesq aesqVar, ListenableFuture listenableFuture, wjr wjrVar, Optional optional, xys xysVar, boolean z, xla xlaVar, ahey aheyVar, abea abeaVar, yed yedVar, ytv ytvVar, ydy ydyVar, vxz vxzVar, xur xurVar) {
        xyv xyvVar = xyv.a;
        this.D = xyvVar;
        this.E = new HashSet();
        this.H = new yai(this);
        this.I = 0;
        this.ay = null;
        this.J = amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
        this.K = xyw.UNSTARTED;
        this.L = xyvVar;
        this.M = xyvVar;
        this.P = xyvVar.g;
        this.Q = xyvVar.b;
        this.ak = 1;
        this.R = 1.0f;
        this.S = "LOOP_MODE_OFF";
        this.T = false;
        this.ac = 0;
        this.az = "";
        this.aA = "";
        this.ae = 30;
        this.af = new ArrayList();
        this.aj = xyvVar.b;
        this.f = xlaVar;
        this.aC = yaaVar;
        this.al = ycpVar;
        this.j = mbcVar;
        this.i = txpVar;
        this.h = tbtVar;
        this.k = ttmVar;
        this.an = tfqVar;
        this.l = acdaVar;
        this.g = handler;
        this.as = xwjVar;
        this.t = xveVar;
        this.s = ycoVar;
        this.am = (xls) xxjVar.a;
        this.ar = aesqVar;
        this.e = context;
        this.d = listenableFuture;
        this.aq = wjrVar;
        this.U = xlaVar.aB();
        this.n = yedVar;
        this.at = optional;
        this.o = z;
        this.ab = xlaVar.X();
        this.av = xlaVar.aM();
        this.w = new awli();
        this.x = new awli();
        this.y = new awli();
        this.z = new awli();
        this.A = new awli(Boolean.FALSE);
        this.q = aheyVar;
        this.r = "m";
        this.aw = abeaVar;
        this.au = ydyVar;
        this.ao = vxzVar;
        this.aB = xurVar;
        if (vxzVar.l(58, 45400591L, false)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.R = ytvVar.c();
            } else {
                agrx agrxVar = agso.a;
            }
        }
        HandlerThread handlerThread = new HandlerThread(getClass().getName(), 10);
        this.G = handlerThread;
        handlerThread.start();
        this.F = new yal(this, handlerThread.getLooper());
        this.p = xysVar;
        this.ai = new awlx();
    }

    public static final void C(xvy xvyVar, List list) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xzv xzvVar = (xzv) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoId", xzvVar.a);
                if (xzvVar.b()) {
                    jSONObject.put("sourceContainerPlaylistId", xzvVar.b.get());
                }
                arrayList.add(jSONObject.toString());
            }
            xvyVar.a("videoEntries", arrayList.toString());
        } catch (JSONException e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.Cloud")).j(e)).k("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession", "writeVideoEntriesToParams", (char) 804, "CloudSession.java")).t("error adding video entries to params");
        }
    }

    public final boolean A(xyw xywVar, boolean z) {
        if (this.K == xywVar && !z) {
            return false;
        }
        this.K = xywVar;
        agrx agrxVar = agso.a;
        wjr wjrVar = this.aq;
        aihf aihfVarCreateBuilder = amiz.a.createBuilder();
        xyv xyvVar = this.D;
        xyv xyvVar2 = xyv.a;
        boolean z2 = !xyvVar.equals(xyvVar2);
        aihfVarCreateBuilder.copyOnWrite();
        amiz amizVar = (amiz) aihfVarCreateBuilder.instance;
        amizVar.b |= SemanticState.Obscured;
        amizVar.o = z2;
        wjrVar.y((amiz) aihfVarCreateBuilder.build());
        if (this.K == xyw.PLAYING && !this.D.equals(xyvVar2)) {
            wjrVar.w(191, "cx_ps");
        } else if (this.K == xyw.ERROR && !this.D.equals(xyvVar2)) {
            wjrVar.w(191, "cx_pf");
        }
        if (!xywVar.p) {
            this.N = null;
            this.O = null;
        }
        this.h.c(new xyx(this.K));
        return true;
    }

    @Override // defpackage.ycr
    public final void D(zik zikVar) {
        this.m.add(zikVar);
    }

    @Override // defpackage.ycr
    public final long a() {
        long jB;
        boolean z = this.K.q;
        long j = this.W;
        if (z) {
            j += this.X;
            float f = 1.0f;
            if (this.ao.l(58, 45400591L, false) && this.K != xyw.AD_PLAYING) {
                f = this.R;
            }
            jB = (long) ((this.j.b() - this.V) * f);
        } else {
            jB = this.X;
        }
        return j + jB;
    }

    public final xve b(xve xveVar) {
        if (xveVar.a() != null) {
            return xveVar;
        }
        agrx agrxVar = agso.a;
        xvz xvzVar = xveVar.d;
        xvh xvhVar = (xvh) this.as.b(Arrays.asList(xvzVar), 1).get(xvzVar);
        if (xvhVar == null) {
            ((agrc) ((agrc) a.b().i(agrxVar, "MDX.Cloud")).k("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession", "getScreenWithToken", 1527, "CloudSession.java")).w("Unable to retrieve lounge token for screenId %s", xvzVar);
            return null;
        }
        this.aq.w(191, "cx_rlt");
        xvb xvbVar = new xvb(xveVar);
        xvbVar.c(xvhVar);
        return xvbVar.a();
    }

    public final xvy c(xyv xyvVar) {
        xvy xvyVar = new xvy();
        xzv xzvVar = xyvVar.c;
        if (xzvVar != null) {
            xvyVar.a("videoEntry", xzvVar.b() ? String.format("{\"videoId\":\"%1$s\",\"sourceContainerPlaylistId\":\"%2$s\"}", xzvVar.a, xzvVar.b.orElse("")) : String.format("{\"videoId\":\"%1$s\"}", xzvVar.a));
        } else {
            xvyVar.a("videoId", xyvVar.b);
        }
        xvyVar.a("listId", xyvVar.g);
        Integer numValueOf = Integer.valueOf(xyvVar.a() - 1);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        xvyVar.a("currentIndex", Integer.toString(numValueOf != null ? numValueOf.intValue() : xyv.a.a()));
        List list = xyvVar.d;
        List<xzv> list2 = xyvVar.s;
        if (!list2.isEmpty()) {
            try {
                ArrayList arrayList = new ArrayList();
                for (xzv xzvVar2 : list2) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("videoId", xzvVar2.a);
                    if (xzvVar2.b()) {
                        jSONObject.put("sourceContainerPlaylistId", xzvVar2.b.get());
                    }
                    arrayList.add(jSONObject.toString());
                }
                xvyVar.a("videoEntries", arrayList.toString());
            } catch (JSONException e) {
                ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.Cloud")).j(e)).k("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession", "buildSetPlaylistParams", (char) 1945, "CloudSession.java")).t("error adding video entries to params");
            }
        } else if (list != null && !list.isEmpty()) {
            xvyVar.a("videoIds", TextUtils.join(",", list));
        }
        long j = xyvVar.e;
        if (j != -1) {
            xvyVar.a("currentTime", Long.toString(j / 1000));
        }
        String str = xyvVar.j;
        if (str != null) {
            xvyVar.a("params", str);
        }
        String str2 = xyvVar.k;
        if (str2 != null) {
            xvyVar.a("playerParams", str2);
        }
        boolean z = xyvVar.l;
        if (this.ao.l(96, 45460566L, false)) {
            xvyVar.a("playbackState", true != xyvVar.m ? "PLAYING" : "PAUSED");
        }
        aigj aigjVar = xyvVar.n;
        if (aigjVar != null) {
            xvyVar.a("clickTrackingParams", Base64.encodeToString(aigjVar.G(), 10));
        }
        aigj aigjVar2 = xyvVar.o;
        String str3 = xyvVar.p;
        if (str3 != null) {
            xvyVar.a("csn", str3);
        }
        xxl xxlVar = (xxl) this.at.orElse(null);
        Location locationA = xxlVar != null ? xxlVar.a() : null;
        if (locationA != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("latitudeE7", (int) (locationA.getLatitude() * 1.0E7d));
                jSONObject2.put("longitudeE7", (int) (locationA.getLongitude() * 1.0E7d));
                xvyVar.a("locationInfo", jSONObject2.toString());
            } catch (JSONException e2) {
                ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.Cloud")).j(e2)).k("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession", "buildSetPlaylistParams", (char) 2010, "CloudSession.java")).t("Error adding location info to params");
            }
        }
        xvyVar.a("audioOnly", true != this.T ? "false" : "true");
        if (this.av) {
            xvyVar.a("prioritizeMobileSenderPlaybackStateOnConnection", "true");
        }
        xyn xynVar = xyvVar.q;
        String str4 = xyvVar.r;
        if (!str4.isEmpty()) {
            xvyVar.a("remotePlayabilityStatusParams", str4);
        }
        String str5 = xyvVar.i;
        if (this.ao.l(R.styleable.AppCompatTheme_windowNoTitle, 45630215L, false) && !str5.isEmpty()) {
            xvyVar.a("activeSourceVideoId", str5);
        }
        if (xyvVar.t) {
            xvyVar.a("prioritizeSenderPlayback", "true");
        }
        return xvyVar;
    }

    final xyv d(xyv xyvVar) {
        if (!xyvVar.e()) {
            return xyv.a;
        }
        long j = xyvVar.e;
        if (j != -1 && j < 5000) {
            j = 0;
        }
        xyu xyuVar = new xyu(xyvVar);
        abea abeaVar = this.aw;
        if (abeaVar.a() != null) {
            agrx agrxVar = agso.a;
            xyuVar.b = abeaVar.a().i();
            xyuVar.d |= 16384;
        }
        xyuVar.c(j);
        return xyuVar.a();
    }

    @Override // defpackage.ycr
    public final Integer e() {
        return this.ay;
    }

    @Override // defpackage.ycr
    public final String f() {
        if (!this.ao.l(89, 45427624L, false) || !TextUtils.isEmpty(this.L.g)) {
            return this.L.g;
        }
        agrx agrxVar = agso.a;
        return this.aA;
    }

    @Override // defpackage.ycr
    public final String g() {
        xwb xwbVar = this.u;
        if (xwbVar != null) {
            return xwbVar.b;
        }
        return null;
    }

    @Override // defpackage.ycr
    public final String h() {
        xwb xwbVar = this.u;
        if (xwbVar != null) {
            return xwbVar.c;
        }
        return null;
    }

    @Override // defpackage.ycr
    public final String i() {
        if (!this.ao.l(89, 45427624L, false) || !TextUtils.isEmpty(this.L.b)) {
            return this.L.b;
        }
        agrx agrxVar = agso.a;
        return this.az;
    }

    public final void j(Context context, yak yakVar, boolean z) {
        String str;
        xls xlsVar = this.am;
        if (xlsVar.a() != 0) {
            int i = yakVar.d;
            if (i != 1) {
                amyu amyuVar = yakVar.c;
                boolean z2 = yakVar.a;
                switch (i) {
                    case 2:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DISCONNECTED_BY_USER";
                        break;
                    case 3:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_ROUTE_UNSELECTED";
                        break;
                    case 4:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_INCOGNITO";
                        break;
                    case 5:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_NETWORK";
                        break;
                    case 6:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_USER_CHANGED";
                        break;
                    case 7:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_SCREEN_APP_STOPPED";
                        break;
                    case 8:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CONNECTION_TIMEOUT";
                        break;
                    case 9:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CLOUD_SCREEN_NOT_FOUND";
                        break;
                    case 10:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CLOUD_NO_LOUNGE_TOKEN";
                        break;
                    case 11:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_MISSING_URL";
                        break;
                    case 12:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_WAKE_ON_LAN_FAILED";
                        break;
                    case 13:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_SERVER_ERROR";
                        break;
                    case 14:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_CLIENT_ERROR";
                        break;
                    case 15:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_NETWORK_CHANGED";
                        break;
                    case 16:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_LOUNGE_TOKEN_REQUEST_FAILED";
                        break;
                    case 17:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_MDX_STOPPED";
                        break;
                    case 18:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_BROWSER_CHANNEL_ERROR";
                        break;
                    case 19:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_RECONNECT_REQUEST_FAILED";
                        break;
                    case 20:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CAST_SDK_DISCONNECTED";
                        break;
                    case 21:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_LOUNGE_TOKEN_UNAUTHORIZED";
                        break;
                    case 22:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_APP_TERMINATED";
                        break;
                    case 23:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_MULTI_USER_NOT_ALLOWED";
                        break;
                    case 24:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_SCREEN_UNAVAILABLE";
                        break;
                    case 25:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CAST_AUTHENTICATION_FAILURE";
                        break;
                    case 26:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CAST_SDK_CANCELLED";
                        break;
                    case 27:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_NOT_ONLINE";
                        break;
                    case 28:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_UNMATCHING_THEME";
                        break;
                    case 29:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_RECEIVER_DEAD_AFTER_RECEIVER_PING";
                        break;
                    case 30:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_KIDS_ON_CAST_ICON_VISIBILITY_HIDDEN";
                        break;
                    case 31:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_CLOUD_SCREEN_FOR_PAIRING_CODE_NOT_FOUND";
                        break;
                    case 32:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_RECOVERY_SMOOTH_PAIRING_SCREEN_NOT_ONLINE";
                        break;
                    case 33:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_RECOVERY_WAKE_ON_LAN_STARTED";
                        break;
                    case 34:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CLOUD_CHANNEL_NETWORK_ERROR";
                        break;
                    case 35:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_WEB_SOCKET_NETWORK_ERROR";
                        break;
                    case 36:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CAST_SDK_NETWORK_ERROR";
                        break;
                    case 37:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DIAL_LAUNCH_NETWORK_ERROR";
                        break;
                    case 38:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_NETWORK_CHANGED_ON_REACHABILITY_UPDATE";
                        break;
                    case 39:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CAST_DISCONNECT_TIMEOUT";
                        break;
                    case 40:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_APP_LAUNCH_CAST_INIT_TIMEOUT";
                        break;
                    case 41:
                    default:
                        str = "null";
                        break;
                    case 42:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CAST_SESSION_START_FAILED_ERROR";
                        break;
                    case 43:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_GENERAL_CAST_SDK_DISCONNECT";
                        break;
                    case 44:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_NEW_SENDER_WITH_DIFFERENT_THEME";
                        break;
                    case 45:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_RECONNECTING_SENDER_DOES_NOT_MATCH_LAST_MANUAL_CONNECTED_SENDER_THEME";
                        break;
                    case 46:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DISCONNECTED_BY_USER_PLAY_ON_PHONE";
                        break;
                    case 47:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_DISCONNECTED_BY_USER_SCREEN_INITIATED";
                        break;
                    case 48:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_APP_MOVED_TO_BACKGROUND";
                        break;
                    case 49:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_COMPROMISED_RECEIVER";
                        break;
                    case 50:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_SHORTS_ACTIVE_PLAYBACK";
                        break;
                    case 51:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_NO_ACTIVE_PLAYBACK";
                        break;
                    case 52:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_CRAYOLA_UNSUPPORTED";
                        break;
                    case 53:
                        str = "MDX_SESSION_DISCONNECT_BEHAVIOR_ACCOUNT_LOCKED";
                        break;
                }
                xlsVar.f(amyuVar, z2, z, Optional.of(str));
            } else {
                xlsVar.f(yakVar.c, yakVar.a, z, Optional.empty());
            }
        } else {
            agrx agrxVar = agso.a;
        }
        if (this.ax) {
            context.unregisterReceiver(this.H);
            this.ax = false;
        }
        this.h.l(this);
        this.A.kk(Boolean.FALSE);
    }

    public final void k() {
        if (!this.o) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l(xyv xyvVar) {
        m(xyvVar, Optional.empty());
    }

    final void m(xyv xyvVar, Optional optional) {
        ahno.O(this.D == xyv.a);
        ahno.O(this.I == 0);
        this.J = amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
        this.ay = null;
        xyv xyvVarD = d(xyvVar);
        this.D = xyvVarD;
        this.aj = xyvVarD.i;
        s(1);
        wjr wjrVar = this.aq;
        wjrVar.w(16, "c_c");
        wjrVar.w(191, "cx_ecc");
        boolean zIsPresent = optional.isPresent();
        Handler handler = this.F;
        if (zIsPresent) {
            handler.sendMessage(Message.obtain(handler, 3, optional.get()));
        } else {
            handler.sendMessage(Message.obtain(handler, 3));
        }
    }

    public final void n(xve xveVar, xyv xyvVar, Optional optional) {
        if (!this.ax) {
            avg.f(this.e, this.H, c, null, 4);
            this.ax = true;
        }
        yco ycoVar = this.s;
        String strF = ycoVar.j().f();
        acwf acwfVar = new acwf();
        acwfVar.d(false);
        acwfVar.f = xveVar.a();
        acwfVar.c = xveVar.b;
        acwfVar.a = strF;
        String str = this.au.f;
        if (str == null) {
            throw new NullPointerException("Null browserChannelUrl");
        }
        acwfVar.b = str;
        if (!ycoVar.av() && xyvVar.e()) {
            vxz vxzVar = this.ao;
            if (vxzVar.l(23, 45368353L, false)) {
                acwfVar.d = xvu.CONNECT_PARAMS;
                xvy xvyVar = new xvy();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("setPlaylistParams", ycw.a(c(xyvVar)));
                    if (vxzVar.l(58, 45400591L, false)) {
                        jSONObject.put("playbackSpeed", String.valueOf(this.R));
                    }
                    xvyVar.a("setStatesParams", jSONObject.toString());
                } catch (JSONException e) {
                    ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.Cloud")).j(e)).k("com/google/android/libraries/youtube/mdx/remote/internal/CloudSession", "buildConnectParams", (char) 1894, "CloudSession.java")).t("JSON error in creating buildConnectParams");
                }
                acwfVar.e = xvyVar;
            } else {
                acwfVar.d = xvu.SET_PLAYLIST;
                acwfVar.e = c(xyvVar);
            }
        }
        acwfVar.d((this.ao.l(264, 45849099L, false) && (this.s.av() || this.I == 4)) ? false : true);
        if (optional.isPresent()) {
            acwfVar.d = xvu.RESUME_SESSION;
            xvy xvyVar2 = new xvy();
            xvyVar2.a("sessionState", (String) optional.get());
            String str2 = xyvVar.r;
            if (!str2.isEmpty()) {
                xvyVar2.a("remotePlayabilityStatusParams", str2);
            }
            acwfVar.e = xvyVar2;
        }
        ycv ycvVarC = acwfVar.c();
        String.format("Connecting to %s with ", xveVar.d);
        if (ycvVarC.a()) {
            String.format("%s : %s", ycvVarC.a, ycvVarC.b() ? ycvVarC.b : "{}");
        }
        agrx agrxVar = agso.a;
        xls xlsVar = this.am;
        xlsVar.i = ycvVarC;
        xlsVar.j = Optional.of(this.aB);
        xlsVar.s = this;
        xlsVar.t = new yah(this);
        xlsVar.b();
    }

    @Override // defpackage.ycr
    public final void o(amyu amyuVar, Integer num) {
        int i;
        if (this.J == amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN) {
            this.J = amyuVar;
            this.ay = num;
        }
        if (this.I != 3) {
            agrx agrxVar = agso.a;
            new Throwable();
            xys xysVar = this.p;
            ListenableFuture listenableFuture = xysVar.g;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                xysVar.g = null;
            }
            xysVar.f = null;
            boolean zA = ydw.a(this.J, this.ao.l(84, 45419306L, false));
            amyu amyuVar2 = this.J;
            boolean zB = ydw.b(amyuVar2);
            switch (amyuVar2.ordinal()) {
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 7;
                    break;
                case 7:
                    i = 8;
                    break;
                case 8:
                    i = 9;
                    break;
                case 9:
                    i = 10;
                    break;
                case 10:
                    i = 11;
                    break;
                case 11:
                    i = 12;
                    break;
                case 12:
                    i = 13;
                    break;
                case 13:
                    i = 14;
                    break;
                case 14:
                    i = 15;
                    break;
                case 15:
                    i = 16;
                    break;
                case 16:
                    i = 17;
                    break;
                case 17:
                    i = 18;
                    break;
                case 18:
                    i = 19;
                    break;
                case 19:
                    i = 20;
                    break;
                case 20:
                    i = 21;
                    break;
                case 21:
                    i = 22;
                    break;
                case 22:
                    i = 23;
                    break;
                case 23:
                    i = 24;
                    break;
                case 24:
                    i = 25;
                    break;
                case 25:
                    i = 26;
                    break;
                case 26:
                    i = 27;
                    break;
                case 27:
                    i = 28;
                    break;
                case 28:
                    i = 29;
                    break;
                case 29:
                    i = 30;
                    break;
                case 30:
                    i = 31;
                    break;
                case 31:
                    i = 32;
                    break;
                case 32:
                    i = 33;
                    break;
                case 33:
                    i = 34;
                    break;
                case 34:
                    i = 35;
                    break;
                case 35:
                    i = 36;
                    break;
                case 36:
                    i = 37;
                    break;
                case 37:
                    i = 38;
                    break;
                case 38:
                    i = 39;
                    break;
                case 39:
                    i = 40;
                    break;
                case 40:
                    i = 42;
                    break;
                case 41:
                    i = 43;
                    break;
                case 42:
                    i = 44;
                    break;
                case 43:
                    i = 45;
                    break;
                case 44:
                    i = 46;
                    break;
                case 45:
                    i = 47;
                    break;
                case 46:
                default:
                    i = 1;
                    break;
                case 47:
                    i = 49;
                    break;
                case 48:
                    i = 50;
                    break;
                case 49:
                    i = 51;
                    break;
                case 50:
                    i = 52;
                    break;
                case 51:
                    i = 53;
                    break;
            }
            Handler handler = this.F;
            Message messageObtain = Message.obtain(handler, 4, new yak(zA, zB, this.J, i));
            handler.removeMessages(3);
            handler.sendMessage(messageObtain);
        }
    }

    @Override // defpackage.ycr
    public final void p() {
        if (y()) {
            q(xvu.PLAY, xvy.a);
        }
    }

    public final void q(xvu xvuVar, xvy xvyVar) {
        agrx agrxVar = agso.a;
        xls xlsVar = this.am;
        Optional optional = xlsVar.j;
        xdd xddVar = new xdd(xvuVar, 13);
        if (true == optional.isPresent()) {
            ((xur) optional.get()).b((xvu) xddVar.a);
        }
        ape.f(new qzb(xlsVar, xvuVar, xvyVar, 3));
    }

    public final void r(xyv xyvVar, boolean z) {
        String str = this.L.b;
        String str2 = xyvVar.b;
        boolean zEquals = Objects.equals(str2, str);
        if (z) {
            if (zEquals) {
                return;
            }
            this.L = xyvVar;
            if (this.ao.l(89, 45427624L, false)) {
                this.az = "";
                this.aA = "";
            }
            this.M = xyv.a;
            this.h.c(new xyt(xyvVar, 1));
            return;
        }
        if (this.ao.l(89, 45427624L, false)) {
            xyv xyvVar2 = this.L;
            if (xyvVar2.b.isEmpty() && xyvVar2.g.isEmpty() && !str2.isEmpty()) {
                String str3 = xyvVar.g;
                if (!str3.isEmpty()) {
                    this.az = str2;
                    this.aA = str3;
                }
            }
        }
        this.h.c(new xyt(xyvVar, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xzc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s(int i) {
        int i2 = this.I;
        ahno.S(i >= i2 || i2 == 4, "Retrograde MDX session status change (%s => %s)", i2, i);
        if (this.I != i) {
            this.I = i;
            agrx agrxVar = agso.a;
            yaa yaaVar = this.aC;
            int i3 = this.I;
            if (i3 == 1 || i3 == 4) {
                return;
            }
            ?? r5 = yaaVar.a;
            ((ycj) r5).D.c(r5);
        }
    }

    public final void t(xyq xyqVar, amyu amyuVar, int i) {
        agrx agrxVar = agso.a;
        this.k.d(this.e.getString(xyqVar.i, this.t.c));
        o(amyuVar, Integer.valueOf(i));
    }

    @Override // defpackage.ycr
    public final void u() {
        q(xvu.STOP, xvy.a);
    }

    @Override // defpackage.ycr
    public final boolean v() {
        return !TextUtils.isEmpty(this.Q);
    }

    @Override // defpackage.ycr
    public final boolean w() {
        return this.E.isEmpty();
    }

    public final boolean x() {
        vxz vxzVar = this.ao;
        return vxzVar.l(110, 45620291L, false) && vxzVar.l(262, 45847159L, false);
    }

    public final boolean y() {
        return this.I == 2;
    }

    @Override // defpackage.ycr
    public final boolean z(String str) {
        xwb xwbVar = this.u;
        return xwbVar != null && xwbVar.a.d.contains(str);
    }
}
