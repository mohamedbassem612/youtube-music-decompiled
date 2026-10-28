package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avet implements avdw {
    public final avdw a;
    public volatile boolean b;
    public List c = new ArrayList();

    public avet(avdw avdwVar) {
        this.a = avdwVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.avdw
    public final void a(Status status, avdv avdvVar, avbe avbeVar) {
        b(new aasv((Object) this, status, avdvVar, avbeVar, 15));
    }

    @Override // defpackage.avdw
    public final void c(avbe avbeVar) {
        b(new aves(this, avbeVar, 2));
    }

    @Override // defpackage.avkb
    public final void d() {
        if (this.b) {
            this.a.d();
        } else {
            b(new avep(this, 10));
        }
    }

    @Override // defpackage.avkb
    public final void e(auym auymVar) {
        if (this.b) {
            this.a.e(auymVar);
        } else {
            b(new aves(this, auymVar, 0, (short[]) null));
        }
    }
}
