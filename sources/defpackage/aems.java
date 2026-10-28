package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aems implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public aems(aemv aemvVar, vxe vxeVar, int i) {
        this.$cid = i;
        this.a = vxeVar;
        this.b = aemvVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, vxe] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajwo ajwoVar;
        int i = this.$cid;
        if (i == 0) {
            aemv aemvVar = (aemv) this.b;
            ajwo ajwoVar2 = aemvVar.a;
            if (ajwoVar2 != null) {
                this.a.c(ajwoVar2, null);
            }
            ajwo ajwoVar3 = aemvVar.b;
            if (ajwoVar3 != null) {
                this.a.c(ajwoVar3, null);
                return;
            }
            return;
        }
        if (i == 1) {
            Object obj = this.b;
            alhk alhkVar = (alhk) obj;
            int i2 = alhkVar.b & 16;
            Object obj2 = this.a;
            if (i2 != 0) {
                Map mapH = xhd.h(obj, true);
                vxe vxeVar = ((aekn) obj2).b;
                ajwo ajwoVar4 = alhkVar.g;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                vxeVar.c(ajwoVar4, mapH);
            }
            if ((alhkVar.b & 32) != 0) {
                Map mapH2 = xhd.h(obj, false);
                vxe vxeVar2 = ((aekn) obj2).b;
                ajwo ajwoVar5 = alhkVar.h;
                if (ajwoVar5 == null) {
                    ajwoVar5 = ajwo.a;
                }
                vxeVar2.c(ajwoVar5, mapH2);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.a.onClick(view);
                ((afcr) this.b).e(1);
                return;
            }
            HashMap map = new HashMap();
            Object obj3 = this.b;
            map.putAll(((vvr) obj3).c);
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ((agev) ((vvy) obj3).e).f());
            ((Snackbar) this.a).a();
            return;
        }
        if (twb.c(view.getContext())) {
            alay alayVar = ((aqsq) this.b).d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Iterator it = alayVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ajwoVar = null;
                    break;
                }
                alba albaVar = (alba) it.next();
                if ((albaVar.b & SemanticState.Modal) != 0) {
                    ajwoVar = albaVar.l;
                    if (ajwoVar != null) {
                        break;
                    }
                    ajwoVar = ajwo.a;
                    break;
                }
            }
            if (ajwoVar != null) {
                ((aemw) this.a).a.c(ajwoVar, null);
            }
        }
    }

    public /* synthetic */ aems(Object obj, aihn aihnVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aihnVar;
    }

    public /* synthetic */ aems(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
