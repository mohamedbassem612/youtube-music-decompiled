package defpackage;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wvv extends wvt {
    public final Handler c;
    public final Queue d;
    public long e;
    public long f;
    public final List g;
    private final ahey h;
    private long i;
    private final Runnable j;
    private final vxz k;

    public wvv(Handler handler, ahgb ahgbVar, wxi wxiVar, ahey aheyVar, vxz vxzVar) {
        super(ahgbVar, wxiVar);
        this.d = new ArrayDeque();
        this.e = 224L;
        this.g = new ArrayList();
        this.j = new wvr(this, 3, null);
        this.c = handler;
        this.h = aheyVar;
        this.k = vxzVar;
    }

    private final void f() {
        List list = this.g;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ListenableFuture) it.next()).cancel(false);
        }
        list.clear();
    }

    public static final boolean h(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ammh.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammh.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            if ((((ammh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c & 16) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wvt
    public void a(List list, long j) {
        wxi wxiVar = this.a;
        wwn wwnVar = (wwn) wxiVar;
        wwv wwvVar = wwnVar.r;
        if (wwvVar != null && wwvVar.a() == 0) {
            Stream streamFilter = Collection.EL.stream(list).filter(new uvm(19));
            Collector collector = aghu.a;
            agke<ajwo> agkeVar = (agke) streamFilter.collect(collector);
            int i = 20;
            this.b.k((List) Collection.EL.stream(list).filter(new uvm(i)).collect(collector), wxiVar, false);
            for (ajwo ajwoVar : agkeVar) {
                wtg wtgVar = new wtg(this, ajwoVar, 2);
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ammh.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                ahew ahewVarSchedule = this.h.schedule(wtgVar, ((ammh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).h, TimeUnit.MILLISECONDS);
                this.g.add(ahewVarSchedule);
                taf.h(ahewVarSchedule, new cte(11), new gou(this, ahewVarSchedule, i));
            }
            wwvVar.o();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        String strDO = null;
        while (it.hasNext()) {
            ajwo ajwoVar2 = (ajwo) it.next();
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammh.b);
            ajwoVar2.c(aihlVarCheckIsLite2);
            if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ammh.b);
                ajwoVar2.c(aihlVarCheckIsLite3);
                Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
                ammh ammhVar = (ammh) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                if (ammhVar.e.isEmpty()) {
                    amow amowVar = ammhVar.d;
                    if (amowVar == null) {
                        amowVar = amow.a;
                    }
                    strDO = yno.dO(amowVar);
                } else {
                    strDO = ammhVar.e;
                }
            } else {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ammi.b);
                ajwoVar2.c(aihlVarCheckIsLite4);
                if (!ajwoVar2.j.n(aihlVarCheckIsLite4.d)) {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ammt.b);
                    ajwoVar2.c(aihlVarCheckIsLite5);
                    if (ajwoVar2.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ammt.b);
                        ajwoVar2.c(aihlVarCheckIsLite6);
                        Object objK3 = ajwoVar2.j.k(aihlVarCheckIsLite6.d);
                        strDO = ((ammt) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).c;
                    } else {
                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ammk.b);
                        ajwoVar2.c(aihlVarCheckIsLite7);
                        if (ajwoVar2.j.n(aihlVarCheckIsLite7.d)) {
                            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ammk.b);
                            ajwoVar2.c(aihlVarCheckIsLite8);
                            Object objK4 = ajwoVar2.j.k(aihlVarCheckIsLite8.d);
                            amrb amrbVar = ((ammk) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4))).c;
                            if (amrbVar == null) {
                                amrbVar = amrb.a;
                            }
                            int i2 = amrbVar.b;
                            if (i2 == 132600952) {
                                strDO = ((amrc) amrbVar.c).c;
                            } else if (i2 == 132600924) {
                                strDO = ((amrd) amrbVar.c).c;
                            } else {
                                strDO = i2 == 201730354 ? ((amra) amrbVar.c).b : null;
                            }
                        } else {
                            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(ammr.b);
                            ajwoVar2.c(aihlVarCheckIsLite9);
                            if (ajwoVar2.j.n(aihlVarCheckIsLite9.d)) {
                                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(ammr.b);
                                ajwoVar2.c(aihlVarCheckIsLite10);
                                Object objK5 = ajwoVar2.j.k(aihlVarCheckIsLite10.d);
                                strDO = ((ammr) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5))).g;
                            } else {
                                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(amms.b);
                                ajwoVar2.c(aihlVarCheckIsLite11);
                                ajwoVar2.j.n(aihlVarCheckIsLite11.d);
                            }
                        }
                    }
                }
            }
            zs zsVar = (zs) linkedHashMap.get(strDO);
            if (zsVar == null) {
                zsVar = new zs(new ArrayList(), (byte[]) null);
                linkedHashMap.put(strDO, zsVar);
            }
            ((ArrayList) zsVar.a).add(ajwoVar2);
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            this.d.add((zs) ((Map.Entry) it2.next()).getValue());
        }
        if (j == 0) {
            j = 500;
        }
        int size = this.d.size();
        if (size > 0) {
            long j2 = ((j + 15) / ((long) size)) / 16;
            long jMax = Math.max(1L, j2);
            long jMin = Math.min(Math.max(7L, j2), 30L);
            this.f = Math.max(1L, (jMin / jMax) + 1);
            this.e = jMin << 4;
            if (!this.k.m(18, 45783165L)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis >= this.i) {
                    wxr wxrVar = wwnVar.e;
                    if (wxrVar != null) {
                        RecyclerView recyclerViewQ = ((xbn) wxrVar).q();
                        if (jMax >= 14) {
                            if (recyclerViewQ.E == null) {
                                recyclerViewQ.af(new lu());
                            }
                        } else if (recyclerViewQ.E != null) {
                            recyclerViewQ.af(null);
                        }
                    }
                    this.i = jCurrentTimeMillis + 60000;
                }
            }
            if (size == linkedHashMap.size()) {
                this.c.post(this.j);
            }
        }
    }

    @Override // defpackage.wvt, defpackage.wxn
    public void b() {
        this.c.removeCallbacks(this.j);
        f();
        while (true) {
            Queue queue = this.d;
            if (queue.isEmpty()) {
                return;
            } else {
                i((zs) queue.remove());
            }
        }
    }

    @Override // defpackage.wvt, defpackage.wxn
    public void d() {
        this.i = 0L;
    }

    @Override // defpackage.wvt, defpackage.wxn
    public void e() {
        this.c.removeCallbacks(this.j);
        f();
        this.d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
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
    public final void i(zs zsVar) {
        this.b.k(zsVar.a, this.a, true);
    }
}
