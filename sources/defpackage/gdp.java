package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gdp implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public gdp(hhj hhjVar, Activity activity, int i) {
        this.$cid = i;
        this.a = activity;
        this.b = hhjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r6v31, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v35, types: [android.view.MenuItem, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rpq rpqVar;
        wnq wnqVar;
        rpr rprVar;
        wnr wnrVar;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                if (obj != null && (rpqVar = (rpq) ((WeakReference) obj).get()) != null && (wnqVar = ((rpg) this.a).b) != null) {
                    rpqVar.i(wnqVar);
                    break;
                }
                break;
            case 1:
                Object obj2 = this.b;
                if (obj2 != null && (rprVar = (rpr) ((WeakReference) obj2).get()) != null && (wnrVar = ((rpe) this.a).b) != null) {
                    rprVar.j(wnrVar);
                    break;
                }
                break;
            case 2:
                vxe vxeVar = ((hdj) this.a).D;
                ajwo ajwoVar = ((alba) this.b).l;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
                break;
            case 3:
                ((hdj) this.a).z((aldp) ((Optional) this.b).get());
                break;
            case 4:
                new Intent().putExtra("get_consent_status", "consent_dialog_cancelled");
                ((hhj) this.b).b.dismiss();
                Activity activity = (Activity) this.a;
                activity.setResult(0);
                activity.finish();
                break;
            case 5:
                Object obj3 = this.a;
                hmn hmnVar = (hmn) obj3;
                hpy hpyVar = hmnVar.b;
                Object obj4 = this.b;
                taf.k(hmnVar.a, hpb.k(hpyVar, (String) obj4, false), new gnx(14), new hcq(obj3, obj4, 4));
                break;
            case 6:
                ((hmn) this.a).a((String) this.b);
                break;
            case 7:
                Object obj5 = this.b;
                if (obj5 != null) {
                    ((gmj) this.a).d.a((ajwo) obj5);
                }
                break;
            case 8:
                ((hyc) this.b).p(((SwitchCompat) this.a).isChecked());
                break;
            case 9:
                SwitchCompat switchCompat = (SwitchCompat) this.a;
                switchCompat.setChecked(!switchCompat.isChecked());
                ((hyc) this.b).p(switchCompat.isChecked());
                break;
            case 10:
                ((ijl) this.b).onOptionsItemSelected(this.a);
                break;
            case 11:
                Context context = ((iox) this.b).b;
                Toast.makeText(context, R.string.battery_restriction_toast, 0).show();
                context.startActivity((Intent) this.a);
                break;
            case 12:
                ((ivj) this.b).onOptionsItemSelected(this.a);
                break;
            case 13:
                ivw ivwVar = (ivw) this.a;
                qcb qcbVar = ivwVar.f;
                if (qcbVar != null) {
                    qcbVar.p(ivwVar.d);
                }
                ((ivy) this.b).b();
                break;
            case 14:
                for (Map.Entry entry : ((ivy) this.b).g.entrySet()) {
                    CheckBox checkBox = (CheckBox) entry.getValue();
                    if (!view.equals(checkBox) && (((auzk) this.a).a || ((auzk) entry.getKey()).a)) {
                        checkBox.setChecked(false);
                    }
                }
                break;
            case 15:
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.onClick(view);
                }
                ((iyk) this.b).c();
                break;
            case 16:
                ajwo ajwoVar2 = ((jbx) this.a).a;
                if (ajwoVar2 != null) {
                    this.b.c(ajwoVar2, null);
                }
                break;
            case 17:
                Object obj6 = this.b;
                ajnf ajnfVar = (ajnf) obj6;
                int i = ajnfVar.b;
                int i2 = i & SemanticState.Modal;
                Object obj7 = this.a;
                if (i2 != 0) {
                    boolean z = !((i & SemanticState.Obscured) != 0);
                    vxe vxeVar2 = ((jcn) obj7).a;
                    ajwo ajwoVar3 = ajnfVar.q;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    vxeVar2.c(ajwoVar3, xhd.h(obj6, z));
                }
                if ((ajnfVar.b & SemanticState.Multiline) != 0) {
                    vxe vxeVar3 = ((jcn) obj7).a;
                    ajwo ajwoVar4 = ajnfVar.s;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    vxeVar3.c(ajwoVar4, xhd.h(obj6, true));
                }
                break;
            case 18:
                alay alayVar = ((anlj) this.b).o;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                ajwo ajwoVar5 = ((alba) alayVar.c.get(0)).l;
                if (ajwoVar5 == null) {
                    ajwoVar5 = ajwo.a;
                }
                ((jcu) this.a).a.a(ajwoVar5);
                break;
            case 19:
                ajwo ajwoVar6 = ((anyi) ((Optional) this.b).get()).g;
                if (ajwoVar6 == null) {
                    ajwoVar6 = ajwo.a;
                }
                ((jcv) this.a).a.a(ajwoVar6);
                break;
            default:
                ajwo ajwoVar7 = ((anpv) this.b).h;
                if (ajwoVar7 == null) {
                    ajwoVar7 = ajwo.a;
                }
                ((jdv) this.a).a.a(ajwoVar7);
                break;
        }
    }

    public /* synthetic */ gdp(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ gdp(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
