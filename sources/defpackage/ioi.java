package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import androidx.preference.PreferenceGroup;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ioi implements dko {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public ioi(dlb dlbVar, PreferenceGroup preferenceGroup, int i) {
        this.$cid = i;
        this.b = dlbVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.dko
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            aprd aprdVar = (aprd) this.b;
            int i2 = aprdVar.b & SemanticState.Hidden;
            Object obj = this.a;
            if (i2 != 0) {
                vxe vxeVar = ((aekf) obj).e;
                ajwo ajwoVar = aprdVar.f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, null);
            }
            if ((aprdVar.b & SemanticState.LiveRegion) != 0) {
                vxe vxeVar2 = ((aekf) obj).e;
                ajwo ajwoVar2 = aprdVar.g;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar2.c(ajwoVar2, null);
                return;
            }
            return;
        }
        if (i == 1) {
            ((PreferenceGroup) this.a).ad(Alert.DURATION_SHOW_INDEFINITELY);
            ((dlb) this.b).D();
            return;
        }
        Object obj2 = this.b;
        if (i != 2) {
            ((ipz) this.a).b.a((ajwo) obj2);
            return;
        }
        apqr apqrVar = (apqr) obj2;
        apqx apqxVar = apqrVar.f;
        if (apqxVar == null) {
            apqxVar = apqx.a;
        }
        Object obj3 = this.a;
        if (apqxVar.b == 64099105) {
            aekf aekfVar = (aekf) obj3;
            Context context = aekfVar.d;
            apqx apqxVar2 = apqrVar.f;
            if (apqxVar2 == null) {
                apqxVar2 = apqx.a;
            }
            acwl.i(context, apqxVar2.b == 64099105 ? (akdd) apqxVar2.c : akdd.a, aekfVar.e, aekfVar.f, null, true, true, null, null, null, null, null, false);
            return;
        }
        if ((apqrVar.b & SemanticState.LiveRegion) != 0) {
            vxe vxeVar3 = ((aekf) obj3).e;
            ajwo ajwoVar3 = apqrVar.e;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            vxeVar3.c(ajwoVar3, null);
        }
    }

    public /* synthetic */ ioi(Object obj, aihn aihnVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aihnVar;
    }
}
