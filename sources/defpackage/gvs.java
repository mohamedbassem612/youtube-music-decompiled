package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gvs extends svc implements sul {
    private final cf g;

    public gvs(cf cfVar, sum sumVar, ttm ttmVar, vxe vxeVar, vwt vwtVar, wvi wviVar, wjr wjrVar) {
        super(sumVar, ttmVar, vxeVar, vwtVar, wviVar, wjrVar);
        this.g = cfVar;
        sumVar.k = this;
    }

    @Override // defpackage.svc, defpackage.vxc
    public final boolean b() {
        return false;
    }

    @Override // defpackage.sul
    public final void d() {
        this.b.c(R.string.payment_purchase_cancelled);
    }

    @Override // defpackage.sul
    public final void e(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ttm ttmVar = this.b;
        if (zIsEmpty) {
            ttmVar.d(this.g.getString(R.string.music_error_generic));
        } else {
            ttmVar.d(charSequence.toString());
        }
    }

    @Override // defpackage.sul
    public final void f(amax amaxVar) {
        if (amaxVar.f.size() > 0) {
            this.c.b(amaxVar.f);
        }
        this.f.V(amaxVar);
        vxe vxeVar = this.c;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajth.b;
        aihf aihfVarCreateBuilder = ajth.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajth ajthVar = (ajth) aihfVarCreateBuilder.instance;
        ajthVar.d = 2;
        ajthVar.e = Boolean.TRUE;
        aihhVar.e(aihlVar, (ajth) aihfVarCreateBuilder.build());
        vxeVar.a((ajwo) aihhVar.build());
        if (TextUtils.isEmpty(nsg.f(amaxVar))) {
            return;
        }
        this.b.d(nsg.f(amaxVar).toString());
    }
}
