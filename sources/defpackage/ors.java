package defpackage;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ors {
    public final Object a;
    public final agkj b;
    public final agfr c;
    public final agfr d;
    public final SparseArray e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final mew j;
    private final agfr k;

    public ors(agfr agfrVar, Object obj, agfr agfrVar2, mew mewVar, int i, agfr agfrVar3, SparseArray sparseArray, int i2, int i3, float f) {
        this.k = agfrVar;
        this.a = obj;
        this.b = null;
        this.c = agfrVar2;
        this.j = mewVar;
        this.i = i;
        this.d = agfrVar3;
        this.e = sparseArray;
        this.f = i2;
        this.g = i3;
        this.h = f;
    }

    public static orr b() {
        orr orrVar = new orr();
        orrVar.b(1.0f);
        orrVar.d(-1);
        orrVar.c(-1);
        return orrVar;
    }

    @Deprecated
    public final View a() {
        agfr agfrVar = this.k;
        if (agfrVar != null) {
            return (View) agfrVar.io();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ors) {
            ors orsVar = (ors) obj;
            agfr agfrVar = this.k;
            if (agfrVar != null ? agfrVar.equals(orsVar.k) : orsVar.k == null) {
                Object obj2 = this.a;
                if (obj2 != null ? obj2.equals(orsVar.a) : orsVar.a == null) {
                    agkj agkjVar = orsVar.b;
                    agfr agfrVar2 = this.c;
                    if (agfrVar2 != null ? agfrVar2.equals(orsVar.c) : orsVar.c == null) {
                        mew mewVar = this.j;
                        if (mewVar != null ? mewVar.equals(orsVar.j) : orsVar.j == null) {
                            int i = this.i;
                            if (i != 0 ? i == orsVar.i : orsVar.i == 0) {
                                agfr agfrVar3 = this.d;
                                if (agfrVar3 != null ? agfrVar3.equals(orsVar.d) : orsVar.d == null) {
                                    SparseArray sparseArray = this.e;
                                    if (sparseArray != null ? sparseArray.equals(orsVar.e) : orsVar.e == null) {
                                        if (this.f == orsVar.f && this.g == orsVar.g) {
                                            if (Float.floatToIntBits(this.h) == Float.floatToIntBits(orsVar.h)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        agfr agfrVar = this.k;
        int iHashCode = agfrVar == null ? 0 : agfrVar.hashCode();
        Object obj = this.a;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        int i = iHashCode ^ 1000003;
        agfr agfrVar2 = this.c;
        int iHashCode3 = agfrVar2 == null ? 0 : agfrVar2.hashCode();
        int i2 = (i * 1000003) ^ iHashCode2;
        mew mewVar = this.j;
        int iHashCode4 = ((((i2 * (-721379959)) ^ iHashCode3) * (-721379959)) ^ (mewVar == null ? 0 : mewVar.hashCode())) * 1000003;
        int i3 = this.i;
        if (i3 == 0) {
            i3 = 0;
        }
        int i4 = (iHashCode4 ^ i3) * 1000003;
        agfr agfrVar3 = this.d;
        int iHashCode5 = (i4 ^ (agfrVar3 == null ? 0 : agfrVar3.hashCode())) * 1000003;
        SparseArray sparseArray = this.e;
        return ((((((iHashCode5 ^ (sparseArray != null ? sparseArray.hashCode() : 0)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ Float.floatToIntBits(this.h);
    }

    public final String toString() {
        SparseArray sparseArray = this.e;
        agfr agfrVar = this.d;
        mew mewVar = this.j;
        agfr agfrVar2 = this.c;
        Object obj = this.a;
        return "EventData{viewSupplier=" + String.valueOf(this.k) + ", customData=" + String.valueOf(obj) + ", customMap=null, blockRegistryRef=" + String.valueOf(agfrVar2) + ", identifier=null, senderState=" + String.valueOf(mewVar) + ", eventType=" + nqz.a(this.i) + ", interactionLogger=" + String.valueOf(agfrVar) + ", nodeDataMap=" + String.valueOf(sparseArray) + ", viewKey=" + this.f + ", nodeId=" + this.g + ", displayDensity=" + this.h + '}';
    }

    public ors() {
        throw null;
    }
}
