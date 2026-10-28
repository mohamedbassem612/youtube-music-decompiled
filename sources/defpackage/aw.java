package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ax(1);
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;

    public aw(av avVar) {
        int size = avVar.e.size();
        this.a = new int[size * 6];
        if (!avVar.k) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dm dmVar = (dm) avVar.e.get(i2);
            int i3 = i + 1;
            this.a[i] = dmVar.a;
            ArrayList arrayList = this.b;
            cc ccVar = dmVar.b;
            arrayList.add(ccVar != null ? ccVar.mWho : null);
            int[] iArr = this.a;
            iArr[i3] = dmVar.c ? 1 : 0;
            iArr[i + 2] = dmVar.d;
            iArr[i + 3] = dmVar.e;
            int i4 = i + 5;
            iArr[i + 4] = dmVar.f;
            i += 6;
            iArr[i4] = dmVar.g;
            this.c[i2] = dmVar.h.ordinal();
            this.d[i2] = dmVar.i.ordinal();
        }
        this.e = avVar.j;
        this.f = avVar.m;
        this.g = avVar.c;
        this.h = avVar.n;
        this.i = avVar.o;
        this.j = avVar.p;
        this.k = avVar.q;
        this.l = avVar.r;
        this.m = avVar.s;
        this.n = avVar.t;
    }

    public final void a(av avVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i >= iArr.length) {
                avVar.j = this.e;
                avVar.m = this.f;
                avVar.k = true;
                avVar.n = this.h;
                avVar.o = this.i;
                avVar.p = this.j;
                avVar.q = this.k;
                avVar.r = this.l;
                avVar.s = this.m;
                avVar.t = this.n;
                return;
            }
            dm dmVar = new dm();
            int i3 = i + 1;
            dmVar.a = iArr[i];
            if (dd.aa(2)) {
                Objects.toString(avVar);
                int i4 = iArr[i3];
            }
            dmVar.h = bob.values()[this.c[i2]];
            dmVar.i = bob.values()[this.d[i2]];
            int i5 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            dmVar.c = z;
            int i6 = iArr[i5];
            dmVar.d = i6;
            int i7 = iArr[i + 3];
            dmVar.e = i7;
            int i8 = i + 5;
            int i9 = iArr[i + 4];
            dmVar.f = i9;
            i += 6;
            int i10 = iArr[i8];
            dmVar.g = i10;
            avVar.f = i6;
            avVar.g = i7;
            avVar.h = i9;
            avVar.i = i10;
            avVar.n(dmVar);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public aw(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
