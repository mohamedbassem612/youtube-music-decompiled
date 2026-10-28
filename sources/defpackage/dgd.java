package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import com.google.android.apps.youtube.music.R;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dgd extends ArrayAdapter {
    final float a;
    final /* synthetic */ dge b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgd(dge dgeVar, Context context, List list) {
        super(context, 0, list);
        this.b = dgeVar;
        this.a = ast.g(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            dge dgeVar = this.b;
            dge.p((LinearLayout) view.findViewById(R.id.volume_item_container), dgeVar.x);
            View viewFindViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.width = dgeVar.w;
            layoutParams.height = dgeVar.w;
            viewFindViewById.setLayoutParams(layoutParams);
        }
        dii diiVar = (dii) getItem(i);
        if (diiVar != null) {
            boolean z = diiVar.h;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(diiVar.e);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            dge dgeVar2 = this.b;
            ast.n(context, mediaRouteVolumeSlider, dgeVar2.n);
            mediaRouteVolumeSlider.setTag(diiVar);
            dgeVar2.A.put(diiVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.a(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (dgeVar2.B(diiVar)) {
                    mediaRouteVolumeSlider.setMax(diiVar.q);
                    mediaRouteVolumeSlider.setProgress(diiVar.p);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener(dgeVar2.u);
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z ? 255 : (int) (this.a * 255.0f));
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(true == dgeVar2.s.contains(diiVar) ? 4 : 0);
            Set set = dgeVar2.q;
            if (set != null && set.contains(diiVar)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}
