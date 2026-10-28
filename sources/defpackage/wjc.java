package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wjc implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(11);
    public final String a;
    private final Set b;

    public wjc(amuo amuoVar) {
        ahno.O(1 == (amuoVar.b & 1));
        this.a = amuoVar.c;
        aguu.al(new tar(this, 7));
        this.b = new HashSet();
        if (amuoVar.d.size() != 0) {
            for (amun amunVar : amuoVar.d) {
                Set set = this.b;
                amum amumVarA = amum.a(amunVar.c);
                if (amumVarA == null) {
                    amumVarA = amum.UNKNOWN;
                }
                set.add(amumVarA);
            }
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((wjc) obj).a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aihf aihfVarCreateBuilder = jrg.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        jrg jrgVar = (jrg) aihfVarCreateBuilder.instance;
        String str = this.a;
        str.getClass();
        jrgVar.b |= 1;
        jrgVar.c = str;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            int i2 = ((amum) it.next()).m;
            aihfVarCreateBuilder.copyOnWrite();
            jrg jrgVar2 = (jrg) aihfVarCreateBuilder.instance;
            aihv aihvVar = jrgVar2.d;
            if (!aihvVar.c()) {
                jrgVar2.d = aihn.mutableCopy(aihvVar);
            }
            jrgVar2.d.h(i2);
        }
        tym.u((jrg) aihfVarCreateBuilder.build(), parcel);
    }

    public wjc(jrg jrgVar) {
        this.a = (jrgVar.b & 1) != 0 ? jrgVar.c : "";
        aguu.al(new tar(this, 6));
        this.b = new HashSet();
        Iterator it = jrgVar.d.iterator();
        while (it.hasNext()) {
            amum amumVarA = amum.a(((Integer) it.next()).intValue());
            if (amumVarA != null) {
                this.b.add(amumVarA);
            }
        }
    }
}
