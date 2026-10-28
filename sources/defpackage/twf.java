package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class twf {
    public static final /* synthetic */ int g = 0;
    private static final IntentFilter h = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public final agfr a;
    public final mbc b;
    public final avlr c;
    public long d;
    public int e;
    public boolean f;
    private final Context i;
    private final vxz j;

    public twf(Context context, ExecutorService executorService, mbc mbcVar, vxz vxzVar) {
        context.getClass();
        this.i = context;
        mbcVar.getClass();
        this.b = mbcVar;
        executorService.getClass();
        avmb avmbVar = awlg.a;
        awir awirVar = new awir(executorService);
        this.j = vxzVar;
        this.a = aguu.al(new tpc(context, 3));
        awcs awcsVar = new awcs(avlr.I(0L, 1L, TimeUnit.SECONDS, awirVar).O(awirVar), new hby(this, 14));
        avnn avnnVar = atqp.l;
        this.c = awcsVar.S();
    }

    private final Bundle c() {
        boolean zL = this.j.l(172, 45672665L, false);
        Context context = this.i;
        Intent intentF = zL ? avg.f(context, null, h, null, 2) : avg.f(context, null, h, null, 4);
        return intentF == null ? new Bundle() : intentF.getExtras();
    }

    public final float a() {
        Bundle bundleC = c();
        float f = bundleC.getInt("level", -1);
        float f2 = bundleC.getInt("scale", -1);
        if (f < 0.0f || f2 <= 0.0f) {
            return -1.0f;
        }
        return f / f2;
    }

    public final boolean b() {
        return c().getInt("plugged", 0) != 0;
    }
}
