package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uhq extends uib {
    public final qcb a;
    private final Context b;
    private final dd c;
    private final uhp d;
    private final adxj e;
    private final View f;
    private final aaok g;

    public uhq(Context context, dd ddVar, qcb qcbVar, uhp uhpVar, adxj adxjVar, aaok aaokVar) {
        super(context, ddVar, false, uhpVar.e);
        this.b = context;
        this.c = ddVar;
        this.a = qcbVar;
        this.d = uhpVar;
        this.e = adxjVar;
        this.g = aaokVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.close_confirmation_bottom_sheet_layout, (ViewGroup) null);
        this.f = viewInflate;
        if (uhpVar.c()) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.close_bottom_sheet_reshoot_icon);
            new ttk(context);
            int i = uhpVar.a;
            if (i != 0) {
                Drawable drawable = context.getDrawable(i);
                if (drawable != null) {
                    ttk.b(drawable, tzk.i(context, R.attr.ytStaticBrandWhite));
                    imageView.setImageDrawable(drawable);
                } else {
                    imageView.setImageResource(uhpVar.a);
                }
            }
            View viewFindViewById = viewInflate.findViewById(R.id.close_bottom_sheet_reshoot);
            viewFindViewById.setContentDescription(context.getText(uhpVar.b));
            ((TextView) viewInflate.findViewById(R.id.close_bottom_sheet_reshoot_text)).setText(uhpVar.b);
            viewFindViewById.setOnClickListener(new rnx(this, 17));
            viewFindViewById.setVisibility(0);
        } else {
            m(R.id.close_bottom_sheet_reshoot);
        }
        if (uhpVar.b()) {
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.close_bottom_sheet_exit_icon);
            new ttk(context);
            int i2 = uhpVar.c;
            if (i2 != 0) {
                Drawable drawable2 = context.getDrawable(i2);
                if (drawable2 != null) {
                    ttk.b(drawable2, tzk.i(context, R.attr.ytStaticBrandWhite));
                    imageView2.setImageDrawable(drawable2);
                } else {
                    imageView2.setImageResource(uhpVar.c);
                }
            }
            View viewFindViewById2 = viewInflate.findViewById(R.id.close_bottom_sheet_exit);
            viewFindViewById2.setContentDescription(context.getText(uhpVar.d));
            ((TextView) viewInflate.findViewById(R.id.close_bottom_sheet_exit_text)).setText(uhpVar.d);
            viewFindViewById2.setOnClickListener(new iks(5));
            viewFindViewById2.setVisibility(0);
        } else {
            m(R.id.close_bottom_sheet_exit);
        }
        if (aaokVar.B()) {
            l();
            return;
        }
        View viewFindViewById3 = viewInflate.findViewById(R.id.close_bottom_sheet_cancel);
        View viewFindViewById4 = viewInflate.findViewById(R.id.close_bottom_sheet_cancel_divider);
        if (viewFindViewById3 != null) {
            ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.close_bottom_sheet_cancel_icon);
            if (imageView3 != null) {
                imageView3.setImageDrawable(aecm.p(context, arqz.oQ, R.attr.ytStaticBrandWhite, adxjVar));
            }
            viewFindViewById3.setVisibility(0);
            if (viewFindViewById4 != null) {
                viewFindViewById4.setVisibility(0);
            }
            viewFindViewById3.setOnClickListener(new rnx(this, 16));
        }
    }

    private final uhr l() {
        uhr uhrVar = (uhr) this.c.g("CreationCloseConfirmationBottomSheetFragment");
        if (uhrVar != null) {
            uhrVar.i(this.d, this.a, this.e, this);
        }
        return uhrVar;
    }

    private final void m(int i) {
        this.f.findViewById(i).setVisibility(8);
    }

    @Override // defpackage.uib
    protected final View b() {
        return this.f;
    }

    @Override // defpackage.uib
    protected final String c() {
        return "";
    }

    @Override // defpackage.uib
    public final void d() {
        if (!this.g.B()) {
            super.d();
            return;
        }
        uhr uhrVar = (uhr) this.c.g("CreationCloseConfirmationBottomSheetFragment");
        if (uhrVar == null || !uhrVar.isAdded()) {
            return;
        }
        uhrVar.iN();
    }

    @Override // defpackage.uib
    public final void e() {
        dd ddVar = this.c;
        if (ddVar.ad() || ddVar.A) {
            return;
        }
        if (!this.g.B()) {
            super.e();
            return;
        }
        uhr uhrVarL = l();
        if (uhrVarL == null) {
            uhp uhpVar = this.d;
            uhr uhrVar = new uhr();
            Bundle bundle = new Bundle();
            bundle.putInt("arg_reshoot_icon", uhpVar.a);
            bundle.putInt("arg_reshoot_text", uhpVar.b);
            bundle.putInt("arg_exit_icon", uhpVar.c);
            bundle.putInt("arg_exit_text", uhpVar.d);
            bundle.putBoolean("arg_immersive", uhpVar.e);
            uhrVar.setArguments(bundle);
            uhrVar.i(uhpVar, this.a, this.e, this);
            uhrVarL = uhrVar;
        }
        if (uhrVarL.isAdded()) {
            return;
        }
        uhrVarL.h(ddVar, "CreationCloseConfirmationBottomSheetFragment");
    }

    @Override // defpackage.uib
    protected final boolean f() {
        return false;
    }

    @Override // defpackage.uib
    protected final boolean g() {
        return false;
    }
}
