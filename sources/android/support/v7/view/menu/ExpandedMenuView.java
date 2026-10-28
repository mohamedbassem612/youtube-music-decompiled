package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ahto;
import defpackage.ip;
import defpackage.iq;
import defpackage.is;
import defpackage.jd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ip, jd {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private iq b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ahto ahtoVarL = ahto.L(context, attributeSet, a, i, 0);
        if (ahtoVarL.H(0)) {
            setBackgroundDrawable(ahtoVarL.B(0));
        }
        if (ahtoVarL.H(1)) {
            setDivider(ahtoVarL.B(1));
        }
        ahtoVarL.F();
    }

    @Override // defpackage.jd
    public final void a(iq iqVar) {
        this.b = iqVar;
    }

    @Override // defpackage.ip
    public final boolean b(is isVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((is) getAdapter().getItem(i), null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
