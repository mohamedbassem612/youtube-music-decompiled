package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qr {
    public boolean b;
    private final List a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public qr(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final qq e(djo djoVar) {
        qq qqVar = new qq(this, djoVar);
        this.a.add(qqVar);
        return qqVar;
    }

    public final void f() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                a.ar((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        List list = this.a;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((qq) it2.next()).f();
        }
        list.clear();
    }

    public final void g(boolean z) {
        this.b = z;
        for (qq qqVar : this.a) {
            boolean z2 = false;
            if (qqVar.a && z) {
                z2 = true;
            }
            qqVar.g(z2);
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(pw pwVar) {
    }
}
