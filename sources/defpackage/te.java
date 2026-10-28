package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class te extends vm {
    public final List a;
    public final List b;
    public final va c;
    private Integer d;
    private List e;
    private Set f;

    public te(List list, List list2, va vaVar) {
        super((byte[]) null);
        list.getClass();
        this.a = list;
        list2.getClass();
        this.b = list2;
        this.c = vaVar;
    }

    public final sz a() {
        va vaVar = this.c;
        if (vaVar == null) {
            return null;
        }
        return new sz(vaVar);
    }

    public final List b() {
        if (this.e == null) {
            List list = this.a;
            this.e = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                this.e.add(new sz((va) list.get(i)));
            }
        }
        return this.e;
    }

    public final Set c() {
        if (this.f == null) {
            List list = this.b;
            this.f = new afx(list.size());
            for (int i = 0; i < list.size(); i++) {
                int[] iArr = ((tr) list.get(i)).b;
                afx afxVar = new afx(iArr.length);
                for (int i2 : iArr) {
                    afxVar.add(Integer.valueOf(i2));
                }
                Set set = this.f;
                if (set != null) {
                    set.add(afxVar);
                }
            }
        }
        Set set2 = this.f;
        set2.getClass();
        return set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof te)) {
            te teVar = (te) obj;
            if (Objects.equals(this.a, teVar.a) && Objects.equals(this.b, teVar.b) && Objects.equals(this.c, teVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = this.d;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Objects.hash(this.a, this.b, this.c));
            this.d = numValueOf;
        }
        return numValueOf.intValue();
    }
}
