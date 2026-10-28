package com.google.vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.a;
import defpackage.afjc;
import defpackage.aihf;
import defpackage.auke;
import defpackage.aukn;
import defpackage.auko;
import defpackage.aukq;
import defpackage.aukr;
import defpackage.aukt;
import defpackage.aukx;
import defpackage.auky;
import defpackage.aukz;
import defpackage.aula;
import defpackage.gdc;
import defpackage.kkn;
import defpackage.qd;
import defpackage.twp;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class ControllerServiceBridge implements ServiceConnection {
    public static final /* synthetic */ int h = 0;
    private static final AtomicInteger i = new AtomicInteger(-1);
    public final Context a;
    public final Handler b;
    final String c;
    public final SparseArray d;
    public boolean e;
    public aukx f;
    public twp g;
    private final int j;
    private final kkn k;

    /* JADX INFO: compiled from: PG */
    public interface Callbacks {
        void a(auko aukoVar);

        void b(aukn auknVar);

        void c(aukr aukrVar);

        void d(int i, int i2);

        void e();

        void f();

        void g(int i);

        void h();

        void i();
    }

    public ControllerServiceBridge(Context context, Callbacks callbacks, int i2) {
        aukq aukqVar = new aukq(i2);
        SparseArray sparseArray = new SparseArray();
        this.d = sparseArray;
        this.a = context.getApplicationContext();
        int vrCoreClientApiVersion = 0;
        twp twpVar = new twp(callbacks, aukqVar, 0);
        this.g = twpVar;
        sparseArray.put(twpVar.a, twpVar);
        this.b = new Handler(Looper.getMainLooper());
        this.k = new kkn(this, 3);
        try {
            vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
        } catch (auke unused) {
        }
        this.j = vrCoreClientApiVersion;
        this.c = "VrCtl.ServiceBridge" + i.incrementAndGet();
    }

    public static final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This should be running on the main thread.");
        }
    }

    private final boolean e(int i2, twp twpVar) {
        try {
            aukx aukxVar = this.f;
            String str = this.c;
            kkn kknVar = new kkn(twpVar, 2);
            Parcel parcelC = aukxVar.c();
            parcelC.writeInt(i2);
            parcelC.writeString(str);
            gdc.e(parcelC, kknVar);
            Parcel parcelD = aukxVar.d(5, parcelC);
            boolean zF = gdc.f(parcelD);
            parcelD.recycle();
            return zF;
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", e);
        }
    }

    public final void a() {
        d();
        if (!this.e) {
            Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
            return;
        }
        d();
        aukx aukxVar = this.f;
        if (aukxVar != null) {
            try {
                String str = this.c;
                Parcel parcelC = aukxVar.c();
                parcelC.writeString(str);
                Parcel parcelD = aukxVar.d(6, parcelC);
                gdc.f(parcelD);
                parcelD.recycle();
            } catch (RemoteException e) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", e);
            }
        }
        if (this.j >= 21) {
            try {
                aukx aukxVar2 = this.f;
                if (aukxVar2 != null) {
                    kkn kknVar = this.k;
                    Parcel parcelC2 = aukxVar2.c();
                    gdc.e(parcelC2, kknVar);
                    Parcel parcelD2 = aukxVar2.d(9, parcelC2);
                    boolean zF = gdc.f(parcelD2);
                    parcelD2.recycle();
                    if (!zF) {
                        Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                    }
                }
            } catch (RemoteException e2) {
                Log.w("VrCtl.ServiceBridge", "Exception while unregistering remote service listener: ".concat(e2.toString()));
            }
        }
        this.a.unbindService(this);
        this.f = null;
        this.e = false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    public final void b() {
        this.g.b.i();
        twp twpVar = this.g;
        if (e(twpVar.a, twpVar)) {
            SparseArray sparseArray = this.d;
            twp twpVar2 = this.g;
            sparseArray.put(twpVar2.a, twpVar2);
        } else {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            this.g.b.f();
            a();
        }
    }

    public final void c(int i2, aukt auktVar) {
        d();
        aukx aukxVar = this.f;
        if (aukxVar == null) {
            Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
            return;
        }
        try {
            Parcel parcelC = aukxVar.c();
            parcelC.writeInt(i2);
            gdc.c(parcelC, auktVar);
            aukxVar.e(11, parcelC);
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", e);
        }
    }

    public void controllerHapticsEffect(int i2, int i3, int i4) {
        aihf aihfVarCreateBuilder = aula.a.createBuilder();
        aihf aihfVarCreateBuilder2 = auky.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        auky aukyVar = (auky) aihfVarCreateBuilder2.instance;
        aukyVar.b |= 1;
        aukyVar.c = i3;
        aihfVarCreateBuilder2.copyOnWrite();
        auky aukyVar2 = (auky) aihfVarCreateBuilder2.instance;
        aukyVar2.b |= 2;
        aukyVar2.d = i4;
        auky aukyVar3 = (auky) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        aula aulaVar = (aula) aihfVarCreateBuilder.instance;
        aukyVar3.getClass();
        aulaVar.d = aukyVar3;
        aulaVar.b |= 2;
        aula aulaVar2 = (aula) aihfVarCreateBuilder.build();
        aukt auktVar = new aukt();
        auktVar.a(aulaVar2);
        this.b.post(new qd(this, i2, auktVar, 20));
    }

    public boolean createAndConnectController(int i2, Callbacks callbacks, int i3) {
        aukq aukqVar = new aukq(i3);
        d();
        if (this.f == null) {
            return false;
        }
        twp twpVar = new twp(callbacks, aukqVar, i2);
        int i4 = twpVar.a;
        if (e(i4, twpVar)) {
            if (i4 == 0) {
                this.g = twpVar;
            }
            this.d.put(i2, twpVar);
            return true;
        }
        if (i2 == 0) {
            Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
            i2 = 0;
        }
        this.d.remove(i2);
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aukx aukxVar;
        String strCi;
        d();
        if (this.e) {
            if (iBinder == null) {
                aukxVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                aukxVar = iInterfaceQueryLocalInterface instanceof aukx ? (aukx) iInterfaceQueryLocalInterface : new aukx(iBinder);
            }
            this.f = aukxVar;
            try {
                Parcel parcelC = aukxVar.c();
                parcelC.writeInt(25);
                Parcel parcelD = aukxVar.d(1, parcelC);
                int i2 = parcelD.readInt();
                parcelD.recycle();
                if (i2 != 0) {
                    if (i2 == 0) {
                        strCi = "SUCCESS";
                    } else if (i2 == 1) {
                        strCi = "FAILED_UNSUPPORTED";
                    } else if (i2 != 2) {
                        strCi = i2 != 3 ? a.ci((byte) 93, i2, "[UNKNOWN CONTROLLER INIT RESULT: ") : "FAILED_CLIENT_OBSOLETE";
                    } else {
                        strCi = "FAILED_NOT_AUTHORIZED";
                    }
                    Log.e("VrCtl.ServiceBridge", "initialize() returned error: ".concat(strCi));
                    this.g.b.g(i2);
                    a();
                    return;
                }
                if (this.j >= 21) {
                    try {
                        aukx aukxVar2 = this.f;
                        kkn kknVar = this.k;
                        Parcel parcelC2 = aukxVar2.c();
                        gdc.e(parcelC2, kknVar);
                        Parcel parcelD2 = aukxVar2.d(8, parcelC2);
                        boolean zF = gdc.f(parcelD2);
                        parcelD2.recycle();
                        if (!zF) {
                            Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                            this.g.b.g(0);
                            a();
                            return;
                        }
                    } catch (RemoteException e) {
                        Log.w("VrCtl.ServiceBridge", "Exception while registering remote service listener: ".concat(e.toString()));
                    }
                }
                b();
            } catch (RemoteException e2) {
                Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", e2);
                this.g.b.f();
                a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d();
        this.f = null;
        this.g.b.e();
    }

    public void requestBind() {
        this.b.post(new afjc(this, 15));
    }

    public void requestUnbind() {
        this.b.post(new afjc(this, 13));
    }

    public void vibrateController(final int i2, int i3, int i4, int i5) {
        aihf aihfVarCreateBuilder = aula.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aukz.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aukz aukzVar = (aukz) aihfVarCreateBuilder2.instance;
        aukzVar.b |= 1;
        aukzVar.c = i3;
        aihfVarCreateBuilder2.copyOnWrite();
        aukz aukzVar2 = (aukz) aihfVarCreateBuilder2.instance;
        aukzVar2.b |= 2;
        aukzVar2.d = i4;
        aihfVarCreateBuilder2.copyOnWrite();
        aukz aukzVar3 = (aukz) aihfVarCreateBuilder2.instance;
        aukzVar3.b |= 4;
        aukzVar3.e = i5;
        aukz aukzVar4 = (aukz) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        aula aulaVar = (aula) aihfVarCreateBuilder.instance;
        aukzVar4.getClass();
        aulaVar.c = aukzVar4;
        aulaVar.b |= 1;
        aula aulaVar2 = (aula) aihfVarCreateBuilder.build();
        final aukt auktVar = new aukt();
        auktVar.a(aulaVar2);
        this.b.post(new Runnable() { // from class: auku
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(i2, auktVar);
            }
        });
    }
}
