package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class xho implements Parcelable {
    public final xhn c;
    public final agke d;
    public final amec e;
    public final argn f;
    public final Optional g;
    public final amdd h;
    public static final agke b = agpi.a;
    private static final atqd a = atqd.a;

    public xho(Parcel parcel) {
        this.c = new xhn(parcel.readLong());
        amec amecVarA = amec.a(parcel.readInt());
        this.e = amecVarA == null ? amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN : amecVarA;
        this.f = (argn) tym.t(parcel, argn.a);
        atqd atqdVar = a;
        atqd atqdVar2 = (atqd) tym.t(parcel, atqdVar);
        if (atqdVar2.equals(atqdVar)) {
            this.g = Optional.empty();
        } else {
            this.g = Optional.ofNullable(atqdVar2);
        }
        Bundle bundle = parcel.readBundle(amdd.class.getClassLoader());
        amdd amddVar = null;
        if (bundle != null && bundle.containsKey("INTERACTION_LOGGING_CLIENT_DATA_KEY")) {
            try {
                amddVar = (amdd) ahng.aA(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", amdd.a, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik e) {
                zvp.b(zvn.b, zvm.m, "Exception reading the InteractionLoggingClientData from Parcel.", e);
            }
        }
        this.h = amddVar;
        int[] iArrCreateIntArray = parcel.createIntArray();
        agjz agjzVar = new agjz(4);
        for (int i : iArrCreateIntArray) {
            agjzVar.h(amuk.a(i));
        }
        this.d = agjzVar.g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.c.a);
        parcel.writeInt(this.e.i);
        tym.u(this.f, parcel);
        tym.u((MessageLite) this.g.orElse(a), parcel);
        Bundle bundle = new Bundle();
        amdd amddVar = this.h;
        if (amddVar != null) {
            ahng.aG(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", amddVar);
        }
        parcel.writeBundle(bundle);
        agke agkeVar = this.d;
        int[] iArr = new int[agkeVar.size()];
        for (int i2 = 0; i2 < agkeVar.size(); i2++) {
            iArr[i2] = ((amuk) agkeVar.get(i2)).d;
        }
        parcel.writeIntArray(iArr);
    }

    public xho(amec amecVar, argn argnVar, agke agkeVar, Optional optional, amdd amddVar) {
        this.c = new xhn(amecVar.i);
        this.e = amecVar;
        if (argnVar != null && argnVar.d > 0 && (argnVar.b & 8) == 0) {
            aihf builder = argnVar.toBuilder();
            builder.copyOnWrite();
            argn argnVar2 = (argn) builder.instance;
            argnVar2.b |= 8;
            argnVar2.f = 0;
            argnVar = (argn) builder.build();
        }
        this.f = argnVar;
        this.d = agkeVar;
        this.g = optional;
        this.h = amddVar;
    }

    public xho(xhn xhnVar, amec amecVar, agke agkeVar, argn argnVar, Optional optional, amdd amddVar) {
        this.c = xhnVar;
        this.e = amecVar;
        this.d = agkeVar;
        this.f = argnVar;
        this.g = optional;
        this.h = amddVar;
    }
}
