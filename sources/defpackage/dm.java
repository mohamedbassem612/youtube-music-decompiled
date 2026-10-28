package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dm {
    int a;
    cc b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    bob h;
    bob i;

    public dm(dm dmVar) {
        this.a = dmVar.a;
        this.b = dmVar.b;
        this.c = dmVar.c;
        this.d = dmVar.d;
        this.e = dmVar.e;
        this.f = dmVar.f;
        this.g = dmVar.g;
        this.h = dmVar.h;
        this.i = dmVar.i;
    }

    public dm(int i, cc ccVar) {
        this.a = i;
        this.b = ccVar;
        this.c = false;
        bob bobVar = bob.e;
        this.h = bobVar;
        this.i = bobVar;
    }

    public dm(int i, cc ccVar, byte[] bArr) {
        this.a = i;
        this.b = ccVar;
        this.c = true;
        bob bobVar = bob.e;
        this.h = bobVar;
        this.i = bobVar;
    }

    public dm() {
    }
}
