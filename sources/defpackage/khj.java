package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class khj extends gdb implements khk {
    public khj() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                gdc.b(parcel);
                j(i2);
                return true;
            case 2:
                jzt jztVar = (jzt) gdc.a(parcel, jzt.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean zF = gdc.f(parcel);
                gdc.b(parcel);
                b(jztVar, string, string2, zF);
                return true;
            case 3:
                int i3 = parcel.readInt();
                gdc.b(parcel);
                c(i3);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                gdc.f(parcel);
                gdc.b(parcel);
                o();
                return true;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                gdc.b(parcel);
                l(string3, string4);
                return true;
            case 6:
                parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                gdc.b(parcel);
                p(bArrCreateByteArray);
                return true;
            case 7:
                int i4 = parcel.readInt();
                gdc.b(parcel);
                e(i4);
                return true;
            case 8:
                int i5 = parcel.readInt();
                gdc.b(parcel);
                g(i5);
                return true;
            case 9:
                int i6 = parcel.readInt();
                gdc.b(parcel);
                d(i6);
                return true;
            case 10:
                parcel.readString();
                long j = parcel.readLong();
                int i7 = parcel.readInt();
                gdc.b(parcel);
                n(j, i7);
                return true;
            case 11:
                parcel.readString();
                long j2 = parcel.readLong();
                gdc.b(parcel);
                m(j2);
                return true;
            case 12:
                kgq kgqVar = (kgq) gdc.a(parcel, kgq.CREATOR);
                gdc.b(parcel);
                f(kgqVar);
                return true;
            case 13:
                khf khfVar = (khf) gdc.a(parcel, khf.CREATOR);
                gdc.b(parcel);
                i(khfVar);
                return true;
            case 14:
                int i8 = parcel.readInt();
                gdc.b(parcel);
                h(i8);
                return true;
            case 15:
                int i9 = parcel.readInt();
                gdc.b(parcel);
                k(i9);
                return true;
            default:
                return false;
        }
    }
}
