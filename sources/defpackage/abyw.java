package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abyw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(8);
    public final wjm[] a;
    public final wjd[] b;
    public final String c;

    public abyw(Parcel parcel) {
        wjm[] wjmVarArr = (wjm[]) parcel.createTypedArray(wjm.CREATOR);
        wjd[] wjdVarArr = (wjd[]) parcel.createTypedArray(wjd.CREATOR);
        this.a = wjmVarArr == null ? new wjm[0] : wjmVarArr;
        this.b = wjdVarArr == null ? new wjd[0] : wjdVarArr;
        this.c = typ.c(parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeTypedArray(this.b, i);
        parcel.writeString(this.c);
    }

    public abyw(PriorityQueue priorityQueue, PriorityQueue priorityQueue2, String str) {
        this.a = (wjm[]) priorityQueue.toArray(new wjm[priorityQueue.size()]);
        this.b = (wjd[]) priorityQueue2.toArray(new wjd[priorityQueue2.size()]);
        this.c = str;
    }
}
