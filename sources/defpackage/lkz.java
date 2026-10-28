package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lkz extends kry implements Comparable {
    public static final Parcelable.Creator CREATOR = new kvu(4);
    public final int a;
    public final llg[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public lkz(int i, llg[] llgVarArr, String[] strArr) {
        this.a = i;
        this.b = llgVarArr;
        for (llg llgVar : llgVarArr) {
            this.d.put(llgVar.a, llgVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((lkz) obj).a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lkz)) {
            return false;
        }
        lkz lkzVar = (lkz) obj;
        return this.a == lkzVar.a && a.ae(this.d, lkzVar.d) && Arrays.equals(this.c, lkzVar.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((llg) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.E(parcel, 3, this.b, i);
        ksy.C(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }
}
