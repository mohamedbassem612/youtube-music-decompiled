package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(2);
    public final String a;
    public String b;
    public final amp c;
    private final int d;
    private final String e;
    private boolean f;
    private final List g = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    public uxp(String str, String str2, boolean z, boolean z2) {
        typ.f(str);
        this.a = str;
        if (z2) {
            Map map = uxq.a;
            if (map.get(str) != null) {
                this.d = ((Integer) map.get(str)).intValue();
                this.e = "";
            } else {
                typ.f(str2);
                this.e = str2;
                this.d = -1;
            }
        } else {
            typ.f(str2);
            this.e = str2;
            this.d = -1;
        }
        this.f = z;
        this.b = str.toLowerCase(Locale.ENGLISH);
        this.c = new amp(0);
    }

    public static uxp a(List list, String str) {
        if (list == null || str == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uxp uxpVar = (uxp) it.next();
            if (e(uxpVar.a, str)) {
                return uxpVar;
            }
        }
        return null;
    }

    public static boolean c(String str) {
        return str == null || e(str, "NORMAL");
    }

    public static boolean e(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
        } else if (str2 != null && ahno.ag(str, str2)) {
            return true;
        }
        return false;
    }

    public final void b() {
        int i;
        ArrayList arrayList;
        List list = this.g;
        synchronized (list) {
            this.f = false;
            arrayList = new ArrayList(list);
            list.clear();
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((uxo) arrayList.get(i)).a();
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.g) {
            z = this.f;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.d);
        parcel.writeString(this.b);
        parcel.writeString(this.e);
        parcel.writeInt(d() ? 1 : 0);
        parcel.writeInt(this.c.a);
    }

    public uxp(Parcel parcel) {
        this.a = ahno.Z(parcel.readString());
        this.d = parcel.readInt();
        this.b = ahno.Z(parcel.readString());
        this.e = ahno.Z(parcel.readString());
        this.f = parcel.readInt() == 1;
        this.c = new amp(parcel.readInt());
    }
}
