package com.google.vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.aujx;
import defpackage.auke;
import defpackage.aulb;
import defpackage.aulc;
import defpackage.gdc;
import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class VrCoreLibraryLoader {
    public static long loadNativeDlsymMethod(Context context) {
        return 0L;
    }

    public static long loadNativeGvrLibrary(Context context, aujx aujxVar, aujx aujxVar2) {
        long j;
        aulb aulbVar;
        int i;
        int i2;
        int i3;
        int i4;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", SemanticState.Focused);
                if (applicationInfo == null) {
                    throw new auke(8);
                }
                if (!applicationInfo.enabled) {
                    throw new auke(2);
                }
                if (applicationInfo.metaData == null) {
                    throw new auke(4);
                }
                String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new auke(4);
                }
                String strSubstring = string.substring(1);
                aujx aujxVarA = aujx.a(strSubstring);
                if (aujxVarA == null) {
                    throw new auke(4);
                }
                int i5 = aujxVarA.c;
                int i6 = aujxVar.c;
                if (i5 <= i6 && (i5 < i6 || ((i = aujxVarA.d) <= (i2 = aujxVar.d) && (i < i2 || ((i3 = aujxVarA.e) <= (i4 = aujxVar.e) && i3 < i4))))) {
                    Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", strSubstring, aujxVar.toString()));
                    throw new auke(4);
                }
                Context contextR = CommonApis.r(context);
                CommonApis.r(context);
                int i7 = CommonApis.a;
                aulc aulcVar = null;
                if (CommonApis.b == null) {
                    IBinder iBinderS = CommonApis.s(CommonApis.r(context).getClassLoader());
                    if (iBinderS == null) {
                        aulbVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderS.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                        aulbVar = iInterfaceQueryLocalInterface instanceof aulb ? (aulb) iInterfaceQueryLocalInterface : new aulb(iBinderS);
                    }
                    CommonApis.b = aulbVar;
                }
                aulb aulbVar2 = CommonApis.b;
                ObjectWrapper objectWrapper = new ObjectWrapper(contextR);
                ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                Parcel parcelC = aulbVar2.c();
                gdc.e(parcelC, objectWrapper);
                gdc.e(parcelC, objectWrapper2);
                Parcel parcelD = aulbVar2.d(4, parcelC);
                IBinder strongBinder = parcelD.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
                    aulcVar = iInterfaceQueryLocalInterface2 instanceof aulc ? (aulc) iInterfaceQueryLocalInterface2 : new aulc(strongBinder);
                }
                parcelD.recycle();
                if (aulcVar == null) {
                    Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                    return 0L;
                }
                if (i7 < 19) {
                    int i8 = aujxVar2.c;
                    int i9 = aujxVar2.d;
                    int i10 = aujxVar2.e;
                    Parcel parcelC2 = aulcVar.c();
                    parcelC2.writeInt(i8);
                    parcelC2.writeInt(i9);
                    parcelC2.writeInt(i10);
                    Parcel parcelD2 = aulcVar.d(2, parcelC2);
                    j = parcelD2.readLong();
                    parcelD2.recycle();
                } else {
                    String string2 = aujxVar.toString();
                    String string3 = aujxVar2.toString();
                    Parcel parcelC3 = aulcVar.c();
                    parcelC3.writeString(string2);
                    parcelC3.writeString(string3);
                    Parcel parcelD3 = aulcVar.d(5, parcelC3);
                    j = parcelD3.readLong();
                    parcelD3.recycle();
                }
                return j;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new auke(VrCoreUtils.a(context));
            }
        } catch (RemoteException | auke | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
            Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(e.toString()));
            return 0L;
        }
    }

    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, aujx.b, aujx.a);
    }
}
