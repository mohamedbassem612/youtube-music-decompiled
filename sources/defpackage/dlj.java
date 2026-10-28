package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dlj extends oh {
    public final Drawable s;
    public ColorStateList t;
    public boolean u;
    public boolean v;
    private final SparseArray w;

    public dlj(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.w = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.google.android.apps.youtube.music.R.id.icon_frame, view.findViewById(com.google.android.apps.youtube.music.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.s = view.getBackground();
        if (textView != null) {
            this.t = textView.getTextColors();
        }
    }

    public final View C(int i) {
        SparseArray sparseArray = this.w;
        View viewFindViewById = (View) sparseArray.get(i);
        if (viewFindViewById == null && (viewFindViewById = this.a.findViewById(i)) != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
