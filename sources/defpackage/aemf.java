package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aemf extends tud {
    final /* synthetic */ aemn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemf(aemn aemnVar, String str) {
        super(str);
        this.a = aemnVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        aemn aemnVar = this.a;
        aemnVar.n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = aemnVar.n.getHeight();
        aemnVar.o.setAlpha(0.0f);
        aemnVar.o.animate().alpha(1.0f).setDuration(250L).start();
        aemnVar.p.setTranslationY(height);
        aemnVar.p.animate().translationY(0.0f).setDuration(250L).setListener(new aeme(this)).start();
    }
}
