package defpackage;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeaf extends oh {
    public static final /* synthetic */ int v = 0;
    public final ImageView s;
    public final aeae t;
    public final aeiv u;

    public aeaf(aeae aeaeVar, View view, aeiv aeivVar) {
        super(view);
        this.t = aeaeVar;
        this.u = aeivVar;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setOnClickListener(aeaeVar);
        this.s = (ImageView) view.findViewById(com.google.android.apps.youtube.music.R.id.emoji);
    }
}
