package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hbp implements View.OnLayoutChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public hbp(View view, int i) {
        this.$cid = i;
        this.a = view;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [avls, java.lang.Object] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        int i9 = this.$cid;
        if (i9 == 0) {
            int iAbs = Math.abs(i2 - i4);
            if (Math.abs(i6 - i8) != iAbs) {
                hbq hbqVar = (hbq) this.a;
                amvd amvdVar = hbqVar.d;
                if (amvdVar == null || iAbs != amvdVar.c) {
                    aihf aihfVar = hbqVar.g;
                    float fM = twm.m(hbqVar.a, iAbs);
                    aihfVar.copyOnWrite();
                    amvd amvdVar2 = (amvd) aihfVar.instance;
                    amvd amvdVar3 = amvd.a;
                    amvdVar2.b |= 1;
                    amvdVar2.c = fM;
                    amvd amvdVar4 = (amvd) aihfVar.build();
                    hbqVar.d = amvdVar4;
                    hcb hcbVar = hbqVar.f;
                    hcbVar.e(((hed) hbqVar.b.io()).L("/youtube/music/engagement_panel", amvdVar4.toByteArray()).I(hcbVar.c()));
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == 1) {
            if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                return;
            }
            ((get) this.a).o();
            return;
        }
        if (i9 == 2) {
            int measuredHeight = view.getMeasuredHeight();
            WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a;
            if (measuredHeight != watchWhileLayout.bJ) {
                watchWhileLayout.bJ = measuredHeight;
                watchWhileLayout.G();
                return;
            }
            return;
        }
        if (i9 == 3) {
            ?? r2 = this.a;
            if (r2.f()) {
                return;
            }
            r2.c(new Rect(i, i2, i3, i4));
            return;
        }
        if (i9 != 4) {
            if (i9 != 5) {
                ((View) this.a).getVisibility();
                return;
            }
            int i10 = i4 - i2;
            if (i10 != i8 - i6) {
                ((aeoh) this.a).P.f(i10);
                return;
            }
            return;
        }
        aebp aebpVar = (aebp) this.a;
        aebpVar.g((RecyclerView) view);
        fsy fsyVar = aebpVar.b;
        int i11 = fsyVar.D;
        int i12 = fsyVar.E;
        if (!fsyVar.p || fsyVar.C == null || i11 == -1 || i12 == -1) {
            return;
        }
        while (i11 < i12 + 1) {
            List list = fsyVar.b;
            if (i11 >= list.size()) {
                return;
            }
            ComponentTree componentTreeC = ((fqh) list.get(i11)).c();
            if (componentTreeC != null) {
                componentTreeC.p();
            }
            i11++;
        }
    }

    public /* synthetic */ hbp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
