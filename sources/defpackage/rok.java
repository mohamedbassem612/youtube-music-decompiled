package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rok extends nh {
    public int[] a;
    private final View.OnClickListener e;
    private final View.OnClickListener f;
    private final String g;
    private final String h;

    public rok(Context context, rnp rnpVar) {
        this.g = context.getResources().getString(R.string.use_password);
        this.h = context.getResources().getString(R.string.use_fingerprint);
        this.e = new rnx(rnpVar, 3);
        this.f = new rnx(rnpVar, 4);
    }

    @Override // defpackage.nh
    public final int a() {
        int[] iArr = this.a;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return new xuc((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.modal_other_methods_list_item, viewGroup, false));
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        xuc xucVar = (xuc) ohVar;
        int i2 = this.a[i];
        if (i2 == 0) {
            TextView textView = (TextView) xucVar.s;
            textView.setText(this.g);
            textView.setOnClickListener(this.e);
            return;
        }
        if (i2 == 1) {
            TextView textView2 = (TextView) xucVar.s;
            textView2.setText(this.h);
            textView2.setOnClickListener(this.f);
        }
    }
}
