package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dco {
    public static dbd a(dbn dbnVar, byte[] bArr, int i) {
        agjz agjzVar = new agjz(4);
        dbnVar.c(bArr, 0, i, dbm.a, new cji(agjzVar, 2));
        return new dba(agjzVar.g());
    }

    public static dcu b(dcu dcuVar, String[] strArr, Map map) {
        int i = 0;
        if (dcuVar == null) {
            if (strArr == null) {
                return null;
            }
            int length = strArr.length;
            if (length == 1) {
                return (dcu) map.get(strArr[0]);
            }
            if (length <= 1) {
                return dcuVar;
            }
            dcu dcuVar2 = new dcu();
            while (i < length) {
                dcuVar2.b((dcu) map.get(strArr[i]));
                i++;
            }
            return dcuVar2;
        }
        if (strArr == null) {
            return dcuVar;
        }
        if (strArr.length == 1) {
            dcuVar.b((dcu) map.get(strArr[0]));
            return dcuVar;
        }
        int length2 = strArr.length;
        if (length2 <= 1) {
            return dcuVar;
        }
        while (i < length2) {
            dcuVar.b((dcu) map.get(strArr[i]));
            i++;
        }
        return dcuVar;
    }
}
