package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import defpackage.afhl;
import defpackage.aigs;
import defpackage.aiik;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoParsers$InternalDontUse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new afhl(2);
    private volatile byte[] a;
    private volatile MessageLite b;

    public ProtoParsers$InternalDontUse(byte[] bArr, MessageLite messageLite) {
        if (bArr == null && messageLite == null) {
            throw new IllegalArgumentException("Must have a message or bytes");
        }
        this.a = bArr;
        this.b = messageLite;
    }

    public final MessageLite a(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        try {
            return b(messageLite, extensionRegistryLite);
        } catch (aiik e) {
            throw new IllegalStateException(e);
        }
    }

    public final MessageLite b(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        if (this.b == null) {
            this.b = messageLite.toBuilder().mergeFrom(this.a, extensionRegistryLite).build();
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            byte[] bArr = new byte[this.b.getSerializedSize()];
            try {
                this.b.writeTo(aigs.O(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
