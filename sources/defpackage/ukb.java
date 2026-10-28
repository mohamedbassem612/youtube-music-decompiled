package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukb extends wlu {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;
    private final Optional e;

    public ukb(abxv abxvVar, zwa zwaVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        super("video_effects/get_dynamic_creation_asset", abxvVar, zwaVar, 3, true, null, null);
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
    }

    @Override // defpackage.wlu
    public final /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alpr.a.createBuilder();
        this.a.isPresent();
        this.b.isPresent();
        this.e.isPresent();
        aihfVarCreateBuilder.getClass();
        uhe uheVar = new uhe(aihfVarCreateBuilder, 2);
        Optional optional = this.c;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) uheVar.a;
            aihfVar.copyOnWrite();
            alpr alprVar = (alpr) aihfVar.instance;
            alprVar.d = (akoy) obj;
            alprVar.b |= 8;
        }
        Optional optional2 = this.d;
        uhe uheVar2 = new uhe(aihfVarCreateBuilder, 3);
        if (true == optional2.isPresent()) {
            Object obj2 = optional2.get();
            aihf aihfVar2 = (aihf) uheVar2.a;
            aihfVar2.copyOnWrite();
            alpr alprVar2 = (alpr) aihfVar2.instance;
            alprVar2.b |= 32;
            alprVar2.e = (String) obj2;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
