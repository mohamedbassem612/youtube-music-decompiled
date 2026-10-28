package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xls {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/browserchannel/CloudChannel");
    private agfr A;
    private agfr B;
    private Future C;
    private final aunn D;
    public final mbc b;
    public agfr c;
    public Future d;
    public xmb h;
    public ycv i;
    public int m;
    public ycu s;
    public yah t;
    public final vxz u;
    public final aczl w;
    private final Context x;
    private final ScheduledExecutorService y;
    private final int z;
    public final Object e = new Object();
    public final Deque f = new ConcurrentLinkedDeque();
    public final Object g = new Object();
    public Optional j = Optional.empty();
    protected int k = 0;
    public final Object l = new Object();
    public final Object n = new Object();
    public int o = 0;
    public final Object p = new Object();
    public boolean q = false;
    public final Object r = new Object();
    final xxj v = new xxj(this);

    public xls(Context context, aczl aczlVar, ScheduledExecutorService scheduledExecutorService, mbc mbcVar, aunn aunnVar, vxu vxuVar, vxz vxzVar, Optional optional) {
        this.A = aguu.al(new cln(9));
        this.B = aguu.al(new cln(10));
        this.c = aguu.al(new cln(11));
        context.getClass();
        this.x = context;
        aczlVar.getClass();
        this.w = aczlVar;
        this.y = scheduledExecutorService;
        this.b = mbcVar;
        amya amyaVar = vxuVar.c().m;
        int i = (amyaVar == null ? amya.a : amyaVar).x;
        this.z = i <= 0 ? 15 : i;
        this.D = aunnVar;
        this.u = vxzVar;
        optional.isPresent();
        optional.isPresent();
        this.A = (agfr) optional.orElse(this.A);
        optional.isPresent();
        optional.isPresent();
        this.B = (agfr) optional.orElse(this.B);
        optional.isPresent();
        optional.isPresent();
        this.c = (agfr) optional.orElse(this.c);
    }

    public final int a() {
        int i;
        synchronized (this.l) {
            i = this.k;
        }
        return i;
    }

    public final void b() {
        synchronized (this.n) {
            this.m = 0;
        }
        synchronized (this.l) {
            final int i = this.k;
            if (i == 1) {
                agrx agrxVar = agso.a;
                return;
            }
            agrx agrxVar2 = agso.a;
            this.k = 1;
            Future future = this.C;
            if (future != null && !future.isDone()) {
                this.C.cancel(true);
            }
            this.C = ((ExecutorService) this.B.io()).submit(afwl.i(new Runnable() { // from class: xlq
                /* JADX WARN: Type inference failed for: r10v2, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v2, types: [awmd, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    final xls xlsVar = this.a;
                    synchronized (xlsVar.r) {
                        xlsVar.q = false;
                    }
                    if (i == 2) {
                        agrx agrxVar3 = agso.a;
                        xlsVar.d(false, "MDX_CLIENT_BROWSER_CHANNEL_DISCONNECT_REASON_CANCELLED", Optional.empty());
                    }
                    agrx agrxVar4 = agso.a;
                    try {
                        aczl aczlVar = xlsVar.w;
                        ycv ycvVar = xlsVar.i;
                        HashMap map = new HashMap();
                        String str2 = ycvVar.g;
                        ?? r6 = aczlVar.c;
                        xvh xvhVar = ycvVar.d;
                        HashMap map2 = new HashMap((Map) aczlVar.f.io());
                        map2.put("magmaKey", ycvVar.f);
                        HashSet hashSet = new HashSet();
                        Object obj = aczlVar.a;
                        if (((vxz) obj).l(40, 45383016L, false)) {
                            hashSet.add("cl");
                        }
                        String strJoin = hashSet.isEmpty() ? "" : TextUtils.join(",", hashSet);
                        if (strJoin != null) {
                            map2.put("crt", strJoin);
                        }
                        if (ycvVar.a()) {
                            if (!aczlVar.l(ycvVar)) {
                                map2.put("method", ycvVar.a.aA);
                            }
                            String str3 = true == aczlVar.l(ycvVar) ? "connectParams" : "params";
                            if (ycvVar.b()) {
                                map2.put(str3, ycw.a(ycvVar.b).toString());
                            }
                        }
                        if (ycvVar.e) {
                            map2.put("ui", "");
                        }
                        xvv xvvVar = ycvVar.c;
                        if (xvvVar != null) {
                            int i2 = xvvVar.b;
                            if (i2 == 4) {
                                str = "cast";
                            } else if (xvvVar.a) {
                                str = "in_app_dial";
                            } else {
                                str = (i2 == 3 || i2 == 2) ? "dial" : "manual";
                            }
                            map2.put("pairing_type", str);
                        }
                        if (((vxz) obj).l(10, 45360224L, false)) {
                            map2.put("enableServerVerifiedSessionDeletion", "true");
                        }
                        if (((vxz) obj).l(164, 45673420L, false) && !ycvVar.a()) {
                            map2.put("requirePlaybackCheck", "true");
                        }
                        xlsVar.h = new xly(str2, r6, xvhVar, map2, map, (tft) aczlVar.e, (tft) aczlVar.d, ((amya) aczlVar.g).o, (vxz) aczlVar.b);
                        xmb xmbVar = xlsVar.h;
                        ((xly) xmbVar).c.a = new xma(xmbVar, xlsVar.v);
                        xmb xmbVar2 = xlsVar.h;
                        xlv xlvVar = new xlv();
                        ((xly) xmbVar2).b(((xly) xmbVar2).e, xlvVar);
                        ((xly) xmbVar2).l = false;
                        IOException iOException = xlvVar.b;
                        if (iOException != null) {
                            throw iOException;
                        }
                        int i3 = xlvVar.a;
                        if (((xly) xmbVar2).f && i3 == 401) {
                            throw xme.a(xlvVar.c);
                        }
                        xln xlnVar = ((xly) xmbVar2).c;
                        xln.a(i3);
                        if (i3 == 200) {
                            xlnVar.b(xlvVar.c.toCharArray());
                        }
                        synchronized (xlsVar.l) {
                            try {
                                xlsVar.k = 2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        synchronized (xlsVar.p) {
                            xlsVar.o = 0;
                        }
                        synchronized (xlsVar.e) {
                            xlsVar.d = ((ExecutorService) xlsVar.c.io()).submit(afwl.i(new Runnable() { // from class: xlp
                                /* JADX WARN: Bottom block not found for handler: all -> 0x017f */
                                /* JADX WARN: Code duplicated, block: B:59:0x016b A[Catch: all -> 0x017a, TryCatch #6 {all -> 0x017a, blocks: (B:57:0x0167, B:59:0x016b, B:61:0x016f, B:64:0x0175), top: B:77:0x0167, outer: #10 }] */
                                /* JADX WARN: Code duplicated, block: B:64:0x0175 A[Catch: all -> 0x017a, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x017a, blocks: (B:57:0x0167, B:59:0x016b, B:61:0x016f, B:64:0x0175), top: B:77:0x0167, outer: #10 }] */
                                /* JADX WARN: Code duplicated, block: B:77:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:81:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void run() {
                                    /*
                                        Method dump skipped, instruction units count: 386
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.xlp.run():void");
                                }
                            }));
                        }
                        synchronized (xlsVar.l) {
                            if (xlsVar.k == 2) {
                                xlsVar.g();
                            }
                        }
                    } catch (xme e) {
                        agru agruVarI = xls.a.b().i(agso.a, "MDX.CloudChannel");
                        ydd yddVar = e.a;
                        ((agrc) ((agrc) ((agrc) agruVarI).j(e)).k("com/google/android/libraries/youtube/mdx/browserchannel/CloudChannel", "asyncConnectInternal", (char) 255, "CloudChannel.java")).w("Unauthorized error received on bind: %s", yddVar);
                        int iOrdinal = yddVar.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                            xlsVar.e(amyu.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                        } else if (iOrdinal == 3) {
                            xlsVar.h.a();
                            xlsVar.h();
                        }
                    } catch (xmf e2) {
                        agrc agrcVar = (agrc) ((agrc) ((agrc) xls.a.b().i(agso.a, "MDX.CloudChannel")).j(e2)).k("com/google/android/libraries/youtube/mdx/browserchannel/CloudChannel", "asyncConnectInternal", 275, "CloudChannel.java");
                        int i4 = e2.b;
                        agrcVar.u("Unexpected response when binding channel: %d", i4);
                        if (i4 == 401) {
                            xlsVar.e(amyu.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                        } else if (i4 != 403) {
                            xlsVar.h();
                        } else {
                            xlsVar.e(amyu.MDX_SESSION_DISCONNECT_REASON_BROWSER_CHANNEL_ERROR);
                        }
                    } catch (Exception e3) {
                        ((agrc) ((agrc) ((agrc) xls.a.b().i(agso.a, "MDX.CloudChannel")).j(e3)).k("com/google/android/libraries/youtube/mdx/browserchannel/CloudChannel", "asyncConnectInternal", (char) 297, "CloudChannel.java")).t("Error connecting to Remote Control server:");
                        xlsVar.h();
                    }
                }
            }));
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.g) {
            while (true) {
                xlr xlrVar = (xlr) this.f.pollFirst();
                if (xlrVar == null) {
                    break;
                } else {
                    arrayList.add(xlrVar.e);
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aqi) arrayList.get(i)).b(ydc.c);
        }
    }

    public final void d(boolean z, String str, Optional optional) {
        synchronized (this.e) {
            Future future = this.d;
            if (future != null && !future.isDone()) {
                this.d.cancel(true);
                this.d = null;
            }
        }
        xmb xmbVar = this.h;
        HashMap map = new HashMap();
        map.put("TYPE", "terminate");
        if (!TextUtils.isEmpty(str)) {
            map.put("clientDisconnectReason", str);
            if (z) {
                map.put("ui", "");
            }
            if (optional.isPresent()) {
                map.put("disconnectBehavior", optional.get());
            }
        }
        try {
            ((xly) xmbVar).b(map, new xoa(1));
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) xly.a.b().i(agso.a, "MDX.browserchannel")).j(e)).k("com/google/android/libraries/youtube/mdx/browserchannel/HttpClientBrowserChannelClient", "close", (char) 187, "HttpClientBrowserChannelClient.java")).t("Terminate request failed");
        }
        ((xly) xmbVar).g = null;
    }

    final void e(amyu amyuVar) {
        f(amyuVar, ydw.a(amyuVar, this.u.l(84, 45419306L, false)), false, Optional.empty());
    }

    public final void f(amyu amyuVar, boolean z, boolean z2, Optional optional) {
        synchronized (this.r) {
            agrx agrxVar = agso.a;
            this.q = true;
        }
        c();
        synchronized (this.l) {
            if (this.k == 2) {
                d(z, amyuVar.name(), optional);
            }
            this.k = 0;
        }
        ycu ycuVar = this.s;
        if (ycuVar != null) {
            yam yamVar = (yam) ycuVar;
            if (yamVar.I != 3 && !z2) {
                yamVar.o(amyuVar, null);
            }
        }
        this.t = null;
        this.s = null;
    }

    public final void g() {
        ((ExecutorService) this.A.io()).submit(afwl.i(new Runnable() { // from class: xlo
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                String str;
                xls xlsVar = this.a;
                synchronized (xlsVar.g) {
                    xlr xlrVar = (xlr) xlsVar.f.pollFirst();
                    if (xlrVar == null) {
                        return;
                    }
                    try {
                        if (xlsVar.b.f().isAfter(xlrVar.d.plus(xlr.a))) {
                            xlrVar.e.b(ydc.d);
                            agrx agrxVar = agso.a;
                            xlr.a.toMillis();
                        } else {
                            synchronized (xlsVar.l) {
                                i = xlsVar.k;
                            }
                            if (i == 1) {
                                agrx agrxVar2 = agso.a;
                                xlsVar.f.offerFirst(xlrVar);
                            } else if (i != 2) {
                                agrx agrxVar3 = agso.a;
                                xlrVar.e.b(ydc.c);
                                xlsVar.c();
                            } else {
                                agrx agrxVar4 = agso.a;
                                try {
                                    xmb xmbVar = xlsVar.h;
                                    xvu xvuVar = xlrVar.b;
                                    xvy xvyVar = xlrVar.c;
                                    xlx xlxVar = new xlx();
                                    int i2 = ((xly) xmbVar).j;
                                    ((xly) xmbVar).j = i2 + 1;
                                    HashMap map = new HashMap();
                                    map.put("count", "1");
                                    map.put(String.format("req%s__sc", String.valueOf(i2)), xvuVar.aA);
                                    xvw xvwVar = new xvw(xvyVar);
                                    while (xvwVar.hasNext()) {
                                        xvx next = xvwVar.next();
                                        map.put(String.format("req%s_%s", String.valueOf(i2), next.a), next.b);
                                    }
                                    ((xly) xmbVar).b(map, xlxVar);
                                    ((xly) xmbVar).l = false;
                                    if (((xly) xmbVar).f && xlxVar.a == 401 && (str = xlxVar.c) != null) {
                                        xme xmeVarA = xme.a(str);
                                        int iOrdinal = xmeVarA.a.ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            throw xmeVarA;
                                        }
                                        if (iOrdinal == 3) {
                                            ((xly) xmbVar).a();
                                        }
                                    }
                                    if (xlxVar.a == 200) {
                                        synchronized (xlsVar.n) {
                                            try {
                                                xlsVar.m = 0;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        xlrVar.e.b(ydc.b);
                                    } else {
                                        xlsVar.f.offerFirst(xlrVar);
                                        synchronized (xlsVar.n) {
                                            try {
                                                int i3 = xlsVar.m + 1;
                                                xlsVar.m = i3;
                                                if (i3 >= 2) {
                                                    xlsVar.h();
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                } catch (xme e) {
                                    ydd yddVar = e.a;
                                    int iOrdinal2 = yddVar.ordinal();
                                    if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                                        ((agrc) ((agrc) ((agrc) xls.a.b().i(agso.a, "MDX.CloudChannel")).j(e)).k("com/google/android/libraries/youtube/mdx/browserchannel/CloudChannel", "sendMessage", 567, "CloudChannel.java")).w("Unauthorized error received on send message, disconnecting: %s", yddVar);
                                        xlsVar.e(amyu.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                                    } else {
                                        ((agrc) ((agrc) ((agrc) xls.a.b().i(agso.a, "MDX.CloudChannel")).j(e)).k("com/google/android/libraries/youtube/mdx/browserchannel/CloudChannel", "sendMessage", 578, "CloudChannel.java")).w("Unexpected UnauthorizedErrorException on send message that shouldn't happen: %s", yddVar);
                                    }
                                    xlrVar.e.b(new ydb(yddVar));
                                } catch (Exception e2) {
                                    ((agrc) ((agrc) ((agrc) xls.a.b().i(agso.a, "MDX.CloudChannel")).j(e2)).k("com/google/android/libraries/youtube/mdx/browserchannel/CloudChannel", "sendMessage", (char) 586, "CloudChannel.java")).w("Exception while sending message: %s", xlrVar);
                                    xlrVar.e.d(e2);
                                }
                            }
                        }
                        xlsVar.g();
                    } catch (Throwable th3) {
                        xlsVar.g();
                        throw th3;
                    }
                }
            }
        }));
    }

    public final void h() {
        agrx agrxVar = agso.a;
        synchronized (this.l) {
            this.k = 0;
            d(false, "MDX_CLIENT_BROWSER_CHANNEL_DISCONNECT_REASON_RECONNECT", Optional.empty());
        }
        synchronized (this.r) {
            if (this.q) {
                return;
            }
            if (!((tfq) this.D.io()).i()) {
                this.x.sendBroadcast(xvf.h.a());
                return;
            }
            synchronized (this.p) {
                if (this.o >= this.z) {
                    ((agrc) ((agrc) a.b().i(agso.a, "MDX.CloudChannel")).k("com/google/android/libraries/youtube/mdx/browserchannel/CloudChannel", "scheduleReconnect", 448, "CloudChannel.java")).t("Reconnect Scheduler: Reconnecting for too long, abort");
                    this.x.sendBroadcast(xvf.l.a());
                    this.o = 0;
                } else {
                    double dRandom = Math.random() * 1000.0d;
                    int i = this.o;
                    this.o = i + 1;
                    this.y.schedule(new xfd(this, 8), (long) Math.scalb(((int) dRandom) + 2000, i), TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @tcc
    public void handleSignInFlow(rqg rqgVar) {
        if (rqgVar.a == rqf.b) {
            h();
        }
    }
}
