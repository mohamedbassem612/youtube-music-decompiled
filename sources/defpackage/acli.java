package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acli implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(15);
    private MessageLite a;
    private byte[] b;

    public acli(Parcel parcel) {
        this.b = parcel.createByteArray();
    }

    public final MessageLite a(MessageLite messageLite) {
        if (this.a == null && this.b != null) {
            try {
                this.a = messageLite.newBuilderForType().mergeFrom(this.b, ExtensionRegistryLite.getGeneratedRegistry()).build();
                this.b = null;
            } catch (aiik e) {
                Log.e("MessageLite", "Failed to deserialize", e);
            }
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableMessageLite(");
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            sb.append(messageLite);
        } else if (this.b != null) {
            sb.append("byte[");
            sb.append(this.b.length);
            sb.append(']');
        } else {
            sb.append("null");
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessageLite messageLite;
        byte[] byteArray = this.b;
        if (byteArray == null && (messageLite = this.a) != null) {
            byteArray = messageLite.toByteArray();
            this.b = byteArray;
            this.a = null;
        }
        parcel.writeByteArray(byteArray);
    }

    public acli(MessageLite messageLite) {
        this.a = messageLite;
    }
}
