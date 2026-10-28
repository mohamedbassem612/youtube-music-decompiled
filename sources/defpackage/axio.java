package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axio {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public axio f;
    public axio g;

    public axio() {
        this.a = new byte[SemanticState.Multiline];
        this.e = true;
        this.d = false;
    }

    public final axio a() {
        axio axioVar = this.f;
        axio axioVar2 = axioVar != this ? axioVar : null;
        axio axioVar3 = this.g;
        axioVar3.getClass();
        axioVar3.f = axioVar;
        axio axioVar4 = this.f;
        axioVar4.getClass();
        axioVar4.g = axioVar3;
        this.f = null;
        this.g = null;
        return axioVar2;
    }

    public final axio b() {
        this.d = true;
        return new axio(this.a, this.b, this.c, true);
    }

    public final void c(axio axioVar, int i) {
        if (!axioVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = axioVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (axioVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = axioVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = axioVar.a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            i2 = axioVar.c - axioVar.b;
            axioVar.c = i2;
            axioVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = axioVar.a;
        int i5 = this.b;
        System.arraycopy(bArr2, i5, bArr3, i2, (i5 + i) - i5);
        axioVar.c += i;
        this.b += i;
    }

    public final void d(axio axioVar) {
        axioVar.g = this;
        axioVar.f = this.f;
        axio axioVar2 = this.f;
        axioVar2.getClass();
        axioVar2.g = axioVar;
        this.f = axioVar;
    }

    public axio(byte[] bArr, int i, int i2, boolean z) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
