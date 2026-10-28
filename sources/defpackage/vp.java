package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vp implements Executor {
    private final /* synthetic */ int $cid;

    public vp(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.$cid) {
            case 0:
                ((vr) vq.q().b).b.execute(runnable);
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                qpj.a().post(runnable);
                break;
            case 5:
                taf.o(runnable);
                break;
            case 6:
                agrf agrfVar = vyl.a;
                runnable.getClass();
                runnable.run();
                break;
            case 7:
                runnable.run();
                break;
            case 8:
                runnable.run();
                break;
            case 9:
                runnable.run();
                break;
            case 10:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
