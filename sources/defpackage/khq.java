package defpackage;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class khq extends kgy {
    public static final String a;
    final kht A;
    public qcb B;
    public long b;
    public kax f;
    public Long g;
    public int h;
    public final kht i;
    public final kht j;
    public final kht k;
    final kht l;
    public final kht m;
    public final kht n;
    public final kht o;
    public final kht p;
    final kht q;
    final kht r;
    final kht s;
    final kht t;
    final kht u;
    final kht v;
    public final kht w;
    public final kht x;
    public final kht y;
    final kht z;

    static {
        Pattern pattern = khe.a;
        a = "urn:x-cast:com.google.cast.media";
    }

    public khq() {
        super(a, "MediaControlChannel");
        this.h = -1;
        kht khtVar = new kht(86400000L, "load");
        this.i = khtVar;
        kht khtVar2 = new kht(86400000L, "pause");
        this.j = khtVar2;
        kht khtVar3 = new kht(86400000L, "play");
        this.k = khtVar3;
        kht khtVar4 = new kht(86400000L, "stop");
        this.l = khtVar4;
        kht khtVar5 = new kht(10000L, "seek");
        this.m = khtVar5;
        kht khtVar6 = new kht(86400000L, "volume");
        this.n = khtVar6;
        kht khtVar7 = new kht(86400000L, "mute");
        this.o = khtVar7;
        kht khtVar8 = new kht(86400000L, "status");
        this.p = khtVar8;
        kht khtVar9 = new kht(86400000L, "activeTracks");
        this.q = khtVar9;
        kht khtVar10 = new kht(86400000L, "trackStyle");
        this.r = khtVar10;
        kht khtVar11 = new kht(86400000L, "queueInsert");
        this.s = khtVar11;
        kht khtVar12 = new kht(86400000L, "queueUpdate");
        this.t = khtVar12;
        kht khtVar13 = new kht(86400000L, "queueRemove");
        this.u = khtVar13;
        kht khtVar14 = new kht(86400000L, "queueReorder");
        this.v = khtVar14;
        kht khtVar15 = new kht(86400000L, "queueFetchItemIds");
        this.w = khtVar15;
        kht khtVar16 = new kht(86400000L, "queueFetchItemRange");
        this.y = khtVar16;
        this.x = new kht(86400000L, "queueFetchItems");
        kht khtVar17 = new kht(86400000L, "setPlaybackRate");
        this.z = khtVar17;
        kht khtVar18 = new kht(86400000L, "skipAd");
        this.A = khtVar18;
        f(khtVar);
        f(khtVar2);
        f(khtVar3);
        f(khtVar4);
        f(khtVar5);
        f(khtVar6);
        f(khtVar7);
        f(khtVar8);
        f(khtVar9);
        f(khtVar10);
        f(khtVar11);
        f(khtVar12);
        f(khtVar13);
        f(khtVar14);
        f(khtVar15);
        f(khtVar16);
        f(khtVar16);
        f(khtVar17);
        f(khtVar18);
        s();
    }

    public static int[] p(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public static ket r(JSONObject jSONObject) {
        MediaError.a(jSONObject);
        ket ketVar = new ket(null);
        Pattern pattern = khe.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return ketVar;
    }

    private final void s() {
        this.b = 0L;
        this.f = null;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((kht) it.next()).d(2002);
        }
    }

    @Override // defpackage.kgy
    public final void a() {
        e();
        s();
    }

    public final long g(double d, long j, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (jElapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final long h() throws khp {
        kax kaxVar = this.f;
        if (kaxVar != null) {
            return kaxVar.b;
        }
        throw new khp();
    }

    public final long i() {
        MediaInfo mediaInfoJ = j();
        if (mediaInfoJ != null) {
            return mediaInfoJ.d;
        }
        return 0L;
    }

    public final MediaInfo j() {
        kax kaxVar = this.f;
        if (kaxVar == null) {
            return null;
        }
        return kaxVar.a;
    }

    public final void k(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.h = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.c.d(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void l() {
        qcb qcbVar = this.B;
        if (qcbVar != null) {
            kfm kfmVar = (kfm) qcbVar.a;
            Iterator it = kfmVar.d.iterator();
            while (it.hasNext()) {
                ((kfh) it.next()).b();
            }
            Iterator it2 = kfmVar.e.iterator();
            while (it2.hasNext()) {
                ((ket) it2.next()).k();
            }
        }
    }

    public final void m() {
        qcb qcbVar = this.B;
        if (qcbVar != null) {
            kfm kfmVar = (kfm) qcbVar.a;
            Iterator it = kfmVar.d.iterator();
            while (it.hasNext()) {
                ((kfh) it.next()).c();
            }
            Iterator it2 = kfmVar.e.iterator();
            while (it2.hasNext()) {
                ((ket) it2.next()).l();
            }
        }
    }

    public final void n() {
        qcb qcbVar = this.B;
        if (qcbVar != null) {
            kfm kfmVar = (kfm) qcbVar.a;
            Iterator it = kfmVar.d.iterator();
            while (it.hasNext()) {
                ((kfh) it.next()).d();
            }
            Iterator it2 = kfmVar.e.iterator();
            while (it2.hasNext()) {
                ((ket) it2.next()).m();
            }
        }
    }

    public final void o() {
        qcb qcbVar = this.B;
        if (qcbVar != null) {
            kfm kfmVar = (kfm) qcbVar.a;
            Iterator it = kfmVar.f.values().iterator();
            if (it.hasNext()) {
                if (!kfmVar.n() && kfmVar.n()) {
                    throw null;
                }
                throw null;
            }
            Iterator it2 = kfmVar.d.iterator();
            while (it2.hasNext()) {
                ((kfh) it2.next()).f();
            }
            Iterator it3 = kfmVar.e.iterator();
            while (it3.hasNext()) {
                ((ket) it3.next()).b();
            }
        }
    }

    public final void q(khs khsVar, int i) {
        JSONObject jSONObject = new JSONObject();
        long jB = b();
        try {
            jSONObject.put("requestId", jB);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", h());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.h;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jB);
        this.t.a(jB, new kho(this, khsVar, 0));
    }
}
