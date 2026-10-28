package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hev extends wlu {
    public ArrayList a;
    public final Map b;
    private zne c;
    private String d;

    public hev(abxv abxvVar, zwa zwaVar) {
        super("ytm_media_browser/get_root_media_items", abxvVar, zwaVar, 1, true, null, null);
        this.c = zmz.a;
        this.d = "";
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVarE = E();
        dovVarE.F("clientName", this.c.b);
        dovVarE.F("clientVersion", this.d);
        dovVarE.F("bundleMap", Integer.toString(this.b.hashCode()));
        return dovVarE.D();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = amzm.a.createBuilder();
        String str = this.c.b;
        aihfVarCreateBuilder.copyOnWrite();
        amzm amzmVar = (amzm) aihfVarCreateBuilder.instance;
        amzmVar.b |= 1;
        amzmVar.c = str;
        String str2 = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        amzm amzmVar2 = (amzm) aihfVarCreateBuilder.instance;
        str2.getClass();
        amzmVar2.b |= 2;
        amzmVar2.d = str2;
        if (!this.a.isEmpty()) {
            ArrayList arrayList = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            amzm amzmVar3 = (amzm) aihfVarCreateBuilder.instance;
            aiie aiieVar = amzmVar3.f;
            if (!aiieVar.c()) {
                amzmVar3.f = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(arrayList, amzmVar3.f);
        }
        Map map = this.b;
        if (!map.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            amzm amzmVar4 = (amzm) aihfVarCreateBuilder.instance;
            aiip aiipVar = amzmVar4.e;
            if (!aiipVar.b) {
                amzmVar4.e = aiipVar.a();
            }
            amzmVar4.e.putAll(map);
        }
        aihf aihfVarCreateBuilder2 = amzt.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amzt amztVar = (amzt) aihfVarCreateBuilder2.instance;
        amzm amzmVar5 = (amzm) aihfVarCreateBuilder.build();
        amzmVar5.getClass();
        amztVar.d = amzmVar5;
        amztVar.b |= 4;
        return aihfVarCreateBuilder2;
    }

    @Override // defpackage.wkf
    protected final void b() {
        zne zneVar = this.c;
        boolean z = false;
        if (zneVar != null && !zneVar.h()) {
            z = true;
        }
        ahno.F(z);
        ahno.F(!TextUtils.isEmpty(this.d));
    }

    public final void d(zne zneVar, String str) {
        boolean z = false;
        if (zneVar != null && !zneVar.h()) {
            z = true;
        }
        ahno.F(z);
        ahno.F(!TextUtils.isEmpty(str));
        this.c = zneVar;
        this.d = str;
    }
}
