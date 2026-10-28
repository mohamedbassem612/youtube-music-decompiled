package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaMetadataRetriever;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rgp implements AutoCloseable, rft {
    private final rhd b;
    public final agke d;
    protected rib e;
    public Semaphore f;
    public Runnable g;
    public volatile Duration h;
    public volatile Duration i;
    public final rbm j = rbm.c(rgp.class);
    private final rbn a = new rbn();

    protected rgp(rgo rgoVar) {
        rhd rhdVar;
        Iterator it = rgoVar.f.iterator();
        if (it.hasNext()) {
            rhd rhdVar2 = (rhd) it.next();
            rhd rhdVar3 = rhdVar2;
            while (it.hasNext()) {
                rhd rhdVar4 = (rhd) it.next();
                rhdVar3.b(rhdVar4);
                rhdVar3 = rhdVar4;
            }
            rhdVar3.b(new rgs(this, 1));
            rhdVar = rhdVar2;
        } else {
            rhdVar = null;
        }
        this.b = rhdVar;
        this.d = agke.n(rgoVar.f);
    }

    @Override // defpackage.rft
    public final void a(rfs rfsVar) {
        rfsVar.q();
        rhd rhdVar = this.b;
        if (rhdVar == null) {
            j(rfsVar);
        } else {
            rhdVar.a(rfsVar);
        }
    }

    protected abstract int b();

    @Override // java.lang.AutoCloseable
    public void close() {
        for (AutoCloseable autoCloseable : this.d) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                a.ar((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
    }

    public abstract void d();

    protected abstract void e(rfs rfsVar);

    public abstract boolean f(Duration duration);

    public abstract ren h(Duration duration);

    public final void i(rib ribVar) {
        this.e = ribVar;
        if (ribVar instanceof rhw) {
            Semaphore semaphore = new Semaphore(b());
            this.f = semaphore;
            ((rhw) ribVar).d(semaphore);
            Iterable$EL.forEach(this.d, new rcp(this, 13));
        }
        ribVar.e(this);
    }

    public final void j(rfs rfsVar) {
        rfsVar.r();
        if (!rfsVar.B()) {
            this.a.d(rfsVar.j());
        }
        e(rfsVar);
    }

    public final void k(rfs rfsVar) {
        if (rfsVar != null) {
            rfsVar.release();
            this.a.a();
            Semaphore semaphore = this.f;
            if (semaphore != null) {
                semaphore.release();
            }
        }
    }

    public final void l(Duration duration, Duration duration2) {
        this.h = duration;
        this.i = duration2;
    }
}
