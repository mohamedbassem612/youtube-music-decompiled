package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.videoeffects.stickers.interactivestickers.promptsticker.PromptStickerThemeChip;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vjq extends vjh implements vjn {
    public static final String h;
    private Button A;
    private TextView B;
    private EditText C;
    private View D;
    private View E;
    private View F;
    private final boolean G;
    public final LayoutInflater i;
    public final Executor j;
    public final vxe k;
    public final vis l;
    public final boolean m;
    public vjy n;
    public View o;
    public ViewGroup p;
    public ViewGroup q;
    public EditText r;
    public augy s;
    public xgn t;
    public View u;
    public boolean v;
    private final Map w;
    private final int x;
    private final int y;
    private agke z;

    static {
        ahbo.c(R.layout.prompt_sticker_themes_picker_page);
        h = "vjq";
    }

    public vjq(cf cfVar, aaok aaokVar, xpl xplVar, vjf vjfVar, zf zfVar, zf zfVar2, Executor executor, vxe vxeVar, Map map, Optional optional) {
        super(cfVar, xplVar, zfVar2, optional, vjfVar);
        this.s = augy.a;
        this.v = false;
        Optional.empty();
        this.i = cfVar.getLayoutInflater();
        this.j = executor;
        this.k = vxeVar;
        this.w = map;
        boolean zL = ((vxz) aaokVar.b).l(266, 45650459L, false);
        this.m = zL;
        this.l = zL ? zfVar.H(vjt.b, false) : zfVar.H(vjr.b, false);
        this.G = ((vxz) xplVar.b).m(7, 45713182L);
        this.y = cfVar.getResources().getInteger(R.integer.sticker_style_1_max_length);
        this.x = cfVar.getResources().getInteger(R.integer.sticker_style_1_max_lines);
    }

    static int k(vjb vjbVar) {
        return vjbVar instanceof PromptStickerThemeChip ? ((PromptStickerThemeChip) vjbVar).e : ((viy) vjbVar).a.a;
    }

    public static void n(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    private static aimw r(View view) {
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        if (backgroundTintList != null) {
            return ujq.c(backgroundTintList.getDefaultColor());
        }
        Log.e(h, "getBackgroundTintFromView() - view missing backgroundTintList");
        return aimw.a;
    }

    @Override // defpackage.vje
    public final vis b() {
        return this.l;
    }

    @Override // defpackage.vje
    public final void c(vjb vjbVar) {
        Drawable textCursorDrawable;
        boolean z = vjbVar instanceof PromptStickerThemeChip;
        if (z || (vjbVar instanceof viy)) {
            EditText editText = this.r;
            if (editText != null) {
                editText.setTextColor(z ? ((PromptStickerThemeChip) vjbVar).b : ((viy) vjbVar).a.d);
                this.r.setHintTextColor(z ? ((PromptStickerThemeChip) vjbVar).c : ((viy) vjbVar).a.g);
                if (Build.VERSION.SDK_INT >= 29 && (textCursorDrawable = this.r.getTextCursorDrawable()) != null) {
                    textCursorDrawable.setTint(z ? ((PromptStickerThemeChip) vjbVar).d : ((viy) vjbVar).a.h);
                    if (this.r.isCursorVisible()) {
                        this.r.setCursorVisible(false);
                        this.r.setCursorVisible(true);
                    }
                }
            }
            Button button = this.A;
            if (button != null) {
                button.setTextColor(z ? ((PromptStickerThemeChip) vjbVar).h : ((viy) vjbVar).a.e);
                this.A.setBackgroundTintList(ColorStateList.valueOf(z ? ((PromptStickerThemeChip) vjbVar).i : ((viy) vjbVar).a.b));
            }
            View view = this.D;
            if (view != null) {
                view.setBackgroundTintList(ColorStateList.valueOf(z ? ((PromptStickerThemeChip) vjbVar).f : ((viy) vjbVar).a.f));
            }
            View view2 = this.E;
            if (view2 != null) {
                view2.setBackgroundTintList(ColorStateList.valueOf(z ? ((PromptStickerThemeChip) vjbVar).g : ((viy) vjbVar).a.c));
            }
            if (this.z != null) {
                Iterable$EL.forEach(this.z, new usf(ColorStateList.valueOf(k(vjbVar)), 17));
            }
        }
    }

    @Override // defpackage.vjn
    public final void d(View view, ufs ufsVar, xgn xgnVar, View view2) {
        this.t = xgnVar;
        this.F = null;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.post_filter_location_prompt_sticker_button_stub);
        if (viewStub != null) {
            this.F = viewStub.inflate();
        }
        View view3 = this.F;
        if (view3 != null) {
            view3.setOnClickListener(new vhv(this, 6));
            this.F.setVisibility(0);
        }
        vjy vjyVar = (vjy) this.w.get(ufsVar);
        vjyVar.getClass();
        this.n = vjyVar;
        this.u = view2;
        View viewInflate = this.i.inflate(true != this.m ? R.layout.prompt_sticker_container_view_old : R.layout.prompt_sticker_container_view, (ViewGroup) null);
        this.o = viewInflate;
        if (viewInflate != null) {
            viewInflate.setOnClickListener(new iks(8));
            this.p = (ViewGroup) this.o.findViewById(R.id.prompt_sticker_target_location);
            this.q = (ViewGroup) this.o.findViewById(R.id.prompt_sticker_view);
            this.C = (EditText) this.o.findViewById(R.id.line_count_prompt_sticker_edit_text);
            EditText editText = (EditText) this.o.findViewById(R.id.prompt_sticker_edit_text);
            this.r = editText;
            editText.addTextChangedListener(new vjz(this.C, editText, h, this.x));
            this.r.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.y)});
            this.B = (TextView) this.o.findViewById(R.id.prompt_sticker_description_text);
            this.z = agke.r(this.o.findViewById(R.id.prompt_sticker_rectangle_container), this.o.findViewById(R.id.prompt_sticker_top_half_circle));
            this.A = (Button) this.o.findViewById(R.id.prompt_sticker_response_button);
            this.D = this.o.findViewById(R.id.prompt_sticker_icon);
            this.E = this.o.findViewById(R.id.prompt_sticker_icon_container);
            l(Optional.empty());
        }
    }

    @Override // defpackage.vjk
    public final View i() {
        ViewGroup viewGroup = this.q;
        if (viewGroup == null) {
            Log.e(h, "Unable to get the sticker view");
            return null;
        }
        n(viewGroup);
        return this.q;
    }

    @Override // defpackage.vjk
    public final augy j() {
        if (this.r == null) {
            Log.e(h, "updateStickerData() - promptEditText should not be null");
        } else if (Objects.equals(this.s, augy.a)) {
            Log.e(h, "updateStickerData() - graphicalSegmentEvent should not be empty");
        } else {
            EditText editText = this.r;
            editText.getClass();
            String string = editText.getText().toString();
            augy augyVar = this.s;
            aihf builder = (augyVar.c == 102 ? (augt) augyVar.d : augt.a).toBuilder();
            builder.copyOnWrite();
            augt augtVar = (augt) builder.instance;
            string.getClass();
            augtVar.b |= 1;
            augtVar.c = string;
            aihf aihfVarCreateBuilder = auav.a.createBuilder();
            EditText editText2 = this.r;
            if (editText2 != null) {
                aimw aimwVarC = ujq.c(editText2.getCurrentTextColor());
                aihfVarCreateBuilder.copyOnWrite();
                auav auavVar = (auav) aihfVarCreateBuilder.instance;
                aimwVarC.getClass();
                auavVar.c = aimwVarC;
                auavVar.b |= 1;
            }
            agke agkeVar = this.z;
            if (agkeVar != null && !agkeVar.isEmpty()) {
                aimw aimwVarR = r((View) this.z.get(0));
                aihfVarCreateBuilder.copyOnWrite();
                auav auavVar2 = (auav) aihfVarCreateBuilder.instance;
                aimwVarR.getClass();
                auavVar2.d = aimwVarR;
                auavVar2.b |= 2;
            }
            Button button = this.A;
            if (button != null) {
                aimw aimwVarC2 = ujq.c(button.getCurrentTextColor());
                aihfVarCreateBuilder.copyOnWrite();
                auav auavVar3 = (auav) aihfVarCreateBuilder.instance;
                aimwVarC2.getClass();
                auavVar3.e = aimwVarC2;
                auavVar3.b |= 4;
                aimw aimwVarR2 = r(this.A);
                aihfVarCreateBuilder.copyOnWrite();
                auav auavVar4 = (auav) aihfVarCreateBuilder.instance;
                aimwVarR2.getClass();
                auavVar4.f = aimwVarR2;
                auavVar4.b |= 8;
            }
            auav auavVar5 = (auav) aihfVarCreateBuilder.build();
            builder.copyOnWrite();
            augt augtVar2 = (augt) builder.instance;
            auavVar5.getClass();
            augtVar2.d = auavVar5;
            augtVar2.b |= 2;
            augt augtVar3 = (augt) builder.build();
            agke agkeVar2 = (agke) Collection.EL.stream(this.s.p).map(new uot(string, 15)).collect(aghu.a);
            jrr jrrVar = (jrr) this.s.toBuilder();
            jrrVar.copyOnWrite();
            augy augyVar2 = (augy) jrrVar.instance;
            augtVar3.getClass();
            augyVar2.d = augtVar3;
            augyVar2.c = 102;
            jrrVar.copyOnWrite();
            ((augy) jrrVar.instance).p = augy.emptyProtobufList();
            jrrVar.copyOnWrite();
            augy augyVar3 = (augy) jrrVar.instance;
            augyVar3.b();
            aifs.addAll(agkeVar2, augyVar3.p);
            this.s = (augy) jrrVar.build();
        }
        return this.s;
    }

    @Override // defpackage.vjj, defpackage.vio
    @Deprecated
    public final void jb(uxi uxiVar) {
        Log.e(h, "Unexpected call to onStickerClick " + uxiVar.a());
    }

    public final void l(Optional optional) {
        aihf aihfVarCreateBuilder = augt.a.createBuilder();
        optional.isPresent();
        ameh amehVar = (ameh) optional.orElse(null);
        if (amehVar != null && (amehVar.c & 8) != 0) {
            alay alayVar = amehVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            augt augtVar = (augt) aihfVarCreateBuilder.instance;
            alayVar.getClass();
            augtVar.f = alayVar;
            augtVar.b |= 8;
        }
        if (this.G) {
            optional.isPresent();
        }
        jrr jrrVar = (jrr) augy.a.createBuilder();
        jrrVar.copyOnWrite();
        augy augyVar = (augy) jrrVar.instance;
        augt augtVar2 = (augt) aihfVarCreateBuilder.build();
        augtVar2.getClass();
        augyVar.d = augtVar2;
        augyVar.c = 102;
        aihf aihfVarCreateBuilder2 = auhh.a.createBuilder();
        auhe auheVar = auhe.a;
        aihfVarCreateBuilder2.copyOnWrite();
        auhh auhhVar = (auhh) aihfVarCreateBuilder2.instance;
        auheVar.getClass();
        auhhVar.d = auheVar;
        auhhVar.c = 5;
        aihf aihfVarCreateBuilder3 = auhf.a.createBuilder();
        aimy aimyVarFL = yno.fL(new Matrix());
        aihfVarCreateBuilder3.copyOnWrite();
        auhf auhfVar = (auhf) aihfVarCreateBuilder3.instance;
        aimyVarFL.getClass();
        auhfVar.c = aimyVarFL;
        auhfVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        auhh auhhVar2 = (auhh) aihfVarCreateBuilder2.instance;
        auhf auhfVar2 = (auhf) aihfVarCreateBuilder3.build();
        auhfVar2.getClass();
        auhhVar2.a();
        auhhVar2.f.add(auhfVar2);
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        auhh auhhVar3 = (auhh) aihfVarCreateBuilder2.build();
        auhhVar3.getClass();
        augyVar2.b();
        augyVar2.p.add(auhhVar3);
        augy augyVar3 = (augy) jrrVar.build();
        this.s = augyVar3;
        o(this.q, augyVar3);
    }

    public final void m() {
        EditText editText = this.r;
        if (editText != null) {
            String strTrim = editText.getText().toString().trim();
            if (strTrim.isEmpty()) {
                strTrim = this.i.getContext().getString(R.string.prompt_sticker_input_text_hint);
            }
            this.r.setText(strTrim);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r0.j.n(r3.d) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.view.View r5, defpackage.augy r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjq.o(android.view.View, augy):void");
    }

    @Deprecated
    public final void q() {
        View view;
        ViewGroup viewGroup;
        vjf vjfVar = this.b;
        Optional optionalEmpty = Optional.empty();
        if (vjfVar.i != null && vjfVar.g != null) {
            View view2 = vjfVar.f;
            if (view2 != null) {
                tym.h(view2, new tyl(-1, 1), ViewGroup.LayoutParams.class);
            }
            ujp ujpVar = vjfVar.d;
            ujpVar.c(vjfVar.g, true);
            ujpVar.b();
            vjfVar.n = optionalEmpty;
            vjfVar.m = this;
            ViewGroup viewGroup2 = this.p;
            if (viewGroup2 == null) {
                view = null;
            } else {
                if (viewGroup2.findViewById(R.id.prompt_sticker_view) == null && (viewGroup = this.q) != null) {
                    n(viewGroup);
                    this.p.removeAllViews();
                    this.p.addView(this.q);
                }
                view = this.o;
            }
            if (view != null) {
                if (vjfVar.h != null && vjfVar.q.m()) {
                    Optional optionalOfNullable = Optional.ofNullable(null);
                    if (true == optionalOfNullable.isPresent()) {
                        ((vjm) optionalOfNullable.get()).a();
                        optionalOfNullable = Optional.ofNullable(Boolean.TRUE);
                    }
                    if (((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue()) {
                        View view3 = vjfVar.h;
                        view3.getClass();
                        view3.setVisibility(0);
                    }
                }
                vjfVar.i.removeAllViews();
                vjfVar.i.addView(view);
                RecyclerView recyclerView = vjfVar.k;
                if (recyclerView != null) {
                    boolean zA = this.l.A();
                    recyclerView.setOverScrollMode(true != zA ? 0 : 2);
                    ViewGroup.LayoutParams layoutParams = vjfVar.k.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = true == zA ? -2 : -1;
                    }
                    RecyclerView recyclerView2 = vjfVar.k;
                    ViewGroup.LayoutParams layoutParams2 = recyclerView2.getLayoutParams();
                    if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                        layoutParams3.alignWithParent = true;
                        layoutParams3.removeRule(3);
                        layoutParams3.addRule(12);
                        recyclerView2.setLayoutParams(layoutParams3);
                    } else {
                        ((agrc) ((agrc) vjf.a.b()).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/interactivestickers/InteractiveStickerEditLayerControllerImpl", "setThemePickerPosition", 276, "InteractiveStickerEditLayerControllerImpl.java")).t("Theme picker layout param is not wrapped in a relative layout");
                    }
                    vjfVar.l = new vjc(this, vjfVar.k);
                    vjfVar.l.a();
                }
                ViewGroup viewGroup3 = vjfVar.j;
                if (viewGroup3 != null) {
                    viewGroup3.removeAllViews();
                    vjfVar.j.setVisibility(8);
                }
                EditText editText = this.r;
                if (editText != null) {
                    e(editText);
                }
                vjfVar.g.setVisibility(0);
                vjfVar.c.kk(Boolean.TRUE);
                vjfVar.o = 183215;
                roq roqVar = vjfVar.p;
                ugo ugoVar = new ugo(roqVar, xhb.a(183215));
                ugoVar.a = roq.i(vjfVar.e, ajwo.a, 179247);
                ugoVar.b();
                ugo ugoVarK = roqVar.k(xhb.b(183102));
                ugoVarK.h(true);
                ugoVarK.c();
            }
        }
        EditText editText2 = this.r;
        if (editText2 != null) {
            e(editText2);
        }
    }
}
