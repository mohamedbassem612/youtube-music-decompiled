package defpackage;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class aze extends azq {
    private final View a;

    public aze(View view) {
        this.a = view;
    }

    @Override // defpackage.azq
    public void a() {
        View view = this.a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.azq
    public void b() {
        View viewFindViewById;
        View view = this.a;
        if (view != null) {
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new mc(viewFindViewById, 19, null));
        }
    }
}
