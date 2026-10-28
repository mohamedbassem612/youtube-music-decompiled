package defpackage;

import android.view.ViewGroup;
import android.widget.GridLayout;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tyg implements tyh {
    private final GridLayout.Spec a;

    public tyg(GridLayout.Spec spec) {
        this.a = spec;
    }

    @Override // defpackage.tyh
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) layoutParams;
        GridLayout.Spec spec = layoutParams2.columnSpec;
        GridLayout.Spec spec2 = this.a;
        if (Objects.equals(spec2, spec)) {
            return false;
        }
        layoutParams2.columnSpec = spec2;
        return true;
    }
}
