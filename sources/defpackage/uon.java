package defpackage;

import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uon {
    public final ArrayList a = new ArrayList();
    public int b = -1;
    public int c = 0;

    public final uom a() {
        aami aamiVarE = e();
        int i = this.b;
        if (i <= 0 || aamiVarE == null) {
            return null;
        }
        return (uom) ((ArrayList) ((aami) this.a.get(i - 1)).b).get(aamiVarE.a);
    }

    public final Optional b() {
        Optional optionalOfNullable = Optional.ofNullable(e());
        sla slaVar = new sla(this, 9);
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        Object obj = optionalOfNullable.get();
        Object obj2 = slaVar.a;
        return Optional.ofNullable((uom) ((ArrayList) ((aami) obj).b).get(((uon) obj2).c));
    }

    public final boolean c() {
        if (this.b < this.a.size() - 1) {
            return true;
        }
        aami aamiVarE = e();
        return aamiVarE != null && this.c < ((ArrayList) aamiVarE.b).size() + (-1);
    }

    public final boolean d() {
        return this.b >= 0;
    }

    public final aami e() {
        int i = this.b;
        if (i >= 0) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                return (aami) arrayList.get(this.b);
            }
        }
        return null;
    }
}
