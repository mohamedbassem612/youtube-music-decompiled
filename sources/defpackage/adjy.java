package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adjy {
    public final View a;
    public final View b;
    public final View c;
    public boolean d;
    private final View e;
    private final adjv f;
    private final adjv g;

    static {
        xhb.a(3832);
        xhb.a(6827);
    }

    public adjy(Activity activity, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.interaction_logging_overlay, (ViewGroup) null);
        this.a = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.main_overlay);
        this.b = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.show_button);
        this.c = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.hide_button);
        this.e = viewFindViewById3;
        viewFindViewById2.setOnClickListener(new yde(this, 13));
        viewFindViewById3.setOnClickListener(new yde(this, 14));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.linear_layout_text);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.click_scroll_view);
        adjz adjzVar = new adjz(linearLayout, activity);
        this.f = adjzVar;
        adjzVar.a.setId(R.id.ve_shown_view);
        adka adkaVar = new adka(scrollView, activity);
        this.g = adkaVar;
        adkaVar.a.setId(R.id.explicit_click_view);
        viewFindViewById2.setOnLongClickListener(new adjw(0));
        viewFindViewById2.setOnDragListener(new adjx(this));
        viewFindViewById.setOnLongClickListener(new adjw(0));
        viewFindViewById.setOnDragListener(new adjx(this));
        tzk.i(activity, R.attr.ytBrandRed);
        activity.getColor(R.color.yt_light_green);
    }
}
