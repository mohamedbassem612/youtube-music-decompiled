package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avgo extends auzq {
    public final auzh a;
    private final auzx b;
    private final auyr c;
    private final Executor d;
    private final avbh e;
    private auyq f;
    private auyt g;

    public avgo(auzx auzxVar, auyr auyrVar, Executor executor, avbh avbhVar, auyq auyqVar) {
        this.b = auzxVar;
        this.c = auyrVar;
        this.e = avbhVar;
        Executor executor2 = auyqVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        avcl avclVarF = auyq.f(auyqVar);
        avclVarF.g = executor;
        this.f = new auyq(avclVarF);
        this.a = auzh.b();
    }

    @Override // defpackage.auzq, defpackage.auyt
    public final void a(atxy atxyVar, avbe avbeVar) {
        avbh avbhVar = this.e;
        new avao(avbhVar, avbeVar, this.f, avhb.g);
        axoz axozVarA = this.b.a();
        Status status = (Status) axozVarA.b;
        if (!status.e()) {
            this.d.execute(new avgn(this, atxyVar, avfp.b(status)));
            this.g = avhb.h;
        } else {
            avhi avhiVarB = ((avhk) axozVarA.a).b(avbhVar);
            if (avhiVarB != null) {
                this.f = this.f.c(avhi.a, avhiVarB);
            }
            auyt auytVarA = this.c.a(avbhVar, this.f);
            this.g = auytVarA;
            auytVarA.a(atxyVar, avbeVar);
        }
    }

    @Override // defpackage.avbx, defpackage.auyt
    public final void b(String str, Throwable th) {
        auyt auytVar = this.g;
        if (auytVar != null) {
            auytVar.b(str, th);
        }
    }

    @Override // defpackage.auzq, defpackage.avbx
    protected final auyt f() {
        return this.g;
    }
}
