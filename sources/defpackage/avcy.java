package defpackage;

import io.grpc.Status;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcy implements avef {
    public final String a;
    public avhl b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final avkf g;
    public auyo h;
    public boolean i;
    public Status j;
    public boolean k;
    public final axst l;
    private final avaa m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public avcy(axst axstVar, InetSocketAddress inetSocketAddress, String str, String str2, auyo auyoVar, Executor executor, int i, avkf avkfVar) {
        inetSocketAddress.getClass();
        this.n = inetSocketAddress;
        this.m = avaa.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        avbb avbbVar = avfp.a;
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-cronet/1.86.0-SNAPSHOT");
        this.a = sb.toString();
        this.f = i;
        this.e = executor;
        this.l = axstVar;
        this.g = avkfVar;
        auyo auyoVar2 = auyo.a;
        axle axleVar = new axle(auyo.a);
        axleVar.c(avfk.a, avcb.c);
        axleVar.c(avfk.b, auyoVar);
        this.h = axleVar.a();
    }

    @Override // defpackage.avdx
    public final /* bridge */ /* synthetic */ avdu a(avbh avbhVar, avbe avbeVar, auyq auyqVar, auyw[] auywVarArr) {
        String str = "https://" + this.o + "/".concat(avbhVar.b);
        avjz avjzVar = new avjz(auywVarArr);
        for (auyw auywVar : auywVarArr) {
            auywVar.b();
        }
        return new avcx(this, str, avbeVar, avbhVar, avjzVar, auyqVar).a;
    }

    @Override // defpackage.avhm
    public final Runnable b(avhl avhlVar) {
        this.b = avhlVar;
        synchronized (this.c) {
            this.k = true;
        }
        return new afjc(this, 16, null);
    }

    @Override // defpackage.avae
    public final avaa c() {
        return this.m;
    }

    public final void d(avcw avcwVar, Status status) {
        synchronized (this.c) {
            if (this.d.remove(avcwVar)) {
                boolean z = true;
                if (status.getCode() != Status.Code.CANCELLED && status.getCode() != Status.Code.DEADLINE_EXCEEDED) {
                    z = false;
                }
                avcwVar.q.e(status, z, new avbe());
                g();
            }
        }
    }

    @Override // defpackage.avhm
    public final void e(Status status) {
        synchronized (this.c) {
            if (this.i) {
                return;
            }
            synchronized (this.c) {
                if (!this.p) {
                    this.p = true;
                    avhl avhlVar = this.b;
                    avgc avgcVar = (avgc) avhlVar;
                    avge avgeVar = avgcVar.c;
                    auys auysVar = avgeVar.d;
                    avef avefVar = avgcVar.a;
                    avjy avjyVar = avjy.SUBCHANNEL_SHUTDOWN;
                    auysVar.b(2, "{0} SHUTDOWN with {1}", avefVar.c(), avge.j(status));
                    avgcVar.b = true;
                    avgeVar.g.execute(new atvv(avhlVar, avjyVar, status, 4));
                    synchronized (this.c) {
                        this.i = true;
                        this.j = status;
                    }
                    g();
                }
            }
        }
    }

    @Override // defpackage.avhm
    public final void f(Status status) {
        ArrayList arrayList;
        e(status);
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((avcw) arrayList.get(i)).h(status);
        }
        g();
    }

    final void g() {
        synchronized (this.c) {
            if (this.i && !this.q && this.d.isEmpty()) {
                this.q = true;
                avhl avhlVar = this.b;
                avgc avgcVar = (avgc) avhlVar;
                ahno.P(avgcVar.b, "transportShutdown() must be called before transportTerminated().");
                avge avgeVar = avgcVar.c;
                auys auysVar = avgeVar.d;
                avef avefVar = avgcVar.a;
                auysVar.b(2, "{0} Terminated", avefVar.c());
                auzw.b(avgeVar.c.d, avefVar);
                avcj avcjVar = avgeVar.g;
                avcjVar.execute(new aves(avgeVar, avefVar, 7));
                Iterator it = avgeVar.f.iterator();
                if (it.hasNext()) {
                    throw null;
                }
                avcjVar.execute(new avep(avhlVar, 16));
            }
        }
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + '(' + inetSocketAddress.toString() + ')';
    }
}
