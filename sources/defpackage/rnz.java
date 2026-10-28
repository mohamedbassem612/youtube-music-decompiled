package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rnz extends admr {
    public final rnp a;
    private final Resources b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final CheckBox j;
    private final vxe k;
    private final Spanned l;
    private final Spanned m;

    public rnz(Context context, vxe vxeVar, rnp rnpVar, ViewGroup viewGroup) {
        this.b = context.getResources();
        this.a = rnpVar;
        this.k = vxeVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.modal_fingerprint_auth_layout, viewGroup, false);
        this.c = viewInflate;
        this.d = (TextView) viewInflate.findViewById(R.id.title);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.reauth_opt_out);
        this.j = checkBox;
        checkBox.setOnCheckedChangeListener(new dlm(rnpVar, 5));
        viewInflate.findViewById(R.id.close_button).setOnClickListener(new rnx(rnpVar, 0));
        this.e = (TextView) viewInflate.findViewById(R.id.description);
        this.f = (TextView) viewInflate.findViewById(R.id.other_methods_field);
        this.g = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.h = (TextView) viewInflate.findViewById(R.id.error_message_field);
        TextView textView = (TextView) viewInflate.findViewById(R.id.use_password_field);
        this.i = textView;
        textView.setOnClickListener(new rnx(rnpVar, 2));
        this.l = g(R.string.other_methods_suffix);
        this.m = g(R.string.use_password_suffix);
    }

    private final Spanned g(int i) {
        Resources resources = this.b;
        String string = resources.getString(i);
        String string2 = resources.getString(R.string.fingerprint_other_methods_prefix, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new rny(this, i), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private final void h() {
        tuk.l(this.h, false);
        tuk.l(this.i, false);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        h();
        this.g.setImageResource(R.drawable.quantum_ic_fingerprint_grey600_48);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        alay alayVar;
        akyy akyyVar = (akyy) obj;
        alay alayVar2 = akyyVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(this.d, ackj.k(null, alayVar2, null, false));
        TextView textView = this.e;
        if (akyyVar.e.size() != 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            boolean z = true;
            for (alay alayVar3 : akyyVar.e) {
                if (!z) {
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                }
                spannableStringBuilder.append((CharSequence) vxl.a(null, alayVar3, this.k, true));
                z = false;
            }
        } else {
            spannableStringBuilder = null;
        }
        tuk.u(textView, spannableStringBuilder);
        CheckBox checkBox = this.j;
        if ((akyyVar.c & 32) != 0) {
            alayVar = akyyVar.i;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(checkBox, vxl.a(null, alayVar, this.k, false));
        int i = akyyVar.f;
        boolean z2 = akyyVar.g;
        TextView textView2 = this.f;
        if (z2) {
            textView2.setText(this.l);
        } else {
            textView2.setText(this.m);
        }
        h();
        TextView textView3 = this.h;
        textView3.setText(this.b.getString(R.string.fingerprint_failed));
        tuk.l(textView3, true);
        tuk.l(this.i, true);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((akyy) obj).h.G();
    }
}
