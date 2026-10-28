package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kie extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(7);
    public final List a;
    public final kjg b;

    public kie(List list, kjg kjgVar) {
        this.a = DesugarCollections.unmodifiableList(list);
        this.b = kjgVar;
    }

    public final String toString() {
        kjg kjgVar = this.b;
        return "BatchedLogEventParcelable[LogEvents: " + String.valueOf(this.a) + "]\nBatchedLogErrors: " + String.valueOf(kjgVar) + "]\n";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.F(parcel, 1, list);
        ksy.A(parcel, 2, this.b, i);
        ksy.h(parcel, iG);
    }
}
