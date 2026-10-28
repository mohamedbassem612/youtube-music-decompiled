package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wgk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(7);
    public final allc a;
    public final long b;

    public wgk(allc allcVar, long j) {
        allcVar.getClass();
        this.a = allcVar;
        this.b = j;
    }

    public final agke a() {
        return (agke) Collection.EL.stream(this.a.e).filter(new uvm(14)).map(new vmw(7)).collect(aghu.a);
    }

    public final agke b(List list) {
        return (agke) Collection.EL.stream(this.a.e).filter(new uvm(13)).map(new vmw(6)).filter(new uso(list, 18)).collect(aghu.a);
    }

    public final aigj c() {
        allc allcVar = this.a;
        if ((allcVar.b & SemanticState.Focused) != 0) {
            return allcVar.h;
        }
        return null;
    }

    public final aisu d() {
        allc allcVar = this.a;
        if (allcVar.d.size() == 0) {
            return null;
        }
        for (alld alldVar : allcVar.d) {
            int i = alldVar.b;
            if (i == 84813246) {
                return i == 84813246 ? (aisu) alldVar.c : aisu.a;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Optional e(String str) {
        agke agkeVarA = a();
        int size = agkeVarA.size();
        for (int i = 0; i < size; i++) {
            aivt aivtVar = (aivt) agkeVarA.get(i);
            aivs aivsVar = aivtVar.c;
            if (aivsVar == null) {
                aivsVar = aivs.a;
            }
            aixo aixoVarA = aixo.a(aivsVar.d);
            if (aixoVarA == null) {
                aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
            }
            if (aixoVarA == aixo.SLOT_TYPE_IN_PLAYER && aivsVar.h.equals(str)) {
                return Optional.of(aivtVar);
            }
        }
        return Optional.empty();
    }

    public final Optional f() {
        allc allcVar = this.a;
        if ((allcVar.b & SemanticState.Hidden) == 0) {
            return Optional.empty();
        }
        ajwo ajwoVar = allcVar.i;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        return Optional.of(ajwoVar);
    }

    @Deprecated
    public final List g() {
        ArrayList arrayList = new ArrayList();
        allc allcVar = this.a;
        if (allcVar.d.size() == 0) {
            return arrayList;
        }
        for (alld alldVar : allcVar.d) {
            if ((alldVar.b == 84813246 ? (aisu) alldVar.c : aisu.a).e.size() > 0) {
                return (alldVar.b == 84813246 ? (aisu) alldVar.c : aisu.a).e;
            }
        }
        return arrayList;
    }

    public final boolean h() {
        return this.a.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ahng.aE(parcel, this.a);
        parcel.writeLong(this.b);
    }
}
