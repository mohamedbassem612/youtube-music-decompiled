package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahek {
    public final boolean a;
    public final Object b;

    public ahek(awmd awmdVar, tqj tqjVar) {
        awmdVar.getClass();
        this.b = awmdVar;
        this.a = tym.ap(tqjVar);
    }

    public static ahek e(Context context, String str) {
        kwz kwxVar;
        try {
            try {
                try {
                    IBinder iBinderC = kvc.d(context, kvc.a, "com.google.android.gms.ads.dynamite").c("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderC == null) {
                        kwxVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        kwxVar = iInterfaceQueryLocalInterface instanceof kwz ? (kwz) iInterfaceQueryLocalInterface : new kwx(iBinderC);
                    }
                    kwxVar.i(new kun(context), str);
                    return new ahek(kwxVar);
                } catch (Exception e) {
                    throw new kwl(e);
                }
            } catch (Exception e2) {
                throw new kwl(e2);
            }
        } catch (RemoteException | NullPointerException | SecurityException | kwl unused) {
            return new ahek(new kwy());
        }
    }

    public final ListenableFuture a(Callable callable, Executor executor) {
        return new ahdr((agjw) this.b, this.a, executor, callable);
    }

    public final ListenableFuture b(ahcx ahcxVar, Executor executor) {
        return new ahdr((agjw) this.b, this.a, executor, ahcxVar);
    }

    public final ListenableFuture c(Runnable runnable, Executor executor) {
        return a(Executors.callable(runnable), executor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    public final admo d(admh admhVar) {
        ci ciVar = (ci) this.b.io();
        ciVar.getClass();
        admhVar.getClass();
        return new admo(ciVar, admhVar, this.a, false);
    }

    public ahek(boolean z, agke agkeVar) {
        this.a = z;
        this.b = agkeVar;
    }

    public ahek(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public ahek(mbc mbcVar, agev agevVar) {
        this.b = mbcVar;
        this.a = agevVar.g();
    }

    public ahek(kwz kwzVar) {
        this.b = kwzVar;
        this.a = kwzVar != null;
    }
}
