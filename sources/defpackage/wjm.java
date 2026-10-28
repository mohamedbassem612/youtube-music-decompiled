package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wjm implements Comparable, Parcelable {
    public final String b;
    public final Set c;
    public final Set d;
    private final int e;
    public static final Set a = Collections.EMPTY_SET;
    public static final Parcelable.Creator CREATOR = new uwz(16);

    public wjm(jrl jrlVar) {
        wjl wjlVar;
        this.b = (jrlVar.b & 1) != 0 ? jrlVar.c : "";
        this.c = new HashSet();
        Iterator it = jrlVar.d.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            Set set = this.c;
            wjl[] wjlVarArrValues = wjl.values();
            int length = wjlVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    wjlVar = wjl.NO_OP;
                    break;
                }
                wjlVar = wjlVarArrValues[i];
                if (wjlVar.g == iIntValue) {
                    break;
                } else {
                    i++;
                }
            }
            set.add(wjlVar);
        }
        this.e = (jrlVar.b & 2) != 0 ? jrlVar.e : -1;
        this.d = new HashSet();
        if (jrlVar.f.size() != 0) {
            Iterator it2 = jrlVar.f.iterator();
            while (it2.hasNext()) {
                amum amumVarA = amum.a(((Integer) it2.next()).intValue());
                if (amumVarA != null) {
                    this.d.add(amumVarA);
                }
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wjm wjmVar) {
        int i = this.e;
        int i2 = wjmVar.e;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        return this.b.compareTo(wjmVar.b);
    }

    public final int b(int i) {
        int i2 = this.e;
        return i2 != -1 ? i2 : i;
    }

    public final Uri c() {
        return Uri.parse(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wjm)) {
            return false;
        }
        wjm wjmVar = (wjm) obj;
        return this == wjmVar || (wjmVar.compareTo(this) == 0 && hashCode() == wjmVar.hashCode());
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() + 31) * 31) + this.c.hashCode()) * 31) + this.e) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "@" + this.e + "baseUrl->" + this.b + "params->" + this.c + "headers->" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aihf aihfVarCreateBuilder = jrl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        jrl jrlVar = (jrl) aihfVarCreateBuilder.instance;
        String str = this.b;
        str.getClass();
        jrlVar.b |= 1;
        jrlVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        jrl jrlVar2 = (jrl) aihfVarCreateBuilder.instance;
        jrlVar2.b |= 2;
        jrlVar2.e = this.e;
        Set set = this.c;
        int[] iArr = new int[set.size()];
        Iterator it = set.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((wjl) it.next()).g;
            i3++;
        }
        List listQ = ahng.Q(iArr);
        aihfVarCreateBuilder.copyOnWrite();
        jrl jrlVar3 = (jrl) aihfVarCreateBuilder.instance;
        aihv aihvVar = jrlVar3.d;
        if (!aihvVar.c()) {
            jrlVar3.d = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(listQ, jrlVar3.d);
        Set set2 = this.d;
        int[] iArr2 = new int[set2.size()];
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            iArr2[i2] = ((amum) it2.next()).m;
            i2++;
        }
        List listQ2 = ahng.Q(iArr2);
        aihfVarCreateBuilder.copyOnWrite();
        jrl jrlVar4 = (jrl) aihfVarCreateBuilder.instance;
        aihv aihvVar2 = jrlVar4.f;
        if (!aihvVar2.c()) {
            jrlVar4.f = aihn.mutableCopy(aihvVar2);
        }
        aifs.addAll(listQ2, jrlVar4.f);
        tym.u((jrl) aihfVarCreateBuilder.build(), parcel);
    }

    public wjm(amup amupVar) {
        this(amupVar, a);
    }

    public wjm(amup amupVar, Set set) {
        this.b = amupVar.c;
        set.getClass();
        this.c = set;
        int i = amupVar.d;
        this.e = i == 0 ? -1 : i;
        this.d = new HashSet();
        for (amun amunVar : amupVar.e) {
            Set set2 = this.d;
            amum amumVarA = amum.a(amunVar.c);
            if (amumVarA == null) {
                amumVarA = amum.UNKNOWN;
            }
            set2.add(amumVarA);
        }
    }
}
