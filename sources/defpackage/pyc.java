package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class pyc implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public pyc(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object sgoVar;
        ajwo ajwoVar;
        ambn ambnVar;
        amud amudVar;
        switch (this.$cid) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return pyd.a;
            case 1:
                parcel.getClass();
                parcel.readInt();
                return pyb.a;
            case 2:
                aai aaiVarA = qcg.a();
                aaiVarA.c = parcel.createByteArray();
                aaiVarA.b(a.aV(parcel.readInt()));
                aaiVarA.b = parcel.readString();
                return aaiVarA.a();
            case 3:
                return new qon(parcel);
            case 4:
                return new qtt(parcel);
            case 5:
                return new qtu(parcel);
            case 6:
                return new qty(parcel);
            case 7:
                String string = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                byte b = parcel.readByte();
                parcel.readParcelable(wiu.class.getClassLoader());
                sgoVar = new sgo(string, bArrCreateByteArray, string2, string3, b != 0, parcel.readString(), parcel.readLong(), (wjf) parcel.readParcelable(wjf.class.getClassLoader()));
                break;
            case 8:
                String string4 = parcel.readString();
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                byte b2 = parcel.readByte();
                wiu wiuVar = (wiu) parcel.readParcelable(wiu.class.getClassLoader());
                String string7 = parcel.readString();
                parcel.readLong();
                try {
                    sgoVar = new sgt(string4, bArrCreateByteArray2, string5, string6, b2 != 0, wiuVar, string7, (aiwa) tym.t(parcel, aiwa.a), (smc) parcel.readParcelable(smc.class.getClassLoader()), parcel.readInt());
                } catch (IllegalArgumentException unused) {
                    ((agrc) ((agrc) sgt.a.b()).k("com/google/android/libraries/youtube/ads/model/AdVideoEnd$1", "createFromParcel", 261, "AdVideoEnd.java")).t("Failed to read adVideoEndRenderer proto from parcel.");
                    return null;
                }
                break;
            case 9:
                try {
                    sgoVar = new ski(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, (wiu) parcel.readParcelable(wiu.class.getClassLoader()), parcel.readString(), parcel.readLong(), (alam) tym.t(parcel, alam.a));
                } catch (IllegalArgumentException unused2) {
                    ((agrc) ((agrc) ski.a.b()).k("com/google/android/libraries/youtube/ads/model/ForecastingAd$1", "createFromParcel", 133, "ForecastingAd.java")).t("Failed to read forecastingAdRenderer proto from parcel.");
                    return null;
                }
                break;
            case 10:
                wgj wgjVar = (wgj) parcel.readParcelable(wgj.class.getClassLoader());
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                sgoVar = new skl(wgjVar, i, i2 == 1, string8, string9, string10, bArr);
                break;
            case 11:
                return new skm((smc) parcel.readParcelable(smc.class.getClassLoader()));
            case 12:
                String string11 = parcel.readString();
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                byte b3 = parcel.readByte();
                parcel.readParcelable(wiu.class.getClassLoader());
                try {
                    sgoVar = new skz(string11, bArrCreateByteArray3, string12, string13, b3 != 0, parcel.readString(), parcel.readLong(), (arcg) tym.t(parcel, arcg.a), (wjf) parcel.readParcelable(wjf.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 1, 0);
                } catch (IllegalArgumentException unused3) {
                    ((agrc) ((agrc) skz.a.b()).k("com/google/android/libraries/youtube/ads/model/LocalVideoAd$1", "createFromParcel", 618, "LocalVideoAd.java")).t("Failed to read videoAdRenderer proto from parcel.");
                    return null;
                }
                break;
            case 13:
                String string14 = parcel.readString();
                byte[] bArrCreateByteArray4 = parcel.createByteArray();
                parcel.readString();
                parcel.readString();
                parcel.readByte();
                parcel.readParcelable(wiu.class.getClassLoader());
                String string15 = parcel.readString();
                long j = parcel.readLong();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                wgm wgmVar = wgm.ADSENSE;
                wgm wgmVar2 = (wgm) Enum.valueOf(wgm.class, string18);
                Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                wjf wjfVar = (wjf) parcel.readParcelable(wjf.class.getClassLoader());
                try {
                    ajwoVar = (ajwo) tym.t(parcel, ajwo.a);
                } catch (IllegalArgumentException unused4) {
                    ((agrc) ((agrc) smk.a.b()).k("com/google/android/libraries/youtube/ads/model/RemoteVideoAd$1", "createFromParcel", 218, "RemoteVideoAd.java")).t("Failed to read closeCommand from parcel.");
                    ajwoVar = null;
                }
                try {
                    ambnVar = (ambn) tym.t(parcel, ambn.a);
                } catch (IllegalArgumentException unused5) {
                    ((agrc) ((agrc) smk.a.b()).k("com/google/android/libraries/youtube/ads/model/RemoteVideoAd$1", "createFromParcel", 226, "RemoteVideoAd.java")).t("Failed to read instreamAdPlayerOverlayRenderer from parcel.");
                    ambnVar = null;
                }
                try {
                    amudVar = (amud) tym.t(parcel, amud.b);
                } catch (IllegalArgumentException unused6) {
                    ((agrc) ((agrc) smk.a.b()).k("com/google/android/libraries/youtube/ads/model/RemoteVideoAd$1", "createFromParcel", 233, "RemoteVideoAd.java")).t("Failed to read loggingDirectives from parcel.");
                    amudVar = null;
                }
                sgoVar = new smk(i3 != 0, i4, j, string15, string16, string14, string17, bArrCreateByteArray4, wgmVar2, uri, wjfVar, ajwoVar, ambnVar, amudVar);
                break;
            case 14:
                String string19 = parcel.readString();
                byte[] bArrCreateByteArray5 = parcel.createByteArray();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                byte b4 = parcel.readByte();
                wiu wiuVar2 = (wiu) parcel.readParcelable(wiu.class.getClassLoader());
                String string22 = parcel.readString();
                parcel.readLong();
                try {
                    sgoVar = new sna(string19, bArrCreateByteArray5, string20, string21, b4 != 0, wiuVar2, string22, (aqfv) tym.t(parcel, aqfv.a), parcel.readInt());
                } catch (IllegalArgumentException unused7) {
                    ((agrc) ((agrc) sna.a.b()).k("com/google/android/libraries/youtube/ads/model/SurveyAd$1", "createFromParcel", 313, "SurveyAd.java")).t("Failed to read surveyAdRenderer proto from parcel.");
                    return null;
                }
                break;
            case 15:
                String string23 = parcel.readString();
                byte[] bArrCreateByteArray6 = parcel.createByteArray();
                String string24 = parcel.readString();
                String string25 = parcel.readString();
                byte b5 = parcel.readByte();
                wiu wiuVar3 = (wiu) parcel.readParcelable(wiu.class.getClassLoader());
                String string26 = parcel.readString();
                parcel.readLong();
                try {
                    sgoVar = new snc(string23, bArrCreateByteArray6, string24, string25, b5 != 0, wiuVar3, string26, (aqhi) tym.t(parcel, aqhi.a));
                } catch (IllegalArgumentException unused8) {
                    ((agrc) ((agrc) snc.a.b()).k("com/google/android/libraries/youtube/ads/model/SurveyInterstitialAd$1", "createFromParcel", 141, "SurveyInterstitialAd.java")).t("Failed to read surveyTextInterstitialRenderer proto from parcel.");
                    return null;
                }
                break;
            case 16:
                return new snd((aqfu) tym.t(parcel, aqfu.a), parcel.readInt());
            case 17:
                sgoVar = new snf(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, (wiu) parcel.readParcelable(wiu.class.getClassLoader()), parcel.readString(), parcel.readLong());
                break;
            case 18:
                try {
                    return new sno((aivn) tym.t(parcel, aivn.a));
                } catch (IllegalArgumentException unused9) {
                    return null;
                }
            case 19:
                return new ugp((Uri) parcel.readParcelable(ugr.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readFloat(), parcel.readInt());
            default:
                ujh ujhVarA = uji.a();
                ujhVarA.f(parcel.readLong());
                ujhVarA.j((Uri) parcel.readParcelable(Uri.class.getClassLoader()));
                ujhVarA.b(parcel.readString());
                ujhVarA.a = parcel.readString();
                ujhVarA.i(parcel.readLong());
                ujhVarA.c(parcel.readLong());
                ujhVarA.g(parcel.readLong());
                ujhVarA.d(parcel.readInt());
                ujhVarA.k(parcel.readInt());
                ujhVarA.e(parcel.readInt());
                ujhVarA.h(parcel.readInt());
                if (parcel.readByte() == 1) {
                    try {
                        ujhVarA.b = (aljj) ahng.ay(parcel, aljj.a, ExtensionRegistryLite.getGeneratedRegistry());
                        break;
                    } catch (aiik | NullPointerException unused10) {
                    }
                }
                return ujhVarA.a();
        }
        return sgoVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new pyd[i];
            case 1:
                return new pyb[i];
            case 2:
                return new qcg[i];
            case 3:
                return new qon[i];
            case 4:
                return new qtt[i];
            case 5:
                return new qtu[i];
            case 6:
                return new qty[i];
            case 7:
                return new sgo[0];
            case 8:
                return new sgt[0];
            case 9:
                return new ski[0];
            case 10:
                return new skl[i];
            case 11:
                return new skm[i];
            case 12:
                return new skz[0];
            case 13:
                return new smk[i];
            case 14:
                return new sna[0];
            case 15:
                return new snc[0];
            case 16:
                return new snd[i];
            case 17:
                return new snf[0];
            case 18:
                return new sno[i];
            case 19:
                return new ugp[i];
            default:
                return new uji[i];
        }
    }
}
