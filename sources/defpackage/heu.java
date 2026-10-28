package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class heu extends wlu {
    private zne a;
    private String b;
    private String c;

    public heu(abxv abxvVar, zwa zwaVar) {
        super("ytm_media_browser/get_media_item_children", abxvVar, zwaVar, 1, false, null, null);
        this.a = zmz.a;
        this.b = "";
        this.c = "";
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = amzr.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amzm.a.createBuilder();
        String str = this.a.b;
        aihfVarCreateBuilder2.copyOnWrite();
        amzm amzmVar = (amzm) aihfVarCreateBuilder2.instance;
        amzmVar.b |= 1;
        amzmVar.c = str;
        String str2 = this.b;
        aihfVarCreateBuilder2.copyOnWrite();
        amzm amzmVar2 = (amzm) aihfVarCreateBuilder2.instance;
        str2.getClass();
        amzmVar2.b |= 2;
        amzmVar2.d = str2;
        aihfVarCreateBuilder.copyOnWrite();
        amzr amzrVar = (amzr) aihfVarCreateBuilder.instance;
        amzm amzmVar3 = (amzm) aihfVarCreateBuilder2.build();
        amzmVar3.getClass();
        amzrVar.e = amzmVar3;
        amzrVar.b |= 4;
        String str3 = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        amzr amzrVar2 = (amzr) aihfVarCreateBuilder.instance;
        str3.getClass();
        amzrVar2.b |= 2;
        amzrVar2.d = str3;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        zne zneVar = this.a;
        boolean z = false;
        if (zneVar != null && !zneVar.h()) {
            z = true;
        }
        ahno.F(z);
        ahno.F(!TextUtils.isEmpty(this.b));
        ahno.F(!TextUtils.isEmpty(this.c));
    }

    public final void c(zne zneVar, String str) {
        boolean z = false;
        if (zneVar != null && !zneVar.h()) {
            z = true;
        }
        ahno.F(z);
        ahno.F(!TextUtils.isEmpty(str));
        this.a = zneVar;
        this.b = str;
    }

    public final void d(String str) {
        ahno.F(!TextUtils.isEmpty(str));
        this.c = str;
    }
}
