package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import app.rive.semantics.SemanticState;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addl implements mfy {
    public final Activity a;
    public int b;
    public fv c;
    public final abfv d;
    private final bog e;
    private final aunn f;
    private final aunn g;
    private final aunn h;
    private final aunn i;
    private final aeda j;
    private final awmd k;
    private final aunn l;
    private avmm m;
    private mfx n;
    private fjw o;
    private final afip p;
    private final abfv q;

    public addl(Context context, bog bogVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, afip afipVar, aeda aedaVar, abfv abfvVar, abfv abfvVar2, awmd awmdVar, aunn aunnVar5) {
        this.a = (Activity) context;
        this.e = bogVar;
        this.f = aunnVar;
        this.g = aunnVar2;
        this.h = aunnVar3;
        this.i = aunnVar4;
        this.p = afipVar;
        this.j = aedaVar;
        this.q = abfvVar;
        this.d = abfvVar2;
        this.k = awmdVar;
        this.l = aunnVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    private final ComponentTree e(byte[] bArr, mfx mfxVar, fjw fjwVar) {
        awmd awmdVar;
        adif adifVar;
        xgn xgnVar;
        Object obj = mfxVar.k;
        boolean z = obj instanceof xgn;
        xgn xgnVarHB = obj;
        if (!z) {
            if (mfxVar.o != null) {
                xgnVar = (xgn) this.i.io();
            } else {
                xgnVarHB = 0;
            }
        }
        if (xgnVarHB == 0) {
            xgnVarHB = xgnVar;
            xgnVarHB = ((xgm) this.h.io()).hB();
        }
        xgnVarHB = xgnVar;
        nrv nrvVar = mfxVar.g;
        nsk nskVarB = nsl.b();
        nskVarB.b(fjwVar);
        nskVarB.p(false);
        nskVarB.o(agke.q(aawb.ad(bArr, null, null)));
        agke agkeVarQ = agke.q(new aecm());
        nskVarB.c(true);
        nskVarB.j = agkeVarQ;
        nskVarB.n(this.p.e(xgnVarHB));
        nskVarB.t = nrvVar;
        if (((vxz) this.l.io()).m(238, 45814784L) && (awmdVar = this.k) != null && (adifVar = (adif) awmdVar.io()) != null) {
            nskVarB.r = ((mav) adifVar.a).a();
        }
        fhd fhdVar = fjwVar.y;
        fhm fhmVarC = ComponentTree.c(fhdVar, ((mlo) this.g.io()).a(fhdVar, nskVarB.a(), bArr, new adat(xgnVarHB), this.m), null);
        fhmVarC.d = false;
        return fhmVarC.a();
    }

    @Override // defpackage.mfy
    public final void a() {
        fv fvVar = this.c;
        if (fvVar != null) {
            fvVar.dismiss();
            this.c = null;
        }
        avmm avmmVar = this.m;
        if (avmmVar != null) {
            avmmVar.dispose();
            this.m = null;
        }
        this.n = null;
        this.o = null;
    }

    @Override // defpackage.mfy
    public final void b(byte[] bArr, mfx mfxVar) {
        mfx mfxVar2;
        if (this.o == null || (mfxVar2 = this.n) == null || !mfxVar2.equals(mfxVar)) {
            return;
        }
        fjw fjwVar = this.o;
        fjwVar.K(e(bArr, mfxVar, fjwVar), true);
    }

    @Override // defpackage.mfy
    public final void c(asmv asmvVar, mfx mfxVar) {
        d(asmvVar.toByteArray(), mfxVar);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aeda, java.lang.Object] */
    @Override // defpackage.mfy
    public final void d(byte[] bArr, final mfx mfxVar) {
        acwr acwrVar;
        Optional optionalOf;
        Activity activity = this.a;
        if (activity.isDestroyed()) {
            return;
        }
        a();
        final avmm avmmVar = new avmm();
        this.m = avmmVar;
        this.b = activity.getRequestedOrientation();
        final nry nryVar = (nry) this.f.io();
        int i = mfxVar.i;
        if (i != -1) {
            activity.setRequestedOrientation(i);
        }
        int i2 = mfxVar.p;
        byte[] bArr2 = null;
        if (i2 == 2 || i2 == 3) {
            ?? r4 = this.q.a;
            acwrVar = new acwr(activity, r4.a(), r4.o(), null);
        } else {
            acwrVar = this.q.f(activity);
        }
        String str = mfxVar.a;
        if (!TextUtils.isEmpty(str)) {
            acwrVar.setTitle(str);
        }
        String str2 = mfxVar.b;
        if (!TextUtils.isEmpty(str2)) {
            acwrVar.e(str2);
        }
        final nrv nrvVar = mfxVar.g;
        String str3 = mfxVar.c;
        int i3 = 4;
        if (!TextUtils.isEmpty(str3)) {
            CommandOuterClass$Command commandOuterClass$Command = mfxVar.e;
            acwrVar.h(str3, commandOuterClass$Command == null ? null : new hrg(nryVar, commandOuterClass$Command, nrvVar, i3));
        }
        final CommandOuterClass$Command commandOuterClass$Command2 = mfxVar.f;
        String str4 = mfxVar.d;
        if (!TextUtils.isEmpty(str4)) {
            acwrVar.f(str4, commandOuterClass$Command2 == null ? null : new hrg(nryVar, commandOuterClass$Command2, nrvVar, 5));
        }
        if (commandOuterClass$Command2 != null) {
            acwrVar.g(new DialogInterface.OnCancelListener() { // from class: addj
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    nryVar.a(commandOuterClass$Command2, nrvVar).D();
                }
            });
        }
        Boolean bool = mfxVar.l;
        if (bool != null) {
            acwrVar.a(Boolean.TRUE.equals(bool));
        }
        if (bArr.length == 0) {
            optionalOf = Optional.empty();
        } else {
            fjw fjwVar = new fjw(activity);
            aigj aigjVar = mfxVar.o;
            if (aigjVar != null) {
                xgn xgnVar = (xgn) this.i.io();
                if (!aigjVar.E()) {
                    xgnVar.b(xhb.a(46220), null, null);
                    xgnVar.d(new xgj(aigjVar, (amud) null));
                }
            }
            fjwVar.K(e(bArr, mfxVar, fjwVar), true);
            optionalOf = Optional.of(fjwVar);
        }
        if (optionalOf.isPresent()) {
            acwrVar.setView((View) optionalOf.get());
        }
        fv fvVarCreate = acwrVar.create();
        final mfw mfwVar = mfxVar.j;
        final acwg acwgVar = new acwg(fvVarCreate, 2);
        fvVarCreate.setOnShowListener(new sut(this, acwgVar, i3, bArr2));
        fvVarCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: addk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                avmmVar.dispose();
                mfw mfwVar2 = mfwVar;
                if (mfwVar2 != null) {
                    mfwVar2.a();
                }
                acwn acwnVar = acwgVar;
                addl addlVar = this.a;
                addlVar.d.o(acwnVar, "");
                fv fvVar = addlVar.c;
                if ((fvVar == null || fvVar == dialogInterface) && mfxVar.i != -1) {
                    addlVar.a.setRequestedOrientation(addlVar.b);
                }
            }
        });
        qr qrVar = mfxVar.h;
        if (qrVar != null) {
            fvVarCreate.getOnBackPressedDispatcher().c(this.e, qrVar);
        }
        fvVarCreate.show();
        Window window = fvVarCreate.getWindow();
        if (window != null) {
            window.clearFlags(131072);
            window.setSoftInputMode(16);
            Boolean bool2 = mfxVar.n;
            if (bool2 != null) {
                bool2.booleanValue();
                window.setWindowAnimations(R.style.SlidingDialogAnimation);
            }
            if (this.j.o()) {
                Drawable drawable = fvVarCreate.getContext().getDrawable(R.drawable.bg_dialog_rounded);
                drawable.getClass();
                window.setBackgroundDrawable(drawable);
            }
        }
        if (i2 == 2 && window != null) {
            window.getDecorView().setSystemUiVisibility(5894);
        }
        if (Objects.equals(mfxVar.m, Boolean.TRUE) && window != null) {
            window.addFlags(SemanticState.Focused);
        }
        this.c = fvVarCreate;
        if (optionalOf.isPresent()) {
            this.o = (fjw) optionalOf.get();
        }
        this.n = mfxVar;
    }
}
