package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class diw implements IBinder.DeathRecipient {
    public final Messenger a;
    public final diy b;
    public int e;
    public int f;
    public final /* synthetic */ djc h;
    private final Messenger i;
    public int c = 1;
    public int d = 1;
    public final SparseArray g = new SparseArray();

    public diw(djc djcVar, Messenger messenger) {
        this.h = djcVar;
        this.a = messenger;
        diy diyVar = new diy(this);
        this.b = diyVar;
        this.i = new Messenger(diyVar);
    }

    public final void a(int i) {
        int i2 = this.c;
        this.c = i2 + 1;
        g(4, i2, i, null, null);
    }

    public final void b(int i) {
        int i2 = this.c;
        this.c = i2 + 1;
        g(5, i2, i, null, null);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.h.m.post(new cqc(this, 16));
    }

    public final void c(dhh dhhVar) {
        int i = this.c;
        this.c = i + 1;
        g(10, i, 0, dhhVar != null ? dhhVar.a : null, null);
    }

    public final void d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(7, i3, i, null, bundle);
    }

    public final void e(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("unselectReason", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(6, i3, i, null, bundle);
    }

    public final void f(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(8, i3, i, null, bundle);
    }

    public final boolean g(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        try {
            this.a.send(messageObtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            }
            return false;
        }
    }

    public final boolean h(int i, Intent intent, vy vyVar) {
        int i2 = this.c;
        this.c = i2 + 1;
        if (!g(9, i2, i, intent, null)) {
            return false;
        }
        if (vyVar != null) {
            this.g.put(i2, vyVar);
        }
        return true;
    }
}
