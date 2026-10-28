package defpackage;

import android.util.LruCache;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class abpc extends zyz {
    private final abri a;
    private final String b;
    private final xir c;
    public abok d;
    final /* synthetic */ abpd e;

    public abpc(abpd abpdVar, abri abriVar, String str, xir xirVar) {
        this.e = abpdVar;
        this.a = abriVar;
        str.getClass();
        this.b = str;
        this.c = xirVar;
        this.d = null;
    }

    @Override // defpackage.zyz, defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        LruCache lruCache;
        abmt abmtVar;
        wjf wjfVar = (wjf) obj;
        if (wjfVar != null) {
            wjfVar.J(this.a.h);
        }
        abpd abpdVar = this.e;
        wjf wjfVarA = abpdVar.a(this.b, wjfVar);
        boolean zI = aaje.i(wjfVarA, abpdVar.f);
        boolean z = false;
        if (wjfVarA != null && aaje.q(wjfVarA.t())) {
            z = true;
        }
        if ((abpdVar.q(wjfVarA) || ((abmtVar = abpdVar.i) != null && abmtVar.aJ())) && !zI && z && (lruCache = abpdVar.j) != null && abpd.t(wjfVarA) > 0) {
            abmt abmtVar2 = abpdVar.i;
            if (abmtVar2 != null && abmtVar2.aI()) {
                abpd.n(wjfVarA, this.a);
            }
            lruCache.put(this.a.Y(), new Pair(wjfVarA, Long.valueOf(abpdVar.b(wjfVarA))));
        }
        abpdVar.a.c(new aayc(wjfVarA.N()));
        xir xirVar = this.c;
        if (xirVar != null) {
            xirVar.n("ps_r");
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            boolean zN = wjfVarA.N();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.c |= SemanticState.Focused;
            amiuVar.C = zN;
            xirVar.h((amiu) aihfVarCreateBuilder.build());
        }
        set(wjfVarA);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    @Override // defpackage.ahch, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2;
        abok abokVar;
        boolean zCancel = super.cancel(z);
        abmt abmtVar = this.e.i;
        if (abmtVar == null) {
            z2 = zCancel;
        } else {
            MediaFetchHotConfigOuterClass$MediaFetchHotConfig defaultInstance = abmt.q(abmtVar.a).l;
            if (defaultInstance == null) {
                defaultInstance = MediaFetchHotConfigOuterClass$MediaFetchHotConfig.getDefaultInstance();
            }
            if (defaultInstance.z) {
                z2 = true;
            } else {
                z2 = zCancel;
            }
        }
        if (abmtVar != null && abmtVar.aq() && z2 && (abokVar = this.d) != null) {
            abokVar.a();
        }
        return zCancel;
    }
}
