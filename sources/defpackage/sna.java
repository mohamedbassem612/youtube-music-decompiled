package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sna extends slc {
    private final aqfv b;
    private final agke c;
    private final int d;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/model/SurveyAd");
    public static final Parcelable.Creator CREATOR = new pyc(14);

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Illegal instructions before constructor call */
    public sna(String str, byte[] bArr, String str2, String str3, boolean z, wiu wiuVar, String str4, aqfv aqfvVar, int i) {
        aivn aivnVar;
        if (aqfvVar.c.size() > 0) {
            aqfx aqfxVar = (aqfx) aqfvVar.c.get(0);
            if ((aqfxVar.b & 1) != 0) {
                aqfu aqfuVar = aqfxVar.c;
                aqfw aqfwVar = (aqfuVar == null ? aqfu.a : aqfuVar).f;
                aivnVar = (aqfwVar == null ? aqfw.a : aqfwVar).d;
                if (aivnVar == null) {
                    aivnVar = aivn.a;
                }
            } else {
                aivnVar = aivn.a;
            }
        } else {
            aivnVar = aivn.a;
        }
        super(str, bArr, str2, str3, z, wiuVar, str4, new sno(aivnVar));
        aqfvVar.getClass();
        this.b = aqfvVar;
        apji apjiVar = aqfvVar.d;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < aqfvVar.c.size(); i2++) {
            aqfx aqfxVar2 = (aqfx) aqfvVar.c.get(i2);
            if ((aqfxVar2.b & 1) != 0) {
                aqfu aqfuVar2 = aqfxVar2.c;
                arrayList.add(new snd(aqfuVar2 == null ? aqfu.a : aqfuVar2, i2));
            }
        }
        this.c = agke.n(arrayList);
        this.d = i;
    }

    @Override // defpackage.smc
    public final int a() {
        if (this.c.isEmpty()) {
            return 0;
        }
        aqfu aqfuVar = n().a;
        aqfw aqfwVar = aqfuVar.f;
        if (aqfwVar == null) {
            aqfwVar = aqfw.a;
        }
        if (aqfwVar.b <= 0) {
            return 15;
        }
        aqfw aqfwVar2 = aqfuVar.f;
        if (aqfwVar2 == null) {
            aqfwVar2 = aqfw.a;
        }
        return aqfwVar2.b;
    }

    @Override // defpackage.smc
    public final boolean equals(Object obj) {
        if (!(obj instanceof sna)) {
            return false;
        }
        sna snaVar = (sna) obj;
        return super.equals(snaVar) && Objects.equals(this.b, snaVar.b);
    }

    @Override // defpackage.smc
    public final int iI() {
        return this.d;
    }

    @Override // defpackage.smc
    public final aiua iL() {
        aqfv aqfvVar = this.b;
        if ((aqfvVar.b & 32) == 0) {
            return null;
        }
        aiua aiuaVar = aqfvVar.f;
        return aiuaVar == null ? aiua.a : aiuaVar;
    }

    @Override // defpackage.smc
    public final String j() {
        return "surveyAd";
    }

    @Override // defpackage.smc
    public final int m() {
        int i;
        aqfu aqfuVar = n().a;
        aqfw aqfwVar = aqfuVar.f;
        if (aqfwVar == null) {
            aqfwVar = aqfw.a;
        }
        if (aqfwVar.c <= 0) {
            i = 0;
        } else {
            aqfw aqfwVar2 = aqfuVar.f;
            if (aqfwVar2 == null) {
                aqfwVar2 = aqfw.a;
            }
            i = aqfwVar2.c;
        }
        return i * 1000;
    }

    public final snd n() {
        agke agkeVar = this.c;
        if (agkeVar.size() > 0) {
            return (snd) agkeVar.get(0);
        }
        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/ads/model/SurveyAd", "getQuestion", 172, "SurveyAd.java")).t("Trying to retrieve question that is out of range.");
        return null;
    }

    @Override // defpackage.smc
    public final aivo p() {
        aivo aivoVar = this.b.e;
        return aivoVar == null ? aivo.a : aivoVar;
    }

    @Override // defpackage.smc, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        tym.u(this.b, parcel);
        parcel.writeInt(this.d);
    }
}
