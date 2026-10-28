package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aena implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aena(afvq afvqVar, View.OnClickListener onClickListener, int i) {
        this.$cid = i;
        this.c = afvqVar;
        this.a = "Account selected";
        this.b = onClickListener;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r4v5, types: [aemu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [agek, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$cid;
        if (i == 0) {
            ajwo ajwoVar = ((aenb) this.a).a;
            if (ajwoVar != null) {
                this.b.c(ajwoVar, null);
            }
            ((aemn) ((aekv) this.c).b).dismiss();
            return;
        }
        if (i == 1) {
            aemv aemvVar = (aemv) this.a;
            ajwo ajwoVar2 = aemvVar.c;
            if (ajwoVar2 != null) {
                this.b.c(ajwoVar2, null);
            }
            this.c.e(aemvVar.d);
            return;
        }
        if (i == 2) {
            ?? r0 = this.b;
            afun afunVarD = ((afvq) this.c).d((String) this.a, 49);
            try {
                r0.onClick(view);
                JniZero.l(afunVarD, null);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    JniZero.l(afunVarD, th);
                    throw th2;
                }
            }
        }
        boolean zE = afxw.E(view.getContext());
        ?? r1 = this.b;
        if (zE) {
            Object obj = this.c;
            String simpleName = (String) view.getTag(R.id.tiktok_event_internal_trace);
            if (simpleName == null) {
                simpleName = view.getClass().getSimpleName();
            }
            afun afunVarB = ((afxk) obj).a.b(207, "Clicked ".concat(String.valueOf(simpleName)), (afuy) this.a.apply(view));
            try {
                r1.onClick(view);
                afunVarB.close();
            } catch (Throwable th3) {
                try {
                    afunVarB.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public /* synthetic */ aena(aenb aenbVar, vxe vxeVar, aekv aekvVar, int i) {
        this.$cid = i;
        this.a = aenbVar;
        this.b = vxeVar;
        this.c = aekvVar;
    }

    public aena(aemv aemvVar, vxe vxeVar, aemu aemuVar, int i) {
        this.$cid = i;
        this.b = vxeVar;
        this.c = aemuVar;
        this.a = aemvVar;
    }

    public /* synthetic */ aena(afxk afxkVar, agek agekVar, View.OnClickListener onClickListener, int i) {
        this.$cid = i;
        this.c = afxkVar;
        this.a = agekVar;
        this.b = onClickListener;
    }
}
