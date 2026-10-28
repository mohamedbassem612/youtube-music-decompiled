package defpackage;

import android.support.v7.widget.GridLayoutManager;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adgb implements opg {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public adgb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.opg
    public final int a() {
        int i = this.$cid;
        if (i == 0) {
            np npVar = ((adgc) this.a).a;
            int width = (npVar.getWidth() - npVar.getPaddingLeft()) - npVar.getPaddingRight();
            int i2 = ((FlowLayoutManager) npVar).H;
            return i2 != 0 ? width / i2 : width;
        }
        Object obj = this.a;
        if (i == 1) {
            np npVar2 = ((adgc) obj).a;
            return (npVar2.getWidth() - npVar2.getPaddingLeft()) - npVar2.getPaddingRight();
        }
        adgd adgdVar = (adgd) obj;
        GridLayoutManager gridLayoutManager = adgdVar.a;
        int width2 = (gridLayoutManager.getWidth() - gridLayoutManager.getPaddingLeft()) - gridLayoutManager.getPaddingRight();
        int i3 = gridLayoutManager.b;
        if (gridLayoutManager.getOrientation() != 1 || i3 <= 0) {
            return width2;
        }
        return (width2 - (i3 > 1 ? (i3 - 1) * adgdVar.b : 0)) / i3;
    }
}
