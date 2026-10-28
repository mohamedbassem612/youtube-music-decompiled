package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqx {
    public Object c;
    private final Context d;
    private final lqt g;
    public final Object a = new Object();
    private boolean e = false;
    private boolean f = false;
    public final String b = "BarcodeNativeHandle";

    public lqx(Context context, lqt lqtVar) {
        this.d = context;
        this.g = lqtVar;
        a();
    }

    public final Object a() {
        kvc kvcVarD;
        lqw lqwVar;
        synchronized (this.a) {
            Object obj = this.c;
            if (obj != null) {
                return obj;
            }
            Context context = this.d;
            lqv lqvVar = null;
            try {
                kvcVarD = kvc.d(context, kvc.e, "com.google.android.gms.vision.dynamite.barcode");
            } catch (kuy unused) {
                String str = String.format("%s.%s", "com.google.android.gms.vision", "barcode");
                try {
                    kvcVarD = kvc.d(context, kvc.a, str);
                } catch (kuy e) {
                    Object[] objArr = {str};
                    if (Log.isLoggable("Vision", 5)) {
                        Log.w("Vision", String.format("Error loading optional module %s", objArr) + ": " + e.toString());
                    }
                    kvcVarD = null;
                }
            }
            if (kvcVarD == null && !this.e) {
                Intent intent = new Intent();
                intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", "barcode");
                intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                rpi.D(this.d, intent);
                this.e = true;
            }
            if (kvcVarD != null) {
                try {
                    Context context2 = this.d;
                    IBinder iBinderC = kvcVarD.c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                    if (iBinderC == null) {
                        lqwVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                        lqwVar = iInterfaceQueryLocalInterface instanceof lqw ? (lqw) iInterfaceQueryLocalInterface : new lqw(iBinderC);
                    }
                    if (lqwVar != null) {
                        kun kunVar = new kun(context2);
                        lqt lqtVar = this.g;
                        Parcel parcelC = lqwVar.c();
                        gdc.e(parcelC, kunVar);
                        gdc.c(parcelC, lqtVar);
                        Parcel parcelD = lqwVar.d(1, parcelC);
                        IBinder strongBinder = parcelD.readStrongBinder();
                        if (strongBinder != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                            lqvVar = iInterfaceQueryLocalInterface2 instanceof lqv ? (lqv) iInterfaceQueryLocalInterface2 : new lqv(strongBinder);
                        }
                        parcelD.recycle();
                    }
                    this.c = lqvVar;
                } catch (RemoteException | kuy e2) {
                    Log.e(this.b, "Error creating remote native handle", e2);
                }
            }
            boolean z = this.f;
            Object obj2 = this.c;
            if (z) {
                if (obj2 != null) {
                    Log.w(this.b, "Native handle is now available.");
                }
            } else if (obj2 == null) {
                Log.w(this.b, "Native handle not yet available. Reverting to no-op handle.");
                this.f = true;
            }
            return this.c;
        }
    }

    public final boolean b() {
        return a() != null;
    }
}
