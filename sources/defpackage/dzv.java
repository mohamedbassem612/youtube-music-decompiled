package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dzv {
    public abstract dze a(Context context, String str, WorkerParameters workerParameters);

    public final dze b(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        dze dzeVarA = a(context, str, workerParameters);
        if (dzeVarA == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(dze.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    dzeVarA = (dze) objNewInstance;
                } catch (Throwable th) {
                    String strConcat = "Could not instantiate ".concat(str);
                    dzf.b();
                    Log.e(dzw.a, strConcat, th);
                    throw th;
                }
            } catch (Throwable th2) {
                String strConcat2 = "Invalid class: ".concat(str);
                dzf.b();
                Log.e(dzw.a, strConcat2, th2);
                throw th2;
            }
        }
        if (!dzeVarA.c) {
            return dzeVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
