package defpackage;

import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zir implements byw {
    private final byw b;

    protected zir(byw bywVar) {
        this.b = bywVar;
    }

    @Override // defpackage.byw, defpackage.brv
    public int a(byte[] bArr, int i, int i2) {
        return this.b.a(bArr, i, i2);
    }

    @Override // defpackage.byw, defpackage.bye
    public long b(byi byiVar) {
        return this.b.b(byiVar);
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.b.c();
    }

    @Override // defpackage.byw, defpackage.bye
    public final Map d() {
        return this.b.d();
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        this.b.e(bzgVar);
    }

    @Override // defpackage.byw, defpackage.bye
    public void f() {
        this.b.f();
    }

    @Override // defpackage.byw
    public final int k() {
        return this.b.k();
    }

    @Override // defpackage.byw
    public void l() {
        this.b.l();
    }

    @Override // defpackage.byw
    public void m(String str, String str2) {
        this.b.m(str, str2);
    }

    public int w(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            byw bywVar = this.b;
            if (bywVar instanceof cah) {
                return ((cah) bywVar).n(byteBuffer);
            }
            if (bywVar instanceof zir) {
                return ((zir) bywVar).w(byteBuffer);
            }
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        int iA = a(bArr, 0, iRemaining);
        if (iA <= 0) {
            return iA;
        }
        byteBuffer.put(bArr, 0, iA);
        return iA;
    }
}
