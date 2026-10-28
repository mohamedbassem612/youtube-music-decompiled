package defpackage;

import android.net.NetworkCapabilities;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axkl {
    public final Object a;

    public axkl(axpk axpkVar) {
        byte[] bArr = axqj.a;
        this.a = axpkVar;
        axpkVar.a = this;
    }

    public static int[] e(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(a.bU((byte) 96, str, "Unable to parse HTTP flags version string: `"), e);
        }
    }

    public static int f(axqr axqrVar, Object obj, Object obj2) {
        return axqa.a((axrt) axqrVar.c, 1, obj) + axqa.a((axrt) axqrVar.d, 2, obj2);
    }

    public static void g(axpk axpkVar, axqr axqrVar, Object obj, Object obj2) {
        axqa.e(axpkVar, (axrt) axqrVar.c, 1, obj);
        axqa.e(axpkVar, (axrt) axqrVar.d, 2, obj2);
    }

    public final int a() {
        Object obj = this.a;
        if (obj != null) {
            return ((NetworkCapabilities) obj).getLinkDownstreamBandwidthKbps();
        }
        throw new UnsupportedOperationException("getLinkDownstreamBandwidthKbps is unavailable without wrapped NetworkCapabilities");
    }

    public final boolean b(int i) {
        Object obj = this.a;
        if (obj != null) {
            return ((NetworkCapabilities) obj).hasCapability(i);
        }
        return true;
    }

    public final boolean c(int i) {
        Object obj = this.a;
        if (obj != null) {
            return ((NetworkCapabilities) obj).hasTransport(i);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Map d() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    public final void h(int i, boolean z) throws axpu {
        ((axpk) this.a).l(i, z);
    }

    public final void i(int i, axpo axpoVar) throws axpu {
        ((axpk) this.a).m(i, axpoVar);
    }

    public final void j(int i, double d) throws axpu {
        ((axpk) this.a).e(i, d);
    }

    public final void k(int i, int i2) throws axpu {
        ((axpk) this.a).s(i, i2);
    }

    public final void l(int i, int i2) throws axpu {
        ((axpk) this.a).o(i, i2);
    }

    public final void m(int i, long j) throws axpu {
        ((axpk) this.a).q(i, j);
    }

    public final void n(int i, float f) throws axpu {
        ((axpk) this.a).g(i, f);
    }

    public final void o(int i, Object obj, axre axreVar) throws axpu {
        int i2 = i << 3;
        axpk axpkVar = (axpk) this.a;
        axpkVar.y(i2 | 3);
        axreVar.i((axpg) obj, this);
        axpkVar.y(i2 | 4);
    }

    public final void p(int i, int i2) throws axpu {
        ((axpk) this.a).s(i, i2);
    }

    public final void q(int i, long j) throws axpu {
        ((axpk) this.a).z(i, j);
    }

    public final void r(int i, Object obj, axre axreVar) throws axpu {
        axpg axpgVar = (axpg) obj;
        axpk axpkVar = (axpk) this.a;
        axpkVar.y((i << 3) | 2);
        axpkVar.y(axpgVar.b(axreVar));
        axreVar.i(axpgVar, this);
    }

    public final void s(int i, int i2) throws axpu {
        ((axpk) this.a).o(i, i2);
    }

    public final void t(int i, long j) throws axpu {
        ((axpk) this.a).q(i, j);
    }

    public final void u(int i, int i2) throws axpu {
        ((axpk) this.a).x(i, (i2 << 1) ^ (i2 >> 31));
    }

    public final void v(int i, long j) throws axpu {
        ((axpk) this.a).z(i, (j << 1) ^ (j >> 63));
    }

    public final void w(int i, int i2) throws axpu {
        ((axpk) this.a).x(i, i2);
    }

    public final void x(int i, long j) throws axpu {
        ((axpk) this.a).z(i, j);
    }

    public axkl(Object obj) {
        this.a = obj;
    }

    public axkl(axrt axrtVar, axrt axrtVar2, Object obj) {
        this.a = new axqr(axrtVar, axrtVar2, obj);
    }
}
