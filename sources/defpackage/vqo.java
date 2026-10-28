package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vqo implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vqo(aktz aktzVar, vor vorVar, int i) {
        this.$cid = i;
        this.a = aktzVar;
        this.b = vorVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [aunn, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.$cid == 0) {
            Object obj = this.a;
            Object obj2 = this.b;
            if (obj == aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP) {
                ((vor) obj2).t();
                return;
            } else {
                if (obj == aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP_STACK) {
                    ((vor) obj2).M(false);
                    return;
                }
                return;
            }
        }
        abgh abghVar = ((joz) this.b).ar.a;
        ?? r2 = this.a;
        if (abghVar == abgh.f) {
            ((abvk) r2.io()).C();
        } else if (abghVar == abgh.b) {
            ((abvk) r2.io()).ap(false, 19);
        } else if (abghVar == abgh.c) {
            ((abvk) r2.io()).A();
        }
    }

    public /* synthetic */ vqo(joz jozVar, aunn aunnVar, int i) {
        this.$cid = i;
        this.b = jozVar;
        this.a = aunnVar;
    }
}
