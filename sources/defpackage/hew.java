package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hew extends wlu {
    public int a;
    private zne b;
    private String c;
    private String d;

    public hew(abxv abxvVar, zwa zwaVar) {
        super("ytm_media_browser/search_media_items", abxvVar, zwaVar, 1, false, null, null);
        this.b = zmz.a;
        this.c = "";
        this.d = "";
        this.a = 1;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = anaa.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amzm.a.createBuilder();
        String str = this.b.b;
        aihfVarCreateBuilder2.copyOnWrite();
        amzm amzmVar = (amzm) aihfVarCreateBuilder2.instance;
        amzmVar.b |= 1;
        amzmVar.c = str;
        String str2 = this.c;
        aihfVarCreateBuilder2.copyOnWrite();
        amzm amzmVar2 = (amzm) aihfVarCreateBuilder2.instance;
        str2.getClass();
        amzmVar2.b |= 2;
        amzmVar2.d = str2;
        aihfVarCreateBuilder.copyOnWrite();
        anaa anaaVar = (anaa) aihfVarCreateBuilder.instance;
        amzm amzmVar3 = (amzm) aihfVarCreateBuilder2.build();
        amzmVar3.getClass();
        anaaVar.e = amzmVar3;
        anaaVar.b |= 4;
        String str3 = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        anaa anaaVar2 = (anaa) aihfVarCreateBuilder.instance;
        str3.getClass();
        anaaVar2.b |= 2;
        anaaVar2.d = str3;
        int i = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        anaa anaaVar3 = (anaa) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        anaaVar3.f = i2;
        anaaVar3.b |= 8;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        if (this.b.h() || TextUtils.isEmpty(this.c)) {
            throw new IllegalArgumentException("Client name and version cannot be unset.");
        }
        ahno.F(!TextUtils.isEmpty(this.d));
    }

    public final void d(zne zneVar, String str) {
        this.b = zneVar;
        this.c = str;
    }

    public final void e(String str) {
        ahno.F(!TextUtils.isEmpty(str));
        this.d = str;
    }
}
