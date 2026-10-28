package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ofa implements oel, obi {
    static final String[] a = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final Context b;
    public final ExecutorService c;
    public final String[] d;
    public long e;
    public long f;
    public long g;
    public boolean h;

    public ofa(Context context, ExecutorService executorService) {
        String[] strArr = a;
        this.e = 0L;
        this.f = 0L;
        this.g = -1L;
        this.h = false;
        this.b = context;
        this.c = executorService;
        this.d = strArr;
    }

    @Override // defpackage.obi
    public final ListenableFuture a() {
        if (Build.VERSION.SDK_INT < 30) {
            return aher.a;
        }
        mbo mboVar = new mbo(this, 4);
        ExecutorService executorService = this.c;
        ahfo ahfoVar = new ahfo(Executors.callable(mboVar, null));
        executorService.execute(ahfoVar);
        return ahfoVar;
    }

    @Override // defpackage.oel
    public final void b(Map map) {
        e();
    }

    @Override // defpackage.oel
    public final void c(Map map) {
        long j;
        long j2;
        e();
        synchronized (this) {
            j = this.h ? this.f - this.e : -1L;
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.g;
            this.g = -1L;
        }
        map.put("vf", Long.valueOf(j2));
    }

    @Override // defpackage.oel
    public final void d(Map map, Context context) {
        e();
    }

    final void e() {
        synchronized (this) {
            if (this.h) {
                this.f = System.currentTimeMillis();
            }
        }
    }
}
