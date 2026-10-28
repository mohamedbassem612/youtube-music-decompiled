package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kan extends kmz implements jzz {
    private static final khn H;
    private static final kro I;
    public static final khn a = new khn("CastClient", (String) null);
    private Handler F;
    private final Object G;
    public final kam b;
    public boolean c;
    public boolean d;
    public final AtomicLong e;
    public final Object f;
    public jzt g;
    public String h;
    public double i;
    public boolean j;
    public int k;
    public int l;
    public kae m;
    public final CastDevice n;
    final Map o;
    public final Map p;
    public final List q;
    public volatile int r;
    kjc s;
    kjc t;
    public final hna u;

    static {
        kal kalVar = new kal();
        I = kalVar;
        H = new khn("Cast.API_CXLESS", kalVar, khm.b);
    }

    public kan(Context context, jzw jzwVar) {
        super(context, null, H, jzwVar, kmy.a);
        this.b = new kam(this);
        this.f = new Object();
        this.G = new Object();
        this.q = DesugarCollections.synchronizedList(new ArrayList());
        kro.m(context, "context cannot be null");
        this.u = jzwVar.e;
        this.n = jzwVar.a;
        this.o = new HashMap();
        this.p = new HashMap();
        this.e = new AtomicLong(0L);
        this.r = 1;
        u();
    }

    private static kmu D(int i) {
        return kro.q(new Status(i, null, null, null));
    }

    @Override // defpackage.jzz
    public final lpa a(final String str, final String str2, final kao kaoVar) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kpe() { // from class: kaj
            @Override // defpackage.kpe
            public final void a(Object obj, Object obj2) {
                kan kanVar = this.a;
                khc khcVar = (khc) obj;
                kanVar.n();
                khi khiVar = (khi) khcVar.C();
                Context context = khcVar.p;
                kmv kmvVarAp = ksy.ap();
                Parcel parcelC = khiVar.c();
                parcelC.writeString(str);
                parcelC.writeString(str2);
                gdc.c(parcelC, kaoVar);
                gdc.c(parcelC, kmvVarAp);
                khiVar.f(14, parcelC);
                kanVar.v((kjc) obj2);
            }
        };
        kpjVar.c = 8407;
        return super.A(1, kpjVar.a());
    }

    @Override // defpackage.jzz
    public final lpa b(String str, kap kapVar) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kai(this, str, kapVar, 1);
        kpjVar.c = 8406;
        return super.A(1, kpjVar.a());
    }

    @Override // defpackage.jzz
    public final lpa c() {
        kpj kpjVar = new kpj();
        kpjVar.a = new kak(this, 0);
        kpjVar.c = 8408;
        return super.A(1, kpjVar.a());
    }

    @Override // defpackage.jzz
    public final lpa d(String str, String str2) {
        khe.f(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() > 524288) {
            a.d("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        kpj kpjVar = new kpj();
        kpjVar.a = new kai(this, str, str2, 2);
        kpjVar.c = 8405;
        return super.A(1, kpjVar.a());
    }

    @Override // defpackage.jzz
    public final boolean e() {
        return this.r == 3;
    }

    @Override // defpackage.jzz
    public final void f() {
        kox koxVarY = y(this.b, "castDeviceControllerListenerKey");
        kpd kpdVar = new kpd();
        kak kakVar = new kak(this, 1);
        kah kahVar = new kah(3);
        this.r = 2;
        kpdVar.c = koxVarY;
        kpdVar.a = kakVar;
        kpdVar.b = kahVar;
        kpdVar.d = new klq[]{kaf.b};
        kpdVar.f = 8428;
        C(kpdVar.a());
    }

    @Override // defpackage.jzz
    public final void g() {
        if (this.r == 1) {
            o();
            mda.m(null);
            return;
        }
        kpj kpjVar = new kpj();
        kpjVar.a = new kah(0);
        kpjVar.c = 8403;
        super.A(1, kpjVar.a());
        o();
    }

    @Override // defpackage.jzz
    public final void h(String str) {
        jzx jzxVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        Map map = this.p;
        synchronized (map) {
            jzxVar = (jzx) map.remove(str);
        }
        kpj kpjVar = new kpj();
        kpjVar.a = new kai(this, jzxVar, str, 0);
        kpjVar.c = 8414;
        super.A(1, kpjVar.a());
    }

    @Override // defpackage.jzz
    public final void i(String str, jzx jzxVar) {
        khe.f(str);
        if (jzxVar != null) {
            Map map = this.p;
            synchronized (map) {
                map.put(str, jzxVar);
            }
        }
        kpj kpjVar = new kpj();
        kpjVar.a = new kai(this, str, jzxVar, 3);
        kpjVar.c = 8413;
        super.A(1, kpjVar.a());
    }

    @Override // defpackage.jzz
    public final void j(final double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        kpj kpjVar = new kpj();
        kpjVar.a = new kpe() { // from class: kag
            @Override // defpackage.kpe
            public final void a(Object obj, Object obj2) {
                khc khcVar = (khc) obj;
                khi khiVar = (khi) khcVar.C();
                Context context = khcVar.p;
                kan kanVar = this.a;
                double d2 = kanVar.i;
                boolean z = kanVar.j;
                kmv kmvVarAp = ksy.ap();
                Parcel parcelC = khiVar.c();
                parcelC.writeDouble(d);
                parcelC.writeDouble(d2);
                ClassLoader classLoader = gdc.a;
                parcelC.writeInt(z ? 1 : 0);
                gdc.c(parcelC, kmvVarAp);
                khiVar.f(7, parcelC);
                ((kjc) obj2).x(null);
            }
        };
        kpjVar.c = 8411;
        super.A(1, kpjVar.a());
    }

    @Override // defpackage.jzz
    public final void k(String str) {
        kpj kpjVar = new kpj();
        kpjVar.a = new jyx((Object) this, str, 3);
        kpjVar.c = 8409;
        super.A(1, kpjVar.a());
    }

    @Override // defpackage.jzz
    public final void l(hna hnaVar) {
        kro.l(hnaVar);
        this.q.add(hnaVar);
    }

    public final Handler m() {
        if (this.F == null) {
            this.F = new afkg(this.A, (byte[]) null);
        }
        return this.F;
    }

    public final void n() {
        kro.h(e(), "Not connected to device");
    }

    public final void o() {
        p();
        kow kowVar = y(this.b, "castDeviceControllerListenerKey").b;
        kro.m(kowVar, "Key must not be null");
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        koq koqVar = this.D;
        koqVar.j(kjcVar, 8415, this);
        kns knsVar = new kns(kowVar, kjcVar);
        Handler handler = koqVar.q;
        handler.sendMessage(handler.obtainMessage(13, new xgl(knsVar, koqVar.j.get(), this)));
    }

    public final void p() {
        khn.e();
        Map map = this.p;
        synchronized (map) {
            map.clear();
        }
    }

    public final void q(int i) {
        synchronized (this.f) {
            kjc kjcVar = this.s;
            if (kjcVar != null) {
                kjcVar.w(D(i));
            }
            this.s = null;
        }
    }

    public final void r(long j, int i) {
        kjc kjcVar;
        Map map = this.o;
        synchronized (map) {
            Long lValueOf = Long.valueOf(j);
            kjcVar = (kjc) map.get(lValueOf);
            map.remove(lValueOf);
        }
        if (kjcVar != null) {
            if (i == 0) {
                kjcVar.x(null);
            } else {
                kjcVar.w(D(i));
            }
        }
    }

    public final void s(int i) {
        synchronized (this.G) {
            kjc kjcVar = this.t;
            if (kjcVar == null) {
                return;
            }
            if (i == 0) {
                kjcVar.x(new Status(0, null, null, null));
            } else {
                kjcVar.w(D(i));
            }
            this.t = null;
        }
    }

    public final void t() {
        kro.h(this.r != 1, "Not active connection");
    }

    public final void u() {
        CastDevice castDevice = this.n;
        if (castDevice.e(SemanticState.Modal) || !castDevice.e(4) || castDevice.e(1)) {
            return;
        }
        String str = castDevice.e;
    }

    public final void v(kjc kjcVar) {
        synchronized (this.f) {
            if (this.s != null) {
                q(2477);
            }
            this.s = kjcVar;
        }
    }

    public final void w(kjc kjcVar) {
        synchronized (this.G) {
            if (this.t != null) {
                kjcVar.w(D(2001));
            } else {
                this.t = kjcVar;
            }
        }
    }
}
