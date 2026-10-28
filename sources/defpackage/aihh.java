package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aihh extends aihf implements aihj {
    public aihh(aihi aihiVar) {
        super(aihiVar);
    }

    private final aiha y() {
        aiha aihaVar = ((aihi) this.instance).j;
        if (!aihaVar.c) {
            return aihaVar;
        }
        aiha aihaVarC = aihaVar.clone();
        ((aihi) this.instance).j = aihaVarC;
        return aihaVarC;
    }

    private final void z(aihl aihlVar) {
        if (aihlVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.aihf, defpackage.aiir
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aihi buildPartial() {
        boolean zIsMutable = ((aihi) this.instance).isMutable();
        aihn aihnVar = this.instance;
        if (!zIsMutable) {
            return (aihi) aihnVar;
        }
        ((aihi) aihnVar).j.f();
        return (aihi) super.buildPartial();
    }

    @Override // defpackage.aihj
    public final Object b(aigw aigwVar) {
        aihi aihiVar = (aihi) this.instance;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        aihiVar.c(aihlVarCheckIsLite);
        Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
        return objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
    }

    public final boolean c(aigw aigwVar) {
        aihi aihiVar = (aihi) this.instance;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        aihiVar.c(aihlVarCheckIsLite);
        return aihiVar.j.n(aihlVarCheckIsLite.d);
    }

    @Override // defpackage.aihf
    protected final void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        if (((aihi) this.instance).j != aiha.a) {
            aihi aihiVar = (aihi) this.instance;
            aihiVar.j = aihiVar.j.clone();
        }
    }

    public final void d(aigw aigwVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        z(aihlVarCheckIsLite);
        copyOnWrite();
        aiha aihaVarY = y();
        aihk aihkVar = aihlVarCheckIsLite.d;
        aijl aijlVar = aihaVarY.b;
        aijlVar.remove(aihkVar);
        if (aijlVar.isEmpty()) {
            aihaVarY.d = false;
        }
    }

    public final void e(aigw aigwVar, Object obj) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        z(aihlVarCheckIsLite);
        copyOnWrite();
        aiha aihaVarY = y();
        aihk aihkVar = aihlVarCheckIsLite.d;
        if (!aihkVar.d) {
            obj = aihlVarCheckIsLite.e(obj);
        } else if (aihkVar.a() == aikb.h) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(aihlVarCheckIsLite.e(it.next()));
            }
            obj = arrayList;
        }
        aihaVarY.m(aihkVar, obj);
    }

    public final void f(alba albaVar) {
        copyOnWrite();
        alay alayVar = (alay) this.instance;
        alay alayVar2 = alay.a;
        albaVar.getClass();
        alayVar.d();
        alayVar.c.add(albaVar);
    }

    public final void g(Iterable iterable) {
        copyOnWrite();
        almd almdVar = (almd) this.instance;
        almd almdVar2 = almd.a;
        aiie aiieVar = almdVar.l;
        if (!aiieVar.c()) {
            almdVar.l = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, almdVar.l);
    }

    public final void h(Iterable iterable) {
        copyOnWrite();
        alvt alvtVar = (alvt) this.instance;
        alvt alvtVar2 = alvt.a;
        aiie aiieVar = alvtVar.C;
        if (!aiieVar.c()) {
            alvtVar.C = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, alvtVar.C);
    }

    public final void i(Iterable iterable) {
        copyOnWrite();
        amgg amggVar = (amgg) this.instance;
        amgg amggVar2 = amgg.a;
        amggVar.d();
        aifs.addAll(iterable, amggVar.e);
    }

    public final void j(amgj amgjVar) {
        copyOnWrite();
        amgg amggVar = (amgg) this.instance;
        amgg amggVar2 = amgg.a;
        amgjVar.getClass();
        amggVar.d();
        amggVar.e.add(amgjVar);
    }

    public final void k(apji apjiVar) {
        copyOnWrite();
        anzi anziVar = (anzi) this.instance;
        anzi anziVar2 = anzi.a;
        apjiVar.getClass();
        anziVar.d();
        anziVar.u.add(apjiVar);
    }

    public final void l(apji apjiVar) {
        copyOnWrite();
        anzi anziVar = (anzi) this.instance;
        anzi anziVar2 = anzi.a;
        apjiVar.getClass();
        anziVar.e();
        anziVar.t.add(apjiVar);
    }

    public final void m(Iterable iterable) {
        copyOnWrite();
        aofg aofgVar = (aofg) this.instance;
        aihw aihwVar = aofg.a;
        aofgVar.d();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aofgVar.e.h(((aoff) it.next()).h);
        }
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        aofg aofgVar = (aofg) this.instance;
        aihw aihwVar = aofg.a;
        aofgVar.e();
        aifs.addAll(iterable, aofgVar.f);
    }

    public final void o(aoff aoffVar) {
        copyOnWrite();
        aofg aofgVar = (aofg) this.instance;
        aihw aihwVar = aofg.a;
        aofgVar.d();
        aofgVar.e.h(aoffVar.h);
    }

    public final void p(aoui aouiVar) {
        copyOnWrite();
        aouj aoujVar = (aouj) this.instance;
        aouj aoujVar2 = aouj.a;
        aouiVar.getClass();
        aiie aiieVar = aoujVar.g;
        if (!aiieVar.c()) {
            aoujVar.g = aihn.mutableCopy(aiieVar);
        }
        aoujVar.g.add(aouiVar);
    }

    public final void q(Iterable iterable) {
        copyOnWrite();
        aqmh aqmhVar = (aqmh) this.instance;
        aqmh aqmhVar2 = aqmh.a;
        aqmhVar.d();
        aifs.addAll(iterable, aqmhVar.c);
    }

    public final void r(aqmg aqmgVar) {
        copyOnWrite();
        aqmh aqmhVar = (aqmh) this.instance;
        aqmh aqmhVar2 = aqmh.a;
        aqmgVar.getClass();
        aqmhVar.d();
        aqmhVar.c.add(aqmgVar);
    }

    public final void s(String str) {
        copyOnWrite();
        aqpi aqpiVar = (aqpi) this.instance;
        aihw aihwVar = aqpi.a;
        str.getClass();
        aqpiVar.d();
        aqpiVar.i.add(str);
    }

    public final asmv t(int i) {
        return (asmv) ((asmv) this.instance).e.get(i);
    }

    public final void u(Iterable iterable) {
        copyOnWrite();
        atte atteVar = (atte) this.instance;
        atte atteVar2 = atte.a;
        atteVar.d();
        aifs.addAll(iterable, atteVar.l);
    }

    public final void v(aihh aihhVar) {
        copyOnWrite();
        alay alayVar = (alay) this.instance;
        alba albaVar = (alba) aihhVar.build();
        alay alayVar2 = alay.a;
        albaVar.getClass();
        alayVar.d();
        alayVar.c.add(albaVar);
    }

    public final void w(aihf aihfVar) {
        copyOnWrite();
        aoun aounVar = (aoun) this.instance;
        ajkc ajkcVar = (ajkc) aihfVar.build();
        aoun aounVar2 = aoun.a;
        ajkcVar.getClass();
        aiie aiieVar = aounVar.o;
        if (!aiieVar.c()) {
            aounVar.o = aihn.mutableCopy(aiieVar);
        }
        aounVar.o.add(ajkcVar);
    }

    public final void x(aihf aihfVar) {
        copyOnWrite();
        aqmh aqmhVar = (aqmh) this.instance;
        aqmg aqmgVar = (aqmg) aihfVar.build();
        aqmh aqmhVar2 = aqmh.a;
        aqmgVar.getClass();
        aqmhVar.d();
        aqmhVar.c.add(aqmgVar);
    }

    public aihh() {
        throw null;
    }
}
