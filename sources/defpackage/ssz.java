package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssz extends sth implements DialogInterface.OnShowListener {
    private static final agrf O = agrf.h("com/google/android/libraries/youtube/comment/ui/CommentDialogFragment");
    private static final Pattern P = Pattern.compile("^\\s*$");
    private static final Pattern Q = Pattern.compile("^\\s*");
    private static final Pattern R = Pattern.compile("\\s*$");
    public DialogInterface.OnShowListener A;
    public Dialog B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public String G;
    public Long H;
    public vxu I;
    public srb J;
    public aeiv K;
    public ahgb L;
    public axlj M;
    public taq N;
    private aqmh S;
    private arrh T;
    private ajnf U;
    private CharSequence V;
    private boolean W;
    private ajnf X;
    private aktm Y;
    private ajxx Z;
    private ajyj aa;
    private Spanned ab;
    private Spanned ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private View ag;
    private ImageView ah;
    private View ai;
    private ImageView aj;
    private ImageView ak;
    private TextView al;
    private TextView am;
    private View an;
    private TextView ao;
    private View ap;
    private ImageView aq;
    private ImageView ar;
    private TextWatcher as;
    private String at;
    private avmm au;
    public vxe k;
    public adhv l;
    public aduv m;
    public xgn n;
    public aefv o;
    public Context p;
    public aeaj q;
    public EditText r;
    public View s;
    public ImageView t;
    public View u;
    public View v;
    public Runnable w;
    public Runnable x;
    public DialogInterface.OnDismissListener y;
    public DialogInterface.OnCancelListener z;

    private static MessageLite u(Bundle bundle, String str, MessageLite messageLite) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        try {
            return ahng.aC(bundle, str, messageLite, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (RuntimeException unused) {
            ((agrc) ((agrc) O.b()).k("com/google/android/libraries/youtube/comment/ui/CommentDialogFragment", "retrieveProtoFromBundle", 1274, "CommentDialogFragment.java")).w("Failed to merge proto for %s", str);
            return null;
        }
    }

    @Override // defpackage.stb
    public final Spanned a() {
        EditText editText = this.r;
        return editText == null ? new SpannedString("") : new SpannedString(editText.getText());
    }

    @Override // defpackage.stb
    public final void b() {
        this.B.cancel();
    }

    @Override // defpackage.bp
    public final void dismiss() {
        if (getFragmentManager() == null || getFragmentManager().ad()) {
            return;
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.stb
    public final void e(DialogInterface.OnCancelListener onCancelListener) {
        this.z = onCancelListener;
    }

    @Override // defpackage.stb
    public final void g() {
        this.t.setVisibility(0);
    }

    @Override // defpackage.stb
    public final void i() {
        if (this.q.e) {
            q();
        }
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Dialog dialogIH = super.iH(bundle);
        dialogIH.setOnShowListener(this);
        return dialogIH;
    }

    @Override // defpackage.stb
    public final void j() {
        TextWatcher textWatcher = this.as;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(this.r.getText());
        }
    }

    @Override // defpackage.stb
    public final boolean k() {
        return this.C;
    }

    public final void l(boolean z) {
        if (m()) {
            z = false;
        } else if (this.D) {
            z = true;
        }
        this.C = z;
        o(z);
    }

    @Override // defpackage.stb
    public final boolean m() {
        String string = a().toString();
        return TextUtils.isEmpty(string) || P.matcher(string).find();
    }

    public final void n(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.r.getText().clear();
        this.r.append(charSequence);
        l(z);
        if (this.C) {
            this.at = "";
        } else {
            String string = charSequence.toString();
            this.at = string;
            String strReplaceAll = string.replaceAll(Q.toString(), "");
            this.at = strReplaceAll;
            this.at = strReplaceAll.replaceAll(R.toString(), "");
        }
        stm[] stmVarArr = (stm[]) this.r.getText().getSpans(0, this.r.getText().length(), stm.class);
        if (stmVarArr == null || stmVarArr.length == 0) {
            this.r.getText().setSpan(new stm(), 0, this.r.getText().length(), 18);
        }
    }

    public final void o(boolean z) {
        int i = 0;
        boolean z2 = this.t.getVisibility() == 0 || (this.ae && this.ak.getVisibility() == 0);
        ImageView imageView = this.ah;
        if (!z) {
            i = z2 ? 8 : 4;
        }
        imageView.setVisibility(i);
        tuk.k(this.ah, null, 1);
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.z;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        this.n.t();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        ajyj ajyjVar;
        boolean z;
        boolean z2;
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.q = this.L.b(new ssx(this));
        Bundle arguments = getArguments();
        this.S = (aqmh) u(arguments, "profile_photo", aqmh.a);
        alay alayVar = alay.a;
        boolean z3 = false;
        this.ab = ackj.k(null, (alay) u(arguments, "caption", alayVar), null, false);
        this.ac = ackj.k(null, (alay) u(arguments, "hint", alayVar), null, false);
        this.T = (arrh) u(arguments, "zero_step", arrh.a);
        ajnf ajnfVar = ajnf.a;
        this.U = (ajnf) u(arguments, "camera_button", ajnfVar);
        this.X = (ajnf) u(arguments, "emoji_picker_button", ajnfVar);
        this.Y = (aktm) u(arguments, "emoji_picker_renderer", aktm.a);
        this.Z = (ajxx) u(arguments, "comment_dialog_renderer", ajxx.a);
        this.aa = (ajyj) u(arguments, "reply_dialog_renderer", ajyj.a);
        if (arguments.containsKey("comment_text")) {
            this.V = arguments.getCharSequence("comment_text");
        }
        this.W = arguments.getBoolean("retry");
        ajxx ajxxVar = this.Z;
        boolean z4 = ((ajxxVar == null || (ajxxVar.b & SemanticState.Modal) == 0 || !ajxxVar.l) && ((ajyjVar = this.aa) == null || (ajyjVar.b & 262144) == 0 || !ajyjVar.m)) ? false : true;
        ajvu ajvuVarC = this.I.c();
        if (ajvuVarC == null) {
            z = false;
        } else {
            ajxb ajxbVar = ajvuVarC.s;
            if (ajxbVar == null) {
                ajxbVar = ajxb.a;
            }
            if (ajxbVar.f) {
                z = true;
            } else {
                z = false;
            }
        }
        this.ad = z;
        if (ajvuVarC == null) {
            z2 = false;
        } else {
            ajxb ajxbVar2 = ajvuVarC.s;
            if (ajxbVar2 == null) {
                ajxbVar2 = ajxb.a;
            }
            if (ajxbVar2.c && z4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.ae = z2;
        if (ajvuVarC != null) {
            ajxb ajxbVar3 = ajvuVarC.s;
            if (ajxbVar3 == null) {
                ajxbVar3 = ajxb.a;
            }
            if (ajxbVar3.e && z4) {
                z3 = true;
            }
        }
        this.af = z3;
        abvn abvnVar = ((gzf) this.N).a;
        this.G = abvnVar.o() != null ? abvnVar.o().n() : null;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x046b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x0201  */
    /* JADX WARN: Code duplicated, block: B:62:0x0204  */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ssz sszVar;
        aktm aktmVar;
        int i;
        int i2;
        ajyj ajyjVar;
        apji apjiVar;
        aihl aihlVarCheckIsLite;
        apji apjiVar2;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = LayoutInflater.from(this.p).inflate(true != this.af ? R.layout.comment_dialog : R.layout.comment_dialog_with_dismiss_button, viewGroup, false);
        this.ag = viewInflate;
        this.o.h(viewInflate);
        this.r = (EditText) this.ag.findViewById(R.id.comment);
        this.ah = (ImageView) this.ag.findViewById(R.id.send_button);
        this.s = this.ag.findViewById(R.id.progress_bar);
        this.ai = this.ag.findViewById(R.id.actions);
        this.aj = (ImageView) this.ag.findViewById(R.id.video_reply_button);
        this.t = (ImageView) this.ag.findViewById(R.id.toggle_emoji_picker_icon);
        this.ak = (ImageView) this.ag.findViewById(R.id.timestamp_button);
        this.al = (TextView) this.ag.findViewById(R.id.header_text);
        this.am = (TextView) this.ag.findViewById(R.id.caption_text);
        this.an = this.ag.findViewById(R.id.caption_divider);
        this.ao = (TextView) this.ag.findViewById(R.id.footer_text);
        this.ap = this.ag.findViewById(R.id.footer_divider);
        this.aq = (ImageView) this.ag.findViewById(R.id.profile_photo);
        this.ar = (ImageView) this.ag.findViewById(R.id.profile_photo_compact);
        this.B = this.f;
        this.at = "";
        boolean z = this.ad;
        ImageView imageView = this.aq;
        int i3 = 8;
        if (z) {
            imageView.setVisibility(8);
            this.ar.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            this.ar.setVisibility(8);
        }
        new adia(this.l, new tym(null), this.ad ? this.ar : this.aq, false).f(this.S, null);
        int i4 = 10;
        int i5 = 11;
        if (this.ae) {
            this.ak.setEnabled(true);
            this.ak.setOnClickListener(new rnx(this, 11));
            xgn xgnVarHB = getActivity() instanceof xgm ? ((xgm) getActivity()).hB() : null;
            xhc xhcVarB = xhb.b(this.Z != null ? 113255 : 113430);
            if (xgnVarHB != null) {
                xgnVarHB.l(new xgj(xhcVarB));
            }
            if (this.ae && this.N.S() != null) {
                boolean zBooleanValue = this.N.R().booleanValue();
                this.x = new rmx(this, xgnVarHB, xhcVarB, i4);
                if (this.ah.getVisibility() == 4) {
                    this.ah.setVisibility(8);
                }
                this.ak.setVisibility(0);
                p(zBooleanValue);
                tuk.k(this.ak, null, 1);
                ajxx ajxxVar = this.Z;
                if (ajxxVar == null) {
                    ajyjVar = this.aa;
                    if (ajyjVar != null) {
                        apjiVar = ajyjVar.l;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        aihlVarCheckIsLite = aihn.checkIsLite(alht.a);
                        apjiVar.c(aihlVarCheckIsLite);
                        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                            apjiVar2 = this.aa.l;
                            if (apjiVar2 == null) {
                                apjiVar2 = apji.a;
                            }
                            aihlVarCheckIsLite2 = aihn.checkIsLite(alht.a);
                            apjiVar2.c(aihlVarCheckIsLite2);
                            objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                            if (objK == null) {
                                objC = aihlVarCheckIsLite2.b;
                            } else {
                                objC = aihlVarCheckIsLite2.c(objK);
                            }
                        }
                    }
                } else {
                    apji apjiVar3 = ajxxVar.k;
                    if (apjiVar3 == null) {
                        apjiVar3 = apji.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(alht.a);
                    apjiVar3.c(aihlVarCheckIsLite3);
                    if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                        apji apjiVar4 = this.Z.k;
                        if (apjiVar4 == null) {
                            apjiVar4 = apji.a;
                        }
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(alht.a);
                        apjiVar4.c(aihlVarCheckIsLite4);
                        Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                    } else {
                        ajyjVar = this.aa;
                        if (ajyjVar != null) {
                            apjiVar = ajyjVar.l;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aihlVarCheckIsLite = aihn.checkIsLite(alht.a);
                            apjiVar.c(aihlVarCheckIsLite);
                            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                                apjiVar2 = this.aa.l;
                                if (apjiVar2 == null) {
                                    apjiVar2 = apji.a;
                                }
                                aihlVarCheckIsLite2 = aihn.checkIsLite(alht.a);
                                apjiVar2.c(aihlVarCheckIsLite2);
                                objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                                if (objK == null) {
                                    objC = aihlVarCheckIsLite2.b;
                                } else {
                                    objC = aihlVarCheckIsLite2.c(objK);
                                }
                            }
                        }
                    }
                }
            }
        }
        TextWatcher textWatcherC = this.q.c(this.r);
        this.as = textWatcherC;
        this.r.addTextChangedListener(textWatcherC);
        this.r.addTextChangedListener(new stn());
        int i6 = 9;
        this.r.addTextChangedListener(new gxv(this, 9));
        this.r.post(new rxn(this, 14));
        n(this.V, this.W);
        Spanned spanned = this.ac;
        if (!TextUtils.isEmpty(spanned)) {
            this.r.setHint(spanned);
        }
        arrh arrhVar = this.T;
        if (arrhVar != null) {
            alay alayVar = arrhVar.b;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            this.al.setText(spannedK);
            tuk.l(this.al, !TextUtils.isEmpty(spannedK));
            alay alayVar2 = this.T.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            Spanned spannedA = vxl.a(null, alayVar2, this.k, false);
            this.ao.setText(spannedA);
            tuk.l(this.ap, !TextUtils.isEmpty(spannedA));
            tuk.l(this.ao, !TextUtils.isEmpty(spannedA));
        } else {
            Spanned spanned2 = this.ab;
            if (spanned2 != null) {
                this.am.setText(spanned2);
                tuk.l(this.am, !TextUtils.isEmpty(spanned2));
                tuk.l(this.an, !TextUtils.isEmpty(spanned2));
            }
        }
        this.aj.setEnabled(true);
        this.aj.setOnClickListener(new rnx(this, 13));
        ajnf ajnfVar = this.U;
        if (ajnfVar != null && (i2 = ajnfVar.e) == 8 && (ajnfVar.b & SemanticState.Obscured) != 0) {
            aduv aduvVar = this.m;
            aliz alizVarA = aliz.a((i2 == 8 ? (alja) ajnfVar.f : alja.a).c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            int iA = aduvVar.a(alizVarA);
            this.ai.setVisibility(0);
            this.aj.setVisibility(0);
            this.aj.setImageResource(iA);
        }
        int i7 = 12;
        this.ah.setOnClickListener(new rnx(this, 12));
        avmm avmmVar = new avmm();
        this.au = avmmVar;
        if (this.ae) {
            avmn[] avmnVarArr = new avmn[2];
            taq taqVar = this.N;
            avmnVarArr[0] = (taqVar.T() ? ((gzf) taqVar).a.C().W(new rtq(i5)).H(new rtq(i7)) : ((gzf) taqVar).a.C()).ak(new sqk(this, 7));
            avmnVarArr[1] = this.N.Q().ak(new sqk(this, i3));
            avmmVar.e(avmnVarArr);
        }
        if (this.af) {
            this.u = this.ag.findViewById(R.id.dismiss_button);
            this.v = this.ag.findViewById(R.id.comment_dialog_wrapper);
            View view = this.u;
            if (view != null) {
                view.setEnabled(true);
                this.u.setVisibility(0);
                this.u.setOnClickListener(new rnx(this, 14));
            }
            this.au.e(((gzf) this.N).a.H().ak(new sqk(this, i6)), ((gzf) this.N).a.ao().b().ak(new sqk(this, i4)));
        }
        ajnf ajnfVar2 = this.X;
        aduv aduvVar2 = this.m;
        if (ajnfVar2 == null || (aktmVar = this.Y) == null || aktmVar.c.size() == 0 || (i = ajnfVar2.e) != 8) {
            sszVar = this;
        } else {
            aliz alizVarA2 = aliz.a((i == 8 ? (alja) ajnfVar2.f : alja.a).c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            aliz alizVar = aliz.UNKNOWN;
            if (alizVarA2 != alizVar) {
                aliz alizVarA3 = aliz.a((ajnfVar2.e == 8 ? (alja) ajnfVar2.f : alja.a).c);
                if (alizVarA3 != null) {
                    alizVar = alizVarA3;
                }
                int iA2 = aduvVar2.a(alizVar);
                Drawable drawableD = dl.d(this.p, iA2);
                drawableD.setTint(tzk.n(this.p, R.attr.ytIconInactive).orElse(0));
                Drawable drawableD2 = dl.d(this.p, iA2);
                drawableD2.setTint(tzk.n(this.p, R.attr.ytCallToAction).orElse(0));
                this.t.setImageDrawable(drawableD);
                ImageView imageView2 = this.t;
                aiqe aiqeVar = ajnfVar2.v;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                imageView2.setContentDescription(aiqdVar.c);
                boolean zK = this.K.k();
                ImageView imageView3 = this.t;
                if (zK) {
                    imageView3.setVisibility(0);
                } else {
                    imageView3.setVisibility(4);
                }
                sszVar = this;
                this.t.setOnClickListener(new ivx((Object) sszVar, (Object) drawableD, (Object) drawableD2, 11, (short[]) null));
            } else {
                sszVar = this;
            }
        }
        return sszVar.ag;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        avmm avmmVar = this.au;
        if (avmmVar != null) {
            avmmVar.b();
        }
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.y;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.n.t();
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        if (this.E) {
            dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        xgn xgnVar;
        DialogInterface.OnShowListener onShowListener = this.A;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
        arrh arrhVar = this.T;
        if (arrhVar == null || this.W || (xgnVar = this.n) == null) {
            return;
        }
        xgnVar.l(new xgj(arrhVar.d, (amud) null));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f;
        if (dialog != null) {
            Window window = dialog.getWindow();
            window.setLayout(-1, -2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            window.setSoftInputMode(5);
            this.r.requestFocus();
            if (!this.af) {
                window.setBackgroundDrawable(new ColorDrawable(tzk.n(this.p, R.attr.ytGeneralBackgroundA).orElse(0)));
                return;
            }
            window.setFlags(32, 32);
            window.clearFlags(2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View decorView = getActivity().getWindow().getDecorView();
            final int height = decorView.getHeight();
            final Window window2 = this.B.getWindow();
            decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ssw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    ssz sszVar = this.a;
                    int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + windowInsets.getSystemWindowInsetBottom() + sszVar.p.getApplicationContext().getResources().getDimensionPixelSize(R.dimen.comment_dialog_scrubber_offset) + sszVar.F;
                    int height2 = sszVar.v.getHeight();
                    Window window3 = window2;
                    int i = height - systemWindowInsetTop;
                    if (i > height2) {
                        sszVar.u.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                        window3.setLayout(-1, i);
                    } else {
                        sszVar.u.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 0.0f));
                        window3.setLayout(-1, -2);
                    }
                    return windowInsets;
                }
            });
            decorView.requestApplyInsets();
        }
    }

    public final void p(boolean z) {
        this.ak.setEnabled(!z);
        Drawable drawableD = dl.d(this.p, R.drawable.ic_timestamp);
        drawableD.setTint(tzk.n(this.p, true != z ? R.attr.ytTextSecondary : R.attr.ytTextDisabled).orElse(0));
        this.ak.setImageDrawable(drawableD);
    }

    public final void q() {
        aeaj aeajVar = this.q;
        if (aeajVar != null) {
            aeajVar.f((ViewGroup) this.ag, this.Y, this.r, new ssy(this, 0));
        }
    }

    public final boolean r() {
        if (TextUtils.isEmpty(this.at)) {
            if (!m()) {
                return true;
            }
        } else if (!a().toString().replaceAll(Q.toString(), "").replaceAll(R.toString(), "").equals(this.at)) {
            return true;
        }
        return false;
    }
}
