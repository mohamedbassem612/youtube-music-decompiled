package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class adzx implements View.OnClickListener {
    private static final ttb f = new ttb();
    public final View a;
    protected ajnf b;
    public adzw c;
    public adzv d;
    public final ci e;
    private final vxe g;
    private final boolean h;
    private Map i;

    public adzx(vxe vxeVar, ci ciVar, View view, vxz vxzVar) {
        this.g = vxeVar;
        this.e = ciVar;
        view.getClass();
        this.a = view;
        boolean z = false;
        if (vxzVar != null && vxzVar.l(6, 45364140L, false)) {
            z = true;
        }
        this.h = z;
        view.setOnClickListener(this);
        bac.p(view, f);
    }

    private final agkj b() {
        adzv adzvVar = this.d;
        Map mapA = adzvVar != null ? adzvVar.a() : null;
        return mapA == null ? agpn.b : agkj.h(mapA);
    }

    private final Map c(agkj agkjVar, boolean z) {
        Map mapH = xhd.h(this.b, z);
        Map map = this.i;
        if (map != null) {
            mapH.putAll(map);
        }
        mapH.putAll(agkjVar);
        if (this.h) {
            mapH.put("anchor_view", this.a);
        }
        return mapH;
    }

    public void a(ajnf ajnfVar, xgn xgnVar, Map map) {
        String str;
        this.i = map != null ? agkj.h(map) : null;
        this.b = ajnfVar;
        View view = this.a;
        if (ajnfVar == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        int i = 1;
        view.setEnabled(!this.b.l);
        view.setClickable(!this.b.l);
        ajnf ajnfVar2 = this.b;
        if ((ajnfVar2.b & 131072) != 0) {
            aiqd aiqdVar = ajnfVar2.u;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            str = aiqdVar.c;
        } else {
            str = null;
        }
        if (str != null) {
            view.setContentDescription(str);
        }
        if (xgnVar != null) {
            ajnf ajnfVar3 = this.b;
            if ((ajnfVar3.b & 2097152) != 0) {
                xgnVar.w(new xgj(ajnfVar3.y, (amud) null), null);
            }
        }
        if (ajnfVar.t.size() != 0) {
            this.g.d(ajnfVar.t, c(b(), false));
        }
        ci ciVar = this.e;
        if (ciVar != null) {
            if (view.isShown()) {
                int i2 = bac.a;
                if (view.isAttachedToWindow()) {
                    ciVar.af(ajnfVar, view);
                    return;
                }
            }
            view.post(new aead(this, ajnfVar, i));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajnf ajnfVar = this.b;
        if (ajnfVar == null || ajnfVar.l) {
            return;
        }
        if (this.c != null) {
            aihh aihhVar = (aihh) ajnfVar.toBuilder();
            this.c.iP(aihhVar);
            this.b = (ajnf) aihhVar.build();
        }
        ajnf ajnfVar2 = this.b;
        int i = ajnfVar2.b;
        if ((i & SemanticState.Modal) == 0 && (i & SemanticState.Obscured) == 0 && (i & SemanticState.Multiline) == 0) {
            return;
        }
        agkj agkjVarB = b();
        int i2 = ajnfVar2.b;
        if ((i2 & SemanticState.Modal) != 0) {
            boolean z = !((i2 & SemanticState.Obscured) != 0);
            vxe vxeVar = this.g;
            ajwo ajwoVar = ajnfVar2.q;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.c(ajwoVar, c(agkjVarB, z));
        }
        if ((ajnfVar2.b & SemanticState.Obscured) != 0) {
            vxe vxeVar2 = this.g;
            ajwo ajwoVar2 = ajnfVar2.r;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar2.c(ajwoVar2, c(agkjVarB, false));
        }
        if ((ajnfVar2.b & SemanticState.Multiline) != 0) {
            vxe vxeVar3 = this.g;
            ajwo ajwoVar3 = ajnfVar2.s;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            vxeVar3.c(ajwoVar3, c(agkjVarB, false));
        }
    }
}
