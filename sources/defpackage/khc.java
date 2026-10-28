package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class khc extends kqs {
    private final CastDevice a;
    private final Bundle b;
    private final String c;

    static {
        new khn("CastClientImplCxless", (String) null);
    }

    public khc(Context context, Looper looper, kqd kqdVar, CastDevice castDevice, Bundle bundle, String str, kna knaVar, knb knbVar) {
        super(context, looper, 10, kqdVar, knaVar, knbVar);
        this.a = castDevice;
        this.b = bundle;
        this.c = str;
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 19390000;
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
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kaf.p;
    }

    @Override // defpackage.kpz
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        khn.e();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.a);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        bundle.putString("connectionless_client_record_id", this.c);
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // defpackage.kpz
    public final void l() {
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
}
