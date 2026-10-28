package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jbu extends qa {
    final /* synthetic */ jbw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbu(jbw jbwVar) {
        super((byte[]) null);
        this.a = jbwVar;
    }

    @Override // defpackage.qa
    public final void fQ() {
        this.a.b.getViewTreeObserver().addOnGlobalLayoutListener(new jbt(this, 0));
    }
}
