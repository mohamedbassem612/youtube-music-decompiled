package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wje implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private static final Set k;
    private static final Set l;
    public final wjm a;
    public final wjm b;
    public final wjm c;
    public final wjm d;
    public final wjm e;
    public final List f;
    public final List g;
    public final int h;
    public final int[] i;
    public final wjn j;
    private final wjc m;
    private final alvm n;

    static {
        HashSet hashSet = new HashSet();
        k = hashSet;
        hashSet.add(wjl.CPN);
        HashSet hashSet2 = new HashSet();
        l = hashSet2;
        hashSet2.add(wjl.MS);
        CREATOR = new uwz(13);
    }

    public wje(alvm alvmVar) {
        wjm wjmVar;
        wjm wjmVar2;
        wjm wjmVar3;
        wjc wjcVar;
        wjm wjmVar4;
        wjm wjmVar5;
        int i;
        alvmVar = alvmVar == null ? alvm.a : alvmVar;
        this.n = alvmVar;
        wjn wjnVar = null;
        if (alvmVar == null || (alvmVar.b & 1) == 0) {
            wjmVar = null;
        } else {
            amup amupVar = alvmVar.c;
            wjmVar = new wjm(amupVar == null ? amup.a : amupVar);
        }
        this.b = wjmVar;
        if (alvmVar == null || (alvmVar.b & 2) == 0) {
            wjmVar2 = null;
        } else {
            amup amupVar2 = alvmVar.d;
            wjmVar2 = new wjm(amupVar2 == null ? amup.a : amupVar2);
        }
        this.c = wjmVar2;
        if (alvmVar == null || (alvmVar.b & 4) == 0) {
            wjmVar3 = null;
        } else {
            amup amupVar3 = alvmVar.e;
            wjmVar3 = new wjm(amupVar3 == null ? amup.a : amupVar3);
        }
        this.d = wjmVar3;
        if (alvmVar == null || (alvmVar.b & 32768) == 0) {
            wjcVar = null;
        } else {
            amuo amuoVar = alvmVar.o;
            wjcVar = new wjc(amuoVar == null ? amuo.a : amuoVar);
        }
        this.m = wjcVar;
        if (alvmVar == null || (alvmVar.b & 32) == 0) {
            wjmVar4 = null;
        } else {
            amup amupVar4 = alvmVar.i;
            wjmVar4 = new wjm(amupVar4 == null ? amup.a : amupVar4);
        }
        this.e = wjmVar4;
        if (alvmVar == null || (alvmVar.b & 16384) == 0) {
            wjmVar5 = null;
        } else {
            amup amupVar5 = alvmVar.n;
            wjmVar5 = new wjm(amupVar5 == null ? amup.a : amupVar5);
        }
        this.a = wjmVar5;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        if (alvmVar != null && (alvmVar.b & 16) != 0) {
            amup amupVar6 = alvmVar.h;
            arrayList.add(new wjm(amupVar6 == null ? amup.a : amupVar6, k));
        }
        if (alvmVar != null && (alvmVar.b & 64) != 0) {
            amup amupVar7 = alvmVar.j;
            arrayList.add(new wjm(amupVar7 == null ? amup.a : amupVar7, l));
        }
        if (alvmVar != null && (alvmVar.b & SemanticState.Focused) != 0) {
            amup amupVar8 = alvmVar.k;
            arrayList.add(new wjm(amupVar8 == null ? amup.a : amupVar8, l));
        }
        if (alvmVar != null && (alvmVar.b & SemanticState.Hidden) != 0) {
            amup amupVar9 = alvmVar.l;
            arrayList.add(new wjm(amupVar9 == null ? amup.a : amupVar9));
        }
        if (alvmVar != null && (alvmVar.b & SemanticState.LiveRegion) != 0) {
            amup amupVar10 = alvmVar.m;
            arrayList.add(new wjm(amupVar10 == null ? amup.a : amupVar10));
        }
        if (alvmVar == null || alvmVar.f.size() == 0) {
            this.i = null;
        } else {
            this.i = ahng.S(alvmVar.f);
        }
        if (alvmVar == null || (i = alvmVar.g) <= 0) {
            this.h = 0;
        } else {
            this.h = i;
        }
        this.g = new ArrayList();
        if (alvmVar != null && !alvmVar.p.isEmpty()) {
            Iterator it = alvmVar.p.iterator();
            while (it.hasNext()) {
                this.g.add(new wjd((aora) it.next()));
            }
        }
        if (alvmVar != null && (alvmVar.b & 262144) != 0) {
            arhk arhkVar = alvmVar.q;
            wjnVar = new wjn(arhkVar == null ? arhk.a : arhkVar);
        }
        this.j = wjnVar;
    }

    public final aigj a() {
        return this.n.t;
    }

    public final aigj b() {
        return this.n.u;
    }

    public final String c() {
        return this.n.s;
    }

    public final String d() {
        return this.n.r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wje)) {
            return false;
        }
        wje wjeVar = (wje) obj;
        return Objects.equals(this.b, wjeVar.b) && Objects.equals(this.c, wjeVar.c) && Objects.equals(this.d, wjeVar.d) && Objects.equals(this.m, wjeVar.m) && Objects.equals(this.e, wjeVar.e) && Objects.equals(this.f, wjeVar.f) && Objects.equals(this.g, wjeVar.g) && Objects.equals(this.a, wjeVar.a) && this.h == wjeVar.h && Arrays.equals(this.i, wjeVar.i) && Objects.equals(d(), wjeVar.d()) && Objects.equals(c(), wjeVar.c()) && Objects.equals(a(), wjeVar.a());
    }

    public final int hashCode() {
        wjm wjmVar = this.b;
        int iHashCode = wjmVar != null ? wjmVar.hashCode() : 0;
        wjm wjmVar2 = this.c;
        int iHashCode2 = wjmVar2 != null ? wjmVar2.hashCode() : 0;
        int i = iHashCode + 31;
        wjm wjmVar3 = this.d;
        int iHashCode3 = ((((i * 31) + iHashCode2) * 31) + (wjmVar3 != null ? wjmVar3.hashCode() : 0)) * 31;
        wjc wjcVar = this.m;
        int iHashCode4 = (iHashCode3 + (wjcVar != null ? wjcVar.hashCode() : 0)) * 31;
        wjm wjmVar4 = this.e;
        int iHashCode5 = (iHashCode4 + (wjmVar4 != null ? wjmVar4.hashCode() : 0)) * 31;
        wjm wjmVar5 = this.a;
        return (((((((iHashCode5 + (wjmVar5 != null ? wjmVar5.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(a())) * 31;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.n.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public wje() {
        throw null;
    }
}
