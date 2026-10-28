package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wui extends wlu {
    public int a;
    public boolean b;
    public int c;

    public wui(abxv abxvVar, zwa zwaVar, boolean z) {
        super("video_effects/get_multi_page_sticker_catalog", abxvVar, zwaVar, 3, z, null, null);
        this.a = -1;
        this.c = 1;
    }

    @Override // defpackage.wkf
    public final String Y() {
        String str;
        dov dovVarE = E();
        dovVarE.G("getDefaultPage", this.b);
        dovVarE.E("page", this.a);
        int i = this.c;
        if (i == 1) {
            str = "VIDEO_EFFECTS_REQUEST_CLIENT_TYPE_UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "VIDEO_EFFECTS_REQUEST_CLIENT_TYPE_FANOUTS_IMAGE";
        } else {
            str = "VIDEO_EFFECTS_REQUEST_CLIENT_TYPE_STORIES";
        }
        if (i == 0) {
            throw null;
        }
        dovVarE.F("clientType", str);
        return dovVarE.D();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alpv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alpv alpvVar = (alpv) aihfVarCreateBuilder.instance;
        alpvVar.b |= 4;
        alpvVar.e = "";
        int i = this.a;
        if (i >= 0) {
            aihfVarCreateBuilder.copyOnWrite();
            alpv alpvVar2 = (alpv) aihfVarCreateBuilder.instance;
            alpvVar2.b |= 2;
            alpvVar2.d = i;
        }
        int i2 = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        alpv alpvVar3 = (alpv) aihfVarCreateBuilder.instance;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        alpvVar3.g = i3;
        alpvVar3.b |= 16;
        boolean z = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alpv alpvVar4 = (alpv) aihfVarCreateBuilder.instance;
        alpvVar4.b |= 8;
        alpvVar4.f = z;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
