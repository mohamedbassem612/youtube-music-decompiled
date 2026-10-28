package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djc extends dhp implements ServiceConnection {
    public final ComponentName a;
    public final ArrayList b;
    public boolean c;
    public diw d;
    public boolean e;
    final afkg m;
    public hhb n;
    private boolean o;

    public djc(Context context, ComponentName componentName) {
        super(context, new dhm(componentName));
        this.b = new ArrayList();
        this.a = componentName;
        this.m = new afkg();
    }

    private final dhn s(String str, String str2, dho dhoVar) {
        dhq dhqVar = this.j;
        if (dhqVar != null) {
            List list = dhqVar.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((dhg) list.get(i)).p().equals(str)) {
                    djb djbVar = new djb(this, str, str2, dhoVar);
                    this.b.add(djbVar);
                    if (this.e) {
                        djbVar.m(this.d);
                    }
                    q();
                    return djbVar;
                }
            }
        }
        return null;
    }

    public final dix a(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            dix dixVar = (dix) arrayList.get(i2);
            i2++;
            if (dixVar.l() == i) {
                return dixVar;
            }
        }
        return null;
    }

    @Override // defpackage.dhp
    public final void e(dhh dhhVar) {
        if (this.e) {
            this.d.c(dhhVar);
        }
        q();
    }

    public final void f() {
        if (this.o) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.a);
        try {
            this.o = this.f.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final void g() {
        if (this.d != null) {
            gz(null);
            this.e = false;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dix) arrayList.get(i)).o();
            }
            diw diwVar = this.d;
            diwVar.g(2, 0, 0, null, null);
            diwVar.b.a.clear();
            diwVar.a.getBinder().unlinkToDeath(diwVar, 0);
            diwVar.h.m.post(new cqc(diwVar, 15));
            this.d = null;
        }
    }

    @Override // defpackage.dhp
    public final dhk gw(String str, dho dhoVar) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        dhq dhqVar = this.j;
        dja djaVar = null;
        if (dhqVar != null) {
            List list = dhqVar.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((dhg) list.get(i)).p().equals(str)) {
                    djaVar = new dja(this, str, dhoVar);
                    this.b.add(djaVar);
                    if (this.e) {
                        djaVar.m(this.d);
                    }
                    q();
                    break;
                }
            }
        }
        return djaVar;
    }

    @Override // defpackage.dhp
    public final dhn gx(String str, dho dhoVar) {
        if (str != null) {
            return s(str, null, dhoVar);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // defpackage.dhp
    public final dhn gy(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return s(str, str2, dho.a);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    final void h(diw diwVar, dhq dhqVar) {
        if (this.d == diwVar) {
            gz(dhqVar);
        }
    }

    final void n(dix dixVar) {
        this.b.remove(dixVar);
        dixVar.o();
        q();
    }

    public final void o() {
        if (this.c) {
            return;
        }
        this.c = true;
        q();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.o) {
            g();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!vy.n(messenger)) {
                toString();
                Log.e("MediaRouteProviderProxy", toString().concat(": Service returned invalid messenger binder"));
                return;
            }
            diw diwVar = new diw(this, messenger);
            int i = diwVar.c;
            diwVar.c = i + 1;
            diwVar.f = i;
            if (diwVar.g(1, i, 4, null, null)) {
                try {
                    diwVar.a.getBinder().linkToDeath(diwVar, 0);
                    this.d = diwVar;
                } catch (RemoteException unused) {
                    diwVar.binderDied();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g();
    }

    public final void p() {
        if (this.o) {
            this.o = false;
            g();
            try {
                this.f.unbindService(this);
            } catch (IllegalArgumentException e) {
                toString();
                Log.e("MediaRouteProviderProxy", toString().concat(": unbindService failed"), e);
            }
        }
    }

    public final void q() {
        if (r()) {
            f();
        } else {
            p();
        }
    }

    public final boolean r() {
        if (this.c) {
            return (this.h == null && this.b.isEmpty()) ? false : true;
        }
        return false;
    }

    public final String toString() {
        return "Service connection ".concat(String.valueOf(this.a.flattenToShortString()));
    }
}
