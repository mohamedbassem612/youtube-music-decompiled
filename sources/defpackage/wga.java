package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wga {
    public final amgg a;
    public List b;
    private List c;

    public wga(amgg amggVar) {
        amggVar.getClass();
        this.a = amggVar;
    }

    public final List a() {
        if (this.c == null) {
            amgg amggVar = this.a;
            this.c = new ArrayList(amggVar.f.size());
            for (amgi amgiVar : amggVar.f) {
                int i = amgiVar.b;
                if ((i & 1) != 0) {
                    List list = this.c;
                    aobx aobxVar = amgiVar.c;
                    if (aobxVar == null) {
                        aobxVar = aobx.a;
                    }
                    list.add(aawb.ae(aobxVar));
                } else if ((i & 4) != 0) {
                    List list2 = this.c;
                    apho aphoVar = amgiVar.e;
                    if (aphoVar == null) {
                        aphoVar = apho.a;
                    }
                    list2.add(aawb.ae(aphoVar));
                } else if ((i & 2) != 0) {
                    List list3 = this.c;
                    aoyh aoyhVar = amgiVar.d;
                    if (aoyhVar == null) {
                        aoyhVar = aoyh.a;
                    }
                    list3.add(aawb.ae(aoyhVar));
                } else if ((i & 8) != 0) {
                    List list4 = this.c;
                    aqmx aqmxVar = amgiVar.f;
                    if (aqmxVar == null) {
                        aqmxVar = aqmx.a;
                    }
                    list4.add(aawb.ae(aqmxVar));
                }
            }
        }
        return this.c;
    }
}
