package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class heh extends hej implements Parcelable {
    public static final Parcelable.Creator CREATOR = new fh(3);
    public gnn a;
    public String b;
    public gnl c;
    public wfy d;
    public int e;
    private long o;

    public heh(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        this.f = vxg.b(bArr);
        this.k = parcel.readString();
        this.b = parcel.readString();
        this.o = parcel.readLong();
        this.j = 1;
        this.c = gnl.a;
    }

    public final heh a() {
        heh hehVar = new heh();
        hehVar.f = this.f;
        hehVar.k = this.k;
        hehVar.j = this.j;
        hehVar.o = this.o;
        hehVar.c = this.c;
        return hehVar;
    }

    public final String b() {
        ajwo ajwoVar = this.f;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            if ((((ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).b & 1) != 0) {
                ajwo ajwoVar2 = this.f;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                return ((ajmf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).c;
            }
        }
        return null;
    }

    public final void c(gnl gnlVar) {
        gnlVar.getClass();
        this.c = gnlVar;
    }

    public final boolean d() {
        return this.e == 4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        gnn gnnVar = this.a;
        if (gnnVar != null) {
            return gnnVar.b || gnnVar.a || gnnVar.c;
        }
        return false;
    }

    public final String toString() {
        ageu ageuVar = new ageu("BrowseModel");
        ageuVar.b("navigationCommand", kro.aj(this.f));
        ageuVar.b("status", this.g);
        Object obj = this.h;
        if (obj != null) {
            ageuVar.e("response", System.identityHashCode(obj));
        }
        String str = this.i;
        if (str != null) {
            ageuVar.b("error", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            ageuVar.b("deeplinkUrl", str2);
        }
        return ageuVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.f.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
        parcel.writeString(this.k);
        parcel.writeString(this.b);
        parcel.writeLong(this.o);
    }

    public heh() {
        this.j = 0;
        this.k = null;
        this.o = -1L;
        this.c = gnl.a;
    }
}
