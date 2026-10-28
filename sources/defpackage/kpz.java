package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kpz {
    private static final klq[] N = new klq[0];
    public klo A;
    public volatile kqi B;
    protected AtomicInteger C;
    public volatile int D;
    public krg E;
    agfm F;
    private volatile String O;
    private final kqy c;
    private final klu d;
    private final Object e;
    private IInterface f;
    private kpv g;
    private int h;
    private final String i;
    public final Context p;
    public final Looper q;
    final Handler r;
    public final Object s;
    protected kpu t;
    public final ArrayList u;
    public final kpq v;
    public final kpr w;
    public final int x;
    public volatile String y;
    public volatile ktd z;

    protected kpz(Context context, Looper looper, kqy kqyVar, klu kluVar, int i, kpq kpqVar, kpr kprVar, String str) {
        this.O = null;
        this.e = new Object();
        this.s = new Object();
        this.u = new ArrayList();
        this.h = 1;
        this.A = null;
        this.B = null;
        this.C = new AtomicInteger(0);
        this.D = -1;
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.p = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        this.q = looper;
        if (kqyVar == null) {
            throw new NullPointerException("Supervisor must not be null");
        }
        this.c = kqyVar;
        if (kluVar == null) {
            throw new NullPointerException("API availability must not be null");
        }
        this.d = kluVar;
        this.r = new kps(this, looper);
        this.x = i;
        this.v = kpqVar;
        this.w = kprVar;
        this.i = str;
    }

    public final void A(qcb qcbVar) {
        ((kol) qcbVar.a).l.q.post(new kcx(qcbVar, 12, null));
    }

    public Account B() {
        return null;
    }

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.e) {
            if (this.h == 5) {
                throw new DeadObjectException();
            }
            if (!w()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.f;
            if (iInterface == null) {
                throw new NullPointerException("Client is connected but service is null");
            }
        }
        return iInterface;
    }

    protected final String D() {
        String str = this.i;
        return str == null ? this.p.getClass().getName() : str;
    }

    public final String E() {
        kqi kqiVar = this.B;
        if (kqiVar == null) {
            return null;
        }
        return kqiVar.f;
    }

    protected Set F() {
        return Collections.EMPTY_SET;
    }

    protected Executor G() {
        return null;
    }

    public final void H() {
        int iM = this.d.m(this.p, a());
        if (iM == 0) {
            u(new kpw(this));
            return;
        }
        N(1, null, -1);
        this.t = new kpw(this);
        Handler handler = this.r;
        handler.sendMessage(handler.obtainMessage(3, this.C.get(), iM, null));
    }

    protected final void I(int i, Bundle bundle, int i2) {
        kpy kpyVar = new kpy(this, i, bundle, i2);
        Handler handler = this.r;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, kpyVar));
    }

    public final void J(int i) {
        int i2 = this.C.get();
        Handler handler = this.r;
        handler.sendMessage(handler.obtainMessage(6, i2, i));
    }

    public final boolean K(int i, int i2, IInterface iInterface, int i3) {
        synchronized (this.e) {
            if (this.h != i) {
                return false;
            }
            return N(i2, iInterface, i3);
        }
    }

    public final boolean L() {
        return this.B != null;
    }

    public boolean M() {
        return false;
    }

    public final boolean N(int i, IInterface iInterface, int i2) {
        agfm agfmVar;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.e) {
            if (i2 != -1) {
                if (i2 != this.C.get()) {
                    return false;
                }
            }
            if (i == 2) {
                this.D = -1;
                i = 2;
            }
            this.h = i;
            this.f = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                kpv kpvVar = this.g;
                if (kpvVar != null) {
                    kqy kqyVar = this.c;
                    agfm agfmVar2 = this.F;
                    Object obj = agfmVar2.d;
                    Object obj2 = agfmVar2.c;
                    int i3 = agfmVar2.b;
                    D();
                    kqyVar.f(new kqx((String) obj, this.F.a), kpvVar);
                    this.g = null;
                }
            } else if (i == 2 || i == 3) {
                kpv kpvVar2 = this.g;
                if (kpvVar2 != null && (agfmVar = this.F) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) agfmVar.d) + " on " + ((String) agfmVar.c));
                    kqy kqyVar2 = this.c;
                    agfm agfmVar3 = this.F;
                    Object obj3 = agfmVar3.d;
                    Object obj4 = agfmVar3.c;
                    int i4 = agfmVar3.b;
                    D();
                    kqyVar2.f(new kqx((String) obj3, this.F.a), kpvVar2);
                    this.C.incrementAndGet();
                }
                kpv kpvVar3 = new kpv(this, this.C.get(), this.h == 3);
                this.g = kpvVar3;
                agfm agfmVar4 = new agfm(d(), S());
                this.F = agfmVar4;
                if (agfmVar4.a && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((String) agfmVar4.d));
                }
                kqy kqyVar3 = this.c;
                Object obj5 = agfmVar4.d;
                Object obj6 = agfmVar4.c;
                int i5 = agfmVar4.b;
                klo kloVarC = kqyVar3.c(new kqx((String) obj5, this.F.a), kpvVar3, D(), G());
                if (!kloVarC.d()) {
                    agfm agfmVar5 = this.F;
                    Log.w("GmsClient", "unable to connect to service: " + ((String) agfmVar5.d) + " on " + ((String) agfmVar5.c));
                    int i6 = kloVarC.c;
                    if (i6 == -1) {
                        i6 = 16;
                    }
                    if (kloVarC.a() != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", kloVarC.a());
                    }
                    I(i6, bundle, this.C.get());
                }
            } else if (i == 4) {
                if (iInterface == null) {
                    throw new NullPointerException("null reference");
                }
                System.currentTimeMillis();
            }
            return true;
        }
    }

    public boolean O() {
        return true;
    }

    public klq[] P() {
        return N;
    }

    protected void Q() {
        System.currentTimeMillis();
    }

    protected boolean S() {
        return a() >= 211700000;
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    public boolean f() {
        return false;
    }

    public klq[] g() {
        return N;
    }

    protected Bundle h() {
        return new Bundle();
    }

    public boolean i() {
        return false;
    }

    public Bundle j() {
        return null;
    }

    public void l() {
        Handler handler = this.r;
        if (handler instanceof kps) {
            handler.removeCallbacksAndMessages(null);
        }
        this.C.incrementAndGet();
        ArrayList arrayList = this.u;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((kpt) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.s) {
            this.E = null;
        }
        N(1, null, -1);
    }

    protected void m(int i, IBinder iBinder, Bundle bundle, int i2) {
        kpx kpxVar = new kpx(this, i, iBinder, bundle, i2);
        Handler handler = this.r;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, kpxVar));
    }

    protected void q() {
        System.currentTimeMillis();
    }

    public final String r() {
        agfm agfmVar;
        if (!w() || (agfmVar = this.F) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) agfmVar.c;
    }

    public final String s() {
        return this.O;
    }

    public final void u(kpu kpuVar) {
        this.t = kpuVar;
        N(2, null, -1);
    }

    public final void v(String str) {
        this.O = str;
        l();
    }

    public final boolean w() {
        boolean z;
        synchronized (this.e) {
            z = this.h == 4;
        }
        return z;
    }

    public final boolean x() {
        boolean z;
        synchronized (this.e) {
            int i = this.h;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final klq[] y() {
        kqi kqiVar = this.B;
        if (kqiVar == null) {
            return null;
        }
        return kqiVar.b;
    }

    public final void z(krc krcVar, Set set) {
        AttributionSource attributionSource;
        Bundle bundleH = h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.z == null || (attributionSource = this.z.a) == null || attributionSource.getAttributionTag() == null) ? this.y : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.x;
        int i2 = klu.c;
        Scope[] scopeArr = kqp.a;
        Bundle bundle = new Bundle();
        klq[] klqVarArr = kqp.b;
        kqp kqpVar = new kqp(6, i, i2, null, null, scopeArr, bundle, null, klqVarArr, klqVarArr, true, 0, false, str);
        kqpVar.f = this.p.getPackageName();
        kqpVar.i = bundleH;
        if (set != null) {
            kqpVar.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (i()) {
            Account accountB = B();
            if (accountB == null) {
                accountB = new Account("<<default account>>", "com.google");
            }
            kqpVar.j = accountB;
            if (krcVar != null) {
                kqpVar.g = krcVar.a;
            }
        } else if (M()) {
            kqpVar.j = B();
        }
        kqpVar.k = P();
        kqpVar.l = g();
        if (f()) {
            kqpVar.o = true;
        }
        try {
            synchronized (this.s) {
                try {
                    krg krgVar = this.E;
                    if (krgVar != null) {
                        krf krfVar = new krf(this, this.C.get());
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                            parcelObtain.writeStrongBinder(krfVar);
                            parcelObtain.writeInt(1);
                            fh.a(kqpVar, parcelObtain, 0);
                            krgVar.a.transact(46, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            J(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m(8, null, null, this.C.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m(8, null, null, this.C.get());
        }
    }

    protected kpz(Context context, Looper looper, int i, kpq kpqVar, kpr kprVar) {
        this(context, looper, kqy.b(context), klu.d, i, kpqVar, kprVar, null);
    }
}
