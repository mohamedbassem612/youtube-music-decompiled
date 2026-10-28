package defpackage;

import com.google.protos.youtube.api.innertube.AssetDetail;
import j$.util.Comparator$CC;
import j$.util.StringJoiner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wqd extends wlu {
    public int a;
    private final List b;
    private boolean c;

    public wqd(abxv abxvVar, zwa zwaVar) {
        super("asset/get_asset", abxvVar, zwaVar, 3, true, null, null);
        this.b = new ArrayList();
        this.a = 1;
        this.c = false;
    }

    public final void F() {
        this.c = true;
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVarE = E();
        Comparator comparatorComparing = Comparator$CC.comparing(new vmw(14), String.CASE_INSENSITIVE_ORDER);
        List list = this.b;
        Collections.sort(list, comparatorComparing);
        StringJoiner stringJoiner = new StringJoiner(",");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringJoiner.add(((AssetDetail) it.next()).c);
        }
        dovVarE.F("assetIds", stringJoiner.toString());
        return dovVarE.D();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alpo.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alpo alpoVar = (alpo) aihfVarCreateBuilder.instance;
        aiie aiieVar = alpoVar.d;
        if (!aiieVar.c()) {
            alpoVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.b, alpoVar.d);
        int i = this.a;
        if (i != 0 && i != 1) {
            aihfVarCreateBuilder.copyOnWrite();
            alpo alpoVar2 = (alpo) aihfVarCreateBuilder.instance;
            alpoVar2.e = i - 1;
            alpoVar2.b |= 2;
        }
        if (this.c) {
            aihfVarCreateBuilder.copyOnWrite();
            alpo alpoVar3 = (alpo) aihfVarCreateBuilder.instance;
            alpoVar3.b |= 4;
            alpoVar3.f = true;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(this.a != 0);
        ahno.O(this.a != 1);
    }

    public final void e(AssetDetail assetDetail) {
        this.b.add(assetDetail);
    }
}
