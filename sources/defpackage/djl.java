package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djl {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public djl(awut awutVar, awqg awqgVar, awqk awqkVar, awqk awqkVar2) {
        this.a = awutVar;
        this.b = awqkVar2;
        this.c = awuw.h(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        this.d = new ci((byte[]) null, (byte[]) null);
        awwd awwdVar = (awwd) ((axcw) awutVar).a.get(awwd.d);
        if (awwdVar != null) {
            awwdVar.kJ(new efa(awqgVar, this, awqkVar, 1));
        }
    }

    public final void a(djp djpVar) {
        if (((ags) this.c).b(djpVar)) {
            ((djq) this.a).b(this, djpVar, -1);
        }
    }

    public final void b(djp djpVar, int i) {
        if (i != 1) {
            i = 0;
        }
        if (((ags) this.c).b(djpVar)) {
            ((djq) this.a).b(this, djpVar, i);
        }
    }

    public final void c(djm djmVar) {
        if (((ags) this.b).b(djmVar)) {
            Object obj = this.a;
            if (djmVar.f != null) {
                throw new IllegalArgumentException(a.bV(djmVar, "Handler '", "' is already registered with a dispatcher"));
            }
            djq djqVar = (djq) obj;
            djqVar.c.addFirst(djmVar);
            djmVar.f = this;
            djqVar.c();
        }
    }

    public final void d(djp djpVar, djk djkVar) {
        djq djqVar = (djq) this.a;
        if (djqVar.e == 0) {
            djm djmVarA = djqVar.a(-1);
            djqVar.d = djmVarA;
            djqVar.e = -1;
            djqVar.f = djpVar;
            if (djkVar != null) {
                if (djmVarA != null) {
                    djmVarA.e();
                }
                djqVar.a.d(new djs(djkVar));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [bpl, java.lang.Object] */
    public final bpi e(awsd awsdVar, String str) {
        bpi bpiVarP;
        synchronized (this.d) {
            Map map = ((bpo) this.a).a;
            bpiVarP = (bpi) map.get(str);
            if (awsdVar.d(bpiVarP)) {
                bpiVarP.getClass();
            } else {
                bpv bpvVar = new bpv((bpt) this.b);
                bpvVar.b(bpn.a, str);
                bpiVarP = ast.p(this.c, awsdVar, bpvVar);
                bpiVarP.getClass();
                bpi bpiVar = (bpi) map.put(str, bpiVarP);
                if (bpiVar != null) {
                    bpiVar.t();
                }
            }
        }
        return bpiVarP;
    }

    public final ArrayList f(Object obj) {
        return (ArrayList) ((aha) this.d).get(obj);
    }

    public final void g(Object obj) {
        aha ahaVar = (aha) this.d;
        if (ahaVar.containsKey(obj)) {
            return;
        }
        ahaVar.put(obj, null);
    }

    public final void h(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((aha) this.d).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                h(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public djl(bpo bpoVar, bpl bplVar, bpt bptVar) {
        this.a = bpoVar;
        this.c = bplVar;
        this.b = bptVar;
        this.d = new bou();
    }

    public djl() {
        this.b = new axs(10);
        this.d = new aha(0);
        this.a = new ArrayList();
        this.c = new HashSet();
    }

    public djl(hhb hhbVar) {
        this.d = hhbVar;
        this.a = new djq();
        int i = agt.a;
        new ags(6);
        this.b = new ags(6);
        this.c = new ags(6);
    }

    public djl(bkl bklVar, bkl bklVar2, Object obj) {
        this.c = bklVar;
        this.b = "";
        this.a = bklVar2;
        this.d = obj;
    }
}
