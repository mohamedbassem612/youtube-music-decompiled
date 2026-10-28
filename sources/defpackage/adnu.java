package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnu implements zza {
    private final Context a;
    private final vxe b;
    private final ttm c;
    private final awmd d;
    private final Object e = this;
    private final abfv f;
    private final abfv g;

    public adnu(Context context, vxe vxeVar, ttm ttmVar, awmd awmdVar, abfv abfvVar, abfv abfvVar2) {
        this.a = context;
        this.b = vxeVar;
        this.c = ttmVar;
        this.d = awmdVar;
        this.g = abfvVar;
        this.f = abfvVar2;
    }

    @Override // defpackage.tnh
    public final void a(Object obj) {
        amkl amklVar;
        akxk akxkVar;
        if (obj instanceof alph) {
            alph alphVar = (alph) obj;
            alpk alpkVar = alphVar.f;
            if (alpkVar == null) {
                alpkVar = alpk.a;
            }
            if (alpkVar.b == 171313147) {
                alpk alpkVar2 = alphVar.f;
                if (alpkVar2 == null) {
                    alpkVar2 = alpk.a;
                }
                amklVar = alpkVar2.b == 171313147 ? (amkl) alpkVar2.c : amkl.a;
            } else {
                amklVar = null;
            }
            if (amklVar != null) {
                ((eqq) this.d.io()).e(amklVar, this.e);
            }
            alpk alpkVar3 = alphVar.f;
            if ((alpkVar3 == null ? alpk.a : alpkVar3).b == 85374086) {
                if (alpkVar3 == null) {
                    alpkVar3 = alpk.a;
                }
                akxkVar = alpkVar3.b == 85374086 ? (akxk) alpkVar3.c : akxk.a;
            } else {
                akxkVar = null;
            }
            if (akxkVar != null) {
                acwp.i(this.a, akxkVar, this.b, this.g, this.e, this.f);
            }
            if (amklVar == null && akxkVar == null && (alphVar.b & 2) != 0) {
                Context context = this.a;
                AlertDialog.Builder cancelable = new AlertDialog.Builder(context).setCancelable(true);
                alay alayVar = alphVar.d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                AlertDialog alertDialogCreate = cancelable.setMessage(vxl.a(context, alayVar, this.b, true)).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.show();
                ((TextView) alertDialogCreate.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (alphVar.g.size() > 0) {
                this.b.d(alphVar.g, null);
            }
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.c.e(toeVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
