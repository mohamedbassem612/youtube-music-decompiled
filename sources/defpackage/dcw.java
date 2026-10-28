package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dcw implements dbn {
    private final bwb a = new bwb();
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public dcw(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = true == "Serif".equals(bwp.M(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = bwp.a((((bArr[10] & 255) << 8) | (bArr[11] & 255)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, i5 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // defpackage.dbn
    public final int a() {
        return 2;
    }

    @Override // defpackage.dbn
    public final /* synthetic */ dbd b(byte[] bArr, int i, int i2) {
        return dco.a(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        String strD;
        int i3;
        int i4;
        SpannableStringBuilder spannableStringBuilder;
        int i5;
        bwb bwbVar = this.a;
        bwbVar.N(bArr, i + i2);
        bwbVar.P(i);
        int i6 = 1;
        int i7 = 0;
        int i8 = 2;
        ahno.F(bwbVar.d() >= 2);
        int iS = bwbVar.s();
        if (iS == 0) {
            strD = "";
        } else {
            int i9 = bwbVar.c;
            Charset charsetE = bwbVar.E();
            int i10 = bwbVar.c - i9;
            if (charsetE == null) {
                charsetE = StandardCharsets.UTF_8;
            }
            strD = bwbVar.D(iS - i10, charsetE);
        }
        if (strD.isEmpty()) {
            bvhVar.a(new abnx(agpi.a, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strD);
        int i11 = this.c;
        f(spannableStringBuilder2, i11, 0, 0, spannableStringBuilder2.length(), 16711680);
        int i12 = i11;
        int i13 = this.d;
        e(spannableStringBuilder2, i13, -1, 0, spannableStringBuilder2.length(), 16711680);
        String str = this.e;
        int length = spannableStringBuilder2.length();
        if (str != "sans-serif") {
            spannableStringBuilder2.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fA = this.f;
        while (bwbVar.d() >= 8) {
            int i14 = bwbVar.c;
            int i15 = bwbVar.i();
            int i16 = bwbVar.i();
            if (i16 == 1937013100) {
                ahno.F(bwbVar.d() >= i8 ? i6 : i7);
                int iS2 = bwbVar.s();
                int i17 = i7;
                while (i17 < iS2) {
                    ahno.F(bwbVar.d() >= 12 ? i6 : i7);
                    int iS3 = bwbVar.s();
                    int iS4 = bwbVar.s();
                    bwbVar.Q(i8);
                    int i18 = iS2;
                    int iN = bwbVar.n();
                    bwbVar.Q(i6);
                    int i19 = bwbVar.i();
                    if (iS4 > spannableStringBuilder2.length()) {
                        spannableStringBuilder = spannableStringBuilder2;
                        bvx.e("Tx3gParser", "Truncating styl end (" + iS4 + ") to cueText.length() (" + spannableStringBuilder2.length() + ").");
                        iS4 = spannableStringBuilder.length();
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (iS3 >= iS4) {
                        bvx.e("Tx3gParser", a.cj(iS4, iS3, "Ignoring styl with start (", ") >= end (", ")."));
                        i5 = i12;
                        spannableStringBuilder2 = spannableStringBuilder;
                    } else {
                        spannableStringBuilder2 = spannableStringBuilder;
                        int i20 = i12;
                        f(spannableStringBuilder2, iN, i20, iS3, iS4, 0);
                        i5 = i20;
                        e(spannableStringBuilder2, i19, i13, iS3, iS4, 0);
                    }
                    i17++;
                    iS2 = i18;
                    i12 = i5;
                    i6 = 1;
                    i7 = 0;
                    i8 = 2;
                }
                i3 = i12;
                i4 = i8;
            } else {
                i3 = i12;
                if (i16 == 1952608120 && this.b) {
                    i4 = 2;
                    ahno.F(bwbVar.d() >= 2);
                    fA = bwp.a(bwbVar.s() / this.g, 0.0f, 0.95f);
                } else {
                    i4 = 2;
                }
            }
            bwbVar.P(i14 + i15);
            i12 = i3;
            i8 = i4;
            i6 = 1;
            i7 = 0;
        }
        bur burVar = new bur();
        burVar.d(spannableStringBuilder2);
        burVar.c(fA, 0);
        burVar.d = 0;
        bvhVar.a(new abnx(agke.q(burVar.a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.dbn
    public final /* synthetic */ void d() {
    }
}
