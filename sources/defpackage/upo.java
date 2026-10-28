package defpackage;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.AppCompatImageView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.image.mediagen.MediaGenInputView;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.stream.IntStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class upo extends upp {
    public static final axp a = new iqi(8);
    private final ayq A;
    public final MediaGenInputView b;
    public final EditText c;
    public final ImageButton d;
    public final TextView e;
    public final View f;
    public final vxe g;
    public final xgn h;
    private final View q;
    private final View r;
    private final ViewGroup s;
    private final View u;
    private final View v;
    private final adhv w;
    private final vxz z;
    private agke t = agpi.a;
    public final AtomicBoolean i = new AtomicBoolean(false);
    public boolean j = false;
    public boolean k = false;
    public Optional l = Optional.empty();
    public cc m = null;
    public roq o = null;
    private Optional x = Optional.empty();
    private Optional y = Optional.empty();
    public Consumer n = null;

    public upo(final MediaGenInputView mediaGenInputView, adxj adxjVar, aeda aedaVar, vxe vxeVar, xgn xgnVar, adhv adhvVar, vxz vxzVar, final ayq ayqVar) {
        this.b = mediaGenInputView;
        this.g = vxeVar;
        this.h = xgnVar;
        this.w = adhvVar;
        this.z = vxzVar;
        this.A = ayqVar;
        LayoutInflater.from(mediaGenInputView.getContext()).inflate(R.layout.media_gen_editor_text_input_layer, (ViewGroup) mediaGenInputView, true);
        View viewFindViewById = mediaGenInputView.findViewById(R.id.media_gen_editor_text_input_container);
        this.q = viewFindViewById;
        View viewFindViewById2 = mediaGenInputView.findViewById(R.id.ai_image_edit_text_input_container);
        this.r = viewFindViewById2;
        EditText editText = (EditText) mediaGenInputView.findViewById(R.id.ai_image_edit_text);
        this.c = editText;
        ImageButton imageButton = (ImageButton) mediaGenInputView.findViewById(R.id.ai_image_edit_text_submit_button);
        this.d = imageButton;
        TextView textView = (TextView) mediaGenInputView.findViewById(R.id.ai_image_edit_disclaimer_text);
        this.e = textView;
        ViewGroup viewGroup = (ViewGroup) mediaGenInputView.findViewById(R.id.ai_image_edit_suggestion_chips_list);
        this.s = viewGroup;
        View viewFindViewById3 = mediaGenInputView.findViewById(R.id.ai_image_edit_suggestion_chips_list_scrollview);
        this.f = viewFindViewById3;
        View viewFindViewById4 = mediaGenInputView.findViewById(R.id.media_gen_input_scrim);
        this.u = viewFindViewById4;
        View viewFindViewById5 = mediaGenInputView.findViewById(R.id.ai_image_edit_text_input_bottom_padding);
        this.v = viewFindViewById5;
        if (viewFindViewById == null) {
            Log.e("MediaGenInputViewPeer", "Invalid State: containerView is null.");
            return;
        }
        if (viewFindViewById2 == null) {
            Log.e("MediaGenInputViewPeer", "Invalid State: inputContainerView is null.");
            return;
        }
        if (editText == null) {
            Log.e("MediaGenInputViewPeer", "Invalid State: editText is null.");
            return;
        }
        if (imageButton == null) {
            Log.e("MediaGenInputViewPeer", "Invalid State: editButton is null.");
            return;
        }
        if (textView == null) {
            Log.e("MediaGenInputViewPeer", "Invalid State: disclaimerText is null.");
            return;
        }
        if (viewFindViewById4 == null) {
            Log.e("MediaGenInputViewPeer", "Invalid State: scrim is null.");
            return;
        }
        if (viewGroup == null) {
            Log.e("MediaGenInputViewPeer", "Invalid state: suggestion chips list is null.");
            return;
        }
        if (viewFindViewById3 == null) {
            Log.e("MediaGenInputViewPeer", "Invalid state: suggestion chips list scroll view is null.");
            return;
        }
        if (viewFindViewById5 == null) {
            Log.e("MediaGenInputViewPeer", "Invalid state: bottom padding view is null.");
            return;
        }
        imageButton.setEnabled(false);
        editText.addTextChangedListener(new gxv(this, 10));
        editText.setOnEditorActionListener(new jly(this, 2));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: upm
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Optional optionalEmpty;
                upo upoVar = this.a;
                TextView textView2 = upoVar.e;
                if (textView2 != null && textView2.getText() != null && textView2.getText().length() != 0) {
                    boolean z2 = z && !upoVar.i.get();
                    textView2.setVisibility(true != z2 ? 8 : 0);
                    if (z2) {
                        upoVar.i.set(true);
                        cc ccVar = upoVar.m;
                        if (ccVar != null) {
                            taf.k(ccVar, ayqVar.j(upo.a), new jco(14), new jco(15));
                        }
                    }
                }
                if (z) {
                    cc ccVar2 = upoVar.m;
                    if (ccVar2 instanceof bp) {
                        Window windowQ = upo.q((bp) ccVar2);
                        if (windowQ == null) {
                            Log.w("MediaGenInputViewPeer", "Invalid State: windows is null");
                            optionalEmpty = Optional.empty();
                        } else {
                            optionalEmpty = Optional.of(Integer.valueOf(windowQ.getAttributes().softInputMode));
                        }
                    } else if (ccVar2 == null || ccVar2.getActivity() == null) {
                        optionalEmpty = Optional.empty();
                    } else {
                        Window windowR = upo.r(ccVar2);
                        if (windowR == null) {
                            Log.w("MediaGenInputViewPeer", "Invalid State: windows is null");
                            optionalEmpty = Optional.empty();
                        } else {
                            optionalEmpty = Optional.of(Integer.valueOf(windowR.getAttributes().softInputMode));
                        }
                    }
                    upoVar.l = optionalEmpty;
                    if (Build.VERSION.SDK_INT < 31) {
                        upo.s(upoVar.m, 32);
                    } else {
                        upo.s(upoVar.m, 48);
                    }
                } else {
                    Optional optional = upoVar.l;
                    uhe uheVar = new uhe(upoVar, 17);
                    if (true == optional.isPresent()) {
                        upo.s(((upo) uheVar.a).m, ((Integer) optional.get()).intValue());
                    }
                    upoVar.l = Optional.empty();
                    if (upoVar.j) {
                        MediaGenInputView mediaGenInputView2 = mediaGenInputView;
                        upoVar.j = false;
                        mediaGenInputView2.setVisibility(8);
                    }
                }
                upoVar.n();
            }
        });
        viewFindViewById4.setOnClickListener(new uit(this, 11));
        imageButton.setOnClickListener(new uit(this, 12));
        if (aedaVar == null || !aedaVar.s() || adxjVar == null || imageButton == null) {
            return;
        }
        new ttk(mediaGenInputView.getContext());
        Drawable drawableD = adxjVar.d(mediaGenInputView.getContext(), arqz.eu);
        if (drawableD != null) {
            imageButton.setImageDrawable(ttk.b(drawableD, tzk.n(mediaGenInputView.getContext(), R.attr.ytBaseBackground).orElse(0)));
        }
    }

    public static boolean o(CharSequence charSequence) {
        return charSequence.toString().trim().length() > 0;
    }

    public static final Window q(bp bpVar) {
        Window window;
        Dialog dialog = bpVar.f;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return null;
        }
        return window;
    }

    public static final Window r(cc ccVar) {
        Window window;
        cf activity = ccVar.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window;
    }

    public static final void s(cc ccVar, int i) {
        if (ccVar instanceof bp) {
            Window windowQ = q((bp) ccVar);
            if (windowQ == null) {
                Log.w("MediaGenInputViewPeer", "Invalid State: windows is null");
                return;
            } else {
                windowQ.setSoftInputMode(i);
                return;
            }
        }
        if (ccVar == null || ccVar.getActivity() == null) {
            return;
        }
        Window windowR = r(ccVar);
        if (windowR == null) {
            Log.w("MediaGenInputViewPeer", "Invalid State: windows is null");
        } else {
            windowR.setSoftInputMode(i);
        }
    }

    private final void u(Consumer consumer) {
        roq roqVar = this.o;
        if (roqVar != null) {
            consumer.r(roqVar.k(xhb.b(293232)));
        }
    }

    public final void a() {
        if (this.m == null) {
            Log.e("MediaGenInputViewPeer", "Invalid State: fragment is null");
            return;
        }
        b();
        EditText editText = this.c;
        editText.clearFocus();
        cc ccVar = this.m;
        ccVar.getClass();
        cf activity = ccVar.getActivity();
        if (activity == null || editText == null) {
            return;
        }
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public final void b() {
        this.u.setVisibility(8);
        Consumer consumer = this.n;
        if (consumer != null) {
            consumer.r(Boolean.FALSE);
        }
        if (this.z.l(68, 45753397L, false)) {
            if (this.o != null && this.f.getVisibility() != 8) {
                Iterable$EL.forEach(this.t, new tsd(this, 18));
            }
            this.f.setVisibility(8);
        }
        if (this.k) {
            l(true);
        }
    }

    public final void c(boolean z) {
        int i = true != z ? 8 : 0;
        ImageButton imageButton = this.d;
        if (imageButton.getVisibility() != i) {
            u(z ? new ulo(4) : new ulo(2));
        }
        imageButton.setVisibility(i);
    }

    public final void d() {
        if (this.c.isFocused()) {
            this.u.setVisibility(0);
            Consumer consumer = this.n;
            if (consumer != null) {
                consumer.r(Boolean.TRUE);
            }
            if (this.z.l(68, 45753397L, false) && this.s.getChildCount() > 0) {
                if (this.o != null && this.f.getVisibility() != 0) {
                    Iterable$EL.forEach(this.t, new tsd(this, 16));
                }
                this.f.setVisibility(0);
            }
            if (this.k) {
                l(false);
            }
        }
    }

    public final void e() {
        MediaGenInputView mediaGenInputView = this.b;
        cc ccVarH = dd.h(mediaGenInputView);
        if (ccVarH == null) {
            throw new IllegalStateException(a.bV(mediaGenInputView, "View ", " does not have a Fragment set"));
        }
        this.m = ccVarH;
        if (ccVarH == null) {
            Log.e("MediaGenInputViewPeer", "Fragment is null.");
            return;
        }
        cf activity = ccVarH.getActivity();
        View rootView = mediaGenInputView.getRootView();
        if (rootView == null || activity == null) {
            Log.e("MediaGenInputViewPeer", "Missing either root view or activity. Invalid State");
            return;
        }
        cc ccVar = this.m;
        ccVar.getClass();
        taf.k(ccVar, this.A.i(), new jco(13), new uny(this, 5));
        if (Build.VERSION.SDK_INT >= 31) {
            aeyo aeyoVar = new aeyo(this, activity, 1);
            int i = bac.a;
            azs.c(rootView, aeyoVar);
        } else {
            if (this.y.isPresent()) {
                return;
            }
            cc ccVar2 = this.m;
            ccVar2.getClass();
            this.y = Optional.of(new ujn(ccVar2, rootView, new qcb(this)));
        }
    }

    public final void f(boolean z) {
        this.j = z;
        EditText editText = this.c;
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    public final void g(alay alayVar) {
        this.e.setText(ackj.a(new ackh(this.b.getContext(), alayVar, new jdc(this, 8))));
    }

    public final void h(String str, boolean z) {
        this.c.setText(str);
        if (z) {
            f(false);
        }
    }

    public final void i(boolean z) {
        this.d.setEnabled(z);
        n();
    }

    public final void j(upn upnVar) {
        this.x = Optional.of(upnVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, xgn] */
    public final void k(apgz apgzVar) {
        upo upoVar;
        xgt xgtVarA;
        if (this.z.l(68, 45753397L, false)) {
            roq roqVar = this.o;
            ViewGroup viewGroup = this.s;
            viewGroup.removeAllViews();
            int i = 2;
            if (roqVar != null) {
                if (this.f.getVisibility() == 0) {
                    Iterable$EL.forEach(this.t, new tsd(roqVar, 15));
                }
                int size = apgzVar.b.size();
                ?? r3 = roqVar.a;
                agke agkeVar = (r3 == 0 || (xgtVarA = r3.a()) == null) ? agpi.a : (agke) IntStream.CC.range(0, size).mapToObj(new rcr(xgtVarA, i)).collect(aghu.a);
                this.t = agkeVar;
                Iterable$EL.forEach(agkeVar, new rew(this, roqVar, 11));
            } else {
                this.t = agpi.a;
            }
            int size2 = this.t.size();
            int size3 = apgzVar.b.size();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            int i2 = 0;
            while (i2 < apgzVar.b.size()) {
                apgy apgyVar = (apgy) apgzVar.b.get(i2);
                xgz xgzVar = size2 == size3 ? (xgz) this.t.get(i2) : null;
                View viewInflate = layoutInflaterFrom.inflate(R.layout.media_gen_editor_suggestion_chip, viewGroup, false);
                TextView textView = (TextView) viewInflate.findViewById(R.id.ai_image_edit_suggestion_chip_text);
                alay alayVar = apgyVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                textView.setText(ackj.k(null, alayVar, null, false));
                if ((apgyVar.b & 2) != 0) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.ai_image_edit_suggestion_chip_image);
                    this.w.g(appCompatImageView, Uri.parse(apgyVar.f));
                    appCompatImageView.setVisibility(0);
                }
                int i3 = apgyVar.c;
                if (i3 == 3) {
                    upoVar = this;
                    viewInflate.setOnClickListener(new upl(upoVar, apgyVar, roqVar, xgzVar, 0));
                } else {
                    upoVar = this;
                    if (i3 == 4) {
                        viewInflate.setOnClickListener(new upl(upoVar, apgyVar, roqVar, xgzVar, 2));
                    }
                }
                viewGroup.addView(viewInflate);
                i2++;
                this = upoVar;
            }
        }
    }

    public final void l(boolean z) {
        this.v.setVisibility(true != z ? 8 : 0);
        this.q.setClickable(!z);
        this.c.setBackgroundResource(z ? R.drawable.media_gen_editor_text_input_border_for_fullscreen_editor : R.drawable.media_gen_editor_text_input_border);
        this.r.setBackgroundColor(z ? 0 : tzk.i(this.b.getContext(), R.attr.ytBrandBackgroundSolid));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, upn] */
    public final void m(Optional optional) {
        String string = this.c.getText().toString();
        a();
        Optional optional2 = this.x;
        sda sdaVar = new sda(optional, string, 7);
        if (true == optional2.isPresent()) {
            ?? r0 = optional2.get();
            Object obj = sdaVar.a;
            Object objTrim = sdaVar.b;
            Optional optional3 = (Optional) obj;
            if (!optional3.isPresent()) {
                objTrim = ((String) objTrim).trim();
            }
            r0.a((String) objTrim, optional3);
        }
        if (optional.isEmpty()) {
            u(new ulo(3));
        }
    }

    public final void n() {
        if (p()) {
            ImageButton imageButton = this.d;
            boolean z = imageButton.getVisibility() == 0;
            boolean z2 = this.c.hasFocus() || imageButton.isEnabled();
            if (z != z2) {
                imageButton.setVisibility(true != z2 ? 8 : 0);
                u(z2 ? new ulo(4) : new ulo(2));
            }
        }
    }

    public final boolean p() {
        return this.z.l(68, 45753397L, false);
    }

    public final void t(roq roqVar) {
        this.o = roqVar;
        u(new tsd(this, 17));
    }
}
