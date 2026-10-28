package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oey extends BroadcastReceiver implements oel, obi {
    public final Context a;
    private final ExecutorService b;
    private boolean c = true;

    public oey(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    private final synchronized void f(boolean z) {
        this.c = z;
    }

    @Override // defpackage.obi
    public final ListenableFuture a() {
        ahfo ahfoVar = new ahfo(new ebs(this, 13));
        this.b.execute(ahfoVar);
        return ahfoVar;
    }

    @Override // defpackage.oel
    public final void b(Map map) {
        map.put("up", Boolean.valueOf(e()));
    }

    @Override // defpackage.oel
    public final void c(Map map) {
        map.put("up", Boolean.valueOf(e()));
    }

    @Override // defpackage.oel
    public final void d(Map map, Context context) {
        map.put("up", Boolean.valueOf(e()));
    }

    final synchronized boolean e() {
        return this.c;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            f(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            f(false);
        }
    }
}
