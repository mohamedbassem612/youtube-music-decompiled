package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bqa implements boq {
    public final bqg a;
    public final bpx b;
    public boolean c = false;

    public bqa(bqg bqgVar, bpx bpxVar) {
        this.a = bqgVar;
        this.b = bpxVar;
    }

    @Override // defpackage.boq
    public final void a(Object obj) {
        if (bpy.c(2)) {
            Objects.toString(this.a);
            bqg.o(obj);
        }
        this.c = true;
        this.b.b(obj);
    }

    public final String toString() {
        return this.b.toString();
    }
}
