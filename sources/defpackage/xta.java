package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xta implements adma {
    private final /* synthetic */ int $cid;
    public final View a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final Object e;

    public xta(Context context, vxe vxeVar, jij jijVar, int i) {
        this.$cid = i;
        context.getClass();
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        this.c = vxeVar;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.music_shelf_footer, null);
        ViewGroup viewGroup = (ViewGroup) linearLayout.findViewById(R.id.bottom_button_container);
        this.e = viewGroup;
        this.a = (YouTubeTextView) linearLayout.findViewById(R.id.disclaimer_text);
        this.d = jijVar.a(viewGroup.findViewById(R.id.bottom_button), viewGroup, null, null, false);
        jdwVar.c(linearLayout);
    }

    @Override // defpackage.adma
    public final View a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? (View) this.e : ((jdw) this.b).a;
        }
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                ((CompoundButton) this.d).setOnCheckedChangeListener(null);
            } else {
                tuk.l((View) this.e, false);
                tuk.l(this.a, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [admd, java.lang.Object] */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        ajly ajlyVar;
        alay alayVar2;
        int i = this.$cid;
        if (i == 0) {
            xsz xszVar = (xsz) obj;
            ((YouTubeTextView) this.b).setText(xszVar.a);
            boolean z = xszVar.b;
            Object obj2 = this.c;
            if (z) {
                ProgressBar progressBar = (ProgressBar) obj2;
                progressBar.getIndeterminateDrawable().setColorFilter(tzk.i((Context) this.e, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_IN);
                progressBar.getIndeterminateDrawable().setAlpha(yno.da(40.0d));
                progressBar.setVisibility(0);
            } else {
                ((ProgressBar) obj2).setVisibility(8);
            }
            boolean z2 = xszVar.c;
            Object obj3 = this.d;
            if (!z2) {
                ((View) obj3).setVisibility(8);
                return;
            }
            View view = (View) obj3;
            view.setBackgroundColor(tzk.i((Context) this.e, R.attr.ytTextPrimary));
            view.getBackground().setAlpha(yno.da(10.0d));
            view.setVisibility(0);
            return;
        }
        if (i == 1) {
            hef hefVar = (hef) obj;
            hefVar.a();
            adlyVar.b.w(new xgj(hefVar.a()), null);
            Object obj4 = hefVar.b;
            Object obj5 = this.e;
            int i2 = 19;
            if (obj4 != null) {
                ((ViewGroup) obj5).setVisibility(0);
                adlyVar.f("musicShelfBottomActionCommandKey", hefVar.a);
                ((jbm) this.d).j(adlyVar, (ajnf) obj4, 19);
            } else {
                ((ViewGroup) obj5).setVisibility(8);
            }
            Optional optionalFindFirst = Collection.EL.stream(((anwt) hefVar.a).x).findFirst();
            imc imcVar = new imc(this, i2);
            if (true == optionalFindFirst.isPresent()) {
                Object obj6 = optionalFindFirst.get();
                Object obj7 = imcVar.a;
                View view2 = ((xta) obj7).a;
                ((YouTubeTextView) view2).d();
                tuk.u((TextView) view2, ackj.k(null, (alay) obj6, new jdc(obj7, 4), false));
            }
            this.b.e(adlyVar);
            return;
        }
        aqso aqsoVar = (aqso) obj;
        if ((aqsoVar.b & 1) != 0) {
            alayVar = aqsoVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        ((TextView) this.c).setText(ackj.k(null, alayVar, null, false));
        ajlx ajlxVar = aqsoVar.d;
        if (ajlxVar == null) {
            ajlxVar = ajlx.a;
        }
        if ((ajlxVar.b & 2) != 0) {
            ajlx ajlxVar2 = aqsoVar.d;
            if (ajlxVar2 == null) {
                ajlxVar2 = ajlx.a;
            }
            ajlyVar = ajlxVar2.c;
            if (ajlyVar == null) {
                ajlyVar = ajly.a;
            }
        } else {
            ajlyVar = null;
        }
        Object obj8 = this.d;
        if (ajlyVar == null) {
            ((CompoundButton) obj8).setVisibility(8);
            ((TextView) this.a).setVisibility(8);
            return;
        }
        CompoundButton compoundButton = (CompoundButton) obj8;
        compoundButton.setChecked(ajlyVar.d);
        compoundButton.setOnCheckedChangeListener(new dlm(this, 8));
        View view3 = this.a;
        if ((ajlyVar.b & 1) != 0) {
            alayVar2 = ajlyVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        TextView textView = (TextView) view3;
        textView.setText(ackj.k(null, alayVar2, null, false));
        textView.setOnClickListener(new aefn(this, 8, null));
        compoundButton.setVisibility(0);
        textView.setVisibility(0);
    }

    public xta(Context context, int i) {
        this.$cid = i;
        this.e = context;
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_section_header, null);
        this.a = viewInflate;
        this.b = (YouTubeTextView) viewInflate.findViewById(R.id.device_picker_section_header_title);
        this.c = (ProgressBar) viewInflate.findViewById(R.id.device_picker_section_header_progress_bar);
        this.d = viewInflate.findViewById(R.id.device_picker_section_header_divider);
    }

    public xta(Context context, aekt aektVar, int i) {
        this.$cid = i;
        View viewInflate = View.inflate(context, R.layout.share_panel_title, null);
        this.e = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.title);
        this.d = (CompoundButton) viewInflate.findViewById(R.id.native_share_checkbox);
        this.a = (TextView) viewInflate.findViewById(R.id.native_share_checkbox_text);
        this.b = aektVar;
        aenh.m(viewInflate);
    }
}
