package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cnb implements bye {
    private final bye a;
    private final int b;
    private final byte[] c;
    private int d;
    private final coc e;

    public cnb(bye byeVar, int i, coc cocVar) {
        ahno.F(i > 0);
        this.a = byeVar;
        this.b = i;
        this.e = cocVar;
        this.c = new byte[1];
        this.d = i;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            bye byeVar = this.a;
            byte[] bArr2 = this.c;
            int i4 = 0;
            if (byeVar.a(bArr2, 0, 1) == -1) {
                return -1;
            }
            int i5 = (bArr2[0] & 255) << 4;
            if (i5 != 0) {
                byte[] bArr3 = new byte[i5];
                int i6 = i5;
                while (i6 > 0) {
                    int iA = byeVar.a(bArr3, i4, i6);
                    if (iA == -1) {
                        return -1;
                    }
                    i4 += iA;
                    i6 -= iA;
                }
                while (i5 > 0) {
                    int i7 = i5 - 1;
                    if (bArr3[i7] != 0) {
                        coc cocVar = this.e;
                        bwb bwbVar = new bwb(bArr3, i5);
                        long jMax = !cocVar.f ? cocVar.c : Math.max(cocVar.g.k(true), cocVar.c);
                        int iD = bwbVar.d();
                        cwj cwjVar = cocVar.e;
                        cwjVar.getClass();
                        cwjVar.c(bwbVar, iD);
                        cwjVar.e(jMax, 1, iD, 0, null);
                        cocVar.f = true;
                        break;
                    }
                    i5 = i7;
                }
            }
            i3 = this.b;
            this.d = i3;
        }
        int iA2 = this.a.a(bArr, i, Math.min(i3, i2));
        if (iA2 != -1) {
            this.d -= iA2;
        }
        return iA2;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.bye
    public final Map d() {
        return this.a.d();
    }

    @Override // defpackage.bye
    public final void e(bzg bzgVar) {
        bzgVar.getClass();
        this.a.e(bzgVar);
    }

    @Override // defpackage.bye
    public final void f() {
        throw new UnsupportedOperationException();
    }
}
