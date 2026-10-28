package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzq extends wzi {
    public wrb a;
    public advb b;
    public wyz c;
    public wzb d;
    public Executor e;
    public ttm f;
    public vxe g;
    public wwn h;
    public xgn i;
    public ViewGroup j;
    public View k;
    public View l;
    public TextView m;
    public byte[] n;
    public ssj o;
    private ImageView p;

    public final void d() {
        amqw amqwVar;
        this.k.setVisibility(0);
        this.j.setVisibility(8);
        this.l.setVisibility(8);
        Bundle arguments = getArguments();
        ajwo ajwoVarB = vxg.b(arguments.getByteArray("navigation_endpoint"));
        this.n = ajwoVarB.c.G();
        wrb wrbVar = this.a;
        wqr wqrVar = new wqr(wrbVar.b, wrbVar.c.e());
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amqf.b);
        ajwoVarB.c(aihlVarCheckIsLite);
        Object objK = ajwoVarB.j.k(aihlVarCheckIsLite.d);
        wqrVar.a = ((amqf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if ((ajwoVarB.b & 1) != 0) {
            wqrVar.n(ajwoVarB.c);
        } else {
            wqrVar.m();
        }
        byte[] byteArray = arguments.getByteArray("ARG_CHAT_MESSAGE");
        if (byteArray != null) {
            try {
                amqwVar = (amqw) aihn.parseFrom(amqw.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused) {
                amqwVar = null;
            }
        } else {
            amqwVar = null;
        }
        if (amqwVar != null) {
            wqrVar.b = amqwVar;
        }
        taf.i(this.a.g.b(wqrVar, MoreExecutors.directExecutor(), null), this.e, new wuy(this, 2), new ixb(this, 13), null);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        View view = getView();
        if (this.c.c) {
            view.setBackgroundColor(0);
        }
        this.j = (ViewGroup) view.findViewById(R.id.purchase_flow_container);
        this.k = view.findViewById(R.id.loading_container);
        this.l = view.findViewById(R.id.error_container);
        this.p = (ImageView) view.findViewById(R.id.error_image);
        this.m = (TextView) view.findViewById(R.id.error_message);
        view.findViewById(R.id.retry).setOnClickListener(new vhv((cc) this, 12));
        Context context = getContext();
        this.p.setImageDrawable(context.getDrawable(this.d.a(0)));
        this.m.setTextColor(context.getColor(this.d.a(1)));
        d();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.b.b(ampg.class);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.live_chat_purchase_flow, viewGroup, false);
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.j.getChildAt(i);
                if (childAt != null) {
                    adma admaVarD = adul.d(childAt);
                    if (admaVarD instanceof xcx) {
                        ((xcx) admaVarD).a();
                    }
                }
            }
        }
    }
}
