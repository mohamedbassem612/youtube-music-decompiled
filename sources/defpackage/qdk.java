package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qdk implements qdl {
    private final /* synthetic */ int $cid;
    private final boolean a;
    private final Instant b;
    private final aihn c;

    public qdk(aihn aihnVar, boolean z, Instant instant, int i) {
        this.$cid = i;
        this.c = aihnVar;
        this.a = z;
        this.b = instant;
    }

    @Override // defpackage.qdl
    public final long a() {
        int i = this.$cid;
        aihn aihnVar = this.c;
        return i != 0 ? aihnVar.getSerializedSize() : aihnVar.getSerializedSize();
    }

    @Override // defpackage.qdl
    public final /* synthetic */ Object b() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.$cid != 0) {
            qdk qdkVar = (qdk) obj;
            boolean z = qdkVar.a;
            boolean z2 = this.a;
            if (z2 == z) {
                return qdkVar.b.compareTo(this.b);
            }
            if (!z2) {
                return 1;
            }
        } else {
            qdk qdkVar2 = (qdk) obj;
            boolean z3 = qdkVar2.a;
            boolean z4 = this.a;
            if (z4 == z3) {
                return qdkVar2.b.compareTo(this.b);
            }
            if (!z4) {
                return 1;
            }
        }
        return -1;
    }
}
