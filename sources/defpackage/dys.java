package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dys extends dzv {
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.dzv
    public final dze a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                dze dzeVarA = ((dzv) it.next()).a(context, str, workerParameters);
                if (dzeVarA != null) {
                    return dzeVarA;
                }
            } catch (Throwable th) {
                String strBU = a.bU((byte) 41, str, "Unable to instantiate a ListenableWorker (");
                dzf.b();
                Log.e(dyt.a, strBU, th);
                throw th;
            }
        }
        return null;
    }
}
