package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avge implements auzz {
    private final avdz A;
    private final avdk B;
    private final avbj C;
    public final avga a;
    public final ScheduledExecutorService b;
    public final auzw c;
    public final auys d;
    public final boolean e;
    public final List f;
    public final avcj g;
    public final avgb h;
    public volatile List i;
    public final agfp j;
    public avhm k;
    public avef n;
    public volatile avhm o;
    public Status q;
    public volatile auyo r;
    public final avkc s;
    public final String t;
    public avfa u;
    public axoz v;
    public axoz w;
    private final avaa x;
    private final String y;
    private final String z;
    public final Collection l = new ArrayList();
    public final avft m = new avfw(this);
    public volatile auze p = auze.a(auzd.d);

    public avge(avai avaiVar, String str, String str2, avdz avdzVar, ScheduledExecutorService scheduledExecutorService, avcj avcjVar, avga avgaVar, auzw auzwVar, avdk avdkVar, avaa avaaVar, auys auysVar, List list, String str3, avbj avbjVar) {
        Object obj;
        List list2 = avaiVar.a;
        ahno.G(!list2.isEmpty(), "addressGroups is empty");
        i(list2);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.i = listUnmodifiableList;
        this.h = new avgb(listUnmodifiableList);
        this.y = str;
        this.z = str2;
        this.A = avdzVar;
        this.b = scheduledExecutorService;
        this.j = new agfp();
        this.g = avcjVar;
        this.C = avbjVar;
        this.a = avgaVar;
        this.c = auzwVar;
        this.B = avdkVar;
        this.x = avaaVar;
        this.d = auysVar;
        this.f = list;
        avah avahVar = avat.c;
        int i = 0;
        while (true) {
            Object[][] objArr = avaiVar.c;
            if (i >= objArr.length) {
                obj = avahVar.a;
                break;
            } else {
                if (avahVar.equals(objArr[i][0])) {
                    obj = avaiVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.e = ((Boolean) obj).booleanValue();
        this.t = str3;
        this.s = new avkc(avbjVar);
    }

    public static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String j(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append('(');
            sb.append(status.getDescription());
            sb.append(')');
        }
        Throwable th = status.p;
        if (th != null) {
            sb.append('[');
            sb.append(th);
            sb.append(']');
        }
        return sb.toString();
    }

    public final avdx a() {
        avhm avhmVar = this.o;
        if (avhmVar != null) {
            return avhmVar;
        }
        this.g.execute(new avep(this, 12));
        return null;
    }

    public final void b(auzd auzdVar) {
        this.g.c();
        d(auze.a(auzdVar));
    }

    @Override // defpackage.avae
    public final avaa c() {
        return this.x;
    }

    public final void d(auze auzeVar) {
        this.g.c();
        auzd auzdVar = this.p.a;
        auzd auzdVar2 = auzeVar.a;
        if (auzdVar != auzdVar2) {
            ahno.R(this.p.a != auzd.e, "Cannot transition out of SHUTDOWN to %s", auzdVar2);
            if (this.e && auzdVar2 == auzd.c) {
                this.p = auze.a(auzd.d);
            } else {
                this.p = auzeVar;
            }
            this.a.a.a(auzeVar);
        }
    }

    public final void e() {
        this.g.execute(new avep(this, 14));
    }

    public final void f(Status status) {
        this.g.execute(new aves(this, status, 6));
    }

    public final void g() {
        SocketAddress socketAddress;
        auzs auzsVar;
        avcj avcjVar = this.g;
        avcjVar.c();
        ahno.P(this.v == null, "Should have no reconnectTask scheduled");
        avgb avgbVar = this.h;
        if (avgbVar.a == 0 && avgbVar.b == 0) {
            agfp agfpVar = this.j;
            agfpVar.d();
            agfpVar.e();
        }
        SocketAddress socketAddressB = avgbVar.b();
        if (socketAddressB instanceof auzs) {
            auzsVar = (auzs) socketAddressB;
            socketAddress = auzsVar.a;
        } else {
            socketAddress = socketAddressB;
            auzsVar = null;
        }
        auyo auyoVarA = avgbVar.a();
        String str = (String) auyoVarA.a(auzm.a);
        avdy avdyVar = new avdy();
        if (str == null) {
            str = this.y;
        }
        str.getClass();
        avdyVar.a = str;
        avdyVar.b = auyoVarA;
        avdyVar.c = this.z;
        this.C.getClass();
        avdyVar.d = auzsVar;
        avgd avgdVar = new avgd();
        avgdVar.a = this.x;
        avct avctVar = (avct) ((aviq) ((avdj) this.A).a).a;
        if (avctVar.e) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        avfz avfzVar = new avfz(new avdi(new avcy(avctVar.f, (InetSocketAddress) socketAddress, avdyVar.a, avdyVar.c, avdyVar.b, avctVar.b, avctVar.c, avctVar.d), avdyVar.a), this.B);
        avgdVar.a = avfzVar.c();
        auzw.a(this.c.d, avfzVar);
        this.n = avfzVar;
        this.l.add(avfzVar);
        avcjVar.b(avfzVar.b(new avgc(this, avfzVar)));
        this.d.b(2, "Started transport {0}", avgdVar.a);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.f("logId", this.x.a);
        ageuVarAc.b("addressGroups", this.i);
        return ageuVarAc.toString();
    }
}
