package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ski extends smc {
    public final alam b;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/model/ForecastingAd");
    public static final Parcelable.Creator CREATOR = new pyc(9);

    /* JADX WARN: Illegal instructions before constructor call */
    public ski(String str, byte[] bArr, String str2, String str3, boolean z, wiu wiuVar, String str4, long j, alam alamVar) {
        long j2 = z ? j + g : Long.MAX_VALUE;
        aihf aihfVarCreateBuilder = aivn.a.createBuilder();
        aiie aiieVar = alamVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        aivn aivnVar = (aivn) aihfVarCreateBuilder.instance;
        aiie aiieVar2 = aivnVar.b;
        if (!aiieVar2.c()) {
            aivnVar.b = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(aiieVar, aivnVar.b);
        super(str, bArr, str2, str3, z, wiuVar, str4, j2, new sno((aivn) aihfVarCreateBuilder.build()));
        alamVar.getClass();
        this.b = alamVar;
    }

    @Override // defpackage.smc
    public final int a() {
        return 0;
    }

    @Override // defpackage.smc
    public final boolean equals(Object obj) {
        if (!(obj instanceof ski)) {
            return false;
        }
        ski skiVar = (ski) obj;
        return super.equals(skiVar) && Objects.equals(this.b, skiVar.b);
    }

    @Override // defpackage.smc
    public final String j() {
        return "forecastingAd";
    }

    @Override // defpackage.smc, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        tym.u(this.b, parcel);
    }

    public ski(skl sklVar, wiu wiuVar, String str, long j, alam alamVar) {
        this(sklVar.e, sklVar.h, sklVar.g, sklVar.f, sklVar.d, wiuVar, str, j, alamVar);
    }
}
