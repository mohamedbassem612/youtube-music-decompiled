package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aapl implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public aapl(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.$cid) {
            case 0:
                return new aapm(parcel);
            case 1:
                return new xhl(parcel);
            case 2:
                return new abht(parcel.readLong(), parcel.readLong());
            case 3:
                return new abnd(parcel);
            case 4:
                return new abtx(parcel);
            case 5:
                return new abyk(parcel);
            case 6:
                return new abyn(parcel);
            case 7:
                return new abyt(parcel);
            case 8:
                return new abyw(parcel);
            case 9:
                return new abza(parcel);
            case 10:
                return new abzg(parcel);
            case 11:
                return new abzm(parcel);
            case 12:
                acbz acbzVarA = acca.a();
                String string = parcel.readString();
                if (string != null) {
                    acbzVarA.i(string);
                }
                String string2 = parcel.readString();
                if (string2 != null) {
                    acbzVarA.j(string2);
                }
                String string3 = parcel.readString();
                if (string3 != null) {
                    acbzVarA.l(string3);
                }
                String string4 = parcel.readString();
                if (string4 != null) {
                    acbzVarA.n(string4);
                }
                String string5 = parcel.readString();
                if (string5 != null) {
                    acbzVarA.e(string5);
                }
                acbzVarA.d(parcel.readInt());
                String string6 = parcel.readString();
                if (string6 != null) {
                    acbzVarA.a = string6;
                }
                String string7 = parcel.readString();
                if (string7 != null) {
                    acbzVarA.k(string7);
                }
                String string8 = parcel.readString();
                if (string8 != null) {
                    acbzVarA.b = string8;
                }
                String string9 = parcel.readString();
                if (string9 != null) {
                    acbzVarA.o(string9);
                }
                String string10 = parcel.readString();
                if (string10 != null) {
                    acbzVarA.m(string10);
                }
                double d = parcel.readDouble();
                double d2 = parcel.readDouble();
                double d3 = parcel.readDouble();
                double d4 = parcel.readDouble();
                acbj acbjVarA = acbk.a();
                acbjVarA.c(d);
                acbjVarA.d(d2);
                acbjVarA.e(d3);
                acbjVarA.b(d4);
                acbzVarA.c(acbjVarA.a());
                String string11 = parcel.readString();
                if (string11 != null) {
                    acbzVarA.c = string11;
                }
                String string12 = parcel.readString();
                if (string12 != null) {
                    acbzVarA.h(string12);
                }
                return acbzVarA.a();
            case 13:
                return new acis(parcel);
            case 14:
                return new acit(parcel);
            case 15:
                return new acli(parcel);
            case 16:
                Parcelable[] parcelableArray = parcel.readParcelableArray(acli.class.getClassLoader());
                int length = parcelableArray.length;
                ArrayList arrayList = new ArrayList(length);
                ArrayList arrayList2 = new ArrayList(length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((ajwo) ((acli) parcelable).a(ajwo.a));
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray.length == 0) {
                        arrayList2.add(Optional.empty());
                    } else {
                        arrayList2.add(Optional.of(aigj.v(bArrCreateByteArray)));
                    }
                }
                return new acmd(DesugarCollections.unmodifiableList(arrayList), DesugarCollections.unmodifiableList(arrayList2));
            case 17:
                return new acrk(parcel);
            case 18:
                return new acuh(parcel);
            case 19:
                return new aebt(parcel);
            default:
                return new aewk(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new aapm[i];
            case 1:
                return new xhl[i];
            case 2:
                return new abht[i];
            case 3:
                return new abnd[i];
            case 4:
                return new abtx[i];
            case 5:
                return new abyk[i];
            case 6:
                return new abyn[i];
            case 7:
                return new abyt[i];
            case 8:
                return new abyw[i];
            case 9:
                return new abza[i];
            case 10:
                return new abzg[i];
            case 11:
                return new abzm[i];
            case 12:
                return new acca[i];
            case 13:
                return new acis[i];
            case 14:
                return new acit[i];
            case 15:
                return new acli[i];
            case 16:
                return new acmd[i];
            case 17:
                return new acrk[i];
            case 18:
                return new acuh[i];
            case 19:
                return new aebt[i];
            default:
                return new aewk[i];
        }
    }
}
