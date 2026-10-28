package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyz implements fyy {
    public final String a;
    public final ArrayList b;

    public fyz(String str, List list) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fyz) {
            fyz fyzVar = (fyz) obj;
            String str = this.a;
            if (str == null ? fyzVar.a == null : str.equals(fyzVar.a)) {
                return this.b.equals(fyzVar.b);
            }
        }
        return false;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.fyy
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    @Override // defpackage.fyy
    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return null;
    }

    @Override // defpackage.fyy
    public final fyy d() {
        return this;
    }
}
