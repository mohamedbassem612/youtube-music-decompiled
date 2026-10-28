package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uwd implements ugc {
    final /* synthetic */ uwf a;
    private final View b;
    private final View c;
    private ufz d = null;

    public uwd(uwf uwfVar, View view, View view2) {
        this.a = uwfVar;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.ugc
    public final /* synthetic */ uga a() {
        return new ufy();
    }

    @Override // defpackage.ugc
    public final void b(ufz ufzVar) {
        this.d = ufzVar;
        this.a.a();
    }

    @Override // defpackage.ugc
    public final void c() {
        ufz ufzVar = this.d;
        if (ufzVar != null) {
            ufzVar.a();
        }
    }

    @Override // defpackage.ugc
    public final void d(ufz ufzVar) {
        this.d = ufzVar;
        View view = this.c;
        final ViewGroup viewGroup = (ViewGroup) view.getParent();
        final View view2 = this.b;
        viewGroup.addView(view2);
        final uwf uwfVar = this.a;
        aefs aefsVar = uwfVar.e;
        if (aefsVar != null) {
            aefsVar.e(new aefq() { // from class: uwc
                @Override // defpackage.aefq
                public final void a(int i) {
                    uwf uwfVar2 = uwfVar;
                    uwfVar2.e = null;
                    uwfVar2.f = null;
                    viewGroup.removeView(view2);
                    uwfVar2.d.kk(Boolean.FALSE);
                }
            });
        }
        view2.getViewTreeObserver().addOnGlobalLayoutListener(new uwe(uwfVar, view2, view));
    }
}
