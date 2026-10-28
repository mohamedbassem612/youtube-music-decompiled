package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdr {
    public final Context a;
    public final agev b;
    private final agev c;
    private final agev d;

    public mdr(Context context, agev agevVar, agev agevVar2, agev agevVar3) {
        this.a = context;
        this.c = agevVar;
        this.d = agevVar2;
        this.b = agevVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mdr) {
            mdr mdrVar = (mdr) obj;
            if (this.a.equals(mdrVar.a) && this.c.equals(mdrVar.c) && this.d.equals(mdrVar.d) && this.b.equals(mdrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        agev agevVar = this.b;
        agev agevVar2 = this.d;
        agev agevVar3 = this.c;
        return "CollectionBasisContext{context=" + String.valueOf(this.a) + ", accountNames=" + String.valueOf(agevVar3) + ", stacktrace=" + String.valueOf(agevVar2) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(agevVar) + '}';
    }

    public mdr() {
        throw null;
    }
}
