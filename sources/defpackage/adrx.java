package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrx {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public adrx(abnh abnhVar) {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.c = Optional.empty();
        this.a = Optional.empty();
        this.b = abnhVar.a;
        this.d = abnhVar.b;
        this.c = abnhVar.c;
        this.a = abnhVar.d;
    }

    public static List a(List list, Map map) {
        ArrayList arrayList = new ArrayList(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amng amngVar = (amng) it.next();
            if (amngVar.b == 128538449) {
                amnf amnfVar = (amnf) amngVar.c;
                int i = amnfVar.b;
                if (i == 2) {
                    aqmh aqmhVar = (aqmh) amnfVar.c;
                    adrx adrxVar = new adrx();
                    adrxVar.a = aqmhVar;
                    adrxVar.b = aliz.UNKNOWN;
                    adrxVar.c = adsc.c(aqmhVar);
                    arrayList.add(adrxVar);
                } else if (i == 1) {
                    alja aljaVar = (alja) amnfVar.c;
                    aliz alizVarA = aliz.a(aljaVar.c);
                    if (alizVarA == null) {
                        alizVarA = aliz.UNKNOWN;
                    }
                    aliz alizVar = aliz.UNKNOWN;
                    if (alizVarA != alizVar) {
                        aliz alizVarA2 = aliz.a(aljaVar.c);
                        if (alizVarA2 != null) {
                            alizVar = alizVarA2;
                        }
                        Integer num = (map == null || !map.containsKey(alizVar)) ? null : (Integer) map.get(alizVar);
                        aiqe aiqeVar = amnfVar.d;
                        if (aiqeVar == null) {
                            aiqeVar = aiqe.a;
                        }
                        adrx adrxVar2 = new adrx();
                        adrxVar2.a = null;
                        adrxVar2.b = alizVar;
                        if (aiqeVar != null && (aiqeVar.b & 1) != 0) {
                            aiqd aiqdVar = aiqeVar.c;
                            if (aiqdVar == null) {
                                aiqdVar = aiqd.a;
                            }
                            if ((aiqdVar.b & 2) != 0) {
                                aiqd aiqdVar2 = aiqeVar.c;
                                if (aiqdVar2 == null) {
                                    aiqdVar2 = aiqd.a;
                                }
                                adrxVar2.c = aiqdVar2.c;
                            }
                        }
                        adrxVar2.d = num;
                        arrayList.add(adrxVar2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final abnh b() {
        Object obj = this.b;
        Object obj2 = this.d;
        return new abnh((Optional) obj, (Optional) obj2, (Optional) this.c, (Optional) this.a);
    }

    public final void c(amac amacVar) {
        this.c = Optional.of(amacVar);
    }

    public adrx(byte[] bArr, byte[] bArr2) {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.c = Optional.empty();
        this.a = Optional.empty();
    }

    public adrx() {
        this.b = aliz.UNKNOWN;
    }
}
