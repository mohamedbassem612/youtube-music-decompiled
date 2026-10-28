package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avie extends avat {
    public static final Logger f = Logger.getLogger(avie.class.getName());
    static final boolean g;
    public final boolean h;
    public final aval i;
    public final Map j;
    public final avhz k;
    public int l;
    public boolean m;
    public auzd n;
    public auzd o;
    public boolean p;
    public avfa q;
    public axoz r;
    public axoz s;
    private final boolean t;

    static {
        avbb avbbVar = avfp.a;
        g = auzn.a("GRPC_EXPERIMENTAL_PF_WEIGHTED_SHUFFLING", true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public avie(aval avalVar) {
        boolean z;
        if (j()) {
            z = false;
        } else {
            int i = avij.b;
            avbb avbbVar = avfp.a;
            if (auzn.a("GRPC_PF_USE_HAPPY_EYEBALLS", false)) {
                z = true;
            } else {
                z = false;
            }
        }
        this.h = z;
        this.j = new HashMap();
        this.k = new avhz(agpi.a, z);
        this.l = 0;
        this.m = true;
        this.r = null;
        auzd auzdVar = auzd.d;
        this.n = auzdVar;
        this.o = auzdVar;
        this.p = true;
        this.s = null;
        this.t = j();
        this.i = avalVar;
    }

    static List d(List list, Random random) {
        if (!g) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, random);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            auzm auzmVar = (auzm) it.next();
            Long l = (Long) auzmVar.f.a(auzy.a);
            if (l == null) {
                l = 1L;
            }
            arrayList2.add(new avid(auzmVar, Math.pow(random.nextDouble(), 1.0d / l.longValue())));
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        return aguu.u(arrayList2, new ampw(7));
    }

    static boolean j() {
        avbb avbbVar = avfp.a;
        return auzn.a("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    public static final SocketAddress k(avaq avaqVar) {
        boolean z;
        avdd avddVar = (avdd) avaqVar;
        avddVar.i.o.c();
        ahno.P(avddVar.g, "not started");
        List list = avddVar.e;
        if (list != null) {
            z = list.size() == 1;
        }
        ahno.R(z, "%s does not have exactly one group", list);
        return (SocketAddress) ((auzm) list.get(0)).e.get(0);
    }

    private final void l() {
        if (this.h) {
            axoz axozVar = this.r;
            if (axozVar == null || !axozVar.b()) {
                aval avalVar = this.i;
                this.r = avalVar.c().d(new avgv(this, 7), 250L, TimeUnit.MILLISECONDS, avalVar.d());
            }
        }
    }

    private final boolean m(agke agkeVar) {
        Map map = this.j;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            hashSet2.addAll(((auzm) agkeVar.get(i)).e);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((avic) map.remove(socketAddress)).a.b();
            }
        }
        return hashSet.isEmpty();
    }

    @Override // defpackage.avat
    public final Status a(avap avapVar) {
        avia aviaVar;
        Boolean bool;
        if (this.n == auzd.e) {
            return Status.i.withDescription("Already shut down");
        }
        auyo auyoVar = avapVar.b;
        Boolean bool2 = (Boolean) auyoVar.a(e);
        this.p = bool2 == null || !bool2.booleanValue();
        List<auzm> list = avapVar.a;
        if (list.isEmpty()) {
            Status statusWithDescription = Status.m.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + auyoVar.toString());
            b(statusWithDescription);
            return statusWithDescription;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((auzm) it.next()) == null) {
                Status statusWithDescription2 = Status.m.withDescription("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list) + ", attrs=" + auyoVar.toString());
                b(statusWithDescription2);
                return statusWithDescription2;
            }
        }
        this.m = true;
        HashSet hashSet = new HashSet();
        List arrayList = new ArrayList();
        for (auzm auzmVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : auzmVar.e) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new auzm(arrayList2, auzmVar.f));
            }
        }
        Object obj = avapVar.c;
        if ((obj instanceof avia) && (bool = (aviaVar = (avia) obj).a) != null && bool.booleanValue()) {
            Long l = aviaVar.b;
            arrayList = d(arrayList, new Random());
        }
        agke agkeVarN = agke.n(arrayList);
        auzd auzdVar = this.n;
        auzd auzdVar2 = auzd.b;
        if (auzdVar == auzdVar2 || (auzdVar == auzd.a && (!this.h || this.k.f()))) {
            avhz avhzVar = this.k;
            SocketAddress socketAddressB = avhzVar.b();
            avhzVar.d(agkeVarN);
            if (avhzVar.g(socketAddressB)) {
                avaq avaqVar = ((avic) this.j.get(socketAddressB)).a;
                if (!avhzVar.f()) {
                    throw new IllegalStateException("Index is past the end of the address group list");
                }
                axoz axozVar = (axoz) avhzVar.a.get(avhzVar.b);
                avaqVar.d(Collections.singletonList(new auzm((SocketAddress) axozVar.b, (auyo) axozVar.a)));
                m(agkeVarN);
                return Status.OK;
            }
        } else {
            this.k.d(agkeVarN);
        }
        if (m(agkeVarN)) {
            auzd auzdVar3 = auzd.a;
            this.n = auzdVar3;
            h(auzdVar3, new avak(avan.d("pick_first: address list updated")));
        }
        auzd auzdVar4 = this.n;
        if (auzdVar4 == auzdVar2) {
            auzd auzdVar5 = auzd.d;
            this.n = auzdVar5;
            h(auzdVar5, new avib(this, this));
        } else if (auzdVar4 == auzd.a || auzdVar4 == auzd.c) {
            e();
            f();
        }
        return Status.OK;
    }

    @Override // defpackage.avat
    public final void b(Status status) {
        if (this.n != auzd.e) {
            Map map = this.j;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((avic) it.next()).a.b();
            }
            map.clear();
            this.k.d(agpi.a);
            auzd auzdVar = auzd.c;
            this.n = auzdVar;
            h(auzdVar, new avak(avan.b(status)));
        }
    }

    @Override // defpackage.avat
    public final void c() {
        Logger logger = f;
        Level level = Level.FINE;
        Map map = this.j;
        logger.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        auzd auzdVar = auzd.e;
        this.n = auzdVar;
        this.o = auzdVar;
        e();
        axoz axozVar = this.s;
        if (axozVar != null) {
            axozVar.a();
            this.s = null;
        }
        this.q = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((avic) it.next()).a.b();
        }
        map.clear();
    }

    public final void e() {
        axoz axozVar = this.r;
        if (axozVar != null) {
            axozVar.a();
            this.r = null;
        }
    }

    public final void f() {
        avhz avhzVar = this.k;
        if (avhzVar.f() && this.n != auzd.e && this.s == null) {
            SocketAddress socketAddressB = avhzVar.b();
            Map map = this.j;
            avic avicVar = (avic) map.get(socketAddressB);
            if (avicVar == null) {
                if (!avhzVar.f()) {
                    throw new IllegalStateException("Index is off the end of the address group list");
                }
                Object obj = ((axoz) avhzVar.a.get(avhzVar.b)).a;
                avhy avhyVar = new avhy(this);
                aval avalVar = this.i;
                avag avagVar = new avag();
                int i = 1;
                avagVar.c(aguu.s(new auzm(socketAddressB, (auyo) obj)));
                avagVar.b(b, avhyVar);
                avagVar.b(avat.c, Boolean.valueOf(this.t));
                avaq avaqVarB = avalVar.b(avagVar.a());
                avic avicVar2 = new avic(avaqVarB, auzd.d);
                avhyVar.a = avicVar2;
                map.put(socketAddressB, avicVar2);
                avai avaiVar = ((avdd) avaqVarB).a;
                if (this.p || avaiVar.b.a(avat.d) == null) {
                    avicVar2.d = auze.a(auzd.b);
                }
                avaqVarB.c(new avif(this, avicVar2, i));
                avicVar = avicVar2;
            }
            int iOrdinal = avicVar.b.ordinal();
            if (iOrdinal == 0) {
                l();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    avicVar.a.a();
                    avicVar.b(auzd.a);
                    l();
                    return;
                }
                return;
            }
            if (!this.t) {
                avhzVar.e();
                f();
            } else if (!avhzVar.f()) {
                g();
            } else {
                avicVar.a.a();
                avicVar.b(auzd.a);
            }
        }
    }

    public final void g() {
        if (this.t && this.s == null) {
            avfa avfaVar = this.q;
            if (avfaVar == null) {
                avfaVar = new avfa();
                this.q = avfaVar;
            }
            long jA = avfaVar.a();
            aval avalVar = this.i;
            this.s = avalVar.c().d(new avgv(this, 6), jA, TimeUnit.NANOSECONDS, avalVar.d());
        }
    }

    public final void h(auzd auzdVar, avar avarVar) {
        if (auzdVar == this.o && (auzdVar == auzd.d || auzdVar == auzd.a)) {
            return;
        }
        this.o = auzdVar;
        this.i.f(auzdVar, avarVar);
    }

    public final void i(avic avicVar) {
        auzd auzdVar = avicVar.b;
        auzd auzdVar2 = auzd.b;
        if (auzdVar == auzdVar2) {
            if (this.p || avicVar.a() == auzdVar2) {
                h(auzdVar2, new avak(avan.e(avicVar.a)));
                return;
            }
            auzd auzdVarA = avicVar.a();
            auzd auzdVar3 = auzd.c;
            if (auzdVarA == auzdVar3) {
                h(auzdVar3, new avak(avan.b(avicVar.d.b)));
            } else if (this.o != auzdVar3) {
                h(avicVar.a(), new avak(avan.d("health check state: ".concat(avicVar.a().toString()))));
            }
        }
    }
}
