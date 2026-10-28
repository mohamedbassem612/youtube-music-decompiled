package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cck implements Executor {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public cck(Handler handler, int i, int[] iArr) {
        this.$cid = i;
        this.a = handler;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bvq, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$cid) {
            case 0:
                this.a.d(runnable);
                break;
            case 1:
                ((bvc) this.a).b(runnable);
                break;
            case 2:
                ((Handler) this.a).post(runnable);
                break;
            case 3:
                ((Handler) this.a).post(runnable);
                break;
            case 4:
                ((Handler) this.a).post(runnable);
                break;
            case 5:
                ((Handler) this.a).post(runnable);
                break;
            case 6:
                ((Handler) this.a).post(runnable);
                break;
            case 7:
                ((Handler) this.a).post(runnable);
                break;
            case 8:
                ((Handler) this.a).post(runnable);
                break;
            case 9:
                ((Handler) this.a).post(runnable);
                break;
            case 10:
                ((Handler) this.a).post(runnable);
                break;
            case 11:
                ((mrl) this.a).b(runnable);
                break;
            case 12:
                ((Handler) this.a).post(runnable);
                break;
            case 13:
                ((rjc) this.a).e(runnable);
                break;
            case 14:
                ((abvx) this.a).b(runnable);
                break;
            default:
                ((abvx) this.a).b(runnable);
                break;
        }
    }

    public /* synthetic */ cck(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
