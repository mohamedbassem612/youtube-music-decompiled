package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqc extends BroadcastReceiver {
    public final Context a;
    public Map b;
    public final tqa c;
    private final tbt d;

    public tqc(Context context, tqa tqaVar, tbt tbtVar) {
        this.a = context;
        tqaVar.getClass();
        this.c = tqaVar;
        tbtVar.getClass();
        this.d = tbtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        tqa tqaVar = this.c;
        Map map = this.b;
        Map mapE = tqaVar.e();
        this.b = mapE;
        if (mapE.equals(map)) {
            return;
        }
        synchronized (tqaVar.e) {
            tqaVar.d = null;
        }
        this.d.c(new tqb(this.b));
    }
}
