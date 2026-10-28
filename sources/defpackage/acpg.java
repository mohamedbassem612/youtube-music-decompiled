package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpg extends tud {
    final /* synthetic */ View a;
    final /* synthetic */ apfp b;
    final /* synthetic */ ViewTreeObserver c;
    final /* synthetic */ acph d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acpg(acph acphVar, String str, View view, apfp apfpVar, ViewTreeObserver viewTreeObserver) {
        super(str);
        this.a = view;
        this.b = apfpVar;
        this.c = viewTreeObserver;
        this.d = acphVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        View view = this.a;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        this.d.d(this.b);
        ViewTreeObserver viewTreeObserver = this.c;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
