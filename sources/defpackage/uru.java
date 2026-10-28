package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uru {
    public final auew a;
    public final List b;
    public final List c;

    public uru(auew auewVar, List list, List list2) {
        auewVar.getClass();
        list.getClass();
        list2.getClass();
        this.a = auewVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uru) {
            uru uruVar = (uru) obj;
            if (awrc.c(this.a, uruVar.a) && awrc.c(this.b, uruVar.b) && awrc.c(this.c, uruVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CompositionHistoryProtos(currentCommitProto=" + this.a + ", undoStackProto=" + this.b + ", redoStackProto=" + this.c + ')';
    }
}
