package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qna {
    public final qlc a;
    public final qnb b;

    public qna(qlc qlcVar, qnb qnbVar) {
        this.a = qlcVar;
        this.b = qnbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qna) {
            qna qnaVar = (qna) obj;
            qlc qlcVar = this.a;
            if (qlcVar != null ? qlcVar.equals(qnaVar.a) : qnaVar.a == null) {
                if (this.b.equals(qnaVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        qlc qlcVar = this.a;
        return (((qlcVar == null ? 0 : qlcVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        qnb qnbVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + qnbVar.toString() + '}';
    }

    public qna() {
        throw null;
    }
}
