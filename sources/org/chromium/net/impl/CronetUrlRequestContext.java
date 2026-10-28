package org.chromium.net.impl;

import android.content.Context;
import android.net.Network;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import defpackage.a;
import defpackage.afii;
import defpackage.atvv;
import defpackage.axji;
import defpackage.axjj;
import defpackage.axjt;
import defpackage.axkv;
import defpackage.axlj;
import defpackage.axlk;
import defpackage.axlp;
import defpackage.axlq;
import defpackage.axmj;
import defpackage.axmo;
import defpackage.axmp;
import defpackage.axmq;
import defpackage.axmr;
import defpackage.axmt;
import defpackage.axmw;
import defpackage.axmy;
import defpackage.axne;
import defpackage.axng;
import defpackage.axnh;
import defpackage.axnj;
import defpackage.axnk;
import defpackage.axnl;
import defpackage.axnm;
import defpackage.axno;
import defpackage.axnp;
import defpackage.axok;
import defpackage.axop;
import defpackage.axou;
import defpackage.axov;
import defpackage.axow;
import defpackage.axoz;
import defpackage.axpb;
import defpackage.axpd;
import defpackage.axqd;
import defpackage.axsg;
import defpackage.axsk;
import defpackage.eqf;
import defpackage.ikm;
import defpackage.qx;
import internal.J.N;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.base.JniAndroid;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.VersionSafeProxyOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class CronetUrlRequestContext extends axmw {
    public static final String a = "CronetUrlRequestContext";
    private static final HashSet h = new HashSet();
    private List A;
    private final String B;
    public long c;
    public Thread d;
    public final long e;
    public final axnk f;
    final axmr g;
    private final boolean l;
    private final String w;
    private boolean x;
    private boolean y;
    public final Object b = new Object();
    private final ConditionVariable i = new ConditionVariable(false);
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicInteger k = new AtomicInteger(0);
    private final Object m = new Object();
    private final Object n = new Object();
    private int o = 0;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private final axjj s = new axjj();
    private final axjj t = new axjj();
    private final Map u = new HashMap();
    private final ConditionVariable v = new ConditionVariable();
    private long z = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public CronetUrlRequestContext(axmy axmyVar, long j) {
        int i;
        Object objValueOf;
        axlj axljVar;
        new axjt("CronetUrlRequestContext#CronetUrlRequestContext", 0);
        this.l = axmyVar.o;
        boolean zC = CronetLibraryLoader.c(axmyVar.c);
        axlj axljVar2 = null;
        int i2 = 1;
        if (axmyVar.a() == 1) {
            String str = axmyVar.h;
            this.w = str;
            HashSet hashSet = h;
            synchronized (hashSet) {
                if (!hashSet.add(str)) {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        } else {
            this.w = null;
        }
        VersionSafeProxyOptions versionSafeProxyOptions = axmyVar.p;
        if (versionSafeProxyOptions != null) {
            this.A = versionSafeProxyOptions.createProxyCallbackList();
        }
        axnh axnhVar = axok.q;
        String string = axmyVar.n;
        Context context = JniAndroid.a;
        Map mapD = axlp.a(context, false, axnm.b(context, axnhVar)).d();
        Pattern pattern = axlk.a;
        Iterator it = mapD.entrySet().iterator();
        JSONObject jSONObject = null;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                i2 = i2;
                i = 2;
                if (jSONObject == null) {
                    break;
                }
                string = jSONObject.toString();
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            axlq axlqVar = (axlq) entry.getValue();
            if (str2.startsWith("CronetExperimentalOption_")) {
                Matcher matcher = axlk.a.matcher(str2);
                if (!matcher.matches()) {
                    throw new IllegalArgumentException("Failed to parse experimental options flag override `" + str2 + '`');
                }
                String strGroup = matcher.group(i2);
                String strGroup2 = matcher.group(2);
                int iB = axlqVar.b();
                if (iB == 0) {
                    objValueOf = Boolean.valueOf(axlqVar.f());
                } else if (iB == i2) {
                    objValueOf = Long.valueOf(axlqVar.c());
                } else if (iB == 2) {
                    objValueOf = Double.valueOf(axlqVar.a());
                } else {
                    if (iB != 3) {
                        throw new IllegalArgumentException("Failed to parse experimental options flag override `" + str2 + "`: Bytes values are not supported");
                    }
                    objValueOf = axlqVar.d();
                }
                axljVar = new axlj(strGroup, strGroup2, objValueOf);
            } else {
                axljVar = axljVar2;
                i = 2;
            }
            if (axljVar != null) {
                if (jSONObject == null) {
                    if (string == null || string.isEmpty()) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            Log.w("cn_ExpOptionsFlags", "Failed to parse base experimental options JSON", e);
                            jSONObject = null;
                        }
                    }
                    if (jSONObject == null) {
                        break;
                    }
                }
                try {
                    if (!jSONObject.has((String) axljVar.b)) {
                        jSONObject.put((String) axljVar.b, new JSONObject());
                    }
                    jSONObject.getJSONObject((String) axljVar.b).put((String) axljVar.c, axljVar.a);
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Failed to apply experimental options flag override for section `" + ((String) axljVar.b) + "`, option `" + ((String) axljVar.c) + '`', e2);
                }
            }
            i2 = i2;
            axljVar2 = null;
        }
        this.B = string;
        synchronized (this.b) {
            new axjt("CronetUrlRequestContext#CronetUrlRequestContext creating adapter", 0);
            Context context2 = JniAndroid.a;
            Map mapD2 = axlp.a(context2, false, axnm.b(context2, axok.q)).d();
            axlq axlqVar2 = (axlq) mapD2.get("Cronet_override_network_thread_priority");
            axlq axlqVar3 = (axlq) mapD2.get("Cronet_always_enable_brotli");
            boolean zF = axlqVar3 != null ? axlqVar3.f() : false;
            axqd axqdVarI = axpd.DEFAULT_INSTANCE.i();
            boolean z = axmyVar.i;
            axqdVarI.f();
            axpd axpdVar = (axpd) axqdVarI.b;
            axpdVar.bitField0_ |= 4;
            axpdVar.quicEnabled_ = z;
            boolean z2 = axmyVar.j;
            axqdVarI.f();
            axpd axpdVar2 = (axpd) axqdVarI.b;
            axpdVar2.bitField0_ |= 16;
            axpdVar2.http2Enabled_ = z2;
            boolean z3 = (zF || axmyVar.k) ? i2 : 0;
            axqdVarI.f();
            axpd axpdVar3 = (axpd) axqdVarI.b;
            axpdVar3.bitField0_ |= 32;
            axpdVar3.brotliEnabled_ = z3;
            boolean z4 = !axmyVar.l.f;
            axqdVarI.f();
            axpd axpdVar4 = (axpd) axqdVarI.b;
            axpdVar4.bitField0_ |= 64;
            axpdVar4.disableCache_ = z4;
            int iA = axmyVar.a();
            axqdVarI.f();
            axpd axpdVar5 = (axpd) axqdVarI.b;
            axpdVar5.bitField0_ |= SemanticState.Focused;
            axpdVar5.httpCacheMode_ = iA;
            long j2 = axmyVar.m;
            axqdVarI.f();
            axpd axpdVar6 = (axpd) axqdVarI.b;
            axpdVar6.bitField0_ |= SemanticState.Hidden;
            axpdVar6.httpCacheMaxSize_ = j2;
            axqdVarI.f();
            axpd axpdVar7 = (axpd) axqdVarI.b;
            axpdVar7.bitField0_ |= SemanticState.ReadOnly;
            axpdVar7.mockCertVerifier_ = 0L;
            boolean z5 = axmyVar.o;
            axqdVarI.f();
            axpd axpdVar8 = (axpd) axqdVarI.b;
            axpdVar8.bitField0_ |= SemanticState.Modal;
            axpdVar8.enableNetworkQualityEstimator_ = z5;
            boolean z6 = axmyVar.f;
            axqdVarI.f();
            axpd axpdVar9 = (axpd) axqdVarI.b;
            axpdVar9.bitField0_ |= SemanticState.Obscured;
            axpdVar9.bypassPublicKeyPinningForLocalTrustAnchors_ = z6;
            int iC = axlqVar2 != null ? (int) axlqVar2.c() : 0;
            axqdVarI.f();
            axpd axpdVar10 = (axpd) axqdVarI.b;
            axpdVar10.bitField0_ |= SemanticState.Multiline;
            axpdVar10.networkThreadPriority_ = iC;
            VersionSafeProxyOptions versionSafeProxyOptions2 = axmyVar.p;
            if (versionSafeProxyOptions2 != null) {
                axpb axpbVarCreateProxyOptionsProto = versionSafeProxyOptions2.createProxyOptionsProto();
                axqdVarI.f();
                axpd axpdVar11 = (axpd) axqdVarI.b;
                axpbVarCreateProxyOptionsProto.getClass();
                axpdVar11.proxyOptions_ = axpbVarCreateProxyOptionsProto;
                axpdVar11.bitField0_ |= 16384;
            }
            String str3 = axmyVar.g;
            if (str3 != null) {
                axqdVarI.f();
                axpd axpdVar12 = (axpd) axqdVarI.b;
                axpdVar12.bitField0_ |= 1;
                axpdVar12.userAgent_ = str3;
            }
            String str4 = axmyVar.h;
            if (str4 != null) {
                axqdVarI.f();
                axpd axpdVar13 = (axpd) axqdVarI.b;
                axpdVar13.bitField0_ |= i;
                axpdVar13.storagePath_ = str4;
            }
            axmyVar.b();
            String strB = axmyVar.b();
            axqdVarI.f();
            axpd axpdVar14 = (axpd) axqdVarI.b;
            axpdVar14.bitField0_ |= 8;
            axpdVar14.quicDefaultUserAgentId_ = strB;
            if (string != null) {
                axqdVarI.f();
                axpd axpdVar15 = (axpd) axqdVarI.b;
                axpdVar15.bitField0_ |= SemanticState.LiveRegion;
                axpdVar15.experimentalOptions_ = string;
            }
            long jMB3ntV7V = N.MB3ntV7V(((axpd) axqdVarI.c()).d());
            if (jMB3ntV7V == 0) {
                throw new IllegalArgumentException("Experimental options parsing failed.");
            }
            for (qx qxVar : axmyVar.d) {
                N.MyRIv1Ij(jMB3ntV7V, qxVar.c, qxVar.a, qxVar.b);
            }
            for (eqf eqfVar : axmyVar.e) {
                long j3 = jMB3ntV7V;
                N.Muq3ic6p(j3, eqfVar.d, eqfVar.c, eqfVar.a, ((Date) eqfVar.b).getTime());
                jMB3ntV7V = j3;
            }
            long jM135Cu0D = N.M135Cu0D(jMB3ntV7V);
            this.c = jM135Cu0D;
            if (jM135Cu0D == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        axnk axnkVarA = axnl.a(axmyVar.c, axnhVar);
        this.f = axnkVarA;
        long jA = axnkVarA.a();
        this.e = jA;
        axne axneVarC = axmyVar.c();
        try {
            axnkVarA.e(jA, axneVarC, new axnj(getVersionString().split("/")[i2].split("@")[0]), axnhVar);
        } catch (RuntimeException unused) {
        }
        axnp axnpVar = zC ? new axnp(this.f, axneVarC.h, j) : null;
        CronetLibraryLoader.b(new afii(this, axnpVar, 11));
        if (axnpVar != null) {
            int iA2 = axnpVar.a();
            synchronized (axnpVar.c) {
                ((axng) axnpVar.c).b = iA2;
                axnpVar.b();
            }
        }
        this.g = new axmr(axmyVar.c, this.f);
    }

    private final void h() {
        if (!j()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private static void i(Executor executor, Runnable runnable, String str) {
        executor.execute(new axmt(str, runnable, 4));
    }

    private final void initNetworkThread() {
        this.d = Thread.currentThread();
        this.i.open();
    }

    private final boolean j() {
        return this.c != 0;
    }

    private static void k(Executor executor, Runnable runnable, axkv axkvVar, String str) {
        axkv axkvVar2;
        new axjt("CronetUrlRequestContext#postObservationTaskToExecutor ".concat(str), 0);
        if (axkvVar != null) {
            axkvVar.c();
        }
        try {
            axkvVar2 = axkvVar;
            try {
                executor.execute(new atvv(str, runnable, axkvVar2, 7, (byte[]) null));
            } catch (RejectedExecutionException e) {
                e = e;
                RejectedExecutionException rejectedExecutionException = e;
                if (axkvVar2 != null) {
                    axkvVar2.b();
                }
                Log.e("cn_".concat(String.valueOf(a)), "Exception posting task to executor", rejectedExecutionException);
            }
        } catch (RejectedExecutionException e2) {
            e = e2;
            axkvVar2 = axkvVar;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final void onBeforeTunnelRequest(int i, ProxyCallbackRequestImpl proxyCallbackRequestImpl) {
        new axjt("CronetUrlRequestContext#onBeforeTunnelRequest", 0);
        axoz axozVar = (axoz) this.A.get(i);
        i(axozVar.b, new axmt(axozVar, proxyCallbackRequestImpl, 3), "onBeforeTunnelRequest");
    }

    private final void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.m) {
            this.o = i;
        }
    }

    private final void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.m) {
            this.p = i;
            this.q = i2;
            this.r = i3;
        }
    }

    private final void onRttObservation(int i, long j, int i2) {
        synchronized (this.m) {
            axji axjiVar = new axji(this.s);
            while (axjiVar.hasNext()) {
                axou axouVar = (axou) axjiVar.next();
                int i3 = i;
                long j2 = j;
                int i4 = i2;
                k(axouVar.getExecutor(), new axno(axouVar, i3, j2, i4, 0), null, "onRttObservation");
                i = i3;
                j = j2;
                i2 = i4;
            }
        }
    }

    private final void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.m) {
            axji axjiVar = new axji(this.t);
            while (axjiVar.hasNext()) {
                axov axovVar = (axov) axjiVar.next();
                int i3 = i;
                long j2 = j;
                int i4 = i2;
                k(axovVar.getExecutor(), new axno(axovVar, i3, j2, i4, 2), null, "onThroughputObservation");
                i = i3;
                j = j2;
                i2 = i4;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final void onTunnelHeadersReceived(int i, String[] strArr, int i2, CompletionOnceCallback completionOnceCallback) {
        new axjt("CronetUrlRequestContext#onTunnelHeadersReceived", 0);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
            arrayList.add(new Pair(strArr[i3], strArr[i3 + 1]));
        }
        axoz axozVar = (axoz) this.A.get(i);
        i(axozVar.b, new ikm(completionOnceCallback, axozVar, arrayList, i2, 7), "onTunnelHeadersReceived");
    }

    /* JADX WARN: Code duplicated, block: B:69:0x011a  */
    @Override // defpackage.axmw
    protected final ExperimentalBidirectionalStream a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) throws Throwable {
        String str3;
        URI uriCreate;
        axmp axmpVar;
        axmo axmoVar;
        Object obj;
        Long lValueOf;
        axmp axmpVar2;
        long j2 = j == -1 ? this.z : j;
        synchronized (this.b) {
            try {
                try {
                    h();
                    axmr axmrVar = this.g;
                    new axjt("CronetAdaptiveRequestContext#getUriIfAdaptive", 0);
                    if (!axmrVar.i) {
                        String[] strArr = axmrVar.d;
                        int length = strArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                str3 = str;
                                uriCreate = null;
                                break;
                            }
                            String str4 = strArr[i4];
                            if (!str4.isEmpty()) {
                                str3 = str;
                                if (str3.startsWith(str4)) {
                                    URI uriCreate2 = URI.create(str3);
                                    if (axmrVar.e.contains(uriCreate2.getPath())) {
                                        uriCreate = uriCreate2;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i4++;
                        }
                    } else {
                        str3 = str;
                        uriCreate = URI.create(str);
                    }
                    if (uriCreate != null) {
                        axmr axmrVar2 = this.g;
                        if (axmrVar2.h) {
                            new axjt("CronetAdaptiveRequestContext#computeStreamNetworkHandles", 0);
                            Network[] allNetworks = axmrVar2.n.getAllNetworks(null);
                            Network defaultNetwork = axmrVar2.n.getDefaultNetwork();
                            String host = uriCreate.getHost();
                            Map map = axmrVar2.k;
                            axmq axmqVar = (axmq) map.get(host);
                            if (axmqVar != null) {
                                JniAndroid jniAndroid = axmrVar2.o;
                                if (SystemClock.elapsedRealtime() < axmqVar.a) {
                                    int length2 = allNetworks.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < length2) {
                                            long networkHandle = allNetworks[i5].getNetworkHandle();
                                            obj = axmqVar.b;
                                            if (networkHandle != ((Long) obj).longValue()) {
                                                i5++;
                                            }
                                        }
                                    }
                                }
                                map.remove(host);
                                obj = null;
                            } else {
                                obj = null;
                            }
                            boolean z4 = (obj == null || ((Long) obj).longValue() == j2) ? false : true;
                            axnk axnkVar = axmrVar2.c;
                            axnh axnhVar = axok.q;
                            int length3 = allNetworks.length;
                            axnkVar.b(axnhVar, length3, defaultNetwork != null, z4);
                            if (z4) {
                                axmpVar2 = new axmp(((Long) obj).longValue(), j2);
                            } else {
                                int i6 = 0;
                                while (true) {
                                    if (i6 < length3) {
                                        Network network = allNetworks[i6];
                                        if (network != null && !network.equals(defaultNetwork)) {
                                            lValueOf = Long.valueOf(network.getNetworkHandle());
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        lValueOf = null;
                                        break;
                                    }
                                }
                                if (lValueOf != null && lValueOf.longValue() == j2) {
                                    lValueOf = null;
                                }
                                if (lValueOf != null) {
                                    axmpVar2 = new axmp(j2, lValueOf.longValue());
                                } else {
                                    axmpVar = null;
                                }
                            }
                            axmpVar = axmpVar2;
                        } else {
                            axmpVar = null;
                        }
                    } else {
                        axmpVar = null;
                    }
                    if (axmpVar != null) {
                        axmr axmrVar3 = this.g;
                        AtomicReference atomicReference = axmrVar3.m;
                        if (atomicReference.get() == null) {
                            a.ap(atomicReference, Executors.newSingleThreadScheduledExecutor());
                        }
                        axmoVar = new axmo(callback, (ScheduledExecutorService) atomicReference.get(), axmrVar3, uriCreate, this.f, axmrVar3.f.contains(uriCreate.getPath()));
                    } else {
                        axmoVar = null;
                    }
                    BidirectionalStream.Callback callback2 = axmoVar != null ? axmoVar.o : callback;
                    if (axmpVar != null) {
                        j2 = axmpVar.a;
                    }
                    axmp axmpVar3 = axmpVar;
                    axmo axmoVar2 = axmoVar;
                    CronetBidirectionalStream cronetBidirectionalStream = new CronetBidirectionalStream(this, str3, i, callback2, executor, str2, list, z, collection, z2, i2, z3, i3, j2, uriCreate != null);
                    if (axmoVar2 == null) {
                        return cronetBidirectionalStream;
                    }
                    axmoVar2.d = new CronetBidirectionalStream(this, str, i, axmoVar2.o, executor, str2, list, z, collection, z2, i2, z3, i3, axmpVar3.b, true);
                    axmoVar2.b = cronetBidirectionalStream;
                    return axmoVar2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.n) {
            this.u.put(listener, new axow(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            if (this.s.b()) {
                synchronized (this.b) {
                    try {
                        h();
                        N.MpnFLFF2(this.c, true);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.s.d(new axou(networkQualityRttListener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            if (this.t.b()) {
                synchronized (this.b) {
                    try {
                        h();
                        N.MnPUhNKP(this.c, true);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.t.d(new axov(networkQualityThroughputListener));
        }
    }

    @Override // defpackage.axmw
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) throws Throwable {
        long j2 = j == -1 ? this.z : j;
        synchronized (this.b) {
            try {
                try {
                    h();
                    return new CronetUrlRequest(this, str, i, callback, executor, collection, z, z2, z3, z4, i2, z5, i3, listener, i4, j2, str2, arrayList, uploadDataProvider, executor2, bArr, byteBuffer, str3);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.z = j;
    }

    public final long c() {
        long j;
        synchronized (this.b) {
            h();
            j = this.c;
        }
        return j;
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.b) {
            h();
            N.M6sIJDgy_ForTesting(this.c, z, z2, z3);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new axsk(this);
    }

    final void d() {
        this.j.decrementAndGet();
    }

    public final void e() {
        this.k.decrementAndGet();
    }

    final void f() {
        this.k.incrementAndGet();
        this.j.incrementAndGet();
    }

    final void g(RequestFinishedInfo requestFinishedInfo, axkv axkvVar, axow axowVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.n) {
            arrayList.addAll(this.u.values());
        }
        if (axowVar != null) {
            arrayList.add(axowVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            axow axowVar2 = (axow) arrayList.get(i);
            k(axowVar2.getExecutor(), new axmt(axowVar2, requestFinishedInfo, 5), axkvVar, "reportRequestFinished");
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.k.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        int i;
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            i = this.r;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        int i;
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            int i2 = this.o;
            if (i2 != 0) {
                i = 1;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        i = 3;
                        if (i2 != 3) {
                            i = 4;
                            if (i2 != 4) {
                                i = 5;
                                if (i2 != 5) {
                                    throw new RuntimeException(a.bR(i2, "Internal Error: Illegal EffectiveConnectionType value "));
                                }
                            }
                        }
                    }
                }
            } else {
                i = 0;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        int i;
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            i = this.p;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        int i;
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            i = this.q;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "Cronet/".concat(ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // defpackage.axmw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new axmj(str, callback, executor, this);
    }

    @Override // defpackage.axmw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new axop(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new axsg(url, this);
        }
        throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.n) {
            this.u.remove(listener);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            axjj axjjVar = this.s;
            if (axjjVar.c(new axou(networkQualityRttListener)) && axjjVar.b()) {
                synchronized (this.b) {
                    try {
                        h();
                        N.MpnFLFF2(this.c, false);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            axjj axjjVar = this.t;
            if (axjjVar.c(new axov(networkQualityThroughputListener)) && axjjVar.b()) {
                synchronized (this.b) {
                    try {
                        h();
                        N.MnPUhNKP(this.c, false);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        new axjt("CronetUrlRequestContext#shutdown", 0);
        String str = this.w;
        if (str != null) {
            HashSet hashSet = h;
            synchronized (hashSet) {
                hashSet.remove(str);
            }
        }
        synchronized (this.b) {
            h();
            if (this.j.get() != 0) {
                throw new IllegalStateException("Cannot shutdown with running requests.");
            }
            if (Thread.currentThread() == this.d) {
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.i.block();
        Object obj = this.b;
        synchronized (obj) {
            h();
            if (this.x && !this.y) {
                N.MKFm_qQ7(this.c);
                this.y = true;
                ConditionVariable conditionVariable = this.v;
                conditionVariable.block();
                conditionVariable.close();
                synchronized (obj) {
                    this.y = false;
                    this.x = false;
                }
            }
        }
        synchronized (this.b) {
            if (j()) {
                N.MeBvNXm5(this.c);
                this.c = 0L;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
        synchronized (this.b) {
            h();
            if (this.x) {
                return;
            }
            N.MTULt02u(this.c, str, z, i);
            this.x = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        synchronized (this.b) {
            h();
            if (this.x) {
                return;
            }
            if (!N.MgwJQAH1(this.c, str, z)) {
                throw new RuntimeException("Unable to start NetLog");
            }
            this.x = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
        Object obj = this.b;
        synchronized (obj) {
            h();
            if (!this.x || this.y) {
                return;
            }
            N.MKFm_qQ7(this.c);
            this.y = true;
            ConditionVariable conditionVariable = this.v;
            conditionVariable.block();
            conditionVariable.close();
            synchronized (obj) {
                this.y = false;
                this.x = false;
            }
        }
    }

    public final void stopNetLogCompleted() {
        this.v.open();
    }

    @Override // defpackage.axmw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new axmj(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }
}
