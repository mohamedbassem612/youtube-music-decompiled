package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ekr {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;

    public ekr(zs zsVar, zs zsVar2, int i) {
        this.d = zsVar;
        this.c = zsVar2;
        this.b = i;
        this.a = zsVar == zsVar2;
    }

    public ekr(int i, boolean z, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = z;
        this.c = bArr;
        this.d = bArr2;
    }

    public ekr(int i, ekg ekgVar, ekc ekcVar, boolean z) {
        this.b = i;
        this.c = ekgVar;
        this.d = ekcVar;
        this.a = z;
    }
}
