package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class srd implements acwn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/comment/controller/CommentDialogController");
    private final abfv A;
    private final aczl B;
    public final Context b;
    public final vxe c;
    public final aeaq d;
    public DialogInterface.OnCancelListener e;
    public DialogInterface.OnCancelListener f;
    public stb g;
    public final tfq h;
    public final vxz i;
    public final aeiv j;
    public final taq k;
    private final Activity l;
    private final adhv m;
    private final aduv n;
    private final ttm o;
    private final tts p;
    private final aeaj q;
    private final wbz r;
    private final zwb s;
    private final aeda t;
    private avmn u;
    private Dialog v;
    private final vxu w;
    private final vxz x;
    private final tld y;
    private final abfv z;

    public srd(Activity activity, Context context, adhv adhvVar, vxe vxeVar, aduv aduvVar, ttm ttmVar, tfq tfqVar, tts ttsVar, taq taqVar, tld tldVar, aczl aczlVar, axlj axljVar, ahgb ahgbVar, aeaq aeaqVar, vxu vxuVar, wbz wbzVar, zwb zwbVar, aeiv aeivVar, abfv abfvVar, aeda aedaVar, vxz vxzVar, abfv abfvVar2, vxz vxzVar2) {
        activity.getClass();
        this.l = activity;
        context.getClass();
        this.b = context;
        this.m = adhvVar;
        vxeVar.getClass();
        this.c = vxeVar;
        this.n = aduvVar;
        ttmVar.getClass();
        this.o = ttmVar;
        this.h = tfqVar;
        this.p = ttsVar;
        this.k = taqVar;
        this.y = tldVar;
        this.B = aczlVar;
        this.w = vxuVar;
        wbzVar.getClass();
        this.r = wbzVar;
        this.s = zwbVar;
        aeivVar.getClass();
        this.j = aeivVar;
        this.z = abfvVar;
        this.t = aedaVar;
        this.x = vxzVar;
        this.A = abfvVar2;
        this.i = vxzVar2;
        aeaqVar.getClass();
        this.q = ahgbVar.b(new wyr(this, axljVar, 1));
        this.d = aeaqVar;
    }

    @Override // defpackage.acwn
    public final void a() {
        stb stbVar = this.g;
        if (stbVar != null) {
            stbVar.dismiss();
        }
        Dialog dialog = this.v;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final xgn b() {
        ComponentCallbacks2 componentCallbacks2 = this.l;
        if (componentCallbacks2 instanceof xgm) {
            return ((xgm) componentCallbacks2).hB();
        }
        return null;
    }

    public final ajnf c(ajnf ajnfVar, String str) {
        if (str.isEmpty()) {
            return ajnfVar;
        }
        aihf aihfVarCreateBuilder = appw.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        appw appwVar = (appw) aihfVarCreateBuilder.instance;
        str.getClass();
        appwVar.b |= 1;
        appwVar.c = str;
        appw appwVar2 = (appw) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) ajnfVar.toBuilder();
        ajwo ajwoVar = ajnfVar.q;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
        aihhVar2.e(appx.b, appwVar2);
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        ajwo ajwoVar2 = (ajwo) aihhVar2.build();
        ajwoVar2.getClass();
        ajnfVar2.q = ajwoVar2;
        ajnfVar2.b |= SemanticState.Modal;
        return (ajnf) aihhVar.build();
    }

    public final ajyj d(ajyj ajyjVar) {
        xgn xgnVarB = b();
        return xgnVarB != null ? e(ajyjVar, xgnVarB.i()) : ajyjVar;
    }

    public final ajyj e(ajyj ajyjVar, String str) {
        if (str.isEmpty()) {
            return ajyjVar;
        }
        ajng ajngVar = ajyjVar.f;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        aihf builder = ajngVar.toBuilder();
        ajng ajngVar2 = ajyjVar.f;
        if (ajngVar2 == null) {
            ajngVar2 = ajng.a;
        }
        ajnf ajnfVar = ajngVar2.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        ajnf ajnfVarC = c(ajnfVar, str);
        builder.copyOnWrite();
        ajng ajngVar3 = (ajng) builder.instance;
        ajnfVarC.getClass();
        ajngVar3.c = ajnfVarC;
        ajngVar3.b |= 1;
        ajng ajngVar4 = (ajng) builder.build();
        aihf builder2 = ajyjVar.toBuilder();
        builder2.copyOnWrite();
        ajyj ajyjVar2 = (ajyj) builder2.instance;
        ajngVar4.getClass();
        ajyjVar2.f = ajngVar4;
        ajyjVar2.b |= 32;
        return (ajyj) builder2.build();
    }

    public final void f(sre sreVar, stb stbVar) {
        ajwo ajwoVar;
        ajnf ajnfVar = sreVar.f;
        if (ajnfVar == null) {
            ajwoVar = null;
        } else {
            ajwoVar = ajnfVar.r;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        }
        if (ajwoVar == null) {
            tuk.n(this.b, R.string.error_video_attachment_failed, 1);
            stbVar.dismiss();
        } else {
            squ squVar = new squ();
            HashMap map = new HashMap();
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", squVar);
            this.c.c(ajwoVar, map);
        }
    }

    public final void g() {
        this.A.o(this, "");
    }

    public final void h() {
        this.d.f = new xbc(this, 1);
        this.A.m(this, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final void i(CharSequence charSequence, agev agevVar, int i, final sre sreVar, final stb stbVar, final Long l, boolean z, final boolean z2) {
        if (!stbVar.k()) {
            if (!z || stbVar.m()) {
                if (z2) {
                    this.d.z();
                    return;
                }
                return;
            }
            z = true;
        }
        final boolean z3 = z;
        abfv abfvVar = this.z;
        int i2 = R.string.comments_discard_negative_button;
        if (abfvVar != null && abfvVar.j()) {
            i2 = R.string.comments_discard_negative_button_sentence_case;
        }
        int i3 = i2;
        Context context = this.b;
        AlertDialog.Builder builderG = abfvVar != null ? abfvVar.g(context) : new AlertDialog.Builder(context);
        builderG.setMessage(charSequence).setNegativeButton(i3, new DialogInterface.OnClickListener() { // from class: sqv
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                dialogInterface.dismiss();
                this.a.j(sreVar, stbVar.a(), l, true, z3);
            }
        }).setPositiveButton(i, new DialogInterface.OnClickListener() { // from class: sqw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                dialogInterface.dismiss();
                if (z2) {
                    this.a.d.z();
                }
            }
        }).setCancelable(false);
        if (agevVar.g()) {
            builderG.setTitle((CharSequence) agevVar.c());
        }
        AlertDialog alertDialogCreate = builderG.create();
        this.v = alertDialogCreate;
        alertDialogCreate.setOnShowListener(new gxu(this, 5));
        alertDialogCreate.setOnDismissListener(new sqx(this, 0));
        alertDialogCreate.show();
        if (this.x.l(9, 45381188L, false)) {
            return;
        }
        Button button = (Button) alertDialogCreate.findViewById(android.R.id.button1);
        Context context2 = this.b;
        button.setTextColor(tzk.n(context2, R.attr.ytCallToAction).orElse(0));
        ((Button) alertDialogCreate.findViewById(android.R.id.button2)).setTextColor(tzk.n(context2, R.attr.ytCallToAction).orElse(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [avmn, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(final sre sreVar, CharSequence charSequence, final Long l, final boolean z, final boolean z2) {
        boolean z3;
        int i;
        boolean z4;
        Object obj;
        final sre sreVar2;
        int i2;
        ?? r9;
        final boolean z5;
        if (!z && !this.h.h()) {
            this.p.a();
            return;
        }
        vxu vxuVar = this.w;
        ajxb ajxbVar = vxuVar.c().s;
        if (ajxbVar == null) {
            ajxbVar = ajxb.a;
        }
        if (ajxbVar.d) {
            aqmh aqmhVar = sreVar.a;
            alay alayVar = sreVar.j;
            alay alayVar2 = sreVar.k;
            arrh arrhVar = sreVar.d;
            ajnf ajnfVar = sreVar.f;
            ajnf ajnfVar2 = sreVar.g;
            aktm aktmVar = sreVar.h;
            ajxx ajxxVar = sreVar.l;
            ajyj ajyjVar = sreVar.m;
            final ssz sszVar = new ssz();
            Bundle bundle = new Bundle();
            ahng.aG(bundle, "profile_photo", aqmhVar);
            if (alayVar != null) {
                ahng.aG(bundle, "caption", alayVar);
            }
            if (alayVar2 != null) {
                ahng.aG(bundle, "hint", alayVar2);
            }
            if (arrhVar != null) {
                ahng.aG(bundle, "zero_step", arrhVar);
            }
            if (ajnfVar != null) {
                ahng.aG(bundle, "camera_button", ajnfVar);
            }
            if (ajnfVar2 != null) {
                ahng.aG(bundle, "emoji_picker_button", ajnfVar2);
            }
            if (aktmVar != null) {
                ahng.aG(bundle, "emoji_picker_renderer", aktmVar);
            }
            if (ajxxVar != null) {
                ahng.aG(bundle, "comment_dialog_renderer", ajxxVar);
            }
            if (ajyjVar != null) {
                ahng.aG(bundle, "reply_dialog_renderer", ajyjVar);
            }
            if (charSequence != null) {
                bundle.putCharSequence("comment_text", charSequence);
            }
            bundle.putBoolean("retry", z);
            sszVar.setArguments(bundle);
            this.g = sszVar;
            if (z2) {
                sszVar.D = true;
                sszVar.l(true);
                z5 = true;
            } else {
                z5 = false;
            }
            abfv abfvVar = this.z;
            final int i3 = 1;
            final int i4 = (abfvVar == null || !abfvVar.j()) ? R.string.comments_discard_positive_button : R.string.comments_discard_positive_button_sentence_case;
            this.e = new DialogInterface.OnCancelListener(this) { // from class: sqz
                public final /* synthetic */ srd a;

                {
                    this.a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, stb] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, stb] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i5 = i3;
                    srd srdVar = this.a;
                    if (i5 != 0) {
                        boolean z6 = z5;
                        Long l2 = l;
                        ?? r5 = sszVar;
                        srdVar.i(srdVar.b.getText(R.string.comments_discard), agdf.a, i4, sreVar, r5, l2, z6, false);
                        return;
                    }
                    boolean z7 = z5;
                    Long l3 = l;
                    ?? r6 = sszVar;
                    srdVar.i(srdVar.b.getText(R.string.comments_discard), agdf.a, i4, sreVar, r6, l3, z7, false);
                }
            };
            final boolean z6 = z5;
            final int i5 = 1;
            this.f = new DialogInterface.OnCancelListener(this) { // from class: sra
                public final /* synthetic */ srd a;

                {
                    this.a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, stb] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, stb] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i6 = i5;
                    srd srdVar = this.a;
                    if (i6 != 0) {
                        Context context = srdVar.b;
                        CharSequence text = context.getText(R.string.comments_discard_get_membership);
                        agev agevVarI = agev.i(context.getText(R.string.comments_discard_get_membership_title));
                        boolean z7 = z6;
                        Long l2 = l;
                        srdVar.i(text, agevVarI, R.string.comments_discard_get_membership_button, sreVar, sszVar, l2, z7, true);
                        return;
                    }
                    Context context2 = srdVar.b;
                    CharSequence text2 = context2.getText(R.string.comments_discard_get_membership);
                    agev agevVarI2 = agev.i(context2.getText(R.string.comments_discard_get_membership_title));
                    boolean z8 = z6;
                    Long l3 = l;
                    srdVar.i(text2, agevVarI2, R.string.comments_discard_get_membership_button, sreVar, sszVar, l3, z8, true);
                }
            };
            sszVar.z = this.e;
            sreVar2 = sreVar;
            sszVar.J = new srb(this, sszVar, i4, sreVar, l, z6);
            sszVar.w = new rmx(this, sreVar2, sszVar, 8);
            sszVar.A = new gxu(this, 6);
            sszVar.y = new sqx(this, 2);
            dd supportFragmentManager = ((cf) this.l).getSupportFragmentManager();
            cc ccVarG = supportFragmentManager.g("comment_dialog_fragment");
            if (ccVarG != null) {
                ((sta) ccVarG).dismiss();
            }
            if (!sszVar.isAdded() && !supportFragmentManager.ad()) {
                sszVar.h(supportFragmentManager, "comment_dialog_fragment");
            }
            z3 = true;
            r9 = 0;
            i = 4;
            z4 = false;
        } else {
            Context context = this.b;
            Activity activity = this.l;
            adhv adhvVar = this.m;
            aeaj aeajVar = this.q;
            aduv aduvVar = this.n;
            final ssv ssvVar = new ssv(context, activity, adhvVar, aeajVar, aduvVar, sreVar.g, sreVar.h, sreVar.e, vxuVar, this.j, this.t);
            this.g = ssvVar;
            ssvVar.d(charSequence, z);
            aqmh aqmhVar2 = sreVar.a;
            boolean z7 = ssvVar.s;
            new adia(ssvVar.d, new tym(null), z7 ? ssvVar.p : ssvVar.o, false).f(aqmhVar2, null);
            Spanned spanned = sreVar.c;
            if (!TextUtils.isEmpty(spanned)) {
                ssvVar.f.setHint(spanned);
            }
            arrh arrhVar2 = sreVar.d;
            if (arrhVar2 != null) {
                alay alayVar3 = arrhVar2.b;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                TextView textView = ssvVar.j;
                Spanned spannedK = ackj.k(null, alayVar3, null, false);
                textView.setText(spannedK);
                z3 = true;
                tuk.l(textView, !TextUtils.isEmpty(spannedK));
                alay alayVar4 = arrhVar2.c;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
                Spanned spannedA = vxl.a(null, alayVar4, this.c, false);
                TextView textView2 = ssvVar.m;
                textView2.setText(spannedA);
                tuk.l(ssvVar.n, !TextUtils.isEmpty(spannedA));
                tuk.l(textView2, !TextUtils.isEmpty(spannedA));
            } else {
                z3 = true;
                z3 = true;
                Spanned spanned2 = sreVar.b;
                if (spanned2 != null) {
                    TextView textView3 = ssvVar.k;
                    textView3.setText(spanned2);
                    tuk.l(textView3, !TextUtils.isEmpty(spanned2));
                    tuk.l(ssvVar.l, !TextUtils.isEmpty(spanned2));
                }
            }
            abfv abfvVar2 = this.z;
            int i6 = (abfvVar2 == null || !abfvVar2.j()) ? R.string.comments_discard_positive_button : R.string.comments_discard_positive_button_sentence_case;
            final int i7 = 0;
            i = 4;
            z4 = false;
            final int i8 = i6;
            obj = null;
            this.e = new DialogInterface.OnCancelListener(this) { // from class: sqz
                public final /* synthetic */ srd a;

                {
                    this.a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, stb] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, stb] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i9 = i7;
                    srd srdVar = this.a;
                    if (i9 != 0) {
                        boolean z8 = z2;
                        Long l2 = l;
                        ?? r5 = ssvVar;
                        srdVar.i(srdVar.b.getText(R.string.comments_discard), agdf.a, i8, sreVar, r5, l2, z8, false);
                        return;
                    }
                    boolean z9 = z2;
                    Long l3 = l;
                    ?? r6 = ssvVar;
                    srdVar.i(srdVar.b.getText(R.string.comments_discard), agdf.a, i8, sreVar, r6, l3, z9, false);
                }
            };
            final int i9 = 0;
            this.f = new DialogInterface.OnCancelListener(this) { // from class: sra
                public final /* synthetic */ srd a;

                {
                    this.a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, stb] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, stb] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i10 = i9;
                    srd srdVar = this.a;
                    if (i10 != 0) {
                        Context context2 = srdVar.b;
                        CharSequence text = context2.getText(R.string.comments_discard_get_membership);
                        agev agevVarI = agev.i(context2.getText(R.string.comments_discard_get_membership_title));
                        boolean z8 = z2;
                        Long l2 = l;
                        srdVar.i(text, agevVarI, R.string.comments_discard_get_membership_button, sreVar, ssvVar, l2, z8, true);
                        return;
                    }
                    Context context3 = srdVar.b;
                    CharSequence text2 = context3.getText(R.string.comments_discard_get_membership);
                    agev agevVarI2 = agev.i(context3.getText(R.string.comments_discard_get_membership_title));
                    boolean z9 = z2;
                    Long l3 = l;
                    srdVar.i(text2, agevVarI2, R.string.comments_discard_get_membership_button, sreVar, ssvVar, l3, z9, true);
                }
            };
            ssvVar.e(this.e);
            sreVar2 = sreVar;
            ssvVar.z = new srb(this, ssvVar, i6, sreVar, l, z2);
            ajnf ajnfVar3 = sreVar2.f;
            if (ajnfVar3 != null && (i2 = ajnfVar3.e) == 8 && (ajnfVar3.b & SemanticState.Obscured) != 0) {
                aliz alizVarA = aliz.a((i2 == 8 ? (alja) ajnfVar3.f : alja.a).c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                int iA = aduvVar.a(alizVarA);
                ssvVar.v = new rmx(this, sreVar2, ssvVar, 9);
                ssvVar.r.setVisibility(0);
                ImageView imageView = ssvVar.q;
                imageView.setVisibility(0);
                imageView.setImageResource(iA);
            }
            ajxb ajxbVar2 = vxuVar.c().s;
            if (ajxbVar2 == null) {
                ajxbVar2 = ajxb.a;
            }
            if (ajxbVar2.c) {
                taq taqVar = this.k;
                if (taqVar.S() != null) {
                    boolean zBooleanValue = taqVar.R().booleanValue();
                    ssvVar.w = new rhz(this, ssvVar, 19, null);
                    ImageView imageView2 = ssvVar.i;
                    if (imageView2.getVisibility() == 4) {
                        imageView2.setVisibility(8);
                    }
                    ImageView imageView3 = ssvVar.h;
                    imageView3.setVisibility(0);
                    imageView3.setEnabled(!zBooleanValue);
                    Context context2 = ssvVar.b;
                    Drawable drawableD = dl.d(context2, R.drawable.ic_timestamp);
                    drawableD.setTint(tzk.n(context2, z3 != zBooleanValue ? R.attr.ytTextSecondary : R.attr.ytTextDisabled).orElse(0));
                    imageView3.setImageDrawable(drawableD);
                    tuk.k(imageView3, null, z3 ? 1 : 0);
                }
            }
            DialogInterface.OnShowListener onShowListener = new DialogInterface.OnShowListener() { // from class: src
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    xgn xgnVarB;
                    arrh arrhVar3 = sreVar2.d;
                    srd srdVar = this.a;
                    if (arrhVar3 != null && !z && (xgnVarB = srdVar.b()) != null) {
                        xgnVarB.l(new xgj(arrhVar3.d, (amud) null));
                    }
                    srdVar.h();
                }
            };
            Dialog dialog = ssvVar.a;
            dialog.setOnShowListener(onShowListener);
            dialog.setOnDismissListener(new sqx(this, 3));
            if (z2) {
                ssvVar.y = z3;
                ssvVar.c(z3);
            }
            r9 = obj;
            if (!dialog.isShowing()) {
                Activity activity2 = ssvVar.c;
                if (!activity2.isDestroyed() && !activity2.isFinishing()) {
                    dialog.show();
                    Window window = dialog.getWindow();
                    if (z7) {
                        r9 = obj;
                        r9 = obj;
                        ((View) window.findViewById(android.R.id.custom).getParent()).setMinimumHeight(0);
                    }
                    r9 = obj;
                    r9 = obj;
                    window.setLayout(-1, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 80;
                    window.setAttributes(attributes);
                    window.setBackgroundDrawable(ssvVar.t.f() ? new ColorDrawable(0) : ssvVar.u);
                    window.setSoftInputMode(5);
                    ssvVar.f.requestFocus();
                    r9 = obj;
                }
            }
        }
        r9 = obj;
        r9 = obj;
        r9 = obj;
        wby wbyVarB = this.r.e(this.s.e());
        String str = sreVar2.i;
        if (TextUtils.isEmpty(str)) {
            this.j.j(r9, z3);
            return;
        }
        avmn avmnVar = this.u;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.u);
        }
        this.u = r9;
        this.u = wbyVarB.j(str, z4).O(avmh.a()).af(new sqk(this, 3));
        wbyVarB.g(str).g(ajxv.class).k(new sqk(this, i)).j(new sqk(this, 5)).i(new hoi(this, 13)).H();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    public final void k(final String str, final sre sreVar, final stb stbVar, final Long l) {
        ajxx ajxxVar = sreVar.l;
        if (ajxxVar != null && (ajxxVar.b & SemanticState.LiveRegion) != 0) {
            wer werVarE = this.r.e(this.s.e()).e();
            String str2 = ajxxVar.j;
            str2.getClass();
            ahno.P(!str2.isEmpty(), "key cannot be empty");
            aihf aihfVarCreateBuilder = aqfp.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aqfp aqfpVar = (aqfp) aihfVarCreateBuilder.instance;
            aqfpVar.b |= 1;
            aqfpVar.c = str2;
            aqfq aqfqVar = new aqfq(aihfVarCreateBuilder);
            aihf aihfVar = aqfqVar.a;
            aihfVar.copyOnWrite();
            aqfp aqfpVar2 = (aqfp) aihfVar.instance;
            aqfpVar2.b |= 2;
            aqfpVar2.d = str;
            werVarE.m(aqfqVar);
            werVarE.b().G();
            stbVar.dismiss();
            return;
        }
        ajnf ajnfVar = sreVar.e;
        if ((ajnfVar.b & SemanticState.Modal) == 0) {
            tuk.n(this.b, R.string.error_comment_failed, 1);
            stbVar.dismiss();
            return;
        }
        twi twiVar = new twi() { // from class: sqy
            @Override // defpackage.twi
            public final void a(Object obj) {
                this.a.m(stbVar, (Throwable) obj, sreVar, str, l);
            }
        };
        aczl aczlVar = this.B;
        Activity activity = (Activity) aczlVar.d.io();
        activity.getClass();
        xsc xscVar = (xsc) aczlVar.g.io();
        xscVar.getClass();
        ((nsf) aczlVar.b.io()).getClass();
        sry sryVar = (sry) aczlVar.a.io();
        sryVar.getClass();
        roq roqVar = (roq) aczlVar.c.io();
        roqVar.getClass();
        acyx acyxVar = (acyx) aczlVar.e.io();
        acxn acxnVar = (acxn) aczlVar.f.io();
        acxnVar.getClass();
        srv srvVar = new srv(activity, xscVar, sryVar, roqVar, acyxVar, acxnVar, stbVar, str, l, twiVar);
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", srvVar);
        vxe vxeVar = this.c;
        ajwo ajwoVar = ajnfVar.q;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        vxeVar.c(ajwoVar, map);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [awmd, java.lang.Object] */
    public final void l(String str, sre sreVar, stb stbVar) {
        ajnf ajnfVar = sreVar.e;
        if ((ajnfVar.b & SemanticState.Modal) == 0) {
            tuk.n(this.b, R.string.error_comment_failed, 1);
            stbVar.dismiss();
            return;
        }
        hmo hmoVar = new hmo(this, stbVar, sreVar, str, 3);
        tld tldVar = this.y;
        vxe vxeVar = this.c;
        Activity activity = (Activity) tldVar.b.io();
        activity.getClass();
        xsc xscVar = (xsc) tldVar.a.io();
        xscVar.getClass();
        ssb ssbVar = new ssb(activity, xscVar, stbVar, str, hmoVar, vxeVar);
        afv afvVar = new afv();
        afvVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ssbVar);
        ajwo ajwoVar = ajnfVar.q;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        vxeVar.c(ajwoVar, afvVar);
    }

    public final void m(stb stbVar, Throwable th, sre sreVar, CharSequence charSequence, Long l) {
        stbVar.dismiss();
        if (th != null) {
            this.o.e(th);
        } else {
            tuk.n(this.b, R.string.error_comment_failed, 1);
        }
        j(sreVar, charSequence, l, true, false);
    }
}
