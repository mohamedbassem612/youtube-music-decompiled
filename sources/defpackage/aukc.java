package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aukc implements Parcelable {
    public byte[] a;

    protected aukc(Parcel parcel) {
        this.a = null;
        this.a = parcel.createByteArray();
    }

    public final void a(MessageLite messageLite) {
        if (messageLite == null || messageLite.getSerializedSize() == 0) {
            this.a = null;
        } else {
            this.a = messageLite.toByteArray();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof aukc) && Arrays.equals(((aukc) obj).a, this.a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        byte[] bArr = this.a;
        return a.bP(bArr == null ? 0 : bArr.length, "ParcelableProtoLite[", " bytes]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
    }

    public aukc() {
        this.a = null;
    }
}
