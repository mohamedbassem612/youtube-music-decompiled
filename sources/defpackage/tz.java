package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.icing.IcingSearchEngineImpl;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tz {
    public static volatile tz a;
    public final tv b;

    static {
        rx.a();
        Executors.newCachedThreadPool();
    }

    public tz(Context context, Executor executor, tw twVar) {
        rx.a();
        File file = new File(context.getFilesDir(), "appsearch");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        uj ujVar = new uj();
        int i = tv.m;
        String strNativeGetLoggingTag = IcingSearchEngineImpl.nativeGetLoggingTag();
        if (strNativeGetLoggingTag == null) {
            Log.e("IcingSearchEngineImpl", "Received null logging tag from native.");
            Log.e("AppSearchImpl", "Received null logging tag from Icing");
        } else {
            boolean z = vo.a;
            if (Log.isLoggable(strNativeGetLoggingTag, 5)) {
                lth.e(4);
            } else if (Log.isLoggable(strNativeGetLoggingTag, 6)) {
                lth.e(5);
            } else {
                lth.e(6);
            }
        }
        a aVar = new a();
        xsc xscVar = new xsc((byte[]) null, (byte[]) null, (byte[]) null);
        yv yvVar = new yv();
        yvVar.b = ujVar;
        yvVar.a = xscVar;
        this.b = new tv(file, aVar, new eol(yvVar));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        ujVar.a();
        ujVar.b = (int) jElapsedRealtime2;
        ujVar.D = true;
        twVar.a(new uk(ujVar));
        executor.execute(new mc(this, 10, null));
    }
}
