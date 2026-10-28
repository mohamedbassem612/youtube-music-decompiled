package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pyw implements pyt {
    private static final agsn b = agsn.h("GnpSdk");
    private final Set c;
    private final pzb d;

    public pyw(Set set, pzb pzbVar) {
        pzbVar.getClass();
        this.c = set;
        this.d = pzbVar;
    }

    @Override // defpackage.pyt
    public final int a() {
        return 2;
    }

    @Override // defpackage.pyt
    public final /* synthetic */ pot b(pot potVar) {
        int i = pyq.a;
        potVar.getClass();
        return potVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.pyt
    public final Object c(plx plxVar, pot potVar, pzq pzqVar, plb plbVar, awoq awoqVar) throws Throwable {
        pyv pyvVar;
        atr atrVar;
        pyu pyuVar;
        pot potVar2 = potVar;
        if (awoqVar instanceof pyv) {
            pyvVar = (pyv) awoqVar;
            int i = pyvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pyvVar.c = i - Integer.MIN_VALUE;
            } else {
                pyvVar = new pyv(this, awoqVar);
            }
        } else {
            pyvVar = new pyv(this, awoqVar);
        }
        pyv pyvVar2 = pyvVar;
        Object obj = pyvVar2.a;
        awox awoxVar = awox.a;
        int i2 = pyvVar2.c;
        if (i2 == 0) {
            atqp.j(obj);
            atr atrVar2 = pzqVar.a;
            aidq aidqVar = potVar2.o;
            aicj aicjVar = aidqVar.y;
            if (aicjVar == null) {
                aicjVar = aicj.a;
            }
            if (!aicjVar.b.isEmpty()) {
                plx plxVar2 = plxVar;
                int iA = this.d.a(plxVar2, potVar2.a);
                if (iA == -2) {
                    aicj aicjVar2 = aidqVar.y;
                    if (aicjVar2 == null) {
                        aicjVar2 = aicj.a;
                    }
                    aiie<aici> aiieVar = aicjVar2.b;
                    aiieVar.getClass();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (aici aiciVar : aiieVar) {
                        if (!linkedHashSet.contains(aich.a(aiciVar.b))) {
                            agqr it = ((agqj) this.c).iterator();
                            do {
                                if (it.hasNext()) {
                                    pyuVar = (pyu) it.next();
                                } else {
                                    ((agsj) b.b()).w("No customizer for layout %s installed", aich.a(aiciVar.b));
                                }
                                return pys.e;
                            } while (pyuVar.a() != aich.a(aiciVar.b));
                            if (!pyuVar.b()) {
                                return pys.e;
                            }
                            aich aichVarA = aich.a(aiciVar.b);
                            aichVarA.getClass();
                            linkedHashSet.add(aichVarA);
                        }
                    }
                    iA = 0;
                }
                if (iA != -1) {
                    if (iA >= 0) {
                        aicj aicjVar3 = aidqVar.y;
                        if (aicjVar3 == null) {
                            aicjVar3 = aicj.a;
                        }
                        if (iA < aicjVar3.b.size()) {
                            aicj aicjVar4 = aidqVar.y;
                            if (aicjVar4 == null) {
                                aicjVar4 = aicj.a;
                            }
                            aici aiciVar2 = (aici) aicjVar4.b.get(iA);
                            aiciVar2.getClass();
                            if (aich.a(aiciVar2.b) == aich.d) {
                                ((agsj) b.b()).u("View at index %d has no layout set", iA);
                                return pys.g;
                            }
                            agqr it2 = ((agqj) this.c).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    ((agsj) b.b()).w("No customizer for layout %s installed", aich.a(aiciVar2.b));
                                    return pys.g;
                                }
                                pyu pyuVar2 = (pyu) it2.next();
                                if (pyuVar2.a() == aich.a(aiciVar2.b)) {
                                    pyvVar2.d = atrVar2;
                                    pyvVar2.c = 1;
                                    Object objC = pyuVar2.c(atrVar2, plxVar2, potVar2, aiciVar2, pyvVar2);
                                    if (objC == awoxVar) {
                                        return awoxVar;
                                    }
                                    obj = objC;
                                    atrVar = atrVar2;
                                    break;
                                }
                                plxVar2 = plxVar;
                                potVar2 = potVar;
                            }
                        }
                    }
                    ((agsj) b.b()).u("Invalid view index: %d", iA);
                    return pys.g;
                }
            }
            return pys.f;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atrVar = pyvVar2.d;
        atqp.j(obj);
        ahzt ahztVar = (ahzt) obj;
        if (ahztVar == null) {
            return pys.g;
        }
        ((Bundle) grj.o(atrVar).a).putInt("chime.extensionView", ahztVar.e);
        return pys.a;
    }
}
