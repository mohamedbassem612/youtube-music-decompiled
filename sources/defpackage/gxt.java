package defpackage;

import android.content.DialogInterface;
import androidx.preference.TwoStatePreference;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gxt implements DialogInterface.OnCancelListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gxt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, svj] */
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$cid) {
            case 0:
                ((gxx) this.a).c.c(new haz(false, "DeepLink event canceled by user."));
                break;
            case 1:
                ((gti) this.a).d.c(new haz(false, "DeepLink event canceled by user."));
                break;
            case 2:
                hrd hrdVar = (hrd) this.a;
                ajnf ajnfVar = hrdVar.w;
                if (ajnfVar != null && (ajnfVar.b & SemanticState.Modal) != 0) {
                    vxe vxeVar = hrdVar.j;
                    ajwo ajwoVar = ajnfVar.q;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                    break;
                }
                break;
            case 3:
                hre hreVar = (hre) this.a;
                ajnf ajnfVar2 = hreVar.w;
                if (ajnfVar2 != null && (ajnfVar2.b & SemanticState.Modal) != 0) {
                    vxe vxeVar2 = hreVar.j;
                    ajwo ajwoVar2 = ajnfVar2.q;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    vxeVar2.a(ajwoVar2);
                    break;
                }
                break;
            case 4:
                ((iix) this.a).c.c(new haz(false, "DeepLink event canceled by user."));
                break;
            case 5:
                ((ijg) this.a).b.c(new haz(false, "DeepLink event canceled by user."));
                break;
            case 6:
                ((TwoStatePreference) this.a).k(true);
                break;
            case 7:
                ((TwoStatePreference) this.a).k(true);
                break;
            case 8:
                ((jge) this.a).b.setChecked(true);
                break;
            case 9:
                sui suiVar = (sui) this.a;
                if (suiVar.j.j.size() > 0) {
                    suiVar.a.d(suiVar.j.j, null);
                }
                break;
            case 10:
                this.a.a();
                break;
            case 11:
                ((vea) this.a).f();
                break;
            case 12:
                ((vea) this.a).f();
                break;
            case 13:
                aatv aatvVar = (aatv) this.a;
                aatvVar.d(aatvVar.w);
                break;
            case 14:
                aaue aaueVar = (aaue) this.a;
                aaueVar.k.onClick(aaueVar.i);
                break;
            default:
                ((absa) this.a).b();
                break;
        }
    }
}
