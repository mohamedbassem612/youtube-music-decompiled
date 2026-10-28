package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xaz extends xad {
    private final adia k;
    private amrd l;
    private final aduv m;

    public xaz(Context context, xgm xgmVar, vxe vxeVar, aduv aduvVar, adhv adhvVar, vxz vxzVar) {
        super(context, xgmVar, vxeVar, vxzVar);
        this.m = aduvVar;
        this.k = new adia(adhvVar, this.c, false);
    }

    @Override // defpackage.xad, defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.xad, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        this.k.a();
    }

    @Override // defpackage.xad
    protected final /* synthetic */ int d(Object obj) {
        return ((amrd) obj).f;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ int e(Object obj) {
        return ((amrd) obj).h;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ int f(Object obj) {
        amrd amrdVar = (amrd) obj;
        if ((amrdVar.b & 4) == 0) {
            return 0;
        }
        aduv aduvVar = this.m;
        alja aljaVar = amrdVar.e;
        if (aljaVar == null) {
            aljaVar = alja.a;
        }
        aliz alizVarA = aliz.a(aljaVar.c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        return aduvVar.a(alizVarA);
    }

    @Override // defpackage.xad
    protected final /* synthetic */ int g(Object obj) {
        return ((amrd) obj).g;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ long h(Object obj) {
        return ((long) ((amrd) obj).j) * 1000;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return ((long) ((amrd) obj).k) * 1000;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ Spanned j(Object obj) {
        alay alayVar;
        amrd amrdVar = (amrd) obj;
        if ((amrdVar.b & 2) != 0) {
            alayVar = amrdVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    @Override // defpackage.xad
    protected final /* synthetic */ xgz k() {
        amrd amrdVar = this.l;
        if (amrdVar != null) {
            return new xgj(amrdVar.n, (amud) null);
        }
        return null;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ ajwo l(Object obj) {
        ajwo ajwoVar = ((amrd) obj).l;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ String m(Object obj) {
        alay alayVar = ((amrd) obj).d;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        alaz alazVar = alayVar.f;
        if (alazVar == null) {
            alazVar = alaz.a;
        }
        aiqd aiqdVar = alazVar.c;
        if (aiqdVar == null) {
            aiqdVar = aiqd.a;
        }
        String str = aiqdVar.c;
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ void n(Object obj) {
        this.l = (amrd) obj;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ void o(Object obj) {
        aqmh aqmhVar = this.l.i;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        this.k.f(aqmhVar, null);
    }
}
