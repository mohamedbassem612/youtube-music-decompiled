package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.CircularImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aecl extends LinearLayout implements aupi {
    public aduv a;
    public final TextView b;
    public final CircularImageView c;
    private aupc d;
    private boolean e;

    public aecl(Context context) {
        super(context, null);
        if (!isInEditMode() && !this.e) {
            this.e = true;
            this.a = (aduv) ((gkj) generatedComponent()).a.cD.io();
        }
        View.inflate(context, R.layout.route_info_chip, this);
        this.b = (TextView) findViewById(R.id.route_info_chip_text);
        this.c = (CircularImageView) findViewById(R.id.route_info_chip_cancel_icon);
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aupc componentManager() {
        aupc aupcVar = this.d;
        if (aupcVar != null) {
            return aupcVar;
        }
        aupc aupcVar2 = new aupc(this);
        this.d = aupcVar2;
        return aupcVar2;
    }

    public final void b() {
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(0);
        this.b.setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.route_info_chip_text_padding), 0, getResources().getDimensionPixelSize(R.dimen.route_info_chip_text_padding), 0);
        this.b.setTextAppearance(getContext(), R.style.TextAppearance_RouteInfoChip);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.route_info_chip_height));
        setBackgroundResource(R.drawable.route_info_chip_translucent_background);
        setPadding(getResources().getDimensionPixelSize(R.dimen.route_info_chip_transparent_style_padding), getResources().getDimensionPixelSize(R.dimen.route_info_chip_transparent_style_padding), getResources().getDimensionPixelSize(R.dimen.route_info_chip_transparent_style_padding), getResources().getDimensionPixelSize(R.dimen.route_info_chip_transparent_style_padding));
        this.b.setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing));
        this.b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }
}
