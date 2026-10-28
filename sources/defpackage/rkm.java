package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.widget.Toolbar;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rkm extends rkv implements DialogInterface, View.OnClickListener, rkn, rnd {
    public aapw A;
    public wjr B;
    private RelativeLayout D;
    private View E;
    private Context F;
    private int G;
    public ajqb l;
    public acxt m;
    public acyx n;
    public vxe o;
    public ttm p;
    public wbz q;
    public Executor r;
    public tbt s;
    public xgn t;
    public ajwo u;
    public rkt v;
    public rmy w;
    public vxz x;
    public vxz y;
    public vxz z;
    static final String k = "channel_creation_renderers" + Process.myPid();
    private static final String C = wfs.g(ajpx.b.a(), "channel_creation_form_status");

    public static rkm p(byte[] bArr, int i, byte[] bArr2, xgn xgnVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("source", i - 1);
        if (bArr != null) {
            bundle.putByteArray("token", bArr);
        }
        if (bArr2 != null) {
            bundle.putByteArray(k, bArr2);
        }
        bundle.putInt("style", R.style.ThemeOverlay_YouTubeMusic_Dialog_ChannelCreation);
        bundle.putInt("account_icon", R.drawable.yt_outline_person_circle_white_24);
        bundle.putBoolean("hide_toast", true);
        bundle.putInt("ok_button_style", R.style.ChannelCreation_PositiveButtonStyle);
        rkm rkmVar = new rkm();
        rkmVar.setArguments(bundle);
        rkmVar.t = xgnVar;
        return rkmVar;
    }

    private final ajpu s() {
        ajpw ajpwVarT = t();
        return ajpwVarT != null ? ajpw.e(ajpwVarT.c) : ajpw.f(C);
    }

    private final ajpw t() {
        return (ajpw) this.q.c().g(C).g(ajpw.class).E();
    }

    private final void u() {
        super.iQ(false, false, false);
        this.v.d();
    }

    private final void v(aonc aoncVar, String str, Uri uri) {
        ajpu ajpuVarS = s();
        ajpuVarS.ao(aoncVar);
        if (str != null) {
            ajpuVarS.am(str);
        }
        if (uri != null) {
            ajpuVarS.an(uri.toString());
        }
        wer werVarE = this.q.c().e();
        werVarE.m(ajpuVarS);
        werVarE.b().D();
    }

    private final boolean w() {
        int i = this.G;
        return i == 43 || i == 44 || i == 41 || i == 42 || i == 39 || i == 40;
    }

    private final boolean x() {
        return this.x.m(4, 45428282L);
    }

    private final void y() {
        this.E.setVisibility(8);
        RelativeLayout relativeLayout = this.D;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        onCancel(null);
        super.iQ(false, false, false);
    }

    @tcc
    void handleAddToToastEvent(vvr vvrVar) {
        agev agevVar = vvrVar.a;
        if (agevVar.g()) {
            alay alayVar = ((aoda) agevVar.c()).c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            if (TextUtils.isEmpty(spannedK)) {
                return;
            }
            tuk.o(getActivity(), spannedK, 1);
        }
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        if (w()) {
            super.iQ(false, false, true);
        }
    }

    @Override // defpackage.rkn
    public final void i(ajwo ajwoVar) {
        wor worVarI = this.A.i();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajqf.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        ajqf ajqfVar = (ajqf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        worVarI.a = ajqfVar.d;
        if ((ajqfVar.c & 8) != 0) {
            alml almlVar = ajqfVar.g;
            if (almlVar == null) {
                almlVar = alml.a;
            }
            worVarI.c = almlVar;
        }
        if ((ajqfVar.c & 16) != 0) {
            int iAS = a.aS(ajqfVar.h);
            if (iAS == 0) {
                iAS = 2;
            }
            worVarI.d = iAS;
        }
        this.v.c();
        taf.k(this, this.A.j(worVarI, this.r), new jlz(this, 10), new hcq(this, ajqfVar, 14));
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        if (!w()) {
            return super.iH(bundle);
        }
        gr grVar = new gr(requireContext(), this.b);
        grVar.getOnBackPressedDispatcher().c(this, new rkl());
        return grVar;
    }

    public final /* synthetic */ void j(Throwable th) {
        super.iQ(false, false, false);
        this.p.e(th);
        this.v.b();
    }

    public final /* synthetic */ void k(ajqf ajqfVar, almo almoVar) {
        almoVar.getClass();
        Bundle arguments = getArguments();
        boolean z = arguments != null && arguments.getBoolean("hide_toast");
        if ((almoVar.b & 8) != 0) {
            almn almnVar = almoVar.f;
            if (almnVar == null) {
                almnVar = almn.a;
            }
            alay alayVar = almnVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            String string = ackj.k(null, alayVar, null, false).toString();
            almn almnVar2 = almoVar.f;
            if (almnVar2 == null) {
                almnVar2 = almn.a;
            }
            int iBi = a.bi(almnVar2.b);
            if (iBi == 0 || iBi != 3) {
                y();
                this.p.d(string);
                ajpu ajpuVarS = s();
                Boolean bool = Boolean.FALSE;
                aihf aihfVar = ajpuVarS.a;
                bool.booleanValue();
                aihfVar.copyOnWrite();
                ajpx ajpxVar = (ajpx) aihfVar.instance;
                ajpx ajpxVar2 = ajpx.a;
                ajpxVar.c |= 2;
                ajpxVar.e = false;
                wer werVarE = this.q.c().e();
                werVarE.m(ajpuVarS);
                werVarE.b().D();
                return;
            }
            this.p.d(string);
            z = true;
        }
        aisc aiscVar = almoVar.e;
        if (aiscVar == null) {
            aiscVar = aisc.b;
        }
        boolean z2 = aiscVar.c;
        if (z2 && !z) {
            tuk.n(getActivity(), rlh.c(ajqfVar, this.y), 1);
        }
        super.iQ(false, false, false);
        rkt rktVar = this.v;
        if (z2) {
            int iAq = ahng.aq(ajqfVar.f);
            rktVar.e(iAq != 0 ? iAq : 1);
        } else {
            rktVar.b();
        }
        if ((almoVar.b & 2) != 0) {
            vxe vxeVar = this.o;
            ajwo ajwoVar = almoVar.d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
    }

    public final /* synthetic */ void l(Throwable th) {
        this.v.b();
        this.p.e(th);
        super.iQ(true, false, false);
    }

    @Override // defpackage.rnd
    public final /* synthetic */ void m(int i) {
        n(i, null, null);
    }

    @Override // defpackage.rnd
    public final void n(int i, String str, Uri uri) {
        if (i == 1) {
            v(aonc.PHOTO_UPLOAD_STATUS_UPLOADING, null, null);
            return;
        }
        if (i == 2) {
            v(aonc.PHOTO_UPLOAD_STATUS_UNSPECIFIED, str, uri);
        } else if (i == 4) {
            v(aonc.PHOTO_UPLOAD_STATUS_UNSPECIFIED, null, null);
        } else {
            this.p.d(getString(R.string.image_upload_error));
            v(aonc.PHOTO_UPLOAD_STATUS_FAILED, null, null);
        }
    }

    public final void o(ajqb ajqbVar) {
        if (isAdded()) {
            y();
            if ((ajqbVar.b & 8) == 0) {
                if (this.u == null) {
                    u();
                    return;
                }
                super.iQ(false, false, false);
                vxe vxeVar = this.o;
                ajwo ajwoVar = this.u;
                ajwoVar.getClass();
                vxeVar.a(ajwoVar);
                return;
            }
            akrn akrnVar = ajqbVar.c;
            if (akrnVar == null) {
                akrnVar = akrn.a;
            }
            adly adlyVar = new adly();
            xgn xgnVar = this.t;
            if (xgnVar != null) {
                adlyVar.a(xgnVar);
            }
            if (!x() && (t() == null || t().getChannelCreationHeaderState() != ajpy.CHANNEL_CREATION_HEADER_STATE_ELEMENTS)) {
                Toolbar toolbar = (Toolbar) requireView().findViewById(R.id.toolbar);
                toolbar.setVisibility(0);
                toolbar.getClass();
                Drawable drawableE = toolbar.e();
                drawableE.getClass();
                new ttk(this.F);
                toolbar.r(ttk.b(drawableE, tzk.n(this.F, R.attr.ytIconActiveOther).orElse(0)));
                toolbar.s(this);
                toolbar.v(getString(R.string.channel_creation_title2));
                toolbar.requestLayout();
            }
            this.m.h(adlyVar, this.n.c(akrnVar), false, false);
            this.D.addView(this.m.a());
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        ajqb ajqbVar = this.l;
        if (ajqbVar != null) {
            o(ajqbVar);
            return;
        }
        if (!this.y.l(40, 45708317L, false)) {
            taf.k(this, this.A.k(requireArguments().getByteArray("token"), this.G, x(), this.r), new jlz(this, 11), new jlz(this, 12));
            return;
        }
        getArguments().getClass();
        byte[] byteArray = getArguments().getByteArray(k);
        if (byteArray == null) {
            u();
            return;
        }
        ajqb ajqbVar2 = (ajqb) this.B.D(byteArray, ajqb.a);
        this.l = ajqbVar2;
        o(ajqbVar2);
    }

    @Override // defpackage.rkv, defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.F = context;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.v.a();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cancel();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.s.f(this);
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray(k);
            if (byteArray != null) {
                this.l = (ajqb) this.B.D(byteArray, ajqb.a);
            }
            byte[] byteArray2 = bundle.getByteArray("next_endpoint");
            if (byteArray2 != null) {
                try {
                    this.u = (ajwo) aihn.parseFrom(ajwo.a, byteArray2, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik e) {
                    Log.e("ChannelCreation", "Failed to deserialize nextEndpoint command.", e);
                }
            }
        }
        iO(0, R.style.ChannelCreation_FullScreen);
        getArguments().getClass();
        int iAq = ahng.aq(getArguments().getInt("source"));
        if (iAq == 0) {
            iAq = 1;
        }
        this.G = iAq;
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.channel_creation_element_container, viewGroup, false);
        this.D = (RelativeLayout) viewInflate.findViewById(R.id.element_layout);
        ((Toolbar) viewInflate.findViewById(R.id.toolbar)).setVisibility(8);
        this.E = viewInflate.findViewById(R.id.progress_bar);
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        super.onDestroy();
        this.m.b(null);
        this.s.l(this);
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.z.l(278, 45824811L, false)) {
            this.m.b(null);
        }
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        rkt rktVar = this.v;
        rktVar.g = null;
        rktVar.b.a();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        ajqb ajqbVar = this.l;
        if (ajqbVar != null) {
            bundle.putByteArray(k, ajqbVar.toByteArray());
        }
        ajwo ajwoVar = this.u;
        if (ajwoVar != null) {
            bundle.putByteArray("next_endpoint", ajwoVar.toByteArray());
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        this.w.b.add(this);
    }
}
