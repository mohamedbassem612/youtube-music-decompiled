package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqw extends drd {
    public final drc a;
    public final awqg b;
    public dqx c;

    public dqw(drc drcVar, awqg awqgVar) {
        dqx dqxVar;
        this.a = drcVar;
        this.b = awqgVar;
        if (drcVar.g) {
            dqxVar = dqu.b;
        } else {
            Process.myPid();
            if (Build.VERSION.SDK_INT >= 28) {
                Application.getProcessName();
            }
            synchronized (drcVar.f) {
                if (!drcVar.g) {
                    dqu.b = new dqx(drcVar);
                    drcVar.g = true;
                }
            }
            dqxVar = dqu.b;
        }
        this.c = dqxVar;
    }

    @Override // defpackage.drd
    public final void a(String str) {
        ((Boolean) this.b.invoke(str)).booleanValue();
    }
}
