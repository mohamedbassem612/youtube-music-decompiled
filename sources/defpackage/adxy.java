package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adxy extends adxd {
    public final agkj a;
    public final agkj b;
    public final agkj c;

    public adxy(agkj agkjVar, agkj agkjVar2, agkj agkjVar3) {
        super(null);
        if (agkjVar == null) {
            throw new NullPointerException("Null replaceItemByGroupIdUndoMap");
        }
        this.a = agkjVar;
        if (agkjVar2 == null) {
            throw new NullPointerException("Null replaceItemSectionContentUndoMap");
        }
        this.b = agkjVar2;
        if (agkjVar3 == null) {
            throw new NullPointerException("Null undoOperationMap");
        }
        this.c = agkjVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adxy) {
            adxy adxyVar = (adxy) obj;
            if (aguu.q(this.a, adxyVar.a) && aguu.q(this.b, adxyVar.b) && aguu.q(this.c, adxyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        agkj agkjVar = this.c;
        agkj agkjVar2 = this.b;
        return "SectionListMutationOperationsProcessorTransientState{replaceItemByGroupIdUndoMap=" + this.a.toString() + ", replaceItemSectionContentUndoMap=" + agkjVar2.toString() + ", undoOperationMap=" + agkjVar.toString() + '}';
    }

    public adxy() {
        throw null;
    }
}
