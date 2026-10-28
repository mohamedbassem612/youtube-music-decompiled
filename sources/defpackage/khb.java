package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class khb extends kqs {
    private static final Object I;
    public static final Object a;
    private final Bundle J;
    private kha K;
    private Bundle L;
    private final Map M;
    public jzt b;
    public final CastDevice c;
    public final Map d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public double i;
    public kae j;
    public int k;
    public int l;
    public String m;
    public String n;
    public final hna o;

    static {
        new khn("CastClientImpl", (String) null);
        a = new Object();
        I = new Object();
    }

    public khb(Context context, Looper looper, kqd kqdVar, CastDevice castDevice, hna hnaVar, Bundle bundle, kna knaVar, knb knbVar) {
        super(context, looper, 10, kqdVar, knaVar, knbVar);
        this.c = castDevice;
        this.o = hnaVar;
        this.J = bundle;
        this.d = new HashMap();
        new AtomicLong(0L);
        this.M = new HashMap();
        k();
        o();
    }

    private final void R() {
        khn.e();
        Map map = this.d;
        synchronized (map) {
            map.clear();
        }
    }

    public static final void p() {
        synchronized (I) {
        }
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof khi ? (khi) iInterfaceQueryLocalInterface : new khi(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.kpz
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        khn.e();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.c);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        Bundle bundle2 = this.J;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.K = new kha(this);
        kha khaVar = this.K;
        khaVar.asBinder();
        bundle.putParcelable("listener", new BinderWrapper(khaVar));
        String str = this.m;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.n;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // defpackage.kpz
    public final Bundle j() {
        Bundle bundle = this.L;
        if (bundle == null) {
            return null;
        }
        this.L = null;
        return bundle;
    }

    public final void k() {
        this.k = -1;
        this.l = -1;
        this.b = null;
        this.e = null;
        this.i = 0.0d;
        o();
        this.f = false;
        this.j = null;
    }

    @Override // defpackage.kpz
    public final void l() {
        w();
        khn.e();
        kha khaVar = this.K;
        this.K = null;
        if (khaVar == null || khaVar.q() == null) {
            khn.e();
            return;
        }
        R();
        try {
            try {
                ((khi) C()).a(ksy.ap());
            } catch (RemoteException | IllegalStateException unused) {
                khn.e();
            }
        } finally {
            super.l();
        }
    }

    @Override // defpackage.kpz
    protected final void m(int i, IBinder iBinder, Bundle bundle, int i2) {
        khn.e();
        if (i == 0) {
            this.g = true;
            this.h = true;
        } else if (i == 2300) {
            i = 2300;
            this.g = true;
            this.h = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.L = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.m(i, iBinder, bundle, i2);
    }

    public final void n(long j, int i) {
        knz knzVar;
        Map map = this.M;
        synchronized (map) {
            knzVar = (knz) map.remove(Long.valueOf(j));
        }
        if (knzVar != null) {
            knzVar.c(new Status(i, null, null, null));
        }
    }

    final void o() {
        CastDevice castDevice = this.c;
        kro.m(castDevice, "device should not be null");
        if (castDevice.e(SemanticState.Modal) || !castDevice.e(4) || castDevice.e(1)) {
            return;
        }
        String str = castDevice.e;
    }

    @Override // defpackage.kpz
    public final void q() {
        System.currentTimeMillis();
        R();
    }
}
