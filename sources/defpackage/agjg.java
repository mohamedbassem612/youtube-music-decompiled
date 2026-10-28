package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agjg extends aghe {
    final agjo a;
    final Object b;
    int c;

    public agjg(agjo agjoVar, int i) {
        this.a = agjoVar;
        this.b = agjoVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            agjo agjoVar = this.a;
            if (i <= agjoVar.c && Objects.equals(this.b, agjoVar.b[i])) {
                return;
            }
        }
        this.c = this.a.e(this.b);
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        agjo agjoVar = this.a;
        if (i == -1) {
            agjoVar.l(this.b, obj);
            return null;
        }
        Object obj2 = agjoVar.a[i];
        if (Objects.equals(obj2, obj)) {
            return obj;
        }
        agjoVar.m(this.c, obj);
        return obj2;
    }
}
