package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bwu implements bsw {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[PHI: r8
      0x003b: PHI (r8v13 int) = (r8v0 int), (r8v16 int) binds: [B:16:0x0031, B:20:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public bwu(String str, byte[] bArr, int i, int i2) {
        byte b;
        boolean z = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    if (i2 != 23) {
                        z = false;
                    } else if (bArr.length == 4) {
                        i2 = 23;
                    } else {
                        i2 = 23;
                        z = false;
                    }
                    ahno.F(z);
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    if (i2 != 75) {
                        z = false;
                    } else if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                        i2 = 75;
                    } else {
                        i2 = 75;
                        z = false;
                    }
                    ahno.F(z);
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    if (i2 != 78) {
                        z = false;
                    } else if (bArr.length == 8) {
                        i2 = 78;
                    } else {
                        i2 = 78;
                        z = false;
                    }
                    ahno.F(z);
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    if (i2 != 78) {
                        z = false;
                    } else if (bArr.length == 8) {
                        i2 = 78;
                    } else {
                        i2 = 78;
                        z = false;
                    }
                    ahno.F(z);
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    ahno.F(i2 == 0);
                }
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final List d() {
        ahno.P(this.a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2] & 255));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bwu bwuVar = (bwu) obj;
            if (this.a.equals(bwuVar.a) && Arrays.equals(this.b, bwuVar.b) && this.c == bwuVar.c && this.d == bwuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    public final String toString() {
        String string;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                string = bwp.L(this.b);
            } else if (i == 23) {
                string = String.valueOf(Float.intBitsToFloat(ahng.M(this.b)));
            } else if (i == 67) {
                string = String.valueOf(ahng.M(this.b));
            } else if (i == 75) {
                string = String.valueOf(this.b[0] & 255);
            } else if (i == 78) {
                string = String.valueOf(new bwb(this.b).x());
            } else {
                byte[] bArr = this.b;
                int i2 = bwp.a;
                string = agyg.f.f().l(bArr, bArr.length);
            }
        } else if (this.a.equals("auxiliary.tracks.map")) {
            List listD = d();
            StringBuilder sb = new StringBuilder();
            sb.append("track types = ");
            ager.d(',').i(sb, listD);
            string = sb.toString();
        } else {
            byte[] bArr2 = this.b;
            int i3 = bwp.a;
            string = agyg.f.f().l(bArr2, bArr2.length);
        }
        return "mdta: key=" + this.a + ", value=" + string;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
