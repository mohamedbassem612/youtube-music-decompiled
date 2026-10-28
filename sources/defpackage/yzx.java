package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yzx extends cms implements Handler.Callback, zap {
    public final ScheduledExecutorService a;
    public final zjr b;
    public yzv c;
    public yzv e;
    public final boolean f;
    private int j;
    private cno k;
    private Handler l;
    private final List g = new ArrayList();
    private final IdentityHashMap h = new IdentityHashMap(2);
    private final AtomicInteger i = new AtomicInteger();
    public final HashSet d = new HashSet();

    public yzx(cno cnoVar, ywj ywjVar, ScheduledExecutorService scheduledExecutorService, zjr zjrVar) {
        this.c = new yzv(cnoVar, zjrVar, ywjVar);
        this.a = scheduledExecutorService;
        this.b = zjrVar;
        this.f = zjrVar.av();
    }

    private final void H() {
        AtomicInteger atomicInteger = this.i;
        if (atomicInteger.get() <= this.j) {
            z(new yzu(this.c, this.e, atomicInteger, this.j, this.b));
        }
    }

    @Override // defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        yzv yzvVar;
        Object obj = cnmVar.a;
        yzv yzvVar2 = this.c;
        if (yzvVar2 == null || !yzvVar2.h.equals(obj)) {
            yzv yzvVar3 = this.e;
            yzvVar = (yzvVar3 == null || !yzvVar3.h.equals(obj)) ? null : this.e;
        } else {
            yzvVar = this.c;
        }
        zkf.d(yzvVar);
        zkf.c(yzvVar.d == null);
        btn btnVar = yzvVar.f;
        zkf.d(btnVar);
        cml cmlVar = new cml(yzvVar.a.c(cnmVar.a(btnVar.f(0)), craVar, j), this.b.ds(), 0L, yzvVar.a());
        this.h.put(cmlVar, yzvVar);
        yzvVar.d = cmlVar;
        return cmlVar;
    }

    @Override // defpackage.cms
    protected final /* bridge */ /* synthetic */ int d(Object obj, int i) {
        return ((yzv) obj) == this.c ? 0 : 1;
    }

    @Override // defpackage.cms
    protected final /* bridge */ /* synthetic */ cnm f(Object obj, cnm cnmVar) {
        yzv yzvVar = (yzv) obj;
        return this.b.i.l(107, 45623769L, false) ? cnmVar.a(yzvVar.h) : cnmVar.a(yzvVar);
    }

    @Override // defpackage.cms
    protected final /* bridge */ /* synthetic */ void g(Object obj, cno cnoVar, btn btnVar) {
        yzv yzvVar = (yzv) obj;
        if (yzvVar.f != btnVar) {
            yzvVar.f = btnVar;
            H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[Catch: all -> 0x0068, DONT_GENERATE, TRY_ENTER, TryCatch #2 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0013, B:10:0x001b, B:24:0x0063), top: B:36:0x0007 }] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean zBooleanValue;
        if (message.what != 1) {
            zhr.e(zhq.MLPLAYER, "Unrecognized MedialibMediaSource message: %s", Integer.valueOf(message.what));
            return false;
        }
        synchronized (this) {
            if (this.l != null) {
                List list = this.g;
                if (!list.isEmpty()) {
                    ArrayList<Callable> arrayList = new ArrayList(list);
                    list.clear();
                    try {
                        zBooleanValue = false;
                        for (Callable callable : arrayList) {
                            try {
                                this.j++;
                                zBooleanValue |= ((Boolean) callable.call()).booleanValue();
                            } catch (Exception e) {
                                e = e;
                                zhr.e(zhq.MLPLAYER, "Exception in MedialibMediaSource: %s", e);
                                this.a.execute(afwl.i(new yts(this, e, 15)));
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        H();
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.zap
    public final long jE(long j) {
        cno cnoVar = this.c.a;
        if (cnoVar instanceof zap) {
            return ((zap) cnoVar).jE(j);
        }
        return -1L;
    }

    @Override // defpackage.cno
    public final bss jF() {
        return this.c.a.jF();
    }

    @Override // defpackage.cms, defpackage.cmi
    public final synchronized void jH(bzg bzgVar) {
        super.jH(bzgVar);
        this.l = new Handler(this);
        yzv yzvVar = this.c;
        h(yzvVar, yzvVar.a);
        if (this.b.av()) {
            this.d.add(this.c);
        }
        this.l.obtainMessage(1).sendToTarget();
    }

    @Override // defpackage.cms, defpackage.cmi
    public final synchronized void jI() {
        super.jI();
        this.d.clear();
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.l = null;
        }
    }

    @Override // defpackage.cno
    public final void k(cnk cnkVar) {
        yzv yzvVar = (yzv) this.h.remove(cnkVar);
        zkf.d(yzvVar);
        zkf.d(yzvVar.d);
        yzvVar.a.k(yzvVar.d.a);
        yzvVar.d = null;
        if (yzvVar.e) {
            j(yzvVar);
            this.d.remove(yzvVar);
        }
    }

    final synchronized void n() {
        if (this.k != null) {
            this.g.add(new wko(this, 14));
            this.k = null;
            this.i.incrementAndGet();
            Handler handler = this.l;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    final synchronized void o() {
        if (this.k != null) {
            this.g.add(new wko(this, 13));
            this.k = null;
            this.i.incrementAndGet();
            Handler handler = this.l;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    final synchronized void q(cno cnoVar, long j, long j2, ywj ywjVar) throws Throwable {
        yzx yzxVar;
        try {
            try {
                if (this.k != cnoVar) {
                    yzxVar = this;
                    this.g.add(new yzw(yzxVar, cnoVar, j, j2, ywjVar));
                    yzxVar.k = cnoVar;
                    yzxVar.i.incrementAndGet();
                    Handler handler = yzxVar.l;
                    if (handler != null) {
                        handler.obtainMessage(1).sendToTarget();
                    }
                } else {
                    yzxVar = this;
                }
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
        throw th;
    }
}
