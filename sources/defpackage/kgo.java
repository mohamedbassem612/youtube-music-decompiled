package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgo {
    public static kgo a;
    public static final khn b = new khn("RemoteConnectionManager", (String) null);
    public final Context c;
    public final kbn d;
    public final Map f;
    public final Map g;
    public final BroadcastReceiver h;
    public boolean j;
    public boolean k;
    public final hee l;
    private final kdl m;
    private final kgl o;
    private final PowerManager p;
    private boolean r;
    public final Object i = new Object();
    private final Object q = new Object();
    public final Set e = ahng.aj();
    private final kgn n = new kgn(this);

    public kgo(Context context, kbn kbnVar, kdl kdlVar, hee heeVar, kgw kgwVar) {
        this.c = context;
        this.d = kbnVar;
        this.l = heeVar;
        kgl kglVar = new kgl(this);
        this.o = kglVar;
        this.m = kdlVar;
        kdlVar.e(kglVar);
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.p = (PowerManager) context.getSystemService("power");
        this.h = new kgm(this);
        kgwVar.a(new String[]{"com.google.android.gms.cast.FLAG_ENABLE_CONNECT_WITH_OPTIONS"}).q(new kbf(this, 5));
    }

    public static final void i(kgj kgjVar) {
        if (kgjVar != null) {
            kbp kbpVar = new kbp();
            kbpVar.b = 2422;
            kgjVar.h(kbpVar.a());
        }
    }

    public final did a() {
        String str = this.d.d;
        if (str.isEmpty()) {
            khn.e();
            return null;
        }
        heg hegVar = new heg((char[]) null);
        hegVar.m(kro.x(str));
        return hegVar.k();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence, java.lang.Object] */
    public final void b(Bundle bundle) {
        CastDevice castDeviceC;
        kyr kyrVar;
        kgj kgjVar;
        if (bundle == null || (castDeviceC = CastDevice.c(bundle)) == null) {
            return;
        }
        String string = bundle.getString("com.google.android.gms.cast.EXTRA_RUNNING_RECEIVER_APP_ID");
        Map map = this.f;
        String str = castDeviceC.a;
        if (map.containsKey(str) && (kgjVar = (kgj) map.get(str)) != null && !TextUtils.equals(kgjVar.d.a, string)) {
            i(kgjVar);
        }
        String str2 = this.d.d;
        if (string == null || str2.isEmpty() || !string.equals(str2)) {
            d(castDeviceC);
            return;
        }
        Map map2 = this.g;
        if (map2.containsKey(str)) {
            kyrVar = (kyr) map2.get(str);
        } else {
            kyr kyrVar2 = new kyr((Object) castDeviceC, (Object) string, (byte[]) null);
            map2.put(str, kyrVar2);
            kyrVar = kyrVar2;
        }
        Set set = this.e;
        if (set.isEmpty()) {
            return;
        }
        synchronized (this.i) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((ket) it.next()).s(kyrVar);
            }
        }
    }

    public final void c() {
        synchronized (this.q) {
            for (kgj kgjVar : this.f.values()) {
                kyr kyrVar = kgjVar.d;
                ket ketVar = kgjVar.e;
                xsc.aw(kyrVar, true);
                kgjVar.b(g(), h(), true);
            }
        }
    }

    public final void d(CastDevice castDevice) {
        kyr kyrVar = (kyr) this.g.remove(castDevice.a);
        if (kyrVar != null) {
            synchronized (this.i) {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((ket) it.next()).t(kyrVar);
                }
            }
        }
    }

    public final void e() {
        synchronized (this.q) {
            Iterator it = this.f.values().iterator();
            while (it.hasNext()) {
                ((kgj) it.next()).d(g(), h());
            }
        }
    }

    public final void f() {
        boolean zIsEmpty = this.e.isEmpty();
        if (g() || zIsEmpty) {
            if (this.r) {
                this.r = false;
                khn.e();
                this.l.e(this.n);
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        khn.e();
        hee heeVar = this.l;
        kgn kgnVar = this.n;
        heeVar.e(kgnVar);
        did didVarA = a();
        if (didVarA == null) {
            khn.e();
            return;
        }
        this.r = true;
        didVarA.b().toString();
        khn.e();
        heeVar.f(didVarA, kgnVar);
    }

    public final boolean g() {
        return this.m.f();
    }

    public final boolean h() {
        PowerManager powerManager = this.p;
        return (powerManager == null || powerManager.isInteractive()) ? false : true;
    }
}
