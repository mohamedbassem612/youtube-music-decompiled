package defpackage;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeap extends oh {
    public static final /* synthetic */ int u = 0;
    public final View s;
    public final Object t;

    public aeap(aeao aeaoVar, View view, aeiv aeivVar) {
        super(view);
        this.t = aeivVar;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setOnClickListener(aeaoVar);
        this.s = (ImageView) view.findViewById(com.google.android.apps.youtube.music.R.id.emoji);
    }

    public aeap(fjw fjwVar) {
        super(fjwVar);
        this.t = new avmm();
        this.s = fjwVar;
    }
}
