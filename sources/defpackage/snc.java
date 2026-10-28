package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snc extends slc {
    private final aqhi b;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/model/SurveyInterstitialAd");
    public static final Parcelable.Creator CREATOR = new pyc(15);

    public snc(String str, byte[] bArr, String str2, String str3, boolean z, wiu wiuVar, String str4, aqhi aqhiVar) {
        super(str, bArr, str2, str3, z, wiuVar, str4, new sno(aivn.a));
        aqhiVar.getClass();
        this.b = aqhiVar;
    }

    @Override // defpackage.smc
    public final int a() {
        return this.b.b;
    }

    @Override // defpackage.smc
    public final boolean equals(Object obj) {
        if (!(obj instanceof snc)) {
            return false;
        }
        snc sncVar = (snc) obj;
        return super.equals(sncVar) && Objects.equals(this.b, sncVar.b);
    }

    @Override // defpackage.smc
    public final String j() {
        return "surveyInterstitialAd";
    }

    @Override // defpackage.smc, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        tym.u(this.b, parcel);
    }
}
