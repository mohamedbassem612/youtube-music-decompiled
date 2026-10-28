package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agjf extends aghe {
    final Object a;
    int b;
    final /* synthetic */ agjo c;

    public agjf(agjo agjoVar, int i) {
        this.c = agjoVar;
        this.a = agjoVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            agjo agjoVar = this.c;
            if (i <= agjoVar.c && Objects.equals(agjoVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.c(this.a);
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        agjo agjoVar = this.c;
        if (i == -1) {
            agjoVar.g(this.a, obj, false);
            return null;
        }
        Object obj2 = agjoVar.b[i];
        if (Objects.equals(obj2, obj)) {
            return obj;
        }
        agjoVar.k(this.b, obj, false);
        return obj2;
    }
}
