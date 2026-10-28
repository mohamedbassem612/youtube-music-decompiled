package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xad implements View.OnClickListener, adma {
    protected final Context a;
    public final View b;
    protected final ImageView c;
    protected final ImageView d;
    public final TextView e;
    public final ClipDrawable f;
    protected final xgn g;
    public boolean h;
    public long i;
    public long j;
    private final GradientDrawable k;
    private final GradientDrawable l;
    private final vxe m;
    private ajwo n;
    private ajwo o;
    private final Runnable p = new wvr(this, 11, null);

    public xad(Context context, xgm xgmVar, vxe vxeVar, vxz vxzVar) {
        this.a = context;
        this.m = vxeVar;
        this.g = xgmVar.hB();
        View viewInflate = LayoutInflater.from(context).inflate(true != vxzVar.l(134, 45712301L, false) ? R.layout.live_chat_ticker_item : R.layout.live_chat_ticker_item_with_clipped_avatar, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (ImageView) viewInflate.findViewById(R.id.avatar);
        this.d = (ImageView) viewInflate.findViewById(R.id.icon);
        this.e = (TextView) viewInflate.findViewById(R.id.associated_text);
        GradientDrawable gradientDrawable = (GradientDrawable) context.getDrawable(R.drawable.live_chat_ticker_item);
        this.k = gradientDrawable;
        GradientDrawable gradientDrawable2 = (GradientDrawable) context.getDrawable(R.drawable.live_chat_ticker_item);
        this.l = gradientDrawable2;
        ClipDrawable clipDrawable = new ClipDrawable(gradientDrawable2, 8388611, 1);
        this.f = clipDrawable;
        viewInflate.setBackground(new LayerDrawable(new Drawable[]{gradientDrawable, clipDrawable}));
        viewInflate.setOnClickListener(this);
    }

    @Override // defpackage.adma
    public View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public void b(admh admhVar) {
        p();
        this.e.setText("");
        this.f.setLevel(10000);
        this.i = 0L;
        this.j = 0L;
        this.n = null;
        this.o = null;
    }

    protected abstract int d(Object obj);

    protected abstract int e(Object obj);

    protected int f(Object obj) {
        return 0;
    }

    protected abstract int g(Object obj);

    protected abstract long h(Object obj);

    /* JADX WARN: Code duplicated, block: B:12:0x0078  */
    @Override // defpackage.adma
    public void hU(adly adlyVar, Object obj) {
        n(obj);
        this.o = (ajwo) adlyVar.c("ticker_applied_action");
        TextView textView = this.e;
        textView.setText(j(obj));
        textView.setTextColor(d(obj));
        textView.setContentDescription(m(obj));
        Resources resources = this.a.getResources();
        if (s(obj)) {
            textView.setMaxWidth(resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_max_width));
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        ajwo ajwoVar = this.o;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ammr.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                ajwo ajwoVar2 = this.o;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amms.b);
                ajwoVar2.c(aihlVarCheckIsLite2);
                if (!ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                    this.c.setVisibility(0);
                    o(obj);
                }
            }
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            o(obj);
        }
        int iF = f(obj);
        ImageView imageView = this.d;
        if (iF != 0) {
            imageView.setImageResource(iF);
            imageView.setColorFilter(d(obj));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.i = i(obj);
        this.j = ((Long) adlyVar.c("ticker_start_timestamp_ms")).longValue() + h(obj);
        this.k.setColor(e(obj));
        this.l.setColor(g(obj));
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_margin);
        resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_top_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_bottom_margin);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(dimensionPixelOffset);
        layoutParams.setMarginEnd(dimensionPixelOffset);
        layoutParams.bottomMargin = dimensionPixelOffset2;
        View view = this.b;
        view.setLayoutParams(layoutParams);
        ajwo ajwoVarL = l(obj);
        this.n = ajwoVarL;
        view.setClickable((this.m == null || ajwoVarL == null) ? false : true);
        xgz xgzVarK = k();
        if (xgzVarK != null) {
            this.g.l(xgzVarK);
        }
        q();
    }

    protected abstract long i(Object obj);

    protected abstract Spanned j(Object obj);

    protected abstract xgz k();

    protected abstract ajwo l(Object obj);

    protected abstract String m(Object obj);

    protected abstract void o(Object obj);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.n != null) {
            HashMap map = new HashMap();
            map.put("ticker_applied_action", this.o);
            if (r()) {
                map.put("is_fullscreen", Boolean.TRUE);
            }
            View view2 = this.b;
            ViewParent parent = view2.getParent();
            if (parent instanceof RecyclerView) {
                map.put("live_chat_ticker_view", parent);
            } else {
                map.put("live_chat_ticker_view", view2);
            }
            map.put("is_in_immersive_live", Boolean.FALSE);
            xgz xgzVarK = k();
            if (xgzVarK != null) {
                this.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVarK, null);
            }
            this.m.c(this.n, map);
        }
    }

    public final void p() {
        this.h = false;
        this.b.removeCallbacks(this.p);
    }

    public final void q() {
        this.h = true;
        this.b.post(this.p);
    }

    protected boolean r() {
        return false;
    }

    protected boolean s(Object obj) {
        return false;
    }

    protected void n(Object obj) {
    }
}
