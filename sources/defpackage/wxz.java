package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxz extends wyb {
    public static final Parcelable.Creator CREATOR = new uwz(18);

    public wxz(Parcel parcel) {
        super((amnw) ((acli) parcel.readParcelable(acli.class.getClassLoader())).a(amnw.a));
    }

    @Override // defpackage.wyb
    public final String a() {
        return ((amnw) this.a).b;
    }

    @Override // defpackage.wyb
    public final boolean b() {
        return ((amnw) this.a).c.size() > 0;
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

    public wxz(amnw amnwVar) {
        super(amnwVar);
    }
}
