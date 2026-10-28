package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.lang.Iterable$EL;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aavl extends BroadcastReceiver implements aavd {
    private final Set a = new HashSet();

    public aavl(vxz vxzVar) {
        vxzVar.c(54, 45660547L, 0L);
    }

    @Override // defpackage.aavd
    public final synchronized void a(abnc abncVar) {
        this.a.add(abncVar);
    }

    @Override // defpackage.aavd
    public final synchronized void b(abnc abncVar) {
        this.a.remove(abncVar);
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        Set set = this.a;
        if (set.isEmpty() || !intent.hasExtra("state")) {
            return;
        }
        Iterable$EL.forEach(set, new uvu(intent.getIntExtra("state", 1) == 1, 3));
    }
}
