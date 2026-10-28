package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.mediapicker.greenscreen.GreenScreenMediaPickerView;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uns extends uod implements afnb, afxl {
    public final ahub a = new ahub((short[]) null);
    private uoa d;
    private Context e;
    private boolean f;

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uoa peer() {
        uoa uoaVar = this.d;
        if (uoaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return uoaVar;
    }

    @Override // defpackage.uod
    protected final /* bridge */ /* synthetic */ afpu b() {
        return new afpk(this, true);
    }

    @Override // defpackage.afxl
    public final afxj c(afxh afxhVar) {
        return this.a.k(afxhVar);
    }

    @Override // defpackage.uod, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        if (this.e == null) {
            this.e = new afpe(this, super.getContext());
        }
        return this.e;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpt getDefaultViewModelCreationExtras() {
        bpv bpvVar = new bpv(super.getDefaultViewModelCreationExtras());
        bpvVar.b(bpd.c, new Bundle());
        return bpvVar;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return uoa.class;
    }

    @Override // defpackage.uod, defpackage.afou, defpackage.cc
    public final void onAttach(Context context) {
        this.b.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.d == null) {
                uob uobVar = (uob) aguu.as(this, uob.class);
                afuu afuuVarE = afwt.e(65, uns.class, "CreatePeer");
                try {
                    this.d = uobVar.p();
                    afuuVarE.close();
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
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.b.i();
        try {
            f(bundle);
            uoa uoaVarPeer = peer();
            if (uoaVarPeer.E.l(56, 45726969L, false)) {
                uoaVarPeer.y = new unw(uoaVarPeer);
                uns unsVar = uoaVarPeer.a;
                unsVar.requireActivity().getOnBackPressedDispatcher().c(unsVar, uoaVarPeer.y);
            }
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

    @Override // defpackage.afou, defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vcz vczVarA;
        ViewGroup viewGroup2;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        this.b.i();
        try {
            n(layoutInflater, viewGroup, bundle);
            uoa uoaVarPeer = peer();
            View viewInflate = layoutInflater.inflate(R.layout.multi_image_editor_fragment, viewGroup, false);
            upz upzVar = uoaVarPeer.h;
            ahno.G(upzVar.c.size() > 0, "ImageEditorInput did not have any images.");
            uoaVarPeer.w = (agkj) Collection.EL.stream(upzVar.c).collect(aghu.b(new snm(15), new snm(16), new hnh(8)));
            unf unfVar = uoaVarPeer.i;
            if (unfVar.e) {
                GreenScreenMediaPickerView greenScreenMediaPickerView = (GreenScreenMediaPickerView) viewInflate.findViewById(R.id.green_screen_media_picker_view);
                HorizontalScrollView horizontalScrollView = greenScreenMediaPickerView.a;
                LinearLayout linearLayout = greenScreenMediaPickerView.b;
                Context context = uoaVarPeer.c;
                Executor executor = uoaVarPeer.d;
                roq roqVar = uoaVarPeer.G;
                qcb qcbVar = new qcb(uoaVarPeer);
                xsc xscVar = uoaVarPeer.F;
                qcb qcbVar2 = uoaVarPeer.J;
                boolean z = unfVar.j;
                if (z) {
                    vcy vcyVarA = vcz.a();
                    vcyVarA.c(false);
                    vcyVarA.d(false);
                    vcyVarA.b(true);
                    vcyVarA.a = Optional.of(Integer.valueOf(R.dimen.multi_image_editor_thumbnail_list_item_view_size));
                    vcyVarA.b = Optional.of(Integer.valueOf(R.dimen.multi_image_editor_thumbnail_list_item_outline_size));
                    vcyVarA.c = Optional.of(Integer.valueOf(R.drawable.multi_image_editor_thumbnail_list_item_border));
                    vcyVarA.d = Optional.of(Integer.valueOf(R.dimen.multi_image_editor_thumbnail_list_item_horizontal_margin));
                    vcyVarA.e(uoaVarPeer.o);
                    vczVarA = vcyVarA.a();
                } else {
                    vcy vcyVarA2 = vcz.a();
                    vcyVarA2.c(false);
                    vcyVarA2.d(false);
                    vcyVarA2.b(false);
                    vcyVarA2.e(uoaVarPeer.o);
                    vczVarA = vcyVarA2.a();
                }
                uoaVarPeer.B = new vda(context, horizontalScrollView, linearLayout, executor, roqVar, qcbVar, xscVar, qcbVar2, vczVarA, uoaVarPeer.m, uoaVarPeer.n, uoaVarPeer.p, uoaVarPeer.g);
                agjz agjzVar = new agjz(4);
                int i = 0;
                for (uqa uqaVar : upzVar.c) {
                    Uri uri = Uri.parse(uqaVar.b);
                    Uri uriA = uoaVarPeer.a(uri);
                    int i2 = i + 1;
                    long j = i;
                    ujh ujhVarA = uji.a();
                    ujhVarA.f(j);
                    ujhVarA.j(uriA);
                    ujhVarA.d(1);
                    ujhVarA.i(0L);
                    ujhVarA.c(0L);
                    ujhVarA.g(0L);
                    ujhVarA.b("");
                    aljj aljjVar = uqaVar.f;
                    if (aljjVar == null) {
                        aljjVar = aljj.a;
                    }
                    ujhVarA.b = aljjVar;
                    agjzVar.h(ujhVarA.a());
                    uoaVarPeer.z.put(uriA, uri);
                    i = i2;
                }
                vda vdaVar = uoaVarPeer.B;
                agke agkeVarG = agjzVar.g();
                Optional optionalEmpty = Optional.empty();
                Optional optionalEmpty2 = Optional.empty();
                int i3 = 0;
                while (true) {
                    viewGroup2 = vdaVar.c;
                    if (i3 >= viewGroup2.getChildCount()) {
                        break;
                    }
                    ImageView imageView = (ImageView) viewGroup2.getChildAt(i3).findViewById(R.id.green_screen_media_item_thumbnail);
                    if (imageView != null) {
                        if (vdaVar.j.h) {
                            vdaVar.l.f(imageView);
                        } else if ((imageView.getDrawable() instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) imageView.getDrawable()) != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                            bitmap.recycle();
                        }
                    }
                    i3++;
                }
                viewGroup2.removeAllViews();
                vdaVar.e.clear();
                ArrayList arrayList = vdaVar.i;
                arrayList.clear();
                HashMap map = vdaVar.f;
                map.clear();
                vcz vczVar = vdaVar.j;
                if (vczVar.c) {
                    vdaVar.b.setFillViewport(true);
                    if (!(viewGroup2 instanceof LinearLayout)) {
                        throw new IllegalStateException("parent must be a LinearLayout if centerHorizontal is true");
                    }
                    ((LinearLayout) viewGroup2).setGravity(1);
                }
                vdaVar.g = new ArrayList(agkeVarG);
                if (vczVar.a) {
                    if (vdaVar.o == null) {
                        View viewB = vdaVar.b(R.layout.green_screen_deselect_list_item);
                        if (viewB != null) {
                            if (vdaVar.k) {
                                View viewFindViewById = viewB.findViewById(R.id.green_screen_media_deselect_icon);
                                Drawable drawableA = vdaVar.a(arqz.gg);
                                if (drawableA != null && viewFindViewById != null) {
                                    viewFindViewById.setBackground(drawableA);
                                }
                            }
                            viewB.setOnClickListener(new uit(vdaVar, 17));
                        }
                        if (viewB != null) {
                            vdaVar.o = vdaVar.f(viewB);
                        }
                    }
                    xsc xscVar2 = vdaVar.o;
                    if (xscVar2 != null) {
                        viewGroup2.addView((View) xscVar2.a);
                    }
                }
                optionalEmpty.isPresent();
                ArrayList arrayList2 = vdaVar.g;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size) {
                        uji ujiVar = (uji) arrayList2.get(i4);
                        ArrayList arrayList3 = arrayList2;
                        map.put(ujiVar.b, ujiVar);
                        if (i5 < 30) {
                            optionalEmpty2.isPresent();
                            View viewE = vdaVar.e(ujiVar);
                            if (viewE != null) {
                                viewGroup2.addView(viewE);
                                i5++;
                            }
                        }
                        i4++;
                        arrayList2 = arrayList3;
                    }
                }
                if (vczVar.b && vdaVar.g != null) {
                    if (vdaVar.h == null) {
                        View viewB2 = vdaVar.b(R.layout.green_screen_more_media_list_item);
                        if (viewB2 != null) {
                            if (vdaVar.k) {
                                View viewFindViewById2 = viewB2.findViewById(R.id.green_screen_more_media_icon);
                                Drawable drawableA2 = vdaVar.a(arqz.ii);
                                if (drawableA2 != null && viewFindViewById2 != null) {
                                    viewFindViewById2.setBackground(drawableA2);
                                }
                            }
                            viewB2.setOnClickListener(new iks(7));
                        }
                        vdaVar.h = viewB2;
                    }
                    View view = vdaVar.h;
                    if (view != null) {
                        arrayList.add(view);
                    }
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    viewGroup2.addView((View) arrayList.get(i6));
                }
                if (viewGroup2.getChildCount() > 0) {
                    int dimensionPixelSize = vdaVar.a.getResources().getDimensionPixelSize(R.dimen.green_screen_media_item_first_last_item_margin);
                    View childAt = viewGroup2.getChildAt(0);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.getClass();
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(dimensionPixelSize);
                    childAt.setLayoutParams(layoutParams2);
                    View childAt2 = viewGroup2.getChildAt(viewGroup2.getChildCount() - 1);
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    layoutParams3.getClass();
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.setMarginEnd(dimensionPixelSize);
                    childAt2.setLayoutParams(layoutParams4);
                }
                if (!z) {
                    viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new unx(uoaVarPeer, viewInflate, greenScreenMediaPickerView));
                }
            }
            if (unfVar.g) {
                vxz vxzVar = uoaVarPeer.E;
                uoaVarPeer.x = Optional.of(new unr(vxzVar, vxzVar.l(72, 45791091L, false)));
            }
            if (upzVar.c.size() > 0) {
                uoaVarPeer.g(Uri.parse(((uqa) upzVar.c.get(upzVar.d)).b));
            } else {
                zvl zvlVar = uoaVarPeer.g;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 70;
                zvjVarA.i = 278;
                zvjVarA.d("ImageEditorInput is null or empty");
                zvlVar.a(zvjVarA.a());
            }
            byte[] bArr = null;
            if ((upzVar.b & 8) != 0) {
                if (unfVar.j) {
                    aeez aeezVar = uoaVarPeer.s;
                    aefb aefbVarA = aeezVar.a();
                    alay alayVar = upzVar.g;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    aefbVarA.k(ackj.k(null, alayVar, null, false));
                    aefbVarA.i(0);
                    aeezVar.d(aefbVarA.b());
                } else {
                    YouTubeAppCompatTextView youTubeAppCompatTextView = (YouTubeAppCompatTextView) viewInflate.findViewById(R.id.image_editor_edu);
                    alay alayVar2 = upzVar.g;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                    youTubeAppCompatTextView.setText(ackj.k(null, alayVar2, null, false));
                    youTubeAppCompatTextView.setVisibility(0);
                }
            }
            if (uoaVarPeer.i()) {
                a.ap(uoaVarPeer.q.b, new qcb(uoaVarPeer, bArr));
                uoaVarPeer.r.isPresent();
            }
            if (viewInflate == null) {
                peer();
                yno.gF(this);
            }
            afty.k();
            return viewInflate;
        } catch (Throwable th) {
            try {
                afty.k();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onDestroyView() {
        afvn afvnVarC = this.b.c();
        try {
            h();
            peer().A = null;
            if (getView() == null) {
                this.a.l();
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
            this.f = true;
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

    @Override // defpackage.uod, defpackage.cc
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.afou, defpackage.cc
    public final void onPause() {
        this.b.i();
        try {
            j();
            uoa uoaVarPeer = peer();
            if (uoaVarPeer.i()) {
                zf zfVar = uoaVarPeer.H;
                unc uncVar = uoaVarPeer.q;
                zfVar.a.remove(uncVar);
                uncVar.a = false;
            }
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

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.afou, defpackage.cc
    public final void onResume() {
        afvn afvnVarC = this.b.c();
        try {
            k();
            uoa uoaVarPeer = peer();
            if (uoaVarPeer.i()) {
                zf zfVar = uoaVarPeer.H;
                unc uncVar = uoaVarPeer.q;
                zfVar.a.add(uncVar);
                uncVar.a = true;
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
    public final void onViewCreated(View view, Bundle bundle) {
        this.b.i();
        try {
            afxw.A(this).b = view;
            peer();
            peer();
            yno.gF(this);
            view.getClass();
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

    @Override // defpackage.uod, defpackage.cc
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
