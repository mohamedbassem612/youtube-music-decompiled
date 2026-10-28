package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wvw extends wvt {
    public final ahey c;
    public ScheduledFuture d;
    public final Set e;
    final Queue f;
    private final long g;
    private long h;
    private final Runnable i;

    public wvw(ahgb ahgbVar, wxi wxiVar, ahey aheyVar, long j, long j2) {
        super(ahgbVar, wxiVar);
        this.e = new HashSet();
        this.f = new ArrayDeque();
        this.i = new wvr(this, 4, null);
        this.c = aheyVar;
        this.g = Math.max(0L, j);
        this.h = Math.max(0L, j2);
    }

    private final void f() {
        Set set = this.e;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ListenableFuture) it.next()).cancel(false);
        }
        set.clear();
    }

    private final void g() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.d = null;
        }
    }

    private final void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            wtg wtgVar = new wtg(this, ajwoVar, 3);
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ammh.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            int i = ((ammh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).h;
            ahey aheyVar = this.c;
            ahew ahewVarSchedule = aheyVar.schedule(wtgVar, i, TimeUnit.MILLISECONDS);
            this.e.add(ahewVarSchedule);
            taf.i(ahewVarSchedule, aheyVar, new xfa(this, ahewVarSchedule, 1), new itt(this, ahewVarSchedule, 19), null);
        }
    }

    @Override // defpackage.wvt
    public final void a(List list, long j) {
        boolean z;
        axmq axmqVar;
        long jMax = Math.max(0L, j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ammh.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammh.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                if ((((ammh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c & 16) != 0) {
                    arrayList.add(ajwoVar);
                }
            }
            arrayList2.add(ajwoVar);
        }
        agke agkeVarN = agke.n(arrayList);
        agke agkeVarN2 = agke.n(arrayList2);
        wxi wxiVar = this.a;
        wwv wwvVar = ((wwn) wxiVar).r;
        if (wwvVar != null && wwvVar.a() == 0) {
            this.b.k(agkeVarN2, wxiVar, false);
            h(agkeVarN);
            wwvVar.o();
            return;
        }
        h(agkeVarN);
        if (agkeVarN2.isEmpty() && jMax == this.h) {
            return;
        }
        this.h = jMax;
        g();
        ArrayList arrayList3 = new ArrayList();
        Queue queue = this.f;
        long j2 = 0;
        if (queue.isEmpty()) {
            z = true;
        } else {
            z = false;
            while (!queue.isEmpty()) {
                axmq axmqVar2 = (axmq) queue.poll();
                if (axmqVar2 != null) {
                    arrayList3.addAll(axmqVar2.b);
                    long j3 = axmqVar2.a;
                    if (j3 <= 0) {
                        z = true;
                    } else {
                        j2 = j3;
                    }
                }
            }
        }
        arrayList3.addAll(agkeVarN2);
        if (!arrayList3.isEmpty()) {
            long j4 = this.g;
            long jMax2 = Math.max(j4, this.h);
            int iMax = Math.max(1, Math.min(j4 == 0 ? 1 : (int) Math.floor(jMax2 / j4), arrayList3.size()));
            long j5 = j2;
            int iCeil = (int) Math.ceil(((double) arrayList3.size()) / ((double) iMax));
            long j6 = jMax2 / ((long) iMax);
            if (j5 > 0) {
                j6 = (j6 + j5) / 2;
            }
            int size = arrayList3.size();
            int i = 0;
            while (size > 0) {
                int iMin = Math.min(iCeil, size);
                int i2 = i + iMin;
                queue.add(new axmq(arrayList3.subList(i, i2), true != z ? j6 : 0L));
                size -= iMin;
                i = i2;
                z = false;
            }
        }
        if (queue.isEmpty() || (axmqVar = (axmq) queue.peek()) == null) {
            return;
        }
        this.d = this.c.schedule(this.i, axmqVar.a, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
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
    @Override // defpackage.wvt, defpackage.wxn
    public final void b() {
        g();
        f();
        while (true) {
            Queue queue = this.f;
            if (queue.isEmpty()) {
                return;
            }
            axmq axmqVar = (axmq) queue.poll();
            if (axmqVar != null) {
                this.b.k(axmqVar.b, this.a, true);
            }
        }
    }

    @Override // defpackage.wvt, defpackage.wxn
    public final void e() {
        g();
        f();
        g();
        f();
        this.f.clear();
    }
}
