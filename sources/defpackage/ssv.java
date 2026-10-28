package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssv implements stb {
    private static final Pattern A = Pattern.compile("^\\s*$");
    private static final Pattern B = Pattern.compile("^\\s*");
    private static final Pattern C = Pattern.compile("\\s*$");
    private final View D;
    private final aktm E;
    private final boolean F;
    private String G;
    private final TextWatcher H;
    private boolean I;
    private final aeiv J;
    public final Dialog a;
    public final Context b;
    public final Activity c;
    public final adhv d;
    public final aeaj e;
    public final EditText f;
    public final ImageView g;
    public final ImageView h;
    public final ImageView i;
    public final TextView j;
    public final TextView k;
    public final View l;
    public final TextView m;
    public final View n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final View r;
    public final boolean s;
    public final aeda t;
    public final ColorDrawable u;
    public Runnable v;
    public Runnable w;
    public boolean x;
    public boolean y;
    public srb z;

    /* JADX WARN: Code duplicated, block: B:10:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public ssv(Context context, Activity activity, adhv adhvVar, aeaj aeajVar, aduv aduvVar, ajnf ajnfVar, aktm aktmVar, ajnf ajnfVar2, vxu vxuVar, aeiv aeivVar, aeda aedaVar) {
        boolean z;
        boolean z2;
        int i;
        this.b = context;
        this.c = activity;
        adhvVar.getClass();
        this.d = adhvVar;
        this.E = aktmVar;
        aeajVar.getClass();
        this.e = aeajVar;
        this.J = aeivVar;
        aedaVar.getClass();
        this.t = aedaVar;
        ajvu ajvuVarC = vxuVar.c();
        if (ajvuVarC == null) {
            z = false;
        } else {
            ajxb ajxbVar = ajvuVarC.s;
            if ((ajxbVar == null ? ajxb.a : ajxbVar).f) {
                z = true;
            } else {
                z = false;
            }
        }
        this.s = z;
        if (ajvuVarC == null) {
            z2 = false;
        } else {
            ajxb ajxbVar2 = ajvuVarC.s;
            if ((ajxbVar2 == null ? ajxb.a : ajxbVar2).c) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.F = z2;
        this.u = new ColorDrawable(tzk.n(context, R.attr.ytGeneralBackgroundA).orElse(0));
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.comment_dialog, (ViewGroup) null, false);
        this.D = viewInflate;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.toggle_emoji_picker_icon);
        this.g = imageView;
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.send_button);
        this.i = imageView2;
        View viewFindViewById = viewInflate.findViewById(R.id.progress_bar);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.profile_photo);
        this.o = imageView3;
        ImageView imageView4 = (ImageView) viewInflate.findViewById(R.id.profile_photo_compact);
        this.p = imageView4;
        if (z) {
            imageView3.setVisibility(8);
            imageView4.setVisibility(0);
        } else {
            imageView3.setVisibility(0);
            imageView4.setVisibility(8);
        }
        EditText editText = (EditText) viewInflate.findViewById(R.id.comment);
        TextWatcher textWatcherC = aeajVar.c(editText);
        this.H = textWatcherC;
        editText.addTextChangedListener(textWatcherC);
        editText.addTextChangedListener(new stn());
        editText.addTextChangedListener(new ssu(this, editText));
        editText.post(new rxn(this, 13));
        this.f = editText;
        this.j = (TextView) viewInflate.findViewById(R.id.header_text);
        this.k = (TextView) viewInflate.findViewById(R.id.caption_text);
        this.l = viewInflate.findViewById(R.id.caption_divider);
        this.m = (TextView) viewInflate.findViewById(R.id.footer_text);
        this.n = viewInflate.findViewById(R.id.footer_divider);
        this.r = viewInflate.findViewById(R.id.actions);
        ImageView imageView5 = (ImageView) viewInflate.findViewById(R.id.video_reply_button);
        this.q = imageView5;
        imageView5.setEnabled(true);
        imageView5.setOnClickListener(new rnx(this, 9));
        ImageView imageView6 = (ImageView) viewInflate.findViewById(R.id.timestamp_button);
        this.h = imageView6;
        imageView6.setEnabled(true);
        imageView6.setOnClickListener(new rnx(this, 10));
        this.a = new AlertDialog.Builder(context).setView(viewInflate).create();
        this.G = "";
        if (ajnfVar2 != null) {
            aliz alizVarA = aliz.a((ajnfVar2.e == 8 ? (alja) ajnfVar2.f : alja.a).c);
            alizVarA = alizVarA == null ? aliz.UNKNOWN : alizVarA;
            aliz alizVar = aliz.UNKNOWN;
            if (alizVarA != alizVar) {
                aliz alizVarA2 = aliz.a((ajnfVar2.e == 8 ? (alja) ajnfVar2.f : alja.a).c);
                Drawable drawableD = dl.d(context, aduvVar.a(alizVarA2 != null ? alizVarA2 : alizVar));
                if (drawableD != null) {
                    drawableD.setTint(tzk.i(context, R.attr.ytThemedBlue));
                    imageView2.setImageDrawable(drawableD);
                }
            }
        }
        imageView2.setOnClickListener(new jip(this, viewFindViewById, 12, (char[]) null));
        if (ajnfVar == null || aktmVar == null || aktmVar.c.size() == 0 || (i = ajnfVar.e) != 8) {
            return;
        }
        aliz alizVarA3 = aliz.a((i == 8 ? (alja) ajnfVar.f : alja.a).c);
        alizVarA3 = alizVarA3 == null ? aliz.UNKNOWN : alizVarA3;
        aliz alizVar2 = aliz.UNKNOWN;
        if (alizVarA3 != alizVar2) {
            aliz alizVarA4 = aliz.a((ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a).c);
            int iA = aduvVar.a(alizVarA4 != null ? alizVarA4 : alizVar2);
            Drawable drawableD2 = dl.d(context, iA);
            drawableD2.setTint(tzk.n(context, R.attr.ytIconInactive).orElse(0));
            Drawable drawableD3 = dl.d(context, iA);
            drawableD3.setTint(tzk.n(context, R.attr.ytCallToAction).orElse(0));
            imageView.setImageDrawable(drawableD2);
            aiqe aiqeVar = ajnfVar.v;
            aiqd aiqdVar = (aiqeVar == null ? aiqe.a : aiqeVar).c;
            imageView.setContentDescription((aiqdVar == null ? aiqd.a : aiqdVar).c);
            if (aeivVar.k()) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
            imageView.setOnClickListener(new ivx((Object) this, (Object) drawableD2, (Object) drawableD3, 10, (short[]) null));
        }
    }

    @Override // defpackage.stb
    public final Spanned a() {
        EditText editText = this.f;
        return editText == null ? new SpannedString("") : new SpannedString(editText.getText());
    }

    @Override // defpackage.stb
    public final void b() {
        this.a.cancel();
    }

    public final void c(boolean z) {
        if (m()) {
            z = false;
        } else if (this.y) {
            z = true;
        }
        this.x = z;
        f(z);
    }

    public final void d(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        EditText editText = this.f;
        editText.getText().clear();
        editText.append(charSequence);
        c(z);
        if (this.x) {
            this.G = "";
        } else {
            String string = charSequence.toString();
            this.G = string;
            String strReplaceAll = string.replaceAll(B.toString(), "");
            this.G = strReplaceAll;
            this.G = strReplaceAll.replaceAll(C.toString(), "");
        }
        stm[] stmVarArr = (stm[]) editText.getText().getSpans(0, editText.getText().length(), stm.class);
        if (stmVarArr == null || stmVarArr.length == 0) {
            editText.getText().setSpan(new stm(), 0, editText.getText().length(), 18);
        }
    }

    @Override // defpackage.stb
    public final void dismiss() {
        if (this.I) {
            return;
        }
        Activity activity = this.c;
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        this.a.dismiss();
        this.I = true;
    }

    @Override // defpackage.stb
    public final void e(DialogInterface.OnCancelListener onCancelListener) {
        this.a.setOnCancelListener(onCancelListener);
    }

    public final void f(boolean z) {
        int i = 0;
        boolean z2 = this.g.getVisibility() == 0 || (this.F && this.h.getVisibility() == 0);
        ImageView imageView = this.i;
        if (!z) {
            i = z2 ? 8 : 4;
        }
        imageView.setVisibility(i);
        tuk.k(imageView, null, 1);
    }

    @Override // defpackage.stb
    public final void g() {
        this.g.setVisibility(0);
    }

    public final void h() {
        ViewGroup viewGroup = (ViewGroup) this.D;
        ssy ssyVar = new ssy(this, 1);
        this.e.f(viewGroup, this.E, this.f, ssyVar);
    }

    @Override // defpackage.stb
    public final void i() {
        if (this.e.e) {
            h();
        }
    }

    @Override // defpackage.stb
    public final void j() {
        TextWatcher textWatcher = this.H;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(this.f.getText());
        }
    }

    @Override // defpackage.stb
    public final boolean k() {
        return this.x;
    }

    public final boolean l() {
        if (TextUtils.isEmpty(this.G)) {
            if (!m()) {
                return true;
            }
        } else if (!a().toString().replaceAll(B.toString(), "").replaceAll(C.toString(), "").equals(this.G)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.stb
    public final boolean m() {
        String string = a().toString();
        return TextUtils.isEmpty(string) || A.matcher(string).find();
    }
}
