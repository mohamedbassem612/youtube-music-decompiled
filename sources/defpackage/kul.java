package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kul implements Closeable {
    public final kue a;
    public final ahgb b;
    private final Executor c;
    private final String d;
    private final ktv e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final ktu g;
    private ktj h;
    private final yz i;
    private elq j;

    public kul(ahgb ahgbVar, Executor executor, kue kueVar, String str, ktv ktvVar, ktu ktuVar, yz yzVar, ktj ktjVar, elq elqVar) {
        this.b = ahgbVar;
        this.c = executor;
        this.a = kueVar;
        this.d = str;
        this.e = ktvVar;
        this.g = ktuVar;
        this.i = yzVar;
        this.h = ktjVar;
        this.j = elqVar;
    }

    private final synchronized byte[] f(Map map) {
        byte[] bArrCreateByteArray;
        if (h(this.h)) {
            throw new kmu(new Status(20, "The handle object on the module side is unreachable", null, null));
        }
        try {
            ktj ktjVar = this.h;
            Parcel parcelC = ktjVar.c();
            parcelC.writeMap(map);
            Parcel parcelD = ktjVar.d(2, parcelC);
            bArrCreateByteArray = parcelD.createByteArray();
            parcelD.recycle();
            if (bArrCreateByteArray == null) {
                throw new kmu(new Status(8, "Received null response on snapshot", null, null));
            }
        } catch (RemoteException e) {
            throw lqd.h(e, "Failed to get a snapshot");
        }
        return bArrCreateByteArray;
    }

    private final synchronized void g(kqs kqsVar, ktu ktuVar) {
        ktv ktvVar = this.e;
        if (ktvVar.a && h(this.h)) {
            ktuVar.c(2, ktt.b);
            kui kuiVarG = kwq.g(kqsVar, this.d, ktvVar, this.b.N(), ktuVar);
            this.h = kuiVarG.a;
            this.j = kuiVarG.b;
        }
    }

    private static boolean h(ktj ktjVar) {
        return ktjVar == null || !ktjVar.a.pingBinder();
    }

    public final lpa a(Map map) {
        lpa lpaVarO;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f.get()) {
            lpaVarO = mda.l(new kmu(new Status(10, "DroidGuard handle is closed", null, null)));
        } else {
            lpaVarO = this.b.O(true != this.e.a ? 2 : 1, 2, new kuk(this, map, 1));
        }
        lpaVarO.l(this.c, new kuh(this, jElapsedRealtime, jCurrentTimeMillis, 2));
        return lpaVarO;
    }

    public final synchronized void b() {
        if (h(this.h)) {
            Log.w("DGInternalHandle", "The handle object on the module side is unreachable for close");
            return;
        }
        try {
            ktj ktjVar = this.h;
            ktjVar.f(3, ktjVar.c());
        } catch (RemoteException e) {
            Log.e("DGInternalHandle", "Error while closing the handle: ".concat(String.valueOf(e.getMessage())));
        }
        this.h = null;
    }

    public final synchronized void c(Map map) {
        elq elqVar = this.j;
        if (elqVar == null) {
            return;
        }
        try {
            Object obj = elqVar.a;
            obj.getClass().getDeclaredMethod("he2", Map.class).invoke(obj, map);
        } catch (Exception e) {
            try {
                throw new ktp(e);
            } catch (ktp unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f.getAndSet(true)) {
            Log.w("DGInternalHandle", "Handle is already closed");
        } else {
            this.b.O(2, 3, new kty() { // from class: kuj
                @Override // defpackage.kty
                public final Object a(kqs kqsVar) {
                    this.a.b();
                    return null;
                }
            }).p(new mag(1));
        }
    }

    public final synchronized boolean d() {
        return (this.f.get() || h(this.h)) ? false : true;
    }

    public final synchronized elq e(kqs kqsVar, Map map) {
        ktu ktuVarA;
        byte[] bArrF;
        ktuVarA = this.g.clone();
        g(kqsVar, ktuVarA);
        ktt kttVar = ktt.b;
        ktuVarA.c(14, kttVar);
        yz yzVar = this.i;
        if (yzVar.c()) {
            String strA = yzVar.a().a();
            HashMap map2 = new HashMap(map);
            map2.put("_seigd", strA);
            map = map2;
        }
        bArrF = f(map);
        ktuVarA.c(15, kttVar);
        return new elq((Object) lqd.k(lqd.j(kqsVar.p, bArrF, ktuVarA.b())));
    }
}
