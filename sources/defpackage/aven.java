package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aven extends atxy {
    public volatile boolean b;
    public volatile Status c;
    public List d;
    public final atxy e;
    private final aveo f;

    public aven(aveo aveoVar, atxy atxyVar) {
        super(null);
        this.d = new ArrayList();
        this.f = aveoVar;
        this.e = atxyVar;
    }

    private final void x(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.d.add(runnable);
            }
        }
    }

    private final void y(Throwable th, String str) {
        this.c = Status.b.c(th).withDescription(str);
        this.f.b(str, th);
    }

    @Override // defpackage.atxy
    public final void q(Status status, avbe avbeVar) {
        x(new atvv(this, status, avbeVar, 3));
    }

    @Override // defpackage.atxy
    public final void r(avbe avbeVar) {
        if (this.b) {
            u(avbeVar);
        } else {
            x(new agrq(this, avbeVar, 15));
        }
    }

    @Override // defpackage.atxy
    public final void s(Object obj) {
        if (this.b) {
            v(obj);
        } else {
            x(new agrq(this, obj, 16, (char[]) null));
        }
    }

    @Override // defpackage.atxy
    public final void t() {
        if (this.b) {
            w();
        } else {
            x(new avep(this, 1));
        }
    }

    public final void u(avbe avbeVar) {
        if (this.c == null) {
            try {
                this.e.r(avbeVar);
            } catch (Throwable th) {
                y(th, "Failed to read headers");
            }
        }
    }

    public final void v(Object obj) {
        if (this.c == null) {
            try {
                this.e.s(obj);
            } catch (Throwable th) {
                y(th, "Failed to read message.");
            }
        }
    }

    public final void w() {
        if (this.c == null) {
            try {
                this.e.t();
            } catch (Throwable th) {
                y(th, "Failed to call onReady.");
            }
        }
    }
}
