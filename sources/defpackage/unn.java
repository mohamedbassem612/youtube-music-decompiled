package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class unn extends uno implements vkk {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/image/ImageEditorFragmentPeer");
    public final unj b;
    public final uni c;
    public final ulp d;
    public final vfq e;
    public final ahey f;
    public final zvl g;
    public final adxj h;
    public final vao j;
    public unh k;
    public final uko n;
    public uoa o;
    public final vxz p;
    public final afip q;
    public final roq r;
    public final roq s;
    public final roq t;
    public final avmm i = new avmm();
    public boolean l = false;
    public int m = -1;

    public unn(unj unjVar, uni uniVar, ulp ulpVar, vfq vfqVar, ahey aheyVar, afip afipVar, roq roqVar, roq roqVar2, roq roqVar3, zvl zvlVar, adxj adxjVar, uko ukoVar, vxz vxzVar, vao vaoVar) {
        this.b = unjVar;
        this.c = uniVar;
        this.d = ulpVar;
        this.e = vfqVar;
        this.f = aheyVar;
        this.q = afipVar;
        this.t = roqVar;
        this.s = roqVar2;
        this.r = roqVar3;
        this.g = zvlVar;
        this.h = adxjVar;
        this.n = ukoVar;
        this.p = vxzVar;
        this.j = vaoVar;
    }

    static ufs c(cc ccVar) {
        unf unfVarK = k(ccVar);
        return unfVarK != null ? unfVarK.h : ufs.CREATION_FLOW_UNKNOWN;
    }

    public static boolean i(cc ccVar, vao vaoVar) {
        return vaoVar.e(c(ccVar));
    }

    private static unf k(cc ccVar) {
        Bundle arguments = ccVar.getArguments();
        if (arguments == null) {
            return null;
        }
        return (unf) aie.i(arguments, "image_editor_config", unf.class);
    }

    public final Uri a() {
        Bundle arguments = this.b.getArguments();
        if (arguments == null) {
            return null;
        }
        return (Uri) arguments.getParcelable("input_image_uri");
    }

    public final View b() {
        View view = this.b.getView();
        if (view == null) {
            return null;
        }
        return view.findViewById(R.id.spinner_view_container);
    }

    public final unf d() {
        return k(this.b);
    }

    public final void e() {
        if (!this.p.l(56, 45726969L, false)) {
            this.t.k(xhb.b(22156)).d();
        }
        uoa uoaVar = this.o;
        if (uoaVar != null) {
            uoaVar.f();
        }
    }

    public final void f() {
        this.t.k(xhb.b(146985)).d();
        Uri uriA = a();
        uoa uoaVar = this.o;
        if (uoaVar == null || uriA == null) {
            return;
        }
        uoaVar.j();
    }

    @Override // defpackage.vkk
    public final void g(boolean z) {
        if (z) {
            return;
        }
        this.d.i();
    }

    public final void h(int i) {
        cf activity = this.b.getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0080, please report this as an issue */
    public final void j(twi twiVar) {
        final vfb vfbVar;
        unf unfVar;
        ahey aheyVar;
        vez vezVar;
        auij auijVar;
        vez vezVar2;
        auij auijVar2;
        vex vexVar;
        vez vezVar3;
        vex vexVar2;
        ListenableFuture listenableFutureR;
        boolean z;
        unh unhVar = this.k;
        if (unhVar == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/image/ImageEditorFragmentPeer", "hasUncommittedEdits", 579, "ImageEditorFragmentPeer.java")).t("imageEditorController was null");
            twiVar.a(Boolean.FALSE);
            return;
        }
        unj unjVar = this.b;
        vft vftVarB = unhVar.k.b();
        if (vftVarB instanceof vfb) {
            ShortsPlayerView shortsPlayerView = unhVar.d.E;
            if (shortsPlayerView != null) {
                ukh ukhVarA = shortsPlayerView.a();
                if (ahbd.c(shortsPlayerView.m, ukhVarA.a, 1.0E-6d) && ahbd.c(shortsPlayerView.n, ukhVarA.b, 1.0E-6d)) {
                    vfbVar = (vfb) vftVarB;
                    unfVar = unhVar.y;
                    if (unfVar == null && unfVar.c && vfbVar.l() == null) {
                        listenableFutureR = ahng.n(Boolean.TRUE);
                    } else {
                        if (unhVar.E.l(70, 45758187L, false) || vfbVar.l() == null) {
                            aheyVar = unhVar.l;
                            vezVar = vfbVar.m;
                            if (vezVar == null) {
                                auijVar = null;
                            } else {
                                auijVar = vezVar.b;
                            }
                            if (vfbVar.w(auijVar)) {
                                listenableFutureR = ahng.n(Boolean.TRUE);
                            } else {
                                vezVar2 = vfbVar.m;
                                if (vezVar2 == null) {
                                    auijVar2 = null;
                                } else {
                                    auijVar2 = vezVar2.b;
                                }
                                if (vfbVar.x(auijVar2)) {
                                    vexVar = vfbVar.d;
                                    vezVar3 = vfbVar.m;
                                    if (vezVar3 == null) {
                                        vexVar2 = null;
                                    } else {
                                        vexVar2 = vezVar3.c;
                                    }
                                    if (Objects.equals(vexVar, vexVar2)) {
                                        vey veyVar = vfbVar.e;
                                        vez vezVar4 = vfbVar.m;
                                        if (Objects.equals(null, null)) {
                                            listenableFutureR = ahng.r(afwl.j(new Callable() { // from class: vew
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    vfb vfbVar2 = vfbVar;
                                                    auij auijVar3 = vfbVar2.b;
                                                    File file = auijVar3 != null ? new File(auijVar3.c) : null;
                                                    File fileK = vfbVar2.k();
                                                    boolean zB = vfb.B(fileK);
                                                    boolean zB2 = vfb.B(file);
                                                    if (zB != zB2) {
                                                        return Boolean.TRUE;
                                                    }
                                                    if (!zB && !zB2) {
                                                        return Boolean.FALSE;
                                                    }
                                                    file.getClass();
                                                    if (fileK.length() != file.length()) {
                                                        return Boolean.TRUE;
                                                    }
                                                    auax auaxVarC = vfb.C(fileK);
                                                    auax auaxVarC2 = vfb.C(file);
                                                    if (auaxVarC == null) {
                                                        if (auaxVarC2 == null) {
                                                            return Boolean.FALSE;
                                                        }
                                                    } else if (auaxVarC2 != null) {
                                                        aihf builder = auaxVarC.toBuilder();
                                                        builder.copyOnWrite();
                                                        ((auax) builder.instance).b = auax.emptyProtobufList();
                                                        auax auaxVar = (auax) builder.build();
                                                        aihf builder2 = auaxVarC2.toBuilder();
                                                        builder2.copyOnWrite();
                                                        ((auax) builder2.instance).b = auax.emptyProtobufList();
                                                        boolean z2 = false;
                                                        if (auaxVar.equals(builder2.build()) && auaxVarC.b.size() == auaxVarC2.b.size()) {
                                                            for (int i = 0; i < auaxVarC.b.size(); i++) {
                                                                auat auatVar = (auat) auaxVarC.b.get(i);
                                                                auat auatVar2 = (auat) auaxVarC2.b.get(i);
                                                                aihf builder3 = auatVar.toBuilder();
                                                                builder3.copyOnWrite();
                                                                auat auatVar3 = (auat) builder3.instance;
                                                                auatVar3.f = null;
                                                                auatVar3.b &= -9;
                                                                builder3.copyOnWrite();
                                                                auat auatVar4 = (auat) builder3.instance;
                                                                auatVar4.b &= -129;
                                                                auatVar4.g = 0L;
                                                                auat auatVar5 = (auat) builder3.build();
                                                                aihf builder4 = auatVar2.toBuilder();
                                                                builder4.copyOnWrite();
                                                                auat auatVar6 = (auat) builder4.instance;
                                                                auatVar6.f = null;
                                                                auatVar6.b &= -9;
                                                                builder4.copyOnWrite();
                                                                auat auatVar7 = (auat) builder4.instance;
                                                                auatVar7.b &= -129;
                                                                auatVar7.g = 0L;
                                                                if (auatVar5.equals((auat) builder4.build())) {
                                                                    aimy aimyVar = auatVar.f;
                                                                    if (aimyVar == null) {
                                                                        aimyVar = aimy.a;
                                                                    }
                                                                    aimy aimyVar2 = auatVar2.f;
                                                                    if (aimyVar2 == null) {
                                                                        aimyVar2 = aimy.a;
                                                                    }
                                                                    aihf builder5 = aimyVar.toBuilder();
                                                                    builder5.copyOnWrite();
                                                                    ((aimy) builder5.instance).e = aimy.emptyFloatList();
                                                                    aimy aimyVar3 = (aimy) builder5.build();
                                                                    aihf builder6 = aimyVar2.toBuilder();
                                                                    builder6.copyOnWrite();
                                                                    ((aimy) builder6.instance).e = aimy.emptyFloatList();
                                                                    if (aimyVar3.equals((aimy) builder6.build()) && aimyVar.e.size() == aimyVar2.e.size()) {
                                                                        for (int i2 = 0; i2 < aimyVar.e.size(); i2++) {
                                                                            if (ahbd.c(aimyVar.e.d(i2), aimyVar2.e.d(i2), 1.0E-6d)) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z2 = true;
                                                        }
                                                        return Boolean.valueOf(!z2);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }), aheyVar);
                                        } else {
                                            listenableFutureR = ahng.n(Boolean.TRUE);
                                        }
                                    } else {
                                        listenableFutureR = ahng.n(Boolean.TRUE);
                                    }
                                } else {
                                    listenableFutureR = ahng.n(Boolean.TRUE);
                                }
                            }
                        } else {
                            vfa vfaVar = vfbVar.n;
                            auij auijVar3 = vfaVar == null ? null : vfaVar.c;
                            if (!vfbVar.w(auijVar3) && vfbVar.x(auijVar3)) {
                                vey veyVar2 = vfbVar.e;
                                vfa vfaVar2 = vfbVar.n;
                                z = Objects.equals(null, null) ? false : true;
                            }
                            listenableFutureR = ahng.n(Boolean.valueOf(z));
                        }
                    }
                } else {
                    listenableFutureR = ahng.n(Boolean.TRUE);
                }
            } else {
                vfbVar = (vfb) vftVarB;
                unfVar = unhVar.y;
                if (unfVar == null) {
                    if (unhVar.E.l(70, 45758187L, false)) {
                        aheyVar = unhVar.l;
                        vezVar = vfbVar.m;
                        if (vezVar == null) {
                            auijVar = null;
                        } else {
                            auijVar = vezVar.b;
                        }
                        if (vfbVar.w(auijVar)) {
                            listenableFutureR = ahng.n(Boolean.TRUE);
                        } else {
                            vezVar2 = vfbVar.m;
                            if (vezVar2 == null) {
                                auijVar2 = null;
                            } else {
                                auijVar2 = vezVar2.b;
                            }
                            if (vfbVar.x(auijVar2)) {
                                listenableFutureR = ahng.n(Boolean.TRUE);
                            } else {
                                vexVar = vfbVar.d;
                                vezVar3 = vfbVar.m;
                                if (vezVar3 == null) {
                                    vexVar2 = null;
                                } else {
                                    vexVar2 = vezVar3.c;
                                }
                                if (Objects.equals(vexVar, vexVar2)) {
                                    listenableFutureR = ahng.n(Boolean.TRUE);
                                } else {
                                    vey veyVar3 = vfbVar.e;
                                    vez vezVar5 = vfbVar.m;
                                    if (Objects.equals(null, null)) {
                                        listenableFutureR = ahng.n(Boolean.TRUE);
                                    } else {
                                        listenableFutureR = ahng.r(afwl.j(new Callable() { // from class: vew
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                vfb vfbVar2 = vfbVar;
                                                auij auijVar4 = vfbVar2.b;
                                                File file = auijVar4 != null ? new File(auijVar4.c) : null;
                                                File fileK = vfbVar2.k();
                                                boolean zB = vfb.B(fileK);
                                                boolean zB2 = vfb.B(file);
                                                if (zB != zB2) {
                                                    return Boolean.TRUE;
                                                }
                                                if (!zB && !zB2) {
                                                    return Boolean.FALSE;
                                                }
                                                file.getClass();
                                                if (fileK.length() != file.length()) {
                                                    return Boolean.TRUE;
                                                }
                                                auax auaxVarC = vfb.C(fileK);
                                                auax auaxVarC2 = vfb.C(file);
                                                if (auaxVarC == null) {
                                                    if (auaxVarC2 == null) {
                                                        return Boolean.FALSE;
                                                    }
                                                } else if (auaxVarC2 != null) {
                                                    aihf builder = auaxVarC.toBuilder();
                                                    builder.copyOnWrite();
                                                    ((auax) builder.instance).b = auax.emptyProtobufList();
                                                    auax auaxVar = (auax) builder.build();
                                                    aihf builder2 = auaxVarC2.toBuilder();
                                                    builder2.copyOnWrite();
                                                    ((auax) builder2.instance).b = auax.emptyProtobufList();
                                                    boolean z2 = false;
                                                    if (auaxVar.equals(builder2.build()) && auaxVarC.b.size() == auaxVarC2.b.size()) {
                                                        for (int i = 0; i < auaxVarC.b.size(); i++) {
                                                            auat auatVar = (auat) auaxVarC.b.get(i);
                                                            auat auatVar2 = (auat) auaxVarC2.b.get(i);
                                                            aihf builder3 = auatVar.toBuilder();
                                                            builder3.copyOnWrite();
                                                            auat auatVar3 = (auat) builder3.instance;
                                                            auatVar3.f = null;
                                                            auatVar3.b &= -9;
                                                            builder3.copyOnWrite();
                                                            auat auatVar4 = (auat) builder3.instance;
                                                            auatVar4.b &= -129;
                                                            auatVar4.g = 0L;
                                                            auat auatVar5 = (auat) builder3.build();
                                                            aihf builder4 = auatVar2.toBuilder();
                                                            builder4.copyOnWrite();
                                                            auat auatVar6 = (auat) builder4.instance;
                                                            auatVar6.f = null;
                                                            auatVar6.b &= -9;
                                                            builder4.copyOnWrite();
                                                            auat auatVar7 = (auat) builder4.instance;
                                                            auatVar7.b &= -129;
                                                            auatVar7.g = 0L;
                                                            if (auatVar5.equals((auat) builder4.build())) {
                                                                aimy aimyVar = auatVar.f;
                                                                if (aimyVar == null) {
                                                                    aimyVar = aimy.a;
                                                                }
                                                                aimy aimyVar2 = auatVar2.f;
                                                                if (aimyVar2 == null) {
                                                                    aimyVar2 = aimy.a;
                                                                }
                                                                aihf builder5 = aimyVar.toBuilder();
                                                                builder5.copyOnWrite();
                                                                ((aimy) builder5.instance).e = aimy.emptyFloatList();
                                                                aimy aimyVar3 = (aimy) builder5.build();
                                                                aihf builder6 = aimyVar2.toBuilder();
                                                                builder6.copyOnWrite();
                                                                ((aimy) builder6.instance).e = aimy.emptyFloatList();
                                                                if (aimyVar3.equals((aimy) builder6.build()) && aimyVar.e.size() == aimyVar2.e.size()) {
                                                                    for (int i2 = 0; i2 < aimyVar.e.size(); i2++) {
                                                                        if (ahbd.c(aimyVar.e.d(i2), aimyVar2.e.d(i2), 1.0E-6d)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z2 = true;
                                                    }
                                                    return Boolean.valueOf(!z2);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }), aheyVar);
                                    }
                                }
                            }
                        }
                    } else {
                        aheyVar = unhVar.l;
                        vezVar = vfbVar.m;
                        if (vezVar == null) {
                            auijVar = null;
                        } else {
                            auijVar = vezVar.b;
                        }
                        if (vfbVar.w(auijVar)) {
                            listenableFutureR = ahng.n(Boolean.TRUE);
                        } else {
                            vezVar2 = vfbVar.m;
                            if (vezVar2 == null) {
                                auijVar2 = null;
                            } else {
                                auijVar2 = vezVar2.b;
                            }
                            if (vfbVar.x(auijVar2)) {
                                listenableFutureR = ahng.n(Boolean.TRUE);
                            } else {
                                vexVar = vfbVar.d;
                                vezVar3 = vfbVar.m;
                                if (vezVar3 == null) {
                                    vexVar2 = null;
                                } else {
                                    vexVar2 = vezVar3.c;
                                }
                                if (Objects.equals(vexVar, vexVar2)) {
                                    listenableFutureR = ahng.n(Boolean.TRUE);
                                } else {
                                    vey veyVar4 = vfbVar.e;
                                    vez vezVar6 = vfbVar.m;
                                    if (Objects.equals(null, null)) {
                                        listenableFutureR = ahng.n(Boolean.TRUE);
                                    } else {
                                        listenableFutureR = ahng.r(afwl.j(new Callable() { // from class: vew
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                vfb vfbVar2 = vfbVar;
                                                auij auijVar4 = vfbVar2.b;
                                                File file = auijVar4 != null ? new File(auijVar4.c) : null;
                                                File fileK = vfbVar2.k();
                                                boolean zB = vfb.B(fileK);
                                                boolean zB2 = vfb.B(file);
                                                if (zB != zB2) {
                                                    return Boolean.TRUE;
                                                }
                                                if (!zB && !zB2) {
                                                    return Boolean.FALSE;
                                                }
                                                file.getClass();
                                                if (fileK.length() != file.length()) {
                                                    return Boolean.TRUE;
                                                }
                                                auax auaxVarC = vfb.C(fileK);
                                                auax auaxVarC2 = vfb.C(file);
                                                if (auaxVarC == null) {
                                                    if (auaxVarC2 == null) {
                                                        return Boolean.FALSE;
                                                    }
                                                } else if (auaxVarC2 != null) {
                                                    aihf builder = auaxVarC.toBuilder();
                                                    builder.copyOnWrite();
                                                    ((auax) builder.instance).b = auax.emptyProtobufList();
                                                    auax auaxVar = (auax) builder.build();
                                                    aihf builder2 = auaxVarC2.toBuilder();
                                                    builder2.copyOnWrite();
                                                    ((auax) builder2.instance).b = auax.emptyProtobufList();
                                                    boolean z2 = false;
                                                    if (auaxVar.equals(builder2.build()) && auaxVarC.b.size() == auaxVarC2.b.size()) {
                                                        for (int i = 0; i < auaxVarC.b.size(); i++) {
                                                            auat auatVar = (auat) auaxVarC.b.get(i);
                                                            auat auatVar2 = (auat) auaxVarC2.b.get(i);
                                                            aihf builder3 = auatVar.toBuilder();
                                                            builder3.copyOnWrite();
                                                            auat auatVar3 = (auat) builder3.instance;
                                                            auatVar3.f = null;
                                                            auatVar3.b &= -9;
                                                            builder3.copyOnWrite();
                                                            auat auatVar4 = (auat) builder3.instance;
                                                            auatVar4.b &= -129;
                                                            auatVar4.g = 0L;
                                                            auat auatVar5 = (auat) builder3.build();
                                                            aihf builder4 = auatVar2.toBuilder();
                                                            builder4.copyOnWrite();
                                                            auat auatVar6 = (auat) builder4.instance;
                                                            auatVar6.f = null;
                                                            auatVar6.b &= -9;
                                                            builder4.copyOnWrite();
                                                            auat auatVar7 = (auat) builder4.instance;
                                                            auatVar7.b &= -129;
                                                            auatVar7.g = 0L;
                                                            if (auatVar5.equals((auat) builder4.build())) {
                                                                aimy aimyVar = auatVar.f;
                                                                if (aimyVar == null) {
                                                                    aimyVar = aimy.a;
                                                                }
                                                                aimy aimyVar2 = auatVar2.f;
                                                                if (aimyVar2 == null) {
                                                                    aimyVar2 = aimy.a;
                                                                }
                                                                aihf builder5 = aimyVar.toBuilder();
                                                                builder5.copyOnWrite();
                                                                ((aimy) builder5.instance).e = aimy.emptyFloatList();
                                                                aimy aimyVar3 = (aimy) builder5.build();
                                                                aihf builder6 = aimyVar2.toBuilder();
                                                                builder6.copyOnWrite();
                                                                ((aimy) builder6.instance).e = aimy.emptyFloatList();
                                                                if (aimyVar3.equals((aimy) builder6.build()) && aimyVar.e.size() == aimyVar2.e.size()) {
                                                                    for (int i2 = 0; i2 < aimyVar.e.size(); i2++) {
                                                                        if (ahbd.c(aimyVar.e.d(i2), aimyVar2.e.d(i2), 1.0E-6d)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z2 = true;
                                                    }
                                                    return Boolean.valueOf(!z2);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }), aheyVar);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (unhVar.E.l(70, 45758187L, false)) {
                        aheyVar = unhVar.l;
                        vezVar = vfbVar.m;
                        if (vezVar == null) {
                            auijVar = null;
                        } else {
                            auijVar = vezVar.b;
                        }
                        if (vfbVar.w(auijVar)) {
                            listenableFutureR = ahng.n(Boolean.TRUE);
                        } else {
                            vezVar2 = vfbVar.m;
                            if (vezVar2 == null) {
                                auijVar2 = null;
                            } else {
                                auijVar2 = vezVar2.b;
                            }
                            if (vfbVar.x(auijVar2)) {
                                listenableFutureR = ahng.n(Boolean.TRUE);
                            } else {
                                vexVar = vfbVar.d;
                                vezVar3 = vfbVar.m;
                                if (vezVar3 == null) {
                                    vexVar2 = null;
                                } else {
                                    vexVar2 = vezVar3.c;
                                }
                                if (Objects.equals(vexVar, vexVar2)) {
                                    listenableFutureR = ahng.n(Boolean.TRUE);
                                } else {
                                    vey veyVar5 = vfbVar.e;
                                    vez vezVar7 = vfbVar.m;
                                    if (Objects.equals(null, null)) {
                                        listenableFutureR = ahng.n(Boolean.TRUE);
                                    } else {
                                        listenableFutureR = ahng.r(afwl.j(new Callable() { // from class: vew
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                vfb vfbVar2 = vfbVar;
                                                auij auijVar4 = vfbVar2.b;
                                                File file = auijVar4 != null ? new File(auijVar4.c) : null;
                                                File fileK = vfbVar2.k();
                                                boolean zB = vfb.B(fileK);
                                                boolean zB2 = vfb.B(file);
                                                if (zB != zB2) {
                                                    return Boolean.TRUE;
                                                }
                                                if (!zB && !zB2) {
                                                    return Boolean.FALSE;
                                                }
                                                file.getClass();
                                                if (fileK.length() != file.length()) {
                                                    return Boolean.TRUE;
                                                }
                                                auax auaxVarC = vfb.C(fileK);
                                                auax auaxVarC2 = vfb.C(file);
                                                if (auaxVarC == null) {
                                                    if (auaxVarC2 == null) {
                                                        return Boolean.FALSE;
                                                    }
                                                } else if (auaxVarC2 != null) {
                                                    aihf builder = auaxVarC.toBuilder();
                                                    builder.copyOnWrite();
                                                    ((auax) builder.instance).b = auax.emptyProtobufList();
                                                    auax auaxVar = (auax) builder.build();
                                                    aihf builder2 = auaxVarC2.toBuilder();
                                                    builder2.copyOnWrite();
                                                    ((auax) builder2.instance).b = auax.emptyProtobufList();
                                                    boolean z2 = false;
                                                    if (auaxVar.equals(builder2.build()) && auaxVarC.b.size() == auaxVarC2.b.size()) {
                                                        for (int i = 0; i < auaxVarC.b.size(); i++) {
                                                            auat auatVar = (auat) auaxVarC.b.get(i);
                                                            auat auatVar2 = (auat) auaxVarC2.b.get(i);
                                                            aihf builder3 = auatVar.toBuilder();
                                                            builder3.copyOnWrite();
                                                            auat auatVar3 = (auat) builder3.instance;
                                                            auatVar3.f = null;
                                                            auatVar3.b &= -9;
                                                            builder3.copyOnWrite();
                                                            auat auatVar4 = (auat) builder3.instance;
                                                            auatVar4.b &= -129;
                                                            auatVar4.g = 0L;
                                                            auat auatVar5 = (auat) builder3.build();
                                                            aihf builder4 = auatVar2.toBuilder();
                                                            builder4.copyOnWrite();
                                                            auat auatVar6 = (auat) builder4.instance;
                                                            auatVar6.f = null;
                                                            auatVar6.b &= -9;
                                                            builder4.copyOnWrite();
                                                            auat auatVar7 = (auat) builder4.instance;
                                                            auatVar7.b &= -129;
                                                            auatVar7.g = 0L;
                                                            if (auatVar5.equals((auat) builder4.build())) {
                                                                aimy aimyVar = auatVar.f;
                                                                if (aimyVar == null) {
                                                                    aimyVar = aimy.a;
                                                                }
                                                                aimy aimyVar2 = auatVar2.f;
                                                                if (aimyVar2 == null) {
                                                                    aimyVar2 = aimy.a;
                                                                }
                                                                aihf builder5 = aimyVar.toBuilder();
                                                                builder5.copyOnWrite();
                                                                ((aimy) builder5.instance).e = aimy.emptyFloatList();
                                                                aimy aimyVar3 = (aimy) builder5.build();
                                                                aihf builder6 = aimyVar2.toBuilder();
                                                                builder6.copyOnWrite();
                                                                ((aimy) builder6.instance).e = aimy.emptyFloatList();
                                                                if (aimyVar3.equals((aimy) builder6.build()) && aimyVar.e.size() == aimyVar2.e.size()) {
                                                                    for (int i2 = 0; i2 < aimyVar.e.size(); i2++) {
                                                                        if (ahbd.c(aimyVar.e.d(i2), aimyVar2.e.d(i2), 1.0E-6d)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z2 = true;
                                                    }
                                                    return Boolean.valueOf(!z2);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }), aheyVar);
                                    }
                                }
                            }
                        }
                    } else {
                        aheyVar = unhVar.l;
                        vezVar = vfbVar.m;
                        if (vezVar == null) {
                            auijVar = null;
                        } else {
                            auijVar = vezVar.b;
                        }
                        if (vfbVar.w(auijVar)) {
                            listenableFutureR = ahng.n(Boolean.TRUE);
                        } else {
                            vezVar2 = vfbVar.m;
                            if (vezVar2 == null) {
                                auijVar2 = null;
                            } else {
                                auijVar2 = vezVar2.b;
                            }
                            if (vfbVar.x(auijVar2)) {
                                listenableFutureR = ahng.n(Boolean.TRUE);
                            } else {
                                vexVar = vfbVar.d;
                                vezVar3 = vfbVar.m;
                                if (vezVar3 == null) {
                                    vexVar2 = null;
                                } else {
                                    vexVar2 = vezVar3.c;
                                }
                                if (Objects.equals(vexVar, vexVar2)) {
                                    listenableFutureR = ahng.n(Boolean.TRUE);
                                } else {
                                    vey veyVar6 = vfbVar.e;
                                    vez vezVar8 = vfbVar.m;
                                    if (Objects.equals(null, null)) {
                                        listenableFutureR = ahng.n(Boolean.TRUE);
                                    } else {
                                        listenableFutureR = ahng.r(afwl.j(new Callable() { // from class: vew
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                vfb vfbVar2 = vfbVar;
                                                auij auijVar4 = vfbVar2.b;
                                                File file = auijVar4 != null ? new File(auijVar4.c) : null;
                                                File fileK = vfbVar2.k();
                                                boolean zB = vfb.B(fileK);
                                                boolean zB2 = vfb.B(file);
                                                if (zB != zB2) {
                                                    return Boolean.TRUE;
                                                }
                                                if (!zB && !zB2) {
                                                    return Boolean.FALSE;
                                                }
                                                file.getClass();
                                                if (fileK.length() != file.length()) {
                                                    return Boolean.TRUE;
                                                }
                                                auax auaxVarC = vfb.C(fileK);
                                                auax auaxVarC2 = vfb.C(file);
                                                if (auaxVarC == null) {
                                                    if (auaxVarC2 == null) {
                                                        return Boolean.FALSE;
                                                    }
                                                } else if (auaxVarC2 != null) {
                                                    aihf builder = auaxVarC.toBuilder();
                                                    builder.copyOnWrite();
                                                    ((auax) builder.instance).b = auax.emptyProtobufList();
                                                    auax auaxVar = (auax) builder.build();
                                                    aihf builder2 = auaxVarC2.toBuilder();
                                                    builder2.copyOnWrite();
                                                    ((auax) builder2.instance).b = auax.emptyProtobufList();
                                                    boolean z2 = false;
                                                    if (auaxVar.equals(builder2.build()) && auaxVarC.b.size() == auaxVarC2.b.size()) {
                                                        for (int i = 0; i < auaxVarC.b.size(); i++) {
                                                            auat auatVar = (auat) auaxVarC.b.get(i);
                                                            auat auatVar2 = (auat) auaxVarC2.b.get(i);
                                                            aihf builder3 = auatVar.toBuilder();
                                                            builder3.copyOnWrite();
                                                            auat auatVar3 = (auat) builder3.instance;
                                                            auatVar3.f = null;
                                                            auatVar3.b &= -9;
                                                            builder3.copyOnWrite();
                                                            auat auatVar4 = (auat) builder3.instance;
                                                            auatVar4.b &= -129;
                                                            auatVar4.g = 0L;
                                                            auat auatVar5 = (auat) builder3.build();
                                                            aihf builder4 = auatVar2.toBuilder();
                                                            builder4.copyOnWrite();
                                                            auat auatVar6 = (auat) builder4.instance;
                                                            auatVar6.f = null;
                                                            auatVar6.b &= -9;
                                                            builder4.copyOnWrite();
                                                            auat auatVar7 = (auat) builder4.instance;
                                                            auatVar7.b &= -129;
                                                            auatVar7.g = 0L;
                                                            if (auatVar5.equals((auat) builder4.build())) {
                                                                aimy aimyVar = auatVar.f;
                                                                if (aimyVar == null) {
                                                                    aimyVar = aimy.a;
                                                                }
                                                                aimy aimyVar2 = auatVar2.f;
                                                                if (aimyVar2 == null) {
                                                                    aimyVar2 = aimy.a;
                                                                }
                                                                aihf builder5 = aimyVar.toBuilder();
                                                                builder5.copyOnWrite();
                                                                ((aimy) builder5.instance).e = aimy.emptyFloatList();
                                                                aimy aimyVar3 = (aimy) builder5.build();
                                                                aihf builder6 = aimyVar2.toBuilder();
                                                                builder6.copyOnWrite();
                                                                ((aimy) builder6.instance).e = aimy.emptyFloatList();
                                                                if (aimyVar3.equals((aimy) builder6.build()) && aimyVar.e.size() == aimyVar2.e.size()) {
                                                                    for (int i2 = 0; i2 < aimyVar.e.size(); i2++) {
                                                                        if (ahbd.c(aimyVar.e.d(i2), aimyVar2.e.d(i2), 1.0E-6d)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z2 = true;
                                                    }
                                                    return Boolean.valueOf(!z2);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }), aheyVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            listenableFutureR = ahng.m(new Exception("Comparing edits is not on an ImageProjectState"));
        }
        taf.k(unjVar, listenableFutureR, new tvj(twiVar, 15), new tvj(twiVar, 16));
    }
}
