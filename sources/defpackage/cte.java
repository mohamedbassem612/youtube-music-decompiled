package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cte implements Executor {
    private final /* synthetic */ int $cid;
    public static final cte b = new cte(3);
    public static final cte a = new cte(2);

    public /* synthetic */ cte(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$cid) {
            case 0:
            case 1:
            case 11:
                break;
            case 2:
                runnable.getClass();
                runnable.run();
                break;
            case 3:
                runnable.getClass();
                runnable.run();
                break;
            case 4:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                runnable.run();
                break;
            case 7:
                int i = mnu.b;
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            case 8:
                runnable.run();
                break;
            case 9:
                runnable.run();
                break;
            case 10:
                runnable.getClass();
                runnable.run();
                break;
            case 12:
                agrx agrxVar = agso.a;
                break;
            case 13:
                agrx agrxVar2 = agso.a;
                break;
            case 14:
                runnable.run();
                break;
            case 15:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
