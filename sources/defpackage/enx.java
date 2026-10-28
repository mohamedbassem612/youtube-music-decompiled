package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class enx implements ServiceConnection {
    public final agfp a;
    public final int b;
    public final /* synthetic */ enu c;
    private final eny d;
    private final agfp e;

    public enx(enu enuVar, eny enyVar, int i) {
        this.c = enuVar;
        this.a = new agfp(enuVar.k);
        this.e = new agfp(enuVar.k);
        this.d = enyVar;
        this.b = i;
    }

    private final Long f(boolean z) {
        Long lValueOf;
        try {
            enu enuVar = this.c;
            if (z) {
                synchronized (enuVar.a) {
                    try {
                        agfp agfpVar = this.a;
                        if (!agfpVar.a) {
                            return null;
                        }
                        agfpVar.f();
                        lValueOf = Long.valueOf(agfpVar.a(TimeUnit.MILLISECONDS));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                synchronized (enuVar.a) {
                    agfp agfpVar2 = this.e;
                    if (!agfpVar2.a) {
                        return null;
                    }
                    agfpVar2.f();
                    lValueOf = Long.valueOf(agfpVar2.a(TimeUnit.MILLISECONDS));
                }
            }
            return lValueOf;
        } catch (Throwable th2) {
            eov.f("BillingClient", "Exception getting connection establishment duration.", th2);
            return null;
        }
    }

    public final void a(boolean z, int i) {
        try {
            Long lF = f(z);
            if (!z) {
                aihf aihfVarCreateBuilder = aiok.a.createBuilder();
                aihf aihfVarCreateBuilder2 = aioa.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aioa aioaVar = (aioa) aihfVarCreateBuilder2.instance;
                aioaVar.b |= 1;
                aioaVar.c = 0;
                aihfVarCreateBuilder2.copyOnWrite();
                aioa aioaVar2 = (aioa) aihfVarCreateBuilder2.instance;
                aioaVar2.b |= 32;
                aioaVar2.h = i;
                aihfVarCreateBuilder.copyOnWrite();
                aiok aiokVar = (aiok) aihfVarCreateBuilder.instance;
                aioa aioaVar3 = (aioa) aihfVarCreateBuilder2.build();
                aioaVar3.getClass();
                aiokVar.c = aioaVar3;
                aiokVar.b |= 1;
                if (lF != null) {
                    long jLongValue = lF.longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiok aiokVar2 = (aiok) aihfVarCreateBuilder.instance;
                    aiokVar2.b |= 2;
                    aiokVar2.d = jLongValue;
                }
                this.c.e.f((aiok) aihfVarCreateBuilder.build());
                return;
            }
            aihf aihfVarCreateBuilder3 = ainz.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            ainz ainzVar = (ainz) aihfVarCreateBuilder3.instance;
            ainzVar.e = 5;
            ainzVar.b |= 1;
            aihf aihfVarCreateBuilder4 = aiom.a.createBuilder();
            int i2 = this.b;
            aihfVarCreateBuilder4.copyOnWrite();
            aiom aiomVar = (aiom) aihfVarCreateBuilder4.instance;
            aiomVar.b |= 8;
            aiomVar.e = 1 == i2;
            aihfVarCreateBuilder4.copyOnWrite();
            aiom aiomVar2 = (aiom) aihfVarCreateBuilder4.instance;
            aiomVar2.b |= 16;
            aiomVar2.f = i2;
            aihfVarCreateBuilder4.copyOnWrite();
            aiom aiomVar3 = (aiom) aihfVarCreateBuilder4.instance;
            aiomVar3.b |= 32;
            aiomVar3.g = i;
            if (lF != null) {
                long jLongValue2 = lF.longValue();
                aihfVarCreateBuilder4.copyOnWrite();
                aiom aiomVar4 = (aiom) aihfVarCreateBuilder4.instance;
                aiomVar4.b |= 4;
                aiomVar4.d = jLongValue2;
            }
            enu enuVar = this.c;
            aihfVarCreateBuilder3.copyOnWrite();
            ainz ainzVar2 = (ainz) aihfVarCreateBuilder3.instance;
            aiom aiomVar5 = (aiom) aihfVarCreateBuilder4.build();
            aiomVar5.getClass();
            ainzVar2.d = aiomVar5;
            ainzVar2.c = 3;
            enuVar.j((ainz) aihfVarCreateBuilder3.build());
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }

    public final void b(eoh eohVar) {
        ArrayList arrayList;
        enu enuVar = this.c;
        synchronized (enuVar.a) {
            if (enuVar.b == 3) {
                return;
            }
            try {
                this.d.b(eohVar);
            } catch (Throwable th) {
                eov.f("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
            enu enuVar2 = this.c;
            synchronized (enuVar2.a) {
                List list = enuVar2.i;
                if (list.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                    list.clear();
                }
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        ((eny) arrayList.get(i)).b(eohVar);
                    } catch (Throwable th2) {
                        eov.f("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                    }
                }
            }
        }
    }

    public final void c(Exception exc, boolean z, int i) {
        int i2;
        eov.f("BillingClient", "Exception while invoking initialize AIDL method", exc);
        if (exc instanceof DeadObjectException) {
            i2 = 141;
        } else if (exc instanceof RemoteException) {
            i2 = 143;
        } else {
            i2 = exc instanceof SecurityException ? 142 : 140;
        }
        int i3 = i2;
        String strA = eoc.a(exc);
        this.c.m(0);
        e(enu.d(exc), i3, strA, z, i);
        b(enu.d(exc));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public final void d(Exception exc, boolean z) {
        int i;
        int i2;
        String strA;
        eov.f("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        if (exc instanceof DeadObjectException) {
            i2 = 101;
        } else {
            if (!(exc instanceof RemoteException)) {
                if (exc instanceof SecurityException) {
                    i2 = 102;
                } else {
                    i = 42;
                }
                if (i == 42) {
                    strA = eoc.a(exc);
                } else {
                    strA = null;
                }
                this.c.m(0);
                e(enu.d(exc), i, strA, z, 0);
                b(enu.d(exc));
            }
            i2 = 100;
        }
        i = i2;
        if (i == 42) {
            strA = eoc.a(exc);
        } else {
            strA = null;
        }
        this.c.m(0);
        e(enu.d(exc), i, strA, z, 0);
        b(enu.d(exc));
    }

    public final void e(eoh eohVar, int i, String str, boolean z, int i2) {
        try {
            aihf aihfVarCreateBuilder = aioa.a.createBuilder();
            int i3 = eohVar.a;
            aihfVarCreateBuilder.copyOnWrite();
            aioa aioaVar = (aioa) aihfVarCreateBuilder.instance;
            aioaVar.b |= 1;
            aioaVar.c = i3;
            String str2 = eohVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            aioa aioaVar2 = (aioa) aihfVarCreateBuilder.instance;
            str2.getClass();
            aioaVar2.b |= 2;
            aioaVar2.d = str2;
            aihfVarCreateBuilder.copyOnWrite();
            aioa aioaVar3 = (aioa) aihfVarCreateBuilder.instance;
            aioaVar3.e = i - 1;
            aioaVar3.b |= 4;
            aihfVarCreateBuilder.copyOnWrite();
            aioa aioaVar4 = (aioa) aihfVarCreateBuilder.instance;
            aioaVar4.b |= 32;
            aioaVar4.h = i2;
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                aioa aioaVar5 = (aioa) aihfVarCreateBuilder.instance;
                aioaVar5.b |= 8;
                aioaVar5.f = str;
            }
            Long lF = f(z);
            if (!z) {
                aihf aihfVarCreateBuilder2 = aiok.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aiok aiokVar = (aiok) aihfVarCreateBuilder2.instance;
                aioa aioaVar6 = (aioa) aihfVarCreateBuilder.build();
                aioaVar6.getClass();
                aiokVar.c = aioaVar6;
                aiokVar.b |= 1;
                if (lF != null) {
                    long jLongValue = lF.longValue();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aiok aiokVar2 = (aiok) aihfVarCreateBuilder2.instance;
                    aiokVar2.b |= 2;
                    aiokVar2.d = jLongValue;
                }
                this.c.e.f((aiok) aihfVarCreateBuilder2.build());
                return;
            }
            aihf aihfVarCreateBuilder3 = aiom.a.createBuilder();
            int i4 = this.b;
            aihfVarCreateBuilder3.copyOnWrite();
            aiom aiomVar = (aiom) aihfVarCreateBuilder3.instance;
            aiomVar.b |= 8;
            aiomVar.e = 1 == i4;
            aihfVarCreateBuilder3.copyOnWrite();
            aiom aiomVar2 = (aiom) aihfVarCreateBuilder3.instance;
            aiomVar2.b |= 16;
            aiomVar2.f = i4;
            aihfVarCreateBuilder3.copyOnWrite();
            aiom aiomVar3 = (aiom) aihfVarCreateBuilder3.instance;
            aiomVar3.b |= 32;
            aiomVar3.g = i2;
            if (lF != null) {
                long jLongValue2 = lF.longValue();
                aihfVarCreateBuilder3.copyOnWrite();
                aiom aiomVar4 = (aiom) aihfVarCreateBuilder3.instance;
                aiomVar4.b |= 4;
                aiomVar4.d = jLongValue2;
            }
            enu enuVar = this.c;
            aihf aihfVarCreateBuilder4 = ainy.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            ainy ainyVar = (ainy) aihfVarCreateBuilder4.instance;
            aioa aioaVar7 = (aioa) aihfVarCreateBuilder.build();
            aioaVar7.getClass();
            ainyVar.f = aioaVar7;
            ainyVar.b |= 2;
            aihfVarCreateBuilder4.copyOnWrite();
            ainy ainyVar2 = (ainy) aihfVarCreateBuilder4.instance;
            ainyVar2.e = 5;
            ainyVar2.b |= 1;
            aihfVarCreateBuilder4.copyOnWrite();
            ainy ainyVar3 = (ainy) aihfVarCreateBuilder4.instance;
            aiom aiomVar5 = (aiom) aihfVarCreateBuilder3.build();
            aiomVar5.getClass();
            ainyVar3.d = aiomVar5;
            ainyVar3.c = 6;
            enuVar.i((ainy) aihfVarCreateBuilder4.build());
        } catch (Throwable th) {
            eov.f("BillingClient", "Unable to log.", th);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        ArrayList arrayList;
        eov.e("BillingClient", "Billing service died.");
        try {
            enu enuVar = this.c;
            if (enuVar.r()) {
                eod eodVar = enuVar.e;
                aihf aihfVarCreateBuilder = ainy.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ainy ainyVar = (ainy) aihfVarCreateBuilder.instance;
                ainyVar.e = 5;
                ainyVar.b |= 1;
                aihf aihfVarCreateBuilder2 = aioa.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aioa aioaVar = (aioa) aihfVarCreateBuilder2.instance;
                aioaVar.e = 121;
                aioaVar.b |= 4;
                aihfVarCreateBuilder.copyOnWrite();
                ainy ainyVar2 = (ainy) aihfVarCreateBuilder.instance;
                aioa aioaVar2 = (aioa) aihfVarCreateBuilder2.build();
                aioaVar2.getClass();
                ainyVar2.f = aioaVar2;
                ainyVar2.b |= 2;
                aihf aihfVarCreateBuilder3 = aiom.a.createBuilder();
                int i = this.b;
                aihfVarCreateBuilder3.copyOnWrite();
                aiom aiomVar = (aiom) aihfVarCreateBuilder3.instance;
                aiomVar.b |= 8;
                aiomVar.e = 1 == i;
                aihfVarCreateBuilder3.copyOnWrite();
                aiom aiomVar2 = (aiom) aihfVarCreateBuilder3.instance;
                aiomVar2.b |= 16;
                aiomVar2.f = i;
                aihfVarCreateBuilder.copyOnWrite();
                ainy ainyVar3 = (ainy) aihfVarCreateBuilder.instance;
                aiom aiomVar3 = (aiom) aihfVarCreateBuilder3.build();
                aiomVar3.getClass();
                ainyVar3.d = aiomVar3;
                ainyVar3.c = 6;
                eodVar.a((ainy) aihfVarCreateBuilder.build());
            } else {
                eod eodVar2 = enuVar.e;
                aiob aiobVar = aiob.a;
                try {
                    aihf aihfVarCreateBuilder4 = aioi.a.createBuilder();
                    aiof aiofVar = ((eok) eodVar2).b;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aioi aioiVar = (aioi) aihfVarCreateBuilder4.instance;
                    aiofVar.getClass();
                    aioiVar.e = aiofVar;
                    aioiVar.b |= 1;
                    aihfVarCreateBuilder4.copyOnWrite();
                    aioi aioiVar2 = (aioi) aihfVarCreateBuilder4.instance;
                    aiobVar.getClass();
                    aioiVar2.d = aiobVar;
                    aioiVar2.c = 7;
                    ((eok) eodVar2).c.a((aioi) aihfVarCreateBuilder4.build());
                } catch (Throwable th) {
                    eov.f("BillingLogger", "Unable to log.", th);
                }
            }
        } catch (Throwable th2) {
            eov.f("BillingClient", "Unable to log.", th2);
        }
        enu enuVar2 = this.c;
        Object obj = enuVar2.a;
        synchronized (obj) {
            if (enuVar2.b == 3 || enuVar2.b == 0) {
                return;
            }
            enuVar2.m(0);
            enuVar2.q();
            synchronized (obj) {
                List list = enuVar2.i;
                if (list.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                    list.clear();
                }
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    try {
                        ((eny) arrayList.get(i2)).b(eoi.g);
                    } catch (Throwable th3) {
                        eov.f("BillingClient", "Exception while calling parked onBillingServiceDisconnected.", th3);
                    }
                }
            }
            try {
                this.d.a();
            } catch (Throwable th4) {
                eov.f("BillingClient", "Exception while calling onBillingServiceDisconnected.", th4);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        epv epvVar;
        eoh eohVar;
        int i = eov.a;
        enu enuVar = this.c;
        Object obj = enuVar.a;
        synchronized (obj) {
            if (enuVar.b == 3) {
                return;
            }
            if (iBinder == null) {
                epvVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                epvVar = iInterfaceQueryLocalInterface instanceof epv ? (epv) iInterfaceQueryLocalInterface : new epv(iBinder);
            }
            enuVar.l = epvVar;
            if (enuVar.g(new Callable() { // from class: enw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    epv epvVar2;
                    int i2;
                    enx enxVar = this.a;
                    enu enuVar2 = enxVar.c;
                    Object obj2 = enuVar2.a;
                    synchronized (obj2) {
                        if (enuVar2.b == 3) {
                            return null;
                        }
                        int i3 = 0;
                        boolean z = true;
                        boolean z2 = enuVar2.b == 1;
                        if (TextUtils.isEmpty(enuVar2.j)) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            eov.g(bundle, enuVar2.c());
                        }
                        synchronized (obj2) {
                            epvVar2 = enuVar2.l;
                        }
                        if (epvVar2 == null) {
                            enu enuVar3 = enxVar.c;
                            enuVar3.m(0);
                            int i4 = enxVar.b;
                            eoh eohVar2 = eoi.g;
                            enuVar3.u(119, eohVar2, i4);
                            enxVar.b(eohVar2);
                            return null;
                        }
                        String packageName = enxVar.c.d.getPackageName();
                        try {
                            if (epvVar2.a(25, packageName, "inapp") == 0) {
                                enu enuVar4 = enxVar.c;
                                long jG = zi.g(enuVar4.d);
                                long jH = zi.h(enuVar4.d);
                                double dF = zi.f(enuVar4.d);
                                long jI = zi.i(enuVar4.d);
                                Exception e = null;
                                while (true) {
                                    long j = i3;
                                    if (j <= jG) {
                                        try {
                                            Boolean boolValueOf = Boolean.valueOf(z2);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("callingPackage", enuVar4.d.getPackageName());
                                            eov.g(bundle2, enuVar4.c());
                                            if (enuVar4.n != null) {
                                                bundle2.putBoolean("enablePendingPurchases", z);
                                            }
                                            String packageName2 = enuVar4.d.getPackageName();
                                            epu epuVar = new epu(enuVar4, enxVar, boolValueOf, i3);
                                            Parcel parcelC = epvVar2.c();
                                            parcelC.writeInt(25);
                                            parcelC.writeString(packageName2);
                                            gdc.c(parcelC, bundle2);
                                            gdc.e(parcelC, epuVar);
                                            epvVar2.f(2101, parcelC);
                                            return null;
                                        } catch (SecurityException e2) {
                                            enxVar.c(e2, z2, i3);
                                            return null;
                                        } catch (Exception e3) {
                                            e = e3;
                                            if (j != jG) {
                                                eov.f("BillingClient", a.cf(jH, "Transient error during initialize(), retrying in ", "ms"), e);
                                                try {
                                                    Thread.sleep(jH);
                                                    jH = (long) Math.min(jH * dF, jI);
                                                    i3++;
                                                    z = true;
                                                } catch (InterruptedException e4) {
                                                    Thread.currentThread().interrupt();
                                                    enxVar.c(e4, z2, i3);
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                    enxVar.c(e, z2, i3);
                                    return null;
                                }
                            }
                            int i5 = 30;
                            int iA = 3;
                            while (true) {
                                if (i5 < 3) {
                                    i5 = 0;
                                    break;
                                }
                                try {
                                    int i6 = eov.a;
                                    iA = bundle == null ? epvVar2.a(i5, packageName, "subs") : epvVar2.b(i5, packageName, "subs", bundle);
                                    if (iA == 0) {
                                        break;
                                    }
                                    i5--;
                                } catch (Exception e5) {
                                    enxVar.d(e5, z2);
                                    return null;
                                }
                            }
                            enu enuVar5 = enxVar.c;
                            enuVar5.f = i5 >= 3;
                            if (i5 < 3) {
                                int i7 = eov.a;
                                i2 = 9;
                            } else {
                                i2 = 1;
                            }
                            for (int i8 = 30; i8 >= 3; i8--) {
                                int i9 = eov.a;
                                iA = bundle == null ? epvVar2.a(i8, packageName, "inapp") : epvVar2.b(i8, packageName, "inapp", bundle);
                                if (iA == 0) {
                                    enuVar5.g = i8;
                                    break;
                                }
                            }
                            enuVar5.l(enuVar5.g);
                            if (enuVar5.g < 3) {
                                eov.e("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i2 = 36;
                            }
                            enuVar5.n(iA);
                            if (iA == 0) {
                                enxVar.a(z2, 0);
                                enxVar.b(eoi.f);
                                return null;
                            }
                            eoh eohVar3 = eoi.a;
                            enxVar.e(eohVar3, i2, null, z2, 0);
                            enxVar.b(eohVar3);
                            return null;
                        } catch (Exception e6) {
                            enxVar.d(e6, z2);
                            return null;
                        }
                    }
                }
            }, 30000L, new dxk(this, 4), Looper.myLooper() == null ? enuVar.c : new Handler(Looper.myLooper())) == null) {
                int[] iArr = {0, 3};
                synchronized (obj) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (enuVar.b == iArr[i2]) {
                            eohVar = eoi.g;
                        }
                    }
                    eohVar = eoi.e;
                }
                this.c.u(25, eohVar, this.b);
                b(eohVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ArrayList arrayList;
        eov.e("BillingClient", "Billing service disconnected.");
        try {
            enu enuVar = this.c;
            if (enuVar.r()) {
                eod eodVar = enuVar.e;
                aihf aihfVarCreateBuilder = ainy.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ainy ainyVar = (ainy) aihfVarCreateBuilder.instance;
                ainyVar.e = 5;
                ainyVar.b |= 1;
                aihf aihfVarCreateBuilder2 = aioa.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aioa aioaVar = (aioa) aihfVarCreateBuilder2.instance;
                aioaVar.e = 120;
                aioaVar.b |= 4;
                aihfVarCreateBuilder.copyOnWrite();
                ainy ainyVar2 = (ainy) aihfVarCreateBuilder.instance;
                aioa aioaVar2 = (aioa) aihfVarCreateBuilder2.build();
                aioaVar2.getClass();
                ainyVar2.f = aioaVar2;
                ainyVar2.b |= 2;
                aihf aihfVarCreateBuilder3 = aiom.a.createBuilder();
                int i = this.b;
                aihfVarCreateBuilder3.copyOnWrite();
                aiom aiomVar = (aiom) aihfVarCreateBuilder3.instance;
                aiomVar.b |= 8;
                aiomVar.e = 1 == i;
                aihfVarCreateBuilder3.copyOnWrite();
                aiom aiomVar2 = (aiom) aihfVarCreateBuilder3.instance;
                aiomVar2.b |= 16;
                aiomVar2.f = i;
                aihfVarCreateBuilder.copyOnWrite();
                ainy ainyVar3 = (ainy) aihfVarCreateBuilder.instance;
                aiom aiomVar3 = (aiom) aihfVarCreateBuilder3.build();
                aiomVar3.getClass();
                ainyVar3.d = aiomVar3;
                ainyVar3.c = 6;
                eodVar.a((ainy) aihfVarCreateBuilder.build());
            } else {
                eod eodVar2 = enuVar.e;
                aiol aiolVar = aiol.a;
                if (aiolVar != null) {
                    try {
                        aihf aihfVarCreateBuilder4 = aioi.a.createBuilder();
                        aiof aiofVar = ((eok) eodVar2).b;
                        aihfVarCreateBuilder4.copyOnWrite();
                        aioi aioiVar = (aioi) aihfVarCreateBuilder4.instance;
                        aiofVar.getClass();
                        aioiVar.e = aiofVar;
                        aioiVar.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        aioi aioiVar2 = (aioi) aihfVarCreateBuilder4.instance;
                        aioiVar2.d = aiolVar;
                        aioiVar2.c = 4;
                        ((eok) eodVar2).c.a((aioi) aihfVarCreateBuilder4.build());
                    } catch (Throwable th) {
                        eov.f("BillingLogger", "Unable to log.", th);
                    }
                }
            }
        } catch (Throwable th2) {
            eov.f("BillingClient", "Unable to log.", th2);
        }
        enu enuVar2 = this.c;
        Object obj = enuVar2.a;
        synchronized (obj) {
            if (!eoj.b) {
                agfp agfpVar = this.e;
                agfpVar.d();
                agfpVar.e();
                if (enuVar2.b == 3) {
                    return;
                }
            } else {
                if (enuVar2.b == 3 || enuVar2.b == 0) {
                    return;
                }
                agfp agfpVar2 = this.e;
                agfpVar2.d();
                agfpVar2.e();
            }
            enuVar2.m(0);
            synchronized (obj) {
                List list = enuVar2.i;
                if (list.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                    list.clear();
                }
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    try {
                        ((eny) arrayList.get(i2)).b(eoi.g);
                    } catch (Throwable th3) {
                        eov.f("BillingClient", "Exception while calling parked onBillingServiceDisconnected.", th3);
                    }
                }
            }
            try {
                this.d.a();
            } catch (Throwable th4) {
                eov.f("BillingClient", "Exception while calling onBillingServiceDisconnected.", th4);
            }
        }
    }
}
