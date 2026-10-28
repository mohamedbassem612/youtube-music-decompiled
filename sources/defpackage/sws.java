package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sws extends swa implements adzw, sts {
    public adhv k;
    public vxe l;
    public xgn m;
    public stu n;
    public tbt o;
    public afip p;
    private ImageView q;
    private LinearLayout r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private aqtc w;

    private final void k(TextView textView, ajng ajngVar, boolean z, Map map) {
        aeaa aeaaVarD = this.p.d(textView);
        ajnf ajnfVar = null;
        if (ajngVar != null && (ajngVar.b & 1) != 0 && (ajnfVar = ajngVar.c) == null) {
            ajnfVar = ajnf.a;
        }
        aeaaVarD.a(ajnfVar, this.m, map);
        if (z) {
            aeaaVarD.c = this;
        }
    }

    @Override // defpackage.sts
    public final void d(boolean z) {
        if (z) {
            super.iQ(true, false, false);
            this.o.c(new swi());
        }
    }

    @Override // defpackage.stt
    public final boolean f() {
        return false;
    }

    @Override // defpackage.adzw
    public final void iP(aihh aihhVar) {
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(0, R.style.UnlimitedFamily);
        this.n.b(this);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        alay alayVar4;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        try {
            this.w = (aqtc) aihn.parseFrom(aqtc.a, bundle.getByteArray("UnlimitedFamilyProfileInterstitialRenderer"), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
        }
        if (this.w == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.family_pre_purchase_fragment_view, viewGroup, false);
        this.q = (ImageView) viewInflate.findViewById(R.id.main_thumbnail);
        this.r = (LinearLayout) viewInflate.findViewById(R.id.secondary_thumbnails);
        this.s = (TextView) viewInflate.findViewById(R.id.member_info);
        this.t = (TextView) viewInflate.findViewById(R.id.member_title);
        HashMap map = new HashMap();
        map.put("accountName", "myaccount");
        TextView textView = (TextView) viewInflate.findViewById(R.id.manage_button);
        ajng ajngVar = this.w.g;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        k(textView, ajngVar, false, map);
        this.u = (TextView) viewInflate.findViewById(R.id.additional_info_header);
        this.v = (TextView) viewInflate.findViewById(R.id.additional_info);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.action_button);
        ajng ajngVar2 = this.w.k;
        if (ajngVar2 == null) {
            ajngVar2 = ajng.a;
        }
        k(textView2, ajngVar2, true, null);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.dismiss_button);
        ajng ajngVar3 = this.w.j;
        if (ajngVar3 == null) {
            ajngVar3 = ajng.a;
        }
        k(textView3, ajngVar3, true, null);
        adhv adhvVar = this.k;
        ImageView imageView = this.q;
        aqmh aqmhVar = this.w.c;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        adhvVar.h(imageView, aqmhVar);
        for (aqmh aqmhVar2 : this.w.d) {
            ImageView imageView2 = (ImageView) layoutInflater.inflate(R.layout.family_pre_purchase_fragment_secondary_thumbnail, (ViewGroup) this.r, false);
            this.k.h(imageView2, aqmhVar2);
            this.r.addView(imageView2);
        }
        int childCount = this.r.getChildCount();
        this.r.setVisibility(childCount > 0 ? 0 : 8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(childCount > 0 ? R.dimen.family_profile_main_thumbnail_size_small : R.dimen.family_profile_main_thumbnail_size_big);
        this.q.getLayoutParams().height = dimensionPixelSize;
        this.q.getLayoutParams().width = dimensionPixelSize;
        TextView textView4 = this.s;
        aqtc aqtcVar = this.w;
        if ((aqtcVar.b & 2) != 0) {
            alayVar = aqtcVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView4, ackj.k(null, alayVar, null, false));
        TextView textView5 = this.t;
        aqtc aqtcVar2 = this.w;
        if ((aqtcVar2.b & 4) != 0) {
            alayVar2 = aqtcVar2.f;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView5, ackj.k(null, alayVar2, null, false));
        TextView textView6 = this.u;
        aqtc aqtcVar3 = this.w;
        if ((aqtcVar3.b & 16) != 0) {
            alayVar3 = aqtcVar3.h;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        tuk.u(textView6, ackj.k(null, alayVar3, null, false));
        TextView textView7 = this.v;
        aqtc aqtcVar4 = this.w;
        if ((aqtcVar4.b & 32) != 0) {
            alayVar4 = aqtcVar4.i;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
        } else {
            alayVar4 = null;
        }
        tuk.u(textView7, vxl.a(null, alayVar4, this.l, false));
        return viewInflate;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.n.c(this);
    }
}
