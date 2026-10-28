package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkk {
    public boolean a;
    public Object b;
    public Object c;

    public hkk(wqe wqeVar, boolean z) {
        ArrayList arrayList = null;
        this.c = null;
        this.b = wqeVar;
        this.a = z;
        alrc alrcVar = wqeVar.a;
        if (alrcVar != null) {
            arrayList = new ArrayList();
            for (alrd alrdVar : alrcVar.d) {
                for (aonn aonnVar : (alrdVar.b == 117866661 ? (aonm) alrdVar.c : aonm.a).b) {
                    int i = aonnVar.b;
                    if (i == 117501096) {
                        arrayList.add(i == 117501096 ? (aonl) aonnVar.c : aonl.a);
                    }
                }
            }
        }
        this.c = arrayList;
    }

    public final void a(String str) {
        this.b = Optional.of(str);
    }

    public hkk() {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.a = false;
    }

    public hkk(List list) {
        this.b = null;
        this.a = false;
        this.c = list;
    }
}
