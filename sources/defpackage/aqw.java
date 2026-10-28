package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class aqw {
    aqy a;
    final /* synthetic */ aqx b;

    public aqw(aqx aqxVar) {
        this.b = aqxVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + ' ';
            }
        }
        return str + "] " + String.valueOf(this.a);
    }
}
