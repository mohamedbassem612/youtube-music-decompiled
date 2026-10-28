package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.Toolbar;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfw extends admr implements aeum, jiw {
    public final Context a;
    public final View b;
    public final TextView c;
    protected Toolbar d;
    public final TextView e;
    public anzl f;
    public final boolean g;
    public final ViewTreeObserver.OnGlobalLayoutListener h = new jg(this, 9);
    private ggd i;
    private View j;
    private final ViewGroup k;
    private final hfn l;

    public jfw(Context context, hfn hfnVar, View view) {
        this.a = context;
        this.l = hfnVar;
        this.b = view;
        this.j = view.findViewById(R.id.two_line_both_lines_container);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.collapsing_toolbar_layout_background_container);
        this.k = viewGroup;
        viewGroup.setVisibility(0);
        if (this.j == null) {
            View.inflate(context, R.layout.music_two_line_header, viewGroup);
            this.j = view.findViewById(R.id.two_line_both_lines_container);
        }
        TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
        this.e = textView;
        boolean z = textView != null;
        this.g = z;
        if (z) {
            this.i = new ggd(textView);
            textView.setVisibility(0);
            Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
            this.d = toolbar;
            toolbar.setBackground(new ColorDrawable(context.getColor(R.color.black_header_color)));
        }
        this.c = (TextView) view.findViewById(R.id.two_line_header);
        this.j.setBackground(new ColorDrawable(context.getColor(R.color.ytm_color_black)));
    }

    public static alay g(alay alayVar, char c) {
        if (alayVar.c.size() == 0) {
            return alayVar;
        }
        alba albaVar = (alba) alayVar.c.get(0);
        String strConcat = albaVar.c;
        for (int i = 1; i < alayVar.c.size(); i++) {
            String str = ((alba) alayVar.c.get(i)).c;
            if (strConcat.charAt(strConcat.length() - 1) != c && str.charAt(0) != c) {
                str = c + str;
            }
            strConcat = String.valueOf(strConcat).concat(String.valueOf(str));
        }
        aihh aihhVar = (aihh) albaVar.toBuilder();
        aihhVar.copyOnWrite();
        alba albaVar2 = (alba) aihhVar.instance;
        strConcat.getClass();
        albaVar2.b |= 1;
        albaVar2.c = strConcat;
        alba albaVar3 = (alba) aihhVar.build();
        aihh aihhVar2 = (aihh) alay.a.createBuilder();
        aihhVar2.f(albaVar3);
        return (alay) aihhVar2.build();
    }

    public static boolean h(alay alayVar, TextView textView) {
        String string = ackj.k(null, alayVar, null, false).toString();
        TextPaint paint = textView.getPaint();
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return rect.width() < textView.getWidth();
    }

    @Override // defpackage.adma
    public final View a() {
        return this.k;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.Z(this.j, 0, 0);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        this.f = (anzl) obj;
        TextView textView = this.c;
        ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.h);
        }
        alay alayVar = this.f.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        textView.setLines(Math.min(alayVar.c.size(), 2));
        Context context = this.a;
        textView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.action_bar_height) + context.getResources().getDimensionPixelSize(R.dimen.two_line_header_top_padding), 0, 0);
        kro.T(this.j, adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anzl) obj).d.G();
    }

    @Override // defpackage.jiw
    public final void i(int i) {
        ViewGroup viewGroup = this.k;
        viewGroup.setPadding(0, i, 0, 0);
        viewGroup.requestLayout();
    }

    @Override // defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            this.e.setVisibility(4);
            return;
        }
        if (appBarLayout.f() + i <= 0) {
            this.i.b();
            return;
        }
        TextView textView = this.c;
        int[] iArr = new int[2];
        textView.getLocationInWindow(iArr);
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(R.dimen.two_line_header_title_fade_in_breakpoint_percent, typedValue, true);
        int height = iArr[1] + ((int) (textView.getHeight() * typedValue.getFloat()));
        int iK = this.l.K();
        ggd ggdVar = this.i;
        if (height < iK) {
            ggdVar.b();
        } else {
            ggdVar.a();
        }
    }
}
