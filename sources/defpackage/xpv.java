package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xpv extends nh {
    public List a;
    private final LayoutInflater e;
    private final View.OnClickListener f;
    private final xgn g;

    public xpv(Context context, View.OnClickListener onClickListener, xgn xgnVar) {
        this.e = LayoutInflater.from(context);
        this.f = onClickListener;
        this.g = xgnVar;
    }

    @Override // defpackage.nh
    public final int a() {
        List list = this.a;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.a.size() + 1;
    }

    @Override // defpackage.nh
    public final int b(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // defpackage.nh
    public final oh e(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.e;
        return i == 1 ? new xpu(layoutInflater.inflate(R.layout.mdx_delete_tv_codes_row, viewGroup, false), this.f) : new oh(layoutInflater.inflate(R.layout.mdx_delete_tv_codes_header, viewGroup, false));
    }

    @Override // defpackage.nh
    public final void o(oh ohVar, int i) {
        if (ohVar instanceof xpu) {
            xpu xpuVar = (xpu) ohVar;
            xvk xvkVar = (xvk) this.a.get(i - 1);
            xgn xgnVar = this.g;
            xpuVar.s.setText(xvkVar.c());
            xgnVar.l(new xgj(xhb.b(27858)));
            xpuVar.t.setTag(xvkVar);
        }
    }
}
