package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kkx implements ServiceConnection {
    public int a = 0;
    public final Messenger b = new Messenger(new afkg(Looper.getMainLooper(), new bwd(this, 2)));
    public final Queue c = new ArrayDeque();
    public final SparseArray d = new SparseArray();
    public final /* synthetic */ klc e;
    public khn f;

    public kkx(klc klcVar) {
        this.e = klcVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    public final void a() {
        this.e.c.execute(new iqc(this, 13));
    }

    public final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    public final synchronized void c(int i) {
        SparseArray sparseArray = this.d;
        kkz kkzVar = (kkz) sparseArray.get(i);
        if (kkzVar != null) {
            Log.w("MessengerIpcClient", a.bR(i, "Timing out request: "));
            sparseArray.remove(i);
            kkzVar.c(new kla("Timed out waiting for response", null));
            d();
        }
    }

    public final synchronized void d() {
        if (this.a == 2 && this.c.isEmpty() && this.d.size() == 0) {
            this.a = 3;
            ksp.a().b((Context) this.e.b, this);
        }
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    final synchronized boolean e(kkz kkzVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.c.add(kkzVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.c.add(kkzVar);
            a();
            return true;
        }
        this.c.add(kkzVar);
        if (this.a != 0) {
            throw new IllegalStateException();
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            ksp kspVarA = ksp.a();
            klc klcVar = this.e;
            if (kspVarA.c((Context) klcVar.b, intent, this, 1)) {
                klcVar.c.schedule(new iqc(this, 14), 30L, TimeUnit.SECONDS);
            } else {
                g("Unable to bind to service");
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }

    final synchronized void f(String str, Throwable th) {
        int i = this.a;
        if (i == 0) {
            throw new IllegalStateException();
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            this.a = 4;
            return;
        }
        this.a = 4;
        ksp.a().b((Context) this.e.b, this);
        kla klaVar = new kla(str, th);
        Queue queue = this.c;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((kkz) it.next()).c(klaVar);
        }
        queue.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i2 >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((kkz) sparseArray.valueAt(i2)).c(klaVar);
                i2++;
            }
        }
    }

    public final synchronized void g(String str) {
        f(str, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.e.c.execute(new ihq((Object) this, (Object) iBinder, 6, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e.c.execute(new kcx(this, 10));
    }
}
