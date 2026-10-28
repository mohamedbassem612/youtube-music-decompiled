package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class yc implements bnu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public yc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        if (this.$cid == 0) {
            ((yd) this.a).a.e(boa.ON_CREATE);
        }
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((yd) obj).a.e(boa.ON_DESTROY);
            bogVar.getLifecycle().c(this);
            return;
        }
        Deque deque = ((yb) obj).a;
        Iterator it = new ArrayDeque(deque).iterator();
        while (it.hasNext()) {
            yb.c((ya) it.next(), true);
        }
        deque.clear();
        bogVar.getLifecycle().c(this);
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((yd) obj).a.e(boa.ON_PAUSE);
            return;
        }
        ya yaVar = (ya) ((yb) obj).a.peek();
        if (yaVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onPause");
        } else {
            yaVar.a(boa.ON_PAUSE);
        }
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((yd) obj).a.e(boa.ON_RESUME);
            return;
        }
        ya yaVar = (ya) ((yb) obj).a.peek();
        if (yaVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onResume");
        } else {
            yaVar.a(boa.ON_RESUME);
        }
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((yd) obj).a.e(boa.ON_START);
            return;
        }
        ya yaVar = (ya) ((yb) obj).a.peek();
        if (yaVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onStart");
        } else {
            yaVar.a(boa.ON_START);
        }
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((yd) obj).a.e(boa.ON_STOP);
            return;
        }
        ya yaVar = (ya) ((yb) obj).a.peek();
        if (yaVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onStop");
        } else {
            yaVar.a(boa.ON_STOP);
        }
    }
}
