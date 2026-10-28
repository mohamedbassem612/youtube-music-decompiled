package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkr extends axy implements twn {
    public final wco a;
    public final zwb b;
    public final avmb e;
    public View f;
    public TextView g;
    public avmn h;
    private final Context i;
    private final xgm j;
    private final ajnf k;
    private final Optional l;
    private jbm m;
    private final jij n;

    public hkr(Context context, xgm xgmVar, jij jijVar, wco wcoVar, zwb zwbVar, avmb avmbVar, ajnf ajnfVar, Optional optional) {
        super(context);
        this.i = context;
        this.j = xgmVar;
        this.n = jijVar;
        this.a = wcoVar;
        this.b = zwbVar;
        this.e = avmbVar;
        this.k = ajnfVar;
        this.l = optional;
    }

    @Override // defpackage.axy
    public final View a() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.i).inflate(R.layout.top_bar_menu_item, (ViewGroup) null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewGroup.findViewById(R.id.top_bar_menu_item_image_view);
        this.f = viewGroup.findViewById(R.id.new_content_dot);
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.new_content_count);
        viewStub.getClass();
        View view = (View) TextView.class.cast(viewStub.inflate());
        view.getClass();
        this.g = (TextView) view;
        ajnf ajnfVar = this.k;
        this.m = this.n.a(appCompatImageView, null, null, ajnfVar, false);
        adly adlyVar = new adly();
        adlyVar.a(this.j.hB());
        adlyVar.f("skipInteractionLogging", Boolean.TRUE);
        this.m.hU(adlyVar, ajnfVar);
        hkp hkpVar = new hkp(this, 2);
        Optional optional = this.l;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = hkpVar.a;
            hkr hkrVar = (hkr) obj2;
            hkrVar.h = hkrVar.a.b(hkrVar.b.e()).k((String) obj).O(hkrVar.e).af(new hjd(obj2, 12));
        }
        return viewGroup;
    }

    @Override // defpackage.twn
    public final void i() {
        Object obj = this.h;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        jbm jbmVar = this.m;
        if (jbmVar != null) {
            jbmVar.b(null);
            this.m = null;
        }
        this.f = null;
        this.g = null;
    }
}
