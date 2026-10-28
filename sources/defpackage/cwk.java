package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwk {
    private static final ahbo a = new ahbo(new int[]{0, 2, 1});
    private static final ahbo b = new ahbo(new int[]{0, 2, 1, 3, 4});
    private static final ahbo c = new ahbo(new int[]{0, 2, 1, 5, 3, 4});
    private static final ahbo d = ahbo.h(2, 1, 6, 5, 3, 4);
    private static final ahbo e = ahbo.h(2, 1, 7, 5, 6, 3, 4);

    public static bsx a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = bwp.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                bvx.e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(cxv.d(new bwb(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    bvx.f("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new cyw(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new bsx(arrayList);
    }

    public static agke b(byte[] bArr) {
        bwb bwbVar = new bwb(bArr);
        bwbVar.Q(1);
        int i = 0;
        while (bwbVar.d() > 0 && bwbVar.h() == 255) {
            bwbVar.Q(1);
            i += 255;
        }
        int iN = i + bwbVar.n();
        int i2 = 0;
        while (bwbVar.d() > 0 && bwbVar.h() == 255) {
            bwbVar.Q(1);
            i2 += 255;
        }
        int iN2 = i2 + bwbVar.n();
        byte[] bArr2 = new byte[iN];
        int i3 = bwbVar.c;
        System.arraycopy(bArr, i3, bArr2, 0, iN);
        int i4 = i3 + iN + iN2;
        int length = bArr.length - i4;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i4, bArr3, 0, length);
        return agke.r(bArr2, bArr3);
    }

    public static ahbo c(int i) {
        if (i == 3) {
            return a;
        }
        if (i == 5) {
            return b;
        }
        if (i == 6) {
            return c;
        }
        if (i == 7) {
            return d;
        }
        if (i != 8) {
            return null;
        }
        return e;
    }
}
