package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhl extends xho {
    public static final Parcelable.Creator CREATOR = new aapl(1);
    public final Optional a;

    public xhl(xgz xgzVar, Optional optional, amdd amddVar, Optional optional2) {
        xhn xhnVar = new xhn(xgzVar.b());
        amec amecVarA = new xhn(xgzVar.b()).a();
        amud amudVarB = xgzVar.b();
        amudVarB.getClass();
        super(xhnVar, amecVarA, agke.n(new aihx(amudVarB.g, amud.a)), xgzVar.c(), optional, amddVar);
        this.a = optional2;
    }

    @Override // defpackage.xho, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(((Integer) this.a.orElse(-1)).intValue());
    }

    public xhl(Parcel parcel) {
        super(parcel);
        if (parcel.dataAvail() > 0) {
            int i = parcel.readInt();
            if (i == -1) {
                this.a = Optional.empty();
                return;
            } else {
                this.a = Optional.of(Integer.valueOf(i));
                return;
            }
        }
        this.a = Optional.empty();
    }

    public xhl(amec amecVar, argn argnVar, Optional optional, amdd amddVar, Optional optional2) {
        super(amecVar, argnVar, xho.b, optional, amddVar);
        this.a = optional2;
    }
}
