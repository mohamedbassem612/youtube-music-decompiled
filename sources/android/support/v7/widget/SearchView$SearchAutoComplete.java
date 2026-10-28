package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import defpackage.ke;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SearchView$SearchAutoComplete extends ke {
    private int a;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getThreshold();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.a <= 0 || super.enoughToFilter();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Configuration configuration = getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
            i = i2 < 600 ? 160 : 192;
        } else {
            i = SemanticState.Hidden;
        }
        setMinWidth((int) TypedValue.applyDimension(1, i, displayMetrics));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState == null) {
                    return true;
                }
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
            i = 4;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        super.setThreshold(i);
        this.a = i;
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public SearchView$SearchAutoComplete(Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    protected final void replaceText(CharSequence charSequence) {
    }
}
