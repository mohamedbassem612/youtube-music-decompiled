package defpackage;

import android.content.Context;
import android.media.MediaDrm;
import android.os.Handler;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zah {
    public final List a;
    public volatile Handler b;
    public volatile ckd c;
    private final zjr d;
    private AtomicInteger e;
    private volatile boolean f;
    private zlo g;
    private final Random h;
    private final Context i;
    private final ahey j;
    private final xeu k;
    private final HashMap l;
    private final aaqc m;

    public zah(aaqc aaqcVar, HashMap map, Context context, ahey aheyVar, xeu xeuVar, zjr zjrVar) {
        Random random = new Random();
        this.g = zlo.NONE;
        this.m = aaqcVar;
        this.l = map;
        this.h = random;
        this.d = zjrVar;
        this.k = xeuVar;
        this.i = context;
        this.j = aheyVar;
        this.a = new ArrayList();
    }

    private static final boolean i(int i, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities, aioy aioyVar) {
        int i2 = i - 1;
        if (i2 == 16 ? (mediaCapabilitiesOuterClass$MediaCapabilities.e & 2) != 0 : !(i2 != 18 || (mediaCapabilitiesOuterClass$MediaCapabilities.e & 1) == 0)) {
            for (jro jroVar : mediaCapabilitiesOuterClass$MediaCapabilities.c) {
                aioy aioyVarA = aioy.a(jroVar.c);
                if (aioyVarA == null) {
                    aioyVarA = aioy.UNKNOWN_CODEC;
                }
                if (aioyVarA == aioyVar && jroVar.j) {
                    return true;
                }
            }
        }
        return false;
    }

    final synchronized int a() {
        int iA;
        if (this.c == null) {
            return -1;
        }
        AtomicInteger atomicInteger = this.e;
        if (atomicInteger != null) {
            iA = atomicInteger.get();
        } else {
            iA = yvq.a(this.c);
            this.e = new AtomicInteger(iA);
        }
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    final synchronized cjz b(yvh yvhVar, yvj yvjVar, String str, wja wjaVar, wiu wiuVar, bvd bvdVar, ywj ywjVar, EnumSet enumSet, zjd zjdVar, ywn ywnVar) {
        if (!wjaVar.A) {
            return cjz.m;
        }
        jtj jtjVarC = c(yvhVar, yvjVar, str, wiuVar, wjaVar, bvdVar, ywjVar, enumSet, zjdVar, ywnVar);
        Object obj = null;
        Object obj2 = yvhVar != null ? yvhVar.b : null;
        int i = yvhVar != null ? yvhVar.a : -1;
        int iA = a();
        Random random = this.h;
        int i2 = yvq.a;
        if (obj2 != null) {
            if (i == -1) {
                if (wiuVar.ai()) {
                    i = 3;
                } else {
                    i = 1;
                }
            }
            throw th;
        }
        if (wiuVar.ai()) {
            i = 3;
        } else if (iA == 3) {
            double dNextDouble = random.nextDouble();
            akwm akwmVar = wiuVar.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (dNextDouble >= akwmVar.aE) {
                i = 3;
                iA = 3;
            } else {
                i = 1;
                iA = 3;
            }
        } else {
            i = 1;
        }
        boolean z = this.c == null || iA != i;
        StringBuilder sb = new StringBuilder();
        sb.append(true != z ? "reuse" : "new");
        sb.append(".L");
        sb.append(i);
        ywnVar.w("mediadrm", sb.toString());
        if (z) {
            ckd ckdVar = this.c;
            if (ckdVar != null) {
                zhq zhqVar = zhq.ABR;
                e(ckdVar, ywnVar);
            }
            this.c = cki.r(brt.d);
            ckd ckdVar2 = this.c;
            zkf.d(ckdVar2);
            if (i == 3 && this.c != null) {
                try {
                    this.c.k("securityLevel", "L3");
                } catch (IllegalStateException e) {
                    zvp.a(zvn.a, zvm.f, "Cannot set mediaDrm property securityLevel to L3: ".concat(String.valueOf(e.getLocalizedMessage())));
                    zhq zhqVar2 = zhq.DRM;
                    zaf zafVar = new zaf(this, 0);
                    Map map = zhr.a;
                    zhr.e(zhqVar2, "MediaDrm metrics while trying to set securityLevel to L3: %s", zafVar);
                    throw new cko(2, e);
                }
            }
            try {
                ckdVar2.k("sessionSharing", "enable");
                this.f = true;
            } catch (Exception e2) {
                zhr.d(zhq.DRM, "failed to set sessionSharing: %s".concat(e2.toString()));
                this.f = false;
            }
            this.e = null;
            ckdVar2.i(new zag(this, 0));
            if (this.b != null) {
                final xur xurVar = new xur(this.b, this.a);
                ((cki) ckdVar2).a.setOnKeyStatusChangeListener(new MediaDrm.OnKeyStatusChangeListener() { // from class: ckh
                    @Override // android.media.MediaDrm.OnKeyStatusChangeListener
                    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
                            int statusCode = keyStatus.getStatusCode();
                            keyStatus.getKeyId();
                            arrayList.add(new amp(statusCode));
                        }
                        if (bArr != null) {
                            xur xurVar2 = xurVar;
                            ((Handler) xurVar2.b).post(new yag((Object) xurVar2, (Object) bArr, (Object) arrayList, 8, (char[]) null));
                        }
                    }
                }, (Handler) null);
            }
            final xxj xxjVar = new xxj(this);
            ((cki) ckdVar2).a.setOnExpirationUpdateListener(new MediaDrm.OnExpirationUpdateListener() { // from class: ckf
                @Override // android.media.MediaDrm.OnExpirationUpdateListener
                public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
                    if (bArr != null) {
                        xxj xxjVar2 = xxjVar;
                        zah zahVar = (zah) xxjVar2.a;
                        zkf.d(zahVar.b);
                        zahVar.b.post(new laz(xxjVar2, bArr, j, 12));
                    }
                }
            }, (Handler) null);
        }
        if (this.c != null) {
            ckd ckdVar3 = this.c;
            boolean z2 = this.f;
            jtjVarC.f = ckdVar3;
        }
        if (wjaVar.B()) {
            boolean z3 = wjaVar.A;
        }
        zjr zjrVar = this.d;
        jtjVarC.j = zjrVar.S().D;
        akwm akwmVar2 = wiuVar.d.f;
        if (akwmVar2 == null) {
            akwmVar2 = akwm.b;
        }
        int i3 = akwmVar2.x;
        int i4 = i3 != 0 ? i3 : 3;
        if (i4 > 0) {
            jtjVarC.g = i4;
        }
        jtjVarC.i = zjrVar.i.m(57, 45401257L);
        if (wiuVar.aU()) {
            jtjVarC.h = (zjrVar.S().b & SemanticState.Hidden) != 0 ? zjrVar.S().V : -1;
        }
        if (zjrVar.S().aa) {
            if (obj2 != null) {
                jtjVarC.e = (byte[]) obj2;
            }
            this.a.add(jtjVarC);
            return jtjVarC;
        }
        obj = obj2;
        List list = jtjVarC.a;
        if (list.size() <= 0) {
            ahno.O(list.isEmpty());
            jtjVarC.e = (byte[]) obj;
        }
        this.a.add(jtjVarC);
        return jtjVarC;
    }

    final synchronized jtj c(yvh yvhVar, yvj yvjVar, String str, wiu wiuVar, wja wjaVar, bvd bvdVar, ywj ywjVar, EnumSet enumSet, zjd zjdVar, ywn ywnVar) {
        yvk yvkVar;
        String str2;
        zjr zjrVar;
        yvkVar = new yvk(this.m, this.j, this.k, yvjVar, enumSet);
        Object objP = yvhVar != null ? yvhVar.d : wjaVar.p();
        String str3 = wjaVar.n;
        str2 = wjaVar.g;
        byte[] bArr = wjaVar.f;
        yvkVar.g = str3;
        yvkVar.h = (String) objP;
        yvkVar.i = str2;
        yvkVar.c = str;
        yvkVar.d = bArr;
        yvkVar.f = ywnVar;
        yvkVar.b.incrementAndGet();
        if (wjaVar.C) {
            zjr zjrVar2 = this.d;
            MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesA = zjo.a(wiuVar, zjrVar2, yno.ct(wjaVar), !zjrVar2.ew() || g(), zjb.c, zjb.a, zjb.b);
            if (i(wjaVar.M, mediaCapabilitiesOuterClass$MediaCapabilitiesA, aioy.VP9) || i(wjaVar.N, mediaCapabilitiesOuterClass$MediaCapabilitiesA, aioy.AV1)) {
                yvkVar.o = true;
            }
        }
        zjrVar = this.d;
        if (zjrVar.az()) {
            HashMap map = this.l;
            if (!map.containsKey("aid")) {
                map.put("aid", tym.I(this.i));
            }
        }
        return new jtj(brt.d, yvkVar, this.l, ywnVar, zjdVar, ywjVar, str2, bvdVar, this, zjrVar.j.m(12, 45364155L));
    }

    final synchronized String d(agke agkeVar) {
        int iA;
        zlo zloVar;
        iA = a();
        zloVar = this.g;
        int i = yvq.a;
        return "IT.0;AF." + ((String) Collection.EL.stream(agkeVar).map(new yom(4)).distinct().collect(Collectors.joining("."))) + ";L" + iA + ";MV." + zloVar.k;
    }

    final void e(ckd ckdVar, ywn ywnVar) {
        long j = this.d.S().G;
        if (j > 0) {
            yno.S(this.j, new ywt(ckdVar, 13), j, ywnVar, this.k, "Failed to release MediaDrm.");
        } else {
            ckdVar.g();
        }
    }

    final synchronized void f(yyd yydVar, agke agkeVar, boolean z) {
        if (agkeVar.isEmpty()) {
            return;
        }
        int iA = a();
        boolean zD = yvq.d(agkeVar);
        boolean zG = g();
        zlo zloVar = this.g;
        String str = true != z ? "" : "IT";
        zlo zloVar2 = zlo.SECURE_SURFACE;
        StringBuilder sb = new StringBuilder(str);
        if (zD) {
            sb.append(",HD");
        } else {
            sb.append(",SD");
        }
        if (zG) {
            sb.append(",Allowed");
        }
        sb.append(",L");
        sb.append(iA);
        if (zloVar == zloVar2) {
            sb.append(",SS");
        }
        yydVar.c = sb.toString();
    }

    final synchronized boolean g() {
        zlo zloVar = this.g;
        return (zloVar == zlo.NONE || zloVar == zlo.SECURE_SURFACE) && a() == 1;
    }

    public final synchronized boolean h(zlo zloVar, agke agkeVar) {
        if (this.g != zloVar) {
            this.g = zloVar;
            if (yvq.d(agkeVar) && zloVar != zlo.SECURE_SURFACE && zloVar != zlo.NONE) {
                return true;
            }
        }
        return false;
    }
}
