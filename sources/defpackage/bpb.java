package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bpb implements boe {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public bpb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [axaf, java.lang.Object] */
    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        if (this.$cid != 0) {
            this.a.d(boaVar.a());
        } else if (boaVar == boa.ON_START) {
            this.a.getSavedStateRegistry().c(bor.class);
        }
    }
}
