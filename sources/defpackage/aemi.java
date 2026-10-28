package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aemi extends tud {
    final /* synthetic */ aemn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemi(aemn aemnVar, String str) {
        super(str);
        this.a = aemnVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        aemn aemnVar = this.a;
        if (aemnVar.q.getChildCount() > 1) {
            if (aemnVar.r.getChildCount() == 0 || aemnVar.r.getHeight() > 0) {
                aemnVar.q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                aemnVar.m(true);
            }
        }
    }
}
