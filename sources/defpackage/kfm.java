package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kfm implements jzx {
    public static final khn a = new khn("RemoteMediaClient", (String) null);
    public final Object b;
    public final khq c;
    public final List d = new CopyOnWriteArrayList();
    public final List e = new CopyOnWriteArrayList();
    public final Map f;
    private final Handler g;
    private final kff h;
    private final ker i;
    private jzz j;

    static {
        String str = khq.a;
    }

    public kfm(khq khqVar) {
        new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.b = new Object();
        this.g = new afkg(Looper.getMainLooper(), (byte[]) null);
        kff kffVar = new kff(this);
        this.h = kffVar;
        this.c = khqVar;
        khqVar.B = new qcb(this);
        khqVar.c(kffVar);
        this.i = new ker(this);
    }

    public static knf u() {
        kfg kfgVar = new kfg();
        kfgVar.l(new kfi(new Status(17, null, null, null), 1));
        return kfgVar;
    }

    public static final void v(kfj kfjVar) {
        try {
            if (!kfjVar.c) {
                kfm kfmVar = kfjVar.d;
                Iterator it = kfmVar.d.iterator();
                while (it.hasNext()) {
                    ((kfh) it.next()).e();
                }
                for (ket ketVar : kfmVar.e) {
                }
            }
            try {
                synchronized (kfjVar.d.b) {
                    try {
                        kfjVar.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (khp unused) {
                kfjVar.l(new kfi(new Status(2100, null, null, null), 0));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused2) {
            kfjVar.l(new kfi(new Status(2100, null, null, null), 0));
        }
    }

    public final void A(kaw kawVar) {
        kro.f("Must be called from the main thread.");
        if (m()) {
            v(new kfd(this, kawVar));
        } else {
            u();
        }
    }

    public final void B(ket ketVar) {
        kro.f("Must be called from the main thread.");
        if (ketVar != null) {
            this.e.add(ketVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.jzx
    public final void a(String str) {
        int i;
        int iA;
        boolean z;
        kax kaxVar;
        int[] iArrP;
        khq khqVar = this.c;
        khn khnVar = khqVar.c;
        khn.e();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long jOptLong = jSONObject.optLong("requestId", -1L);
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        khqVar.i.e(jOptLong, 2101, khq.r(jSONObject));
                    }
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        khqVar.x.e(jOptLong, 0, null);
                        khqVar.k(jSONObject, "QUEUE_ITEMS");
                        if (khqVar.B != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            kav[] kavVarArr = new kav[jSONArray.length()];
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                kav kavVar = new kav(jSONArray.getJSONObject(i2));
                                hna.H(kavVar);
                                kavVarArr[i2] = kavVar;
                            }
                            Iterator it = ((kfm) khqVar.B.a).e.iterator();
                            while (it.hasNext()) {
                                ((ket) it.next()).e(kavVarArr);
                            }
                        }
                    }
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        khnVar.d("received unexpected error: Invalid Request.", new Object[0]);
                        Iterator it2 = khqVar.e.iterator();
                        while (it2.hasNext()) {
                            ((kht) it2.next()).e(jOptLong, 2001, khq.r(jSONObject));
                        }
                    }
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        khqVar.i.e(jOptLong, 2100, khq.r(jSONObject));
                    }
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        Iterator it3 = khqVar.e.iterator();
                        while (it3.hasNext()) {
                            ((kht) it3.next()).e(jOptLong, 2100, khq.r(jSONObject));
                        }
                        if (khqVar.B != null) {
                            MediaError.a(jSONObject);
                            for (ket ketVar : ((kfm) khqVar.B.a).e) {
                            }
                        }
                    }
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        khqVar.y.e(jOptLong, 0, null);
                        khqVar.k(jSONObject, "QUEUE_CHANGE");
                        if (khqVar.B != null) {
                            String string2 = jSONObject.getString("changeType");
                            int[] iArrP2 = khq.p(jSONObject.getJSONArray("itemIds"));
                            int iOptInt = jSONObject.optInt("insertBefore", 0);
                            if (iArrP2 != null) {
                                switch (string2.hashCode()) {
                                    case -2130463047:
                                        if (string2.equals("INSERT")) {
                                            Iterator it4 = ((kfm) khqVar.B.a).e.iterator();
                                            while (it4.hasNext()) {
                                                ((ket) it4.next()).d(iArrP2, iOptInt);
                                            }
                                        }
                                        break;
                                    case -1881281404:
                                        if (string2.equals("REMOVE")) {
                                            Iterator it5 = ((kfm) khqVar.B.a).e.iterator();
                                            while (it5.hasNext()) {
                                                ((ket) it5.next()).f(iArrP2);
                                            }
                                        }
                                        break;
                                    case -1785516855:
                                        if (string2.equals("UPDATE")) {
                                            int[] iArrP3 = khq.p(jSONObject.getJSONArray("itemIds"));
                                            kro.m(iArrP3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                            if (jSONArrayOptJSONArray != null) {
                                                List listD = khe.d(iArrP3);
                                                int iOptInt2 = jSONObject.optInt("insertBefore", 0);
                                                int[] iArrP4 = khq.p(jSONArrayOptJSONArray);
                                                kro.l(iArrP4);
                                                List listD2 = khe.d(iArrP4);
                                                Iterator it6 = ((kfm) khqVar.B.a).e.iterator();
                                                while (it6.hasNext()) {
                                                    ((ket) it6.next()).g(listD, listD2, iOptInt2);
                                                }
                                            } else {
                                                khqVar.B.k(iArrP3);
                                            }
                                        }
                                        break;
                                    case 1122976047:
                                        if (string2.equals("ITEMS_CHANGE")) {
                                            Iterator it7 = ((kfm) khqVar.B.a).e.iterator();
                                            while (it7.hasNext()) {
                                                ((ket) it7.next()).h(iArrP2);
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        khnVar.d("received unexpected error: Invalid Player State.", new Object[0]);
                        Iterator it8 = khqVar.e.iterator();
                        while (it8.hasNext()) {
                            ((kht) it8.next()).e(jOptLong, 2100, khq.r(jSONObject));
                        }
                    }
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                            boolean zB = khqVar.i.b(jOptLong);
                            kht khtVar = khqVar.n;
                            if (!khtVar.c() || khtVar.b(jOptLong)) {
                                kht khtVar2 = khqVar.o;
                                if (!khtVar2.c() || khtVar2.b(jOptLong)) {
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                            } else {
                                i = 1;
                            }
                            if (zB || (kaxVar = khqVar.f) == null) {
                                khqVar.f = new kax(jSONObject2);
                                khqVar.b = SystemClock.elapsedRealtime();
                                iA = 127;
                            } else {
                                iA = kaxVar.a(jSONObject2, i);
                            }
                            if ((iA & 1) != 0) {
                                khqVar.b = SystemClock.elapsedRealtime();
                                khqVar.h = -1;
                                z = true;
                            } else {
                                z = false;
                            }
                            if ((iA & 2) != 0) {
                                khqVar.b = SystemClock.elapsedRealtime();
                                z = true;
                            }
                            if ((iA & SemanticState.Focused) != 0) {
                                khqVar.b = SystemClock.elapsedRealtime();
                            }
                            if ((iA & 4) != 0) {
                                khqVar.l();
                            }
                            if ((iA & 8) != 0) {
                                khqVar.n();
                            }
                            if ((iA & 16) != 0) {
                                khqVar.m();
                            }
                            if ((iA & 32) != 0) {
                                khqVar.b = SystemClock.elapsedRealtime();
                                qcb qcbVar = khqVar.B;
                                if (qcbVar != null) {
                                    Object obj = qcbVar.a;
                                    Iterator it9 = ((kfm) obj).d.iterator();
                                    while (it9.hasNext()) {
                                        ((kfh) it9.next()).a();
                                    }
                                    Iterator it10 = ((kfm) obj).e.iterator();
                                    while (it10.hasNext()) {
                                        ((ket) it10.next()).j();
                                    }
                                }
                            }
                            if ((iA & 64) != 0) {
                                khqVar.b = SystemClock.elapsedRealtime();
                            } else if (z) {
                            }
                            khqVar.o();
                        } else {
                            khqVar.f = null;
                            khqVar.o();
                            khqVar.l();
                            khqVar.n();
                            khqVar.m();
                        }
                        Iterator it11 = khqVar.e.iterator();
                        while (it11.hasNext()) {
                            ((kht) it11.next()).e(jOptLong, 0, null);
                        }
                    }
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        khqVar.w.e(jOptLong, 0, null);
                        khqVar.k(jSONObject, "QUEUE_ITEM_IDS");
                        if (khqVar.B != null && (iArrP = khq.p(jSONObject.getJSONArray("itemIds"))) != null) {
                            khqVar.B.k(iArrP);
                            break;
                        }
                    }
                    break;
            }
        } catch (JSONException e) {
            khqVar.c.d("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    public final int b() {
        kav kavVarG;
        if (f() == null || !n()) {
            return 0;
        }
        if (!o()) {
            if (s()) {
                return 3;
            }
            if (r()) {
                return 2;
            }
            if (!q() || (kavVarG = g()) == null || kavVarG.a == null) {
                return 0;
            }
        }
        return 6;
    }

    public final int c() {
        int i;
        synchronized (this.b) {
            kro.f("Must be called from the main thread.");
            kax kaxVarH = h();
            i = kaxVarH != null ? kaxVarH.e : 1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[Catch: all -> 0x008b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0029, B:14:0x002f, B:16:0x0037, B:18:0x003b, B:20:0x0041, B:22:0x004b, B:23:0x0050, B:25:0x0058, B:26:0x0065, B:27:0x006a, B:29:0x0070, B:33:0x007f, B:35:0x0087), top: B:41:0x0003 }] */
    public final long d() {
        long jG;
        kax kaxVar;
        kar karVar;
        synchronized (this.b) {
            kro.f("Must be called from the main thread.");
            khq khqVar = this.c;
            MediaInfo mediaInfoJ = khqVar.j();
            jG = 0;
            if (mediaInfoJ != null && (kaxVar = khqVar.f) != null) {
                Long l = khqVar.g;
                if (l != null) {
                    if (!l.equals(4294967296000L)) {
                        jG = l.longValue();
                    } else if (khqVar.f.u != null) {
                        long jLongValue = l.longValue();
                        kax kaxVar2 = khqVar.f;
                        if (kaxVar2 != null && (karVar = kaxVar2.u) != null) {
                            long j = karVar.c;
                            jG = !karVar.e ? khqVar.g(1.0d, j, -1L) : j;
                        }
                        jG = Math.min(jLongValue, jG);
                    } else if (khqVar.i() >= 0) {
                        jG = Math.min(l.longValue(), khqVar.i());
                    } else {
                        jG = l.longValue();
                    }
                } else if (khqVar.b != 0) {
                    double d = kaxVar.d;
                    long j2 = kaxVar.g;
                    jG = (d == 0.0d || kaxVar.e != 2) ? j2 : khqVar.g(d, j2, mediaInfoJ.d);
                }
            }
        }
        return jG;
    }

    public final long e() {
        long jI;
        synchronized (this.b) {
            kro.f("Must be called from the main thread.");
            jI = this.c.i();
        }
        return jI;
    }

    public final MediaInfo f() {
        MediaInfo mediaInfoJ;
        synchronized (this.b) {
            kro.f("Must be called from the main thread.");
            mediaInfoJ = this.c.j();
        }
        return mediaInfoJ;
    }

    public final kav g() {
        kro.f("Must be called from the main thread.");
        kax kaxVarH = h();
        if (kaxVarH == null) {
            return null;
        }
        return kaxVarH.c(kaxVarH.l);
    }

    public final kax h() {
        kax kaxVar;
        synchronized (this.b) {
            kro.f("Must be called from the main thread.");
            kaxVar = this.c.f;
        }
        return kaxVar;
    }

    public final String i() {
        kro.f("Must be called from the main thread.");
        return this.c.d;
    }

    public final void j() {
        jzz jzzVar = this.j;
        if (jzzVar != null) {
            jzzVar.i(i(), this);
            kro.f("Must be called from the main thread.");
            if (m()) {
                v(new kew(this));
            } else {
                u();
            }
        }
    }

    public final void k(jzz jzzVar) {
        jzz jzzVar2 = this.j;
        if (jzzVar2 != jzzVar) {
            if (jzzVar2 != null) {
                this.c.a();
                this.i.b();
                jzzVar2.h(i());
                this.h.a = null;
                this.g.removeCallbacksAndMessages(null);
            }
            this.j = jzzVar;
            if (jzzVar != null) {
                this.h.a = jzzVar;
            }
        }
    }

    public final void l() {
        kro.f("Must be called from the main thread.");
        int iC = c();
        if (iC == 4 || iC == 2) {
            w();
        } else {
            x();
        }
    }

    public final boolean m() {
        return this.j != null;
    }

    public final boolean n() {
        kro.f("Must be called from the main thread.");
        if (!o()) {
            kro.f("Must be called from the main thread.");
            kax kaxVarH = h();
            if ((kaxVarH == null || kaxVarH.e != 5) && !s() && !r() && !q()) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        kro.f("Must be called from the main thread.");
        kax kaxVarH = h();
        return kaxVarH != null && kaxVarH.e == 4;
    }

    public final boolean p() {
        kro.f("Must be called from the main thread.");
        MediaInfo mediaInfoF = f();
        return mediaInfoF != null && mediaInfoF.a == 2;
    }

    public final boolean q() {
        kro.f("Must be called from the main thread.");
        kax kaxVarH = h();
        return (kaxVarH == null || kaxVarH.l == 0) ? false : true;
    }

    public final boolean r() {
        int i;
        kro.f("Must be called from the main thread.");
        kax kaxVarH = h();
        if (kaxVarH == null) {
            return false;
        }
        if (kaxVarH.e != 3) {
            if (!p()) {
                return false;
            }
            synchronized (this.b) {
                kro.f("Must be called from the main thread.");
                kax kaxVarH2 = h();
                i = kaxVarH2 != null ? kaxVarH2.f : 0;
            }
            if (i != 2) {
                return false;
            }
        }
        return true;
    }

    public final boolean s() {
        kro.f("Must be called from the main thread.");
        kax kaxVarH = h();
        return kaxVarH != null && kaxVarH.e == 2;
    }

    public final boolean t() {
        kro.f("Must be called from the main thread.");
        kax kaxVarH = h();
        return kaxVarH != null && kaxVarH.r;
    }

    public final knf w() {
        kro.f("Must be called from the main thread.");
        if (!m()) {
            return u();
        }
        kfb kfbVar = new kfb(this);
        v(kfbVar);
        return kfbVar;
    }

    public final knf x() {
        kro.f("Must be called from the main thread.");
        if (!m()) {
            return u();
        }
        kfc kfcVar = new kfc(this);
        v(kfcVar);
        return kfcVar;
    }

    public final void y() {
        kro.f("Must be called from the main thread.");
        if (m()) {
            v(new key(this));
        } else {
            u();
        }
    }

    public final void z() {
        kro.f("Must be called from the main thread.");
        if (m()) {
            v(new kex(this));
        } else {
            u();
        }
    }
}
