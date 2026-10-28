package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aevz extends bam {
    private final View a;
    private int d;
    private int e;
    private final int[] f;

    public aevz(View view) {
        super(0);
        this.f = new int[2];
        this.a = view;
    }

    @Override // defpackage.bam
    public final void a(bbn bbnVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if ((ciVar.l() & 8) != 0) {
                this.a.setTranslationY(aetz.b(this.e, 0, ciVar.k()));
                return;
            }
        }
    }

    @Override // defpackage.bam
    public final void b(ci ciVar, bal balVar) {
        View view = this.a;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
    }

    @Override // defpackage.bam
    public final void c(ci ciVar) {
        this.a.setTranslationY(0.0f);
    }

    @Override // defpackage.bam
    public final void d(ci ciVar) {
        View view = this.a;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }
}
