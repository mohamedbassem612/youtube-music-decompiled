package defpackage;

import android.os.Handler;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zdw extends zdr {
    public final /* synthetic */ zdx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdw(zdx zdxVar, ywj ywjVar) {
        super(ywjVar);
        this.b = zdxVar;
    }

    private final boolean F() {
        return a() == yxj.a;
    }

    @Override // defpackage.ywd, defpackage.ywj
    public final void A(long j, long j2, ywk ywkVar, boolean z, long j3, zgs zgsVar) {
        taq.d();
        if (F()) {
            zdx zdxVar = this.b;
            List list = zdxVar.b;
            if (list.isEmpty()) {
                zhz zhzVar = new zhz("player.fatalexception", zdxVar.e(), "onTransition without queued video");
                if (zdxVar.e.bD()) {
                    super.i(zhzVar, a());
                } else {
                    super.h(zhzVar);
                }
                zdxVar.aa(false, 40);
                return;
            }
            ywn ywnVar = ywkVar.a;
            ywnVar.l("gts", String.valueOf(zdxVar.h.b() - (ywnVar.a() / 1000.0d)));
            zev zevVar = (zev) list.remove(0);
            ywk ywkVar2 = zdxVar.l;
            if (ywkVar2 != null) {
                zjr zjrVar = zdxVar.e;
                if (!zjrVar.bw() && z && zevVar.a == -1) {
                    D();
                }
                zdxVar.x = new aaok(zdxVar.n, ywkVar2.h, ywkVar2.d.g, j, j2, zevVar, true);
                zdxVar.Q(zjrVar.E.a(ywkVar.h));
                if (zjrVar.bw() && z && zevVar.a == -1) {
                    D();
                }
            }
            zdxVar.al(zevVar);
            super.A(j, j2, ywkVar, z, j3, zgsVar);
            Handler handler = zdxVar.a;
            handler.post(new ywt(zdxVar, 20));
            if (zdxVar.e.bD()) {
                handler.post(new zdv(zdxVar, 1));
            }
        }
    }

    @Override // defpackage.zdr
    public final void B(long j, long j2, ywk ywkVar, long j3) {
        super.A(j, j2, ywkVar, true, j3, zgq.a);
        zdx zdxVar = this.b;
        zdxVar.a.post(new ywt(zdxVar, 20));
    }

    @Override // defpackage.zdr
    public final void C(long j, ywk ywkVar) {
        super.A(j, ywkVar.e.a, ywkVar, false, this.b.h.f().toEpochMilli(), zgr.a);
    }

    @Override // defpackage.zdr
    public final void D() {
        if (this.b.e.bD()) {
            super.D();
        } else {
            super.g();
        }
    }

    @Override // defpackage.ywd, defpackage.ywj
    public final yxj a() {
        zdx zdxVar = this.b;
        if (zdxVar.e.bD()) {
            if (((zdr) this).a) {
                return yxj.c;
            }
            if (this != zdxVar.m) {
                return yxj.b;
            }
        }
        return yxj.a;
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void e() {
        taq.d();
        super.e();
        if (F()) {
            zdx zdxVar = this.b;
            if (zdxVar.e.bD()) {
                Handler handler = zdxVar.a;
                handler.removeCallbacks(zdxVar.q);
                handler.removeCallbacks(zdxVar.p);
                handler.removeCallbacks(zdxVar.t);
            }
        }
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void g() {
        taq.d();
        D();
        if (F()) {
            zdx zdxVar = this.b;
            zdxVar.B = false;
            zdxVar.a.post(new zdv(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, zew] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ywd, defpackage.yxg
    public final void h(zhz zhzVar) {
        String str;
        xsc xscVar;
        taq.d();
        yxj yxjVarA = a();
        int i = 0;
        if (yxjVarA == yxj.a) {
            if (zhzVar.f) {
                boolean zEquals = zhzVar.f().equals("load.next");
                zdx zdxVar = this.b;
                if (zEquals) {
                    List list = zdxVar.b;
                    zdxVar.c.addAll(0, list);
                    list.clear();
                    if (zdxVar.e.bD()) {
                        zdxVar.ae();
                    }
                    zhzVar = zhzVar.b(zhy.LOAD_NEXT_VIDEO);
                    yno.S(zdxVar.f, new jup(this, zhzVar.a(), 17), 0L, zdxVar.n, zdxVar.g, "Failed to doFallbackTransition.");
                } else {
                    zdxVar.ah();
                }
            } else if (zhzVar.l() || (this.b.e.bH() && Objects.equals(zhzVar.b, "other.playback") && (str = zhzVar.e) != null && str.startsWith(zhz.a))) {
                zdx zdxVar2 = this.b;
                List list2 = zdxVar2.b;
                zdxVar2.c.addAll(0, list2);
                if (!list2.isEmpty() && ((zev) list2.get(0)).a != -1) {
                    i = 1;
                }
                if (zhzVar.l() && i != 0) {
                    zdxVar2.o = true;
                }
                list2.clear();
                if (zdxVar2.e.bD()) {
                    zdxVar2.ae();
                }
                if (i != 0) {
                    zdxVar2.a.post(new ywt(this, 19));
                }
            }
            if (this.b.e.bD()) {
                super.i(zhzVar, yxjVarA);
                return;
            } else {
                super.h(zhzVar);
                return;
            }
        }
        zev zevVar = null;
        xsc xscVar2 = null;
        if (yxjVarA == yxj.c) {
            boolean z = zhzVar.f;
            zdx zdxVar3 = this.b;
            if (!z) {
                Iterator it = zdxVar3.j.iterator();
                while (it.hasNext()) {
                    if (((xsc) it.next()).b == this) {
                    }
                }
                return;
            }
            List<xsc> list3 = zdxVar3.j;
            for (xsc xscVar3 : list3) {
                if (xscVar3.b == this) {
                    xscVar2 = xscVar3;
                    break;
                }
            }
            if (xscVar2 == null) {
                return;
            }
            list3.remove(xscVar2);
            zdxVar3.ak(xscVar2.c);
            if (list3.isEmpty()) {
                zdxVar3.w.l();
            }
            super.i(zhzVar, yxjVarA);
            return;
        }
        if (!zhzVar.f) {
            super.i(zhzVar, yxjVarA);
            return;
        }
        zdx zdxVar4 = this.b;
        Iterator it2 = zdxVar4.k.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                xscVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (((zev) entry.getKey()).b.b == this) {
                zevVar = (zev) entry.getKey();
                xscVar = (xsc) entry.getValue();
                break;
            }
        }
        if (zevVar == null || xscVar == null) {
            return;
        }
        zdt zdtVar = zdxVar4.w;
        zdtVar.d((zcf) xscVar.c);
        zdtVar.e();
        List list4 = zdxVar4.c;
        List list5 = zdxVar4.b;
        list4.addAll(0, list5);
        boolean z2 = (list5.isEmpty() || ((zev) list5.get(0)).a == -1) ? false : true;
        list5.clear();
        ArrayList arrayList = new ArrayList(zdxVar4.i);
        int size = arrayList.size();
        while (i < size) {
            zdxVar4.af((zew) arrayList.get(i));
            i++;
        }
        if (z2) {
            zdxVar4.a.post(new ywt(zdxVar4, 18));
        }
        super.i(zhzVar.b(zhy.QUEUED_VIDEO_ERROR), yxjVarA);
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void i(zhz zhzVar, yxj yxjVar) {
        h(zhzVar);
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void n() {
        taq.d();
        super.n();
        if (F()) {
            zdx zdxVar = this.b;
            if (zdxVar.e.bD()) {
                Handler handler = zdxVar.a;
                handler.removeCallbacks(zdxVar.q);
                handler.removeCallbacks(zdxVar.p);
                handler.removeCallbacks(zdxVar.t);
            }
        }
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void q() {
        taq.d();
        super.q();
        if (!F()) {
            if (((zdr) this).a) {
                zdx zdxVar = this.b;
                if (zdxVar.e.bD() && zdxVar.y.K()) {
                    zdxVar.aj();
                    return;
                }
                return;
            }
            return;
        }
        zdx zdxVar2 = this.b;
        zdxVar2.B = false;
        zdv zdvVar = new zdv(this, 0);
        Handler handler = zdxVar2.a;
        handler.post(zdvVar);
        if (zdxVar2.e.bD()) {
            handler.post(new zdv(zdxVar2, 1));
            if (zdxVar2.y.K()) {
                zdxVar2.an();
                zdxVar2.aj();
            }
        }
    }
}
