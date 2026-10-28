package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aveq extends aveu {
    public final avao a;
    public final auzh b = auzh.b();
    public final auyw[] c;
    public volatile Status d;
    final /* synthetic */ aver e;
    private String j;
    private String k;

    public aveq(aver averVar, avao avaoVar, auyw[] auywVarArr, String str, String str2) {
        this.e = averVar;
        this.a = avaoVar;
        this.c = auywVarArr;
        this.j = str;
        this.k = str2;
        for (auyw auywVar : auywVarArr) {
        }
    }

    final Runnable b(avdu avduVar) {
        c();
        synchronized (this) {
            if (this.h != null) {
                return null;
            }
            avduVar.getClass();
            super.q(avduVar);
            avdw avdwVar = this.g;
            if (avdwVar == null) {
                this.i = null;
                this.f = true;
            }
            if (avdwVar == null) {
                return null;
            }
            super.p(avdwVar);
            return new avep(this, 7);
        }
    }

    final synchronized void c() {
        if (this.j != null) {
            this.j = null;
            this.k = null;
            for (auyw auywVar : this.c) {
            }
        }
    }

    final synchronized void d(String str, String str2) {
        if (this.h == null) {
            int i = 0;
            if (!str.equals(this.j)) {
                c();
                this.j = str;
                this.k = str2;
                auyw[] auywVarArr = this.c;
                while (i < auywVarArr.length) {
                    auyw auywVar = auywVarArr[i];
                    i++;
                }
            } else if (!str2.equals(this.k)) {
                this.k = str2;
                auyw[] auywVarArr2 = this.c;
                while (i < auywVarArr2.length) {
                    auyw auywVar2 = auywVarArr2[i];
                    i++;
                }
            }
        }
    }

    @Override // defpackage.aveu
    protected final void e() {
        c();
        int i = 0;
        while (true) {
            auyw[] auywVarArr = this.c;
            if (i >= auywVarArr.length) {
                return;
            }
            auyw auywVar = auywVarArr[i];
            i++;
        }
    }

    @Override // defpackage.aveu, defpackage.avdu
    public final void g(avfu avfuVar) {
        if (this.a.a.e()) {
            avfuVar.a("wait_for_ready");
            Status status = this.d;
            if (status != null && !status.e()) {
                avfuVar.b("Last Pick Failure", status);
            }
        }
        super.g(avfuVar);
    }

    @Override // defpackage.aveu, defpackage.avdu
    public final void h(Status status) {
        super.h(status);
        aver averVar = this.e;
        synchronized (averVar.a) {
            if (averVar.e != null) {
                boolean zRemove = averVar.g.remove(this);
                if (!averVar.g() && zRemove) {
                    avcj avcjVar = averVar.b;
                    avcjVar.b(averVar.d);
                    if (averVar.h.a != null) {
                        avcjVar.b(averVar.e);
                        averVar.e = null;
                    }
                }
            }
        }
        this.e.b.a();
    }
}
