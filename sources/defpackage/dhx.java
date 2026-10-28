package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import android.util.SparseArray;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class dhx implements IBinder.DeathRecipient {
    public final Messenger e;
    public final int f;
    public final String g;
    public dhh h;
    public long i;
    final SparseArray j = new SparseArray();
    final dhj k = new dhw(this, 0);
    final /* synthetic */ dhz l;

    public dhx(dhz dhzVar, Messenger messenger, int i, String str) {
        this.l = dhzVar;
        this.e = messenger;
        this.f = i;
        this.g = str;
    }

    public Bundle a(dhq dhqVar) {
        if (dhqVar == null) {
            return null;
        }
        dhz dhzVar = this.l;
        String str = this.g;
        return dic.a(dhzVar.e(dhqVar, str), this.f);
    }

    public void b() {
        SparseArray sparseArray = this.j;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((dhn) sparseArray.valueAt(i)).b();
        }
        sparseArray.clear();
        this.e.getBinder().unlinkToDeath(this, 0);
        h(null);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.l.d.b.obtainMessage(1, this.e).sendToTarget();
    }

    public boolean e(String str, String str2, dho dhoVar, int i) {
        SparseArray sparseArray = this.j;
        if (sparseArray.indexOfKey(i) < 0) {
            dhz dhzVar = this.l;
            dhn dhnVarGx = str2 == null ? dhzVar.d.c.gx(str, dhoVar) : dhzVar.d.c.gy(str, str2);
            if (dhnVarGx != null) {
                sparseArray.put(i, dhnVarGx);
                return true;
            }
        }
        return false;
    }

    public boolean f(int i) {
        SparseArray sparseArray = this.j;
        dhn dhnVar = (dhn) sparseArray.get(i);
        if (dhnVar == null) {
            return false;
        }
        sparseArray.remove(i);
        dhnVar.b();
        return true;
    }

    public final dhn g(int i) {
        return (dhn) this.j.get(i);
    }

    public final void h(dhh dhhVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Objects.equals(this.h, dhhVar)) {
            return;
        }
        this.h = dhhVar;
        this.i = jElapsedRealtime;
        this.l.j();
    }

    public final String toString() {
        return dic.c(this.e);
    }
}
