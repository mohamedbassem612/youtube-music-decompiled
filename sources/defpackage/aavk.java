package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.lang.Iterable$EL;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aavk extends BroadcastReceiver implements aavc {
    private final Set a = new HashSet();

    public aavk(vxz vxzVar) {
        vxzVar.c(54, 45660547L, 0L);
    }

    @Override // defpackage.aavc
    public final synchronized void a(igp igpVar) {
        this.a.add(igpVar);
    }

    @Override // defpackage.aavc
    public final synchronized void b(igp igpVar) {
        this.a.remove(igpVar);
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        Iterable$EL.forEach(this.a, new aavj(0));
    }
}
