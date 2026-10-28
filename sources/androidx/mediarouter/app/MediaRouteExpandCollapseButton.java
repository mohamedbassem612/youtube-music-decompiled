package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import com.google.android.apps.youtube.music.R;
import defpackage.ast;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final AnimatedVectorDrawable a;
    public final AnimatedVectorDrawable b;
    public final String c;
    public final String d;
    public boolean e;
    public View.OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.mr_group_expand);
        this.a = animatedVectorDrawable;
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.mr_group_collapse);
        this.b = animatedVectorDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(ast.i(context, i), PorterDuff.Mode.SRC_IN);
        animatedVectorDrawable.setColorFilter(porterDuffColorFilter);
        animatedVectorDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.c = string;
        this.d = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animatedVectorDrawable);
        setContentDescription(string);
        super.setOnClickListener(new View.OnClickListener() { // from class: dgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
                boolean z = mediaRouteExpandCollapseButton.e;
                mediaRouteExpandCollapseButton.e = !z;
                if (z) {
                    AnimatedVectorDrawable animatedVectorDrawable3 = mediaRouteExpandCollapseButton.b;
                    mediaRouteExpandCollapseButton.setImageDrawable(animatedVectorDrawable3);
                    animatedVectorDrawable3.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.c);
                } else {
                    AnimatedVectorDrawable animatedVectorDrawable4 = mediaRouteExpandCollapseButton.a;
                    mediaRouteExpandCollapseButton.setImageDrawable(animatedVectorDrawable4);
                    animatedVectorDrawable4.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.d);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }
}
