package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agid extends aghe {
    final /* synthetic */ agif a;
    private final Object b;
    private int c;

    public agid(agif agifVar, int i) {
        this.a = agifVar;
        this.b = agifVar.e(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            agif agifVar = this.a;
            if (i < agifVar.size() && Objects.equals(this.b, agifVar.e(this.c))) {
                return;
            }
        }
        this.c = this.a.d(this.b);
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object getValue() {
        agif agifVar = this.a;
        Map mapJ = agifVar.j();
        if (mapJ != null) {
            return mapJ.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return agifVar.h(i);
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object setValue(Object obj) {
        agif agifVar = this.a;
        Map mapJ = agifVar.j();
        if (mapJ != null) {
            return mapJ.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            agifVar.put(this.b, obj);
            return null;
        }
        Object objH = agifVar.h(i);
        agifVar.n(this.c, obj);
        return objH;
    }
}
