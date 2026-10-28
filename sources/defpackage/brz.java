package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class brz implements Parcelable {
    public static final Parcelable.Creator CREATOR = new vj(5);
    public final UUID a;
    public final String b;
    public final String c;
    public final byte[] d;
    private int e;

    public brz(Parcel parcel) {
        this.a = new UUID(parcel.readLong(), parcel.readLong());
        this.b = parcel.readString();
        String string = parcel.readString();
        int i = bwp.a;
        this.c = string;
        this.d = parcel.createByteArray();
    }

    public final boolean a(brz brzVar) {
        return b() && !brzVar.b() && c(brzVar.a);
    }

    public final boolean b() {
        return this.d != null;
    }

    public final boolean c(UUID uuid) {
        UUID uuid2 = brt.a;
        UUID uuid3 = this.a;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof brz)) {
            return false;
        }
        if (obj != this) {
            brz brzVar = (brz) obj;
            if (!Objects.equals(this.b, brzVar.b) || !Objects.equals(this.c, brzVar.c) || !Objects.equals(this.a, brzVar.a) || !Arrays.equals(this.d, brzVar.d)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
        this.e = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.a;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public brz(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.a = uuid;
        this.b = str;
        str2.getClass();
        this.c = bsy.g(str2);
        this.d = bArr;
    }
}
