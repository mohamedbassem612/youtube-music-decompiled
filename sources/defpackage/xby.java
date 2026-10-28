package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xby {
    public ListenableFuture a;
    public adkz b;
    public boolean c;
    public boolean d;
    public int e;
    protected final ahey f;
    public final Context g;
    public final advb h;
    public final xgn i;
    protected final View j;
    public final xbx k;
    public final awly l;
    public final ahek n;
    private RecyclerView p;
    private final Runnable o = new wvr(this, 16);
    public final adky m = new xbl(this, 2);

    public xby(Context context, advb advbVar, ahey aheyVar, ahek ahekVar, View view, xgn xgnVar) {
        this.g = context;
        this.h = advbVar;
        advbVar.b(amqm.class);
        this.f = aheyVar;
        this.i = xgnVar;
        this.l = new awlo().az();
        this.k = new xbx(this);
        this.n = ahekVar;
        this.j = view;
    }

    public final void a(long j) {
        this.a = this.f.schedule(this.o, j, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        c();
        RecyclerView recyclerViewI = i();
        if (recyclerViewI != null) {
            int childCount = recyclerViewI.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerViewI.getChildAt(i);
                if (childAt != null) {
                    adma admaVarD = adul.d(childAt);
                    if (admaVarD instanceof xad) {
                        ((xad) admaVarD).p();
                    }
                }
            }
        }
    }

    public final void c() {
        RecyclerView recyclerViewI = i();
        if (recyclerViewI != null) {
            recyclerViewI.removeCallbacks(this.o);
        }
    }

    public final void d() {
        Object obj;
        RecyclerView recyclerViewI = i();
        if (recyclerViewI == null || (obj = this.b) == null || ((tbm) obj).size() <= 0) {
            return;
        }
        recyclerViewI.removeCallbacks(this.o);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerViewI.n;
        if (linearLayoutManager != null && linearLayoutManager.findFirstVisibleItemPosition() > 10) {
            recyclerViewI.ab(10);
        }
        this.d = true;
        recyclerViewI.aj(0);
    }

    public final void e() {
        d();
        RecyclerView recyclerViewI = i();
        if (recyclerViewI != null) {
            int childCount = recyclerViewI.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerViewI.getChildAt(i);
                if (childAt != null) {
                    adma admaVarD = adul.d(childAt);
                    if (admaVarD instanceof xad) {
                        ((xad) admaVarD).q();
                    }
                }
            }
        }
    }

    public final boolean f() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerViewI = i();
        return (recyclerViewI == null || (linearLayoutManager = (LinearLayoutManager) recyclerViewI.n) == null || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) ? false : true;
    }

    public final boolean g() {
        return this.d || f();
    }

    public final boolean h() {
        return this.e == 1;
    }

    public final RecyclerView i() {
        if (this.p == null) {
            RecyclerView recyclerView = (RecyclerView) this.j.findViewById(R.id.ticker);
            this.p = recyclerView;
            recyclerView.setOnTouchListener(new vsl(3));
        }
        return this.p;
    }
}
