package defpackage;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nyz implements nqt {
    public final String b;
    public final nzw c;
    public final Executor d;
    public final boolean e;
    public nyy g;
    public final adam i;
    public final ci j;
    public final Object h = new Object();
    public List f = new ArrayList();

    public nyz(String str, nzw nzwVar, Executor executor, adam adamVar, boolean z, ci ciVar) {
        this.b = str;
        this.c = nzwVar;
        this.d = executor;
        this.i = adamVar;
        this.e = z;
        this.j = ciVar;
        nyy nyyVar = new nyy(nzs.PAGE_INITIAL_RENDERING);
        this.g = nyyVar;
        nyyVar.f = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // defpackage.nqt
    public final void a(String str, boolean z) {
        synchronized (this.h) {
            nyy nyyVar = this.g;
            nyyVar.a++;
            nyyVar.c.add(str);
            this.g.d |= z;
        }
    }

    @Override // defpackage.nqt
    public final void b() {
        synchronized (this.h) {
            this.g.b++;
        }
    }

    @Override // defpackage.nqt
    public final void c(RecyclerView recyclerView) {
        recyclerView.ab = new nyx(this);
    }
}
