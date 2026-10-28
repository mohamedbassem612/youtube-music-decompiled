package defpackage;

import android.widget.EditText;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jlj {
    public static final xgz a = new xgj(xhb.b(208485));
    public final xgn b;
    public final vxe c;
    public final EditText d;
    public final jlh e;
    public jlo f;
    private final cc g;
    private final ImageView h;
    private final xsc i;

    public jlj(cc ccVar, xgn xgnVar, xsc xscVar, vxe vxeVar, ImageView imageView, EditText editText, jlh jlhVar) {
        this.g = ccVar;
        this.b = xgnVar;
        this.i = xscVar;
        this.c = vxeVar;
        this.h = imageView;
        this.d = editText;
        this.e = jlhVar;
    }

    public final void a() {
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        this.b.l(a);
        if (this.f == null) {
            this.f = this.i.aq(this.g.requireActivity());
        }
        imageView.setOnClickListener(new jjc(this, 4));
    }
}
