package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fiq {
    public fir a;
    public fhd b;
    public final int c;
    public final String d;

    public fiq(String str, int i, String str2) {
        this.c = i;
        this.d = str + i + str2;
    }

    public final void a(Object obj) {
        fir firVar = this.a;
        if (firVar != null) {
            firVar.at(this, obj);
        }
    }
}
