package defpackage;

import com.google.android.libraries.youtube.reel.internal.pager.ReelLinearLayoutManager;
import com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqb {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;

    public acqb(tqj tqjVar) {
        tqjVar.getClass();
        UUID uuidAf = yno.af();
        this.e = uuidAf;
        this.f = new awnm();
        this.a = atqq.p(new zqr(uuidAf));
        this.c = atqq.z(new awml(new zqr(uuidAf), this.f));
        this.b = new LinkedHashMap();
        this.d = new awnm();
        this.g = new awmp(new zqe(tqjVar, 5));
    }

    public static final String e(UUID uuid, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(uuid);
        sb.append('-');
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void a() {
        ?? r0 = this.f;
        if (r0 != 0) {
            r0.cancel(false);
            this.f = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final String b(UUID uuid) {
        Object obj = this.c.get(new zqr(uuid));
        if (obj != null) {
            return e(uuid, ((awnm) obj).c);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final UUID c() {
        zqr zqrVar = (zqr) atqq.ac(this.d);
        UUID uuid = zqrVar != null ? zqrVar.a : null;
        return uuid == null ? (UUID) this.e : uuid;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmi, java.lang.Object] */
    public final boolean d() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    public acqb(ReelRecyclerView reelRecyclerView, ReelLinearLayoutManager reelLinearLayoutManager, nf nfVar, ScheduledExecutorService scheduledExecutorService, hno hnoVar) {
        reelLinearLayoutManager.getClass();
        nfVar.getClass();
        scheduledExecutorService.getClass();
        hnoVar.getClass();
        this.a = reelRecyclerView;
        this.b = reelLinearLayoutManager;
        this.c = nfVar;
        this.d = scheduledExecutorService;
        this.e = hnoVar;
        this.g = new acqu(this, 1);
    }
}
