package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.CircularClipTapBloomView;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abks {
    private static final Duration l = Duration.ofMillis(200);
    private static final Duration m = Duration.ofMillis(200);
    private static final Duration n = Duration.ofMillis(200);
    public YouTubeAppCompatTextView a;
    public ImageView b;
    public abkx c;
    public LinearLayout d;
    public final View e;
    public boolean f;
    public tss g;
    public tss h;
    public tss i;
    public abuz j;
    public final hwe k;
    private abkn o;
    private View p;
    private final abkq q;

    public abks(View view, hwe hweVar, abkq abkqVar) {
        this.e = view;
        this.k = hweVar;
        this.q = abkqVar;
        a();
    }

    public final void a() {
        if (this.f) {
            return;
        }
        View view = this.e;
        int integer = view.getResources().getInteger(R.integer.fade_duration_fast);
        this.h = new tss((CircularClipTapBloomView) view.findViewById(R.id.tap_bloom_view));
        this.a = (YouTubeAppCompatTextView) view.findViewById(R.id.fast_forward_rewind_hint_text);
        this.b = (ImageView) view.findViewById(R.id.fast_forward_rewind_hint_icon);
        abuz abuzVar = new abuz((abky) this.h.a);
        this.j = abuzVar;
        abuzVar.c().addListener(new abkr(this));
        abkw abkwVar = new abkw();
        abkwVar.c(Duration.ofMillis(200L));
        abkwVar.c(l);
        Duration duration = n;
        abkwVar.b(agke.s(abkv.a(0.0f, 1.0f, duration), abkv.a(1.0f, 1.0f, m), abkv.a(1.0f, 0.0f, duration)));
        abkwVar.d(agke.s(view.findViewById(R.id.swipe_triangle_left), view.findViewById(R.id.swipe_triangle_mid), view.findViewById(R.id.swipe_triangle_right)));
        this.c = abkwVar.a();
        tss tssVar = new tss((ImageView) view.findViewById(R.id.dark_background));
        this.g = tssVar;
        tssVar.d = 300L;
        tssVar.c = 200L;
        this.d = (LinearLayout) view.findViewById(R.id.fast_forward_rewind_triangles);
        this.i = new tss((LinearLayout) view.findViewById(R.id.fast_forward_rewind_hint_container), integer);
        this.p = view.findViewById(R.id.user_education_view);
        this.o = new abkn(this.p, this.q);
        this.f = true;
    }

    public final void b(boolean z) {
        a();
        abkn abknVar = this.o;
        if (!z) {
            if (abknVar.f) {
                abknVar.g.h(false, true);
                abknVar.a.a();
                abknVar.b.a();
                abknVar.e.removeCallbacks(new abmn(1));
                return;
            }
            return;
        }
        if (!abknVar.f) {
            View view = abknVar.c;
            int integer = view.getResources().getInteger(R.integer.fade_duration_fast);
            abknVar.e = (TextView) view.findViewById(R.id.user_education_text_view);
            abknVar.g = new tss((ViewGroup) view.findViewById(R.id.user_education_view), integer);
            abknVar.a = abknVar.a(R.id.user_education_triangle_left3, R.id.user_education_triangle_left2, R.id.user_education_triangle_left1);
            abknVar.b = abknVar.a(R.id.user_education_triangle_right3, R.id.user_education_triangle_right2, R.id.user_education_triangle_right1);
            abknVar.f = true;
        }
        TextView textView = abknVar.e;
        abkq abkqVar = abknVar.d;
        int seconds = (int) abkqVar.a().toSeconds();
        textView.setText(abkqVar.a.getQuantityString(R.plurals.user_education_quick_seek, seconds, Integer.valueOf(seconds)));
        abknVar.g.h(true, true);
        abknVar.g.d(new abkl());
    }
}
