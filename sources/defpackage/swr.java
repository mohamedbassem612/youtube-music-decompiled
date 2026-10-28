package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swr extends svz implements acwm, adzw, str {
    public adhv k;
    public vxe l;
    public xgn m;
    public stu n;
    public tbt o;
    public afip p;
    private ajnf q;
    private aqtb r;

    private final void k(TextView textView, ajng ajngVar, Map map) {
        aeaa aeaaVarD = this.p.d(textView);
        ajnf ajnfVar = null;
        if (ajngVar != null && (ajngVar.b & 1) != 0 && (ajnfVar = ajngVar.c) == null) {
            ajnfVar = ajnf.a;
        }
        aeaaVarD.a(ajnfVar, this.m, map);
        aeaaVarD.c = this;
    }

    @Override // defpackage.acwm
    public final void b() {
        super.iQ(false, false, false);
    }

    @Override // defpackage.str
    public final void d() {
        super.iQ(true, false, false);
    }

    @Override // defpackage.str
    public final void e() {
        super.iQ(true, false, false);
    }

    @Override // defpackage.stt
    public final boolean f() {
        return true;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        gr grVar = new gr(requireContext(), this.b);
        grVar.getOnBackPressedDispatcher().c(this, new swq(this));
        return grVar;
    }

    @Override // defpackage.adzw
    public final void iP(aihh aihhVar) {
        if (aihhVar == null || !((ajnf) aihhVar.build()).equals(this.q)) {
            return;
        }
        ajwo ajwoVar = this.q.r;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqsx.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return;
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(0, R.style.UnlimitedFamily);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajnf ajnfVar;
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        try {
            this.r = (aqtb) aihn.parseFrom(aqtb.a, bundle.getByteArray("UnlimitedFamilyMessageInterstitialRenderer"), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
        }
        if (this.r == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.family_post_purchase_fragment_view, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.thumb_image_view);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.content);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.footer);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.action);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.dismiss);
        HashMap map = new HashMap();
        map.put("confirmDialogControllerListener", this);
        ajng ajngVar = this.r.h;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        k(textView4, ajngVar, null);
        ajng ajngVar2 = this.r.g;
        if (ajngVar2 == null) {
            ajngVar2 = ajng.a;
        }
        k(textView5, ajngVar2, map);
        ajng ajngVar3 = this.r.h;
        if (((ajngVar3 == null ? ajng.a : ajngVar3).b & 1) != 0) {
            if (ajngVar3 == null) {
                ajngVar3 = ajng.a;
            }
            ajnfVar = ajngVar3.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
        } else {
            ajnfVar = null;
        }
        this.q = ajnfVar;
        aqtb aqtbVar = this.r;
        if ((aqtbVar.b & 2) != 0) {
            alayVar = aqtbVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        aqtb aqtbVar2 = this.r;
        if ((aqtbVar2.b & 4) != 0) {
            alayVar2 = aqtbVar2.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView2, vxl.a(null, alayVar2, this.l, false));
        aqtb aqtbVar3 = this.r;
        if ((aqtbVar3.b & 8) != 0) {
            alayVar3 = aqtbVar3.f;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        tuk.u(textView3, vxl.a(null, alayVar3, this.l, false));
        adhv adhvVar = this.k;
        aqmh aqmhVar = this.r.c;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        adhvVar.h(imageView, aqmhVar);
        this.n.a(this);
        return viewInflate;
    }

    @Override // defpackage.acwm
    public final void a() {
    }

    @Override // defpackage.acwm
    public final void c(boolean z) {
    }
}
