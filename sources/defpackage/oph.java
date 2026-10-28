package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oph {
    public static final oph a = a().a();
    public final opg b;
    public final Object c;
    public final agkj d;
    public final agfr e;
    public final int f;
    public final boolean g;
    public final agfr h;
    public final int i;

    public oph(opg opgVar, Object obj, agfr agfrVar, int i, int i2, boolean z, agfr agfrVar2) {
        this.b = opgVar;
        this.c = obj;
        this.d = null;
        this.e = agfrVar;
        this.f = i;
        this.i = i2;
        this.g = z;
        this.h = agfrVar2;
    }

    public static opf a() {
        opf opfVar = new opf();
        opfVar.c(0);
        opfVar.e = 1;
        opfVar.d = (byte) (opfVar.d | 1);
        opfVar.b(false);
        opfVar.d = (byte) (opfVar.d | 8);
        return opfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oph) {
            oph ophVar = (oph) obj;
            opg opgVar = this.b;
            if (opgVar != null ? opgVar.equals(ophVar.b) : ophVar.b == null) {
                Object obj2 = this.c;
                if (obj2 != null ? obj2.equals(ophVar.c) : ophVar.c == null) {
                    agkj agkjVar = ophVar.d;
                    agfr agfrVar = this.e;
                    if (agfrVar != null ? agfrVar.equals(ophVar.e) : ophVar.e == null) {
                        if (this.f == ophVar.f) {
                            int i = this.i;
                            int i2 = ophVar.i;
                            if (i == 0) {
                                throw null;
                            }
                            if (i2 == 1 && this.g == ophVar.g) {
                                agfr agfrVar2 = this.h;
                                if (agfrVar2 == null) {
                                    if (ophVar.h == null) {
                                        return true;
                                    }
                                } else if (agfrVar2.equals(ophVar.h)) {
                                    return true;
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
        opg opgVar = this.b;
        int iHashCode = opgVar == null ? 0 : opgVar.hashCode();
        Object obj = this.c;
        int iHashCode2 = ((iHashCode ^ 1000003) * 1000003) ^ (obj == null ? 0 : obj.hashCode());
        agfr agfrVar = this.e;
        int iHashCode3 = ((((iHashCode2 * 583896283) ^ (agfrVar == null ? 0 : agfrVar.hashCode())) * (-721379959)) ^ this.f) * 1000003;
        a.bj(this.i);
        int i = (((((iHashCode3 ^ 1) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        agfr agfrVar2 = this.h;
        return (i ^ (agfrVar2 != null ? agfrVar2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        int i = this.i;
        agfr agfrVar = this.e;
        Object obj = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(obj);
        String strValueOf3 = String.valueOf(agfrVar);
        String str = i != 1 ? "null" : "FROM_ACTIVITY";
        return "LocalElementsServices{sizeProvider=" + strValueOf + ", eventCustomData=" + strValueOf2 + ", heightEstimateFactor=0.0, eventCustomMap=null, interactionLogger=" + strValueOf3 + ", eventDataDecorator=null, visibilityMode=" + this.f + ", layoutDirectionMode=" + str + ", enableLayoutRootMaxDimensionsUpdate=" + this.g + ", enableFoldingInfoFoldBounds=false, blockRegistryRef=" + String.valueOf(this.h) + ", clientDataObservable=null}";
    }

    public oph() {
        throw null;
    }
}
