package defpackage;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aemo implements wun {
    public final List a;
    private final vxu b;

    public aemo(vxu vxuVar, Executor executor, PackageManager packageManager) {
        vxuVar.getClass();
        this.b = vxuVar;
        executor.getClass();
        this.a = new ArrayList();
        executor.execute(new wdd(this, packageManager, 19, (char[]) null));
    }

    @Override // defpackage.wun
    public final void a(wuq wuqVar) {
        vxu vxuVar = this.b;
        anhb anhbVar = vxuVar.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        ajdl ajdlVar = anhbVar.j;
        if (ajdlVar == null) {
            ajdlVar = ajdl.a;
        }
        anhb anhbVar2 = vxuVar.c().j;
        if (anhbVar2 == null) {
            anhbVar2 = anhb.a;
        }
        if ((anhbVar2.b & 131072) != 0) {
            synchronized (this) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    Integer numP = adul.p((String) it.next(), ajdlVar);
                    if (numP != null) {
                        numP.intValue();
                        wuqVar.D.add(numP);
                    }
                }
            }
        }
    }
}
