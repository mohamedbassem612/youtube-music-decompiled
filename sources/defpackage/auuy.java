package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class auuy implements qln {
    private final /* synthetic */ int $cid;

    public /* synthetic */ auuy(int i) {
        this.$cid = i;
    }

    @Override // defpackage.qln
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return (pzl) aihn.parseFrom(pzl.a, (byte[]) obj);
        }
        if (i != 1) {
            return i != 2 ? (axhi) aihn.parseFrom(axhi.a, (byte[]) obj) : (poz) aihn.parseFrom(poz.b, (byte[]) obj);
        }
        return (aink) aihn.parseFrom(aink.a, (byte[]) obj);
    }
}
