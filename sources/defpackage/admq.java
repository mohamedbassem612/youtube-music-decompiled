package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class admq extends adkt implements admk {
    public final tgr c;
    private final admp d;

    public admq(Map map, Map map2, tgr tgrVar) {
        super(map, map2);
        this.d = new admp();
        this.c = tgrVar;
    }

    @Override // defpackage.admh
    public final void e(View view) {
        aeod.d(view);
        int iA = adul.a(view);
        adma admaVarD = adul.d(view);
        if (iA == -1 || admaVarD == null) {
            return;
        }
        adul.h(admaVarD, this);
        tgr tgrVar = this.c;
        admf admfVar = (admf) admaVarD.a().getTag(R.id.presenter_adapter_viewholder_tag);
        if (admfVar == null) {
            admp admpVar = this.d;
            admpVar.a = admaVarD;
            admf admfVar2 = (admf) admpVar.jV(null, iA);
            admpVar.a = null;
            admaVarD.a().setTag(R.id.presenter_adapter_viewholder_tag, admfVar2);
            admfVar = admfVar2;
        }
        tgrVar.m(admfVar);
    }

    @Override // defpackage.admk
    public final tgr f() {
        return this.c;
    }

    @Override // defpackage.adkt
    protected final adma g(int i) {
        oh ohVarI = this.c.i(i);
        if (ohVarI != null) {
            if (ohVarI instanceof admf) {
                return ((admf) ohVarI).s;
            }
            Object tag = ohVarI.a.getTag(R.id.litho_presenter_tag);
            if (tag instanceof adma) {
                return (adma) tag;
            }
        }
        return null;
    }

    public admq() {
        tgr tgrVar = new tgr((byte[]) null);
        agkj agkjVar = agpn.b;
        this(agkjVar, agkjVar, tgrVar);
    }
}
