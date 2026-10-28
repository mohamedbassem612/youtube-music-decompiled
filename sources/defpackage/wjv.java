package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wjv implements wjw {
    public final List a;
    protected final aunn b;
    public final Object c;
    private final aunn d;

    public wjv(aunn aunnVar, aunn aunnVar2) {
        aunnVar.getClass();
        this.b = aunnVar;
        this.a = new ArrayList();
        this.c = new Object();
        this.d = aunnVar2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [abvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [abvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.wjw
    public final void a(Object obj) {
        wjv wjvVar;
        aoow aoowVarS;
        aoox aooxVar;
        abis abisVar;
        Object objC;
        ajwo ajwoVar = (ajwo) obj;
        aoow aoowVarS2 = ((grj) this.d.io()).s(ajwoVar);
        if (aoowVarS2 == null || aoowVarS2.b) {
            return;
        }
        abzi abziVar = (abzi) this.b.io();
        ?? r0 = abziVar.i;
        grj grjVar = (grj) r0.get(arij.class);
        aoqb aoqbVarCn = abmt.cn((vxu) abziVar.c);
        if (aoqbVarCn != null && aoqbVarCn.j && (objC = vxg.c(ajwoVar)) != null && r0.containsKey(objC.getClass())) {
            grjVar = (grj) r0.get(objC.getClass());
        }
        tam tamVar = null;
        if (grjVar == null || (aoowVarS = grjVar.s(ajwoVar)) == null) {
            wjvVar = this;
        } else {
            if (ajwoVar != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    aril arilVar = arijVar.n;
                    if (arilVar == null) {
                        arilVar = aril.a;
                    }
                    if ((arilVar.b & 8) != 0) {
                        aril arilVar2 = arijVar.n;
                        if (arilVar2 == null) {
                            arilVar2 = aril.a;
                        }
                        aooxVar = arilVar2.e;
                        if (aooxVar == null) {
                            aooxVar = aoox.a;
                        }
                    } else {
                        aooxVar = null;
                    }
                } else {
                    aooxVar = null;
                }
            } else {
                aooxVar = null;
            }
            agkx agkxVar = new agkx();
            if (aoowVarS.c != 0) {
                abir abirVar = new abir((abvk) abziVar.m.io(), (abvn) abziVar.k.io(), aoowVarS);
                abirVar.c();
                agkxVar.c(abirVar);
            }
            if (grj.t(aoowVarS)) {
                ?? r4 = abziVar.k;
                Object obj2 = ((abvn) r4.io()).ab().a;
                abziVar.e.s();
                abip abipVar = new abip(ajwoVar, (abix) abziVar.f, (abvn) r4.io());
                abipVar.c();
                agkxVar.c(abipVar);
            }
            agkz agkzVarG = agkxVar.g();
            if (aooxVar != null) {
                abisVar = new abis(aooxVar, abziVar.j, (tbt) abziVar.h, grj.t(aoowVarS) ? agdf.a : agev.i(((zkh) grjVar.a).io()));
            } else {
                abisVar = null;
            }
            wjvVar = this;
            tamVar = new tam(abziVar.g, agkzVarG, wjvVar, (abss) abziVar.l.io(), ajwoVar, aoowVarS, abisVar, (tbt) abziVar.h, (agev) abziVar.d, (abvn) abziVar.k.io(), abziVar.e, abziVar.b, (abmt) abziVar.a);
        }
        if (tamVar != null) {
            synchronized (wjvVar.c) {
                wjvVar.a.add(tamVar);
            }
            tamVar.a();
        }
    }
}
