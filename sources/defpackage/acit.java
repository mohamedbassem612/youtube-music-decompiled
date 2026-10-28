package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acit implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(14);
    public final Map a;

    public acit(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        int i = parcel.readInt();
        this.a = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String string = parcel.readString();
            if (string != null) {
                this.a.put(string, parcel.readParcelable(classLoader));
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), 0);
        }
    }

    public acit(Map map) {
        this.a = map;
    }
}
