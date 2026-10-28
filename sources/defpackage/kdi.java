package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class kdi {
    public static final khn a = new khn("SessionFlowSummary", (String) null);
    public static final String b = "23.0.0";
    private static long x = System.currentTimeMillis();
    public final kcw h;
    public final String i;
    public final long k;
    public kbu l;
    public String m;
    public String n;
    public kde o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int w;
    public final agfr c = aguu.al(new cln(3));
    public final List d = DesugarCollections.synchronizedList(new ArrayList());
    public final List e = DesugarCollections.synchronizedList(new ArrayList());
    public final List f = DesugarCollections.synchronizedList(new ArrayList());
    public final Map g = DesugarCollections.synchronizedMap(new HashMap());
    public int v = 0;
    public final long j = System.currentTimeMillis();

    public kdi(kcw kcwVar, String str) {
        this.h = kcwVar;
        this.i = str;
        long j = x;
        x = 1 + j;
        this.k = j;
    }

    final void a(kbu kbuVar) {
        if (kbuVar == null) {
            c(2);
            return;
        }
        CastDevice castDeviceB = kbuVar.b();
        if (castDeviceB == null) {
            c(3);
            return;
        }
        this.l = kbuVar;
        String str = this.n;
        if (str != null) {
            if (TextUtils.equals(str, castDeviceB.j)) {
                return;
            }
            c(5);
            return;
        }
        this.n = castDeviceB.j;
        this.p = castDeviceB.e;
        this.v = castDeviceB.b();
        khd khdVarD = castDeviceB.d();
        if (khdVarD != null) {
            this.q = khdVarD.d;
            this.r = khdVarD.e;
            this.s = khdVarD.f;
            this.t = khdVarD.g;
            this.u = khdVarD.h;
        }
        kbuVar.n();
    }

    final void b(String str) {
        String str2 = this.m;
        if (str2 == null) {
            this.m = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            c(4);
        }
    }

    public final void c(int i) {
        Map map = this.g;
        Integer numValueOf = Integer.valueOf(i - 1);
        kdj kdjVar = (kdj) map.get(numValueOf);
        if (kdjVar != null) {
            kdjVar.d.incrementAndGet();
            kdjVar.b = System.currentTimeMillis();
        } else {
            kdj kdjVar2 = new kdj(new amp(i));
            kdjVar2.c = this.j;
            map.put(numValueOf, kdjVar2);
        }
    }
}
