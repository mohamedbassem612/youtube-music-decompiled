package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqq extends oh {
    public static final /* synthetic */ int y = 0;
    private final CardView A;
    public final View s;
    public final CardView t;
    public final adia u;
    public final TextView v;
    public final TextView w;
    final /* synthetic */ jqr x;
    private final ImageView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqq(jqr jqrVar, View view) {
        super(view);
        this.x = jqrVar;
        this.s = view;
        CardView cardView = (CardView) view.findViewById(R.id.card_view_container);
        this.t = cardView;
        cardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cardView.setOnTouchListener(new jfs(this, jqrVar, 4, null));
        CardView cardView2 = (CardView) view.findViewById(R.id.swipeable_mini_player_thumbnail_container);
        this.A = cardView2;
        ImageView imageView = (ImageView) view.findViewById(R.id.swipeable_mini_player_thumbnail);
        this.z = imageView;
        if (((vxz) jqrVar.j.io()).l(118, 45823962L, false)) {
            cardView2.b(jqrVar.k);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cardView2.getLayoutParams();
            if (marginLayoutParams != null && marginLayoutParams.getMarginStart() != 0) {
                marginLayoutParams.setMarginStart(0);
                cardView2.setLayoutParams(marginLayoutParams);
            }
        }
        this.v = (TextView) view.findViewById(R.id.swipeable_mini_player_title);
        this.w = (TextView) view.findViewById(R.id.swipeable_mini_player_subtitle);
        this.u = adul.l(jqrVar.e, imageView);
        C();
    }

    public final void C() {
        this.s.setPadding(0, 0, 0, 0);
    }
}
