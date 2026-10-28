package defpackage;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.AppCompatImageButton;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.youtube.creation.editor.image.mediagen.MediaGenInputView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class upg extends uph {
    public final uoq a;
    public final upv b;
    public final upj c;
    public final Executor e;
    public final ahex f;
    public final aeda g;
    public final zvl h;
    public final Uri i;
    public ViewTreeObserver.OnGlobalLayoutListener k;
    uoo l;
    public MenuItem m;
    public uoi n;
    public final roq p;
    public final qcb q;
    final aaok r;
    private final adhv t;
    private final adxj u;
    private final vxe v;
    private final RenderEffect w;
    private final acwq x;
    public uoa o = null;
    public upd j = null;
    public final uon d = new uon();

    public upg(uoq uoqVar, upv upvVar, aaok aaokVar, adxj adxjVar, aeda aedaVar, Executor executor, qcb qcbVar, ahex ahexVar, upj upjVar, adhv adhvVar, zvl zvlVar, vxe vxeVar, acwq acwqVar, roq roqVar) {
        this.a = uoqVar;
        this.r = aaokVar;
        this.b = upvVar;
        this.c = upjVar;
        this.t = adhvVar;
        this.e = executor;
        this.f = ahexVar;
        this.u = adxjVar;
        this.g = aedaVar;
        this.h = zvlVar;
        this.q = qcbVar;
        this.i = Uri.parse(upvVar.e);
        this.v = vxeVar;
        this.x = acwqVar;
        this.p = roqVar;
        this.w = Build.VERSION.SDK_INT >= 31 ? RenderEffect.createBlurEffect(75.0f, 75.0f, Shader.TileMode.CLAMP) : null;
    }

    public static final Optional s(alps alpsVar) {
        apji apjiVar = alpsVar.f;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVar = aoxv.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        apji apjiVar2 = alpsVar.f;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        aoxv aoxvVar = (aoxv) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (!(aoxvVar.c == 1 ? (aoxu) aoxvVar.d : aoxu.a).c.isEmpty()) {
            akgn akgnVar = (akgn) (aoxvVar.c == 1 ? (aoxu) aoxvVar.d : aoxu.a).c.get(0);
            if ((akgnVar.b == 2 ? (akhb) akgnVar.c : akhb.a).b == 2) {
                akgn akgnVar2 = (akgn) (aoxvVar.c == 1 ? (aoxu) aoxvVar.d : aoxu.a).c.get(0);
                return Optional.of(akgnVar2.b == 2 ? (akhb) akgnVar2.c : akhb.a);
            }
        }
        return Optional.empty();
    }

    private final ViewGroup t() {
        View view = this.a.getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.ai_image_edit_progress_container);
        }
        return null;
    }

    private final alay u(int i) {
        return ackj.d(this.a.getString(i));
    }

    public final Drawable a(arqz arqzVar, int i) {
        uoq uoqVar = this.a;
        new ttk(uoqVar.getContext());
        int iOrElse = tzk.n(uoqVar.getContext(), i).orElse(0);
        Drawable drawableD = this.u.d(uoqVar.getContext(), arqzVar);
        if (drawableD != null) {
            return ttk.b(drawableD, iOrElse);
        }
        return null;
    }

    public final AppCompatImageButton b() {
        View view = this.a.getView();
        view.getClass();
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(R.id.ai_image_edit_redo_button);
        appCompatImageButton.getClass();
        return appCompatImageButton;
    }

    public final AppCompatImageButton c() {
        View view = this.a.getView();
        view.getClass();
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(R.id.ai_image_edit_undo_button);
        appCompatImageButton.getClass();
        return appCompatImageButton;
    }

    public final ImageView d() {
        View view = this.a.getView();
        if (view != null) {
            return (ImageView) view.findViewById(R.id.ai_image_edit_image);
        }
        return null;
    }

    public final TextView e(View view) {
        return (TextView) view.requireViewById((this.b.b & SemanticState.Focused) != 0 ? R.id.ai_image_edit_quality_disclaimer_bottom_aligned : R.id.ai_image_edit_quality_disclaimer);
    }

    public final ugo f() {
        upv upvVar = this.b;
        return new ugo(this.p, xhb.a((upvVar.b & 2) != 0 ? upvVar.d : 298157));
    }

    public final void g() {
        upd updVar = this.j;
        if (updVar != null) {
            updVar.a.set(true);
            updVar.b.cancel(false);
            this.j = null;
        }
    }

    public final void h(String str) {
        i(new uoh(str), false);
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void i(final uoi uoiVar, boolean z) {
        agke agkeVarG;
        ListenableFuture listenableFutureE;
        ListenableFuture listenableFutureAs;
        if (this.n == null) {
            this.n = uoiVar;
        }
        ViewGroup viewGroupT = t();
        viewGroupT.getClass();
        ((TextView) viewGroupT.findViewById(R.id.ai_image_edit_progress_text)).setText(ackj.k(null, uoiVar.a(), null, false));
        g();
        p(true);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        uon uonVar = this.d;
        Optional optionalOfNullable = z ? Optional.ofNullable(uonVar.a()) : uonVar.b();
        int i = 4;
        if (optionalOfNullable.isPresent()) {
            uon uonVar2 = this.d;
            agjz agjzVar = new agjz(4);
            for (int iMax = Math.max(0, uonVar2.b - 4); iMax <= uonVar2.b; iMax++) {
                String strB = ((uom) ((ArrayList) ((aami) uonVar2.a.get(iMax)).b).get(0)).a.b();
                if (strB != null) {
                    agjzVar.h(strB);
                }
            }
            agkeVarG = agjzVar.g();
        } else {
            agkeVarG = agpi.a;
        }
        Optional optionalOfNullable2 = Optional.ofNullable(d());
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = Optional.ofNullable(((ImageView) optionalOfNullable2.get()).getDrawable());
        }
        if (optionalOfNullable2.isEmpty()) {
            listenableFutureAs = ahng.m(new IllegalStateException("Image view drawable not ready"));
        } else {
            upf upfVar = new upf();
            uoq uoqVar = this.a;
            afxw.y(upfVar, uoqVar);
            if (optionalOfNullable.isPresent()) {
                Optional optionalS = s(((uom) optionalOfNullable.get()).d.a);
                if (optionalS.isEmpty()) {
                    listenableFutureAs = ahng.m(new IllegalStateException("Unable to find the image assets"));
                } else {
                    alcu alcuVar = ((akhb) optionalS.get()).d;
                    if (alcuVar == null) {
                        alcuVar = alcu.a;
                    }
                    alct alctVar = alcuVar.b;
                    if (alctVar == null) {
                        alctVar = alct.a;
                    }
                    if ((alctVar.b & 1) != 0) {
                        alcu alcuVar2 = ((akhb) optionalS.get()).d;
                        if (alcuVar2 == null) {
                            alcuVar2 = alcu.a;
                        }
                        alct alctVar2 = alcuVar2.b;
                        if (alctVar2 == null) {
                            alctVar2 = alct.a;
                        }
                        aaok aaokVar = this.r;
                        upv upvVar = this.b;
                        String str = alctVar2.c;
                        apgr apgrVar = upvVar.k;
                        if (apgrVar == null) {
                            apgrVar = apgr.a;
                        }
                        listenableFutureAs = aaokVar.w(uoiVar, agkeVarG, str, apgrVar.c, (upvVar.b & 8) != 0 ? upvVar.f : null);
                    } else {
                        listenableFutureAs = ahng.m(new IllegalStateException("Unable to get the external post id"));
                    }
                }
            } else {
                final agke agkeVar = agkeVarG;
                String string = this.i.toString();
                int intrinsicWidth = ((Drawable) optionalOfNullable2.get()).getIntrinsicWidth();
                int intrinsicHeight = ((Drawable) optionalOfNullable2.get()).getIntrinsicHeight();
                final aaok aaokVar2 = this.r;
                upv upvVar2 = this.b;
                apgr apgrVar2 = upvVar2.k;
                if (apgrVar2 == null) {
                    apgrVar2 = apgr.a;
                }
                final String str2 = apgrVar2.c;
                String str3 = (upvVar2.b & 8) != 0 ? upvVar2.f : null;
                agkeVar.getClass();
                string.getClass();
                str2.getClass();
                Object obj = aaokVar2.a;
                aihf aihfVarCreateBuilder = asdk.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                asdk asdkVar = (asdk) aihfVarCreateBuilder.instance;
                asdkVar.c = 1;
                asdkVar.d = string;
                aihfVarCreateBuilder.copyOnWrite();
                asdk asdkVar2 = (asdk) aihfVarCreateBuilder.instance;
                asdkVar2.b |= 2;
                asdkVar2.f = intrinsicWidth;
                aihfVarCreateBuilder.copyOnWrite();
                asdk asdkVar3 = (asdk) aihfVarCreateBuilder.instance;
                asdkVar3.b |= 4;
                asdkVar3.g = intrinsicHeight;
                float f = asdkVar3.f;
                aihfVarCreateBuilder.copyOnWrite();
                asdk asdkVar4 = (asdk) aihfVarCreateBuilder.instance;
                asdkVar4.b |= 8;
                asdkVar4.h = f / intrinsicHeight;
                aihfVarCreateBuilder.copyOnWrite();
                asdk asdkVar5 = (asdk) aihfVarCreateBuilder.instance;
                asdkVar5.b |= 1;
                asdkVar5.e = "reference_to_image";
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                asdk asdkVar6 = (asdk) aihnVarBuild;
                vcl vclVarI = ((afzc) obj).i();
                if (vclVarI != null) {
                    listenableFutureE = vclVarI.e(asdkVar6);
                } else {
                    asdl asdlVar = asdl.a;
                    listenableFutureE = ((BaseClient) obj).e(-120201251, asdkVar6, aihn.getParserForClass(asdl.class));
                }
                qmu qmuVar = new qmu(new rla(aaokVar2, 7), 20);
                ?? r10 = aaokVar2.d;
                final String str4 = str3;
                listenableFutureAs = ahno.as(ahno.as(listenableFutureE, qmuVar, r10), new qmu(new awqg() { // from class: uol
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        uok uokVar = (uok) obj2;
                        uokVar.getClass();
                        String str5 = uokVar.a;
                        return aaokVar2.w(uoiVar, agkeVar, str5, str2, str4);
                    }
                }, 19), r10);
            }
            taf.k(uoqVar, listenableFutureAs, new uny(this, 3), new uny(this, i));
        }
        upd updVar = new upd(atomicBoolean, listenableFutureAs);
        this.j = updVar;
        Button button = (Button) viewGroupT.findViewById(R.id.ai_image_edit_progress_cancel_button);
        button.getClass();
        m(293229);
        button.setOnClickListener(new ivx((Object) this, (Object) updVar, (Object) button, 12, (char[]) null));
        taf.k(this.a, updVar.b, new svm(this, updVar, 12), new uor(this, updVar, uoiVar, z, 0));
    }

    public final void j() {
        uon uonVar = this.d;
        if (!uonVar.d() && !uonVar.c()) {
            n();
            return;
        }
        jcg jcgVar = new jcg(this, 2);
        acwu acwuVarA = acwv.a();
        acwuVarA.b(true);
        acwuVarA.a = jcgVar;
        aihf aihfVarCreateBuilder = akdd.a.createBuilder();
        aihfVarCreateBuilder.aR(u(R.string.media_gen_discard_confirmation_dialog_message_body));
        ajng ajngVar = ajng.a;
        aihf aihfVarCreateBuilder2 = ajngVar.createBuilder();
        ajnf ajnfVar = ajnf.a;
        aihh aihhVar = (aihh) ajnfVar.createBuilder();
        alay alayVarU = u(R.string.media_gen_discard_confirmation_dialog_discard_button);
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alayVarU.getClass();
        ajnfVar2.m = alayVarU;
        ajnfVar2.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.d = 42;
        ajnfVar3.c = 1;
        aihfVarCreateBuilder2.copyOnWrite();
        ajng ajngVar2 = (ajng) aihfVarCreateBuilder2.instance;
        ajnf ajnfVar4 = (ajnf) aihhVar.build();
        ajnfVar4.getClass();
        ajngVar2.c = ajnfVar4;
        ajngVar2.b |= 1;
        ajng ajngVar3 = (ajng) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        akdd akddVar = (akdd) aihfVarCreateBuilder.instance;
        ajngVar3.getClass();
        akddVar.g = ajngVar3;
        akddVar.b |= 64;
        aihf aihfVarCreateBuilder3 = ajngVar.createBuilder();
        aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
        alay alayVarU2 = u(R.string.media_gen_discard_confirmation_dialog_cancel_button);
        aihhVar2.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
        alayVarU2.getClass();
        ajnfVar5.m = alayVarU2;
        ajnfVar5.b |= 64;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar6 = (ajnf) aihhVar2.instance;
        ajnfVar6.d = 43;
        ajnfVar6.c = 1;
        aihfVarCreateBuilder3.copyOnWrite();
        ajng ajngVar4 = (ajng) aihfVarCreateBuilder3.instance;
        ajnf ajnfVar7 = (ajnf) aihhVar2.build();
        ajnfVar7.getClass();
        ajngVar4.c = ajnfVar7;
        ajngVar4.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        akdd akddVar2 = (akdd) aihfVarCreateBuilder.instance;
        ajng ajngVar5 = (ajng) aihfVarCreateBuilder3.build();
        ajngVar5.getClass();
        akddVar2.h = ajngVar5;
        akddVar2.b |= SemanticState.Focused;
        acwuVarA.d((akdd) aihfVarCreateBuilder.build());
        this.x.d(acwuVarA.a());
    }

    public final void k(upd updVar, Throwable th, String str) {
        if (updVar.a.get()) {
            return;
        }
        this.e.execute(afwl.i(new ull(this, 4)));
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 70;
        zvjVarA.i = 278;
        zvjVarA.d(str);
        if (th != null) {
            zvjVarA.f(th);
        }
        this.h.a(zvjVarA.a());
    }

    public final void l(int i) {
        this.p.k(xhb.b(i)).d();
    }

    public final void m(int i) {
        ugo ugoVarK = this.p.k(xhb.b(i));
        ugoVarK.h(true);
        ugoVarK.c();
    }

    public final void n() {
        uoa uoaVar = this.o;
        if (uoaVar != null) {
            uns unsVar = uoaVar.a;
            if (unsVar.getChildFragmentManager().g("MediaGenImageEditorFragmentPeer") != null) {
                unsVar.getChildFragmentManager().ae(null, -1, 0);
                unsVar.requireView().findViewById(R.id.ai_editor_page).setVisibility(8);
                unsVar.requireView().findViewById(R.id.image_editor_page).setVisibility(0);
                MediaGenInputView mediaGenInputView = (MediaGenInputView) unsVar.requireView().findViewById(R.id.media_gen_image_editor);
                if (mediaGenInputView != null) {
                    mediaGenInputView.peer().e();
                    View rootView = mediaGenInputView.peer().b.getRootView();
                    if (rootView != null) {
                        int i = bac.a;
                        rootView.requestApplyInsets();
                    }
                    mediaGenInputView.peer().h("", false);
                }
            }
        }
    }

    public final void o(uoi uoiVar, uoj uojVar, upd updVar, Optional optional, boolean z) {
        aoxv aoxvVar;
        int i;
        String string;
        alps alpsVar = uojVar.a;
        apji apjiVar = alpsVar.f;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVar = aoxv.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = alpsVar.f;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            aoxvVar = (aoxv) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        } else {
            aoxvVar = null;
        }
        Optional optionalS = s(alpsVar);
        if (optionalS.isEmpty() || aoxvVar == null || aoxvVar.c == 2) {
            if (aoxvVar != null && (i = aoxvVar.c) == 2) {
                vxe vxeVar = this.v;
                ajwo ajwoVar = (i == 2 ? (aoxt) aoxvVar.d : aoxt.a).b;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
            }
            p(false);
            return;
        }
        uoo uooVar = this.l;
        uooVar.getClass();
        if (!uooVar.d(alpsVar)) {
            zvl zvlVar = this.h;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 70;
            zvjVarA.i = 278;
            zvjVarA.d("Invalid State: Feedback commands not available");
            zvlVar.a(zvjVarA.a());
        }
        if (optional.isPresent()) {
            string = tyu.a(((File) optional.get()).getAbsolutePath()).toString();
        } else {
            akhb akhbVar = (akhb) optionalS.get();
            string = akhbVar.b == 2 ? (String) akhbVar.c : "";
        }
        this.t.m(Uri.parse(string), new upc(this, updVar, optional, uoiVar, uojVar, z));
    }

    public final void p(boolean z) {
        RenderEffect renderEffect;
        ViewGroup viewGroupT = t();
        viewGroupT.getClass();
        viewGroupT.setVisibility(true != z ? 8 : 0);
        ImageView imageViewD = d();
        imageViewD.getClass();
        int i = Build.VERSION.SDK_INT;
        if (z) {
            if (i >= 31 && (renderEffect = this.w) != null) {
                imageViewD.setRenderEffect(renderEffect);
            }
        } else if (i >= 31) {
            imageViewD.setRenderEffect(null);
        }
        int i2 = true != z ? 0 : 8;
        uoq uoqVar = this.a;
        View view = uoqVar.getView();
        ViewGroup viewGroup = view != null ? (ViewGroup) view.findViewById(R.id.ai_image_edit_scrim) : null;
        viewGroup.getClass();
        viewGroup.setVisibility(true != z ? 8 : 0);
        boolean z2 = !z && this.d.d();
        if ((this.b.b & SemanticState.Focused) != 0) {
            uoqVar.requireView().requireViewById(R.id.ai_image_edit_retry_button).setVisibility(true != z2 ? 8 : 0);
        } else {
            View view2 = uoqVar.getView();
            MediaGenInputView mediaGenInputView = view2 != null ? (MediaGenInputView) view2.findViewById(R.id.ai_image_editor_text_layer) : null;
            mediaGenInputView.getClass();
            mediaGenInputView.setVisibility(i2);
        }
        View view3 = uoqVar.getView();
        View viewFindViewById = view3 != null ? view3.findViewById(R.id.ai_image_edit_bottom_controller_container) : null;
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(i2);
        MenuItem menuItem = this.m;
        if (menuItem != null) {
            if (z) {
                menuItem.setEnabled(false);
            } else {
                menuItem.setEnabled(this.d.b().isPresent());
            }
        }
        uoo uooVar = this.l;
        if (uooVar != null) {
            uooVar.a.setVisibility(true == z2 ? 0 : 8);
        }
        e(uoqVar.requireView()).setVisibility(true != z2 ? 4 : 0);
    }

    public final void q(String str, boolean z) {
        MediaGenInputView mediaGenInputView = (MediaGenInputView) this.a.requireView().findViewById(R.id.ai_image_editor_text_layer);
        mediaGenInputView.getClass();
        mediaGenInputView.peer().h(str, z);
    }

    public final void r() {
        uon uonVar = this.d;
        boolean zD = uonVar.d();
        AppCompatImageButton appCompatImageButtonC = c();
        appCompatImageButtonC.setEnabled(zD);
        aeda aedaVar = this.g;
        boolean zS = aedaVar.s();
        int i = R.attr.ytOverlayIconDisabled;
        if (zS) {
            appCompatImageButtonC.setImageDrawable(a(arqz.oj, true != zD ? R.attr.ytOverlayIconDisabled : R.attr.ytOverlayIconActiveOther));
        }
        boolean zC = uonVar.c();
        AppCompatImageButton appCompatImageButtonB = b();
        appCompatImageButtonB.setEnabled(zC);
        if (aedaVar.s()) {
            if (true == zC) {
                i = R.attr.ytOverlayIconActiveOther;
            }
            appCompatImageButtonB.setImageDrawable(a(arqz.la, i));
        }
    }
}
