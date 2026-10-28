package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdy extends vec implements afnb {
    private vea a;
    private Context d;
    private boolean e;

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vea peer() {
        vea veaVar = this.a;
        if (veaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return veaVar;
    }

    @Override // defpackage.vec
    protected final /* bridge */ /* synthetic */ afpu b() {
        return new afpk(this, true);
    }

    @Override // defpackage.vec, defpackage.cc
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
        return vea.class;
    }

    @Override // defpackage.vec, defpackage.afou, defpackage.cc
    public final void onAttach(Context context) {
        this.b.i();
        try {
            if (this.e) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.a == null) {
                veb vebVar = (veb) aguu.as(this, veb.class);
                afuu afuuVarE = afwt.e(67, vdy.class, "CreatePeer");
                try {
                    this.a = vebVar.s();
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

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.afou, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.b.i();
        try {
            f(bundle);
            final vea veaVarPeer = peer();
            vdy vdyVar = veaVarPeer.c;
            final int i = 3;
            veaVarPeer.f = vdyVar.registerForActivityResult(new rr(), new rb() { // from class: vdz
                @Override // defpackage.rb
                public final void a(Object obj) {
                    ra raVar = (ra) obj;
                    int i2 = raVar.a;
                    vea veaVar = veaVarPeer;
                    if (i2 != -1) {
                        if (i2 != 0) {
                            ((agrc) ((agrc) vea.a.b()).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "getImageActivityResultCallback", 282, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Activity returned an invalid result code");
                            return;
                        } else {
                            veaVar.f();
                            return;
                        }
                    }
                    int i3 = i;
                    Intent intent = raVar.b;
                    if (i3 == 3) {
                        if (intent == null || intent.getData() == null) {
                            ((agrc) ((agrc) vea.a.b()).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "handleImageActivityResult", 294, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Failed to get image data from gallery");
                            return;
                        }
                        veaVar.h = intent.getData();
                    }
                    veaVar.i(i3);
                }
            });
            final int i2 = 2;
            veaVarPeer.g = vdyVar.registerForActivityResult(new rr(), new rb() { // from class: vdz
                @Override // defpackage.rb
                public final void a(Object obj) {
                    ra raVar = (ra) obj;
                    int i3 = raVar.a;
                    vea veaVar = veaVarPeer;
                    if (i3 != -1) {
                        if (i3 != 0) {
                            ((agrc) ((agrc) vea.a.b()).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "getImageActivityResultCallback", 282, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Activity returned an invalid result code");
                            return;
                        } else {
                            veaVar.f();
                            return;
                        }
                    }
                    int i4 = i2;
                    Intent intent = raVar.b;
                    if (i4 == 3) {
                        if (intent == null || intent.getData() == null) {
                            ((agrc) ((agrc) vea.a.b()).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "handleImageActivityResult", 294, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Failed to get image data from gallery");
                            return;
                        }
                        veaVar.h = intent.getData();
                    }
                    veaVar.i(i4);
                }
            });
            veaVarPeer.m.f.add(veaVarPeer);
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
        this.b.i();
        try {
            n(layoutInflater, viewGroup, bundle);
            vea veaVarPeer = peer();
            veaVarPeer.e.b(xhb.a(233471), null, null);
            View viewInflate = layoutInflater.inflate(R.layout.custom_thumbnail_creation_fragment, viewGroup, false);
            if (((vxz) veaVarPeer.j.io()).l(16, 45680787L, false)) {
                viewInflate.setClickable(true);
                try {
                    veaVarPeer.k = veaVarPeer.b.getWindow().getAttributes().softInputMode;
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) vea.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/playlist/CustomThumbnailCreationFragmentPeer", "onCreateView", (char) 194, "CustomThumbnailCreationFragmentPeer.java")).t("CustomThumbnailCreationFragmentPeer: Failed to get the soft input mode");
                }
                veaVarPeer.b.getWindow().setSoftInputMode(16);
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

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.afou, defpackage.cc
    public final void onDestroyView() {
        afvn afvnVarC = this.b.c();
        try {
            h();
            vea veaVarPeer = peer();
            if (((vxz) veaVarPeer.j.io()).l(16, 45680787L, false)) {
                veaVarPeer.b.getWindow().setSoftInputMode(veaVarPeer.k);
            }
            veaVarPeer.m.f.remove(veaVarPeer);
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

    @Override // defpackage.vec, defpackage.cc
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
            view.getClass();
            peer().e();
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

    @Override // defpackage.vec, defpackage.cc
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
