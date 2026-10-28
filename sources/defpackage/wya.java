package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wya extends wyb {
    public static final Parcelable.Creator CREATOR = new uwz(19);

    public wya(Parcel parcel) {
        super((amqd) ((acli) parcel.readParcelable(acli.class.getClassLoader())).a(amqd.a));
    }

    @Override // defpackage.wyb
    public final String a() {
        return ((amqd) this.a).b;
    }

    @Override // defpackage.wyb
    public final boolean b() {
        return ((amqd) this.a).c.size() > 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new acli((MessageLite) this.a), 0);
    }

    public wya(amqd amqdVar) {
        super(amqdVar);
    }
}
