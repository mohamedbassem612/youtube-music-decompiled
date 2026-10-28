package com.google.android.apps.youtube.music.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PlayerPanel extends FrameLayout {
    public View a;

    public PlayerPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.a.setVisibility(8);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.player_error_icon_layout);
        viewFindViewById.getClass();
        this.a = viewFindViewById;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
