package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.image.mediagen.MediaGenInputView;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uoq extends ups implements afnb, afxl {
    private upg a;
    private Context d;
    private boolean e;
    private final ahub f = new ahub((short[]) null);

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final upg peer() {
        upg upgVar = this.a;
        if (upgVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return upgVar;
    }

    @Override // defpackage.ups
    protected final /* bridge */ /* synthetic */ afpu b() {
        return new afpk(this, true);
    }

    @Override // defpackage.afxl
    public final afxj c(afxh afxhVar) {
        return this.f.k(afxhVar);
    }

    @Override // defpackage.ups, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = new afpe(this, super.getContext());
        }
        return this.d;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpt getDefaultViewModelCreationExtras() {
        bpv bpvVar = new bpv(super.getDefaultViewModelCreationExtras());
        bpvVar.b(bpd.c, new Bundle());
        return bpvVar;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return upg.class;
    }

    @Override // defpackage.ups, defpackage.afou, defpackage.cc
    public final void onAttach(Context context) {
        this.b.i();
        try {
            if (this.e) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.a == null) {
                upi upiVar = (upi) aguu.as(this, upi.class);
                afuu afuuVarE = afwt.e(66, uoq.class, "CreatePeer");
                try {
                    this.a = upiVar.q();
                    afuuVarE.close();
                    this.a.s = this;
                } catch (Throwable th) {
                    try {
                        afuuVarE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            afty.k();
        } catch (Throwable th3) {
            try {
                afty.k();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
        try {
            n(layoutInflater, viewGroup, bundle);
            final upg upgVarPeer = peer();
            upgVarPeer.f().b();
            int i = 0;
            View viewInflate = layoutInflater.inflate(R.layout.media_gen_image_editor_layout, viewGroup, false);
            Toolbar toolbar = (Toolbar) viewInflate.findViewById(R.id.toolbar);
            toolbar.s(new uit(upgVarPeer, 9));
            toolbar.l(R.menu.media_gen_image_editor_menu);
            upv upvVar = upgVarPeer.b;
            if ((upvVar.b & 1) != 0) {
                alay alayVar = upvVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                toolbar.v(ackj.k(null, alayVar, null, false));
            }
            upgVarPeer.m = toolbar.f().findItem(R.id.save_button);
            upgVarPeer.m(293233);
            upgVarPeer.m.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: uou
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final upg upgVar = upgVarPeer;
                    upgVar.d.b().ifPresentOrElse(new Consumer() { // from class: uox
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void r(Object obj) {
                            upg upgVar2 = upgVar;
                            uom uomVar = (uom) obj;
                            upgVar2.l(293233);
                            Optional optionalS = upg.s(uomVar.d.a);
                            if (optionalS.isEmpty()) {
                                twu.d("MediaGenImageEditorFragmentPeer", 6, "Invalid ImageEditResponse for save!", null);
                                return;
                            }
                            uoa uoaVar = upgVar2.o;
                            if (uoaVar != null) {
                                Uri uri = upgVar2.i;
                                aihf aihfVarCreateBuilder = upx.a.createBuilder();
                                String string = uri.toString();
                                aihfVarCreateBuilder.copyOnWrite();
                                upx upxVar = (upx) aihfVarCreateBuilder.instance;
                                string.getClass();
                                upxVar.b |= 1;
                                upxVar.c = string;
                                upw upwVar = upw.a;
                                aihf aihfVarCreateBuilder2 = upwVar.createBuilder();
                                String string2 = tyu.a(uomVar.b.getAbsolutePath()).toString();
                                aihfVarCreateBuilder2.copyOnWrite();
                                upw upwVar2 = (upw) aihfVarCreateBuilder2.instance;
                                string2.getClass();
                                upwVar2.b |= 1;
                                upwVar2.c = string2;
                                aigj aigjVar = ((akhb) optionalS.get()).e;
                                aihfVarCreateBuilder2.copyOnWrite();
                                upw upwVar3 = (upw) aihfVarCreateBuilder2.instance;
                                aigjVar.getClass();
                                upwVar3.b |= 2;
                                upwVar3.d = aigjVar;
                                aihfVarCreateBuilder.copyOnWrite();
                                upx upxVar2 = (upx) aihfVarCreateBuilder.instance;
                                upw upwVar4 = (upw) aihfVarCreateBuilder2.build();
                                upwVar4.getClass();
                                upxVar2.d = upwVar4;
                                upxVar2.b |= 2;
                                upx upxVar3 = (upx) aihfVarCreateBuilder.build();
                                Uri uri2 = uoaVar.C;
                                uri2.getClass();
                                vfb vfbVarA = uoaVar.e.a(uri2);
                                vfbVarA.getClass();
                                upw upwVar5 = upxVar3.d;
                                if (upwVar5 == null) {
                                    upwVar5 = upwVar;
                                }
                                Uri uri3 = Uri.parse(upwVar5.c);
                                if (uoaVar.E.l(65, 45751669L, false)) {
                                    unj unjVarB = uoaVar.b();
                                    if (unjVarB == null) {
                                        zvl zvlVar = uoaVar.g;
                                        zvj zvjVarA = zvk.a();
                                        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                                        zvjVarA.j = 70;
                                        zvjVarA.i = 278;
                                        zvjVarA.d("imageEditorFragment is null");
                                        zvlVar.a(zvjVarA.a());
                                    } else if (unjVarB.peer().k == null) {
                                        zvl zvlVar2 = uoaVar.g;
                                        zvj zvjVarA2 = zvk.a();
                                        zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                                        zvjVarA2.j = 70;
                                        zvjVarA2.i = 278;
                                        zvjVarA2.d("imageEditorController is null");
                                        zvlVar2.a(zvjVarA2.a());
                                    } else {
                                        qtt qttVar = vfbVarA.c;
                                        if (qttVar != null) {
                                            uri2 = qttVar.b.a;
                                        }
                                        vfbVarA.r(vfbVarA.h, uri3, false, qttVar);
                                        vfbVarA.s(uri3);
                                        vfbVarA.j = null;
                                        vfbVarA.l = false;
                                        unh unhVar = unjVarB.peer().k;
                                        unhVar.getClass();
                                        usd usdVarB = unhVar.t.b();
                                        if (usdVarB == null) {
                                            ((agrc) ((agrc) unh.a.b()).k("com/google/android/libraries/youtube/creation/editor/image/ImageEditorController", "updateCompositionImageSegment", 414, "ImageEditorController.java")).t("Unable to find the composition manager");
                                        } else {
                                            agke agkeVar = (agke) Collection.EL.stream(usdVarB.c().d).filter(new sde(14)).filter(new sco(uri2, 11)).collect(aghu.a);
                                            if (!agkeVar.isEmpty()) {
                                                Iterable$EL.forEach(agkeVar, new rew(usdVarB, uri3, 10));
                                                unhVar.d.i();
                                            }
                                        }
                                        zvl zvlVar3 = uoaVar.g;
                                        zvj zvjVarA3 = zvk.a();
                                        zvjVarA3.c(ajtv.ERROR_LEVEL_ERROR);
                                        zvjVarA3.j = 70;
                                        zvjVarA3.i = 278;
                                        zvjVarA3.d("Unable to update image segment");
                                        zvlVar3.a(zvjVarA3.a());
                                    }
                                }
                                upw upwVar6 = upxVar3.d;
                                if (upwVar6 != null) {
                                    upwVar = upwVar6;
                                }
                                vfbVarA.d = new vex(uri3, upwVar.d);
                                uoaVar.C.getClass();
                                uoaVar.j();
                                MediaGenInputView mediaGenInputView = (MediaGenInputView) uoaVar.a.requireView().findViewById(R.id.media_gen_image_editor);
                                mediaGenInputView.getClass();
                                mediaGenInputView.peer().h("", false);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new ull(upgVar, 5));
                    upgVar.n();
                    return true;
                }
            });
            MediaGenInputView mediaGenInputView = (MediaGenInputView) viewInflate.findViewById(R.id.ai_image_editor_text_layer);
            mediaGenInputView.getClass();
            if ((upvVar.b & SemanticState.Focused) != 0) {
                upu upuVar = upvVar.j;
                if (upuVar == null) {
                    upuVar = upu.a;
                }
                if ((upuVar.b & 2) != 0) {
                    upgVarPeer.m(upuVar.d);
                }
                Button button = (Button) viewInflate.requireViewById(R.id.ai_image_edit_retry_button);
                alay alayVar2 = upuVar.c;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                button.setText(ackj.k(null, alayVar2, null, false));
                button.setVisibility(0);
                View viewRequireViewById = viewInflate.requireViewById(R.id.ai_image_edit_bottom_controller_container);
                viewRequireViewById.setBackground(null);
                tym.h(viewRequireViewById, new uov(), asb.class);
                mediaGenInputView.setVisibility(8);
            } else {
                mediaGenInputView.peer().t(upgVarPeer.p);
                mediaGenInputView.peer().j(new uow(upgVarPeer, i));
                upo upoVarPeer = mediaGenInputView.peer();
                apgr apgrVar = upvVar.k;
                if (apgrVar == null) {
                    apgrVar = apgr.a;
                }
                alay alayVar3 = apgrVar.d;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                upoVarPeer.g(alayVar3);
                upo upoVarPeer2 = mediaGenInputView.peer();
                apgr apgrVar2 = upvVar.k;
                if (apgrVar2 == null) {
                    apgrVar2 = apgr.a;
                }
                apgz apgzVar = apgrVar2.f;
                if (apgzVar == null) {
                    apgzVar = apgz.a;
                }
                upoVarPeer2.k(apgzVar);
            }
            TextView textViewE = upgVarPeer.e(viewInflate);
            apgr apgrVar3 = upvVar.k;
            if (apgrVar3 == null) {
                apgrVar3 = apgr.a;
            }
            alay alayVar4 = apgrVar3.e;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
            textViewE.setText(ackj.k(null, alayVar4, null, false));
            if (upgVarPeer.i.toString().isEmpty()) {
                mediaGenInputView.setVisibility(8);
                twu.d("MediaGenImageEditorFragmentPeer", 6, "Input image is missing", null);
            } else {
                if (upgVarPeer.g.s()) {
                    toolbar.r(upgVarPeer.a(arqz.er, R.attr.ytOverlayIconActiveOther));
                }
                View viewFindViewById = viewInflate.findViewById(R.id.ai_image_edit_feedback_container);
                if (viewFindViewById != null) {
                    qcb qcbVar = upgVarPeer.q;
                    uon uonVar = upgVarPeer.d;
                    Object obj = qcbVar.a;
                    upgVarPeer.l = new uoo(viewFindViewById, uonVar, (adxj) ((gif) obj).a.Ad.io(), (vxe) ((gif) obj).d.i.io());
                }
            }
            if (viewInflate == null) {
                throw new IllegalStateException("Fragments without views cannot use Android event listeners such as @OnClick, @OnCheckedChange, @OnLongClick, etc.");
            }
            afty.k();
            return viewInflate;
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onDestroyView() {
        afvn afvnVarC = this.b.c();
        try {
            h();
            upg upgVarPeer = peer();
            upgVarPeer.g();
            upgVarPeer.o = null;
            ImageView imageViewD = upgVarPeer.d();
            if (imageViewD != null && upgVarPeer.k != null) {
                ViewTreeObserver viewTreeObserver = imageViewD.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = upgVarPeer.k;
                onGlobalLayoutListener.getClass();
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                upgVarPeer.k = null;
            }
            upgVarPeer.f().a();
            if (getView() == null) {
                this.f.l();
            }
            afvnVarC.close();
        } catch (Throwable th) {
            try {
                afvnVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onDetach() {
        afvn afvnVarB = this.b.b();
        try {
            i();
            this.e = true;
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ups, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.b.i();
        try {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(new afpe(this, layoutInflaterOnGetLayoutInflater));
            afty.k();
            return layoutInflaterCloneInContext;
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        this.b.i();
        try {
            afxk afxkVarA = afxw.A(this);
            afxkVarA.b = view;
            afxkVarA.b.findViewById(R.id.ai_image_edit_retry_button).setOnClickListener(new aena(afxkVarA, new aeni(17), new uit(peer(), 10, null), 3));
            peer();
            view.getClass();
            upg upgVarPeer = peer();
            ImageView imageViewD = upgVarPeer.d();
            imageViewD.getClass();
            imageViewD.setImageURI(upgVarPeer.i);
            upgVarPeer.k = new uoy(upgVarPeer, imageViewD, 0);
            ViewTreeObserver viewTreeObserver = imageViewD.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = upgVarPeer.k;
            onGlobalLayoutListener.getClass();
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            upgVarPeer.c().setOnClickListener(new uit(upgVarPeer, 7));
            upgVarPeer.b().setOnClickListener(new uit(upgVarPeer, 8));
            upgVarPeer.r();
            upv upvVar = upgVarPeer.b;
            apgr apgrVar = upvVar.k;
            if (apgrVar == null) {
                apgrVar = apgr.a;
            }
            boolean z = (apgrVar.b & 16) != 0;
            boolean zD = yno.D(upvVar.h);
            boolean zD2 = yno.D(upvVar.g);
            if (!z && zD && zD2) {
                upgVarPeer.p(false);
                upgVarPeer.q("", true);
            } else {
                if (!zD2) {
                    upgVarPeer.q(upvVar.g, false);
                }
                if (z) {
                    apgr apgrVar2 = upvVar.k;
                    if (apgrVar2 == null) {
                        apgrVar2 = apgr.a;
                    }
                    apgs apgsVar = apgrVar2.g;
                    if (apgsVar == null) {
                        apgsVar = apgs.a;
                    }
                    alay alayVar = upvVar.i;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    upgVarPeer.i(new uog(apgsVar, alayVar), false);
                } else {
                    upgVarPeer.h(!zD ? upvVar.h : upvVar.g);
                }
            }
            uoq uoqVar = upgVarPeer.a;
            uoqVar.requireActivity().getOnBackPressedDispatcher().c(uoqVar, new uoz(upgVarPeer));
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cc
    public final void setArguments(Bundle bundle) {
        boolean z = true;
        if (getArguments() != null && getArguments() != bundle) {
            z = false;
        }
        ahno.P(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.setArguments(bundle);
    }

    @Override // defpackage.ups, defpackage.cc
    public final void onAttach(Activity activity) {
        this.b.i();
        try {
            super.onAttach(activity);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
