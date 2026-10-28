package defpackage;

import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snf extends smc {
    public static final snf a = new snf("throttled", new byte[0], "", "throttled", false, wiu.c, "", Long.MAX_VALUE);
    public static final Parcelable.Creator CREATOR = new pyc(17);

    public snf(String str, byte[] bArr, String str2, String str3, boolean z, wiu wiuVar, String str4, long j) {
        super(str, bArr, str2, str3, z, wiuVar, str4, j, new sno(aivn.a));
    }

    @Override // defpackage.smc
    public final int a() {
        return 0;
    }

    @Override // defpackage.smc
    public final boolean equals(Object obj) {
        if (obj instanceof snf) {
            return super.equals((snf) obj);
        }
        return false;
    }

    @Override // defpackage.smc
    public final String j() {
        return "throttledAd";
    }
}
